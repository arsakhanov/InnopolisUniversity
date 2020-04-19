package ru.arsakhanov.lesson15;

import java.io.File;
import java.io.StringReader;

public class Recursion {

    public static void main(String[] args) {

        File dir = new File("E://Games");
        recursionDirectory(dir);
    }

    public static void recursionDirectory(File folder){

        File[] folderEntries = folder.listFiles(); //переда в массив файлы и папки в каталоге
        for(File entry : folderEntries){
            if(entry.isDirectory()){
                System.out.println(entry.getName() + "\t Dir");
                recursionDirectory(entry);
            }
            else System.out.println(entry.getName() + "\t File");
        }
    }
}
