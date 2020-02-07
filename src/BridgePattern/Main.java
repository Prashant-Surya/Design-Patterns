package BridgePattern;

public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Gesture gesture = new Gesture();

        Screen screen = new Screen();
        Audio audio = new Audio();
        mouse.setOutput(screen);
        gesture.setOutput(audio);

        mouse.select();
        gesture.tap();
    }
}
