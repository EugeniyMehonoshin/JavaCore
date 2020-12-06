package javaCore.Lesson4;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebooks {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Лёха", 8786709);
        phoneBook.add("Лёха", 8904732);
        phoneBook.add("Дима", 8966133);
        phoneBook.add("Миша", 1254789);
        phoneBook.add("Борис", 8236594);


        phoneBook.get("Лёха");
    }
}

class PhoneBook {

   HashMap<String, HashSet<Integer>> phoneBook1;
   PhoneBook() {
       this.phoneBook1 = new HashMap<>();
   }

   void add(String name, int num1) {
       HashSet<Integer> phoneBook = phoneBook1.getOrDefault(name, new HashSet<>());
       phoneBook.add(num1);
       phoneBook1.put(name, phoneBook);
   }

   void get(String name) {

       System.out.printf("%nКонтакт "+name+": "+ phoneBook1.getOrDefault(name, new HashSet<>()));
   }
}
