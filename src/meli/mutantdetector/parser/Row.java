
package meli.mutantdetector.parser;

import java.util.ArrayList;
import meli.mutantdetector.node.Node;

class Row {

    private final ArrayList<Node> _nodes;
    
    public Row() {
        _nodes = new ArrayList<>();
    }

    public void addNodes(final String nodes) {
        final String[] row = nodes.split("");
        for (final String s : row) {
            final Node node = new Node(s);
            _nodes.add(node);
        }
    }

    public int size() {
        return _nodes.size();
    }

    public Node getNode(final int index) {
        return _nodes.get(index);
    }

}