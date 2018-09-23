package meli.mutantdetector;

import org.junit.Assert;
import org.junit.Test;

public class MutantDetectorTest {
    
    @Test
    public void testIsMutant_returnTrue_ifDnaContainsFourNitrogenBaseEquals() {
        final MutantDetector mutantDetector = new MutantDetector();
        
        String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
        
        Assert.assertTrue(mutantDetector.isMutant(dna));
    }
    
    @Test
    public void testIsMutant_returnFalse_ifDnaNotContainsFourNitrogenBaseEquals() {
        final MutantDetector mutantDetector = new MutantDetector();
        
        String[] dna = {"ACGCGA","CTGTCC","TTATGT","AGGAGG","TCACTA","TCACTG"};
        
        Assert.assertFalse(mutantDetector.isMutant(dna));
    }
    
}
