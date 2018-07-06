package RoomHandler.conditions;

import java.time.LocalDate;
import java.time.Period;

public interface Condition {
    boolean validate(Period period);
    void add(Condition condition);
    void remove(Condition condition);

}
