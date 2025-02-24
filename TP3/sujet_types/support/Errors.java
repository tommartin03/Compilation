package support;
import ast.Block;
import ast.Node;
import ast.StatVarDecl;
import semantic.MethodSig;

import java.util.LinkedList;
import java.util.List;

public class Errors{
	private List<String> errors;
	public Errors(){
		errors=new LinkedList<>();
	}
	public List<String> get(){
		return errors;
	}
	
	public void add(Block block,String e){
		if(block==null){
			errors.add(e);
		}
		else{
			errors.add(block.getPosition()+" : "+e);
		}
	}

	public void add(StatVarDecl decl,String e){
		if(decl==null){
			errors.add(e);
		}
		else{
			errors.add(decl.getPosition()+" : "+e);
		}
	}

	public void add(String e){
		errors.add(e);
	}

	public boolean hasErrors(){
		return !errors.isEmpty();
	}
	public void print(){
		for(String s : errors){
			System.out.println(s);
		}
	}
	public void reset(){
		errors=new LinkedList<>();
	}
	public void merge(Errors e){
		for(String s : e.get()){
			errors.add(s);
		}
	}
}

