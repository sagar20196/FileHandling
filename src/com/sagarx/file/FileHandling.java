package com.sagarx.file;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File f= new File("abc.txt");
		System.out.println("Exists="+f.exists());
		if(!f.exists()) {
			 boolean created=f.createNewFile();
			 System.out.println("Created= "+created);
		}
		System.out.println("Path="+f.getAbsolutePath());
		System.out.println("Directory="+f.isDirectory());
		System.out.println("File="+f.isFile());
		System.out.println("Hashcode="+f.hashCode());
		System.out.println("Compare="+f.compareTo(f));
		//System.out.println("Compare="+f.compareTo(null));
		System.out.println("CanonicalPath="+f.getCanonicalPath());
		System.out.println("FreeSpace="+f.getFreeSpace());
		System.out.println("Length="+f.length());
		System.out.println("LastModified="+f.lastModified());
		System.out.println("ListRoots="+f.listRoots());
		System.out.println("Name="+f.getName());
		System.out.println("Parent="+f.getParent());
		System.out.println("TotalSpace="+f.getTotalSpace());
		System.out.println("UsableSpace="+f.getUsableSpace());
		System.out.println("Equals="+f.equals(args));
		System.out.println("List="+f.list());
		System.out.println("Class="+f.getClass());
		System.out.println("Hidden="+f.isHidden());
		System.out.println("Absolute="+f.isAbsolute());
		System.out.println("String="+f.toString());
		System.out.println("PathSeperator="+f.pathSeparator);
		System.out.println("PathSeperatorChar="+f.pathSeparatorChar);
		System.out.println("Execute="+f.canExecute());
		System.out.println("Read="+f.canRead());
		System.out.println("Write="+f.canWrite());
		
	}
}
