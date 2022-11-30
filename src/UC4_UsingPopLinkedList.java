import java.util.LinkedList;

public class UC4_UsingPopLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push (56);
        stack.push(30);
        stack.push(70);
        int s = stack.pop();
        System.out.printf(s+" pop \n");
    }
}
