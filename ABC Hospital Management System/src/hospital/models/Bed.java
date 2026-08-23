
package hospital.models;


public class Bed {
    private int id;
    private String BedNumber;
    private Room room;
    private boolean occupied;
    
    public Bed(){}

    public int getId() {
        return id;
    }

    public String getBedNumber() {
        return BedNumber;
    }

    public void setBedNumber(String BedNumber) {
        this.BedNumber = BedNumber;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
    
}
