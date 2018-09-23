
package meli.mutantdetector;

import meli.mutantdetector.dna.DnaSequence;
import meli.mutantdetector.parser.DnaParser;
import meli.mutantdetector.parser.exceptions.InvalidDnaException;

public class MutantDetector {

    public boolean isMutant(final String[] dna) {
        final DnaParser dnaParser = new DnaParser(dna);
        final DnaSequence dnaSequence;
        
        try {
            dnaSequence = dnaParser.parse();
        } catch (final InvalidDnaException ex) {
            return false;
        }
        
        return dnaSequence.itIsFromMutant();
    }

}