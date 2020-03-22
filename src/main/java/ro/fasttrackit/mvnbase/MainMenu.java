package ro.fasttrackit.mvnbase;

import ro.fasttrackit.mvnbase.DailyPlanner;
import ro.fasttrackit.mvnbase.Days;

import java.util.Map;
import java.util.Scanner;

public class MainMenu {


    private final DailyPlanner planner;

    public MainMenu(DailyPlanner planner) {
        this.planner = planner;
    }

    public void run() throws NoActivityForDayException {
        int input;
        do {
            printMainMenu();
            input = getInput();
            executeInput(input);
        } while (input != 0);
    }


    private void printMainMenu() {
        System.out.println("===============================");
        System.out.println("[1]List all current activities for a day ");
        System.out.println("[2]Add activity");
        System.out.println("[3]Lazy ? Remove an activity");
        System.out.println("[4]End Planning ---- not working");
        System.out.println("[0]Exit");
        System.out.println("===============================");
    }

    public int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your option");
        return scanner.nextInt();
    }

    public void executeInput(int input) throws NoActivityForDayException {
        switch (input) {

            case 1:
                handleGetActivitiesForDay();
                break;
            case 2:
                handleAddActivity();
                break;
            case 3:
                handleRemoveActivity();
                break;
            case 4:
               //  handelEndPlanning();
                break;
            case 0:
                break;
            default:
                System.out.println("Wrong Input");

        }
    }

    private void handleGetActivitiesForDay() {
        System.out.println("What day you want to see?");
        System.out.println("[1]Monday");
        System.out.println("[2]Tuesday");
        System.out.println("[3]Wednesday");
        System.out.println("[4]Thursday");
        System.out.println("[5]Friday");
        System.out.println("[6]Saturday");
        System.out.println("[7]Sunday");
        int input = new Scanner(System.in).nextInt();
        switch (input) {
            case 1:
                System.out.println(planner.getActivities(Days.MONDAY));
                break;
            case 2:
                System.out.println(planner.getActivities(Days.TUESDAY));
                break;
            case 3:
                System.out.println(planner.getActivities(Days.WEDNESDAY));

                break;
            case 4:
                System.out.println(planner.getActivities(Days.THURSDAY));

                break;
            case 5:
                System.out.println(planner.getActivities(Days.FRIDAY));

                break;
            case 6:
                System.out.println(planner.getActivities(Days.SATURDAY));

                break;
            case 7:
                System.out.println(planner.getActivities(Days.SUNDAY));
            default:
                System.out.println("This Day does not exist");

        }


    }

    private void handleAddActivity() {

        System.out.println("In what day you want to add activity?");
        System.out.println("[1]Monday");
        System.out.println("[2]Tuesday");
        System.out.println("[3]Wednesday");
        System.out.println("[4]Thursday");
        System.out.println("[5]Friday <--------- Select this one ");
        System.out.println("[6]Saturday");
        System.out.println("[7]Sunday");
        int input = new Scanner(System.in).nextInt();
        switch (input) {
            case 1:

                planner.getActivities(Days.MONDAY);
                System.out.println("What you'd like to do on Monday ?");
                Scanner scanner = new Scanner(System.in);
                String answer = scanner.nextLine();
                planner.addActivity(Days.MONDAY, answer);

                break;
            case 2:

                planner.getActivities(Days.TUESDAY);
                System.out.println("What you'd like to do on Tuesday?");
                Scanner s2 = new Scanner(System.in);
                String answer2 = s2.nextLine();
                planner.addActivity(Days.TUESDAY, answer2);

                break;
            case 3:
                planner.getActivities(Days.WEDNESDAY);
                System.out.println("What you'd like to do on Wednesday?");
                Scanner s3 = new Scanner(System.in);
                String answer3 = s3.nextLine();
                planner.addActivity(Days.WEDNESDAY, answer3);

                break;
            case 4:
                planner.getActivities(Days.THURSDAY);

                System.out.println("What you'd like to do on Thursday?");
                Scanner s4 = new Scanner(System.in);
                String answer4 = s4.nextLine();
                planner.addActivity(Days.THURSDAY, answer4);

                break;
            case 5:
                planner.getActivities(Days.FRIDAY);

                System.out.println("What you'd like to do on Friday Because its Friday you ain't got no job and you ain't got no shit to do ..?");
                Scanner s5 = new Scanner(System.in);
                String answer5 = s5.nextLine();
                planner.addActivity(Days.FRIDAY, answer5);

                break;
            case 6:
                planner.getActivities(Days.SATURDAY);
                System.out.println(" #STAY HOME!!");

                break;
            case 7:
                planner.getActivities(Days.SUNDAY);
                System.out.println(" #STAY HOME!!!");
            default:
                System.out.println("There's only 7 days in a week duh !");


        }


    }

    public void handleRemoveActivity() {

        System.out.println("Your lazy ??  DELETE activity from a day!!");
        System.out.println("[1]Monday");
        System.out.println("[2]Tuesday");
        System.out.println("[3]Wednesday");
        System.out.println("[4]Thursday");
        System.out.println("[5]Friday ");
        System.out.println("[6]Saturday");
        System.out.println("[7]Sunday");
        int input = new Scanner(System.in).nextInt();

            switch (input) {
                case 1:
                    System.out.println(planner.getActivities(Days.MONDAY));
                    System.out.println("What activity you want to delete?");
                    Scanner s1 = new Scanner(System.in);
                    String answer1 = s1.nextLine();
                    planner.removeActivity(Days.MONDAY,answer1);
                    break;
                case 2:
                    System.out.println(planner.getActivities(Days.TUESDAY));
                    System.out.println("What activity you want to delete?");
                    Scanner s2 = new Scanner(System.in);
                    String answer2 = s2.nextLine();
                    planner.removeActivity(Days.TUESDAY,answer2);
                    break;
                case 3:
                    System.out.println(planner.getActivities(Days.WEDNESDAY));
                    System.out.println("What activity you want to delete?");
                    Scanner s3 = new Scanner(System.in);
                    String answer3 = s3.nextLine();
                    planner.removeActivity(Days.WEDNESDAY,answer3);
                    break;
                case 4:
                    System.out.println(planner.getActivities(Days.THURSDAY));
                    System.out.println("What activity you want to delete?");
                    Scanner s4 = new Scanner(System.in);
                    String answer4 = s4.nextLine();
                    planner.removeActivity(Days.THURSDAY,answer4);
                    break;
                case 5:
                    System.out.println(planner.getActivities(Days.FRIDAY));
                    System.out.println("What activity you want to delete?");
                    Scanner s5 = new Scanner(System.in);
                    String answer5 = s5.nextLine();
                    planner.removeActivity(Days.MONDAY,answer5);
                    break;
                case 6:
                    System.out.println(planner.getActivities(Days.SATURDAY));
                    System.out.println("Stay home");
                    break;
                case 7:
                    System.out.println(planner.getActivities(Days.SUNDAY));
                    System.out.println("Stay home");
                default:
                    System.out.println("This Day does not exist");

            }



        }
      //public void handelEndPlanning() throws NoActivityForDayException {





      //  }

    }
