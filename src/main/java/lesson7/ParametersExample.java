package lesson7;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by User on 28.12.2017.
 */
public class ParametersExample {
    @Test
    @Parameters({"email","password"})
    public void login(String email, String password){
        System.out.println("EMAIL: "+email);
        System.out.println("PASSWORD: "+password);
    }
}
