package ast;

public class ExpID extends Exp {
    private String id;

    public ExpID(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public <T> T accept(Visiteur<T> v) {
        return v.visit(this);
    }
}