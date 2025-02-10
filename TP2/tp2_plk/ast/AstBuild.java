package ast;
import ast.*;
import parser.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class AstBuild extends AbstractParseTreeVisitor<Node> implements plkVisitor<Node>{

    public Node visitExpInt(plkParser.ExpIntContext ctx){
        int n = Integer.parseInt(ctx.INT().getText());
        return new ExpInt(n);
    }

    public Node visitExpPar(plkParser.ExpParContext ep){
        return ep.exp().accept(this);
    }

    public Node visitExpID(plkParser.ExpIDContext ctx){
        String id = ctx.ID().getText();
        return new ExpID(id);
    }

    public Node visitExpConst(plkParser.ExpConstContext ctx){
        boolean b = Boolean.parseBoolean(ctx.Const().getText());
        return new ExpConst(b);
    }

    public Node visitExpBin(plkParser.ExpBinContext ctx){
        Exp e1 = (Exp)ctx.exp(0).accept(this);
        Exp e2 = (Exp)ctx.exp(1).accept(this);
        String strOp = ctx.Op().getText();
        Op op=switch(strOp){
            case "-" -> Op.MOINS;
            case "not" -> Op.NOT;
            case "abs" -> Op.ABS;
            default -> throw new IllegalStateException("Opérateur inconnu ou non implémenté");
        };
        return new ExpBin(e1,op,e2);
    }

    public Node visitExpUn(plkParser.ExpUnContext ctx) {
        Exp e = (Exp)ctx.exp().accept(this);
        String strOp = ctx.Op().getText();
        Op op=switch(strOp){
            case "-" -> Op.MOINS;
            case "not" -> Op.NOT;
            case "abs" -> Op.ABS;
            default -> throw new IllegalStateException("Opérateur inconnu ou non implémenté");
        };
        return new ExpUn(e,op);
    }


}
