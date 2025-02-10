package ast;

public class ExpBin extends Exp {
    private Exp left;
    private Exp right;
    private Op op;

    public ExpBin(Exp left, Op op, Exp right) {
        this.left = left;
        this.right = right;
        this.op = op;
    }

    public Exp getLeft() {
        return left;
    }

    public Exp getRight() {
        return right;
    }

    public Op getOp() {
        return op;
    }

    public <T> T accept(Visiteur<T> v) {
        return v.visit(this);
    }
    
}
