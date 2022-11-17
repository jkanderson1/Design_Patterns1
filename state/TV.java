/**
 * TV class that holds all of the properties of a TV
 * @author Jordyn Anderson
 */
public class TV {
    private State state;
    private State homeState;
    private State netflixState;
    private State huluState;

    /**
     * Television constructor that declares all of the states
     * and sets the initial state to home
     */
    public TV(){
        state = homeState;
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);
        state = new HomeState(this);
    }

    /**
     * press home buttom method that returns the apropriate string 
     * when the home button is pressed in each state 
     * @return press home button method string 
     */
    public String pressHomeButton() {
        return state.pressHomeButton();
    }

    /**
     * press netflix buttom method that returns the apropriate string 
     * when the netflix button is pressed in each state 
     * @return press homnetflix button method string 
     */
    public String pressNetflixButton() {
        return state.pressNetflixButton();
    }

    /**
     * press movie buttom method that returns the apropriate string 
     * when the movie button is pressed in each state 
     * @return press home movie method string 
     */
    public String pressMovieButton() {
        return this.state.pressMovieButton();
    }

    /**
     * press hulu buttom method that returns the apropriate string 
     * when the hulu button is pressed in each state 
     * @return press hulu button method string 
     */
    public String pressHuluButton() {
        return state.pressHuluButton();
    }

    /**
     * press tv buttom method that returns the apropriate string 
     * when the tv button is pressed in each state 
     * @return press tv button method string 
     */
    public String pressTVButton() {
        return this.state.pressTVButton();
    }

    /**
     * Set state method that changes the current state
     * @param state
     */
    public void setState(State state){
        this.state = state;
    }

    /**
     * get Home state method that accesses the home state
     * @return homeState
     */
    public State getHomeState(){
        return homeState;
    }

    /**
     * get Netflix state method that accesses the netflix state
     * @return netflix State
     */
    public State getNetflixState(){
        return netflixState;
    }

    /**
     * get hulu state method that accesses the hulu state
     * @return hulu State
     */
    public State getHuluState(){
        return huluState;
    }

}
