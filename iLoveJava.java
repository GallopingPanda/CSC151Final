import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class iLoveJava {
 
    public static void main(String a[]){
        randWords();
     }


public static void randWords() {
			
	StringBuilder sb = new StringBuilder();
		    String strLine = "";
		    List<String> randWordList = new ArrayList<String>();
		    try {
		         BufferedReader br = new BufferedReader(new FileReader("C:/Users/hamrickr147/documents/randomwords.txt"));
		          while (strLine != null)
		           {
		            strLine = br.readLine();
		            sb.append(strLine);
		            sb.append(System.lineSeparator());
		            strLine = br.readLine();
		            if (strLine==null)
		               break;
		            randWordList.add(strLine);
		        }
		     System.out.println(Arrays.toString(randWordList.toArray()));
		         br.close();
		    } catch (FileNotFoundException e) {
		        System.err.println("File not found");
		    } catch (IOException e) {
		        System.err.println("Unable to read the file.");
		    }
	
}
}