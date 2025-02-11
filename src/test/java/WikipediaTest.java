import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class WikipediaTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private final String testURL = "https://www.wikipedia.org/";

    @BeforeClass
    public void setupTest() {
        WebDriverManager.chromedriver().setup(); // Automatically downloads the correct driver
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10); // Use explicit wait
        driver.manage().window().maximize();
        driver.get(testURL);
    }

    @Test(priority = 1)
    public void testWikipediaTitle() throws InterruptedException {
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Wikipedia"), "Page title is incorrect!");
        Thread.sleep(1500);
    }

    @Test(priority = 2)
    public void testSearchFunctionality() throws InterruptedException {
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchInput")));
        searchBox.sendKeys("Selenium (software)");
        searchBox.sendKeys(Keys.ENTER);

        WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstHeading")));
        Assert.assertEquals(heading.getText(), "Selenium (software)", "Search results are incorrect!");
        Thread.sleep(1500);
    }

    @Test(priority = 3)
    public void testCommunityPortalLink() throws InterruptedException {
        Thread.sleep(2000); // Allow time for elements to load

        WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("[title='Main menu']")
        ));
        menuButton.click();

        WebElement communityPortalLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("[title=\"The hub for editors\"]")
        ));
        communityPortalLink.click();

    }

    @Test(priority = 4)
    public void testNavigateToMainPage() {
        WebElement logo = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("[src=\"/static/images/icons/wikipedia.png\"]")
        ));
        logo.click();
    }

    @Test(priority = 5)
    public void testRandomArticleLink() throws InterruptedException {
        Thread.sleep(2000); // Allow time for elements to load

        WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("[title='Main menu']")
        ));
        menuButton.click();
        Thread.sleep(2000);
        WebElement communityPortalLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("[title=\"Visit a randomly selected article [alt-shift-x]\"]")
        ));
        communityPortalLink.click();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void testViewHistoryRandArticle() throws InterruptedException {
        Thread.sleep(2000);
        WebElement history = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("[title=\"Past revisions of this page [alt-shift-h]\"]")
        ));
        history.click();
        Thread.sleep(2000);
    }
    @AfterClass
    public void teardownTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}
