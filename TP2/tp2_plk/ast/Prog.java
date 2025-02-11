package ast;

import java.util.List;

public class Prog extends Node {
    private List<Node> nodes;

    public Prog(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    @Override
    public <T> T accept(Visiteur<T> v) {
        return v.visit(this);
    }
}