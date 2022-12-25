public class StringCompression {
    public static String compressString(String str){
        StringBuilder newStr = new StringBuilder("");
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(count);
            }
        }
        return newStr.toString();
    }
    public static void main(String args[]){
        String decompressedString = "abc";
        System.out.println(compressString(decompressedString));
    }
}
