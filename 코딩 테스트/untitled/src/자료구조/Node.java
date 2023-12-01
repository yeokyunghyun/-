package 자료구조;

public class Node<T>{
    private T item = null;
    private Node<T> prev = null;
    private Node<T> next = null;
    public Node(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
