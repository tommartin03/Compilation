package ast;
public class AstPrinter implements Visiteur<String>{
	public String visit(ExpInt e){
		return ""+e.getValue();
	}
	public String visit(ExpUn e){
		return e.getOp().toString() + e.getExp().accept(this);
	}

	public String visit(ExpID e){
		return e.getId();
	}

	public String visit(ExpConst e){
		return ""+e.getValue();
	}

	public String visit(ExpBin e){
		return e.getLeft().accept(this) + e.getOp().toString() + e.getRight().accept(this);
	}

}
