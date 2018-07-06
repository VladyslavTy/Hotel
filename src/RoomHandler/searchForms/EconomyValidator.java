package RoomHandler.searchForms;

import Room.Room;
import Room.RoomType;

public class EconomyValidator implements SearchFormValidator {

    @Override
    public boolean validateForm(Room room) {
        return room.characteristic.roomType == RoomType.economy;
    }

    @Override
    public void add(SearchFormValidator form) {

    }

    @Override
    public void remove(SearchFormValidator form) {

    }}
