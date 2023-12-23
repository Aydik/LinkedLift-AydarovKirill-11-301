package Model;

public class EvenElevator extends Elevator {

    public EvenElevator(ElevatorManager list) {
        super();
        type = Type.Even;
        list.elevators.add(this);
    }
}
