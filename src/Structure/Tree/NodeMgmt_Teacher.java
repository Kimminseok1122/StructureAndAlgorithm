package Structure.Tree;


public class NodeMgmt_Teacher {

    Node head = null;

    public class Node {
        Node left;
        Node right;

        int value;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            Node findeNode = this.head;
            while (true) {
                if (data < findeNode.value) {
                    if (findeNode.left != null) {
                        findeNode = findeNode.left;
                    } else {
                        findeNode.left = new Node(data);
                        break;
                    }
                } else {
                    if (findeNode.right != null) {
                        findeNode = findeNode.right;
                    } else {
                        findeNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node search(int data) {
        if (this.head != null) {
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.value == data) {
                    return findNode;
                } else if (data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }

        }
        return null;
    }

    public boolean delete(int value) {
        boolean searched = false;

        Node currParentNode = this.head;
        Node currNode = this.head;

        if (this.head == null) {
            return false;
        } else{
            if (this.head.value == value && this.head.left == null && this.head.right == null) {
                this.head = null;
                return true;
            }

            while (currNode != null) {
                if (currNode.value == value) {
                    searched = true;
                    break;
                } else if (value < currNode.value) {
                    currParentNode = currNode;
                    currNode = currNode.left;
                } else{
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }

            if (searched == false) {
                return false;
            }
        }
        if (currNode.left == null && currNode.right == null) {
            if (value < currParentNode.value) {
                currParentNode.left = null;
                currNode = null;
            } else{
                currParentNode.right = null;
                currNode = null;
            }
            return true;
        } else if (currNode.left != null && currNode.right == null) {
            if (value < currParentNode.value) {
                currParentNode.left = currNode.left;
                currNode = null;
            } else{
                currParentNode.right = currNode.left;
                currNode = null;
            }
            return true;
        } else if (currNode.left == null && currNode.right != null) {
            if (value < currParentNode.value) {
                currParentNode.left = currNode.right;
                currNode = null;
            } else {
                currParentNode.right = currNode.right;
                currNode = null;
            }
            return true;
        } else {
            if (value < currParentNode.value) {

                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;
                while (changeNode.left != null) {
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;

                }

                if (changeNode.right != null) {
                    changeParentNode.left = changeNode.right;
                } else{
                    changeParentNode.left = null;
                }

                changeParentNode.left = changeNode;

                changeNode.right = currNode.right;
                changeNode.left = currNode.left;

                currNode = null;
            } else{
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;
                while (changeNode.left != null) {
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;

                }
                if (changeNode.right != null) {
                    changeParentNode.left = changeNode.right;
                } else{
                    changeParentNode.left = null;
                }

                changeParentNode.right = changeNode;

                changeNode.right = currNode.right;
                changeNode.left = currNode.left;

                currNode = null;
            }
        }
        return false;
    }
}

