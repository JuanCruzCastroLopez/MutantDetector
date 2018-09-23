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
    
    @Test
    public void testValidate_returnFalse_whenContainsNitrogenBaseWithInvalidId() {
        final DnaSequence dnaSequence = new DnaSequence();

        final Node node1 = new Node("A");
        final NitrogenBase nb1 = new NitrogenBase(node1);
        
        final Node node2 = new Node("Z");
        final NitrogenBase nb2 = new NitrogenBase(node2);

        dnaSequence.addNitrogenBase(nb1);
        dnaSequence.addNitrogenBase(nb2);

        final boolean result = dnaSequence.validate();

        Assert.assertFalse(result);
    }

}
