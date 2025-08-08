package Healings;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Heal {

    @Test
    public void healTesting(){
        Heal heal = new Heal();

        try {
            WebDriver delegate = new ChromeDriver();
            SelfHealingDriver driver = SelfHealingDriver.create(delegate);
            driver.get("https://letcode.in/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//*[@id='testing' and text()='Work-Space']")).click();
            heal.sleep(2000);
            driver.findElement(By.xpath("//a[text()=' Page Object Model ']")).click();
            heal.sleep(2000);
            driver.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
