package StringUtils;

public class StringUtils {
    public static String[] split(String inputStream, String lineBreak) {

        if (inputStream == null || lineBreak == null || lineBreak.isEmpty()) {
            return new String[0]; // Return an empty array as there is nothing to split
        }


        return inputStream.split(java.util.regex.Pattern.quote(lineBreak));
    }
}
