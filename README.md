# Morphinity
A programming language for matrix math operations  

![AltText](http://images.amcnetworks.com/ifc.com/wp-content/uploads/2015/01/The-Matrix.jpg)

Antlr setup
```
$ cd /usr/local/lib
$ wget http://www.antlr.org/download/antlr-4.7-complete.jar
$ export CLASSPATH=".:/usr/local/lib/antlr-4.7-complete.jar:$CLASSPATH"
$ alias antlr4='java -jar /usr/local/lib/antlr-4.7-complete.jar'
$ alias grun='java org.antlr.v4.gui.TestRig'
```
Building parse tree
```
$ git clone https://github.com/jordanott/Morphinity.git
$ cd Morphinity
$ antlr4 morphinity.g4
$ javac morphinity*.java
$ grun morphinity program -gui
```
