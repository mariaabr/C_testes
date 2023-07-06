grammar FracLang;

program: (statment? ';')* EOF;

statment: display
        | assign
        ;

display: 'display' expr;

assign: ID '<=' expr;

expr: op=('+'|'-') expr        #unary
    | expr op=('*'|':') expr   #multdiv
    | expr op=('+'|'-') expr   #addsub
    | '(' expr ')'             #parentesis
    | 'read' STRING            #read
    | 'reduce' expr            #reduce
    | ID                       #id
    | NUM                      #num
    | FRACTION                 #fraction
    | STRING                   #string
    ;

ID: [a-z]+;
NUM: [0-9][0-9]*;
FRACTION: NUM '/' NUM;
STRING: '"' .*? '"';

WS: [ \t\r\n]+ -> skip;
COMMENT: '--' .*? '\n' -> skip;
ERROR: .;