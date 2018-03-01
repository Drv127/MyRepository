package lesson12Abs;

public class Dog extends Pet {
    @Override
    public void voice() {
        System.out.println("GAF GAF");
        isHungry=true;
    }

    @Override
    public void move() {
        if(isHungry){
            System.out.println("I Need Food");
        return;
        }
        System.out.println("OK, I`ll walk...");
    }
}
