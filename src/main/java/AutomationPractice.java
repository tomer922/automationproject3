import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97250\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // פתיחת דף אתר אוטומציה
        driver.get("http://automationpractice.com/");
        // הגדלת חלון
        driver.manage().window().maximize();

        // מציאת כפתור sign in
        WebElement SignInButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
        // לחיצה על כפתור sign in
        SignInButton.click();
        // השהייה 2.5 שניות
        Thread.sleep(2500);
        // מציאת תיבת להזנת אימייל
        WebElement EmailBox = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        // הזנת מייל מתאים
        EmailBox.sendKeys("tomer9122@gmail.com");
        //השהייה 1.5 שניות
        Thread.sleep(1500);
        // מציאת כפתור create an account
        WebElement CreateAnAccount = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
        // לחיצה על כפתור  CreateAnAccount
        CreateAnAccount.click();
        //השהייה 5 שניות
        Thread.sleep(5000);
        // מציאת כפתור .Mr
        WebElement Mr = driver.findElement(By.xpath("//*[@id=\"uniform-id_gender1\"]"));
        Mr.click();
        // מציאת כפתור First name
        WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        // הזנת ערכים בשדה First name
        FirstName.sendKeys("Tomer");
        //השהייה 1.5 שניות
        Thread.sleep(1500);
        // מציאת כפתור Last name
        WebElement LastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        // הזנת Last name
        LastName.sendKeys("Agasi");
        //השהייה 1.5 שניות
        Thread.sleep(1500);
        // מציאת תיבת Password
        WebElement Password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        // הזנת סיסמא
        Password.sendKeys("81132411eL!");
        //   מציאת יום בחודש בdroplist
        WebElement Day = driver.findElement(By.xpath("//*[@id=\"days\"]/option[2]"));
        // לחיצה על היום בחודש בdroplist
        Day.click();
        // השהייה 5 שניות
        Thread.sleep(5000);
        // מציאת חודש בdroplist
        WebElement Month = driver.findElement(By.xpath("//*[@id=\"months\"]/option[9] "));
        // לחיצה על חודש בdroplist
        Month.click();
// השהייה 5 שניות
        Thread.sleep(5000);
        // מציאת שנה בdroplist
        WebElement Year = driver.findElement(By.xpath("//*[@id=\"years\"]/option[27]"));
        // בחירת שנה בdroplist
        Year.click();
        // השהייה 5 שניות
        Thread.sleep(5000);
        // מציאת תיבת Company
        WebElement Company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
        // הזנת ערכים בשדה Company
        Company.sendKeys("scoober");
        // השהייה 1.5 שניות
        Thread.sleep(1500);
        // מציאת תיבת Address
        WebElement Address = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
        // הזנת ערכים בשדה Company
      Address.sendKeys("angel");
      // השהייה 1.5 שניות
        Thread.sleep(1500);
        // מציאת תיבת Address2
WebElement Address2 = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
// הזנת ערכים בשדה Address2
Address2.sendKeys("35");
// השהייה 1.5 שניות
        Thread.sleep(1500);
        // מציאת תיבת city
        WebElement City = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        // הזנת ערכים בתיבת city
        City.sendKeys("tel aviv");
        // השהייה 1.5 שניות
        Thread.sleep(1500);
        //מציאת droplist של state
        WebElement State = driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[2]"));
        // לחיצה על מדינה נבחרת בdroplist
        State.click();
        //השהייה 5 שניות
        Thread.sleep(5000);
        //מציאת תיבת מיקוד
        WebElement ZipCode = driver.findElement(By.xpath(" //*[@id=\"postcode\"]"));
        // הזנת ערכים בתיבת מיקוד
        ZipCode.sendKeys("00000");
        // השהייה 1.5 שניות
        Thread.sleep(1500);
        // מציאת תיבת מידע נוסף
        WebElement AdditionalInformation = driver.findElement(By.xpath(" //*[@id=\"other\"]"));
        // הזנת נתונים בתיבת מידע נוסף
        AdditionalInformation.sendKeys("null");
        // השהייה 1.5 שניות
        Thread.sleep(1500);
        // מציאת תיבת טלפון בבית
        WebElement HomePhone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        //הזנת ערכים בתיבת טלפון בבית
        HomePhone.sendKeys("097656582");
        // השהייה 1.5 שניות
        Thread.sleep(1500);
        // מציאת תיבת טלפון אישי
        WebElement Phone = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
        // הזנת ערכים בתיבת טלפון אישי
        Phone.sendKeys("0549140305");
        // השהייה 1.5 שניות
        Thread.sleep(1500);
        // מציאת תיבת כינוי
        WebElement Alias = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
        // הזנת ערכים בתיבת כינוי
        Alias.sendKeys("hodi");
        // השהייה 1.5 שניות
        Thread.sleep(1500);
        // מציאת תיבת register
        WebElement Register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
        //לחיצה על תיבת register
        Register.click();

    }
}