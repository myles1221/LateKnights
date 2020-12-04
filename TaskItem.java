import java.util.Date;
import java.util.Scanner;

public abstract class TaskItem{
    private static Scanner TheScanVariable;
    String taskTitle;
    String description;
    static String completeDate;



    /*task list shall contain an item
    task item shall contain a title
        title must be 1< in length
    task item shall contain a description
        description must be 0=< characters in length
    task item shall contain a due date
        due date shall be in format YYYY-MM-DD
     */

    // create the item
    protected String TaskItem(){
        this.taskTitle = taskTitle;
        this.description = description;
        //this.date = date;
        return taskTitle;
    }

    protected static String inputDate(){
        System.out.println("Enter year");
        Scanner yearDate = new Scanner(System.in);
        Scanner monDate = new Scanner(System.in);
        Scanner dayDate = new Scanner(System.in);
        completeDate = "Date entered:" + yearDate + "/" + monDate + "/" + dayDate;
        return completeDate;
    }

    protected static String inputNumber(){
        Scanner firstThree = new Scanner(System.in);
        Scanner midThree = new Scanner(System.in);
        Scanner lastFour = new Scanner(System.in);
        String num =  firstThree + "-" + midThree + "-" + lastFour; //concatonate all strings
        return num;
    }




}
