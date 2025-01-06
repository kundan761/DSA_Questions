public class RotationString {
    public static boolean isRotation(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        String newString = str1.concat(str1);
        return newString.contains(str2);
    }
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "bottlewater";
        System.out.println(isRotation(str1, str2));
    }
}
