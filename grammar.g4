grammar MORPHINITY;

program : statement;

statement : assign | print;

assign : ID’=\n’ rowlist ‘\n’ ;
rowlist : row | row “\n” rowlist;
row : NUMBER | NUMBER “ “ row;

add : ID ‘+’ ID;
subtract : ID ‘-’ ID;
multiply : ID ‘*’ ID | NUMBER ‘*’ ID;
dot product : ID ‘.’ ID;

ID : [a-z]+;
NUMBER: [0-9]+;
