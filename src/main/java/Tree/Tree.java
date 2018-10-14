package Tree;

public class Tree {

    public static void main(String[] args) {
        Node<String> osman = new Node<>("osman");

        Node<String> hulya = new Node<>("hulya");

        Node<String> ali = new Node<String>("ali", hulya);
        Node<String> veli = new Node<String>("veli", hulya);
        osman.addChild(hulya);
        Node<String> raziye = new Node<>("raziye");
        osman.addChild(raziye);

        System.out.println(osman.travel());

    }
}
