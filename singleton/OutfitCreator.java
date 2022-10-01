package singleton;
import java.util.ArrayList;
import java.util.Random;

public class OutfitCreator {
    private static OutfitCreator outfitCreator;
    ArrayList<ClothingItem> tops = new ArrayList<ClothingItem>();
    ArrayList<ClothingItem> bottoms = new ArrayList<ClothingItem>();
    ArrayList<ClothingItem> wholes = new ArrayList<ClothingItem>();
    Random rand = new Random();

    private OutfitCreator(){    
        tops= FileReader.getClothing("singleton/txt/tops.txt", ClothingPart.TOP);
        bottoms= FileReader.getClothing("singleton/txt/bottoms.txt", ClothingPart.BOTTOM);
        wholes= FileReader.getClothing("singleton/txt/wholes.txt", ClothingPart.WHOLE);
    }

    public static OutfitCreator getInstance()
    {
        if(outfitCreator==null)
        {
            outfitCreator = new OutfitCreator();
        }
        return outfitCreator;
    }

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
