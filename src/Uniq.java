import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Uniq {
    private boolean ignoreRegister;
    private boolean printOnlyUniqLines;
    private boolean printCountOfLines;
    private Integer numIgnoreChars;
    private String outFile;
    private String inFile;
    private ArrayList<Pair> countAndString = new ArrayList<>();

    public Uniq(boolean ignoreRegister, boolean printOnlyUniqLines, boolean printCountOfLines,
                int numIgnoreChars, String outFile, String inFile) {
        this.ignoreRegister = ignoreRegister;
        this.printOnlyUniqLines = printOnlyUniqLines;
        this.printCountOfLines = printCountOfLines;
        this.numIgnoreChars = numIgnoreChars;
        this.outFile = outFile;
        this.inFile = inFile;
    }

    public void runUniq() throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        if (inFile != null) {
            strings.addAll(Files.readAllLines(Paths.get(inFile)));
        } else {
            String line = in.nextLine();
            strings.add(line);
        }

        String newString = strings.get(0);
        int counter = 1;

        countAndString.add(new Pair(counter, newString));

        if (ignoreRegister) newString = newString.toLowerCase();

        for (int i = 1; i < strings.size(); i++) {
            String checkString = newString;

            if (ignoreRegister) {
                newString = strings.get(i).toLowerCase();
            }

            else{
                newString = strings.get(i);
            }
            if (!newString.substring(numIgnoreChars).equals(checkString.substring(numIgnoreChars))) {
                countAndString.get(countAndString.size()  -1).setFirst(counter);
                countAndString.add(new Pair(counter, strings.get(i)));
                counter = 1;
            } else counter++;
        }
        countAndString.get(countAndString.size()  -1).setFirst(counter);
        printer();
    }
    public void printer() throws IOException{
        BufferedWriter writer ;
        if (outFile != null)  writer = new BufferedWriter(new FileWriter(new File(outFile)));
        else  writer = new BufferedWriter(new OutputStreamWriter(System.out));

        if (printOnlyUniqLines){
            ListIterator<Pair> iter = countAndString.listIterator();
            while(iter.hasNext()) if (iter.next().first() != 1) iter.remove();
        }

        if (printCountOfLines) {
            for (Pair element : countAndString) {
                writer.write(element.toString());
                writer.newLine();
            }
        } else for (Pair element : countAndString) {
            writer.write(element.second());
            writer.newLine();
        }
        writer.flush();
    }
    public ArrayList<Pair> getPairs(){
        return countAndString;
    }
}