package lesson8;

public class BoxMain {
    public static void main(String[] args) {
        Box mybox= new Box();
        Box cube= new Box();
        cube.widht = 10;
        cube.height = 10;
        cube.depth = 10;
        Box parrallelepiped=new Box();

        parrallelepiped.widht = 10;
        parrallelepiped.height = 20;
        parrallelepiped.depth = 15;

        cube.volume();
        parrallelepiped.volume();


    }
}
