package lesson8;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User(); // Объект класса User
        User user2 = new User(); // 2й бъект класса User
        User user3 = new User();
        user1.name="Masha";
        user1.age=25;
        user2.name="JACk";
        user2.age=70;
        user2.city="New York";
        System.out.println(user1.name+":"+user1.age);
        System.out.println(user2.name+": "+user2.age+": "+user2.city+" "+user2.prof);

    }

}
