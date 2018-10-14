package Tree;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    private T value;
    private Node<T> parent;
    private List<Node<T>> children = new ArrayList<Node<T>>();

    public Node(final T value) {
        this.value = value;
    }

    public Node(final T value, final Node<T> parent) {
        this.value = value;
        parent.addChild(this);
        this.parent = parent;

    }

    public T getValue() {
        return value;
    }

    public void setParent(final Node<T> parent) {
        parent.addChild(this);
        this.parent = parent;
    }

    public void setChildren(final List<Node<T>> children) {
        this.children = children;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void addChild(Node<T> node){
        node.parent = this;
        this.children.add(node);
    }

    public boolean isLeaf(){
        return (children.size() == 0);
    }

    public boolean isRoot(){
        return (this.parent == null);
    }

    public String travel(){
        StringBuilder builder = new StringBuilder();
        if(this.isLeaf()){
            builder.append("\n"+this.value);

        }else{
            builder.append("\n"+this.value );
            for (Node<T> node: this.getChildren()){
                builder.append(node.travel() );
            }
        }
        return builder.toString();
    }

}
