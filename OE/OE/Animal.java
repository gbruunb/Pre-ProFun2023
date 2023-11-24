package OE;
public class Animal {
    private String name;

    public void sound() {
        System.out.println("AHHHHHH");
    }
}



class Tiger extends Animal {
    public void sound() {
        System.out.println("Hog pip");
    }
}
