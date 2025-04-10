package ex03_InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Ex01_InputStreamReader {
	public static void main(String[] args) {
		FileInputStream in = null;
		InputStreamReader is = null;
		
		try {
			in = new FileInputStream("D:\\full_stack_PY\\java\\test.txt");
			is = new InputStreamReader(in, "UTF-8");
			int read = 0;
			
			while((read = is.read()) != -1) {
				System.out.print((char)read);
				
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				if(is != null) {
					is.close();
				}
				
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
