package Model;

public class OddElevator extends Elevator {

    public OddElevator(ElevatorManager list) {
        super();
        type = Type.Odd;
        list.elevators.add(this);
    }
}
