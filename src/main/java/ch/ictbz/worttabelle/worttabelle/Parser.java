package ch.ictbz.worttabelle.worttabelle;

public class Parser {
    private WordTab wordTab;
    public Parser(WordTab wordTab) {
        this.wordTab = wordTab;
    }

    public void parse(String text) {
        String[] textArray;
        text = text.replaceAll("[^a-zA-Z0-9\\u0020]", "");
        textArray = text.split("\\u0020");
        for (int i = 0; i < textArray.length; i++) {
            wordTab.addWord(textArray[i]);
        }
    }
}
