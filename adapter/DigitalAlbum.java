/**
 * Digital album interface that delcares all of the following methods which will
 * be implemented in other classes
 */
public interface DigitalAlbum {
    public String playFromBeginning();
    public String playSong(int num);
    public String prevSong();
    public String nextSong();
    public String stop();
    public String pause();
}
