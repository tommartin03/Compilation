package mips;
import ast.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Translate extends ast.BaseVisitor<String> {
	
	private Map<String,String> regVars;
	private int numReg;
	private int maxReg;
	public Translate(){
		super("");
		numReg=0;
		maxReg=9;
		regVars=new HashMap<>();
	}

	public String reg(String s){
		if(regVars.get(s) == null){
			regVars.put(s, newReg(s));
		}
		return regVars.get(s);
	}

	public String newReg(String s){
		if(numReg >= maxReg){
			throw new RuntimeException("No more registers available.");
		}
		return "$t" + numReg++;
	}

	public String visit(StatAff s){
		String exprCode = s.getExpression().accept(this);
		String v = s.getId().getName();
		String reg = reg(v);
		String res = "move "+reg+" $v0   #affectation" + reg + "<-" + v + "\n";
		return exprCode + res;
	}

	public String visit(ExpId e){
		String reg = regVars.get(e.getValue());
		if(reg == null){
			throw new RuntimeException("Variable "+e.getValue()+" not declared");
		}
		return "move $v0, "+reg;
	}
	public String visit(ExpBin e){
		String leftCode = e.getLeftExp().accept(this);
		String rightCode = e.getRightExp().accept(this);
		String code = leftCode + "move $t0, $v0\n" + rightCode + "move $t1, $v0\n";
		switch(e.getOp()){
			case ADD:
				code += "add $v0, $t0, $t1\n";
				break;
			case MIN:
				code += "sub $v0, $t0, $t1\n";
				break;
			case MULT:
				code += "mul $v0, $t0, $t1\n";
				break;
		}
		return code;
	}
	public String visit(ExpInt e){
		return "li $v0, "+e.getValue() + "\n";
	}
	public String visit(StatPrint sp){
		String res = sp.getExpression().accept(this);
		return res+"move $a0, $v0\n" + "li $v0 1" + "\nsyscall";
	}
	public String visit(StatList sl){
		String code = "";
		for(Statement s : sl.getStatList()){
			code += s.accept(this);
		}
		return code;
	}
	public String visit(Program p){
		String code = "\n\t.text\n\n" + "main:\n" + p.getStat().accept(this) + "\nli $v0, 10\nsyscall";
		return code;
	}
	public String visit(ExpRead e){
		return "li $v0, 5\nsyscall\n";
	}
}
