package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorTall = new Visitor(20, 210, 100);
    Visitor visitorShort = new Visitor(11, 130, 10);

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitorTall = new Visitor(20, 210, 100);
        visitorShort = new Visitor(11, 130, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0);
    }

    @Test
    public void canGetPriceForTallYin(){
        assertEquals(16.80, rollerCoaster.priceFor(visitorTall), 0);
        assertEquals(8.40, rollerCoaster.priceFor(visitorShort), 0);
    }
}
