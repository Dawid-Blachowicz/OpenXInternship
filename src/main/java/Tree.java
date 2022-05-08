import java.util.*;

public class Tree {
    private Node root = null;
    private Integer[] values;

    public Tree(Integer[] values) {
        this.values = values;
        createTree(values);
    }

    public Node getRoot() {
        return root;
    }

    private void createTree(Integer[] values){
        if(values[0] ==null)
            return;

        Deque<Node> queue = new ArrayDeque<Node>();
        root = new Node(values[0]);

        queue.add(root);
        int i=1;
        while(!queue.isEmpty() && i != values.length ){
            Node currentNode = queue.pop();
            if(values[i]!=null){
                currentNode.setLeftChild(new Node(values[i]));
                queue.add(currentNode.getLeftChild());
            }
            if(values[i+1]!=null){
                currentNode.setRightChild(new Node(values[i+1]));
                queue.add(currentNode.getRightChild());
            }

            i+=2;
        }
    }

}
