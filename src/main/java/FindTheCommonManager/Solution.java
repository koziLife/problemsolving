package FindTheCommonManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _count = Integer.parseInt(in.nextLine());

        findTheCommonManager(_count, in);

    }

    public static String findTheCommonManager(final int count, final Scanner in){
        List<String> selectedEmployee = new ArrayList<>();
        Node<String> node = new Node<>();
        String manager= "";
        for (int i = 0; i < count; i++) {
            String line = in.nextLine();
            if(!line.contains(" ")){
                selectedEmployee.add(line);
            }else{
                String[] strings = line.split(" ");
                if(i == 2) {
                    manager = strings[0];
                    node = new Node<>(manager, null);
                    node.setLeftNode(new Node<>(strings[1]));
                }
                if(strings[0].equals(node.getValue())){
                    node.setRightNode(new Node<>(strings[1]));
                }else{
                    if(node.getLeftNode().equals(strings[0])){
                        node = new Node<>(strings[0]);
                        manager = strings[0];
                        node.setLeftNode(new Node<>(strings[1]));
                    }
                }



            }
        }
        return null;
    }
}

class Node<T>{
    private T value;
    private Node<T> parent;
    private Node<T> leftNode;
    private Node<T> rightNode;

    public Node(final T value) {
        this.value = value;
    }

    public Node() {
    }

    public Node(final T value, final Node<T> parent) {
        this.value = value;
        this.parent = parent;
    }

    public T getValue() {
        return value;
    }

    public void setValue(final T value) {
        this.value = value;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(final Node<T> parent) {
        this.parent = parent;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(final Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(final Node<T> rightNode) {
        this.rightNode = rightNode;
    }

}
