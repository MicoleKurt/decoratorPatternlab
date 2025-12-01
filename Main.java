public class Main {
    public static void main(String[] args) {
        Coffee black = new BlackCoffee();

        // Black Coffee + Milk
        Milk withMilk = new Milk();
        withMilk.setCoffee(black);

        // Black Coffee + Milk + Caramel Syrup
        CaramelSyrup withCaramel = new CaramelSyrup();
        withCaramel.setCoffee(withMilk);

        System.out.println("Order: " + withCaramel.getDescription());
        System.out.println("Total Cost: ₱ " + withCaramel.getCost());
    }
}