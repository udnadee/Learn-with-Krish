public class House {

    private int noOfFloors;
    private int noOfRooms;
    private int noOfBathrooms;

    public House(int noOfFloors, int noOfRooms, int noOfBathrooms) {
        super();
        this.noOfFloors = noOfFloors;
        this.noOfRooms = noOfRooms;
        this.noOfBathrooms = noOfBathrooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "noOfFloors=" + noOfFloors +
                ", noOfRooms=" + noOfRooms +
                ", noOfBathrooms=" + noOfBathrooms +
                '}';
    }

}