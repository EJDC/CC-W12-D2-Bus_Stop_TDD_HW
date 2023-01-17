import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;
//    private BusStop busStop;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.capacity >= passengerCount()+1)  {
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }

    public void pickUp(BusStop busStop) {
        Person person = busStop.removePersonFromQueue();
        this.passengers.add(person);
    }

}

