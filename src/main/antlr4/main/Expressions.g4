grammar Expressions;

// Importing rules or tokens from a shared/common grammar (e.g., lexer rules for identifiers, keywords, etc.)
import Common;

// Main rule: The 'expression' rule defines valid expressions in the language.
// Each branch of the rule represents a different type of expression.
expression
    : expression ('+' | '-' | '*' | '/') expression          # MathExpr
      // MathExpr: Handles mathematical binary operations like addition, subtraction,
      // multiplication, and division between two expressions.

    | expression ('<' | '>' | '==' | '!=' | '<=' | '>=') expression # ComparisonExpr
      // ComparisonExpr: Handles comparison operators such as equality (==), inequality (!=),
      // and relational comparisons (<, >, <=, >=) between two expressions.

    | expression ('and' | 'or') expression                   # LogicalWordExpr
      // LogicalWordExpr: Logical operations using keywords (e.g., "and" and "or").

    | expression ('&&' | '||') expression                    # LogicalSymbolExpr
      // LogicalSymbolExpr: Logical operations using symbols (&& for logical AND, || for logical OR).

    | '(' expression ')'                                     # ParenExpr
      // ParenExpr: Enclosed expressions inside parentheses, ensuring proper precedence.

    | ID                                                     # VarExpr
      // VarExpr: A single identifier (e.g., a variable name defined elsewhere).

    | STRING                                                 # StringExpr
      // StringExpr: A string literal.

    | NUMBER                                                 # NumberExpr
      // NumberExpr: A numeric literal.

    | BOOLEAN                                                # BooleanExpr
      // BooleanExpr: A boolean literal (true/false).
    ;