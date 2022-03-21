package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitorOld;
    Visitor visitorYoung;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 0);
        visitorOld = new Visitor(19, 150, 10);
        visitorYoung = new Visitor(14, 150, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canPreventYoungYins(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitorOld));
        assertEquals(false, tobaccoStall.isAllowedTo(visitorYoung));
    }

    @Test
    public void canGetRating(){
        assertEquals(0, tobaccoStall.getRating());
    }
}
