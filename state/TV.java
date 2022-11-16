
public class TV {
    private State state;
    private State homeState;
    private State netflixState;
    private State huluState;

    public TV(){
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);
    }

    public String pressHomeButton() {
        state.pressHomeButton();
        return "Loading Home screen...";
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
       return "Loading tv shows...";
    }

    public void setState(State state){
        this.state = state;
    }

    public State getHomeState(){
        return homeState;
    }

    public State getNetflixState(){
        return netflixState;
    }

    public State getHuluState(){
        return huluState;
    }

}
