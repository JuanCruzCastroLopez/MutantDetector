package meli.mutantdetector.parser;

import meli.mutantdetector.dna.DnaSequence;
import org.junit.Assert;
import org.junit.Test;

public class DnaParserTest {
    
    @Test
    public void testParse() {
        final String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
        
        final DnaParser dnaParser = new DnaParser(dna);
        final DnaSequence dnaSequence = dnaParser.parse();
        
        Assert.assertNotNull(dnaSequence);
    }
    
    @Test
    public void testParse_withEmptyInput() {
        final String[] dna = {};
        
        final DnaParser dnaParser = new DnaParser(dna);
        final DnaSequence dnaSequence = dnaParser.parse();
        
        Assert.assertNotNull(dnaSequence);
    }
    
}
