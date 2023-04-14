
public class Solution {

    public String removeStars(String input) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); ++i) {
            if (input.charAt(i) == '*') {
                result.setLength(result.length() - 1);
            } else {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
}
