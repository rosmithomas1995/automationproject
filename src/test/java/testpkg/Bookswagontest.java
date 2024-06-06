package testpkg;



import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Bookswagonlogin;
import utilities.Excelutils;

public class Bookswagontest extends Baseclass{
	@Test(priority = 1)
	public void verifylogin() throws Exception
	{
	
	Bookswagonlogin p1=new Bookswagonlogin(driver);
	String xl="D:\\Book5.xlsx";
	String sheet="Sheet1";
	int rowcount=Excelutils.getrowcount(xl, sheet);
	for(int i=1;i<=rowcount;i++)
	{
		String mob=Excelutils.getcellvalue(xl, sheet, i, 0);
		System.out.println("mob---"+mob);
		String password=Excelutils.getcellvalue(xl, sheet, i, 1);
		System.out.println("password---"+password);
		p1.setvalues(mob, password);
		p1.buttonclick();
		
	}

}
	@Test(priority = 2)
	public void test2()
	{
		
		Bookswagonlogin ob=new Bookswagonlogin(driver);
		ob.arrivalclick();
	}
	@Test(priority = 3)
	public void test3()
	{
		Bookswagonlogin ob1=new Bookswagonlogin(driver);
		ob1.imageclick();;
	}
	@Test(priority = 4)
	public void test4()
	{
		Bookswagonlogin ob2=new Bookswagonlogin(driver);
		ob2.cartclick();
		
	}
	@Test(priority = 5)
	public void test5()
	{
		Bookswagonlogin ob3=new Bookswagonlogin(driver);
		ob3.gotoclick();
				
	}
	@Test(priority = 6)
	public void test6()
	{
		Bookswagonlogin ob4=new Bookswagonlogin(driver);
		ob4.buyclick();
	}
	@Test(priority = 7)
	public void test7()
	{
		Bookswagonlogin nm=new Bookswagonlogin(driver);
		nm.assignvalues("sam", "abc company", "xyz house");
	}
	@Test(priority=8)
	public void test8()
	{
		
		Bookswagonlogin po=new Bookswagonlogin(driver);
		po.selectoptionbytext("India");
	}
	@Test(priority=9)
	public void test9()
	{
		Bookswagonlogin pom=new Bookswagonlogin(driver);
		pom.selectoptionbytext1("Kerala");
	}
	
	
	@Test(priority=10)
	public void test10()
	{
		Bookswagonlogin wt=new Bookswagonlogin(driver);
		wt.saveclick();
	}
	@Test(priority = 11)
	public void test11()
	{
		Bookswagonlogin wtm=new Bookswagonlogin(driver);
		wtm.logclick();
	}
}








