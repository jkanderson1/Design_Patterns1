public class HomeState implements State {
    private TV tv;

    public HomeState(TV tv){
        this.tv = tv;
    }

    public String pressHomeButton(){
        tv.setState(tv.getHomeState());
        return "You are on the Home page";
    }

    public String pressNetflixButton(){
        tv.setState(tv.getNetflixState());
        return "You pressed the Netflix button";
    }

    public String pressHuluButton(){
        tv.setState(tv.getHuluState());
        return "You pressed the Hulu button";
    }

    public String pressMovieButton(){
        return "You cannot view movies from home";
    }

    public String pressTVButton(){
        return "You cannot view TV shows from home";
    }

}
