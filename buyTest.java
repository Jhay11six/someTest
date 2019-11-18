package kongaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting the property of yor test
	   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Iykedagenius\\Desktop\\summit\\chromedriver_win32\\chromedriver.exe");
	   	 
	   	 //Creating an instance of driver, to launch browser
	   	 WebDriver browser = new ChromeDriver();
	   	 
	   	 //to go to Konga site
	   	 browser.get("https://www.konga.com/");
	    
	   	 //to maximize the browser
	   	 browser.manage().window().maximize();
	   	 
	   	 //to check the actual url is displayed
	   	 System.out.println(browser.getTitle());
	   	 
	   	 //to login
	   	 browser.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[3]/div/div[3]/div[2]/a")).click();

	   	 //to enter email into email address field
	   	 browser.findElement(By.name("username")).sendKeys("Olaminiyibadero@gmail.com");
	   	 
	   	 //to enter password into password field
	   	 browser.findElement(By.name("password")).sendKeys("Iykedagenius1_");

	   	 //to click the login button
	   	 browser.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
	   		   	 
	   	 //to write product name into search product field
	   	 browser.findElement(By.xpath("//form[@class='f6ed2_25oVd']//input[@id='jsSearchInput']")).sendKeys("Guntrum Sweet Red Wine");
	   	 
	   //to click the search button
	   	 browser.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[3]/div/div[2]/div/form/button")).click();
	   	 
	   	 //to click the add to cart button
	   	 browser.findElement(By.xpath("/button[@class='_0a08a_3czMG']")).click();
	   	 
	   	 //to close the browser
	   	 browser.close();

	}

}
