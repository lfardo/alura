import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaPadrao {

	public static void main(String[] args) throws IOException {
//		Scanner entrada = new Scanner(new FileInputStream("arquivo.txt"));
		Scanner entrada = new Scanner(System.in);
		
		OutputStream os = new FileOutputStream("saida.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        OutputStream os2 = new FileOutputStream("saida2.txt");
        PrintStream printStream = new PrintStream(os2);
		
		while(entrada.hasNextLine()) {
			String nextLine = entrada.nextLine();
			bw.append(nextLine);
			bw.newLine();
			
			printStream.println(nextLine);
		}
		
		entrada.close();
		bw.close();
		printStream.close();
	}

}


////InputStream is = System.in;
//		BufferedReader br = new BufferedReader(new InputStreamReader(
//				new FileInputStream("arquivo.txt")));
//
//		String readLine = br.readLine();
//		while (readLine != null) {
//			System.out.println(readLine);
//			readLine = br.readLine();
//		}
//
//		br.close();