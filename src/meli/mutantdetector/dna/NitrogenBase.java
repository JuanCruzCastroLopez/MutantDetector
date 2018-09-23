
package meli.mutantdetector.dna;

import meli.mutantdetector.node.INode;

public class NitrogenBase {
    
    private static final String ADENINE = "A";
    private static final String GUANINE = "G";
    private static final String THYMINE = "T";
    private static final String CYTOSINE = "C";

    private final INode _node;
    
    public NitrogenBase(final INode node) {
        _node = node;
    }

    public boolean hasEqualsAdjacent() {
        if (_node.analyzeDiagonalUpperLeft()) {
            return true;
        }
        if (_node.analyzePreviousHorizontal()) {
            return true;
        }
        if (_node.analyzeDiagonalLowerLeft()) {
            return true;
        }
        if (_node.analyzePosteriorVertical()) {
            return true;
        }
        if (_node.analyzeDiagonalLowerRight()) {
            return true;
        }
        if (_node.analyzePosteriorHorizontal()) {
            return true;
        }
        if (_node.analyzeDiagonalUpperRight()) {
            return true;
        }
        if (_node.analyzePreviousVertical()) {
            return true;
        }
        return false;
    }

    public boolean validate() {
        return _node.validateID(ADENINE) || _node.validateID(GUANINE) || _node.validateID(THYMINE) || _node.validateID(CYTOSINE);
    }
    

}