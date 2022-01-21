package ch.ictbz.worttabelle.worttabelle;

import javafx.scene.control.TextArea;

import java.util.Hashtable;

public class WordTab {
    private Hashtable<String, Integer> words = new Hashtable<String, Integer>();


    public void addWord(String word) {
        if (words.containsKey(word)) {
            words.put(word, words.get(word) + 1);
        } else {
            words.put(word, 1);
        }
    }
    public String getTab() {
        return words.toString();
    }
    public void printTab(TextArea printTab) {
        printTab.textProperty().set(words.toString().replaceAll("[\\\\{\\\\}]", "").replace("=", " : "));
    }
}
