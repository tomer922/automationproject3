import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;

public class AutomationPracticeTest {
    // מבחן קבלת url
    @Test
    public void GetUrlTest(){
       SignInAutomation s1 = new SignInAutomation("C:\\Users\\97250\\Desktop\\chromedriver.exe");
      Assert.assertEquals(s1.url(),"http://automationpractice.com/index.php");
    }
    // מבחן קבלת Title
   @Test
    public void GetTitleTest () throws InterruptedException {
        SignInAutomation s2 = new SignInAutomation("C:\\Users\\97250\\Desktop\\chromedriver.exe");
        Assert.assertEquals(s2.Title(),"My account - My Store");

   }

}
