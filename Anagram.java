import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagram{
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	String word = scan.nextLine();
    HashMap<String, Integer> map= new HashMap<>();

    for(int i = 0; i < word.length(); i++){
        for(int j = i; j < word.length(); j++){
            char[] c = word.substring(i, j+1).toCharArray();
            Arrays.sort(c);

            String value = new String(c);
            if (map.containsKey(value))
                map.put(value, map.get(value)+1);
            else
                map.put(value, 1);
        }
    }
    int anagramPairCount = 0;
    for(String key: map.keySet()){
        int n = map.get(key);
        anagramPairCount += (n * (n-1))/2;
    }
    System.out.println(anagramPairCount);
	}
}

