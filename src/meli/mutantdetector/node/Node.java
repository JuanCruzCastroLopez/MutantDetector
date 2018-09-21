/* AMCO @ 2018 */
package meli.mutantdetector.node;

import java.util.HashMap;

public class Node {

    private static final int MAX_SEQ_LENGTH = 4;

    private static final String UPPER_LEFT_KEY = "UL";
    private static final String PREVIOUS_HORIZONTAL_KEY = "PH";
    private static final String LOWER_LEFT_KEY = "LL";

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

    public boolean analyzeDiagonalUpperLeft(int sequenceLength) {
        if (sequenceLength == MAX_SEQ_LENGTH) {
            return true;
        }
        if (!_childs.containsKey(UPPER_LEFT_KEY)) {
            return false;
        }
        final Node child = _childs.get(UPPER_LEFT_KEY);
        if (!child.equals(this)) {
            return false;
        }
        sequenceLength++;
        return child.analyzeDiagonalUpperLeft(sequenceLength);
    }

    public boolean analyzePreviousHorizontal(int sequenceLength) {
        if (sequenceLength == MAX_SEQ_LENGTH) {
            return true;
        }
        if (!_childs.containsKey(PREVIOUS_HORIZONTAL_KEY)) {
            return false;
        }
        final Node child = _childs.get(PREVIOUS_HORIZONTAL_KEY);
        if (!child.equals(this)) {
            return false;
        }
        sequenceLength++;
        return child.analyzePreviousHorizontal(sequenceLength);
    }

    public boolean analyzeDiagonalLowerLeft(int sequenceLength) {
        if (sequenceLength == MAX_SEQ_LENGTH) {
            return true;
        }
        if (!_childs.containsKey(LOWER_LEFT_KEY)) {
            return false;
        }
        final Node child = _childs.get(LOWER_LEFT_KEY);
        if (!child.equals(this)) {
            return false;
        }
        sequenceLength++;
        return child.analyzeDiagonalLowerLeft(sequenceLength);
    }

    public void addUpperLeft(final Node node) {
        _childs.put(UPPER_LEFT_KEY, node);
    }

    public void addPreviousHorizontal(final Node node) {
        _childs.put(PREVIOUS_HORIZONTAL_KEY, node);
    }

    public void addDiagonalLowerLeft(final Node node) {
        _childs.put(LOWER_LEFT_KEY, node);
    }

}
