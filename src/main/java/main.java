public class main {
    public static void main(String[] args){
        Integer[] values = {5,3,7,2,5,1,0,null,null, null, null, null, null, 2,8, null,null,null,5};
        Tree tree = new Tree(values);
        System.out.println(tree);

        Integer[] values2 = {5,3,7,1,5,1,0,null,null, null, null, null, null, 2,8, null,null,null,5};
        Tree tree2 = new Tree(values2);

    }
}
