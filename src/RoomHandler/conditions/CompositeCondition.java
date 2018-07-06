package RoomHandler.conditions;

import Room.RoomCharacteristic;

import java.util.ArrayList;


public class CompositeCondition implements Condition {

    ArrayList<Condition> listOfConditions = new ArrayList<>();

    @Override
    public boolean validate(RoomCharacteristic characteristic) {
            boolean validateMatch = true;
            for (Condition condition : listOfConditions
                    ) {
                if (!condition.validate(characteristic)) {
                    validateMatch = false;
                    break;
                }
            }
            return validateMatch;
        }


    @Override
    public void add(Condition condition) {
        listOfConditions.add(condition);
    }

    @Override
    public void remove(Condition condition) {
        listOfConditions.remove(condition);
    }
}
