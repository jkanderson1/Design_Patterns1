/**
 * Analog Adapter class that implements the analog album class 
 */
public class AnalogAdapter implements AnalogAlbum {
    //instance of digital album named album
    private DigitalAlbum album;

    /**
     * Instance of Analog Adapter 
     * @param album
     */
    public AnalogAdapter(DigitalAlbum album){
        this.album = album;
    }
    /**
     * Play method that calls the play song method from the digital album class 
     */
    public String play(){
        return album.playSong(0);
    }
    /**
     * Rewind method that calls the prev song method from the digital album class 
     */
    public String rewind(){
        return album.prevSong();
    }
    /**
     * Fast Forward method that calls the next song method from the digital album class 
     */
    public String ffwd(){
        return album.nextSong();
    }
    /**
     * Pause method that calls the pause method from the digital album class 
     */
    public String pause(){
        return album.pause();
    }
    /**
     * Stop eject method that calls the stop method from the digital album class 
     */
    public String stopEject(){
        return album.stop();
    }
}
