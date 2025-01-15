public class TokenizeString{
    public static String[] tokenize(String str){
        int wordCount = 0;
        for (char c : str.toCharArray()) {
            if(c == ' '){
                wordCount++;
            }
        }
        String [] words = new String[wordCount + 1];
        String word = "";
        int index = 0;
        for (char c : str.toCharArray()) {
            if(c == ' '){
                words[index++] = word;
                word = "";
            }else{
                word += c;
            }
        }
        words[index] = word;
        return words;
    }
    public static void main(String[] args) {
        String str = "Hello world Java Programming";
        // String [] tokens = str.split(" "); // using inbuilt method
        String [] tokens = tokenize(str); // manual
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
