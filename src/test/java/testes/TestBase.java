package testes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public static WebDriver driver;


    @BeforeSuite
    public void beforeSuit(){
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriverManager.iedriver().setup();

    }


    @BeforeMethod
    public void beforeMethod() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
        Thread.sleep(2000);
        String title = driver.getTitle();
        Thread.sleep(2000);
        System.out.println(title);
        Thread.sleep(2000);
        driver.getWindowHandle();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='cmpboxbtn cmpboxbtnyes cmptxt_btn_yes']")).click();
    }
    @AfterMethod
    public void afterMethod() {
        driver.close();
    }


}