package ast;
import ast.*;
import parser.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.List;
import java.util.ArrayList;

public class AstBuild extends AbstractParseTreeVisitor<Node> implements plkVisitor<Node> {

    @Override
    public Node visitProg(plkParser.ProgContext ctx) {
        List<Node> nodes = new ArrayList<>();
        for (plkParser.VarDeclContext varDeclCtx : ctx.varDecl()) {
            nodes.add(varDeclCtx.accept(this));
        }
        for (plkParser.StatContext statCtx : ctx.stat()) {
            nodes.add(statCtx.accept(this));
        }
        return new Prog(nodes);
    }

    @Override
    public Node visitStat(plkParser.StatContext ctx) {
        if (ctx.assignStat() != null) {
            return visitAssignStat(ctx.assignStat());
        } else {
            return ctx.exp().accept(this);
        }
    }

    @Override
    public Node visitExpInt(plkParser.ExpIntContext ctx) {
        int n = Integer.parseInt(ctx.INT().getText());
        return new ExpInt(n);
    }

    @Override
    public Node visitExpPar(plkParser.ExpParContext ep) {
        return ep.exp().accept(this);
    }

    @Override
    public Node visitExpID(plkParser.ExpIDContext ctx) {
        String id = ctx.ID().getText();
        return new ExpID(id);
    }

    @Override
    public Node visitExpConst(plkParser.ExpConstContext ctx) {
        boolean b = Boolean.parseBoolean(ctx.Const().getText());
        return new ExpConst(b);
    }

    @Override
    public Node visitExpBin(plkParser.ExpBinContext ctx) {
        Exp e1 = (Exp) ctx.exp(0).accept(this);
        Exp e2 = (Exp) ctx.exp(1).accept(this);
        String strOp = ctx.Op().getText();
        Op op = switch (strOp) {
            case "-" -> Op.MOINS;
            case "not" -> Op.NOT;
            case "abs" -> Op.ABS;
            default -> throw new IllegalStateException("Opérateur inconnu ou non implémenté");
        };
        return new ExpBin(e1, op, e2);
    }

    @Override
    public Node visitExpUn(plkParser.ExpUnContext ctx) {
        Exp e = (Exp) ctx.exp().accept(this);
        String strOp = ctx.Op().getText();
        Op op = switch (strOp) {
            case "-" -> Op.MOINS;
            case "not" -> Op.NOT;
            case "abs" -> Op.ABS;
            default -> throw new IllegalStateException("Opérateur inconnu ou non implémenté");
        };
        return new ExpUn(e, op);
    }

    @Override
    public Node visitVarDecl(plkParser.VarDeclContext ctx) {
        String type = ctx.Type().getText();
        String id = ctx.ID().getText();
        return new InstVar(type, id);
    }

    @Override
    public Node visitAssignStat(plkParser.AssignStatContext ctx) {
        String id = ctx.ID().getText();
        Exp exp = (Exp) ctx.exp().accept(this);
        return new AssignStat(id, exp);
    }
}