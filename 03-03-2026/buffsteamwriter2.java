// Original file date: 3/03/2026
// File Created on : 8/03/2026
// last edited on: 8/03/2026

import java.io.*;

class buff3 {
    public static void main(String[] args) {
        FileOutputStream fos = new FileOutputStream("javaCodes4Sem\\03-03-2026\\test2.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String s;
        
        System.err.print("Enter Data: ");

        s = s.next();               // "The method nextLine() is undefined for the type String" error same for next()
        
        bos.write(s.getBytes());        // no idea of getBytes or maybe I have but plix someone tell me
        
        bos.close();
        fos.close();
    }
}

// i think i wrote in nb as "we CAN(a tick on it) __ using using buffer" i think i wrote "input" which means
// we CAN take input using buffer too