import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернёет «перевёрнутый» список

public class Task1 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> newList;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Введите длину списка: ");
        int listSize = sc.nextInt();
        sc.close();

        for (int i = 0; i < listSize; i++)
            linkedList.add(rnd.nextInt(100));
        System.out.println(linkedList);

        newList = revers(linkedList, listSize);
        System.out.println(newList);

    }

    public static LinkedList<Integer> revers(LinkedList<Integer> list, int size) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < size; i++)
            newList.addFirst(list.pop());
        return newList;
    }


}



