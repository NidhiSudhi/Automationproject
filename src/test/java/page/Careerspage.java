package page;


import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Careerspage {
WebDriver driver;
By career=By.xpath("//*[@id=\"ctl00_mainmenu_menulevel_ctl03_anch\"]/abbr/span");
By job=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtjobtitle\"]");
By fname=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtfname\"]");
By mname=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtmname\"]");
By lname=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtlname\"]");
By dob=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtdob\"]");
By mnth=By.xpath("//*[@id=\"epoch_popup_mainheading\"]/select[1]");
By next=By.xpath("//*[@id=\"epoch_popup_mainheading\"]/input[1]");
By day=By.xpath("//*[@id=\"epoch_popup_calcells\"]/tbody/tr/td");




By fathername=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtfather\"]");
By mstatus=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddlmeritalstatus\"]");
By country=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddlcountry\"]");
By radiobutton=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_rbgender_1\"]");
By state=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtstate\"]");
By city=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtcity\"]");
By email=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtemail\"]");
By phone=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtphone\"]");
By experience=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtExperience\"]");
By salary=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtSalary\"]");
By fuctionelarea=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtfuncationalarea\"]");
By residentialaddress=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtResidential\"]");
By message=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtMessage\"]");
By qualification=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtQualification\"]");
By intrest=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtareaofintrest\"]");
By fileupload=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_file1\"]");
By submit=By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnsubmit\"]");



public Careerspage(WebDriver driver)
{
	this.driver=driver;
}
public void career() 
{
	driver.findElement(career).click();
}
public void careers(String jobtitle,String firstname,String middlename,String lastname,String faname,String stst,String cty,String mail,String phn,String xpnce,String saly,String farea,String ra,String mssg,String qualify,String intrst )
{
	driver.findElement(job).sendKeys(jobtitle);
	driver.findElement(fname).sendKeys(firstname);
	driver.findElement(mname).sendKeys(middlename);
	driver.findElement(lname).sendKeys(lastname);
	driver.findElement(fathername).sendKeys(faname);
	driver.findElement(state).sendKeys(stst);
	driver.findElement(city).sendKeys(cty);
	driver.findElement(email).sendKeys(mail);
	driver.findElement(phone).sendKeys(phn);
	driver.findElement(experience).sendKeys(xpnce);
	driver.findElement(salary).sendKeys(saly);
	driver.findElement(fuctionelarea).sendKeys(farea);
	driver.findElement(residentialaddress).sendKeys(ra);
	driver.findElement(message).sendKeys(mssg);
	driver.findElement(qualification).sendKeys(qualify);
	driver.findElement(intrest).sendKeys(intrst );
}


public void drop()
{
	WebElement ms=driver.findElement(mstatus);
	Select m=new Select(ms);
	m.selectByVisibleText("Unmarried");
	
	
	WebElement cy=driver.findElement(country);
	Select c=new Select(cy);
	c.selectByValue("53");
	List<WebElement> c1=c.getOptions();
	System.out.println("No of values in country: "+c1.size());
	
	driver.findElement(radiobutton).click();
	boolean b1=driver.findElement(radiobutton).isSelected();
	if(b1)
	{
		System.out.println("selected");
	}
	else
	{
		System.out.println("not selected");
	}
	
	
}

public void upload() throws Exception
{
	driver.findElement(fileupload).sendKeys("C:\\Users\\snidh\\OneDrive\\Documents\\Doc2.docx");
	
}
public void scrnshots() throws Exception
{
	
	WebElement dayelement=driver.findElement(country);
    File src=dayelement.getScreenshotAs(OutputType.FILE);
    FileHandler.copy(src, new File("./Screenshots//img2.png"));
}








public void datepicker()
{
	
	driver.findElement(dob).click();
	while(true)
	{
		WebElement month=driver.findElement(mnth);
		 String month1=month.getText();
		 if(!month1.equalsIgnoreCase("september 2023"))
		 {
			 System.out.println(month);
			 break;
		 }
		 else
		 {
			 driver.findElement(next).click();
		 }
	}	
	List<WebElement> alldates=driver.findElements(day);
	for(WebElement dateelement:alldates)
	{
		String date=dateelement.getText();
		if(date.equals("12"))
		{
		System.out.println(date);
			dateelement.click();
			break;
			
		}
	}
			
	
	
}





public void submit()
{
	driver.findElement(submit).click();
	
}
}
