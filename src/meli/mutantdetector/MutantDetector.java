
package meli.mutantdetector;

import meli.mutantdetector.dna.DnaSequence;
import meli.mutantdetector.parser.DnaParser;

public class MutantDetector {

    public boolean isMutant(final String[] dna) {
        final DnaParser dnaParser = new DnaParser(dna);
        final DnaSequence dnaSequence = dnaParser.parse();
        
        return dnaSequence.itIsFromMutant();
    }

}