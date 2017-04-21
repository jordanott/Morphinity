grammar MORPHINITY;

program : statement;

statement : assign | print;

assign : ID expr rowlist newline;
rowlist : row | row newline rowlist;
row : NUMBER | NUMBER row;
operation : ID expr ID | ID mult ID;
scalar: NUMBER mult ID;

expr : '=' | '+' | '-' | '.' ;
mult : '*';
newline : '\n';
ID : [a-z]+;
NUMBER: [0-9]+;
