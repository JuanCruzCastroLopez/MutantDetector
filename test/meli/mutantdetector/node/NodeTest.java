
package meli.mutantdetector.node;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {

    @Test
    public void test_analyzeDiagonalUpperLeft_returnFalse_whenNodeIdIsLetterAandHisChildIdIsLetterT() {
        final Node nodeA = new Node("A");
        final Node nodeT = new Node("T");

        nodeA.addDiagonalUpperLeft(nodeT);

        final boolean result = nodeA.analyzeDiagonalUpperLeft();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzeDiagonalUpperLeft_returnFalse_whenNodeDoesNotHaveChilds() {
        final Node nodeA = new Node("A");

        final boolean result = nodeA.analyzeDiagonalUpperLeft();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzeDiagonalUpperLeft_returnTrue_whenNodeHasThreeChildsWithTheSameLetter() {
        final Node nodeA = new Node("A");

        final Node node1 = new Node("A");
        final Node node2 = new Node("A");
        final Node node3 = new Node("A");

        node2.addDiagonalUpperLeft(node3);
        node1.addDiagonalUpperLeft(node2);
        nodeA.addDiagonalUpperLeft(node1);

        final boolean result = nodeA.analyzeDiagonalUpperLeft();

        Assert.assertTrue(result);
    }

    @Test
    public void test_analyzePreviousHorizontal_returnFalse_whenNodeIdIsLetterAandHisChildIdIsLetterT() {
        final Node nodeA = new Node("A");
        final Node nodeT = new Node("T");

        nodeA.addDiagonalUpperLeft(nodeT);

        final boolean result = nodeA.analyzePreviousHorizontal();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzePreviousHorizontal_returnFalse_whenNodeDoesNotHaveChilds() {
        final Node nodeA = new Node("A");

        final boolean result = nodeA.analyzePreviousHorizontal();

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

        final boolean result = nodeA.analyzePreviousHorizontal();

        Assert.assertTrue(result);
    }
    
    
    @Test
    public void test_analyzeDiagonalLowerLeft_returnFalse_whenNodeIdIsLetterAandHisChildIdIsLetterT() {
        final Node nodeA = new Node("A");
        final Node nodeT = new Node("T");

        nodeA.addDiagonalLowerLeft(nodeT);

        final boolean result = nodeA.analyzeDiagonalLowerLeft();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzeDiagonalLowerLeft_returnFalse_whenNodeDoesNotHaveChilds() {
        final Node nodeA = new Node("A");

        final boolean result = nodeA.analyzeDiagonalLowerLeft();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzeDiagonalLowerLeft_returnTrue_whenNodeHasThreeChildsWithTheSameLetter() {
        final Node nodeA = new Node("A");

        final Node node1 = new Node("A");
        final Node node2 = new Node("A");
        final Node node3 = new Node("A");

        node2.addDiagonalLowerLeft(node3);
        node1.addDiagonalLowerLeft(node2);
        nodeA.addDiagonalLowerLeft(node1);

        final boolean result = nodeA.analyzeDiagonalLowerLeft();

        Assert.assertTrue(result);
    }
    
    @Test
    public void test_analyzePosteriorVertical_returnFalse_whenNodeIdIsLetterAandHisChildIdIsLetterT() {
        final Node nodeA = new Node("A");
        final Node nodeT = new Node("T");

        nodeA.addPosteriorVertical(nodeT);

        final boolean result = nodeA.analyzePosteriorVertical();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzePosteriorVertical_returnFalse_whenNodeDoesNotHaveChilds() {
        final Node nodeA = new Node("A");

        final boolean result = nodeA.analyzePosteriorVertical();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzePosteriorVertical_returnTrue_whenNodeHasThreeChildsWithTheSameLetter() {
        final Node nodeA = new Node("A");

        final Node node1 = new Node("A");
        final Node node2 = new Node("A");
        final Node node3 = new Node("A");

        node2.addPosteriorVertical(node3);
        node1.addPosteriorVertical(node2);
        nodeA.addPosteriorVertical(node1);

        final boolean result = nodeA.analyzePosteriorVertical();

        Assert.assertTrue(result);
    }
    
    @Test
    public void test_analyzeDiagonalLowerRigth_returnFalse_whenNodeIdIsLetterAandHisChildIdIsLetterT() {
        final Node nodeA = new Node("A");
        final Node nodeT = new Node("T");

        nodeA.addDiagonalLowerRight(nodeT);

        final boolean result = nodeA.analyzeDiagonalLowerRight();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzeDiagonalLowerRigth_returnFalse_whenNodeDoesNotHaveChilds() {
        final Node nodeA = new Node("A");

        final boolean result = nodeA.analyzeDiagonalLowerRight();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzeDiagonalLowerRigth_returnTrue_whenNodeHasThreeChildsWithTheSameLetter() {
        final Node nodeA = new Node("A");

        final Node node1 = new Node("A");
        final Node node2 = new Node("A");
        final Node node3 = new Node("A");

        node2.addDiagonalLowerRight(node3);
        node1.addDiagonalLowerRight(node2);
        nodeA.addDiagonalLowerRight(node1);

        final boolean result = nodeA.analyzeDiagonalLowerRight();

        Assert.assertTrue(result);
    }
    
    @Test
    public void test_analyzePosteriorHorizontal_returnFalse_whenNodeIdIsLetterAandHisChildIdIsLetterT() {
        final Node nodeA = new Node("A");
        final Node nodeT = new Node("T");

        nodeA.addPosteriorHorizontal(nodeT);

        final boolean result = nodeA.analyzePosteriorHorizontal();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzePosteriorHorizontal_returnFalse_whenNodeDoesNotHaveChilds() {
        final Node nodeA = new Node("A");

        final boolean result = nodeA.analyzePosteriorHorizontal();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzePosteriorHorizontal_returnTrue_whenNodeHasThreeChildsWithTheSameLetter() {
        final Node nodeA = new Node("A");

        final Node node1 = new Node("A");
        final Node node2 = new Node("A");
        final Node node3 = new Node("A");

        node2.addPosteriorHorizontal(node3);
        node1.addPosteriorHorizontal(node2);
        nodeA.addPosteriorHorizontal(node1);

        final boolean result = nodeA.analyzePosteriorHorizontal();

        Assert.assertTrue(result);
    }
    
    @Test
    public void test_analyzeDiagonalPosteriorRight_returnFalse_whenNodeIdIsLetterAandHisChildIdIsLetterT() {
        final Node nodeA = new Node("A");
        final Node nodeT = new Node("T");

        nodeA.addDiagonalUpperRight(nodeT);

        final boolean result = nodeA.analyzeDiagonalUpperRight();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzeDiagonalPosteriorRight_returnFalse_whenNodeDoesNotHaveChilds() {
        final Node nodeA = new Node("A");

        final boolean result = nodeA.analyzeDiagonalUpperRight();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzeDiagonalPosteriorRight_returnTrue_whenNodeHasThreeChildsWithTheSameLetter() {
        final Node nodeA = new Node("A");

        final Node node1 = new Node("A");
        final Node node2 = new Node("A");
        final Node node3 = new Node("A");

        node2.addDiagonalUpperRight(node3);
        node1.addDiagonalUpperRight(node2);
        nodeA.addDiagonalUpperRight(node1);

        final boolean result = nodeA.analyzeDiagonalUpperRight();

        Assert.assertTrue(result);
    }
    
    @Test
    public void test_analyzePreviousVerticalRight_returnFalse_whenNodeIdIsLetterAandHisChildIdIsLetterT() {
        final Node nodeA = new Node("A");
        final Node nodeT = new Node("T");

        nodeA.addPreviousVertical(nodeT);

        final boolean result = nodeA.analyzePreviousVertical();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzePreviousVertical_returnFalse_whenNodeDoesNotHaveChilds() {
        final Node nodeA = new Node("A");

        final boolean result = nodeA.analyzePreviousVertical();

        Assert.assertFalse(result);
    }

    @Test
    public void test_analyzePreviousVertical_returnTrue_whenNodeHasThreeChildsWithTheSameLetter() {
        final Node nodeA = new Node("A");

        final Node node1 = new Node("A");
        final Node node2 = new Node("A");
        final Node node3 = new Node("A");

        node2.addPreviousVertical(node3);
        node1.addPreviousVertical(node2);
        nodeA.addPreviousVertical(node1);

        final boolean result = nodeA.analyzePreviousVertical();

        Assert.assertTrue(result);
    }
    


}
