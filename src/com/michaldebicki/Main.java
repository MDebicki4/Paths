package com.michaldebicki;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try {
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.createDirectory(dirToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir2\\Dir3\\Dir4\\Dir5\\Dir6");
//            Files.createDirectories(dirToCreate);
            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1\\File2.txt");

            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println("Last modified = " + attrs.lastModifiedTime());
            System.out.println("Created = " + attrs.creationTime());
            System.out.println("Is directory = " + attrs.isDirectory());
            System.out.println("Is regular file = " + attrs.isRegularFile());


//            Path fileToDelete = FileSystems.getDefault().getPath("Examples","Dir1","File1.txt");
//            Files.deleteIfExists(fileToDelete);

//            Path fileToMove = FileSystems.getDefault().getPath("Examples","File1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","File1.txt");
//            Files.move(fileToMove,destination);

//            Path fileToMove = FileSystems.getDefault().getPath("Examples","file1copy.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","Dir1","file1copy.txt");
//            Files.move(fileToMove,destination);

//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "File1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "File2copy.txt");
//            Files.copy(sourceFile,copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples","Dir4");
//            Files.copy(sourceFile,copyFile, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
////        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//        Path filePath = Paths.get(".","files","SubdirectoryFile.txt");
//        printFile(filePath);
////        filePath = Paths.get("C:\\Users\\Kot Jojek\\IdeaProjects\\OutThere.txt");
//        filePath = Paths.get("C:\\Users\\Kot Jojek\\","IdeaProjects\\\\","OutThere.txt");
//        printFile(filePath);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
////        Path path2 = FileSystems.getDefault().getPath(".","files","..","SubdirectoryFile.txt");
////        System.out.println(path2.normalize().toAbsolutePath());
////        printFile(path2.normalize());
////
//        Path path3 = FileSystems.getDefault().getPath("thisisfiledoesnotexist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("F:\\abdeeef\\dasdasd.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exist = " + Files.exists(filePath));
//
//        System.out.println("Exist = " + Files.exists(path4));
//
//
//    }
//    public static void printFile(Path path){
//        try(BufferedReader fileReader = Files.newBufferedReader(path)){
//            String line;
//            while ((line = fileReader.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
    }
}
