import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class writerToCSV {
    public static void WritingToCSV(String fileName, String data) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(data + ",");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void WritingToFile(String fileName, String data) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(data);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void AppendToFile(String fileName, String data) {
        try {
            FileWriter fw = new FileWriter(fileName, true);
            fw.write(data);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void AppendingToCSV(String fileName, String data, Boolean newLine) {
        try {
            FileWriter fw = new FileWriter(fileName, true);
            if (newLine) {
                fw.write("\n" + data + ",");
            }
            else {
                fw.write(data + ",");
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ClearingFile(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        fw.write("");
        fw.close();
    }

    public static void CopyingFile(String source, String destination) throws IOException {
        try{
            Files.deleteIfExists(Paths.get(destination)); // if file exists delete
            Files.copy(new File(source).toPath(), Paths.get(destination)); // copy from source to dest
        }
        catch (FileAlreadyExistsException e){
            e.printStackTrace();
        }
    }

    public static void ReadingFile(String fileName, int rows, int cols) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = null;
        List<String[]> lines = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            int counter = 0;
            System.out.println(counter);
            lines.add(line.split(","));
        }
        br.close();
        System.out.println(lines.get(rows)[cols]);
    }

    public static List<String[]> ReadingEntireCSVFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = null;
        List<String[]> lines = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            lines.add(line.split(","));
        }
        br.close();
        int rowslength = lines.size();
        System.out.println(lines.get(rowslength)[rowslength]);
        return lines;
    }
    public static List<String> ReadingEntireTXTFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = null;
        List<String> lines = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            //lines.add((line.split(" ")));
            lines = List.of((line.split(" ")));
            System.out.println("test " + lines);
            System.out.println(lines.size());
        }
        br.close();
        return lines;

    }
    //public static boolean CompareEntireFile(String file1, String file2) throws IOException {
    //    BufferedReader br1 = new BufferedReader(new FileReader(file1));
    //    BufferedReader br2 = new BufferedReader(new FileReader(file2));
    //    String line = null;
    //    List<String[]> lines1 = new ArrayList<>();
    //    List<String[]> lines2 = new ArrayList<>();
    //    while ((line = br1.readLine()) != null) {
    //        lines1.add(line.split(","));
    //    }
    //    while ((line = br2.readLine()) != null) {
    //        lines2.add(line.split(","));
    //    }
    //    int counter = 0;
    //    for (int i = 0; i < lines1.size(); i++) {
    //        for (int j = 0; j < lines2.size(); j++) {
    //            if (lines1.get(i)[i].equals(lines2.get(j)[i])) {
    //                continue;
    //            }
    //            if (lines1.get(i)[j].equals(lines2.get(j)[j])) {}
    //        }
    //    }
    //}
}
