package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // 辞書クラスをインスタンス化
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べる単語リスト
        String[] wordsToCheck = { "apple", "banana", "grape", "orange" };

        // 各単語の意味を調べて出力
        for (String word : wordsToCheck) {
            String meaning = dictionary.searchWord(word);
            if (meaning != null) {
                System.out.println(word + "の意味は" + meaning);
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}
