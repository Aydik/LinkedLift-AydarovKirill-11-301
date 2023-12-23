package Model;

public abstract class Elevator {
    Status status;
    Type type;

    Elevator() {
        status = Status.Free;
    }

    public void changeStatus() {
        if (status == Status.Free) status = Status.Busy;
        else status = Status.Free;
    }
}
