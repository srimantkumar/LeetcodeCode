import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test extends ArrayList {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Arrays.stream(arr).forEach(i -> System.out.println(i));

        //long x = 4294967295;

    }

    static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
}


/*
1. ⌃G (macOS), Alt+J (Windows/Linux) to find and select the next occurrence of the word. This is case-sensitive search
2. ⌃⌘G (macOS), or Ctrl+Alt+Shift+J to select all matching words in the document rather than selecting one at a time.
3. ⌃⇧G (macOS), or Alt+Shift+J (Windows/Linux) to remove the selection from the last selected occurrence.
4. To skip an occurrence, use ⌘G (macOS), F3 (Windows/Linux)
5. To go back to the last selected occurrence, use ⇧⌘G (macOS), or Shift+F3 (Windows/Linux).
 */