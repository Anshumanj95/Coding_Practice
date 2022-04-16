package String;

public class SpecialStringAgain {
    public static int SpecialSubString(String s){
        int count=s.length();
        // to count consecutive characters that are the same
        int conse=1;
        // the middle index of a 3-character symmetry,assigned only once detected
        int midIndex=-1;
        // compare with previous character so start with i=1
        for (int i=1;i<s.length();i++){
            if (s.charAt(i) == s.charAt(i - 1)) {
                // Condition 1: All of the characters are the same
                // For n consecutive characters that are the same,
                // we have this formula:
                // Number of palindromic strings =
                //     (n-1) + (n-2) + ... + (n-(n-1))
                count+=conse;
                conse++;
                //Condition 2: All characters except the middle one
                // are the same
                if (midIndex>0){
                    // check for symmetry on both sides
                    // of the midIndex
                    if ((midIndex-conse)>=0 && s.charAt(midIndex-conse)==s.charAt(i))
                        count++;
                    else
                        // no more possibility of palindromic string
                        // with this midIndex
                        midIndex=-1;
                }
            }
            else {
                // reset consecutive chars counter to 1
                conse=1;
                // check for a 3-character symmetry
                if((i-2)>=0 && s.charAt(i-2)==s.charAt(i)){
                    count++; // 3-char symmetry is detected

                    // to check if the next characters are the same
                    // and symmetrical along the midIndex
                    midIndex=i-1;
                }
                else
                    midIndex=-1;
            }

        }
        return count;

    }
    public static void main(String[] args) {
        String s="abcbaba";
        System.out.println(SpecialSubString(s));

    }
}
