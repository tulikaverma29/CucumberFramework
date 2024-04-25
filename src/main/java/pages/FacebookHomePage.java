package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FacebookHomePage 
{
	private final WebDriver driver;
    public   FacebookHomePage( WebDriver driver )
    {
        this.driver = driver;
    }
    
    public boolean isProfileImageDisplayed() {
    	return driver.findElement(By.cssSelector("img[alt='Profile picture']")).isDisplayed();
    }
}
