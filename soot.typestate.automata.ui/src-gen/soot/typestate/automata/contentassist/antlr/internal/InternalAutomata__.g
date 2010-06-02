lexer grammar InternalAutomata;
@header {
package soot.typestate.automata.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'package' ;
T12 : ';' ;
T13 : 'automaton' ;
T14 : '{' ;
T15 : 'initial' ;
T16 : '=' ;
T17 : '}' ;
T18 : 'error' ;
T19 : 'state' ;
T20 : '->' ;
T21 : '(' ;
T22 : ')' ;
T23 : '.' ;

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 1531
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 1533
RULE_INT : ('0'..'9')+;

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 1535
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 1537
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 1539
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 1541
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g" 1543
RULE_ANY_OTHER : .;


