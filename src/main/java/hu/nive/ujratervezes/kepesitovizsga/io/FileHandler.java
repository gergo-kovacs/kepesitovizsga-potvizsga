package hu.nive.ujratervezes.kepesitovizsga.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileHandler {

    public int sumIgnoreComments(String file){
        int sum = 0;
        Path path = Path.of(file);
        try {
            List<String> list = Files.readAllLines(path);
            for (String line:list) {
                if(!line.startsWith("//")){
                    sum +=Integer.parseInt(line);
                }
            }
        } catch (IOException ioException) {
            throw new IllegalArgumentException("Can't read file");
        }
        return sum;
    }

}
