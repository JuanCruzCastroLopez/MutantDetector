package meli.mutantdetector.dna;

import org.junit.Assert;
import org.junit.Test;

public class DnaSequenceTest {
    
    @Test
    public void testIsMutant_returnFalse_ifItIsEmpty() {
        final DnaSequence dnaSequence = new DnaSequence();
        
        final boolean result = dnaSequence.itIsFromMutant();
        
        Assert.assertFalse(result);
    }
    
}
