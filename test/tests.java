
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

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

        ArrayList<Pair> expected = uniq.runUniq();

       assertEquals(botCheck, expected);
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

        ArrayList<Pair> expected = uniq.runUniq();
        assertEquals(botCheck, expected);
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

        ArrayList<Pair> expected = uniq.runUniq();
        assertEquals(botCheck, expected);
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

        ArrayList<Pair> expected = uniq.runUniq();
        assertEquals(botCheck, expected);
    }

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
        Uniq uniq = new Uniq(true, false,true,
                5,null, "checkFile.txt");

        ArrayList<Pair> expected = uniq.runUniq();
        assertEquals(botCheck, expected);
    }

}
