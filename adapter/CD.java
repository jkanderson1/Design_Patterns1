import java.util.ArrayList;
/**
 * CD class that implements the digital album interface
 */
public class CD implements DigitalAlbum {
    int currentIndex = 0;
    ArrayList<String> songs = new ArrayList<String>();

    /**
     * Instance of CD
     * @param songs
     */
    public CD(ArrayList<String> songs) {
        this.songs = songs;
    }

    /**
     * play from beginning method that plays the tape from the beggining and returns a string to inform the user
     * of the current song that is plahing 
     * @return string
     */
    public String playFromBeginning() {
        currentIndex++;
        return "Playing song 1: "+songs.get(currentIndex);
    }
    /**
     * play song method that plays a specific song and returns a string to inform the user
     * @param num
     * @return String
     */
    public String playSong(int num) {
        currentIndex = num;
        if(currentIndex>=0 && currentIndex<= songs.size()){
            currentIndex++;
           return "Playing: " +currentIndex+": "+songs.get(currentIndex);
        }
        else {
            return "Not a valid number";
        }
    }
    /**
     * prev song method that returns a string to inform the user of the song that is playing 
     * and changes the state
     */
    public String prevSong() {
        if(currentIndex>0){
            currentIndex --;
            return "Skipping back and playing: "+songs.get(currentIndex);
        }
        else if(currentIndex ==1)
        {
            return "Play "+songs.get(currentIndex);
        }
        else
        return "";
    }
    /**
     * next song method that changes the current index and returns a string to inform the user of the song that is playing
     * @return String 
     */
    public String nextSong() {
        if(currentIndex<songs.size()){
            currentIndex++;
            return "Playing: "+(currentIndex +1)+": "+songs.get(currentIndex);
        }
        else if(currentIndex == songs.size())
        {
            return "Playing: "+(currentIndex)+": "+songs.get(currentIndex);
        }
        return "";
    }
    /**
     * stop method that returns a string to tell the user that the tape is stopping
     * @return String
     */
    public String stop() {
        return "Stopping";
    }
     /**
     * Pause method that returns a string to tell the user that the tape is pausing
     * @return String
     */
    public String pause() {
        return "Pausing";
    }

}
