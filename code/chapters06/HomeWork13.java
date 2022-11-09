public class HomeWork13 {
    public static void main(String[] args) {
        int times = 5;
        Circle circle = new Circle();
        PassObject passObject = new PassObject();
        passObject.printAreas(circle, times);
        
    }
}

class Circle {
    private double radius;

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}

class PassObject {
    public void printAreas(Circle c, int times) {
        System.out.println("Radius\tArea");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
           System.out.println(c.getRadius() + "\t" + c.findArea());
        }
    }
}
