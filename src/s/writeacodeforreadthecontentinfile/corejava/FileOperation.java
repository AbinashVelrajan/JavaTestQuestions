package s.writeacodeforreadthecontentinfile.corejava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class FileOperation {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\add\\subfolder\\mul\\abi.txt");

		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		
		boolean mkdirs = f.mkdirs();
		System.out.println(mkdirs);
		
		Object createNewFile = f.createNewFile();
		System.out.println(createNewFile);
		
		FileUtils.write(f,"Welcome to File");
	}

}
