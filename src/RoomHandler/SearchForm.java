package RoomHandler;

import Room.RoomCharacteristic;

import java.time.Period;

public class SearchForm {
    Period searchPeriod;
    RoomCharacteristic characteristic;
    int amount;

    public SearchForm(){

    }

    public void fill(Period period, RoomCharacteristic characteristic, int amount){
        this.searchPeriod = period;
        this.characteristic = characteristic;
        this.amount = amount;
    }
}
