grammar morphinity;

program : statement+ ;

statement : assign | operation | scalar | print;

assign : ID expr newline matrix | ID expr ID | ID expr operation | ID expr scalar;
matrix : (row newline)+ ;
row : (NUMBER space)+ NUMBER;
operation : ID expr ID | ID mult ID;
scalar: NUMBER mult ID;
print: 'print' space ID;

expr : '=' | '+' | '-' | '.' ;
mult : '*';
newline : '\n';
space : ' ';
ID : [a-z]+;
NUMBER: [0-9]+;
