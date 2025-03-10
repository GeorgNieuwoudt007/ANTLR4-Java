grammar Keywords; // Defines the grammar named "Keywords"

// ANTLR produces errors on build trying to build a grammar file if there is no rule specified, thats why we have a "Placeholder" Rule
placeholder : ;  // A placeholder rule that currently does nothing. You can define actual grammar rules here in the future.

// Lexer rules below define specific keywords for the language.
IF : 'if';       // Matches the keyword 'if'
ELSE : 'else';   // Matches the keyword 'else'
WHILE : 'while'; // Matches the keyword 'while'
FOR : 'for';     // Matches the keyword 'for'
VAR : 'var';     // Matches the keyword 'var'
PRINT : 'print'; // Matches the keyword 'print'
