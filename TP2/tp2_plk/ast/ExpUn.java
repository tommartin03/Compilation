package ast;

public class ExpUn extends Exp{
    private Exp exp;
    private Op op;
    public ExpUn(Exp e, Op o){
        this.op=o;
        this.exp=e;
    }

    public Exp getExp(){
        return this.exp;
    }

    public Op getOp(){
        return this.op;
    }

    public <T> T accept(Visiteur<T> v){
	    return v.visit(this);
    }
}
