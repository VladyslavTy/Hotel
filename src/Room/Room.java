package Room;

import person.Client;

import java.time.Period;

public class Room {
    int roomNumber;
    RoomCharacteristic roomCharacteristic;
    Period periodOfUse;

    public Room(RoomCharacteristic roomCharacteristic){
        this.roomCharacteristic = roomCharacteristic;
    }

}
