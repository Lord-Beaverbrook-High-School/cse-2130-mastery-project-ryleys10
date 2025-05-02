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
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        int counter = 1;
        String currentNumber = array.get(0);
        List<String> compressedString = new ArrayList<>();
        //for (int i = 0; i < array.size(); i++) {
        for (int i = 0; i < 10; i++) {
            if (currentNumber.equals(array.get(i))) {
                System.out.println(array.get(i) + " get I ");
                counter++; System.out.println(counter);
                if (array.get(i + 1) != currentNumber){
                    System.out.println(array.get(i + 1) + " get I + 1");
                    compressedString.add(currentNumber);
                    System.out.println(currentNumber + " Current Number");
                    compressedString.add(array.get(i));
                    System.out.println(array.get(i) + " get I Again");
                    System.out.println(counter + " reset counter");
                    counter = 1;
                    currentNumber = array.get(i + 1);
                    System.out.println(array.get(i + 1) + " Current Number after reset");
                }
            }
        }
        for (int j = 0; j < compressedString.size(); j++) {
            System.out.print(compressedString.get(j) + " ");
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
        System.out.println(arrayLength);
            for (int i = 0; i < arrayLength; i++) {
            System.out.println(array.get(0));
        }
    }

    public static void printSpecificIndex(String input, int index){
        List<String> array = new ArrayList<>();
        try {
            array = writerToCSV.ReadingEntireTXTFile(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(array.get(0));
    }
}
