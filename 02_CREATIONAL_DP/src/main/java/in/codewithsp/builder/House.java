package in.codewithsp.builder;

public class House {

    private int bedroomKitechen;
    private int bathroom;
    private boolean hall;
    private boolean parking;
    private boolean garden;

    public House(HouseBuilder builder){
        this.bedroomKitechen = builder.bedroomKitechen;
        this.bathroom = builder.bathroom;
        this.hall = builder.hall;
        this.parking = builder.parking;
        this.garden = builder.garden;

    }

    @Override
    public String toString() {
        return "House{" +
                "bedroomKitechen=" + bedroomKitechen +
                ", bathroom=" + bathroom +
                ", hall=" + hall +
                ", parking=" + parking +
                ", garden=" + garden +
                '}';
    }

    public static class HouseBuilder {
        // Mandatory
        private int bedroomKitechen;
        private int bathroom;
        // Optional
        private boolean hall;
        private boolean parking;
        private boolean garden;

        public HouseBuilder(int bedroomKitechen, int bathroom) {
            this.bedroomKitechen = bedroomKitechen;
            this.bathroom = bathroom;
        }

        public HouseBuilder setHall(boolean hall) {
            this.hall = hall;
            return this;
        }

        public HouseBuilder setParking(boolean parking) {
            this.parking = parking;
            return this;
        }

        public HouseBuilder setGarden(boolean garden) {
            this.garden = garden;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}
