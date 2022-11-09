import ch.qos.logback.classic.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class NewTestClass extends BaseHelper {

    Logger logger = (Logger) LoggerFactory.getLogger(NewTestClass.class);


    @Test
    public void firstTest() {
        logger.info("Start logging");

        wd.get("http://students-aid.org:9222/");
        wd.manage().window().maximize();

//        WebElement registerButton = wd.findElement(By.xpath("//button[@id='register']"));
//        registerButton.click();

//        WebElement firstNameInput = wd.findElement(By.xpath("//input[@id='firstname']"));
//        firstNameInput.clear();

        wd.quit();


    }


}
