grammar ComplexNumber;

program: (statment? ';')* EOF;

statment: show
        | assign
        ;

show: 'output' expr;

assign: expr '=>' ID;

expr: op=('+'|'-') expr           #unario
    | expr op=('*'| ':') expr     #multdiv
    | expr op=('+'|'-') expr      #addsub
    | '(' expr ')'                #parentesis
    | 'input' STRING              #input
    | COMPLEX                     #complex
    | NUMBER                      #number
    | ID                          #variable
    ;

ID: [a-hj-zA-HJ-Z][a-zA-Z0-9]*;
NUMBER: [0-9][0-9]*;
COMPLEX: NUMBER? ('+'|'-')? NUMBER? 'i';
STRING: '"' .*? '"';

WS: [ \t\r\n]+ -> skip;
COMMENT: '##' .*? '\n' -> skip;
ERROR: .;