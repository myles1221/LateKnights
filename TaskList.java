import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;


public class TaskList extends TaskItem {
    private static ArrayList<String> varTaskList = new ArrayList<String>();
    private static ArrayList<String> completedTaskList = new ArrayList<String>();
    private static ArrayList<String> uncompletedTaskList = new ArrayList<String>();
    private static ArrayList<String> taskshortDescriptionList = new ArrayList<String>();
    private static ArrayList<String> dueDateTaskList = new ArrayList<String>();
        //there is one more we missing...
    static int indexOfComplete;
    //take items from TaskItem and create txt file
    LocalDate dueDate;

    public void main() {
        final Formatter x;
        try {
            x = new Formatter("test.txt");
        } catch (Exception e) {
            System.out.println("There was an error");
        }
    }

    protected static void taskList() {
        System.out.println(varTaskList);
    }

    protected void dueDate(String dueDate) {
        this.dueDate = LocalDate.parse(dueDate);
    }
    public static int taskMenu(int pink) {
        try {
            System.out.println("(1)Create new list\n(2)Load existing list\n(3)Quit \n");
            Scanner InputScan = new Scanner(System.in); //scanner for user
            int moreInput = InputScan.nextInt(); //convert scanner to string
            switch (moreInput) {
                case 1:
                    //create new list code
                    System.out.println("You selected: Create new list\n");
                    //send user into submenu
                    pink = 1;
                    return pink;
                case 2:
                    //load existing list
                    System.out.println("You Selected: Load existing list\n");
                    taskMenu(pink);
                    pink = 2;
                    return pink;
                case 3:
                    //quit program
                    System.out.println("Exiting program...");
                    pink = 0;
                    return pink;
                default:
                    System.out.println("Enter a number 1-3");
                    taskMenu(pink);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. \n\nEnter a number 1-3.");
            taskMenu(pink);
        }
        return pink;
    }





    protected static void saveText(){
        System.out.println("Enter filename: \n");
        try{
            Scanner nameOfFile = new Scanner(System.in);
            String FileNameIs = nameOfFile.nextLine();
            FileNameIs = System.getProperty("user.dir") + "\\" + nameOfFile.nextLine();
            new FileWriter(FileNameIs, true);
            //array list for file names ?
        }catch(Exception j){
            System.out.println("What should i put here?");
        }
    }

    public static void viewFunction() {
        //view current task list

        String viewTaskList = "current contact list: \n";
        for (int i = 1; i < varTaskList.size(); i++) {
            System.out.print("(" + i + ")" + varTaskList.get(i) + "\n");
        }
        System.out.println("completed:" + completedTaskList + "\n");
        System.out.print("uncompleted:" + uncompletedTaskList);
        System.out.println("Short description:" + taskshortDescriptionList + "\n");

    }

    /*task list shall contain an item
    task item shall contain a title
        title must be 1< in length
    task item shall contain a description
        description must be 0=< characters in length
    task item shall contain a due date
        due date shall be in format YYYY-MM-DD

     */
    static void editFunction() {

        System.out.println("Edit first name, last name, phone number, or description? \n(1)First Name\n(2)Last Name\n(3)Phone Number\n(4)Short Description\n");
        Scanner index = new Scanner(System.in);
        int theIndex = index.nextInt();
        Scanner newTaskTitle = new Scanner(System.in);
        String newTitle = newTaskTitle.nextLine();
        Scanner nDesc = new Scanner(System.in);
        String newDesc = nDesc.nextLine();
        varTaskList.set(theIndex, newTitle);
        taskshortDescriptionList.set(theIndex, newDesc);
    }

    static void addTaskFunction() {
        //add to file
        String descTask, titleTask;

        System.out.println("Task Name: \n");
        Scanner scan1 = new Scanner(System.in);
        titleTask = scan1.nextLine();
        System.out.println("Due date:\n");
        String dueDateofTask = inputDate();
        dueDateTaskList.add(inputDate());
        varTaskList.add(titleTask);

    }

    static void rmTaskFunction() {
        //removing something from the file
        System.out.println("Select Item to remove: \n");
        System.out.println(varTaskList);
        Scanner rmItem = new Scanner(System.in);
        int indexOfrmItem = rmItem.nextInt();
        varTaskList.remove(indexOfrmItem);
        dueDateTaskList.remove((indexOfrmItem));
        //print item at index being removed
    }

    public static int unmarkFunction(int indexOfCurrentTask) {
        //show list of unmarked and list of marked
        String completionMark = "$$$$$";
        uncompletedTaskList.remove(indexOfCurrentTask);
        System.out.println("Item removed.\ncurrent Task List:" + uncompletedTaskList);
        int i, j;
        //for(j = 0; j < getObjectSize.completedTasks; j++)//for loops to print out uncompleted tasks
        //for(i = 0; i < sizeOf.completedTasks; i++) //for loops to print out completed tasks
        return  indexOfCurrentTask;
    }

    static void markAsCompleted() {
        System.out.println("Enter index of completed task:\n");
        Scanner completed = new Scanner(System.in);
        indexOfComplete = completed.nextInt();
        String completedTask = varTaskList(indexOfComplete);
        completedTaskList.add(completedTask);
        System.out.println(completedTaskList);
    }

    private static String varTaskList(int indexOfComplete) {
        return varTaskList(indexOfComplete);
    }

    public static boolean theCompletedTaskList(){
        System.out.println("********** completed *********\n\n" + completedTaskList + "\n\n***************************");
        return false;
    }
}
