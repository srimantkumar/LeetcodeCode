package StringProblems;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flowered", "flower", "flow", "florida", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] strs) {
        String word;
        if(strs.length > 1)
            word = (strs[0].length() <= strs[1].length()) ? strs[0] : strs[1];
        else
            word = strs[0];
        StringBuilder str = new StringBuilder(word);

        for(int i = 0; i < strs.length; i++) {
            word = (strs[i].length() < str.length()) ? strs[i] : str.toString();
            for (int j = 0; j < word.length(); j++) {
                if (str.charAt(j) != strs[i].charAt(j)) {
                    str.delete(j, str.length());
                    break;
                }
            }
            if((word.length() < str.length()))
                str.delete(word.length(), str.length());
        }
        return str.toString();
    }

    //Optimal Solution
    static String longestCommonPrefix1(String[] strs) {
        String s=strs[0];

        for (int i=0;i<strs.length;i++){
            while(strs[i].indexOf(s)!=0){
                s = s.substring(0,s.length()-1);
                if(s.isEmpty()) return "";
            }
        }
        return s;
    }
}
