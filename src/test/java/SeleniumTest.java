//https://www.youtube.com/watch?v=h4J58ZAWMW4&t=997s
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    WebDriver driver;

@BeforeTest
void setup(){
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
}

@Test
    void testSteps() throws InterruptedException{
driver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
    driver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
    driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");
    driver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();

    WebElement elt=driver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));
    String actualelement=elt.getText();
    String expectedelement="Formal Shoes";
    Assert.assertEquals(expectedelement,actualelement);

//Performing a validation on title

    String title=driver.getTitle();
    if(title.equalsIgnoreCase("Ace"))
    {
        System.out.println("title matches");
    }
    else{
        System.out.println(title);
    }

    //locating a web element

  //  driver.close();
}
}
