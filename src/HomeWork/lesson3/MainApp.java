package HomeWork.lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class MainApp {
    public static void main(String[] args) {

        stringArrays();
        telephoneDirectory();

    }

    private static void telephoneDirectory() {

    Directory directory = new Directory();

        directory.add("Barinov", "89611514142");
        directory.add("Elshina", "9634045331");
        directory.add("Popov", "84876251232");
        directory.add("Lysenko", "8748299344");
        directory.add("Barinov", "89611513142");
        directory.add("Barinov", "89612514142");

        directory.get("Barinov");




    }

    private static void stringArrays() {
        String[] words = {"bean","engineer","zip","possession","live",
                           "liver","cat","love","dog","love",
                           "zip","slip","word","possession","love"};

        HashMap <String, Integer> map = new HashMap();


        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i]))
                map.put(words[i], map.get(words[i]) + 1);
            else
                map.put(words[i], 1);

        }

        System.out.println(map);
    }
}
