grammar Common;

// Main grammar file definition for a language named "Common"

// ANTLR produces errors on build trying to build a grammar file if there is no rule specified, thats why we have a "Placeholder" Rule
// This is a placeholder rule for future additions
placeholder : ;

// Lexer Rules

// BOOLEAN tokens to match 'yes' or 'no'.
BOOLEAN : 'yes' | 'no';

// NUMBER rule to match integer and floating-point numbers.
// Examples: 42, 3.14
NUMBER  : [0-9]+ ('.' [0-9]+)?;

// STRING rule to match sequences enclosed in double quotes.
// Example: "example string"
STRING  : '"' .*? '"';

// ID matches valid identifiers consisting of letters, digits, and underscores.
// Must start with a letter or underscore.
// Example: variable_name, _id
ID : [a-zA-Z_][a-zA-Z0-9_]*;

// Operators and Symbols
// These tokens match common operators and symbols used in expressions.

// Logical operators for "and" and "or" in natural language.
AND : 'and'; // Keyword logical "and"
OR : 'or';   // Keyword logical "or"

// Logical operators using symbols.
LOGICAL_AND : '&&'; // Symbolic logical "and"
LOGICAL_OR : '||';  // Symbolic logical "or"

// Assignment operator.
ASSIGN : '='; // "=" for assignment or equality contexts

// Arithmetic operators.
PLUS : '+';  // Addition
MINUS : '-'; // Subtraction
MULT : '*';  // Multiplication
DIV : '/';   // Division

// Parentheses and braces for grouping and block structures.
LPAREN : '(';  // Opening parenthesis
RPAREN : ')';  // Closing parenthesis
LBRACE : '{';  // Opening brace
RBRACE : '}';  // Closing brace

// Semicolon used to terminate statements.
SEMI : ';';   // Semicolon as a statement terminator

// Relational operators for comparisons.
LT : '<';    // Less than
GT : '>';    // Greater than
EQ : '==';   // Equal to
NEQ : '!=';  // Not equal to
LTE : '<=';  // Less than or equal to
GTE : '>=';  // Greater than or equal to

// Ignoring Whitespace and Comments

// Skipping whitespace tokens: spaces, tabs, newlines.
// These do not affect parsing and are ignored.
WS : [ \t\r\n]+ -> skip;

// Skipping single-line comments starting with "//"
// Everything from // to the end of the line is ignored.
COMMENT : '//' ~[\r\n]* -> skip;

// Skipping multi-line comments enclosed between /* and */.
// Supports any content inside the comment block.
MULTILINE_COMMENT : '/*' .*? '*/' -> skip; // Greedy multiline comment skipping