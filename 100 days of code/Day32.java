public class Day32 {
    //remove allvowels
    public static String remVowels(String str){
        StringBuilder stringBuilder = new StringBuilder(str.length());

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u'){
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
        
        

    }
    public static void main(String[] args) {
        String str ="remove";
       System.out.println( remVowels(str));
    }
    
}
