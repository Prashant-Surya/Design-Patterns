package ObserverPattern;

import ObserverPattern.Clients.DD;
import ObserverPattern.Clients.NDTV;
import ObserverPattern.Clients.StarSports;
import ObserverPattern.Observers.CricketObserver;
import ObserverPattern.Observers.ElectionObserver;
import ObserverPattern.Observers.EntertainmentObserver;
import ObserverPattern.Publishers.Cricket;
import ObserverPattern.Publishers.Election;
import ObserverPattern.Publishers.Entertainment;

public class Main {
    public static void main(String[] args) {
        DD dd = new DD("Door Darshan");
        NDTV ndtv = new NDTV("NDTV");
        StarSports starSports = new StarSports("Star Sports");

        Cricket cricket = new Cricket();
        Election election = new Election();
        Entertainment entertainment = new Entertainment();

        CricketObserver cricketObserver = new CricketObserver();
        cricketObserver.subscribe(dd);
        cricketObserver.subscribe(starSports);
        ElectionObserver electionObserver = new ElectionObserver();
        electionObserver.subscribe(ndtv);
        electionObserver.subscribe(dd);
        EntertainmentObserver entertainmentObserver = new EntertainmentObserver();
        entertainmentObserver.subscribe(dd);

        cricket.setObserver(cricketObserver);
        election.setObserver(electionObserver);
        entertainment.setObserver(entertainmentObserver);

        cricket.setCricketScore("121/2");
        System.out.println("-------------------------------------");
        election.setMessage("XYZ party won");
        System.out.println("-------------------------------------");
        entertainment.setMessage("XYZ's movie a hit");

    }
}
