import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void setUp(){
        themePark = new ThemePark("M&D's");
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 0);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 0);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 0);
        visitor = new Visitor(20, 180, 100);
    }

    @Test
    public void canGetEverything(){
        themePark.addToEverything(dodgems);
        themePark.addToEverything(park);
        themePark.addToEverything(playground);
        themePark.addToEverything(rollerCoaster);
        themePark.addToEverything(candyflossStall);
        themePark.addToEverything(iceCreamStall);
        themePark.addToEverything(tobaccoStall);
        assertEquals(7, themePark.getAllReviewed());
    }

    @Test
    public void canAddToVisitedAttractions(){
        themePark.addToVisitedAttraction(dodgems);
        assertEquals(1, themePark.getVisitedAttractionsSize());
    }

    @Test
    public void canVisit(){
        themePark.visit(visitor, dodgems);
        assertEquals(1, dodgems.getVisitCount());
        assertEquals(1, themePark.getVisitedAttractionsSize());
    }

//    @Test
//    public void hasHashMap(){
//        assertEquals(5, (themePark.reviewsReturn(dodgems).get("Bumper Cars")));
//    }

    @Test
    public void hasHashMap(){
        themePark.addToEverything(dodgems);
        themePark.addToEverything(park);
        themePark.addToEverything(playground);
        themePark.addToEverything(rollerCoaster);
        themePark.addToEverything(candyflossStall);
        themePark.addToEverything(iceCreamStall);
        themePark.addToEverything(tobaccoStall);
        assertEquals(5, themePark.reviewsReturn(dodgems).get("Bumper Cars"));
        assertEquals(9, themePark.reviewsReturn(park).get("Leafy Meadows"));
        assertEquals(7, themePark.reviewsReturn(playground).get("Fun Zone"));
        assertEquals(10, themePark.reviewsReturn(rollerCoaster).get("Blue Ridge"));
        assertEquals(0, themePark.reviewsReturn(candyflossStall).get("Candy Land"));
        assertEquals(0, themePark.reviewsReturn(iceCreamStall).get("Dream Cones"));
        assertEquals(0, themePark.reviewsReturn(tobaccoStall).get("Jacks Drum"));
    }

}
