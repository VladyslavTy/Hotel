package RoomHandler.searchForms;

import Room.Room;
import RoomHandler.SearchForm;

public interface SearchFormValidator {

    boolean validateForm(Room room);

    void add(SearchFormValidator form);

    void remove(SearchFormValidator form);

}
