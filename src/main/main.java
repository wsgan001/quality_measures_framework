
package main;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is the main class of the framework. It allows probe the different
 * components.
 * 
 * @author angel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            ArrayList<QualityMeasure> classes = ClassLoader.getClasses();
            for(QualityMeasure q : classes){
                q.getValue(new ContingencyTable(45, 5, 50, 1));
                System.out.println(q);
            }
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
