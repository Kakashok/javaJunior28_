package lesson17;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;


public class CopyWithFileUtils implements CopyUtils{
    @Override
    public void copy(String from, String to) {

        try {
            FileUtils.copyFile(new File(from), new File(to));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
