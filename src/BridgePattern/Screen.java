package BridgePattern;

public class Screen extends Output {
    @Override
    public void select() {
        System.out.println("Screen selected");
    }

    @Override
    public void drag() {
        System.out.println("Screen dragged");
    }

    @Override
    public void move() {
        System.out.println("Screen moved");
    }

    @Override
    public void zoom() {
        System.out.println("Screen zoomed");
    }
}
