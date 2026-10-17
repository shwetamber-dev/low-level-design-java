package in.codewithsp.factory;

public class Main {
    public static void main(String[] args) {
        Transport transport = TransportFactory.getTransportVehicle("TWOWH");
        transport.transpotTypeStatus();
        transport = TransportFactory.getTransportVehicle("THREEWH");
        transport.transpotTypeStatus();
    }

}
