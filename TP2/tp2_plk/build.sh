VERSION=4.13.2

start="prog"
path="/home/o22102488@campus.univ-orleans.fr/Documents/Compilation/TP2/tp2_plk/antlr-"$VERSION"-complete.jar"
#Vérifier que la librairie antlr est bien présente
if [ -f "$path" ]; then
	echo "antlr4 OK"
else
	echo "téléchargement antlr"
	curl -o $path https://www.antlr.org/download/antlr-$VERSION-complete.jar
fi



te="org.antlr.v4.Tool"

#export CLASSPATH=$CLASSPATH:$path
#generer fichiers java dans le dossier antlr à partir du fichier .g4
java -cp $path -Xmx500M  $te plk.g4 -visitor -o parser 
#ajouter le nom du package en en-tête des fichiers générés
sed -i '1s/^/package parser;\n /' parser/*.java

#les compiler
javac */*.java *.java -cp $path
