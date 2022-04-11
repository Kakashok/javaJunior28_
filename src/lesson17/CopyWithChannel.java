package lesson17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyWithChannel implements CopyUtils{
    @Override
    public void copy(String from, String to) {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(from).getChannel();
            destChannel = new FileOutputStream(to).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                sourceChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                destChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
