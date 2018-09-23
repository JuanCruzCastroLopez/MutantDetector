package meli.mutantdetector.node;

import java.util.HashMap;

public class Node implements INode {

    private static final int MAX_SEQ_LENGTH = 4;

    private static final String DIAGONAL_UPPER_LEFT_KEY = "UL";
    private static final String PREVIOUS_HORIZONTAL_KEY = "PRH";
    private static final String DIAGONAL_LOWER_LEFT_KEY = "LL";
    private static final String POSTERIOR_VERTICAL_KEY = "POV";
    private static final String DIAGONAL_LOWER_RIGHT_KEY = "LR";
    private static final String POSTERIOR_HORIZONTAL_KEY = "POH";
    private static final String DIAGONAL_UPPER_RIGHT_KEY = "UR";
    private static final String PREVIOUS_VERTICAL_KEY = "PEV";

    private final String _id;
    private final HashMap<String, INode> _childs;

    public Node(final String id) {
        _id = id;
        _childs = new HashMap<>();
    }

    @Override
    public String getID() {
        return _id;
    }

    @Override
    public boolean equals(final INode node) {
        final String nodeID = node.getID();
        return nodeID.equals(_id);
    }

    @Override
    public boolean validateID(final String id) {
        return _id.equals(id);
    }

    private boolean analyzeChilds(final String childKey, int sequenceLength) {
        if (sequenceLength == MAX_SEQ_LENGTH) {
            return true;
        }
        if (!_childs.containsKey(childKey)) {
            return false;
        }
        final INode child = _childs.get(childKey);
        if (!child.equals(this)) {
            return false;
        }
        sequenceLength++;
        final Node node = (Node) child;
        return node.analyzeChilds(childKey, sequenceLength);
    }

    @Override
    public boolean analyzeDiagonalUpperLeft() {
        return analyzeChilds(DIAGONAL_UPPER_LEFT_KEY, 1);
    }

    @Override
    public boolean analyzePreviousHorizontal() {
        return analyzeChilds(PREVIOUS_HORIZONTAL_KEY, 1);
    }

    @Override
    public boolean analyzeDiagonalLowerLeft() {
        return analyzeChilds(DIAGONAL_LOWER_LEFT_KEY, 1);
    }

    @Override
    public boolean analyzePosteriorVertical() {
        return analyzeChilds(POSTERIOR_VERTICAL_KEY, 1);
    }

    @Override
    public boolean analyzeDiagonalLowerRight() {
        return analyzeChilds(DIAGONAL_LOWER_RIGHT_KEY, 1);
    }

    @Override
    public boolean analyzePosteriorHorizontal() {
        return analyzeChilds(POSTERIOR_HORIZONTAL_KEY, 1);
    }

    @Override
    public boolean analyzeDiagonalUpperRight() {
        return analyzeChilds(DIAGONAL_UPPER_RIGHT_KEY, 1);
    }

    @Override
    public boolean analyzePreviousVertical() {
        return analyzeChilds(PREVIOUS_VERTICAL_KEY, 1);
    }

    public void addDiagonalUpperLeft(final INode node) {
        _childs.put(DIAGONAL_UPPER_LEFT_KEY, node);
    }

    public void addPreviousHorizontal(final INode node) {
        _childs.put(PREVIOUS_HORIZONTAL_KEY, node);
    }

    public void addDiagonalLowerLeft(final INode node) {
        _childs.put(DIAGONAL_LOWER_LEFT_KEY, node);
    }

    public void addPosteriorVertical(final INode node) {
        _childs.put(POSTERIOR_VERTICAL_KEY, node);
    }

    public void addDiagonalLowerRight(final INode node) {
        _childs.put(DIAGONAL_LOWER_RIGHT_KEY, node);
    }

    public void addPosteriorHorizontal(final INode node) {
        _childs.put(POSTERIOR_HORIZONTAL_KEY, node);
    }

    public void addDiagonalUpperRight(final INode node) {
        _childs.put(DIAGONAL_UPPER_RIGHT_KEY, node);
    }

    public void addPreviousVertical(final INode node) {
        _childs.put(PREVIOUS_VERTICAL_KEY, node);
    }

}
