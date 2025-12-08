package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public final class Launchamazon {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Bikes",Keys.ENTER);
		
		

	}

}
