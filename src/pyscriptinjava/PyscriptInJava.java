/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyscriptinjava;
import java.io.*;
/**
 *
 * @author prajwalj
 */
public class PyscriptInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  
        // Run this on Windows, cmd, /c = terminate after this run
        //processBuilder.command("cmd /C start");//,"cd C:\\Users\\prajwalj\\Downloads\\Disease-prediction-using-Machine-Learning-master\\Disease-prediction-using-Machine-Learning-master","python","numbers.py");//("cmd.exe", "/c", "ping -n 3 google.com");

        try {
            
                
            Process p = Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd C:\\Users\\prajwalj\\Downloads\\Disease-prediction-using-Machine-Learning-master\\Disease-prediction-using-Machine-Learning-master && python clean_code.py && exit\""); 
            p.waitFor();
            int i=p.exitValue();
            System.out.println(i);
            
            //ProcessBuilder processBuilder = new ProcessBuilder("cmd /c start cmd.exe /K \"cd C:\\Users\\prajwalj\\Downloads\\Disease-prediction-using-Machine-Learning-master\\Disease-prediction-using-Machine-Learning-master && python clean_code.py\""); 
            

            //Process process = processBuilder.start();
            
            /*
			// blocked :(
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
              System.out.println(line);
            }

                    
            */
            
            //int exitCode = process.waitFor();
            //System.out.println("\nExited with error code : " + exitCode);

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
}
