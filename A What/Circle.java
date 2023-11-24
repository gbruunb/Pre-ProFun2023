class Circle {
    private int radius;
    private String color;

    Circle(int radius) {
        this.radius = radius;
        System.out.println("Radius = "+this.radius);
    }

    Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Radius = "+this.radius);
    }

    Circle() {
        System.out.println("Empty Constructor");
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public static void printHelloWorld() {
        System.out.println("Hello World!!!!");
    }
    

    public double getRadius(){
        return radius;
    }


    public void setRadius(int r) {
        this.radius = r;
    }




    public double getArear() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void resize(int scale) {
        radius = scale;
    }

    public void resize() {
        radius = 8;
    }

    public String toString() {
        return "Radius = "+radius+" Color = "+color;
    }
}
