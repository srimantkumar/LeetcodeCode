package OneDimensionalArrayProblems;

import java.util.HashMap;

public class Question_383 {
    public static void main(String[] args) {
        Question_383 obj = new Question_383();
        System.out.println(obj.ransome_note("aablzxi", "azihgtlbareexcr"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int count = 0;

        for(int i=0; i < ransomNote.length(); i++) {
            for (int j=0; j < magazine.length(); j++) {
                if(magazine.charAt(j) == ransomNote.charAt(i)) {
                    magazine = magazine.replaceFirst(String.valueOf(magazine.charAt(j)),"");
                    System.out.print(magazine + "\t");
                    count ++;
                    break;
                }
            }
        }
        return (count == ransomNote.length());
    }


    public boolean ransomeNote(String ransomeNote, String mangazine) {
        for(int i=0; i < ransomeNote.length(); i++) {
            char r = ransomeNote.charAt(i);

            int matchingIndex = mangazine.indexOf(r);
            //System.out.println(matchingIndex);
            if (matchingIndex == -1)
                return false;


            mangazine = mangazine.substring(0, ((i == 0) ? 1 : i)) + mangazine.substring(i+1);
            System.out.println(mangazine);
        }
        return true;
    }

    public boolean ransome_note(String ransomeNote, String magazine)  {
        HashMap<Character, Integer> magazineHash = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);
            int characterCount = magazineHash.getOrDefault(m, 0);
            magazineHash.put(m, characterCount + 1);
        }

        for(int j = 0; j < ransomeNote.length(); j++) {
            char r = ransomeNote.charAt(j);
            int characterCount = magazineHash.getOrDefault(r, 0);

            if (characterCount == 0)
                return false;

            magazineHash.put(r, characterCount - 1);
        }
        return true;
    }
}
