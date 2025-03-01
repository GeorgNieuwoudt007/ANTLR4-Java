# ANTLR4-Java
ANTLR4 compile to Java

This project serves as an example of how to get ANTLR4 (With Java) building through maven and some grammar examples of basics.
This is not an in depth how it works, just an example if someone wants to get started but is stuck a bit.

# Lexers, Parsers, and ANTLR v4: An Overview

---

## What is a Lexer?
A lexer (also known as a scanner or tokenizer) is a program that processes input text and breaks it down into smaller units called tokens. These tokens are meaningful chunks, such as keywords, identifiers, operators, or punctuation.

### Purpose
The main goal of a lexer is to convert raw input into a structured sequence of tokens.

### Example (for the statement `int x = 42;`):
- Token 1: int (Keyword)
- Token 2: x (Identifier)
- Token 3: = (Operator)
- Token 4: 42 (Number)
- Token 5: ; (Punctuation)

---

## What is a Parser?
A parser takes the sequence of tokens produced by a lexer and analyzes it to create a meaningful data structure, typically a parse tree (or Abstract Syntax Tree - AST). This structure represents the syntactic structure of the source code based on grammar rules.

### Purpose
The parser ensures that the sequence of tokens conforms to a specified grammar and produces a tree-like structure to represent it.

### Example (for `int x = 42;`):
Parse tree: Assignment ├─ int ├─ x ├─ = └─ 42
## How Do Lexers and Parsers Work Together?
1. **Lexer**: Reads the input text, applies regular expressions/rules, and emits tokens.
2. **Parser**: Consumes the tokens, applies grammar rules (defined in a formal grammar like context-free grammar), and builds a structured hierarchical representation (such as a parse tree or AST).
3. Together, they bridge the gap between raw text (source code) and a structured representation necessary for further stages like interpretation or compilation.

---

## What is ANTLR v4?
ANTLR (ANother Tool for Language Recognition) is a powerful framework for generating lexers, parsers, and interpreters. It automatically converts grammar definitions into executable code for lexers and parsers in multiple programming languages (e.g., Java, Python, C#, etc.).

### Key Features of ANTLR v4
- **Unified Framework**: Combines both lexical and syntactic analysis (lexer and parser generation).
- **Grammar Support**: Allows developers to define grammar rules in ANTLR's Domain Specific Language (DSL).
- **Error Handling**: Provides robust error recovery for incomplete or incorrect input.
- **Parse Tree/AST**: Automatically generates parse trees that can be processed using listeners or visitors.
- **Customizable**: Enables embedding actions (code) within the grammar for deeper customization.

### How It Works
1. **Input a Grammar File**  
   Define rules for your programming language or data structure in a grammar file, e.g., `MyGrammar.g4`.

2. **Generate Lexer/Parser Code**  
   Use the ANTLR tool to generate code for a lexer, parser, and supporting utilities in the desired language.

3. **Integrate in Code**  
   Use the generated lexer and parser to process input, validate syntax, and build parse trees.

## Popular Uses of ANTLR
- Writing compilers or interpreters for new programming languages.
- Query validation or parsing (e.g., SQL parsers).
- Processing data formats (e.g., JSON, XML).
- Building domain-specific languages (DSLs).

---

## Summary Table

| **Aspect**      | **Lexer**                            | **Parser**                           | **ANTLR v4**                                   |
|------------------|--------------------------------------|---------------------------------------|------------------------------------------------|
| **Purpose**      | Tokenizes input                     | Builds syntax trees                  | Generates Lexer, Parser, and Tree-building code |
| **Input**        | Raw source code                     | Tokens from lexer                    | Grammar file (.g4)                             |
| **Output**       | Tokens                              | Parse Tree/Abstract Syntax Tree (AST)| Lexer/Parser Code                              |
| **Technology**   | Based on regular expressions        | Based on grammar rules (CFGs)        | Combines both lexer and parser functionality   |

---

# Resources for Lexers, Parsers, and ANTLR

## Lexers and Parsers: General Resources
1. **Compiler Construction Basics**
    - *Lexical Analysis & Syntax Analysis* sections in educational resources:  
      [Compiler Construction by Stanford University](https://web.stanford.edu/class/archive/cs/cs143/cs143.1128/)  
      Stanford's resource covers both topics in detail.

2. **Detailed Overview of Lexers and Parsers**
    - A useful resource for understanding how a lexer and parser work step-by-step:  
      [Lexer and Parser Basics - Wikipedia](https://en.wikipedia.org/wiki/Lexical_analysis)

3. **Books About Lexers and Parsers**
    - "Dragon Book" (*Introduction to the Theory of Computation and Parsing*):  
      [Compilers: Principles, Techniques, and Tools](https://www.pearson.com/store/p/compilers-principles-techniques-and-tools/P100000215550)

---

## ANTLR Official Resources
1. **ANTLR Official Website**
    - Everything about ANTLR - the tool itself, grammar files, tutorials, and downloads:  
      [ANTLR.org Official Site](https://www.antlr.org/)

2. **ANTLR Documentation**
    - The official ANTLR4 documentation containing installation instructions, guides, walkthroughs, and API details:  
      [ANTLR4 Documentation](https://github.com/antlr/antlr4/blob/master/doc/index.md)

3. **ANTLR GitHub Repository**
    - Complete open-source repository for ANTLR with examples and active contributions:  
      [ANTLR GitHub Repo](https://github.com/antlr/antlr4)

4. **ANTLR by Tutorials**
    - An official tutorial for learning how to write ANTLR grammars and use them:  
      [Using ANTLR to Process Languages](https://tomassetti.me/antlr-mega-tutorial/)

5. **Lexer and Parser Rules in ANTLR**
    - Official instructions for understanding and creating Lexer and Parser rules:  
      [ANTLR Lexer and Parser Rules](https://github.com/antlr/antlr4/blob/master/doc/lexer-rules.md)

---

## Other Useful Tools & Resources
1. **ANTLRWorks**
    - A powerful GUI development environment for creating, testing, and debugging ANTLR grammars:  
      [ANTLRWorks (Official)](http://www.antlr2.org/software.html)

2. **ANTLR Java API Reference**
    - If you're using Java with ANTLR:  
      [ANTLR Java API Docs](https://www.antlr.org/api/Java/index.html)

3. **Interactive Tutorials and Blog Posts**
    - A beginner-friendly blog tutorial on creating and parsing ANTLR grammars:  
      [ANTLR Blog Guide](https://rpesw.com/compilers/what-parser-generator-an-overview/)
    - Hands-on Mega-Tutorial to learn ANTLR end-to-end:  
      [ANTLR Mega-Tutorial by Federico Tomassetti](https://tomassetti.me/antlr-mega-tutorial/)

---

## Videos & Talks
1. **ANTLR4 Tutorial by Terence Parr (Creator of ANTLR)**
    - Learn ANTLR from the lead developer:  
      [ANTLR4 Overview by Terence Parr (YouTube)](https://www.youtube.com/watch?v=vlug1TxqopA)

2. **Compiler Lectures (MIT OpenCourseWare)**
    - Detailed lectures covering Lexical and Syntax Analysis:  
      [MIT OpenCourseWare Compilers](https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-035-computer-language-engineering-spring-2010/lecture-notes/)

---

## Summary
For anyone wanting to dive into these topics:
- **For Beginners**: Start with [Lexer and Parser Basics - Wikipedia](https://en.wikipedia.org/wiki/Lexical_analysis) or Stanford's [Compiler Construction](https://web.stanford.edu/class/archive/cs/cs143/cs143.1128/) walkthroughs.
- **For ANTLR Experts or Developers**: Explore the [ANTLR docs](https://www.antlr.org/), [Mega-Tutorial](https://tomassetti.me/antlr-mega-tutorial/), and GitHub examples.

Let me know if you'd like more specific references or help with any of these links! 😊