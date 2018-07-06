package RoomHandler.searchForms;

import Room.Room;
import Room.RoomType;

public class StandartValidator implements SearchFormValidator {

        @Override
        public boolean validateForm(Room room) {
            return room.characteristic.roomType == RoomType.standart;
        }

        @Override
        public void add(SearchFormValidator form) {

        }

        @Override
        public void remove(SearchFormValidator form) {

        }
}

