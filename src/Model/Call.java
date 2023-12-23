package Model;

public interface Call {
    public void call(Type type) throws ElevatorNotFreeException;
}
