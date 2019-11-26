package Task33;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task33 {

	public static void printWhaIsInTheFolder(String way) {
		List<String> folders = new ArrayList<>();
		List<String> files = new ArrayList<>();
		File folder = new File(way);
		File[] listfile = folder.listFiles();
		for (File name : listfile) {
			if (name.isDirectory()) {
				folders.add(name.getName());
				printWhaIsInTheFolder(name.toString());
			} else {
				files.add(name.getName());
			}
		}
		System.out.println(way);
		System.out.println("Files: " + files);
		System.out.println("Folders: " + folders);
	}

	public static void main(String[] args) {

		String way = "D:\\Video";
		printWhaIsInTheFolder(way);

	}
}
