package ru.arsakhanov.lesson32;

public class LeafCount {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.insert(5, null);
        bt.insert(10, null);
        bt.insert(3, null);
        bt.insert(15, null);
        bt.insert(17, null);
        bt.insert(8, null);
        bt.insert(4, null);
        bt.insert(20, null);
        bt.insert(12, null);
        bt.insert(23, null);

        int count = bt.printLevelOrder();
        System.out.println("Количетсво листьев в дереве: " + count);
    }
}
