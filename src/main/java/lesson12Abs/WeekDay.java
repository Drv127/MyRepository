package lesson12Abs;

public enum  WeekDay {
    MONDAY(1), THUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
 private  int dayInt;

 WeekDay (int dayInt){
    this.dayInt=dayInt;
}
public int getDayInt(){
     return dayInt;
}

}
