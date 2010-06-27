lexer grammar InternalAutomata;
@header {
package soot.typestate.automata.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'true' ;
T12 : 'false' ;
T13 : 'package' ;
T14 : ';' ;
T15 : 'automaton' ;
T16 : '{' ;
T17 : 'initial' ;
T18 : '=' ;
T19 : '}' ;
T20 : 'error' ;
T21 : 'state' ;
T22 : '->' ;
T23 : 'returns' ;
T24 : '(' ;
T25 : ')' ;
T26 : ',' ;
T27 : '.' ;

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 2081
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 2083
RULE_INT : ('0'..'9')+;

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 2085
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 2087
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 2089
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 2091
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 2093
RULE_ANY_OTHER : .;


