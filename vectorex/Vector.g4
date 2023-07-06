grammar Vector;

program: (statment? ';')* EOF;

statment: show
        | assign
        ;

show: 'show' expr;

assign: expr '->' ID;

expr: op=('+'|'-') expr         #unario
    | expr '*' expr             #multiplic
    | expr '.' expr             #prodinterno
    | expr op=('+'|'-') expr    #addsub
    | '(' expr ')'              #parentesis
    | VECTOR                    #vector
    | ESCALAR                   #escalar
    | ID                        #variable
    ;

ID: [a-z][a-z0-9]*;
ESCALAR: [0-9][0-9]* ('.'[0-9][0-9]*)?;
VECTOR: '[' (ESCALAR (',' ESCALAR)*)? ']';

WS: [ \t\r\n]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;
ERROR: .;