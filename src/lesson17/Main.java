package lesson17;

public class Main {
    public static void main(String[] args) {
        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();
        CopyWithNio copyWithNio = new CopyWithNio();
        CopyWithAppache copyWithAppache = new CopyWithAppache();
        CopyWithGuava copyWithGuava = new CopyWithGuava();
        CopyWithFileUtils copyWithFileUtils = new CopyWithFileUtils();
        CopyWithStream copyWithStream = new CopyWithStream();
        CopyWithChannel copyWithChannel = new CopyWithChannel();


        long start1 = System.currentTimeMillis();
        copyWithOneByte.copy("D:\\Users\\Victor\\Downloads\\434.pdf", "D:\\test\\1.pdf");
        long end1 = System.currentTimeMillis();
        System.out.println("Копирование с помощью одного байта: " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        copyWithNio.copy("D:\\Users\\Victor\\Downloads\\434.pdf", "D:\\test\\2.pdf");
        long end2 = System.currentTimeMillis();
        System.out.println("Копирование с помощью Nio: " + (end2 - start2));

        long start3 = System.currentTimeMillis();
        copyWithAppache.copy("D:\\Users\\Victor\\Downloads\\434.pdf", "D:\\test\\3.pdf");
        long end3 = System.currentTimeMillis();
        System.out.println("Копирование с помощью Appache: " + (end3 - start3));

        long start4 = System.currentTimeMillis();
        copyWithGuava.copy("D:\\Users\\Victor\\Downloads\\434.pdf", "D:\\test\\4.pdf");
        long end4 = System.currentTimeMillis();
        System.out.println("Копирование с помощью Guava: " + (end4 - start4));

        long start5 = System.currentTimeMillis();
        copyWithFileUtils.copy("D:\\Users\\Victor\\Downloads\\434.pdf", "D:\\test\\5.pdf");
        long end5 = System.currentTimeMillis();
        System.out.println("Копирование с помощью File Utils: " + (end5 - start5));

        long start6 = System.currentTimeMillis();
        copyWithStream.copy("D:\\Users\\Victor\\Downloads\\434.pdf", "D:\\test\\6.pdf");
        long end6 = System.currentTimeMillis();
        System.out.println("Копирование с помощью Stream: " + (end6 - start6));

        long start7 = System.currentTimeMillis();
        copyWithChannel.copy("D:\\Users\\Victor\\Downloads\\434.pdf", "D:\\test\\7.pdf");
        long end7 = System.currentTimeMillis();
        System.out.println("Копирование с помощью Channel: " + (end7 - start7));
    }
}
