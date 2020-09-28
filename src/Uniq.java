import javafx.util.Pair;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Uniq {
    private boolean ignoreRegister;
    private boolean printOnlyUniqLines;
    private boolean printCountOfLines;
    private Integer numIgnoreChars;
    private String outFile;
    private String inFile;
    private String newString;


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


        int counter = 1;

        ArrayList<String> strings = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        if (inFile != null) {
            strings.addAll(Files.readAllLines(Paths.get(inFile)));
        } else {
            String line = in.nextLine();
            strings.add(line);
        }

        ArrayList<Pair<Integer, String>> countAndString = new ArrayList<>();
        ArrayList<String> newStrings = new ArrayList<>();
        newString = strings.get(0);
        countAndString.add(new Pair(1, newString));

        for (int i = 1; i < strings.size(); i++)
            if (!newString.substring(numIgnoreChars).toLowerCase()
                    .equals(strings.get(i).substring(numIgnoreChars).toLowerCase())) {
                newStrings.set(newStrings.size() - 1 , counter + " " + newString);
                newString = strings.get(i);
                counter = 1;
                newStrings.add(newString);
            } else counter++ ;
         newStrings.set(newStrings.size() - 1 , counter + " " + newString);

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        if (outFile != null) writer = new BufferedWriter(new FileWriter(new File(outFile)));;

        if (printCountOfLines) {
            for (String element : strings) {
                writer.write(element);
                writer.write("\n");
            }
        } else for (String element : strings) {
            writer.write(element.substring(element.indexOf(" ") + 1));
            writer.write("\n");
        }


    }
}