package eu.sig.training.ch03;

public class BinaryTreeSearch {

    // tag::calculateDepth[]
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        if(node == null){
        	throw new IllegalArgumentException("A reference to argument 'node' was not specified");
        }
    	int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        } else {
            return calculateDepthInNode(node, nodeValue);
        }
    }

    private static int calculateDepthInNode(BinaryTreeNode<Integer> node, int nodeValue) throws TreeException {
        final BinaryTreeNode<Integer> nextNode;
        if (nodeValue < node.getValue()) {
            nextNode = node.getLeft();
        } else {
            nextNode = node.getRight();
        }

        if (nextNode == null) {
            throw new TreeException("Value not found in tree!");
        } else {
            return 1 + calculateDepth(node, nodeValue);
        }
    }
    // end::calculateDepth[]
}
