package Task33;

import java.io.File;
import java.util.List;

public class Task33 {
	
	private static List<File> file;
	private static List<File> folder;

	public static void goToFolder(File way) {
		File[] listfile = way.listFiles();
		for (File name : listfile) {
			if (name.isDirectory()) {
				folder.add(name);
				goToFolder(name);
			} else {
				file.add(name);
			}
		}
	}

	public static void printTree(String way) {

		File folder = new File(way);
		File[] listfile = folder.listFiles();
		for (File name : listfile) {
			if (name.isDirectory()) {
				folder.add(name);
				goToFolder(name);
			} else {
				file.add(name);
			}
		}
	}

	public static void main(String[] args) {

		String way = "D:\\йспяш IT";
		printTree(way);
	}
}
