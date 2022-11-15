
public class TV {
    private State state;
    private State homeState;
    private State netflixState;
    private State huluState;

    public TV(){
        this.netflixState = netflixState;
        this.huluState = huluState;
        homeState = new HomeState(this);
        //netflixState = new NetflixState(this);
       // huluState = new HuluState(this);
    }

    public String pressHomeButton() {
        return State.pressHomeButton();
    }

    public String pressNetflixButton() {
        return State.pressNetflixButton();
    }

    public String pressMovieButton() {
        return State.pressMovieButton();
    }

    public String pressHuluButton() {
        return State.pressHuluButton();
    }

    public String pressTVButton() {
        return State.pressTVButton();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getHomeState(){
        return this.homeState;
    }

    public State getNetflixState(){
        return this.netflixState;
    }

    public State getHuluState(){
        return this.huluState;
    }

}
