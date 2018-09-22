
package meli.mutantdetector.dna;

import java.util.ArrayList;

public class DnaSequence {

    private final ArrayList<NitrogenBase> _sequence;
    
    public DnaSequence() {
        _sequence = new ArrayList<>();
    }

    public boolean itIsFromMutant() {
        for (final NitrogenBase base : _sequence) {
            if (base.hasEqualsAdjacent()) {
                return true;
            }
        }
        return false;
    }

    public void addNitrogenBase(NitrogenBase base) {
        _sequence.add(base);
    }

}