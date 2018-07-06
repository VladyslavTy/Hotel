package RoomHandler.searchForms;

import Room.RoomCharacteristic;
import Room.RoomType;

public class StandartValidator implements SearchFormValidator {

        @Override
        public boolean validateForm(RoomCharacteristic characteristic) {
            return characteristic.roomType == RoomType.standart;
        }

        @Override
        public void add(SearchFormValidator form) {

        }

        @Override
        public void remove(SearchFormValidator form) {

        }
}

