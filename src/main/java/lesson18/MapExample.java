package lesson18;

import org.testng.annotations.Test;

import java.util.*;


public class MapExample {
@Test
    public void mapFor(){

    Map<String, Double> map=new HashMap<>();
    map.put("StarWars1", 8.3);
    map.put("StarWars2", 9.0);
    map.put("StarWars3", 5.7);
    Set<Map.Entry<String,Double>> entries= map.entrySet();
    for(Map.Entry<String,Double>entry:entries){
        String key= entry.getKey();
        Double value= entry.getValue();
        System.out.println("Movie tittle: "+key+ "Rating: "+value);
    }
    }

    @Test
    public void listIterator(){
        List<String> sexNames = new ArrayList<>();
        sexNames.add("Slava");
        sexNames.add("Jack");
        sexNames.add("Jessika");
        sexNames.add("Kolya");
        sexNames.add("Kolya");

        System.out.println("Original: "+sexNames);
        Iterator<String> iterator = sexNames.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            if(s.contains("J")){
                iterator.remove();
            }
        }


        System.out.println("Removed: "+sexNames);
    }

}
