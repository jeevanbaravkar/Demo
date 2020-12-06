import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver dv=new ChromeDriver();
	    
		//dv.get("https://WWW.GOOGLE.COM/");
	}

}
