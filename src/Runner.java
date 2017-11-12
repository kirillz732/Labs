
import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Runner {

	public static void main(String[] args) {
		TreeSet<Store> list = new TreeSet();
		//reading from file
		try {
			BufferedReader input = new BufferedReader(new FileReader("src/in.txt"));
			String line = null;
			while ((line = input.readLine()) != null) {
				String[] reads = line.split( " ");
				Store info = new Store(reads[0],  Integer.parseInt(reads[1]), Double.parseDouble(reads[2]));
				list.add(info);
			}
			input.close();
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch(IOException ex) {
			ex.printStackTrace();
		}

		//writing to file
		try {
			FileWriter output = new FileWriter("src/out.txt");
			for (Store store: list) {
				output.write(store.toString());
				output.write(System.lineSeparator());
			}
			output.close();
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}


