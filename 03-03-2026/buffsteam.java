// Original file date: 3/03/2026
// File Created on : 8/03/2026
// last edited on: 8/03/2026

import java.io.*;

class buff {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null) {       // br.read() reads everytin int,float,double whereas this reads string only
            System.out.print(s);
        }

        br.close();
        fr.close();
    }
}

// Buffread only works for stringa no number no notin