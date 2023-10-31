package page;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Recipiespage {
WebDriver driver;
By recipie=By.xpath("//*[@id=\"ctl00_mainmenu_menulevel_ctl02_anch\"]/abbr/span");
By restaurent=By.xpath("//*[@id=\"ctl00_mainmenu_menulevel_ctl02_limaindropdown\"]/div/div[1]/div/div[1]/div/a");
By cake=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_repcategory1_ctl00_divbigtab\"]/div/div[6]/a/div/h3");
//By desert=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_repcategory_ctl01_litab\"]");


//By butter=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_repcategory1_ctl00_divbigtab\"]/div/div[3]/a/div/h3");
//By pudding=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_repcategory1_ctl01_divbigtab\"]/div/div[4]/a/div/h3");



public Recipiespage(WebDriver driver)
{
	this.driver=driver;
}
public void recipies()
{
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement m=driver.findElement(recipie);
	Actions act=new Actions(driver);
	act.moveToElement(m);
	act.perform();
	driver.findElement(restaurent).click();
	driver.findElement(cake).click();
	driver.navigate().back();

	//wait.until(ExpectedConditions.visibilityOfElementLocated(desert));
	//driver.findElement(desert).click();
	//wait.until(ExpectedConditions.visibilityOfElementLocated(butter));
	//driver.findElement(butter).click();
	//wait.until(ExpectedConditions.visibilityOfElementLocated(pudding));
	//driver.findElement(pudding);
	
	
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(desert));
	
	
	
	
	
	
}

}
