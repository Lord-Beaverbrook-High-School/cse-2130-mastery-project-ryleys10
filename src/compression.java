import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class compression {
    public static void compress(String input, String output) {
        List<String> array = new ArrayList<>();
        try {
            array = writerToCSV.ReadingEntireTXTFile(input);
            fileCreator.creatorNoOutput(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printTest(String input){
        List<String> array = new ArrayList<>();
        try {
            array = writerToCSV.ReadingEntireTXTFile(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int arrayLength = array.size();
            for (int i = 0; i < arrayLength; i++) {
            System.out.println(array.get(i));
        }
    }

    public static void printSpecificIndex(String input, int index){
        List<String> array = new ArrayList<>();
        try {
            array = writerToCSV.ReadingEntireTXTFile(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
            System.out.println(array.get(index)[index]);
    }
}
