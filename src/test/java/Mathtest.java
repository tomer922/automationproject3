import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class Mathtest {

    @Test
public void sumtest(){
        int x = 12;
        int y = 55;
        int realanswer = 67;
        Assert.assertEquals(realanswer ,x+y);
}
@Test
   public void maxtest(){
        Assert.assertEquals(0,Math.max(0,-96857));
}
    @Test
    public void stringtest(){
        String x = "elior" ;
        Assert.assertEquals( "ELIOR" , x.toUpperCase());
    }
}
