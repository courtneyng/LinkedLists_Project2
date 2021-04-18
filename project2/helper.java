package project2;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class helper{
    public static void start() throws FileNotFoundException, IOException{
        /**
         * Creates an empty array list to store a list of LinkedString objects.
         * Calls create  with a reference to the array list.
         * Calls displayAndMore with a reference to the array list.
         */
        ArrayList<LinkedString> strObj = new ArrayList<>();
        create(strObj);
        displayAndMore(strObj);
    }

    public static void create(ArrayList<LinkedString> strObj){
        /**
         * 
         * BufferedReader to read a file
         * As you read in the text file you assign a value to a string
         * Pass string value into constructor 
         * Make a strnig and add to ArrayList
         * 
         */

        try (BufferedReader br = new BufferedReader(new FileReader("D:/icsi213/project2/project2/data.txt"))) {
            String text;
            while ((text = br.readLine()) != null) {
               for(int i=0; i<text.length()/2; i++){
                //String hold = scan.nextLine();
                String hold = text;
                LinkedString str1 = new LinkedString(hold);
                strObj.add(str1);
             }
             for(long i=text.length()/2; i<text.length(); i+=2){
                 //String hold2 = scan.nextLine();
                 String hold2 = text;
                 LinkedString str2 = new LinkedString(hold2.toCharArray());
                 strObj.add(str2);
             }
               
            }
        }
        catch(Exception e){
            System.out.println("Does not work");
        }

         /* 
         Not working

         File data = new File("D:/icsi213/project2/project2/data.txt");
         Scanner scan = new Scanner("data.txt");
         for(int i=0; i<data.length()/2; i++){
            String hold = scan.nextLine();
            LinkedString str1 = new LinkedString(hold);
            strObj.add(str1);
         }
         for(long i=data.length()/2; i<data.length(); i+=2){
             String hold2 = scan.nextLine();
             LinkedString str2 = new LinkedString(hold2.toCharArray());
             strObj.add(str2);
         }
         scan.close();
         */

    }

    public static void displayAndMore(ArrayList<LinkedString> temp) throws FileNotFoundException{
        /**
         * LinkedString param get i
         * LinkedString param get i+2
         * Prints if the first LinkedString is empty
         * Prints if the second LinkedString is empty
         * Prints the first charAt
         * Prints the second charAt
         * Prints the first substring
         * Prints the second substring
         * Prints the concatenation of the first and second
         */

         for(int i=0; i<temp.size(); i=+2){
             LinkedString entry1 = temp.get(i);
             LinkedString entry2 = temp.get(i+2);
             System.out.println(entry1.isEmpty());
             System.out.println(entry2.isEmpty());
             System.out.println("First charAt: " + entry1.charAt(0));
             System.out.println("Second charAt: " + entry2.charAt(0));
             System.out.println("First substring: " + entry1.substring(0,1));
             System.out.println("Second substring: " + entry2.substring(0,1));
             System.out.println("The concatentation is: " + entry1.concat(entry2));
         }
    }
}