package BridgePattern;

public class Mouse extends Input {

    public void select() {
        this.output.select();
    }

    public void drag() {
        this.output.drag();
    }

    public void move() {
        this.output.move();
    }
    
    public void zoom() {
        this.output.zoom();
    }
    
}
