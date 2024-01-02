package codechefPractice;

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = 4;
        
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
         list1.add(read.nextInt());
        }
        
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
         list2.add(read.nextInt());
        }
        
        Set<Integer> union = new TreeSet<>();
        for (int i = 0; i < list1.size(); i++) {
         union.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
         union.add(list2.get(i));
        }
        
        System.out.println("Union of the lists: " + union);
    }
    //  System.out.println("Union of the lists: " + union);
}
