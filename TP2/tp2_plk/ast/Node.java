package ast;
public abstract class Node {
	public abstract <T> T accept(Visiteur<T> v);
}
