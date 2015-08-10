package myMapReduce;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import mapReduce.MapReduce;
import mapReduce.Pair;

public class LetterCounter {
	
	
public static void main (String[] args) throws FileNotFoundException{
	
	
	// Choosing a file and reading it
	final JFileChooser fc = new JFileChooser();
	fc.showOpenDialog(null);
	File filePath = fc.getSelectedFile(); 
	byte[] encoded =null;
	try {
		 encoded = Files.readAllBytes(Paths.get(filePath.getCanonicalPath()));
	} catch (IOException e) {
		e.printStackTrace();
	}
    String readFile = new String(encoded, StandardCharsets.US_ASCII);
    
    // Display the string.
//    System.out.println(readFile); 
    	
    List<Pair<String, String>> results;
    readFile = readFile.toLowerCase();
   readFile = readFile.replaceAll("[^a-zA-Z\\s]","");
   readFile =  readFile.replaceAll("[\\r|\\n|\\r\\n]"," ");
   results = new MapReduce().execute("Test data", readFile);
  // System.out.println(readFile);
    
    // Scans and reports total number of word sin the document read.
    Scanner sc = new Scanner(readFile);
    int counts=0;
    while(sc.hasNext()){
        sc.next();
        counts++;
    }
    System.out.println("Number of words Scanned: " + counts);
   
    
    // For printing in Alphabetical order
    int count = 0;
    String Alphabets = "abcdefghijklmnopqrstuvwxyz"; // Sorted order of Alphabets
    for (char c : Alphabets.toCharArray()){
    	StringBuilder sb  = new StringBuilder(Character.toString(c));
    	for (Pair<String, String> pair : results) {
    		
        	if(pair.key.equals(Character.toString(c))){
        		count += 1;
        		sb.append (" " +pair.value + "  ");
        	}
        }
    	if(count == 0){	
    		sb.append("  Initial 0    Final 0    Total 0 ");
    		System.out.println(sb);
    	}
    	else{
    		System.out.println(sb);
    	}
    	count =0;
    	
    }
    
}

}
