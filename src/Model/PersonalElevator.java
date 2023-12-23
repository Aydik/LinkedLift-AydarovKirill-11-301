package Model;

public class PersonalElevator extends Elevator {

    public PersonalElevator(ElevatorManager list) {
        super();
        type = Type.Personal;
        list.elevators.add(this);
    }
}
