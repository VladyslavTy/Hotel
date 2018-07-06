package RoomHandler.searchForms;

import Room.RoomCharacteristic;

public interface SearchFormValidator {

    boolean validateForm(RoomCharacteristic characteristic);

    void add(SearchFormValidator form);

    void remove(SearchFormValidator form);

}
