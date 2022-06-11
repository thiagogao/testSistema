import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SystemTestSelenium {

    WebDriver web;

    @BeforeEach
    public void instanciando(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        web = new ChromeDriver();
    }

    @Test
    public void PaginaSite(){
        web.get("https://store.playstation.com/pt-br/pages/latest");
        Assertions.assertEquals("https://store.playstation.com/pt-br/pages/latest", web.getCurrentUrl());
    }

    @Test
    public void abrirPaginaMagaluTest(){
        System.setProperty("webDriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://www.magazineluiza.com.br/");
        Assertions.assertEquals("https://www.magazineluiza.com.br/", webDriver.getCurrentUrl());
    }



//    @AfterEach
//    public void fechandoPaginas(){
//        web.close();
//    }
}
