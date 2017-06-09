/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.Data;
import Domian.Movie;
import java.io.IOException;

/**
 *
 * @author arturo
 */
public class MovieBusiness {

    Data data;

    public MovieBusiness() {
        this.data = new Data();
    }
    public void writerArchive(Movie movie) throws IOException, ClassNotFoundException {
         this.data.writerArchive(movie);
    }
}
