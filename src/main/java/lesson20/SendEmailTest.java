package lesson20;


import org.apache.commons.mail.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetPageSource;
import org.testng.annotations.Test;

import java.net.URL;

public class SendEmailTest {



    @Test
    public  void azazaza() throws EmailException{
   //     System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
        WebDriver driver  =new ChromeDriver();
        driver.get("https://");
        String PageSource= driver.getPageSource();
        System.out.println(PageSource);
        HtmlEmail email = new HtmlEmail();// Create Object



                email.setHostName("smtp.googlemail.com"); // Set SMTP hostname
        email.setSmtpPort(465); // Set port
        email.setAuthenticator(new DefaultAuthenticator("st.ray.butenko@gmail.com", "ckfdf,entyrj12")); // Set email/password
        email.setSSLOnConnect(true); // SSL true
        email.setFrom("Slava@gmail.com"); // set FROM
        email.setSubject("SLAva"); // set Subject
        email.setHtmlMsg(PageSource);

        email.addTo("trello@onthe.io"); // Set recipients
        email.send();




        email.send();


    }
}
