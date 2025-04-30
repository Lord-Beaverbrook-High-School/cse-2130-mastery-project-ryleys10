import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class fileCreator {
    public static void creator(String fileName) {
        try {
            File myObj = new File(fileName); // File name + extension
            if (myObj.createNewFile()) { // if true
                System.out.println("File created: " + myObj.getName());// print that it was created
            } else {                                                   // with specified name
                System.out.println(myObj.getName() + " This file already exists");
            }                                                          // // if already exists, print this
        } catch (IOException e) { // catch error, this time an IOException Error
            System.out.println("An error occurred."); // print
            e.printStackTrace(); // print the error message that correlates with this error
        }
    }
    public static void creatorNoOutput(String fileName) {
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
            }
        } catch (IOException e) {
            System.out.println("An error occurred."); // print
            e.printStackTrace();
        }
    }
}

