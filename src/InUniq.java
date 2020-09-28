import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.io.IOException;

public class InUniq {
    @Option(name = "-i")
    private boolean ignoreRegister = false;

    @Option(name = "-u")
    private boolean printOnlyUniqLines = false;

    @Option(name = "-c")
    private boolean printCountOfLines = false;

    @Option(name = "-s")
    private int numIgnoreChars = 0;

    @Option(name = "-o")
    private String outFile = "";

    @Argument()
    private String inFile = "";

    public static void main(String[] args) throws IOException {
        new InUniq().launch(args);
    }

    public void launch(String[] args) throws IOException {
        CmdLineParser parser = new CmdLineParser(this);
        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            System.err.println("You are mistaken");
            parser.printUsage(System.err);
            System.exit(-2);
        }
        Uniq uniq = new Uniq(ignoreRegister, printOnlyUniqLines, printCountOfLines, numIgnoreChars,  outFile, inFile);
        uniq.runUniq();
    }
}
