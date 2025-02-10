package ast;
public class ExpInt extends Exp{
    private int value;

    public ExpInt(int n){
        this.value=n;
    }
    

    public int getValue(){
	    return value;
    }

    public <T> T accept(Visiteur<T> v){
	    return v.visit(this);
    }
}
