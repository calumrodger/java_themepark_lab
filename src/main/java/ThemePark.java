import attractions.Attraction;
import behaviours.IReviewed;
import behaviours.ISecurity;
import org.w3c.dom.Attr;
import people.Visitor;
import stalls.Stall;

import java.util.*;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> visitedAttractions;
    private ArrayList<IReviewed> everything;
    private HashMap<String, Integer> reviews;
    private ArrayList<IReviewed> clearances;
    private ISecurity check;

    public ThemePark(String name, ISecurity check) {
        this.everything = new ArrayList<IReviewed>();
        this.visitedAttractions = new ArrayList<>();
        this.reviews = new HashMap<String, Integer>();
        this.clearances = new ArrayList<>();
        this.name = name;
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<IReviewed> getEverything() {
        return everything;
    }

    public void setEverything(ArrayList<IReviewed> everything) {
        this.everything = everything;
    }

    public int getAllReviewed(){
        return this.everything.size();
    }

    public int getAllClearancesSize(){
        return this.clearances.size();
    }

    public void addToEverything(IReviewed place){
        this.everything.add(place);
    }

    public ArrayList<Attraction> getVisitedAttractions() {
        return visitedAttractions;
    }

    public void addToVisitedAttraction(Attraction attraction){
        this.visitedAttractions.add(attraction);
    }

    public void setVisitedAttractions(ArrayList<Attraction> visitedAttractions) {
        this.visitedAttractions = visitedAttractions;
    }

    public int getVisitedAttractionsSize(){
        return this.visitedAttractions.size();
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.incrementVisitCount();
        this.visitedAttractions.add(attraction);
    }

    public HashMap reviewsReturn(IReviewed review){
        for (int i = 0; i < this.getAllReviewed(); i++) {
            reviews.put(review.getName(), review.getRating());
        }
        return reviews;
    }

    public ArrayList getAllClearances(Visitor visitor, ISecurity check){
        for (int i = 0; i < this.getAllReviewed(); i++) {
            if(review.isAllowedTo(visitor));
            } clearances.add(check);
        return clearances;
    }


}
