import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

public class Task2 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Введите длину списка: ");
        int listSize = sc.nextInt();

        for (int i = 0; i < listSize; i++)
            linkedList.add(rnd.nextInt(100));
        System.out.println(linkedList);

        System.out.println("Введите число для добавления: ");
        int number = sc.nextInt();
        System.out.println(enqueue(linkedList, number));

        System.out.println("Удаляем первый элемент. ");
        System.out.println(dequeue(linkedList));
        System.out.println(linkedList);

        System.out.println("Выводим первый элемент. ");
        System.out.println(first(linkedList));
        System.out.println(linkedList);

    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int number) {
        list.add(number);
        return list;

    }

    public static int dequeue(LinkedList<Integer> list) {
        return list.removeFirst();

    }

    public static int first(LinkedList<Integer> list) {
        return list.getFirst();

    }
}