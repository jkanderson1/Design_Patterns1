
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
        state.pressHomeButton();
        return "Loading the Home Screen...";
    }

    public String pressNetflixButton() {
        state.pressNetflixButton();
        return "Loading Netflix...";
    }

    public String pressMovieButton() {
        state.pressMovieButton();
        return "Loading movies...";
    }

    public String pressHuluButton() {
        state.pressHuluButton();
        return "Loading Hulu...";
    }

    public String pressTVButton() {
        state.pressTVButton();
        return "Loading TV...";
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
