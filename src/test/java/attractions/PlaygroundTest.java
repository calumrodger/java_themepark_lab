package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorOld;
    Visitor visitorYoung;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitorOld = new Visitor(16, 150, 10);
        visitorYoung = new Visitor(14, 150, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canPreventAuldYins(){
        assertEquals(false, playground.isAllowedTo(visitorOld));
        assertEquals(true, playground.isAllowedTo(visitorYoung));
    }
}
