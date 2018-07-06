package RoomHandler;

import Room.RoomCharacteristic;
import person.Client;

public class Booking {
    RoomCharacteristic characteristic;
    BookingPeriod bookingPeriod;
    Client client;

    public Booking(RoomCharacteristic characteristic, BookingPeriod period, Client client){
        this.characteristic = characteristic;
        this.bookingPeriod = period;
        this.client = client;
    }
}
