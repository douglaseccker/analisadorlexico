import java.io.IOException;
import LexicAnalyse.*;

public class Main {

	public static void main(String[] args) {
		try {
			FileHandler fh = new FileHandler();
			
			String path = "code.txt";
			
			String content;
		
			content = fh.read(path);
			
			Analyse an = new Analyse();
			an.analyse(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
