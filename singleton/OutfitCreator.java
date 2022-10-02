package singleton;
import java.util.ArrayList;
import java.util.Random;
/**
 * Outfit creator class that initializes all the properties of an outfit creator
 * @author Jordyn Anderson
 */
public class OutfitCreator {
    private static OutfitCreator outfitCreator;
    ArrayList<ClothingItem> tops = new ArrayList<ClothingItem>();
    ArrayList<ClothingItem> bottoms = new ArrayList<ClothingItem>();
    ArrayList<ClothingItem> wholes = new ArrayList<ClothingItem>();
    Random rand = new Random();

    /**
     * Creating an outfit creator that reads the files for tops, bottoms, and wholes to store the values into their
     * appropriate array lists
     */
    private OutfitCreator(){    
        tops= FileReader.getClothing("singleton/txt/tops.txt", ClothingPart.TOP);
        bottoms= FileReader.getClothing("singleton/txt/bottoms.txt", ClothingPart.BOTTOM);
        wholes= FileReader.getClothing("singleton/txt/wholes.txt", ClothingPart.WHOLE);
    }

    /**
     * get Instance method that checks whether or not there is an outfit creator. If there is an outfit creator 
     * then that outfit creator is returned, if there is not an outfit creator than one will be made
     * @return outfit Creator
     */
    public static OutfitCreator getInstance()
    {
        if(outfitCreator==null)
        {
            outfitCreator = new OutfitCreator();
        }
        return outfitCreator;
    }

    /**
     * get Outfit method that returns a random outfit to the user. Using the hasSeason method, 
     * the appropriate item of clothing for each season is stored. Then using the random number 
     * generator, a random item from each of the array lists is shown and displayed using the ans string 
     * and the to string method.
     * @return the string 'ans' that returns the appropriate items of clothing
     */
    public String getOutfit(Season season) {
        int rand = (int)(Math.random()*2);
        boolean bool = true;
        String ans = null;
        if(rand == 0)
        {
            while(bool)
            {
                int r1 = (int)(Math.random()*wholes.size());
                 if (wholes.get(r1).hasSeason(season))
                 {
                    bool = false;
                    ans = "A "+wholes.get(r1).toString();
                 }
            }
        }
        else if(rand ==1)
        {
            while(bool)
            {
                int r2 = (int)(Math.random()*bottoms.size());
                int r3 = (int)(Math.random()*tops.size());
                if(bottoms.get(r2).hasSeason(season)&&tops.get(r3).hasSeason(season))
                {
                    bool = false;
                    ans = "A "+tops.get(r3).toString()+"and a "+bottoms.get(r2).toString();
                }
            }
        }
        return ans;
    }

}
