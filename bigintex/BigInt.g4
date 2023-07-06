grammar BigInt;

program: (statment? ';')* EOF;

statment: show
        | assign
        ;

show: 'show' expr;

assign: expr '->' ID;

expr: op=('+'|'-') expr             #unario
    | expr op=('*'|'div') expr      #multdiv
    | expr op=('+'|'-') expr        #addsub
    | expr 'mod' expr               #modulo
    | '(' expr ')'                  #parentesis
    | ID                            #variable
    | NUMBER                        #number
    ;

ID: [a-zA-Z][a-zA-Z0-9]*;
NUMBER: [0-9][0-9]*;

WS: [ \t\r\n]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;
ERROR: .;