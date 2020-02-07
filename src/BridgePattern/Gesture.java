package BridgePattern;

public class Gesture extends Input {

    public void tap() {
        this.output.select();
    }

    public void pan() {
        this.output.drag();
    }

    public void wave() {
        this.output.move();
    }

    public void pinch() {
        this.output.zoom();
    }

}

