package singleton;

import java.util.ArrayList;

public class ClothingItem {
    public String name;
    public ClothingPart part;
    public String color;
    ArrayList<Season> seasons = new ArrayList<Season>();

    public ClothingItem(String name, ClothingPart part, String color) {
        this.name = name;
        this.part = part;
        this.color = color;
        seasons = new ArrayList<Season>();
    }

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

    public void addSeason(Season season) {
        seasons.add(season);
    }

    public String toString(){
        return color+" "+name;
    }
}
