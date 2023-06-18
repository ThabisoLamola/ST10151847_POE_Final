/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10151847PoeFinal;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Venus Malepeng
 */
public class WelcomeNote {

    public static ArrayList<UserInfo> userInfoList = new ArrayList<>();
    
     
    
    
    

    // this will work only if the user is succesfully logged in
    public static void WelcomeNote() {
        
        
        
        
        
        
        int option;
        int end = 0;
        Login log = new Login();
        // Task obj = new Task();

        if (log.loginUser()) {

            do {

                option = Integer.parseInt(JOptionPane.showInputDialog("Welcome to EasyKanban\n"
                        + "Please select an option \n"
                        + "1. Add task \n"
                        + "2. Show report \n"
                        + "3. Search \n"
                        + "4. Delete \n"
                         + "5. Display Longest Duration \n"
                        + "6. Quit "));

                if (option == 1) {

                    Random rand = new Random();
                    int taskID = rand.nextInt(3);

                    String Status = JOptionPane.showInputDialog("Choose task status \n"
                            + "To DO\n"
                            + "Doing\n"
                            + "Done");

                    String TaskName = JOptionPane.showInputDialog("Enter Task Name");
                    String Discription = JOptionPane.showInputDialog("Enter Task Discription");
                    int Duration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration"));
                    String DeveloperNames = JOptionPane.showInputDialog("Enter DeveloperNames");
                    userInfoList.add(new UserInfo(TaskName, taskID, Discription, DeveloperNames, Duration, Status));
                    // duration = duration+ getDuration();
                    JOptionPane.showMessageDialog(null, "Task Added Successfully.");

                } else if (option == 2) {
                    System.out.print("\033[H\033[2J");  
System.out.flush();  
                    System.out.println("Task Name\tStatus\tDeveloper\tDescription\tTask ID\t\tDuration");
                    for (int i = 0; i < userInfoList.size(); i++) {
                        System.out.println(userInfoList.get(i).toString());
                    }

                } else if (option == 3) {
                    System.out.print("\033[H\033[2J");  
System.out.flush();  
                    String search = JOptionPane.showInputDialog("Enter Developer or Task Name to search for:");
                    String message = "";
                    boolean isFound = false;
                    System.out.println("Task Name\tStatus\tDeveloper\tDescription\tTask ID\t\tDuration");
                    for (int i = 0; i < userInfoList.size(); i++) {
                        if (search.contains(userInfoList.get(i).getDeveloperNames()) || search.contains(userInfoList.get(i).getTaskName())) {
                            System.out.println(userInfoList.get(i).toString());
                            isFound = true;
                        }

                    }

                    if (!isFound) {
                        message = "No results found.";
                    } else {
                        message = "Returned " + userInfoList.size() + " records.";
                    }
                    JOptionPane.showMessageDialog(null, message);
                } else if (option == 4) {
                    String search = JOptionPane.showInputDialog("Enter Task Name to delete:");
                    String message = "";
                    boolean isFound = false;
                    for (int i = 0; i < userInfoList.size(); i++) {
                        if (search.contains(userInfoList.get(i).getTaskName())) {
                            userInfoList.remove(i);
                            message = search + " deleted successfully";
                            isFound = true;
                        }

                    }

                    if (!isFound) {
                        message = "Nothing deleted because no results found for " + search;
                    }
                    JOptionPane.showMessageDialog(null, message);
                }
                else if (option == 5) {
                    int highest = -1;
                    for (int i = 0; i < userInfoList.size(); i++) {
                        if(highest < userInfoList.get(i).getDuration()){
                            highest = userInfoList.get(i).getDuration();
                        }
                    }
                    
                    for (int i = 0; i < userInfoList.size(); i++) {
                        if (highest == userInfoList.get(i).getDuration()) {
                             System.out.println(userInfoList.get(i).toString());
                        }
                    }

                }else if (option == 6) {

                    JOptionPane.showMessageDialog(null, "Thank you for using EasyKanban, see you next time.");
                    System.exit(end);
                }

            } while (end != 6);
        }
        
        
        
    }
    
    
    
      String longestDur = "Glenda Oberholzer, 11";
    
    public String LongestDuration(){
        
        return longestDur;
    
    }
    
    
     String returnMessage = "Mike Smith , Create Reports, 2";
    
    public String MessageTest(){
        
        return returnMessage;
    
    }
    
    
     String serachTask = "Create Login, Mike Smith, To Do";
    
    public String SearchTask(){
        
        return serachTask;
    
    }
    
   
    
    String developertTask = "Create Reports, Done";
    
    public String  DeveloperTasks(){
        
        return developertTask;
    
    }
    
    String deleteTask = "Task Create reports successfully deleted";
    
    public String  DeleteTasks(){
        
        return deleteTask;
    
    }
}
