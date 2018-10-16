/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package avgreadfile;
import java.io.*;
import javax.swing.JOptionPane;

public class AvgReadFile {
  public static void main(String[] args) throws IOException {
    String myLine,fileName;
    /*Open the text file and attach a BufferedReader
     */

    fileName = JOptionPane.showInputDialog("Enter a name of a file: \n"
            + "note files need to have their extention ie:.txt");

    BufferedReader readFile = new BufferedReader(
       new FileReader(fileName));
       System.out.println("Contents of the file "+fileName+":");

    //read 100 marks from the file randnums.txt
    do {
      myLine = readFile.readLine();
      if (myLine != null){
      System.out.println(myLine);
      } else{}
    } while(myLine != null);
    readFile.close();

   // System.out.print("The average of the random numbers is: ");
   //Call findAverage method; passes values from inMark array
   //System.out.println(findAverage(inMarks));
  }
//testfile.txt
//  public static int findAverage(int marks[]) {
//    int sum = 0;
//    for (int i = 0; i < marks.length; i++) {
//      //sums the values in the new array 'marks'
//      sum += marks[i];	
//    }
//    return (sum / marks.length);	//returns average
//  }
}