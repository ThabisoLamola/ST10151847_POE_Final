
package st10151847PoeFinal;

import javax.swing.JOptionPane;
/**
 *
 * @author THABISO
 */
public class Task {
    //creating our objects
    
    UserInfo taskinput = new UserInfo();
    
    public boolean checkTaskDescription(){
        if(taskinput.getDiscription().length()<=50){
            return true;
        }
        else {
            return false;
        }
    }
    
       
}
