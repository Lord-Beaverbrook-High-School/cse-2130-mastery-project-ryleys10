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
        int counter = 0;
        String currentNumber = array.get(0);
        List<String> compressedString = new ArrayList<>();
        //for (int i = 0; i < array.size(); i++) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " i at start\n");
            System.out.print(currentNumber + " currentnumber, ");
            System.out.print(array.get(i) + " get i\n");
            if (currentNumber.equals(array.get(i))) {
                System.out.println(array.get(i) + " get I");
                counter++; System.out.println(counter + " counter");
                String test = array.get(i);
                System.out.println(test + " test print");
                String test2 = array.get(i + 1);
                System.out.println(test2 + " test print 2");
                if (array.get(i).equals(array.get(i +1))) { //if (!test.equals(test2)){
                    //System.out.println(array.get(i) + " get I test " + array.get(i + 1) + " get I test+1");
                    System.out.println("entered loop");
                    compressedString.add(String.valueOf(counter)); System.out.println(counter + " added counter");
                    compressedString.add(array.get(i)); System.out.println(array.get(i) + " added I");
                    counter = 0;
                    currentNumber = array.get(i + 1);
                    System.out.println(array.get(i + 1) + " Current Number after reset");
                }
                System.out.println("");
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
