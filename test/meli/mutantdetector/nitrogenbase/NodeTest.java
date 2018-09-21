package meli.mutantdetector.nitrogenbase;

import meli.mutantdetector.node.Node;
import org.junit.Assert;
import org.junit.Test;

public class NodeTest {

    @Test
    public void test_analyzeDiagonalUpperLeft_returnFalse_whenNodeIdIsLetterAandHisChildIdIsLetterT() {
        final Node nodeA = new Node("A");
        final Node nodeT = new Node("T");

        nodeA.addUpperLeft(nodeT);

        final boolean result = nodeA.analyzeDiagonalUpperLeft(1);

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzeDiagonalUpperLeft_returnFalse_whenNodeDoesNotHaveChilds() {
        final Node nodeA = new Node("A");

        final boolean result = nodeA.analyzeDiagonalUpperLeft(1);

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzeDiagonalUpperLeft_returnTrue_whenNodeHasThreeChildsWithTheSameLetter() {
        final Node nodeA = new Node("A");

        final Node node1 = new Node("A");
        final Node node2 = new Node("A");
        final Node node3 = new Node("A");

        node2.addUpperLeft(node3);
        node1.addUpperLeft(node2);
        nodeA.addUpperLeft(node1);

        final boolean result = nodeA.analyzeDiagonalUpperLeft(1);

        Assert.assertTrue(result);
    }


}
