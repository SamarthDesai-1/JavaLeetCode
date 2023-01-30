public class UniqueMorseCodeWords {

    static String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    static char[] characters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    static int searchCharacters(char c) {
        for (int i = 0; i < characters.length; i++) {
            if (c == characters[i]) {
                return i;
            }
        }
        return -1;
    }

    static int concat(String[] s) {
        String temp = "";
        String[] result = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                int answer = searchCharacters(s[i].charAt(j));
                temp += code[answer];
            }
            result[i] = temp;
            temp = "";
        }
        int count = 0;
        for (int i = 0; i < s.length - 1; i++) {
            if (result[i].equals(result[i + 1])) {
                count++;
            }
        }
        System.out.println("Count -> " + count);

        if (count == 0) {
            return 1;
        }
        return count;
    }

    

   

    public static void main(String[] args) {
        // String[] names = {"zocd","gjkl","hzqk","hzgq","gjkl"};
        String[] names = {"gin","zen","gig","msg"};
        // String[] names = {"a"};
        // String[] names = {"vtpke","vngc","vnqr","gbzx","qvdx"};
        // String[] names = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
        int count = 0;
        System.out.println(concat(names));
       
    }

}