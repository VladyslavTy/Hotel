package RoomHandler.searchForms;

import Room.Room;
import Room.RoomSize;

public class SGLValidator implements SearchFormValidator {

    @Override
    public boolean validateForm(Room room) {
        return room.characteristic.roomSize == RoomSize.SGL;
    }

    @Override
    public void add(SearchFormValidator form) {

    }

    @Override
    public void remove(SearchFormValidator form) {

    }
}
