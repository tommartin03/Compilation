package ast;
public interface Visiteur<T>{
	public T visit(ExpInt e);
	public T visit(ExpUn e);
	public T visit(ExpID e);
	public T visit(ExpConst e);
	public T visit(ExpBin e);

}
