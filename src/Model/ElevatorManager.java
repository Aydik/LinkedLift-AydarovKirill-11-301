package Model;

public class ElevatorManager implements CheckFree, Call {

    public LinkedList elevators = new LinkedList();

    @Override
    public Elevator elevatorFree(Type type) {
        Node temp = elevators.root;
        do {
            if (temp.elevator.status == Status.Free & temp.elevator.type == type) {
                return temp.elevator;
            }
            temp = temp.next;
        } while (temp != elevators.root);

        return null;
    }

    private void caller(Type type) throws ElevatorNotFreeException {
        Elevator now = elevatorFree(type);
        if (now == null) {
            throw new ElevatorNotFreeException();
        }
        System.out.println("Лифт к вам уже едет");
        now.changeStatus();
    }

    public void call(Type type) throws ElevatorNotFreeException {
        try {
            caller(type);
        } catch (ElevatorNotFreeException e) {
            System.out.println("Все лифты для " + type + " заняты, просим вас подождать");
        } catch (Exception e) {
            System.err.println("Not definded Error");
        }
    }

    public String toString(){
        Node temp = elevators.root;
        String s = "";
        int i = 1;
        do {
            s += i + ") Лифт " + temp.elevator.type + " - " + temp.elevator.status + "\n";
            temp = temp.next;
            i ++;
        } while (temp != elevators.root);
        return s;
    }
}
