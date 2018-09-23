package meli.mutantdetector.parser;

import meli.mutantdetector.dna.DnaSequence;
import meli.mutantdetector.parser.exceptions.InvalidDnaException;
import org.junit.Assert;
import org.junit.Test;

public class DnaParserTest {
    
    @Test
    public void testParse() throws InvalidDnaException {
        final String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
        
        final DnaParser dnaParser = new DnaParser(dna);
        final DnaSequence dnaSequence = dnaParser.parse();
        
        Assert.assertNotNull(dnaSequence);
    }
    
    @Test
    public void testParse_withEmptyInput() throws InvalidDnaException {
        final String[] dna = {};
        
        final DnaParser dnaParser = new DnaParser(dna);
        final DnaSequence dnaSequence = dnaParser.parse();
        
        Assert.assertNotNull(dnaSequence);
    }
    
    @Test(expected = InvalidDnaException.class)
    public void testParse_throwInvalidDnaExceptionIfInputContainInvalidNitrogenBase() throws InvalidDnaException {
        final String[] dna = {"ATGCGZ","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
        
        final DnaParser dnaParser = new DnaParser(dna);
        final DnaSequence dnaSequence = dnaParser.parse();
        
        Assert.assertNotNull(dnaSequence);
    }
    
}
