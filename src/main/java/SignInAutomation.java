import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInAutomation {
    private String url;

    public SignInAutomation(String url) {
        this.url = url;
    }

    public String url() {
        System.setProperty("webdriver.chrome.driver", this.url);
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        return driver.getCurrentUrl();

    }

    public String Title() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", this.url);
        WebDriver driver = new ChromeDriver();
        // פתיחת דף אתר אוטומציה
        driver.get("http://automationpractice.com/");
        // הגדלת חלון
        driver.manage().window().maximize();
        // מציאת על כפתור SignIn
        WebElement SignIn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
        // לחיצת כפתור SignIn
        SignIn.click();
        // מציאת שדה Email address
        WebElement EmailAddress = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        // הזנת מייל מתאים
        EmailAddress.sendKeys("tomer9122@gmail.com");
        //מציאת שדה סיסמא
        WebElement Password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        // הזנת סיסמא
        Password.sendKeys("81132411eL!");
        // מציאת תיבת log in
        WebElement login = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
        // לחיצה על תיבת log in
        login.click();
        return driver.getTitle();

    }
}



