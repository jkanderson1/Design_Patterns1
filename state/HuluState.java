public class HuluState {
    
    private TV tv;
    private String[] movies = new String[] {
        "Cars",
        "Cinderella",
        "Wall-E",
        "ET"
    };
    private String[] tvShows = new String[] {
        "Sesame Street",
        "Care Bears",
        "Looney Toons"
    };

    public HuluState(TV tv){
        this.tv = tv;
    }

    public String pressHomeButton(){
        tv.setState(tv.getHomeState());
        return "returning to the home page";
    }

    public String pressNetflixButton(){
        tv.setState(tv.getNetflixState());
        return "You pressed the Netflix button";
    }

    public String pressHuluButton(){
        return "You are already on Hulu";
    }

    public String[] pressMovieButton(){
        return movies;
    }

    public String[] pressTVButton(){
        return tvShows;
    }



}
