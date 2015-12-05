import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		
		try {
			File x1 = new File("MyText.txt");
			FileReader x2 = new FileReader(x1);
			BufferedReader x4 = new BufferedReader(x2);
			String x3 = null;
			try {
				while((x3 = x4.readLine()) != null) {
					System.out.println(x3);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			x4.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
