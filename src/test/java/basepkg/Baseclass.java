package basepkg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver;
@BeforeTest
public void steup()
{
	driver=new ChromeDriver();
	driver.get("https://www.bookswagon.com/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
}

}
