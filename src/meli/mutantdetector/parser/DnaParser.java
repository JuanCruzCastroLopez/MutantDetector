package meli.mutantdetector.parser;

import meli.mutantdetector.parser.exceptions.InvalidDnaException;
import meli.mutantdetector.dna.DnaSequence;

public class DnaParser {

    private final String[] _input;

    public DnaParser(final String[] input) {
        _input = input;
    }

    public DnaSequence parse() throws InvalidDnaException {
        final DnaSequence dnaSequence = new DnaSequence();

        final Matrix matrix = new Matrix();
        matrix.fill(_input);
        matrix.fillDnaSequence(dnaSequence);
        
        if(!dnaSequence.validate()) {
            throw new InvalidDnaException();
        }

        return dnaSequence;
    }
}
