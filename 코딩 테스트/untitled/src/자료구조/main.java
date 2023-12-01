package 자료구조;

public class main {
    public static void main(String[] args) {
        Node<Integer> curr = new Node<>(3);
        Node<Integer> curr2 = new Node<>(4);

        Node<Integer> copy = curr;
        curr = curr2;

        System.out.println(copy.getItem());
    }
}
