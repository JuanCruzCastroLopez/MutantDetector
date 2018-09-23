package meli.mutantdetector.node;

public interface INode {
    
    public String getID();
    
    public boolean equals(final INode node);

    public boolean analyzeDiagonalUpperLeft();

    public boolean analyzePreviousHorizontal();

    public boolean analyzeDiagonalLowerLeft();

    public boolean analyzePosteriorVertical();

    public boolean analyzeDiagonalLowerRight();

    public boolean analyzePosteriorHorizontal();

    public boolean analyzeDiagonalUpperRight();

    public boolean analyzePreviousVertical();

    public boolean validateID(String ADENINE);
    
}
