import java.util.Arrays;
import java.util.List;
class Solution {
    public boolean halvesAreAlike(String s) {
        List<String> vowel = Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");

    int a = 0, b = 0;

    for (int i = 0; i < s.length(); i++) {
      if (i < s.length()/2) {
        if (vowel.contains(String.valueOf(s.charAt(i))))
          a++;
      } else {
        if (vowel.contains(String.valueOf(s.charAt(i))))
          b++;
      }
    }

    return a == b;
    }
}