import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        MyArrayList<Integer> arrayList = new MyArrayList<>();
        Collection <Integer> newList = new ArrayList();
        System.out.println("Source array is empty.");
        System.out.println("");

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(7);
        System.out.println("ADD elements '1' '3' '7'");
        System.out.println("Rez:" + arrayList);
        System.out.println("");

        arrayList.add(2,9);
        System.out.println("ADD BY INDEX '9' in position 2");
        System.out.println("Rez:" + arrayList);
        System.out.println("");

        arrayList.add(5,1);
        System.out.println("ADD BY INDEX '1' in position 5");
        System.out.println("Rez:" + arrayList);
        System.out.println("");

        newList.add(4);
        newList.add(4);
        newList.add(4);
        arrayList.addAll(1,newList);
        System.out.println("ADDALL BY INDEX ('4','4','4') in position 1");
        System.out.println("Rez:" + arrayList);
        System.out.println("");

        newList.clear();
        newList.add(9);
        newList.add(9);
        newList.add(9);
        arrayList.addAll(10,newList);
        System.out.println("ADDALL BY INDEX ('9','9','9') in position 10");
        System.out.println("Rez:" + arrayList);
        System.out.println("");

        System.out.println("Element with index 4:");
        System.out.println("Rez:" + arrayList.get(4));
        System.out.println("");

        arrayList.set(0,8);
        System.out.println("Set '8' in position 0:");
        System.out.println("Rez:" + arrayList);
        System.out.println("");

        arrayList.remove(3);
        System.out.println("Del element with index 3:");
        System.out.println("Rez:" + arrayList);
        System.out.println("");

        System.out.println("List from 1 to 5:");
        System.out.println("Rez:" + arrayList.subList(1,5));
        System.out.println("");

        System.out.println("First index of value '9':");
        System.out.println("Rez:" + arrayList.indexOf(9));
        System.out.println("");

        System.out.println("Last index of value '9':");
        System.out.println("Rez:" + arrayList.lastIndexOf(9));
        System.out.println("");

    }

}