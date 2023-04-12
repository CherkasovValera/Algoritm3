import java.util.Arrays;
import java.util.Scanner;

import static java.util.stream.Stream.iterate;

public class Main {
    static class ListNode {
        int value;


        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(4)))); // 1 -> 2 -> 2 -> 4
        System.out.println(size(node)); // 4
        asString(node); // [1 -> 2 -> 2 -> 4]
        System.out.println(getByIndex(node, 0)); // 1
        System.out.println(getByIndex(node, 3)); // 4
        System.out.println(getByIndex(node, 4)); // new IndexOutOfBoundsException

    }
    /**
     * Написать строковое представление списка в формате
     * [first_value -> second_value -> ... -> last_value]
     */
    static String asString(ListNode head) {
        ListNode iterat = head;
        StringBuilder builder = new StringBuilder();
        while (iterat != null) {
            builder.append(iterat.value);
            iterat = iterat.next;
            if (iterat == null) {
                break;
            } else
                builder.append("->");
        }
        String result = builder.toString();
        System.out.println("[" + result + "]");
        return null;
    }

    /**
     * Посчитать размер списка.
     */
    static int size(ListNode head) {
        ListNode iter = head;
        int count = 0;
        while (iter != null) {
            iter = iter.next;
            count++;
        }
        return count;
    }

    /**
     * Найти значение по индексу
     */
    static int getByIndex(ListNode head, int index) {
        if (head != null) {
            ListNode iter = head;
            int count = 0;
            while (count != index) {
                iter = iter.next;
                count++;
            }
            return iter.value;
        }
        return index;
    }
}