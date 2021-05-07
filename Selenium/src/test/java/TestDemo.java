import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();  
     
      // Launch Website  
   driver.navigate().to("http://www.javatpoint.com/");  
     
    //Maximize the browser  
     driver.manage().window().maximize();  
     
     //Scroll down the webpage by 5000 pixels  
   JavascriptExecutor js = (JavascriptExecutor)driver;  
   js.executeScript("scrollBy(0, 5000)");   
     
    // Click on the Search button  
   driver.findElement(By.linkText("Core Java")).click();  
   
   driver.close();
   
	}

}
