import java.util.HashMap;
import java.util.LinkedList;

public class DifferenceChecker {
    /**
     * @param sample  the original text that you want to compare to
     * @param compare the text you want to compare to the original
     * @return the number of character difference
     */
    public static int getDifferenceSum(String sample, String compare) {
        diff_match_patch dmp = new diff_match_patch();
        LinkedList<diff_match_patch.Diff> diff = dmp.diff_main(sample, compare);

//        dmp.diff_cleanupSemantic(diff);

        int sum = 0;

        for (int i = 0; i < diff.size(); i++) {

            diff_match_patch.Operation operation = diff.get(i).operation;
            String text = diff.get(i).text;

            if (operation == diff_match_patch.Operation.EQUAL) {
                continue;
            }
            if (operation == diff_match_patch.Operation.DELETE) {
                text = text.replaceAll("[*]*", "");
                sum -= text.length();
                continue;
            }

            sum += text.length();
        }


        return sum;
    }

}
