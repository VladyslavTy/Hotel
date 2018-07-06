package RoomHandler;

import Room.RoomCharacteristic;
import person.Client;

import java.time.Period;

public class Booking {
    RoomCharacteristic characteristic;
    Period bookingPeriod;
    Client client;

    public Booking(RoomCharacteristic characteristic, Period period, Client client){
        this.characteristic = characteristic;
        this.bookingPeriod = period;
        this.client = client;
    }
}
