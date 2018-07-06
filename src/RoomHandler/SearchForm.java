package RoomHandler;

import Room.RoomCharacteristic;

import java.time.Period;

public class SearchForm {
    Period searchPeriod;
    RoomCharacteristic characteristic;
    int amount;

    public SearchForm(Period searchPeriod, RoomCharacteristic characteristic, int amount){
        this.amount = amount;
        this.characteristic = characteristic;
        this.amount = amount;
    }
}
