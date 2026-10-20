package in.codewithsp.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        System.out.println("Basic Pizza Created");
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
        pizza = new CheeseDecorator(pizza);
        System.out.println("Cheese Added");
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
        pizza = new MushroomDecorator(pizza);
        System.out.println("Mushroom Added");
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
