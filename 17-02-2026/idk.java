import java.io.*;

class exc {
    public static void main(String[] args) 
        throws FileNotFoundException, ArithmeticException, IOException { // throws is only used to declare
            try {
                System.out.println("Fixed error yayay");
            }
            catch (Exception e) {
                System.err.println(e);
            }
        }
    }


// code found online:

class ThrowsExample {
    public void readFile() throws IOException { // Declares potential IOException
        FileReader file = new FileReader("c:\\a.txt");
        // code that may produce IOException

        file.close();
    }
    public static void main(String[] args) {
        ThrowsExample obj = new ThrowsExample();
        try {
            obj.readFile(); // Caller must handle the exception
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}