package MediatorPattern;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator("Cricket");

        Client yuvraj = new Client("Yuvraj", mediator);
        Client sehwag = new Client("Sehwag", mediator);
        Client kohli  = new Client("Kohli", mediator);
        Client vvs    = new Client("VVS", mediator);

        yuvraj.connect();
        sehwag.connect();
        kohli.connect();
        vvs.connect();

        yuvraj.sendMessage(null, "Hello all");

        vvs.disconnect();

        kohli.sendMessage(null, "Hello ppl");

        kohli.sendMessage(yuvraj.getId(), "Hello Yuvi");

    }
}
