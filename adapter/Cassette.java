import java.util.ArrayList;
/**
 * Cassette class that implements the analog album class 
 */
public class Cassette implements AnalogAlbum {
    //initializing the necessary variables for the class
    int currentIndex = 0;
    ArrayList<String> songs = new ArrayList<String>();
    /**
     * Instance of Cassette
     * @param songs
     */
    public Cassette(ArrayList<String>songs) {
        this.songs = songs;
    }
    /**
     * play method that returns the appropriate strings to tell the user which song is playing according
     * to the current index
     * @return String
     */
    public String play(){
        if((songs.size() +1) - currentIndex == 0)
        {
            currentIndex++;
            return "At the end of the cassette you need to rewind";
        }
        else 
            return "Playing song "+currentIndex+ ":" +songs.get(currentIndex);
    }
    /**
     * rewind method that that informs the user that the song is rewinding according to the current index
     * @return String
     */
    public String rewind(){
        currentIndex--;
        return "Rewinding to song number " + (currentIndex);
    }
    /**
     * Fast forward method that returns a string that informs the user that the tape is fast forwarding
     * according to the current index
     * @return String
     */
    public String ffwd(){
        if((songs.size() +1) - (currentIndex -1) == 0)
        {
            currentIndex = (songs.size() -1);
            return "Fowarded to the end of the cassette";
        }
        else 
            return "Forward to song "+(currentIndex+1);
    }
    /**
     * Pause string that informs the user that the tape will be pausing
     * @return String
     */
    public String pause(){
        return "pausing...";
    }
    /**
     * Stop Eject method that informs the user that the cassette will be ejecting
     * @return String
     */
    public String stopEject(){
        return "Stopping cassette and ejecting";
    } 

}
