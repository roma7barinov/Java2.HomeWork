package HomeWork.lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Directory {

    private  HashMap<String , HashSet<String>> map = new HashMap<>();
    private HashSet<String> phoneList;




    public void add(String surname, String phone){
        if(map.containsKey(surname)){
            phoneList = map.get(surname);
            phoneList.add(phone);
            map.put(surname,phoneList);

        } else {
            phoneList = new HashSet<>();
            phoneList.add(phone);
            map.put(surname,phoneList);
        }



    }
    public void get(String surname){
        System.out.println(map.get(surname));
    }

}
