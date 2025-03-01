grammar Statements;

// Importing the Expressions grammar to utilize its definitions and rules within this grammar
import Expressions;

// Top-level rule defining all possible types of statements that can be parsed
statement
    : varDeclaration                 // Variable declaration statements
    | assignment                     // Assignment of values to variables
    | expression                     // Expression evaluation
    | ifStatement                    // Conditional "if" statements with optional "else"
    | whileStatement                 // Looping construct: "while"
    | forStatement                   // Looping construct: "for"
    | block                          // A block containing multiple statements grouped with curly braces
    | printStatement                 // Print function for outputting expressions' values
    ;

// Rules for variable declarations
varDeclaration
    : 'var' ID '=' expression ';'    # VarDeclAssign      // Variable declaration with initialization
    | 'var' ID ';'                   # VarDeclNoAssign    // Variable declaration without initialization
    ;

// Rules for assigning values to previously declared variables
assignment
    : ID '=' expression ';'          // Assignment of a value to a variable
    | ID ';'                         // Statement with a single variable reference
    ;

// Rule for defining conditional statements ("if" with optional "else" block)
ifStatement
    : 'if' '(' expression ')' block ('else' block)?     // If-else logic with an optional else block
    ;

// Rule for defining "while" loops
whileStatement
    : 'while' '(' expression ')' block                 // Repeats block as long as the condition in parentheses is true
    ;

// Rule for defining "for" loops
forStatement
    : 'for' '(' (varDeclaration | assignment | '|') expression? '|' expression? ')' block
      // For-loop supports initialization, condition, and iteration expressions in parentheses
    ;

// Rule for print statements
printStatement
    : 'print' '(' expression ')' ';'    // Outputs the value of the expression to the console or output stream
    ;

// Rule defining a block of statements enclosed within curly braces
block
    : '{' statement* '}'                // A block may contain zero or more statements
    ;