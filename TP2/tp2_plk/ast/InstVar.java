package ast;

public class InstVar extends Inst {
    private String type;
    private String id;

    public InstVar(String type, String id) {
        this.type = type;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public <T> T accept(Visiteur<T> v) {
        return v.visit(this);
    }
}
