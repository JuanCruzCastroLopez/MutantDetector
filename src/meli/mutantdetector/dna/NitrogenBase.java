
package meli.mutantdetector.dna;

import meli.mutantdetector.node.INode;

public class NitrogenBase {

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
    

}