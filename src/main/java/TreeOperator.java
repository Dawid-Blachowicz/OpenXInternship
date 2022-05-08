import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class TreeOperator {

    public static int countLeaves(Node treeRoot){
        if (treeRoot == null)
            return 0;
        if (treeRoot.getLeftChild() == null && treeRoot.getRightChild() == null)
            return 1;
        else
            return countLeaves(treeRoot.getLeftChild()) + countLeaves(treeRoot.getRightChild());
    }

    public static ArrayList<Integer> longestPath(Node root) {
        if(root == null)
            return new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        Deque<Node> queue = new ArrayDeque<Node>();
        Node lastNode = root;
        queue.add(root);

        while(!queue.isEmpty()) {
            Node currentNode = queue.pop();
            if (currentNode.hasLeftChild()) {
                currentNode.getLeftChild().setParent(currentNode);
                lastNode = currentNode.getLeftChild();
                queue.add(lastNode);
            }
            if (currentNode.hasRightChild()) {
                currentNode.getRightChild().setParent(currentNode);
                lastNode = currentNode.getRightChild();
                queue.add(lastNode);
            }
        }
        queue.add(lastNode);

        while(!queue.isEmpty()){
            Node currentNode = queue.pop();
            output.add(currentNode.getValue());
            if(currentNode.hasParent()){
                currentNode.getParent();
                queue.add(currentNode.getParent());
            }
        }

        Collections.reverse(output);
        return output;
    }

    public static boolean checkIfIdentical(Node root, Node b)
    {
        if (root == null && b == null)
            return true;

        if (root != null && b != null)
            return (root.getValue() == b.getValue()
                    && checkIfIdentical(root.getLeftChild(), b.getLeftChild())
                    && checkIfIdentical(root.getRightChild(), b.getRightChild()));

        return false;
    }

}
