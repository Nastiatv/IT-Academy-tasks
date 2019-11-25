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

public class Task32 {

	public static void main(String[] args) throws IOException {

		DataOutputStream out;
		try {
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\йспяш IT\\data.dat")));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			return;
		}
		for (int i = 0; i < 20; i++) {
			out.writeInt((int) (Math.random() * 10 + 1));
		}
		out.close();

		DataInputStream in = null;
		try {
			in = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\йспяш IT\\data.dat")));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			return;
		}
		int n=1;
		int sum=0;
		
		int res = in.readInt();
		while (true) {
			System.out.print(res + " ");
			n++;
			sum+=res;
			try {
				res = in.readInt();
			} catch (EOFException e) {
				break;
			}
		}
		if (in != null) {
			in.close();
			System.out.println("\nAverage: "+(sum/n));
		}
	}
}
