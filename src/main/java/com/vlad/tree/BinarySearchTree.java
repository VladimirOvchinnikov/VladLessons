package com.vlad.tree;

import java.util.Objects;

public class BinarySearchTree {

    private NodeTree head;


    public void add(Integer value) {
        add0(value, head);
    }

    public void remove(Integer value) {
        NodeTree delNode = search(value, head);
        if (delNode == null) {
            return;
        }
        NodeTree node;//узел, что будет за место удаленного
        if (Objects.nonNull(delNode.getRight())) {
            node = delNode.getRight();
            while (Objects.nonNull(node.getLeft())) {
                node = node.getLeft();
            }
        } else {
            node = delNode.getLeft();
        }

        if (Objects.nonNull(delNode.getParent())) {//из-за головы
            if (Objects.equals(delNode.getParent().getRight(), delNode)) {
                delNode.getParent().setRight(node);
            } else {
                delNode.getParent().setLeft(node);
            }
        }
        if (Objects.nonNull(delNode.getLeft()) && !Objects.equals(delNode.getLeft(), node)) {
            delNode.getLeft().setParent(node);
        }
        if (Objects.nonNull(delNode.getRight()) && !Objects.equals(delNode.getRight(), node)) {
            delNode.getRight().setParent(node);
        }

        if (Objects.nonNull(node)) {

            if (!Objects.equals(delNode.getLeft(), node)) {
                if (!Objects.equals(delNode.getRight(), node)) {
                    if (Objects.nonNull(node.getRight())) {
                        node.getRight().setParent(node.getParent());
                    }
                    node.getParent().setLeft(node.getRight());
                    node.setRight(delNode.getRight());
                }
                node.setLeft(delNode.getLeft());
            }

            node.setParent(delNode.getParent());
        }

        if (Objects.equals(head, delNode)) {
            head = node;
        }
        delNode.setParent(null);
        delNode.setRight(null);
        delNode.setLeft(null);
    }


    public void remove1(Integer value) {
        NodeTree delNode = search(value, head);
        if (delNode == null) {
            return;
        }
        NodeTree node;//узел, что будет за место удаленного
        if (Objects.nonNull(delNode.getRight())) {
            node = delNode.getRight();
            while (Objects.nonNull(node.getLeft())) {
                node = node.getLeft();
            }
        } else {
            node = delNode.getLeft();
        }

        if (Objects.nonNull(delNode.getParent())) {//из-за головы
            if (Objects.equals(delNode.getParent().getRight(), delNode)) {
                delNode.getParent().setRight(node);
            } else {
                delNode.getParent().setLeft(node);
            }
        }
        if (Objects.nonNull(delNode.getLeft())) {
            delNode.getLeft().setParent(Objects.equals(delNode.getLeft(), node) ? null : node);
        }
        if (Objects.nonNull(delNode.getRight())) {
            delNode.getRight().setParent(Objects.equals(delNode.getRight(), node) ? null : node);
        }

        if (Objects.nonNull(node.getLeft())) {
            node.getLeft().setParent(node.getParent());
        }
        if (Objects.nonNull(node.getRight())) {
            node.getRight().setParent(node.getParent());
        }
        if (Objects.equals(node.getParent().getLeft(), node)) {
            node.getParent().setLeft(node.getRight());
        } else {
            node.getParent().setRight(node.getRight());
        }

        node.setLeft(delNode.getLeft());
        node.setRight(delNode.getRight());
        node.setParent(delNode.getParent());

//        if (Objects.nonNull(node)) {
//
//            if (!Objects.equals(delNode.getLeft(), node)) {
//                if (!Objects.equals(delNode.getRight(), node)) {
//                    if (Objects.nonNull(node.getRight())) {
//                        node.getRight().setParent(node.getParent());
//                    }
//                    node.getParent().setLeft(node.getRight());
//                    node.setRight(delNode.getRight());
//                }
//                node.setLeft(delNode.getLeft());
//            }
//
//            node.setParent(delNode.getParent());
//        }

        if (Objects.equals(head, delNode)) {
            head = node;
        }
        delNode.setParent(null);
        delNode.setRight(null);
        delNode.setLeft(null);
    }


    public int size(){
        int size = 0;
        int maxSize = 0;

        NodeTree node = head;

        while (node != null){
            size++;
            maxSize = Math.max(maxSize, size);
            node = getNode(node);
        }


        return maxSize;

    }

    public NodeTree getNode(NodeTree nodeTree){
        if (nodeTree == null){
            return null;
        }
        if (nodeTree.getLeft() != null){
            return nodeTree.getLeft();
        }else {
            return nodeTree.getRight();
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(50);
        tree.add(60);
        tree.add(55);
        tree.add(70);
        tree.add(40);
        tree.add(45);
        tree.add(30);
        tree.add(75);
        tree.add(71);
        tree.add(73);
        tree.add(72);
        tree.add(74);
        tree.add(76);
        tree.add(65);
        tree.add(77);
        tree.add(56);
        tree.add(31);
        tree.add(29);

//        tree.remove(76);
        System.out.println("asdasdasd " + tree.size());

    }


    private NodeTree search(Integer val, NodeTree node) {
        if (node == null) {
            return null;
        }
        if (Objects.equals(val, node.getValue())) {
            return node;
        } else if (isRight(val, node)) {
            return search(val, node.getRight());
        } else {
            return search(val, node.getLeft());
        }
    }

    private void add0(Integer value, NodeTree node) {
        if (node == null) {
            head = new NodeTree(value);
            return;
        }
        if (isRight(value, node)) {
            if (node.getRight() == null) {
                node.setRight(new NodeTree(value, node));
            } else {
                add0(value, node.getRight());
            }
        } else {
            if (node.getLeft() == null) {
                node.setLeft(new NodeTree(value, node));
            } else {
                add0(value, node.getLeft());
            }
        }
    }

    private boolean isRight(Integer val, NodeTree node) {
        return val > node.getValue();
    }

    public static class NodeTree {

        private Integer value;
        private NodeTree left;
        private NodeTree right;
        private NodeTree parent;

        public NodeTree(Integer value) {
            this.value = value;
        }

        public NodeTree(Integer value, NodeTree parent) {
            this.value = value;
            this.parent = parent;
        }

        public NodeTree(Integer value, NodeTree left, NodeTree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public NodeTree getLeft() {
            return left;
        }

        public void setLeft(NodeTree left) {
            this.left = left;
        }

        public NodeTree getRight() {
            return right;
        }

        public void setRight(NodeTree right) {
            this.right = right;
        }

        public NodeTree getParent() {
            return parent;
        }

        public void setParent(NodeTree parent) {
            this.parent = parent;
        }
    }

}
