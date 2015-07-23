package allLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getAllLinks {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		/*driver.get("http://timesofindia.indiatimes.com/international-home");
		Thread.sleep(1000);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links " + allLinks.size());
		
		String linkText;
		for(int i=0;i < allLinks.size();i++) {
		
		linkText =allLinks.get(i).getText();  //get the first link of the page.
		System.out.println(linkText);
		if(linkText.equals("City")) {
			
			allLinks.get(i).click();
			//String city = allLinks.get(i).getText();
			System.out.println("Index of city "  +  i);
				}
		

	} */

     
		
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
	String strname = "";
		//List<WebElement> TextBox = driver.findElements(By.className("inputtext"));
		List<WebElement> TextBox = driver.findElements(By.tagName("input"));
		System.out.println("Total Textbox"  + TextBox.size());
				for(int i=0;i < TextBox.size();i++) {
					try {
						
					strname =  TextBox.get(i).getAttribute("aria-label");
					System.out.println(strname);
					if(strname.equalsIgnoreCase("first name")) {
			            
	                    TextBox.get(i).sendKeys("fathima");  
						
					}
					}
					catch (Exception e){
						

			            //System.out.println("exception");       	 
			          
						
					}
					
				}
				
				
	}
}