package com.splab.algorithms.binaryTree;

import lombok.Data;

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
        public static void main(String[] args) {

            BinaryTree tree = new BinaryTree('A');
            tree.root.left = new Node('B');
            tree.root.right = new Node('C');
            tree.root.left.left = new Node('D');
            tree.root.left.right = new Node('E');
            tree.root.right.left = new Node('G');
            tree.root.right.right = new Node('H');
            tree.root.left.left.left = new Node('I');
            tree.root.left.left.right = new Node('J');
            tree.root.left.right.left = new Node('K');
            tree.root.left.right.right = new Node('Y');



            System.out.println("Depth tree traversal");
            tree.depthTreeTraversal(tree.root);

            System.out.println("\n\nbreadth tree traversal");
            tree.breadthFirstTraversal();
        }


    static class Node {
        char data;
        Node left, right;

        public Node(char item) {
            data = item;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        public BinaryTree(char rootData) {
            root = new Node(rootData);
        }

        public void breadthFirstTraversal() {
            if (root == null) return;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node tempNode = queue.poll();
                System.out.print(tempNode.data + " ");

                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }

                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
        }


        public void depthTreeTraversal(Node node) {
            if (node != null) {
                System.out.print(node.data + " ");
                depthTreeTraversal(node.left);
                depthTreeTraversal(node.right);
            }
        }
    }


}
