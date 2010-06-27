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
T21 : 'returns' ;
T22 : '(' ;
T23 : ',' ;
T24 : ')' ;
T25 : '.' ;
T26 : 'true' ;
T27 : 'false' ;

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 1064
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 1066
RULE_INT : ('0'..'9')+;

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 1068
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 1070
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 1072
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 1074
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g" 1076
RULE_ANY_OTHER : .;


