lexer grammar InternalAutomata;
@header {
package soot.typestate.automata.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'package' ;
T12 : ';' ;
T13 : 'automaton' ;
T14 : '{' ;
T15 : 'initial' ;
T16 : '=' ;
T17 : 'error' ;
T18 : '}' ;
T19 : 'state' ;
T20 : '->' ;
T21 : '(' ;
T22 : ')' ;
T23 : '.' ;

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 763
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 765
RULE_INT : ('0'..'9')+;

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 767
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 769
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 771
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 773
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 775
RULE_ANY_OTHER : .;


