public class HouseBuilder {

    private int noOfFloors;
    private int noOfRooms;
    private int noOfBathrooms;

    public HouseBuilder setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
        return this;
    }

    public HouseBuilder setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
        return this;
    }

    public HouseBuilder setNoOfBathrooms(int noOfBathrooms) {
        this.noOfBathrooms = noOfBathrooms;
        return this;
    }

    public House buildHouse(){
        return new House(noOfFloors, noOfRooms, noOfBathrooms);
    }

}