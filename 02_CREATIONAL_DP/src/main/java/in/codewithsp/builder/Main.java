package in.codewithsp.builder;

public class Main {
    public static void main(String[] args) {
        House oneBhkWithParking = new House.HouseBuilder(1,1)
                .setHall(true)
                .setParking(true)
                .build();

        System.out.println("House generated with properties: " +  oneBhkWithParking);
    }
}
