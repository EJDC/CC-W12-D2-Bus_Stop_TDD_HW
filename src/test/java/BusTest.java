import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Bus fullBus;
    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        bus = new Bus("Edinburgh", 3);
        busStop = new BusStop("Gorgie");
        bus.addPassenger(person);
    }

    @Test
    public void canReturnNoOfPassengers() {
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canAddPassengerIfCapacity() {
        bus.addPassenger(person);
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void cannotAddPassengerNoCapacity() {
        fullBus = new Bus("Glasgow", 2);
        fullBus.addPassenger(person);
        fullBus.addPassenger(person);
        fullBus.addPassenger(person);
        assertEquals(2, fullBus.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickupPassenger() {
        busStop.addToQueue(person);
        bus.pickUp(busStop);
        assertEquals(2, bus.passengerCount());
    }
}


