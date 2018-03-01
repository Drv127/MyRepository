package lesson12Abs;

public class WeekDayWorker {
    public static void main(String[] args) {
        sendMessage(WeekDay.SATURDAY);
    }
    public static void sendMessage(WeekDay weekDay){
        System.out.println("FOR DAY "+weekDay+" Number is: "+weekDay.getDayInt());
    }

}
