import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Subscriber June = new Subscriber();
        June.setSubscriberName("June");

        Subscriber Jacob = new Subscriber();
        Jacob.setSubscriberName("Jacob");

        Subscriber Odysseus = new Subscriber();
        Odysseus.setSubscriberName("Odysseus");


        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(June);
        subscriberList.add(Jacob);
        subscriberList.add(Odysseus);


        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setNews("Breaking News: New tech innovation!");


        for (Subscriber subscriber : subscriberList) {
            newsAgency.attach(subscriber);
        }


        System.out.println("Updates after publishing news:");
        newsAgency.setNews("Breaking News: New stock market highs!");


        newsAgency.detach(Jacob);

        Subscriber Polites = new Subscriber();
        Polites.setSubscriberName("Polites");
        newsAgency.attach(Polites);


        System.out.println("Updates after Jacob unsubscribed and Polites subscribed:");
        newsAgency.setNews("Breaking News: Major sports event results!");

    }
}s
