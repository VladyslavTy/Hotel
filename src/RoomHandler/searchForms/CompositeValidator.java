package RoomHandler.searchForms;

import Room.Room;

import java.util.ArrayList;

public class CompositeValidator implements SearchFormValidator {

    ArrayList<SearchFormValidator> validators = new ArrayList<>();

    @Override
    public boolean validateForm(Room room) {
        boolean validateMatch = true;
        for (SearchFormValidator validator : validators
                ) {
            if (!validator.validateForm(room)) {
                validateMatch = false;
                break;
            }
        }
        return validateMatch;
    }

    @Override
    public void add(SearchFormValidator validator) {
        validators.add(validator);
    }

    @Override
    public void remove(SearchFormValidator validator) {
        validators.remove(validator);
    }
}
