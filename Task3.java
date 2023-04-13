import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Введите число: ");
        int num1 = sc.nextInt();
        st.push(num1);

        while (true) {
            System.out.print("Введите действие: ");
            String operation = sc.next();
            if (operation.equals("Cancel")) {
                st.pop();
                System.out.println("Последнее действие отменено: ");
                System.out.println(st.peek());
            } else if (operation.equals("Stop")) {
                sc.close();
                break;

            } else {
                System.out.print("Ввод числа: ");
                int num2 = sc.nextInt();

                switch (operation) {
                    case "+" -> {
                        System.out.println(st.peek() + num2);
                        st.push(st.peek() + num2);
                    }
                    case "-" -> {
                        System.out.println(st.peek() - num2);
                        st.push(st.peek() - num2);
                    }
                    case "*" -> {
                        System.out.println(st.peek() * num2);
                        st.push(st.peek() * num2);
                    }
                    case "/" -> {
                        System.out.println(st.peek() / num2);
                        st.push(st.peek() / num2);
                    }
                    default -> System.out.println("Неверное действие");
                }

            }

        }

    }
}