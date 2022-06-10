package sec10;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Windows");
        File[] fs = file.listFiles();

        Stream<File> stream = Arrays.stream(fs);
        long count = stream.filter(x -> x.isDirectory() == false).count();

        System.out.println("C:\\Windows에 있는 파일 개수 : " + count);
    }
}
