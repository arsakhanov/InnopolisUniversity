package ru.arsakhanov.lesson32;

public class Node {
    public int key; //ключ узла
    public String data; //некоторые данные в узле
    public Node leftChild; //левый потомок
    public Node rightChild; //правый потомок

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", data='" + data + '\'' +
                '}';
    }

    /**
     * Метод который выводит на экран содержимое узла
     */
   /* public void printNode(){
        System.out.println("KEY " + key + " DATA: " + data);
    }*/

}
