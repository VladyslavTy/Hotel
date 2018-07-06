package RoomHandler.conditions;

import java.time.Period;

public class CompositeCondition implements Condition {

    @Override
    public boolean validate(Period period) {
        return false;
    }

    @Override
    public void add(Condition condition) {

    }

    @Override
    public void remove(Condition condition) {

    }
}
