/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;    	// scanner is a predefined class for taking inputs from user
public class Startercode
{
 public static void main(String[] args)
 {

// prompts and accepts user input
Scanner input= new Scanner(System.in);
double data;

System.out.println("Enter  value. After your finish type exit to exit: ");  	 

        // accepts file input
        String fileName = "input.txt";                  // name of the file to open
        String line = null;				// will reference one line at a time
        String i = "";

        try (FileReader fileReader = new FileReader(fileName);  //  FileReader reads text file
           BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
                
            PrintStream fileStdout = new PrintStream(new FileOutputStream("data.txt")))   // output file name is data.txt
        
        {
           while (i != null){
             //System.out.print("Type exit to exit: ");
             i = in.readLine().trim();
              System.out.println("==============");      // output to console,  numbers 0 through 9
	     fileStdout.println("" + i);
             if (i.equals ("exit")) System.exit(0);
           }
           
               
        }catch(IOException ex){
            System.out.println("I/O Error:" + ex);

   
 
   // ENTER YOUR CODE HERE. Enter code to end program successfully. 
           OutputStream ostream=null;
          
           InputStream istream ; 
            istream = System.in;  
              int c;  					//  character stream	
        final int EOF = -1;
     File outFile =  new File("Data.txt");           	// create a new file 
               
        try {  					// try block for EOF indicator  
            ostream = new FileOutputStream(outFile);  
            while ((c = istream.read()) != EOF)  	// look for end of file in istream  
                ostream.write(c);  
        } catch (IOException e) {  
            System.out.println("Error: " + e.getMessage());  
        } finally {  
            try {  					// try block for file error – file did not close

                istream.close();  			// close input and output
                ostream.close();  
              } catch (IOException e) {  
                System.out.println("File did not close");  
           }  
        }  
        }
 }
}


        