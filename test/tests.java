import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tests {
    @Test
    public void UsualChecker() throws IOException {
        ArrayList<Pair> botCheck = new ArrayList<>();
        botCheck.add(new Pair(1, "I'm something weak"));
        botCheck.add(new Pair(1, "You got me begging, begging"));
        botCheck.add(new Pair(1, "I'm on my knees"));
        botCheck.add(new Pair(3,"I don't wanna be needing your love"));
        botCheck.add(new Pair(2, "i dOn't waNNa be needing your love"));
        botCheck.add(new Pair(1, "I jUst wanna be deep in your love"));
        botCheck.add(new Pair(1, "I just wanna be deep in your love"));
        botCheck.add(new Pair(1, "And it's killing me when you're away, ooh, baby"));
        botCheck.add(new Pair(1, "'Cause I really don't care where you are"));
        botCheck.add(new Pair(1, "I just wanna be there where you are"));
        botCheck.add(new Pair(1, "And I gotta get one LITTLE taste"));
        botCheck.add(new Pair(2, "And I gotta get one little taste"));
        Uniq uniq = new Uniq(false, false,false,
                0,null, "checkFile.txt");

        uniq.runUniq();
        assertEquals(botCheck, uniq.getPairs());
    }

    @Test
    public void countChecker() throws IOException {
        ArrayList<Pair> botCheck = new ArrayList<>();
        botCheck.add(new Pair(1, "I'm something weak"));
        botCheck.add(new Pair(1, "You got me begging, begging"));
        botCheck.add(new Pair(1, "I'm on my knees"));
        botCheck.add(new Pair(3,"I don't wanna be needing your love"));
        botCheck.add(new Pair(2, "i dOn't waNNa be needing your love"));
        botCheck.add(new Pair(1, "I jUst wanna be deep in your love"));
        botCheck.add(new Pair(1, "I just wanna be deep in your love"));
        botCheck.add(new Pair(1, "And it's killing me when you're away, ooh, baby"));
        botCheck.add(new Pair(1, "'Cause I really don't care where you are"));
        botCheck.add(new Pair(1, "I just wanna be there where you are"));
        botCheck.add(new Pair(1, "And I gotta get one LITTLE taste"));
        botCheck.add(new Pair(2, "And I gotta get one little taste"));
        Uniq uniq = new Uniq(false, false,true,
                0,null, "checkFile.txt");

        uniq.runUniq();
        assertEquals(botCheck, uniq.getPairs());
    }

    @Test
    public void UniqChecker() throws IOException {
        ArrayList<Pair> botCheck = new ArrayList<>();
        botCheck.add(new Pair(1, "I'm something weak"));
        botCheck.add(new Pair(1, "You got me begging, begging"));
        botCheck.add(new Pair(1, "I'm on my knees"));
        botCheck.add(new Pair(1, "I jUst wanna be deep in your love"));
        botCheck.add(new Pair(1, "I just wanna be deep in your love"));
        botCheck.add(new Pair(1, "And it's killing me when you're away, ooh, baby"));
        botCheck.add(new Pair(1, "'Cause I really don't care where you are"));
        botCheck.add(new Pair(1, "I just wanna be there where you are"));
        botCheck.add(new Pair(1, "And I gotta get one LITTLE taste"));
        Uniq uniq = new Uniq(false, true,false,
                0,null, "checkFile.txt");

        uniq.runUniq();
        assertEquals(botCheck, uniq.getPairs());
    }

    @Test
    public void withNoRegChecker() throws IOException {
        ArrayList<Pair> botCheck = new ArrayList<>();
        botCheck.add(new Pair(1, "I'm something weak"));
        botCheck.add(new Pair(1, "You got me begging, begging"));
        botCheck.add(new Pair(1, "I'm on my knees"));
        botCheck.add(new Pair(5,"I don't wanna be needing your love"));
        botCheck.add(new Pair(2, "I jUst wanna be deep in your love"));
        botCheck.add(new Pair(1, "And it's killing me when you're away, ooh, baby"));
        botCheck.add(new Pair(1, "'Cause I really don't care where you are"));
        botCheck.add(new Pair(1, "I just wanna be there where you are"));
        botCheck.add(new Pair(3, "And I gotta get one LITTLE taste"));
        Uniq uniq = new Uniq(true, false,false,
                0,null, "checkFile.txt");
        uniq.runUniq();
        assertEquals(botCheck, uniq.getPairs());
    }
    @Test
    public void withNoCharChecker() throws IOException {
        ArrayList<Pair> botCheck = new ArrayList<>();
        botCheck.add(new Pair(1, "I'm something weak"));
        botCheck.add(new Pair(1, "You got me begging, begging"));
        botCheck.add(new Pair(1, "I'm on my knees"));
        botCheck.add(new Pair(3,"I don't wanna be needing your love"));
        botCheck.add(new Pair(2, "i dOn't waNNa be needing your love"));
        botCheck.add(new Pair(2, "I jUst wanna be deep in your love"));
        botCheck.add(new Pair(1, "And it's killing me when you're away, ooh, baby"));
        botCheck.add(new Pair(1, "'Cause I really don't care where you are"));
        botCheck.add(new Pair(1, "I just wanna be there where you are"));
        botCheck.add(new Pair(1, "And I gotta get one LITTLE taste"));
        botCheck.add(new Pair(2, "And I gotta get one little taste"));
        Uniq uniq = new Uniq(false, false,true,
                5,null, "checkFile.txt");

        uniq.runUniq();
        assertEquals(botCheck, uniq.getPairs());
    }

    @Test
    public void UniqAndCharIgnoreChecker() throws IOException {
        ArrayList<Pair> botCheck = new ArrayList<>();
        botCheck.add(new Pair(1, "I'm something weak"));
        botCheck.add(new Pair(1, "You got me begging, begging"));
        botCheck.add(new Pair(1, "I'm on my knees"));
        botCheck.add(new Pair(1, "And it's killing me when you're away, ooh, baby"));
        botCheck.add(new Pair(1, "'Cause I really don't care where you are"));
        botCheck.add(new Pair(1, "I just wanna be there where you are"));
        Uniq uniq = new Uniq(true, true,false,
                0,null, "checkFile.txt");

        uniq.runUniq();
        assertEquals(botCheck, uniq.getPairs());
    }

    @Test
    public void UniqWithNoCharChecker() throws IOException {
        ArrayList<Pair> botCheck = new ArrayList<>();
        botCheck.add(new Pair(1, "I'm something weak"));
        botCheck.add(new Pair(1, "You got me begging, begging"));
        botCheck.add(new Pair(1, "I'm on my knees"));
        botCheck.add(new Pair(1, "And it's killing me when you're away, ooh, baby"));
        botCheck.add(new Pair(1, "'Cause I really don't care where you are"));
        botCheck.add(new Pair(1, "I just wanna be there where you are"));
        botCheck.add(new Pair(1, "And I gotta get one LITTLE taste"));
        Uniq uniq = new Uniq(false, true,false,
                5,null, "checkFile.txt");

        uniq.runUniq();
        assertEquals(botCheck, uniq.getPairs());
    }



    @Test
    public void CheckerOutFile() throws IOException {

        Uniq uniq = new Uniq(false, false,true,
                0,"outFile.txt", "checkFile.txt");
        uniq.runUniq();
        uniq.printer();
        List<String> exp = new ArrayList<>(Files.readAllLines(Paths.get("exp.txt")));
        List<String> act = new ArrayList<>(Files.readAllLines(Paths.get("outFile.txt")));
        assertEquals(exp, act);
    }

    @Test
    public void CheckerOutFileWithUniq() throws IOException {

        Uniq uniq = new Uniq(true, true, true,
                0, "outFile.txt", "checkFile.txt");
        uniq.runUniq();
        uniq.printer();
        List<String> expU = new ArrayList<>(Files.readAllLines(Paths.get("expU.txt")));
        List<String> act = new ArrayList<>(Files.readAllLines(Paths.get("outFileU.txt")));
        assertEquals(expU, act);
    }

    @Test
    public void CheckerOutFileIgnoreReg() throws IOException {

        Uniq uniq = new Uniq(true, false, true,
                0, "outFile.txt", "checkFile.txt");
        uniq.runUniq();
        uniq.printer();
        List<String> expU = new ArrayList<>(Files.readAllLines(Paths.get("expI.txt")));
        List<String> act = new ArrayList<>(Files.readAllLines(Paths.get("outFile.txt")));
        assertEquals(expU, act);
    }
    @Test
    public void CheckerOutFileWithIgnoreChar() throws IOException {

        Uniq uniq = new Uniq(false, false, true,
                5, "outFile.txt", "checkFile.txt");
        uniq.runUniq();
        uniq.printer();
        List<String> expU = new ArrayList<>(Files.readAllLines(Paths.get("expS.txt")));
        List<String> act = new ArrayList<>(Files.readAllLines(Paths.get("outFile.txt")));
        assertEquals(expU, act);
    }

    @Test
    public void CheckerOutFileWithOutCounter() throws IOException {

        Uniq uniq = new Uniq(false, false,false,
                0,"outFile.txt", "checkFile.txt");
        uniq.runUniq();
        uniq.printer();
        List<String> exp = new ArrayList<>(Files.readAllLines(Paths.get("expC.txt")));
        List<String> act = new ArrayList<>(Files.readAllLines(Paths.get("outFile.txt")));
        assertEquals(exp, act);
    }

    @Test
    public void CheckerOutFileWithIgnoreCharAndReg() throws IOException {

        Uniq uniq = new Uniq(true, false,false,
                2,"outFile.txt", "checkFile2.txt");
        uniq.runUniq();
        uniq.printer();
        List<String> exp = new ArrayList<>(Files.readAllLines(Paths.get("expIN.txt")));
        List<String> act = new ArrayList<>(Files.readAllLines(Paths.get("outFile.txt")));
        assertEquals(exp, act);
    }
}
