package lesson2;

import org.apache.commons.net.ntp.TimeStamp;
import org.apache.xpath.SourceTree;

import java.sql.Timestamp;

/**
 * Created by User on 07.12.2017.
 */
public class TimeStampExample {
    public static void main(String[] args) {
        Timestamp timestamp= new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp.getTime());
    }
}
