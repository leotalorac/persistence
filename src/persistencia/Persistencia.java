/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Persistencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("Hamlet.txt");
        File f2 = new File("a.txt");
            try{        
                f2.createNewFile();
            }catch (IOException ex){
                System.out.println("no es posible crear el archivo");
            }
        System.out.println("Exist " + f.exists());
        System.out.println("can read " + f.canRead());
        System.out.println("length " + f.length());
        System.out.println("getabsolutePath " + f.getAbsolutePath());
        //lectura
        try {
            Scanner sc = new Scanner(f);
            //usar delimitador personalizado
            sc.useDelimiter(",");
            while(sc.hasNext()){   
                System.out.print(sc.next()  + " ");
            }
            //Siempre cerrar
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //escritura
        PrintStream es;
        try {
            es = new PrintStream(f);
            es.println("siiii");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        //volver a leer
        try {
            Scanner sc = new Scanner(f);
            //usar delimitador personalizado
            sc.useDelimiter(",");
            while(sc.hasNext()){   
                System.out.print(sc.next()  + " ");
            }
            //Siempre cerrar
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }
    
}
