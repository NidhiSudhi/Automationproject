package test;



//import java.time.Duration;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Aboutuspage;
import page.Brandspage;
import page.Careerspage;
import page.Homepage;
import page.Menupage;
import page.Recipiespage;

public class Testclass {
WebDriver driver;
@BeforeTest
public void set()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void url()
{
	driver.get("https://parleproducts.com/brands/parle-g");
}
@Test
public void test() throws Exception
{
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	Homepage ob=new Homepage(driver);
	ob.titleverification();
	ob.verify();
	

	
	
	String parentwindow=driver.getWindowHandle();
	driver.switchTo().window(parentwindow);
	ob.sel();
	
	Aboutuspage ob1=new Aboutuspage(driver);
	ob1.abouts();
	ob1.scrnshot();
	
	
	Careerspage ob2=new Careerspage(driver);
	ob2.career();
	ob2.careers("Marketing Executive","Aniha", "Hari", "Narayan", "Narayan", "Kerala", "Kannur", "Aniha@gmail.com", "1234567890", "Freasher", "20000", "Marketing", "DD Nivas, Kakkanad,Cochin", "Hlooo", "MBA", "Marketing");
	ob2.drop();
	ob2.upload();
	ob2.scrnshots();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	ob2.datepicker();
	ob2.submit();
	
	
	Recipiespage ob3=new Recipiespage(driver);
	ob3.recipies();
	
	
	Brandspage ob4=new Brandspage(driver);
	ob4.brands();
	ob4.linkcount();
	
	Menupage p=new Menupage (driver);
	p.Menu();
	
	
	
}
@AfterMethod
public void ends()
{
	driver.close();
}
}

