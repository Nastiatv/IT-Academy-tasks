package fyi;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Magic {

	public static void main(String[] args) throws IOException {
			StringBuilder sb = new StringBuilder();
			sb.append("Lena").append('\n').append("Olya").append('\n').append("Anya").append('\n');
			String data = sb.toString();

			InputStream is = new ByteArrayInputStream(data.getBytes());

			System.setIn(is);

			readAndPrintLine();
		}

		public static void readAndPrintLine() throws IOException {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			while (true) {
				String line = reader.readLine();
				if (line == null)
					break;
				System.out.println(line);
			}
			reader.close();
			isr.close();
		}

	}

	
	

