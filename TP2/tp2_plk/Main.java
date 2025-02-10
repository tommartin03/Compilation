import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;


import parser.*;
import ast.*;
public class Main{



	public static void main(String[] a) throws IOException{
		//lecture sur l’entrée standard
		InputStream is = System.in;
		//récupère l’arbre parsé par Antlr
		ParseTree tree = parse(is);
		//le transfore en ast "Noeud"
		//grâce à notre visiteur
		AstBuild ab = new AstBuild();
		Node ast = tree.accept(ab);


		//Visites :
		
		AstPrinter printer = new AstPrinter();
		String code_lisible = ast.accept(printer);
		System.out.println(code_lisible);


	}




	private static ParseTree parse(InputStream is) throws IOException{
		CharStream input = CharStreams.fromStream(is);
		plkLexer lexer= new plkLexer(input);
		CommonTokenStream lexemes = new CommonTokenStream(lexer);
		plkParser parser = new plkParser(lexemes);
		//préciser le symbole de départ de la grammaire !
		//(ici exp, mais à modifier pour considérer les programmes et
		//pas seulement les expressions)
		return parser.exp();
	}

}
