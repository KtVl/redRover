package lesson15;

public class Generic <Type> {
    private Type field;

    public Generic(Type field) {
        this.field = field;
    }

    public Type getField() {
        return field;
    }

    public void setField(Type field) {
        this.field = field;
    }
}
