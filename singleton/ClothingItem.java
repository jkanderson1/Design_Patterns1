package singleton;

import java.util.ArrayList;

/**
 * Clothing item class that stores all the necessary properties for a clothing item
 * @author Jordyn Anderson
 */
public class ClothingItem {
    public String name;
    public ClothingPart part;
    public String color;
    ArrayList<Season> seasons = new ArrayList<Season>();
    //Saving each season in an array list of type season 

    /**
     * Clothing item which saves each property for the clothing items
     * @param name
     * @param part
     * @param color
     */
    public ClothingItem(String name, ClothingPart part, String color) {
        this.name = name;
        this.part = part;
        this.color = color;
        seasons = new ArrayList<Season>();
    }

    /**
     * has season method that checks the season of each item in the array list
     * @param season
     * @return true or false
     */
    public boolean hasSeason(Season season) {
        boolean ans = false;
        for(int i=0; i<this.seasons.size();i++)
        {
            if(this.seasons.get(i)==season)
            {
                ans = true;
                break;
            }
        }
        return ans;
    }

    /**
     * add season method that adds a season to the array list of seasons
     * @param season
     */
    public void addSeason(Season season) {
        seasons.add(season);
    }

    /**
     * to String that prints out the color and name of each clothing item
     * @return String
     */
    public String toString(){
        return color+" "+name;
    }
}
