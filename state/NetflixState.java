public class NetflixState implements State {
    
    private TV tv;
    private String[] movies = new String[] {
        "The land before time",
        "Frozen",
        "The Little Mermaid",
        "Ice Age"
    };
    private String[] tvShows = new String[] {
        "Peppa Pig",
        "My Little Pony",
        "Garfield",
        "Teenage Mutant Ninja Turtles"
    };

    public NetflixState(TV tv){
        tv.setState(tv.getNetflixState());
        this.tv = tv;
    }

    public String pressHomeButton(){
        tv.setState(tv.getHomeState());
        return "returning to the home page";
    }

    public String pressNetflixButton(){
        return "You are already on Netflix";
    }

    public String pressHuluButton(){
        tv.setState(tv.getHuluState());
        return "You pressed the Hulu button";
    }

    public String pressMovieButton(){
        return movies.toString();
    }

    public String pressTVButton(){
        return tvShows.toString();
    }
}
