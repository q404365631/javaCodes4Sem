import java.io.*;
import java.util.*;

class buff2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter("javaCodes4Sem\\03-03-2026\\test.txt");      // creates a file called test.txt
        BufferedWriter bw = new BufferedWriter(fw);
        String s;

        System.err.print("Enter Data: ");
        s = sc.nextLine();
        bw.write(s);

        bw.close();
        fw.close();
        sc.close();        
    }
}

// tis is buffere writin and creates new file called test.txt