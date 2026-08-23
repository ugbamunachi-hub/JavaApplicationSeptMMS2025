package hospital.models;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private int id;
    private String roomNumber;
    private Ward ward;
    private String roomType;
    private int Capacity;
    private List<Bed> beds = new ArrayList<>();

    public Room() {
    }

    public int getId() {
        return id;
    }

    public List<Bed> getBeds() {
        return beds;
    }

    public void addBed(Bed bed) {
        beds.add(bed);
        bed.setRoom(this);
    }

    public void removeRoom(Bed bed) {
        beds.remove(bed);
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

}
