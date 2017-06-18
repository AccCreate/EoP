
public class P107_11 {
    public static void main(String args[]){
        System.out.println(sinusoidalString("Hello_World."));
    }


    public static String sinusoidalString(String word){
        StringBuilder result = new StringBuilder();

        for(int i = 1; i < word.length(); i += 4)
            result.append(word.charAt(i));

        for(int i = 0; i < word.length(); i += 2)
            result.append(word.charAt(i));

        for(int i = 3; i < word.length(); i += 4)
            result.append(word.charAt(i));

        return result.toString();
    }
}
