package cst8284.wordsort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FileIO {
	private static int numberOfStringsLoaded;
	public static ArrayList<String> loadArrayListFromFile(File f){
		try {
			ArrayList<String> arL = new ArrayList<>();
			Scanner input = new Scanner(f);
			while(input.hasNext()) {
				arL.add(input.next());
				numberOfStringsLoaded++;
				
			}
			return arL;
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			return null;
		}
		
	}
	public static boolean fileExists(File f) {
		if(!f.exists()) return false;
		if(!f.canRead()) return false;
		if(f.length() == 0) return false;
		if(!f.isFile()) return false;
		return true;
	}
	public static String toStringFromArrayList(ArrayList<String> arStr) {
		String newString = "";
		for(String arL: arStr) {
			newString += arL +"\n";
		}
		return newString;
	}
	public static String toStringFileIO(File f) {
		Date dt = new Date(f.lastModified());
		String fileName = "File Name: " + f.getName() + "\n";
		String fileSize = "File Size: " + f.length() + "\n";
		String dateMod = "File Last Modified: " + dt + "\n";
		String numStrings = "Number of Strings Retrieved: " + numberOfStringsLoaded;
		
		return (fileName + fileSize + dateMod + numStrings);
	}

}
