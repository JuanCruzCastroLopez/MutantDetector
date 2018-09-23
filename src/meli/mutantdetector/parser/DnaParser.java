package meli.mutantdetector.parser;

import meli.mutantdetector.dna.DnaSequence;

public class DnaParser {

    private final String[] _input;

    public DnaParser(final String[] input) {
        _input = input;
    }

    public DnaSequence parse() {
        final DnaSequence dnaSequence = new DnaSequence();
        
        final Matrix matrix = new Matrix();
        matrix.fill(_input);
        matrix.fillDnaSequence(dnaSequence);
        
        return dnaSequence;
    }
}
