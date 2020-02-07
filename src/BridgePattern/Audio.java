package BridgePattern;

public class Audio extends Output {
    @Override
    public void select() {
        System.out.println("Audio selected");
    }

    @Override
    public void drag() {
        System.out.println("Audio dragged");
    }

    @Override
    public void move() {
        System.out.println("Audio moved");
    }

    @Override
    public void zoom() {
        System.out.println("Audio zoomed");
    }
}
