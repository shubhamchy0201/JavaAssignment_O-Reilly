public class Chapter7_Project2 {
    public static void main(String[] args) {
        IceCream myIc=new IceCream("chocolate",3,2);
        IceCream yourIc=new IceCream("Strawberry",5,7);
        myIc.addToppings("nuts");
        myIc.addToppings("cherry");

        yourIc.addToppings("springles");
        printIc(myIc);
        printIc(yourIc);

    }

    private static void printIc(IceCream iceCream) {
        System.out.println(iceCream.getName());
        System.out.println("Cost: $"+iceCream.getCost());
        System.out.println("Topped with:");
        iceCream.printTopping();
        System.out.println();
    }
}
