package page;

//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Homepage {
WebDriver driver;

By nxt=By.xpath("//*[@id=\"aspnetForm\"]/div[4]/section[6]/div/div/div/div[2]/div[2]");
By logo=By.xpath("//*[@id=\"ctl00_imglogodesk\"]");



public Homepage(WebDriver driver)
{
	this.driver=driver;
}


public void titleverification()
{
	String actual=driver.getTitle();
	System.out.println(actual);
	String expect="Parle-G";
	if(actual.equals(expect))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
}

public void verify()
{
	Boolean b=driver.findElement(logo).isDisplayed();
	if(b)
	{
		System.out.println("displayed");
	}
		else
		{
			System.out.println(" not displayed");
		}
	
}




public void sel()
{
	
	
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)","");
	driver.findElement(nxt);
	
	
}


	
	
	






}
