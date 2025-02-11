# MTTPP-PROJEKT

!!!! pripaziti na putanju chromedriver-a u slučaju grešaka !!!!!!

### **Automatizirano Testiranje Wikipedije pomoću Selenium WebDrivera**

Ovaj projekt implementira automatizirano testiranje Wikipedia web stranice koristeći Selenium WebDriver i Java u kombinaciji s TestNG testnim okvirom.  
Testovi provjeravaju osnovne funkcionalnosti web stranice, uključujući pretragu, navigaciju i provjeru prisutnosti elemenata.  

------------------------------------------------

## **Tehnologije korištene u projektu**
- **Java** – glavni programski jezik
- **Selenium WebDriver** – za automatizirano web testiranje
- **TestNG** – okvir za upravljanje i organizaciju testova
- **Maven** – alat za upravljanje ovisnostima i pokretanje testova
- **WebDriverManager** – automatsko upravljanje ChromeDriver-om
- **ChromeDriver** – pokretanje testova u Google Chrome pregledniku

------------------------------------------------

## **Postavljanje i pokretanje testova**
### **1. Instalacija potrebnih alata**
- Instalirati **JDK** (Java Development Kit) i postaviti varijable okoline
- Instalirati **Maven**
- Instalirati **Google Chrome** i koristiti **WebDriverManager** za automatsko upravljanje driverima
- Instalirati **TestNG** u IntelliJ IDEA

### **2. Pokretanje testova**
Testovi se mogu pokrenuti pomoću **Maven-a** koristeći naredbu:

mvn test

------------------------------------------------

## **Testovi u projektu**

### 1. Test provjere naslova Wikipedije
- **Naziv testa:** "testWikipediaTitle()"
- **Opis:** Ovaj test provjerava sadrži li naslov stranice riječ "Wikipedia".
- **Koraci testa:**
  1. Otvara početnu stranicu Wikipedije.
  2. Dohvaća naslov stranice.
  3. Provjerava sadrži li naslov očekivanu vrijednost.

------------------------------------------------

### 2. Test pretrage pojma
- **Naziv testa:** "testSearchFunctionality()"
- **Opis:** Test provjerava ispravnost pretrage za "Selenium (software)".
- **Koraci testa:**
  1. Unosi pojam "Selenium (software)" u pretragu.
  2. Pritisne tipku Enter.
  3. Provjerava je li naslov stranice ispravan.

------------------------------------------------

### 3. Test navigacije na Community Portal
- **Naziv testa:** "testCommunityPortalLink()"
- **Opis:** Ovaj test provjerava može li se korisnik navigirati na Community Portal iz glavnog izbornika.
- **Koraci testa:**
  1. Klikne na glavni izbornik.
  2. Klikne na Community Portal link.
  3. Provjerava je li korisnik preusmjeren na odgovarajuću stranicu.

------------------------------------------------

### 4. Test povratka na početnu stranicu
- **Naziv testa:** "testNavigateToMainPage()"
- **Opis:** Ovaj test provjerava može li korisnik navigirati natrag na glavnu stranicu klikom na Wikipedia logo.
- **Koraci testa:**
  1. Klikne na Wikipedia logo.
  2. Provjerava je li korisnik vraćen na glavnu stranicu.

------------------------------------------------

### 5. Test otvaranja slučajnog članka
- **Naziv testa:** "testRandomArticleLink()"
- **Opis:** Test provjerava može li se otvoriti nasumično odabran članak.
- **Koraci testa:**
  1. Klikne na glavni izbornik.
  2. Odabire opciju "Random article".
  3. Provjerava je li otvorena nova stranica.

------------------------------------------------

### 6. Test prikaza povijesti članka
- **Naziv testa:** "testViewHistoryRandArticle()"
- **Opis:** Ovaj test provjerava može li korisnik otvoriti povijest izmjena za trenutni članak.
- **Koraci testa:**
  1. Klikne na opciju "View history".
  2. Provjerava je li otvorena stranica povijesti izmjena.

------------------------------------------------

## **Moguća proširenja i poboljšanja**
Kako bi se testiranje dodatno unaprijedilo, moguće su sljedeće nadogradnje:
- **Cross-browser testing** – Implementacija testiranja na više preglednika (Firefox, Edge).
- **Selenium Grid** – Paralelno pokretanje testova na više uređaja i okruženja.
- **Integracija s CI/CD** – Automatizacija testiranja kroz Jenkins ili GitHub Actions.
- **Dodavanje negativnih testova** – Provjera kako sustav reagira na nepostojeće pojmove ili nevalidne unose.

Ove nadogradnje mogu povećati stabilnost testiranja i omogućiti bolju detekciju potencijalnih problema na web stranici.

