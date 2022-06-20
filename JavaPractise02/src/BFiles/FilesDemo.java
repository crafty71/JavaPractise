package BFiles;

import java.io.File;

public class FilesDemo {
    public static void main(String[] args) {
        File src = new File("D:\\crash");
        getAllFilePath(src);
    }

    public static void getAllFilePath(File src) {
        File[] fileArray = src.listFiles();
        if(fileArray != null) {
            for(File file : fileArray) {
                if(file.isDirectory()){
                    getAllFilePath(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
