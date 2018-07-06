package RoomHandler.searchForms;

import Room.RoomCharacteristic;
import Room.RoomType;

public class EconomyValidator implements SearchFormValidator {

    @Override
    public boolean validateForm(RoomCharacteristic characteristic) {
        return characteristic.roomType == RoomType.economy;
    }

    @Override
    public void add(SearchFormValidator form) {

    }

    @Override
    public void remove(SearchFormValidator form) {

    }}
