package com.sagarx.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDataDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("Hii All, This is the content of my .txt file that i wanna show you all.\n");
		fw.write("Hii All, This is the content of my .txt file that i wanna show you all 2.\n");
		fw.write("Thanku!");
		fw.flush();
		fw.close();
	}

}
