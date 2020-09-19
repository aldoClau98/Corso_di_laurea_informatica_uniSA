/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import java.util.List;

/**
 *
 * @author ALDO
 */
public class LibroWebServiceClient {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println(findLibroById("LR"));
        
        List<Libro> libri = findAllLibro();
        
        for(Libro l:libri)
            System.out.println(l.getTitolo() + " "+ l.getAutore());
    }
    
    private static Libro findLibroById(java.lang.String arg0){
        return null;
        
    }
   
    private static java.util.List<libro.Libro> findAllLibro(){
        return null;
    
        
        
    }

}

    

