package ro.fasttrackit.mvnbase;

public class Main {

    public static void main(String[] args) throws NoActivityForDayException {
        DailyPlanner planner= new DailyPlanner();
        MainMenu menu=new MainMenu(planner);
        menu.run();



    }
}