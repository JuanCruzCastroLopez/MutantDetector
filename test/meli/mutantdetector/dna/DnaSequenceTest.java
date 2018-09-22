package meli.mutantdetector.dna;

import meli.mutantdetector.node.Node;
import org.junit.Assert;
import org.junit.Test;

public class DnaSequenceTest {

    @Test
    public void testIsMutant_returnFalse_ifItIsEmpty() {
        final DnaSequence dnaSequence = new DnaSequence();

        final boolean result = dnaSequence.itIsFromMutant();

        Assert.assertFalse(result);
    }

    @Test
    public void testIsMutant_returnTrue_ifContainsFourNitrogenousBasesEquals() {
        final DnaSequence dnaSequence = new DnaSequence();

        final Node node = new Node("A");

        final Node node1 = new Node("A");
        final Node node2 = new Node("A");
        final Node node3 = new Node("A");

        node2.addDiagonalUpperLeft(node3);
        node1.addDiagonalUpperLeft(node2);
        node.addDiagonalUpperLeft(node1);

        final NitrogenBase base = new NitrogenBase(node);

        dnaSequence.addNitrogenBase(base);

        final boolean result = dnaSequence.itIsFromMutant();

        Assert.assertTrue(result);
    }

}
