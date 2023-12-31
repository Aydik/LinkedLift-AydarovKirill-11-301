package Model;

public enum Type {

    Even("чётных этажей"), Odd("нечётных этажей"), Personal("персонала");

    final String message;

    Type(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
