package org.emp;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstproject {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement btnCreateAccount = driver.findElement(By.id("u_0_2"));
		btnCreateAccount.click();
		
		Thread.sleep(1000);
		
		WebElement printYear = driver.findElement(By.id("year"));
		Select select = new Select(printYear);
		
		java.util.List<WebElement> allOptions = select.getOptions();
		WebElement element = allOptions.get(5);
		String name = element.getText();
		System.out.println(name);
		
		for (Iterator<WebElement> iterator = allOptions.iterator(); iterator.hasNext();) {
			;
		}
		String year = element.getText();
		System.out.println(year);
	}

}
