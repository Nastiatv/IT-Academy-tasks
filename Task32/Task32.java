package Task32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task32 {

	public static void main(String[] args) throws IOException {
		String way ="D:\\courses IT\\data.dat";
		writeNumbersToTheFile(way);
		System.out.println(readtxt(way));
		countAverage(readtxt(way));
	}
	
	private static void writeNumbersToTheFile(String way) throws IOException {
		DataOutputStream out;
		{
			try {
				out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(way)));
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
				return;
			}
			for (int i = 0; i < 20; i++) {
				out.writeInt((int) (Math.random() * 10 + 1));
			}
			out.close();
		}
	}

	private static List<Integer> readtxt(String way) throws IOException {
		DataInputStream in = null;
		try {
			in = new DataInputStream(new BufferedInputStream(new FileInputStream(way)));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		List<Integer> num=new ArrayList<>();
		int res = in.readInt();
		while (in.available()>0) {
			num.add(res);
			try {
				res = in.readInt();
			} catch (EOFException e) {
				break;
			}
		}
		if (in != null) {
			in.close();}
		return num;}
	
	
	private static void countAverage(List<Integer> num) {
		int n=1;
		int sum=0;
		for(int number:num) {
			n++;
			sum+=number;
		}
		System.out.println("Average: "+(sum/n));
	}
}
