/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid;
import java.util.*;

/**
 *
 * @author Esraa Abdulfatah
 */
public class Main {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       PyramidCSVDAO pDAO = new PyramidCSVDAO();
       List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("G:..\\pyramids.csv");
       
       //let's print all the pyramids read from csv file
       int i=0;
       for(Pyramid p:pyramids)
       {
            System.out.println("# "+(++i)+" "+p.getPharaoh()+" "+p.getModern_name()+" "+p.getSite()+" "+p.getHeight()); 
       }        
    
    }
}
