/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10151847PoeFinal;

/**
 *
 * @author THABISO
 */

import java.util.Scanner;
import javax.swing.JOptionPane;


class UserInfo {
    // declaring my variables
    private int NumberOfTask;
    private String TaskName;
    public int TaskNumber;
    private String Discription;
    private String DeveloperNames;
    private int Duration;
    private int ID;
    private String Status;

    public UserInfo() {
         TaskName = "";
    TaskNumber = 0;
    Discription = "";
    DeveloperNames = "";
    Duration = 0;
    Status = "";
    }

    

    public UserInfo(String TaskName, int TaskNumber, String Discription, String DeveloperNames, int Duration, String Status) {
        this.TaskName = TaskName;
        this.TaskNumber = TaskNumber;
        this.Discription = Discription;
        this.DeveloperNames = DeveloperNames;
        this.Duration = Duration;
        this.Status = Status;
    }

     
    public void setNumberOfTask(int TotalTasks){
        this.NumberOfTask = TotalTasks;
    }
    public int getNumberOfTask(){
        return NumberOfTask;
    }
    public void setTaskName(String TaskName){
        
        this.TaskName = TaskName;
        
    }
    public String getTaskName(){
        return TaskName;
    }
    
    public void setTaskNumber(int TaskNumber){
          this.TaskNumber = TaskNumber;
    }
    public int getTaskNumber(){
        return TaskNumber;
    }
    
    public  void setDiscription(String Discription){
        
        this.Discription = Discription;
        
    }
    public  String getDiscription(){
        return Discription;
    }
    public void setDeveloperNames(String DeveloperNames){
        
        this.DeveloperNames = DeveloperNames;
        
    }
    public String getDeveloperNames(){
        return DeveloperNames;
    }
    
    public void setDuration(int Duration){
        
        this.Duration = Duration;
    }
    public int getDuration(){
        return Duration;
    }
    
     public void setStatus(String Status){
         //creating option and organising the task that needs to be done
        
        this.Status = Status;
        
    }
    public String getStatus(){
        return Status;
    }
    
       
    @Override
    public String toString() {
        return "\n"+getTaskName()+"\t\t"+getStatus()+"\t\t"+getDeveloperNames()+"\t\t"+
               getDiscription()+"\t\t"+ getTaskNumber()+"\t\t"+getDuration();
    }
}

