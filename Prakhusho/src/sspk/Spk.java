package sspk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Spk {

	@Test
	public static void method1(){

		WebDriver d = new FirefoxDriver();
		d.get("https://google.co.in");
		d.manage().window().maximize();
		System.out.println("SPK");
		d.quit();
	}
	@Test
	public static void method2(){

		WebDriver d = new FirefoxDriver();
		d.get("https://google.co.in");
		d.manage().window().maximize();
		System.out.println("SPK");
		d.quit();
	}
}
