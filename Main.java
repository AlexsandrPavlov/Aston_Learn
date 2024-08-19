import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"текст1", "текст1", "текст1", "текст1", "текст2", "текст1", "текст6", "текст5", "текст3", "текст3", "текст3", "текст3", "текст3", "текст3", "текст4", "текст3", "текст3", "текст3", "текст2", "текст2", "текст2"};

        System.out.println("Слово : количество таких слов в списке:");
        countUnique(words);


        Phonebook phonebook = new Phonebook();
        phonebook.add("Павлов", "+7 999 999-99-99");
        phonebook.add("Павлов", "+7 999 999-99-99");
        phonebook.add("Павлов", "+7 999 999-99-99");
        phonebook.add("Козлов", "+7 111 111-11-11");
        phonebook.add("Павлов", "+7 999 999-99-99");
        phonebook.add("Павлов", "+7 999 999-99-99");
        phonebook.add("Козлов", "+7 111 111-11-11");
        phonebook.add("Любов", "+7 222 222-22-22");
        phonebook.add("Любов", "+7 222 222-22-22");

        System.out.println("\n\nТелефонный справочник.");
        System.out.println("Фамилия : номер(а):");
        phonebook.show();
    }

    private static void countUnique(String[] words) {
        Map<String, Integer> numberOfWords = new LinkedHashMap<>();
        for (String word : words) {
            countWord(numberOfWords, word);
        }
        for (String word: numberOfWords.keySet()) {
            System.out.println(word + " : " + numberOfWords.get(word) + ".");
        }
    }

    private static void countWord(Map<String, Integer> numberOfWords, String word) {
        if (numberOfWords.containsKey(word)) {
            numberOfWords.put(word, numberOfWords.get(word) + 1);
        }
        else {
            numberOfWords.put(word,1);
        }
    }
}