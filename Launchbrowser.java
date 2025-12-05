package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("6382159962");
		
		driver.findElement(By.id("pass")).sendKeys("Vayadi@10");
		
		driver.findElement(By.name("login")).click();
		

	}

}
