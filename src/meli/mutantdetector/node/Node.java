/* AMCO @ 2018 */
package meli.mutantdetector.node;

import java.util.HashMap;

public class Node {

    private static final int MAX_SEQ_LENGTH = 4;

    private static final String UPPER_LEFT_KEY = "UL";
    private static final String PREVIOUS_HORIZONTAL_KEY = "PH";
    private static final String LOWER_LEFT_KEY = "LL";
    private static final String POSTERIOR_VERTICAL_KEY = "PV";
    private static final String LOWER_RIGHT_KEY = "LR";

    private final String _id;
    private final HashMap<String, Node> _childs;

    public Node(final String id) {
        _id = id;
        _childs = new HashMap<>();
    }

    public String getID() {
        return _id;
    }

    public boolean equals(final Node node) {
        final String nodeID = node.getID();
        return nodeID.equals(_id);
    }

    private boolean analyzeChilds(final String childKey, int sequenceLength) {
        if (sequenceLength == MAX_SEQ_LENGTH) {
            return true;
        }
        if (!_childs.containsKey(childKey)) {
            return false;
        }
        final Node child = _childs.get(childKey);
        if (!child.equals(this)) {
            return false;
        }
        sequenceLength++;
        return child.analyzeChilds(childKey, sequenceLength);
    }

    public boolean analyzeDiagonalUpperLeft(int sequenceLength) {
        return analyzeChilds(UPPER_LEFT_KEY, sequenceLength);
    }

    public boolean analyzePreviousHorizontal(int sequenceLength) {
        return analyzeChilds(PREVIOUS_HORIZONTAL_KEY, sequenceLength);
    }

    public boolean analyzeDiagonalLowerLeft(int sequenceLength) {
        return analyzeChilds(LOWER_LEFT_KEY, sequenceLength);
    }

    public boolean analyzePosteriorVertical(int sequenceLength) {
        return analyzeChilds(POSTERIOR_VERTICAL_KEY, sequenceLength);
    }
    
    public boolean analyzeDiagonalLowerRight(int sequenceLength) {
        return analyzeChilds(LOWER_RIGHT_KEY, sequenceLength);
    }

    public void addDiagonalUpperLeft(final Node node) {
        _childs.put(UPPER_LEFT_KEY, node);
    }

    public void addPreviousHorizontal(final Node node) {
        _childs.put(PREVIOUS_HORIZONTAL_KEY, node);
    }

    public void addDiagonalLowerLeft(final Node node) {
        _childs.put(LOWER_LEFT_KEY, node);
    }

    public void addPosteriorVertical(final Node node) {
        _childs.put(POSTERIOR_VERTICAL_KEY, node);
    }
    
    public void addDiagonalLowerRight(final Node node) {
        _childs.put(LOWER_RIGHT_KEY, node);
    }

}
