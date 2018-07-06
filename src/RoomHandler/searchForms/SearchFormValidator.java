package RoomHandler.searchForms;

import RoomHandler.SearchForm;

public interface SearchFormValidator {

    void validateForm(SearchForm form);

    void add(SearchFormValidator form);

    void remove(SearchFormValidator form);

}
