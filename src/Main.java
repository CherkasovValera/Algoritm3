import java.util.Arrays;

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
//        asString(node); // [1 -> 2 -> 2 -> 4]
//        ListNode third = new ListNode(3);
//        ListNode second = insertFirst(third,2);
//        ListNode first = insertFirst(second,1);
//        third.next = first; //Замыкание списиска
//        iterate(first);
//        ListNode head = insertFirst(first,0);
//        iterate(head);
//        insertLast(head, 4);
//        iterate(head);

//        ListNode firs = new ListNode(1, new ListNode(2,new ListNode(3)));
//        ListNode sec = new ListNode(1, new ListNode(2,new ListNode(2,new ListNode(4))));
//        ListNode merge = merge(firs,sec);
//        iterate(merge);
//        System.out.println(merge);
    }

//    private static void iterate(ListNode merge) {
//    }

/**
 * Написать строковое представление списка в формате
 * [first_value -> second_value -> ... -> last_value]
 */
    static String asString(ListNode head) {
        ListNode iterat = head;
        StringBuilder builder =new StringBuilder();
        while (iterat != null){
            builder.append(iterat.value);
            iterat = iterat.next;
            if(iterat==null){
                break;
            }else
            builder.append("->");
        }String result = builder.toString();
        System.out.print("["+result+"]");
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
     *
     * Распечатать все элементы связанного списка
     */
//    static  void  iterate(ListNode node){
//        ListNode iter = node;// [1,->2}
//        while (iter != null) {
//            System.out.print(iter.value +"->");
//            iter = iter.next;
//        }
//        System.out.println("null");
//    }
    /**
     * Создать список, полученный из head прибавлением value в начало
     */
//    static ListNode insertFirst(ListNode head, int value){
//        return new ListNode(value,head);
//    }
    /**
     * добавляем к существующему в конец значение value
     */
//    static void  insertLast(ListNode head, int value){
//        ListNode last = new ListNode (value);
//        ListNode iter = head;
//        while (iter.next != null){
//            iter = iter.next;
//        }
//        iter.next = last;
//    }
    /**
     * Даны два отсортированных связанных списка
     * надо их смержить и получить новый отсортированный связанный список
     * (1,2,3),(1,2,2,4)->(1,1,2,2,2,3,4)
     */
//    static ListNode merge(ListNode first, ListNode second) {
//        ListNode head = null; // 1 -> 1 -> 2
//        ListNode iterator = null; // 2
//        while (first != null || second != null) {
//            int nextValue = -1; // 2
//
//            if (first == null) { // second != null
//                nextValue = second.value;
//                second = second.next;
//            } else if (second == null) {
//                nextValue = first.value;
//                first = first.next;
//            } else if (first.value > second.value) {
//                nextValue = second.value;
//                second = second.next;
//            } else { // if (first.value <= second.value) {
//                nextValue = first.value;
//                first = first.next;
//            }
//
//            if (head == null) {
//                head = new ListNode(nextValue);
//                iterator = head;
//            } else {
//                iterator.next = new ListNode(nextValue);
//                iterator = iterator.next;
//            }
//        }
//        return head;
//    }
}