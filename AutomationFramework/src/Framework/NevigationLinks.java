package Framework;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.media.rtc.webkitRTCPeerConnection;

public class NevigationLinks
{
	WebDriver _driver;
    public NevigationLinks(WebDriver driver)
    {
    	_driver=driver;
    	
    }
    
    public void NevigateTo(NavigationEnum navigationEnm)
    {
		switch(navigationEnm)
		{
		case EditAccount:
			
		
		}
	}
    
    private WebElement GetParent()
    {
    	return _driver.findElement(By.className("menusubnav"));
    			
    }
    
    public java.util.List<WebElement> GetAllLinks()
    {
      return GetParent().findElements(By.tagName("href"));
    }
    
    public WebElement GetLink(String linkToNavigate)
    {
    	return GetParent().findElement(By.linkText(linkToNavigate));
    }
    
}
