package lesson13;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    @Test
    public void azaza(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Jack");
        stringList.add("Maria");
        stringList.add("Pavel");
        stringList.add("Timur");
        System.out.println(stringList);

    }

}
