package com.mycompany.app;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.text.SimpleDateFormat;
import java.io.File;
import java.util.Date;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

     try {
      Date date = new Date() ;
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
      File myObj = new File(dateFormat.format(date) + ".log");
      FileWriter fWriter = new FileWriter(myObj);
      fWriter.write("Hello World ... !");
      fWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  
        System.out.println( "Hello World!" );

    }
}
