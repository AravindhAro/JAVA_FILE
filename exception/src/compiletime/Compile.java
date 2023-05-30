package compiletime;
import java.io.*;
public class Compile {
	
	public static void main(String[] args) throws IOException {
		
		Compile cc = new Compile();
//		cc.eofException();
//		cc.filenotfound();
//		cc.interrupted();
		cc.sqlexception();
	}
	
	public void eofException() throws IOException {
	    DataOutputStream out = new DataOutputStream(new FileOutputStream("data"));
	    out.writeUTF("Hello, world!");    // this line will emty means eof throw
	    out.close();

	    DataInputStream in = new DataInputStream(new FileInputStream("data"));
	    String str = in.readUTF(); // This line will throw an EOFException if the file is empty
	    in.close();
	    System.out.println(str);
	}
	

	public void filenotfound() {
		
		 File file = new File("example.txt");
	    try {
	        FileReader fileReader = new FileReader(file);
	        BufferedReader bufferedReader = new BufferedReader(fileReader);
	        
	        String line;
	        while ((line = bufferedReader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        bufferedReader.close();
	        fileReader.close();
	    } catch (FileNotFoundException e) {
	        System.out.println("The file was not found: " + e.getMessage());
	    } catch (IOException e) {
	        System.out.println("An IO exception occurred: " + e.getMessage());
	    }
	}
	
	public void interrupted() {
		
		 Thread thread = new Thread(() -> {
		        try {
		            Thread.sleep(1000); // The thread is sleeping for 1 second
		        } catch (InterruptedException e) {
		            System.out.println("The thread was interrupted.");
		            // If the thread is interrupted while it is sleeping, this message will be printed
		        }
		    });
		    thread.start();

		    // Interrupt the thread after 500 milliseconds
		    try {
		        Thread.sleep(500);
		        thread.interrupt(); // Interrupt the thread
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		    System.out.println(thread);
	}
	
	public void sqlexception() {
		
		  
		  
	}

}
