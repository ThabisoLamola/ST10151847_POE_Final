/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10151847PoeFinal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Venus Malepeng
 */
public class POETest {
    
    public POETest() {
    }
    
    POE  message = new POE ();
     
     public void testManipulateArrays(String[] dev, String[] t_name, String[] id,String[] status, int[] duration) {
        dev = new String[]{"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        t_name = new String[]{"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        id = new String[]{};
        status = new String[]{"To Do", "Doing", "Done", "To Do"};
        duration = new int[]{5, 8, 2, 11};
       
        //finalPOE.testManipulateArrays(dev, t_name, id, status, duration);
                //userInfoList(dev, t_name, id, status, duration);
        
    }
     
     

    
    @Test
     public void testDoneTasks() {
        String expected = "Mike Smith , Create Reports, 2";
       
        String actual = message.MessageTest();
        assertEquals(expected, actual);
    }
     
  
     @Test
      public void testLongestTask() {
        String expected = "Glenda Oberholzer, 11";
        String actual = message.LongestDuration();
        assertEquals(expected, actual);

    }
     
      @Test
     public void testSearchTask() {
        String expected = "Create Login, Mike Smith, To Do";
        String actual = message.SearchTask();
        assertEquals(expected, actual);
       
    }
     @Test
      public void testDeveloperTasks() {
        String expected = "Create Reports, Done";
      String actual = message.DeveloperTasks();
        assertEquals(expected, actual);
    }

@Test
    public void testDeleteTask() {
        String expected = "Task Create reports successfully deleted";
     String actual = message.DeleteTasks();
        assertEquals(expected, actual);
    }

    
 
    
}
