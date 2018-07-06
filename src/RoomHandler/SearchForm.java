package RoomHandler;

import RoomHandler.searchForms.*;
import java.util.ArrayList;

public class SearchForm {
    MyPeriod bookingPeriod;
    CompositeValidator characteristics = new CompositeValidator();
    int amount;

    public SearchForm(MyPeriod period, int amount, ArrayList<Integer> selectedCharacteristics){
        this.bookingPeriod = period;
        this.amount = amount;
        addCharacteristics(selectedCharacteristics);
    }

    public void addCharacteristics(ArrayList<Integer> selectedCharacteristics){
        selectedCharacteristics.forEach(integer -> {
            switch (integer){
                case 1:
                    characteristics.add(new LuxuryValidator());
                case 2:
                    characteristics.add(new StandartValidator());
                case 3:
                    characteristics.add(new EconomyValidator());
                case 4:
                    characteristics.add(new SGLValidator());
                case 5:
                    characteristics.add(new DBLValidator());
            }
        });
    }
}
