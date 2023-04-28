package Structure.Tree;

import java.util.Comparator;


public class NodeMgmt {

    Node rootNode = null;

    Comparator<Integer> comparator = Comparator.naturalOrder();

    public class Node {
        Node left;
        Node right;
        Node parent;

        int value;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.parent = null;
        }
    }

    public boolean insertNode(int data) {

        if (this.rootNode == null) {
            this.rootNode = new Node(data);
        } else {
            Node node = rootNode;
            while (true) {
                Node nextNode = checkNode(node, data);
                if (node == nextNode) break;
                node = nextNode;
            }
        }
        return true;
    }

    public Node checkNode(Node nowNode, int insertValue) {

        int result = comparator.compare(nowNode.value, insertValue);

        if (result > 0) {
            if (nowNode.left != null) {
                return nowNode.left;
            } else {
                Node makeNode = new Node(insertValue);
                makeNode.parent = nowNode;
                nowNode.left = makeNode;
                return nowNode;
            }
        } else if (result == 0) {
            return nowNode;
        } else {
            if (nowNode.right != null) {
                return nowNode.right;
            } else {
                Node makeNode = new Node(insertValue);
                makeNode.parent = nowNode;
                nowNode.right = makeNode;
                return nowNode;
            }
        }
    }


    public Node findNode(int data) {
        if (rootNode == null) {
            return null;
        } else {
            Node node = checkNode(rootNode, data);
            while (true) {
                if (node.value == data) {
                    return node;
                }
                Node nextNode = checkNode(node, data);
                if (node == nextNode) {
                    break;
                }
                node = nextNode;
            }
        }
        return null;
    }

    public boolean removeNode(int data) {

        Node findNode = findNode(data);

        if (findNode == null) {
            return false;
        }

        if (findNode.left == null) {
            Node parent = findNode.parent;
            int result = comparator.compare(parent.value, findNode.value);

            if (result > 0) {
                parent.left = findNode.right;
            } else {
                parent.right = findNode.right;
            }
            return true;
        } else if (findNode.right == null) {
            Node parent = findNode.parent;
            int result = comparator.compare(parent.value, findNode.value);

            if (result > 0) {
                parent.left = findNode.left;
            } else {
                parent.right = findNode.left;
            }
            return true;
        }     else {
            Node prevNode = findNode.left;
            Node prevParent = prevNode.parent;
            while (prevNode.right != null) {
                prevParent = prevNode;
                prevNode = prevNode.right;
            }
            if (prevParent.right == prevNode) {
                prevParent.right = prevNode.left;
            } else {
                prevParent.left = prevNode.left;
            }
            findNode.value = prevNode.value;

            return true;
        }
    }
}

