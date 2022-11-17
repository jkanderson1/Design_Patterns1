/**
 * HomeState class that implements state giving it all of the properties stored in the state class 
 * @author Jordyn Anderson
 */
public class HomeState implements State {
    //creating an instance of TV named tv
    private TV tv;
    

    //Creating an instance of homestate 
    public HomeState(TV tv){
        tv.setState(tv.getHomeState());
        this.tv = tv;
    }

    /**
     * press home button method that returns the the string to show the 
     * user that they are already on the home page
     * @return String 
     */
    public String pressHomeButton(){
        tv.setState(tv.getHomeState());
        return "You are on the Home page";
    }

    /**
     * press Netflix button method that changes the state to the netflix state and 
     * and shows the user that they have pressed the netflix button
     * @return String
     */
    public String pressNetflixButton(){
        tv.setState(tv.getNetflixState());
        return "You pressed the Netflix button";
    }

    /**
     * press hulu button method that changes the state to the hulu state and 
     * shows the user that they have pressed the hulu button 
     * @return String 
     */
    public String pressHuluButton(){
        tv.setState(tv.getHuluState());
        return "You pressed the Hulu button";
    }

    /**
     * press Movie button method that displays a string showing the user
     *  that they cannot view movies from the home page
     * @return String 
     */
    public String pressMovieButton(){
        return "You cannot view movies from home";
    }

    /**
     * press TV button method that displays a string showing the user
     * that they cannot view tv shows from the home page
     * @return String 
     */
    public String pressTVButton(){
        return "You cannot view TV shows from home";
    }

}
