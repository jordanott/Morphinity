grammar morphinity;

program : statement+ ;

statement : assign | operation | print;

assign : ID equals (newline matrix | ID newline);
matrix : (row newline)+ ;
row : (NUMBER space)+ NUMBER;
operation : ID equals (ID expr ID | NUMBER expr ID | ID expr NUMBER) newline;
print: 'print ' ID newline;

equals: '=';
expr : '+' | '-' | '.' | '*';
newline : '\n';
space : ' ';
ID : [a-z]+;
NUMBER: [0-9]+;
