package Model;

public enum Status {
    Busy("Занят"), Free("Свободен");
    private String message;

    Status(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
