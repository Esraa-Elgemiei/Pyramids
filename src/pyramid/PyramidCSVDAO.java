/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

/**
 *
 * @author Esraa Abdulfatah
 */
public class PyramidCSVDAO {

    public PyramidCSVDAO() {
    }
    
    public List<Pyramid> readPyramidsFromCSV(String fileName){
        List<Pyramid> pyramids = new ArrayList<Pyramid>();

        //access the data CSV file
        File pyramidFile = new File(fileName);

        //read all data lines in the csv file, and save them in a list
        List<String> lines = new ArrayList<String>();
        try{
            lines = Files.readAllLines(pyramidFile.toPath());
        }catch(Exception e){
            System.out.println("An issue has been happend during reading pyramid file: "+e);
        }

        //extract all pyramid info, and save them in a list
        for(int lineIndx = 1;lineIndx < lines.size();lineIndx++){
            String line = lines.get(lineIndx);

            String[] fields = line.split(",");

            for (int fieldIndex =0;fieldIndex < fields.length;fieldIndex++){
                fields[fieldIndex] = fields[fieldIndex].trim();
            }
            Pyramid pyramid = new Pyramid();
            pyramid = createPyramid(fields);
            pyramids.add(pyramid);
        }
   
        return pyramids ;
    }
    
    public Pyramid createPyramid(String[] metadata){
        Pyramid pyramid= new Pyramid();
        
        pyramid.setPharaoh(metadata[0]);
        pyramid.setModern_name(metadata[2]);
        pyramid.setSite(metadata[4]);
        double height;
        if(metadata[7].isEmpty()){
           height =0;          
        } else{
           height= Double.valueOf(metadata[7]);  
        }
        pyramid.setHeight(height);
        
        return pyramid;
    }
}
