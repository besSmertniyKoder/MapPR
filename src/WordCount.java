import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras non ornare arcu, id suscipit risus. Phasellus congue posuere lacus sollicitudin tincidunt. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed iaculis ac quam a mollis. Proin vel tellus vel ipsum auctor lobortis. Praesent nec efficitur diam. Nam at mollis nunc. Cras lacinia dolor id enim lobortis, et ultrices urna convallis.";
        String[] words = inputString.split("\\s+");
        Map<String, Integer> wordFrequncy = new HashMap<>();
        for (String word:words){
            word = word.toLowerCase();
            wordFrequncy.put(word, wordFrequncy.getOrDefault(word,0)+1);

        }
        System.out.println(wordFrequncy);
    }

}
