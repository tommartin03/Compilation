import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.*;
import ast.*;

public class Main {

    public static void main(String[] a) throws IOException {
        // Exemple de programme à analyser
        String input = "int x;\nx = (-4);";
        // Convertir la chaîne en InputStream
        InputStream is = new ByteArrayInputStream(input.getBytes());
        // Récupère l’arbre parsé par Antlr
        ParseTree tree = parse(is);
        // Le transforme en ast "Noeud"
        // Grâce à notre visiteur
        AstBuild ab = new AstBuild();
        Node ast = tree.accept(ab);

        // Visites :
        AstPrinter printer = new AstPrinter();
        String code_lisible = ast.accept(printer);
        System.out.println(code_lisible);
    }

    private static ParseTree parse(InputStream is) throws IOException {
        CharStream input = CharStreams.fromStream(is);
        plkLexer lexer = new plkLexer(input);
        CommonTokenStream lexemes = new CommonTokenStream(lexer);
        plkParser parser = new plkParser(lexemes);
        // Préciser le symbole de départ de la grammaire (ici prog)
        return parser.prog();
    }
}