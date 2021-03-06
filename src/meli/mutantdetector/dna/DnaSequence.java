
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

    public void addNitrogenBase(final NitrogenBase base) {
        _sequence.add(base);
    }

    public boolean validate() {
        for (final NitrogenBase nitrogenBase : _sequence) {
            if (!nitrogenBase.validate()) {
                return false;
            }
        }
        return true;
    }

}