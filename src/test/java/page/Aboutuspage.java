package page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Aboutuspage {
WebDriver driver;
By about=By.xpath("//*[@id=\"ctl00_mainmenu_menulevel_ctl00_anch\"]/abbr/span");
By csocial=By.xpath("//*[@id=\"ctl00_mainmenu_menulevel_ctl00_limaindropdown\"]/div/div[1]/div/div[2]/div/div/div/a");
By disclaimer=By.xpath("//*[@id=\"aspnetForm\"]/div[4]/footer/div/div/div[1]/div/div[4]/ul/li[2]/a");
By coverview=By.xpath("//*[@id=\"ctl00_mainmenu_menulevel_ctl00_limaindropdown\"]/div/div[1]/div/div[1]/div/div[2]/p/a");
public Aboutuspage(WebDriver driver)
{
	this.driver=driver;
}


public void abouts()
{
	WebElement m=driver.findElement(about);
	Actions act=new Actions(driver);
	act.moveToElement(m);
	act.perform();
			
	driver.findElement(csocial).click();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	driver.findElement(disclaimer).click();
}
public void scrnshot() throws Exception
{
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(src, new File("C:\\Users\\snidh\\OneDrive\\Desktop\\scrnshots\\img1.png"));
}
}
