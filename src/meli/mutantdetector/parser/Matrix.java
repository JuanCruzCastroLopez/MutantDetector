/* AMCO @ 2018 */
package meli.mutantdetector.parser;

import java.util.ArrayList;
import meli.mutantdetector.dna.DnaSequence;
import meli.mutantdetector.dna.NitrogenBase;
import meli.mutantdetector.node.INode;
import meli.mutantdetector.node.Node;
import meli.mutantdetector.node.NullNode;

public class Matrix {

    private final ArrayList<Row> _rows;

    public Matrix() {
        _rows = new ArrayList<>();
    }

    public void fill(final String[] input) {
        for (final String i : input) {
            final Row row = new Row();
            row.addNodes(i);

            _rows.add(row);
        }
    }

    private INode parseRow(final int i, final int j) {
        try {
            final Node node = _rows.get(i).getNode(j);
            return node;
        } catch (final  IndexOutOfBoundsException e) {
            return new NullNode();
        }
    }

    public void fillDnaSequence(final DnaSequence dnaSequence) {
        final int rowsSize = _rows.size();

        for (int i = 0; i < rowsSize; i++) {

            final Row row = _rows.get(i);
            final int rowSize = row.size();

            for (int j = 0; j < rowSize; j++) {

                final Node node = row.getNode(j);

                final INode upperLeftNode = parseRow(i - 1, j - 1);
                node.addDiagonalUpperLeft(upperLeftNode);

                final INode previousHorizontalNode = parseRow(i, j - 1);
                node.addPreviousHorizontal(previousHorizontalNode);

                final INode lowerLeftNode = parseRow(i + 1, j - 1);
                node.addDiagonalLowerLeft(lowerLeftNode);

                final INode posteriorVerticalNode = parseRow(i + 1, j);
                node.addPosteriorVertical(posteriorVerticalNode);

                final INode lowerRightNode = parseRow(i + 1, j + 1);
                node.addDiagonalLowerRight(lowerRightNode);

                final INode posteriorHorizontalNode = parseRow(i, j + 1);
                node.addPosteriorHorizontal(posteriorHorizontalNode);

                final INode upperRightNode = parseRow(i - 1, j + 1);
                node.addDiagonalUpperRight(upperRightNode);

                final INode previousVerticalNode = parseRow(i - 1, j);
                node.addPreviousVertical(previousVerticalNode);

                final NitrogenBase nitrogenBase = new NitrogenBase(node);
                dnaSequence.addNitrogenBase(nitrogenBase);
            }
        }
    }

}
