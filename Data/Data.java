/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domian.List;
import Domian.Movie;
import com.csvreader.CsvReader;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import com.csvreader.CsvWriter;
import java.io.FileWriter;

/**
 *
 * @author arturo
 */
public class Data {
    Movie movie = new Movie();
    
    public void writerArchive(Movie movie){
        try {
            CsvWriter csvOutput =new CsvWriter(new FileWriter("datos.csv", true),',');
            
            csvOutput.write(movie.getCode());
            csvOutput.write(movie.getTitle());
            csvOutput.write(movie.getGender());
            csvOutput.write(movie.getTotal());
            csvOutput.write(movie.getSubtitled());
            csvOutput.write(movie.getPremier());
            csvOutput.endRecord();
            csvOutput.close();
           
            
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readerArchive(String path) {
        try {
            CsvReader CsvR = new CsvReader(path);
            CsvR.readHeaders();
            Movie newMovie = new Movie();
            while (CsvR.readRecord()) {
                String code = CsvR.get(0);
                String title = CsvR.get(1);
                String gender = CsvR.get(2);
                String total = CsvR.get(3);
                String subtitled = CsvR.get(4);
                String premier = CsvR.get(5);
                newMovie.setCode(code);
                newMovie.setTitle(title);
                newMovie.setGender(gender);
                newMovie.setTotal(total);
                newMovie.setSubtitled(subtitled);
                newMovie.setPremier(premier);
                
                List a=new List();
                geneMovies(newMovie);
                a.insertarInicio(newMovie);
                a.printList();
                
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void geneMovies(Movie newMovie){
        if(newMovie.getGender().equals("1000")){
            List drama=new List();
            drama.insertarInicio(newMovie);
            //drama.printList();
            
        }else  if(newMovie.getGender().equals("2000")){
            List comedy=new List();
            comedy.insertarInicio(newMovie);
            //comedy.printList();
        }else  if(newMovie.getGender().equals("3000")){
            List childish=new List();
            childish.insertarInicio(newMovie);
            
        }else  if(newMovie.getGender().equals("4000")){
            List action=new List();
            action.insertarInicio(newMovie);
            
        }else  if(newMovie.getGender().equals("5000")){
            List romance=new List();
            romance.insertarInicio(newMovie);
            
        }else  if(newMovie.getGender().equals("6000")){
            List fiction=new List();
            fiction.insertarInicio(newMovie);
            
        }
        
    }
}
