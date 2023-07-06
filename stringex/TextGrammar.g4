grammar TextGrammar;

program: statment* EOF;

statment: print
        | assign
        ;

print: 'print' expr;

assign: ID ':' expr;

expr: expr '+' expr                #add
    | expr '-' expr                #sub
    | 'trim' expr                  #trim
    | '(' expr ')'                 #parentesis
    | expr '/' expr '/' expr       #replace
    | 'input' '(' expr ')'         #input
    | ID                           #id
    | LITERAL                      #literal
    ;

ID: [a-z][a-zA-Z0-9]*;
LITERAL: '"' .*? '"';

WS: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;
ERROR: .;