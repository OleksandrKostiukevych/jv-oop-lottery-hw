package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "color is " + this.color + " and number is " + this.number;
    }
}