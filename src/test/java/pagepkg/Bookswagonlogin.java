package pagepkg;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Bookswagonlogin {
WebDriver driver;
@FindBy (xpath="//*[@id=\"ctl00_phBody_SignIn_txtEmail\"]")
WebElement booksmobile;
@FindBy (xpath="//*[@id=\"ctl00_phBody_SignIn_txtPassword\"]")
WebElement bookspassword;
@FindBy (xpath="//*[@id=\"ctl00_phBody_SignIn_btnLogin\"]")
WebElement bookslogin;
@FindBy(xpath="//*[@id=\"ctl00_linewrelease\"]/a")
WebElement newarrivals;
@FindBy(xpath="//*[@id=\"listpromoproduct\"]/div[2]/div/a/img")
WebElement image;
@FindBy(xpath = "//*[@id=\"btnAddtocart\"]")
WebElement addtocart;
@FindBy(xpath ="//*[@id=\"btnGotocart\"]" )
WebElement gotocart;
@FindBy(xpath = "/html/body/form/div[10]/div/div/div/div/div[2]/div/div/div/div[4]/div[3]/div/div[2]/input")
WebElement buy;
@FindBy(xpath = "//*[@id=\"ctl00_cpBody_txtNewRecipientName\"]")
WebElement name;
@FindBy(xpath = "//*[@id=\"ctl00_cpBody_txtNewCompanyName\"]")
WebElement compname;
@FindBy(xpath = "//*[@id=\"ctl00_cpBody_txtNewAddress\"]")
WebElement address;
@FindBy(xpath="//*[@id=\"ctl00_cpBody_ddlNewCountry\"]")
WebElement country;
@FindBy(xpath ="//*[@id=\"ctl00_cpBody_ddlNewState\"]" )
WebElement state;
@FindBy(xpath="//*[@id=\"ctl00_cpBody_imgSaveNew\"]")
WebElement save;
@FindBy(xpath="//*[@id=\"ctl00_lnkbtnLogout\"]")
WebElement logout;
public Bookswagonlogin(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}









public void setvalues(String mob,String password)
{
	booksmobile.clear();
	booksmobile.sendKeys(mob);
	bookspassword.clear();
	bookspassword.sendKeys(password);
}
public void buttonclick()
{
	bookslogin.click();
}
public void arrivalclick()
{
	newarrivals.click();
}
public void imageclick()
{
	image.click();
}
public void cartclick()
{
	addtocart.click();
}
public void gotoclick()
{
	gotocart.click();
}
public void buyclick()
{
	buy.click();
}
public void assignvalues(String resname,String companyname,String addr)
{
	name.sendKeys(resname);
	compname.sendKeys(companyname);
	address.sendKeys(addr);
}
public void selectoptionbytext(String optiontext) throws NoSuchElementException
{
	Select dropdown=new Select(country);
	dropdown.selectByVisibleText(optiontext);
}
public void selectoptionbytext1(String optiontext) throws NoSuchElementException
{
	Select dropdown=new Select(state);
	dropdown.selectByVisibleText(optiontext);
}

public void saveclick()
{
save.click();
}
public void logclick()
{
logout.click();
}

}

