/*
* Christopher Magee
* generating an output text file
* reading string from output text file
* show results
*/

import java.io.*;
import java.util.Scanner;

public class CodingChallenge5CRM {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Prime, Perfect Square, and Perfect Number Tester ");
        System.out.print("Please enter the name of the output file to save your data:");
        String name = sc.nextLine();
        PrintWriter pw = null;
        try {
            FileOutputStream fout = new FileOutputStream(name);
            pw = new PrintWriter(fout);
        }
        catch (Exception e){
           e.printStackTrace();
        }
        System.out.print("Enter a start number:");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("Enter a stop number:");
        int b = Integer.parseInt(sc.nextLine());

       
        for (int i = a; i<=b; i++){
           int ps = 0;
           for (int k = 0; k<a; k++){
               if (k*k == i){
                  ps = 1;
                  System.out.println("The number " + i+ " is: Perfect Square");
                  pw.println("The number " + i+ " is: Perfect Square");
               }
           }
           if (ps == 1)
              continue;
           int sum = 0;
           for (int j = 2; j<i; j++){
               if (i % j == 0)
                  sum = sum + j;
           }
           if (sum == 0){
               System.out.println("The number " + i+ " is: Prime");
                pw.println("The number " + i+ " is: Prime");
           }
           else if (sum + 1 == i){
               System.out.println("The number " + i+ " is: Perfect");
               pw.println("The number " + i+ " is: Perfect");
           }
           else if (sum + 1 > i){
               System.out.println("The number " + i+ " is: Imperfect Abundant");
               pw.println("The number " + i+ " is: Imperfect Abundant");
           }
           else{
               System.out.println("The number " + i+ " is: Imperfect Deficient");
               pw.println("The number " + i+ " is: Imperfect Deficient");
           }

        }    
      
       
    }

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter the name of the input file to search:");
        final String file = "MyNumData.txt";
        fname = scan.nextLine();
        String line = null;
        ArrayList<String> fileContents = new ArrayList<>();

        System.out.print("Please enter the string to search:");

try {
            FileReader fReader = new FileReader(file);
            BufferedReader fileBuff = new BufferedReader(fReader);
            while ((line = fileBuff.readLine()) != null) {
                fileContents.add(line);
            }
            System.out.println ("The following lines were found:", ++line);

            fileBuff.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
}



}