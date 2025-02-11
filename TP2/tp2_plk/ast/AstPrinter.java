package ast;

public class AstPrinter implements Visiteur<String> {

    @Override
    public String visit(ExpInt e) {
        return "" + e.getValue();
    }

    @Override
    public String visit(ExpUn e) {
        return e.getOp().toString() + e.getExp().accept(this);
    }

    @Override
    public String visit(ExpID e) {
        return e.getId();
    }

    @Override
    public String visit(ExpConst e) {
        return "" + e.getValue();
    }

    @Override
    public String visit(ExpBin e) {
        return e.getLeft().accept(this) + e.getOp().toString() + e.getRight().accept(this);
    }

    @Override
    public String visit(InstVar e) {
        return e.getType() + " " + e.getId() + ";";
    }

    @Override
    public String visit(AssignStat e) {
        return e.getId() + " = " + e.getExp().accept(this) + ";";
    }

    @Override
    public String visit(Prog e) {
        StringBuilder sb = new StringBuilder();
        for (Node node : e.getNodes()) {
            sb.append(node.accept(this)).append("\n");
        }
        return sb.toString();
    }
}