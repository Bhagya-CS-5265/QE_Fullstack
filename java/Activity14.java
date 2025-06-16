package Activities;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class Activity14{
	public static void main(String[] args) throws IOException{
		File inputFile = new File ("src/main/resources/Input.txt");
		if(inputFile.createNewFile()) {
			System.out.println("File created successfully");
			FileUtils.writeStringToFile(inputFile, "some text in the file", Charset.defaultCharset());
		}else {
			System.out.println("File already Exists");
		}
		//read the data from the file
		System.out.println("Data in the input file: " + FileUtils.readFileToString(inputFile,Charset.defaultCharset()));
		
		//copy the file to directory
		FileUtils.copyFileToDirectory(inputFile,new File("target/destDir"));
		
		//read the file from new destination
		File copiedFile =  FileUtils.getFile("target/destDir/input.txt");
		System.out.println("Data in the copied file : " + FileUtils.readFileToString(copiedFile,Charset.defaultCharset()));
		
	}
}
		



