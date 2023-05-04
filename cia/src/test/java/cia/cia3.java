package cia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cia3{

	public static void main(String[] args) {
		
		ChromeOptions co=new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		co.addArguments ("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup ();
		WebDriver driver=new ChromeDriver(co);
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not Matched");
		}
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		WebElement firstone=driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		firstone.sendKeys("9566357224");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		WebElement secondone=driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		secondone.sendKeys("Harish13!");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"a-autoid-2-announce\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ordersInPackage-container\"]/div/div/a[1]")).click();
	}
}