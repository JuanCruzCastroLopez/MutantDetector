package meli.mutantdetector.dna;

import meli.mutantdetector.node.Node;
import org.junit.Assert;
import org.junit.Test;

public class NitrogenBaseTest {
    
    @Test
    public void testValidate_returnTrue_ifNitrogenBaseIsA() {
        final Node node = new Node("A");
        final NitrogenBase nitrogenBase = new NitrogenBase(node);
        
        Assert.assertTrue(nitrogenBase.validate());
    }
    
    @Test
    public void testValidate_returnTrue_ifNitrogenBaseIsT() {
        final Node node = new Node("T");
        final NitrogenBase nitrogenBase = new NitrogenBase(node);
        
        Assert.assertTrue(nitrogenBase.validate());
    }
    
    @Test
    public void testValidate_returnTrue_ifNitrogenBaseIsC() {
        final Node node = new Node("C");
        final NitrogenBase nitrogenBase = new NitrogenBase(node);
        
        Assert.assertTrue(nitrogenBase.validate());
    }
    
    @Test
    public void testValidate_returnTrue_ifNitrogenBaseIsG() {
        final Node node = new Node("G");
        final NitrogenBase nitrogenBase = new NitrogenBase(node);
        
        Assert.assertTrue(nitrogenBase.validate());
    }
    
    @Test
    public void testValidate_returnFalse_ifNitrogenBaseIsZ() {
        final Node node = new Node("Z");
        final NitrogenBase nitrogenBase = new NitrogenBase(node);
        
        Assert.assertFalse(nitrogenBase.validate());
    }
    
    
}
