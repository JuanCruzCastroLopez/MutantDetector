package meli.mutantdetector.node;

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

    @Test
    public void test_analyzePreviousHorizontal_returnFalse_whenNodeIdIsLetterAandHisChildIdIsLetterT() {
        final Node nodeA = new Node("A");
        final Node nodeT = new Node("T");

        nodeA.addUpperLeft(nodeT);

        final boolean result = nodeA.analyzePreviousHorizontal(1);

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzePreviousHorizontal_returnFalse_whenNodeDoesNotHaveChilds() {
        final Node nodeA = new Node("A");

        final boolean result = nodeA.analyzePreviousHorizontal(1);

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzePreviousHorizontal_returnTrue_whenNodeHasThreeChildsWithTheSameLetter() {
        final Node nodeA = new Node("A");

        final Node node1 = new Node("A");
        final Node node2 = new Node("A");
        final Node node3 = new Node("A");

        node2.addPreviousHorizontal(node3);
        node1.addPreviousHorizontal(node2);
        nodeA.addPreviousHorizontal(node1);

        final boolean result = nodeA.analyzePreviousHorizontal(1);

        Assert.assertTrue(result);
    }
    


}
