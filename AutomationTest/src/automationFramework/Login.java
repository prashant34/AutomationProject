package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		 
        //Launch the Online Store Website
		driver.manage().window().maximize();
       driver.get("https://www.irctc.co.in");
       driver.findElement(By.xpath("/html/body/div/div/div[11]/form/div[1]/div[2]/table[1]/tbody/tr[1]/td[2]/input")).sendKeys("pRASHANt");
       driver.findElement(By.xpath("/html/body/div/div/div[11]/form/div[1]/div[2]/table[1]/tbody/tr[2]/td[2]/input")).sendKeys("pei877");
       Thread.sleep(10000);
       driver.findElement(By.xpath("/html/body/div/div/div[11]/form/div[1]/div[4]/input[1]")).click();
       System.out.println("Successfully");
       /*driver.findElement(By.xpath(""/html/body/div[3]/div[1]/div[4]/div/div[3]/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys("JHANSI JN - JHS");
       /* driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[3]/div/form/table/tbody/tr[3]/td[2]/input")).sendKeys("H NIZAMUDDIN - NZM");*/
       driver.findElement(By.className("ui-autocomplete-input")).sendKeys("JHANSI JN - JHS");
       driver.findElement(By.id("jpform:toStation")).sendKeys("H NIZAMUDDIN - NZM");
       driver.findElement(By.id("jpform:journeyDateInputDate")).sendKeys("13-02-2016");
      /* driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[3]/div/form/table/tbody/tr[5]/td[2]/input")).sendKeys("13-02-2016");
       driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[3]/div/form/table/tbody/tr[13]/td/input[1]")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div[2]/form[1]/div[2]/div/table[2]/tbody[1]/tr[1]/td[16]/a[4]")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div[2]/form[1]/div[2]/div/table[2]/tbody[1]/tr[1]/td[16]/a[4]")).click();*/
       driver.findElement(By.id("jpform:jpsubmit")).click();
       driver.findElement(By.id("cllink-12621-SL-3")).click();
       Thread.sleep(10000);
       driver.findElement(By.id("12621-SL-GN-5")).click();
       driver.findElement(By.id("addPassengerForm:psdetail:0:p1253925910")).sendKeys("PRASHANT KUMAR");
       driver.findElement(By.id("addPassengerForm:psdetail:0:psgnAge")).sendKeys("22");
       Select oSelect = new Select(driver.findElement(By.id("addPassengerForm:psdetail:0:psgnGender")));
       oSelect.selectByValue("Male");
       System.out.println("Successfully");
       
	}

}
