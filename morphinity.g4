grammar morphinity;

program : statement+ ;

statement : assign | operation | scalar | print;

assign : ID expr newline matrix | ID expr ID newline| ID expr operation newline| ID expr scalar newline;
matrix : (row newline)+ ;
row : (NUMBER space)+ NUMBER;
operation : ID expr ID | ID mult ID;
scalar: NUMBER mult ID;
print: 'print ' ID newline;

expr : '=' | '+' | '-' | '.' ;
mult : '*';
newline : '\n';
space : ' ';
ID : [a-z]+;
NUMBER: [0-9]+;
