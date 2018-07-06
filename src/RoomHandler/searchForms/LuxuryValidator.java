package RoomHandler.searchForms;

import Room.Room;
import Room.RoomType;

public class LuxuryValidator implements  SearchFormValidator {


    @Override
    public boolean validateForm(Room room) {
        return room.characteristic.roomType == RoomType.lux;
    }

    @Override
    public void add(SearchFormValidator form) {

    }

    @Override
    public void remove(SearchFormValidator form) {

    }
}
