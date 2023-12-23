import Model.*;

public class Main {
    public static void main(String[] args) throws ElevatorNotFreeException {

        ElevatorManager manager = new ElevatorManager();

        EvenElevator even1 = new EvenElevator(manager);
        EvenElevator even2 = new EvenElevator(manager);
        EvenElevator even3 = new EvenElevator(manager);
        OddElevator odd1 = new OddElevator(manager);
        OddElevator odd2 = new OddElevator(manager);
        OddElevator odd3 = new OddElevator(manager);
        PersonalElevator personal = new PersonalElevator(manager);


        manager.call(Type.Odd);
        manager.call(Type.Odd);
        manager.call(Type.Odd);
        odd1.changeStatus();
        manager.call(Type.Odd);
        manager.call(Type.Odd);

        System.out.println();
        System.out.println(manager);

        manager.call(Type.Even);
        manager.call(Type.Even);
        manager.call(Type.Even);
        even2.changeStatus();
        even1.changeStatus();
        manager.call(Type.Even);
        manager.call(Type.Even);
        manager.call(Type.Even);

        System.out.println();
        System.out.println(manager);

        manager.call(Type.Personal);
        manager.call(Type.Personal);
        personal.changeStatus();
        manager.call(Type.Personal);

        System.out.println();
        System.out.println(manager);
    }
}
