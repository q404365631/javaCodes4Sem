// Original file date: 3/03/2026
// File Created on : 8/03/2026
// last edited on: 8/03/2026

import java.io.*;

class buff {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null) {
            System.out.print(s);
        }

        br.close();
        fr.close();
    }
}