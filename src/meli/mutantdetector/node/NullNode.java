package meli.mutantdetector.node;

public class NullNode implements INode {

    @Override
    public String getID() {
        return "";
    }

    @Override
    public boolean equals(final INode node) {
        return false;
    }

    @Override
    public boolean analyzeDiagonalUpperLeft() {
        return false;
    }

    @Override
    public boolean analyzePreviousHorizontal() {
        return false;
    }

    @Override
    public boolean analyzeDiagonalLowerLeft() {
        return false;
    }

    @Override
    public boolean analyzePosteriorVertical() {
        return false;
    }

    @Override
    public boolean analyzeDiagonalLowerRight() {
        return false;
    }

    @Override
    public boolean analyzePosteriorHorizontal() {
        return false;
    }

    @Override
    public boolean analyzeDiagonalUpperRight() {
        return false;
    }

    @Override
    public boolean analyzePreviousVertical() {
        return false;
    }

}
