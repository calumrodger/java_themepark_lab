package attractions;

import org.junit.Before;
import org.junit.Test;

import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitorTall;
    Visitor visitorShort;
    Visitor visitorOld;
    Visitor visitorYoung;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitorTall = new Visitor(20, 210, 100);
        visitorShort = new Visitor(11, 130, 10);
        visitorOld = new Visitor(20, 150, 10);
        visitorYoung = new Visitor(10, 150, 10);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0);
    }

    @Test
    public void canGetPriceForYoungYin(){
        assertEquals(4.50, dodgems.priceFor(visitorOld), 0);
        assertEquals(2.25, dodgems.priceFor(visitorYoung), 0);
    }
}
