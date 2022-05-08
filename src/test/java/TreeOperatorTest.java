import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TreeOperatorTest {

    @Test
    public void treesShouldNotBeIdentical() {
        //Given
        Integer[] values = {5,3,7,2,5,1,0,null,null, null, null, null, null, 2,8, null,null,null,5};
        Tree tree = new Tree(values);
        Integer[] values2 = {5,3,7,1,5,1,0,null,null, null, null, null, null, 2,8, null,null,null,5};
        Tree tree2 = new Tree(values2);
        Integer[] values3 = {null,2 ,null};
        Tree tree3 = new Tree(values3);
        Integer[] values4 = {1};
        Tree tree4 = new Tree(values4);

        //When
        boolean expectedOutput = TreeOperator.checkIfIdentical(tree.getRoot(), tree2.getRoot());
        boolean expectedOutput2 = TreeOperator.checkIfIdentical(tree.getRoot(), tree3.getRoot());
        boolean expectedOutput3 = TreeOperator.checkIfIdentical(tree.getRoot(), tree4.getRoot());

        //Then
        assertFalse(expectedOutput);
        assertFalse(expectedOutput2);
        assertFalse(expectedOutput3);

    }

    @Test
    public void treesShouldBeIdentical() {
        //Given
        Integer[] values = {5,3,7,2,5,1,0,null,null, null, null, null, null, 2,8, null,null,null,5};
        Tree tree = new Tree(values);
        Integer[] values2 = {5,3,7,2,5,1,0,null,null, null, null, null, null, 2,8, null,null,null,5};
        Tree tree2 = new Tree(values2);
        Integer[] values3 = {null,2 ,null};
        Tree tree3 = new Tree(values3);
        Integer[] values4 = {null,2 ,null};
        Tree tree4 = new Tree(values4);

        //When
        boolean output = TreeOperator.checkIfIdentical(tree.getRoot(), tree2.getRoot());
        boolean output2 = TreeOperator.checkIfIdentical(tree4.getRoot(), tree4.getRoot());

        //Then
        assertTrue(output);
        assertTrue(output2);
    }

    @Test
    public void shouldFindRightLongestPath() {
        //Given
        Integer[] values = {5,3,7,2,5,1,0,null,null, null, null, null, null, 2,8, null,null,null,5};
        Tree tree = new Tree(values);
        Integer[] values2 = {null,null,null,null,null, null, null, null, null,null};
        Tree tree2 = new Tree(values2);
        Integer[] values3 = {null,2 ,5};
        Tree tree3 = new Tree(values3);
        Integer[] values4 = {1};
        Tree tree4 = new Tree(values4);
        List<Integer> expectedPath = Arrays.asList(5, 7, 0, 8, 5);
        List<Integer> expectedPath2 = new ArrayList<>();
        List<Integer> expectedPath3 = new ArrayList<>();
        List<Integer> expectedPath4 = Arrays.asList(1);


        //When
        ArrayList<Integer> longestPath= TreeOperator.longestPath(tree.getRoot());
        ArrayList<Integer> longestPath2= TreeOperator.longestPath(tree2.getRoot());
        ArrayList<Integer> longestPath3= TreeOperator.longestPath(tree3.getRoot());
        ArrayList<Integer> longestPath4= TreeOperator.longestPath(tree4.getRoot());

        //Then
        assertEquals(expectedPath, longestPath);
        assertEquals(expectedPath2, longestPath2);
        assertEquals(expectedPath3, longestPath3);
        assertEquals(expectedPath4, longestPath4);
    }

    @Test
    public void shouldCountLeaves() {
        //Given
        Integer[] values = {5,3,7,2,5,1,0,null,null, null, null, null, null, 2,8, null,null,null,5};
        Tree tree = new Tree(values);
        Integer[] values2 = {null,null,null,null,null, null, null, null, null,null};
        Tree tree2 = new Tree(values2);
        Integer[] values3 = {null,2 ,5};
        Tree tree3 = new Tree(values3);
        Integer[] values4 = {1};
        Tree tree4 = new Tree(values4);

        //When
        int leaves = TreeOperator.countLeaves(tree.getRoot());
        int leaves2 = TreeOperator.countLeaves(tree2.getRoot());
        int leaves3 = TreeOperator.countLeaves(tree3.getRoot());
        int leaves4 = TreeOperator.countLeaves(tree4.getRoot());

        //Then
        assertEquals(5, leaves);
        assertEquals(0, leaves2);
        assertEquals(0, leaves3);
        assertEquals(1, leaves4);

    }
}
