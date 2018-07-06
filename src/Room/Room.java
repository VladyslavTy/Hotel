package Room;

import person.Client;

import java.time.Period;

public class Room {
    int roomNumber;
    public RoomCharacteristic characteristic;
    Period periodOfUse;

    public Room(RoomCharacteristic characteristic){
        this.characteristic = characteristic;
    }

}
