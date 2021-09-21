public class Chapter7_Project3 {
    public static void main(String[] args) {
        Circle unitCircle=new Circle();
        Circle myCircle=new Circle(5);
        Circle yourCircle=new Circle(12.75);
        printCircleData(unitCircle);
        printCircleData(myCircle);
        printCircleData(yourCircle);
    }
    public static void printCircleData(Circle circle)
    {
        System.out.println("Radius : "+circle.getRadius());
        System.out.println("Circumference is: "+circle.circumference());
        System.out.println("Area is: "+circle.area());
    }
}
