package cheannai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFile {
public static void main (String args[]) throws IOException {
	
File file=new File("/home/ranga/Downloads/jjj/AAA/BBB/abcd.txt");
System.out.println(file.createNewFile());
FileReader fr=new FileReader(file);
int sentenceCount=0;
int r=fr.read();
while(r!=-1) {
	char c=(char)r;
	if(c==' ') {
		sentenceCount++;
	}
	r=fr.read();
}
System.out.println(sentenceCount);
}

}
