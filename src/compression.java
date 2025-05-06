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
        int counter = 0;
        String currentNumber = array.get(0);
        List<String> compressedString = new ArrayList<>();
        //for (int i = 0; i < array.size(); i++) {
        for (int i = 0; i < 100; i++) {
            //System.out.println(i + " i at start, " + currentNumber + " currentNumber, " + counter + " counter ");
            if (currentNumber.equals(array.get(i))) {
                counter++; //System.out.println(counter + " counter");
                if (!array.get(i).equals(array.get(i + 1))) { //if (!test.equals(test2)){
                    compressedString.add(String.valueOf(counter));
                    compressedString.add(array.get(i));
                    counter = 0;
                    currentNumber = array.get(i + 1);
                }
            }
        }
        System.out.println("Compressed String: ");
        for (int i = 0; i < compressedString.size(); i++) {
            currentNumber = compressedString.get(i);
            System.out.print(currentNumber + "");
            writerToCSV.AppendToFile(output, currentNumber);
        }

        //for (int j = 0; j < compressedString.size(); j++) {
        //    System.out.print(compressedString.get(j) + " ");
    }


    public static void printTest(String input) {
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

    public static void printSpecificIndex(String input, int index) {
        List<String> array = new ArrayList<>();
        try {
            array = writerToCSV.ReadingEntireTXTFile(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(array.get(0));
    }
}
