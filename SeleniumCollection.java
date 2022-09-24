package Week3.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class SeleniumCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();//launch browser
driver.get("http://ajio.com/");//launch url

//driver.get("https://google.com/");//launch url
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
// TODO Auto-generated method stub
driver.findElement(By.xpath("//div/input[@name='searchVal']")).sendKeys("bags");
//driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);


driver.findElement(By.xpath("//div[@class='searchbar-view']//button[@class='rilrtl-button']")).click();

driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//displays no.of items found
String text = driver.findElement(By.xpath("//div[@class='filter']/div[@class='length']")).getText();
System.out.println(text);
List<WebElement> brandlist = driver.findElements(By.className("brand"));

for (WebElement temp : brandlist) {
	System.out.println(temp.getText());
	//System.out.println
}
System.out.println(brandlist.size());
List<WebElement> bagnamelist = driver.findElements(By.className("nameCls"));
for (WebElement bagtemp : bagnamelist) {
	System.out.println(bagtemp.getText());
}
int bagsize = bagnamelist.size();
System.out.println(bagsize);
	
}

//div/input[@id='Men']
	}


