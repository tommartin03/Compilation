package ast;

public class AssignStat extends Node {
    private String id;
    private Exp exp;

    public AssignStat(String id, Exp exp) {
        this.id = id;
        this.exp = exp;
    }

    public String getId() {
        return id;
    }

    public Exp getExp() {
        return exp;
    }

    @Override
    public <T> T accept(Visiteur<T> v) {
        return v.visit(this);
    }
}