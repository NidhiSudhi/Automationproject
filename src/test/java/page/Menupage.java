package page;

import java.time.Duration;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menupage {
WebDriver driver;
By menu=By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]/img[1]");
By media=By.xpath("//*[@id=\"accordion\"]/ul/li[2]/a");
By news=By.xpath("//*[@id=\"homeSubmenu\"]/ul/li[1]/a");
By contact=By.xpath("//*[@id=\"accordion\"]/ul/li[3]/a");
By downloads=By.xpath("//*[@id=\"accordion\"]/ul/li[4]/a");
By greeting=By.xpath("//*[@id=\"accordion\"]/ul/li[5]/a");
By tell=By.xpath("//*[@id=\"nav-home\"]/div/div[2]/a");
By heart=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_LinkButton1\"]/img");
By presence=By.xpath("//*[@id=\"accordion\"]/ul/li[6]/a");


public Menupage(WebDriver driver)
{
	this.driver=driver;
}
public void Menu()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(menu).click();
	driver.findElement(media).click();
	driver.findElement(news).click();
	driver.findElement(menu).click();
	driver.findElement(contact).click();
	driver.findElement(menu).click();
	driver.findElement(downloads).click();
	driver.findElement(menu).click();
	driver.findElement(greeting).click();
	driver.findElement(tell).click();
	driver.findElement(heart).click();
	driver.findElement(menu).click();
	driver.findElement(presence).click();
	driver.navigate().to("https://parleproducts.com/brands/parle-g");
	
	
	
	
	

}
}
