public class Node {
    private Integer value;
    private Node leftChild;
    private Node rightChild;

    private Node parent;

    public Node(){
        this(null,null,null);
    }
    public Node (Integer value){
        this(value, null, null);
    }
    public Node(Integer value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public boolean hasLeftChild(){
        return (leftChild != null);
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public boolean hasRightChild(){
        return (rightChild != null);
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public boolean hasParent(){
        return (parent != null);
    }
}
