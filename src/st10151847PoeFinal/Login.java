
package st10151847PoeFinal;

/**
 *
 * @author THABISO
 */
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Login {
    
    static ArrayList<String> TaskName = new ArrayList<String>();
    static ArrayList<String> taskNumber = new ArrayList<String>();
    static ArrayList<String> taskDescription = new ArrayList<String>();
    static ArrayList<String> developerDetails= new ArrayList<String>();
    static ArrayList<Integer> taskDuration = new ArrayList<Integer>();
    static ArrayList<String> taskID = new ArrayList<String>();
    static ArrayList<String> taskStatus = new ArrayList<String>();
    
    
    
    public boolean checkUserName(){
        
        //check if username contains under score and is less than 5 characters
        if(ST10151847PoeFinal.userName.contains("_") && ST10151847PoeFinal.userName.length()<=5){
            return true;
        }
        else{
            return false;
        }
        //end of if statement
        
 
    }
    
    public boolean checkPasswordComplexity(){
        
    boolean passwordStatus = false;
    boolean length = false;
    boolean number = false;
    boolean specialCharacter = false;
    boolean upperCase = false;
    char ch;
    
    if(ST10151847PoeFinal.password.length() >= 8){
        length = true;
    }
    for(int i =0; i < ST10151847PoeFinal.password.length(); i = i+1 ){
        ch = ST10151847PoeFinal.password.charAt(i);
        
        if(Character.isDigit(ch)){
            number = true;
        }
        if(Character.isUpperCase(ch)){
            upperCase = true;
        }
        if(!Character.isLetterOrDigit(ch)){
             specialCharacter = true;
        }
   
     passwordStatus = specialCharacter && number && length && upperCase;
    }
    return passwordStatus;
    }
    
    public void registerUser(){
    if(checkUserName()){
        JOptionPane.showMessageDialog(null,"USER REGISTRATION \n"
                + "Username successfully captured");
    }
    else{
        JOptionPane.showMessageDialog(null,"Username is not correctly formatted, please ensure that yur username contains"
                + " an underscore and is no more than five characters in leght.");
    }
    if(checkPasswordComplexity()){
        JOptionPane.showMessageDialog(null,"USER REGISTRATION \n"
                + "Password successfully captured");
    }
    else{
        JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure the passwprd"
                + " cntains at least 8 char, a cap letter, a number and a special char");
    }
 }
    
 boolean loginUser(){
    String username2;
    String password2;
   
     username2 = JOptionPane.showInputDialog("USER LOGIN \n"
             + "Enter Username: ");
     
      password2 = JOptionPane.showInputDialog("USER LOGIN \n"
              + "Enter Password");
   
     
    if(ST10151847PoeFinal.userName.equals(username2)&&ST10151847PoeFinal.password.equals(password2)){
        return true;
    }
    else{
        return false;
    }
 } 

public String returnLoginStatus(){
    if(loginUser()){
        return "Thank you \n"
                + "" + ST10151847PoeFinal.firstName + " " + ST10151847PoeFinal.surname + "\n"
                + "YOU HAVE SUCCESFULLY LOGIN ";
    }
    else{
        return "Username or password incorrect, please try again.";
    }
}

   public ArrayList<String> getTaskName() {
        return TaskName;
    }
   
     public ArrayList<String> getDeveloperDetails() {
        return developerDetails;
    }
    

   public String searchTask(String taskName){
        String message = "";
        
        boolean isFound = false;
        for(int count = 0 ; count < getTaskName().size(); count ++){
            if(taskName.equalsIgnoreCase(getTaskName().get(count))){
                message = getDeveloperDetails().get(count) + ", " + getTaskName().get(count);
                isFound = true;
                break;
            }
        }
        
        if (!isFound) {
           message = taskName+" is not found in the record set.";
       }
        return message;
        
    }
    

}