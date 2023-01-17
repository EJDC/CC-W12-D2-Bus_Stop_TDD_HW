import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
        private BusStop busStop;
        private Bus bus;
        private Person person;

        @Before
        public void before() {
            busStop = new BusStop("Gorgie");
            bus = new Bus("Edinburgh", 3);
        }

        @Test
        public void canAddToQueue() {
            busStop.addToQueue(person);
            assertEquals(1, busStop.queueSize());
        }

        @Test
        public void canRemoveFromQueue(){
            busStop.addToQueue(person);
            busStop.removePersonFromQueue();
            assertEquals(0, busStop.queueSize());
        }
    }


