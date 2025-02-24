package semantic;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import support.Errors;
import ast.*;

public class SymbolTable {
	private Errors errors;
	public Errors getErrors(){return errors;}
	//pour les fonctions : 
	private Map<String,MethodSig> methods;
	//pour les blocs : chaque bloc
	// est associé à sa table locale.
	private Map<Block,Map<String,Type>> blocks;

	public SymbolTable(){
		methods=new HashMap<>();
		blocks=new HashMap<>();
		errors=new Errors();
	}

	public void addMethod(String nom,MethodSig ms){
		methods.put(nom, ms);
	}
	public void addLocalVariable(Block block,String nom,Type type){
		if(!blocks.containsKey(block)){
			blocks.put(block, new HashMap<>());
		}
		Map<String, Type> variables = blocks.get(block);
		if(variables.containsKey(nom)){
			errors.add(block, "La variable" + nom + " est déjà déclarée");
			return;
		}
		variables.put(nom, type);
	}
	public void localTable(Block b){
		//créer une nouvelle table pour le bloc b
		if(blocks.containsKey(b)){
			errors.add(b, "Le bloc est déjà déclaré");
		}
		else{
			blocks.put(b, new HashMap<>());
		}
	}
	public MethodSig methodLookup(String name){
		//retourner la signature associée au nom de fonction voulu
		if(methods.containsKey(name)){
			return methods.get(name);
		}
		else{
			System.out.println("Erreur: La méthode" + name + " n'est pas déclarée");
			return null;
		}
	}
	public Type variableLookup(String name, Stack<Block> history, Errors errors) {
		// Parcours des blocs dans l'historique pour rechercher la variable
		for (Block b : history) {
			if (blocks.containsKey(b)) {
				Map<String, Type> variables = blocks.get(b);
				if (variables.containsKey(name)) {
					return variables.get(name);
				}
				else {
					errors.add(b, "La variable " + name + " n'est pas déclarée dans ce bloc");
				}
			}
			else {
				errors.add(b, "Le bloc n'a pas de table associée");
			}
		}
	
		
		return null; // Retourne null si la variable n'est pas trouvée
	}

	//Pour afficher le contenu de la table
	public void print(){
		System.out.println("Table des symboles : ");
		System.out.println("Méthodes : ");
		for (Map.Entry entry : methods.entrySet()){
			System.out.println("clé: "+entry.getKey()
					+ " | valeur: " 
					+ entry.getValue());
		}
		System.out.println("Blocs : ");
		for (Map.Entry entry : blocks.entrySet()){
			System.out.println("clé: "+entry.getKey()
					+ " | valeur: " 
					+ entry.getValue());
		}

	}

}
