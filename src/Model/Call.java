package Model;

public interface Call {
    void call(Type type) throws ElevatorNotFreeException;
}
