
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class lesson01 {

    public WebDriver driver = new ChromeDriver();

    @Before
    public void conf (){


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void test (){

        driver.get("http://selenium2.ru/");

        driver.close();

        System.out.println("Тест окончен");

    }
}
