package ru.arsakhanov.lesson18;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class Encoding {

    public static void main(String[] args) {


        try{
            BufferedReader br = new BufferedReader(new FileReader("E://Games//MyCode.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("E://Games//MyCodeCopy.txt"));
            String line;
            String encoding;
            byte[] c;
            while ((line = br.readLine())!=null){
                System.out.println(line);
                c = line.getBytes();
                encoding = new String(c, "ASCII");
                bw.write(encoding);
            }
            br.close();
            bw.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }



    }
}
