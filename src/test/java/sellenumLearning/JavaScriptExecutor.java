package sellenumLearning;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
      //    driver.executeScript("document.querySelector(\"a[href='/shop/women']\").click()");
		
	  //  String msg=(String) driver.executeScript("return document.querySelector(\"strong[data-reactid='119']\").innerText");
	//	System.out.println(msg);
		driver.executeScript("document.querySelector(\"input[class='desktop-searchBar']\").value=\"levis\"");
	}

}
