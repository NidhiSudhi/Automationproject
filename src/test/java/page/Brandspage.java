package page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Brandspage {
WebDriver driver;
By brands=By.xpath("//*[@id=\"ctl00_mainmenu_menulevel_ctl01_anch\"]/abbr/span");
By snacks=By.xpath("//*[@id=\"ctl00_mainmenu_menulevel_ctl01_repcategory1_ctl00_litab\"]");
By fulltoss=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_repcategory1_ctl02_repbrandlogo_ctl00_imglogo\"]");
By biscuits=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_repcategory_ctl00_litab\"]");
By krackjack=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_repcategory1_ctl00_repbrandlogo_ctl03_imglogo\"]");

public Brandspage(WebDriver driver)
{
	this.driver=driver;
}

public void brands()
{
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebElement b=driver.findElement(brands);
Actions act=new Actions(driver);
act.moveToElement(b);
act.perform();
driver.findElement(snacks).click();
driver.findElement(fulltoss).click();
driver.navigate().back();
driver.findElement(biscuits).click();
driver.findElement(krackjack).click();
driver.navigate().back();

}

public void linkcount()
{
	
	List<WebElement> li = driver.findElements(By.tagName("a"));
	System.out.println("total no of links"+li.size());
	
}




}
