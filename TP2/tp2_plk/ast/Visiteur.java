package ast;

public interface Visiteur<T> {
    T visit(ExpInt e);
    T visit(ExpUn e);
    T visit(ExpID e);
    T visit(ExpConst e);
    T visit(ExpBin e);
    T visit(InstVar e);
    T visit(AssignStat e); // Ajout de la méthode pour AssignStat
    T visit(Prog e);
}