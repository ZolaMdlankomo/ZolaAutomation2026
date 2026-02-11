import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginToNdosiWebSite {

    WebDriver driver;
@Test
public void loginWithValidDetails(){

        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
        driver.findElement(By.id("login-email")).sendKeys("zola.mdlankomo@outlook.com");
        driver.findElement(By.id("login-password")).sendKeys("Melo2016!");
        driver.findElement(By.id("login-submit")).click();

        String expectedURL = "https://ndosisimplifiedautomation.vercel.app/#dashboard";
        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/h2")).isDisplayed();
        

    }
}
