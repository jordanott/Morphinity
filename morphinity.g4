grammar morphinity;

program : statement;

statement : assign | operation | scalar;

assign : ID expr newline rowlist;
rowlist : row newline sub;
sub : row newline | row newline sub;
row : NUMBER space item | NUMBER;
item : NUMBER space item | NUMBER;
operation : ID expr ID | ID mult ID;
scalar: NUMBER mult ID;

expr : '=' | '+' | '-' | '.' ;
mult : '*';
newline : '\n';
space : ' ';
ID : [a-z]+;
NUMBER: [0-9]+;
