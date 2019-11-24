package IODifferentVariants;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class v3 {

	
	File file = new File("D:\\йспяш IT\\Cat.txt");

	List list = Files.readAllLines(file.toPath(), Charset.defaultCharset());
	
	
	
}
