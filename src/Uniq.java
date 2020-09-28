import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Uniq {
    private boolean ignoreRegister;
    private boolean printOnlyUniqLines;
    private boolean printCountOfLines;
    private int numIgnoreChars;
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
        ArrayList<String> uniqStr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        if (!inFile.equals("")) {
            strings.addAll(Files.readAllLines(Paths.get(inFile)));
        } else {
            String line = in.nextLine();
            strings.add(line);
        }

        ArrayList<String> newStrings = new ArrayList<>();
        newString = strings.get(0);
        newStrings.add(newString);

        if (!ignoreRegister) {

            for (int i = 1; i < strings.size(); i++)
                if (!newString.substring(numIgnoreChars - 1).
                            equals(strings.get(i).substring(numIgnoreChars - 1))) {
                    newStrings.set(newStrings.size() - 1 , counter + " " + newString);
                    if (counter == 1) uniqStr.add(counter + " " + newString);
                    newString = strings.get(i);
                    counter = 1;
                    newStrings.add(newString);
                } else counter++ ;

        } else {
            for (int i = 1; i < strings.size(); i++)
                if (!newString.substring(numIgnoreChars - 1).toLowerCase()
                        .equals(strings.get(i).substring(numIgnoreChars - 1).toLowerCase())) {
                    newStrings.set(newStrings.size() - 1 , counter + " " + newString);
                    if (counter == 1) uniqStr.add(newString);
                    newString = strings.get(i);
                    counter = 1;
                    newStrings.add(newString);
                } else counter++ ;
        }
            newStrings.set(newStrings.size() - 1 , counter + " " + newString);


        if (printOnlyUniqLines) newStrings = uniqStr;
        if (!outFile.equals("")) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(outFile)));
            if (printCountOfLines) {
                for (String element : strings) {
                    writer.write(element);
                    writer.write("\n");
                }
            } else for (String element : strings) {
                writer.write(element.substring(element.indexOf(" ") + 1));
                writer.write("\n");
            }

        } else {
            if (printCountOfLines) {
                for (String element : newStrings) {
                    System.out.println(element);
                }
                System.out.println(1
                );
            } else {
                for (String element : newStrings) {
                    System.out.println(element.substring(element.indexOf(" ") + 1));
                }
            }
        }
    }
}