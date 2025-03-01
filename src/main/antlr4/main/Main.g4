// This is the grammar definition file for ANTLR.
// It defines the structure for parsing and recognizing patterns in specific languages or files.

// Define the grammar name.
grammar Main;

// The '@header' section is metadata for the generated parser.
// Here the 'package main;' ensures the generated Java code is placed under the 'main' package.
@header {
package main;
}

// Import another grammar file named 'Statements'.
// This allows code and rules from 'Statements.g4' to be reused in this grammar.
import Statements;

// Define the top-level parsing rule named 'program'.
// A 'program' consists of zero or more 'statement' rules.
// The '*': zero or more occurrences indicator.
program : statement*;