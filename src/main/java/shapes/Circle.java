package shapes;

public class Circle {
    public float radius;
    public void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }

}
