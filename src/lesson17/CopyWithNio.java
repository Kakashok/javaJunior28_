package lesson17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyWithNio implements CopyUtils{

    @Override
    public void copy(String from, String to) {
        Path fromPath = Paths.get(from);
        Path toPath = Paths.get(to);
        try {
            Files.copy(fromPath, toPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
