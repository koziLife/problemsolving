import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Skyscanner2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _count;
        _count = Integer.parseInt(in.nextLine());

        OutputMostPopularDestination(_count, in);
    }

    public static void OutputMostPopularDestination(final int count, final Scanner in) {
        Node<String> tree = null;
        List<String> selectedEmployees = new ArrayList<>();
        List<String> uniqueEmployees = new ArrayList<>();

        boolean isGeneralManager = true;
        while (uniqueEmployees.size() < count) {
            String line = in.nextLine();
            if (!line.contains(" ")) {
                selectedEmployees.add(line);
            } else {
                String[] employees = line.split(" ");
                if (isGeneralManager) {
                    tree = new Node<>(employees[0]);
                    uniqueEmployees.add(employees[0]);
                    tree.addChild(new Node<>(employees[1]));
                    uniqueEmployees.add(employees[1]);
                    isGeneralManager = false;
                } else {
                    if (uniqueEmployees.contains(employees[0])) {

                    }
                }
            }

        }
    }
}


class Node<T> {
    private T data;
    private Node<T> parent;
    private List<Node<T>> children;

    public Node(final T data) {
        this.data = data;
    }

    public void addChild(Node<T> child) {
        if (children == null)
            children = new ArrayList<>();

        children.add(child);
    }

}

