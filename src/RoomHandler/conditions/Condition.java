package RoomHandler.conditions;

import Room.RoomCharacteristic;

public interface Condition {
    boolean validate(RoomCharacteristic characteristic);
    void add(Condition condition);
    void remove(Condition condition);

}
