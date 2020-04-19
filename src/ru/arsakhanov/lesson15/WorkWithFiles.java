package ru.arsakhanov.lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class WorkWithFiles {

    public static void main(String[] args) {

        File newFile = new File("E://Games//MyFile.txt");

        //создаем файл в указанном каталоге с именем MyFile
        try{
            boolean created = newFile.createNewFile();
            if(created){
                System.out.println("File has been created");
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        //переименовываем созданный файл
        File renameFile = new File("E://Games//RenamedFile.txt");
        newFile.renameTo(renameFile);

        //копируем файл
        Path copyFile = Paths.get("E://Games//CopyFile.txt");
        try {
        File textFile = new File("E://Games//info.txt");
        Path originalPath = textFile.toPath();                      //я скопировал заранее созданный и заполненный информацией файл, чтобы проверить действительно ли работает копирование
            Files.copy(originalPath, copyFile, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //Удаляем файл
        boolean deleted = renameFile.delete();
        if(deleted){
            System.out.println("File has been deleted");
        }else System.out.println("File has not been deleted");
    }
}




