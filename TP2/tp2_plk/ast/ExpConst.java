package ast;

public class ExpConst extends Exp {
    private boolean value;

    public ExpConst(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public <T> T accept(Visiteur<T> v) {
        return v.visit(this);
    }
    
}
