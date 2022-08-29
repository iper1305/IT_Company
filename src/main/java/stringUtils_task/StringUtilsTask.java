package stringUtils_task;
import it_1.logs.Log;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;

public class StringUtilsTask {
    private static final File FILE = new File("/Users/irinaperepada/IdeaProjects/solvd/src/main/resources/qa_automation_description.txt");

    public static void getText(){
        String myText = null;
        try {
            myText = FileUtils.readFileToString(FILE, StandardCharsets.UTF_8);
        } catch (Exception exception) {
            Log.info(exception.getMessage());
        }
        Log.info("The 'QA' word occurs " + StringUtils.countMatches(myText, "QA") + " times in the text.");
    }
}


