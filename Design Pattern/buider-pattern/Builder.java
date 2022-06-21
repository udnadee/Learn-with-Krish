public class Builder {
    public static void main(String[] args){
        //House 1
            House house1 = new HouseBuilder().setNoOfFloors(1).setNoOfRooms(4).setNoOfBathrooms(2).buildHouse();
            System.out.println(house1);
    
            //Build House 2
            House house2 = new HouseBuilder().setNoOfFloors(2).setNoOfRooms(3).setNoOfBathrooms(1).buildHouse();
            System.out.println(house2);
    
        }
    }
}
