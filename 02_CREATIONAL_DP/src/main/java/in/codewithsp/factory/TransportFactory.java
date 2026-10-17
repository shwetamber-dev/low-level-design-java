package in.codewithsp.factory;

public class TransportFactory {

    public static Transport getTransportVehicle(String transportType){
        switch(transportType) {
            case "TWOWH":
                return new TwoWheeler();

            case "THREEWH":
                return new ThreeWheeler();

            case "FOURWH":
                return new FourWheeler();

            default:
                throw new IllegalArgumentException("Incorrect Vehicle Type Requested");
        }
    }

}
