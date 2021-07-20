import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class pagina {
	public boolean openpagechrome(String stringPesquisa) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "//chromedriver/chromedriver --whitelisted-ips=\"\"");
		System.setProperty("webdriver.chrome.whitelistedIps", "");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.devmedia.com.br");
		
		String element =  driver.findElement(By.xpath("//title")).getAttribute("innerText");
		
		
//		WebElement movepage = driver.findElement(By.cssSelector(".footer-content"));
//	    Actions actionProvider = new Actions(driver);
//	    actionProvider.moveToElement(movepage).build().perform();
//	    
//	    WebElement searchBtn = driver.findElement(By.linkText("Java"));
//	    Actions actionProvider1 = new Actions(driver);
//	    actionProvider1.doubleClick(searchBtn).build().perform();

	    Thread.sleep(2000);
		driver.quit();
		if (element.trim().equals(stringPesquisa)) {
			System.out.println("Parabéns");
			System.out.println("O texto pesquisado : " + stringPesquisa );
			System.out.println("É igual ao o título da página que é: " + element );
			driver.quit();
			return true ;
		} else {
			System.out.println("FALHA");
			System.out.println("O texto pesquisado : " + stringPesquisa );
			System.out.println("NÃO é igual ao o título da página que é: " + element );
			driver.quit();
			return  false ;
		}
	}
}


