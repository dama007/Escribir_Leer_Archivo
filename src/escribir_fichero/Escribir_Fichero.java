
package escribir_fichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author kinky
 */
public class Escribir_Fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
            
            
            try {
                
                FileWriter fw = new FileWriter("archivo.txt");
                fw.write("Hello World, this is a trial." + "\n" + "To show how to write a file");
                fw.close();
           
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
            
            
            try {
                
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena;
            
            
            try {
            while ((cadena = br.readLine()) != null) {
                System.out.println(cadena);
            }
            
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            } 
            
        } catch (FileNotFoundException ex) {
            System.out.println("Hay error: " + ex.getMessage());
 
        } 
        
    }
    
}
