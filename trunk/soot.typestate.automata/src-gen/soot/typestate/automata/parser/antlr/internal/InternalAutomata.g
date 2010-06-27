/*
* generated by Xtext
*/
grammar InternalAutomata;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package soot.typestate.automata.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package soot.typestate.automata.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import soot.typestate.automata.services.AutomataGrammarAccess;

}

@parser::members {
 
 	private AutomataGrammarAccess grammarAccess;
 	
    public InternalAutomataParser(TokenStream input, IAstFactory factory, AutomataGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("soot/typestate/automata/parser/antlr/internal/InternalAutomata.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Automata";	
   	} 
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleAutomata
entryRuleAutomata returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getAutomataRule(), currentNode); }
	 iv_ruleAutomata=ruleAutomata 
	 { $current=$iv_ruleAutomata.current; } 
	 EOF 
;

// Rule Automata
ruleAutomata returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getAutomataAccess().getPackagePackageParserRuleCall_0_0(), currentNode); 
	    }
	    lv_package_0=rulePackage 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAutomataRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "package", lv_package_0, "Package", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)?(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getAutomataAccess().getAutomataAutomatonParserRuleCall_1_0(), currentNode); 
	    }
	    lv_automata_1=ruleAutomaton 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAutomataRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		add($current, "automata", lv_automata_1, "Automaton", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)+);





// Entry rule entryRulePackage
entryRulePackage returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getPackageRule(), currentNode); }
	 iv_rulePackage=rulePackage 
	 { $current=$iv_rulePackage.current; } 
	 EOF 
;

// Rule Package
rulePackage returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('package' 
    {
        createLeafNode(grammarAccess.getPackageAccess().getPackageKeyword_0(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getPackageAccess().getNameJAVAIDParserRuleCall_1_0(), currentNode); 
	    }
	    lv_name_1=ruleJAVAID 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPackageRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_1, "JAVAID", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)';' 
    {
        createLeafNode(grammarAccess.getPackageAccess().getSemicolonKeyword_2(), null); 
    }
);





// Entry rule entryRuleAutomaton
entryRuleAutomaton returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getAutomatonRule(), currentNode); }
	 iv_ruleAutomaton=ruleAutomaton 
	 { $current=$iv_ruleAutomaton.current; } 
	 EOF 
;

// Rule Automaton
ruleAutomaton returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('automaton' 
    {
        createLeafNode(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getAutomatonAccess().getKlassClassParserRuleCall_1_0(), currentNode); 
	    }
	    lv_klass_1=ruleClass 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAutomatonRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "klass", lv_klass_1, "Class", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)'{' 
    {
        createLeafNode(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2(), null); 
    }
'initial' 
    {
        createLeafNode(grammarAccess.getAutomatonAccess().getInitialKeyword_3(), null); 
    }
'=' 
    {
        createLeafNode(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_4(), null); 
    }
(	
	
		
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getAutomatonRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getAutomatonAccess().getInitialStateStateCrossReference_5_0(), "initialState"); 
	}

		// TODO assign feature to currentNode
	
)';' 
    {
        createLeafNode(grammarAccess.getAutomatonAccess().getSemicolonKeyword_6(), null); 
    }
('error' 
    {
        createLeafNode(grammarAccess.getAutomatonAccess().getErrorKeyword_7_0(), null); 
    }
'=' 
    {
        createLeafNode(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_7_1(), null); 
    }
(	
	
		
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getAutomatonRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getAutomatonAccess().getErrorStateStateCrossReference_7_2_0(), "errorState"); 
	}

		// TODO assign feature to currentNode
	
)';' 
    {
        createLeafNode(grammarAccess.getAutomatonAccess().getSemicolonKeyword_7_3(), null); 
    }
)?(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_8_0(), currentNode); 
	    }
	    lv_states_11=ruleState 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAutomatonRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		add($current, "states", lv_states_11, "State", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)+'}' 
    {
        createLeafNode(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_9(), null); 
    }
);





// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getClassRule(), currentNode); }
	 iv_ruleClass=ruleClass 
	 { $current=$iv_ruleClass.current; } 
	 EOF 
;

// Rule Class
ruleClass returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getClassAccess().getNameJAVAIDParserRuleCall_0(), currentNode); 
	    }
	    lv_name_0=ruleJAVAID 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getClassRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0, "JAVAID", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
);





// Entry rule entryRuleState
entryRuleState returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); }
	 iv_ruleState=ruleState 
	 { $current=$iv_ruleState.current; } 
	 EOF 
;

// Rule State
ruleState returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('state' 
    {
        createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0(), null); 
    }
(	
	
	    lv_name_1=	RULE_ID
	{
		createLeafNode(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
	}
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_1, "ID", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
)'{' 
    {
        createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0(), currentNode); 
	    }
	    lv_transitions_3=ruleTransition 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		add($current, "transitions", lv_transitions_3, "Transition", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)*'}' 
    {
        createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4(), null); 
    }
);





// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); }
	 iv_ruleTransition=ruleTransition 
	 { $current=$iv_ruleTransition.current; } 
	 EOF 
;

// Rule Transition
ruleTransition returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getInvocationTransitionParserRuleCall_0(), currentNode); 
    }
    this_InvocationTransition_0=ruleInvocationTransition
    { 
        $current = $this_InvocationTransition_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getBranchedTransitionParserRuleCall_1(), currentNode); 
    }
    this_BranchedTransition_1=ruleBranchedTransition
    { 
        $current = $this_BranchedTransition_1.current; 
        currentNode = currentNode.getParent();
    }
);





// Entry rule entryRuleInvocationTransition
entryRuleInvocationTransition returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getInvocationTransitionRule(), currentNode); }
	 iv_ruleInvocationTransition=ruleInvocationTransition 
	 { $current=$iv_ruleInvocationTransition.current; } 
	 EOF 
;

// Rule InvocationTransition
ruleInvocationTransition returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getInvocationTransitionAccess().getInvocationInvocationParserRuleCall_0_0(), currentNode); 
	    }
	    lv_invocation_0=ruleInvocation 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getInvocationTransitionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "invocation", lv_invocation_0, "Invocation", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)'->' 
    {
        createLeafNode(grammarAccess.getInvocationTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1(), null); 
    }
(	
	
		
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getInvocationTransitionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getInvocationTransitionAccess().getStateStateCrossReference_2_0(), "state"); 
	}

		// TODO assign feature to currentNode
	
)';' 
    {
        createLeafNode(grammarAccess.getInvocationTransitionAccess().getSemicolonKeyword_3(), null); 
    }
);





// Entry rule entryRuleBranchedTransition
entryRuleBranchedTransition returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getBranchedTransitionRule(), currentNode); }
	 iv_ruleBranchedTransition=ruleBranchedTransition 
	 { $current=$iv_ruleBranchedTransition.current; } 
	 EOF 
;

// Rule BranchedTransition
ruleBranchedTransition returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getBranchedTransitionAccess().getInvocationInvocationParserRuleCall_0_0(), currentNode); 
	    }
	    lv_invocation_0=ruleInvocation 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBranchedTransitionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "invocation", lv_invocation_0, "Invocation", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)'returns' 
    {
        createLeafNode(grammarAccess.getBranchedTransitionAccess().getReturnsKeyword_1(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getBranchedTransitionAccess().getValueBooleanLiteralParserRuleCall_2_0(), currentNode); 
	    }
	    lv_value_2=ruleBooleanLiteral 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBranchedTransitionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "value", lv_value_2, "BooleanLiteral", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)'->' 
    {
        createLeafNode(grammarAccess.getBranchedTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3(), null); 
    }
(	
	
		
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getBranchedTransitionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getBranchedTransitionAccess().getStateStateCrossReference_4_0(), "state"); 
	}

		// TODO assign feature to currentNode
	
)';' 
    {
        createLeafNode(grammarAccess.getBranchedTransitionAccess().getSemicolonKeyword_5(), null); 
    }
);





// Entry rule entryRuleInvocation
entryRuleInvocation returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getInvocationRule(), currentNode); }
	 iv_ruleInvocation=ruleInvocation 
	 { $current=$iv_ruleInvocation.current; } 
	 EOF 
;

// Rule Invocation
ruleInvocation returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getInvocationAccess().getMethodParserRuleCall_0(), currentNode); 
    }
    this_Method_0=ruleMethod
    { 
        $current = $this_Method_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getInvocationAccess().getConstructorParserRuleCall_1(), currentNode); 
    }
    this_Constructor_1=ruleConstructor
    { 
        $current = $this_Constructor_1.current; 
        currentNode = currentNode.getParent();
    }
);





// Entry rule entryRuleMethod
entryRuleMethod returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getMethodRule(), currentNode); }
	 iv_ruleMethod=ruleMethod 
	 { $current=$iv_ruleMethod.current; } 
	 EOF 
;

// Rule Method
ruleMethod returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getMethodAccess().getReturntypeTypeParserRuleCall_0_0(), currentNode); 
	    }
	    lv_returntype_0=ruleType 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMethodRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "returntype", lv_returntype_0, "Type", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)(	
	
	    lv_name_1=	RULE_ID
	{
		createLeafNode(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
	}
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMethodRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_1, "ID", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
)'(' 
    {
        createLeafNode(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2(), null); 
    }
((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_0_0(), currentNode); 
	    }
	    lv_args_3=ruleType 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMethodRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		add($current, "args", lv_args_3, "Type", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)(',' 
    {
        createLeafNode(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_1_1_0(), currentNode); 
	    }
	    lv_args_5=ruleType 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMethodRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		add($current, "args", lv_args_5, "Type", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
))*)?')' 
    {
        createLeafNode(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4(), null); 
    }
);





// Entry rule entryRuleConstructor
entryRuleConstructor returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getConstructorRule(), currentNode); }
	 iv_ruleConstructor=ruleConstructor 
	 { $current=$iv_ruleConstructor.current; } 
	 EOF 
;

// Rule Constructor
ruleConstructor returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	
	
		
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getConstructorRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getConstructorAccess().getKlassClassCrossReference_0_0(), "klass"); 
	}

		// TODO assign feature to currentNode
	
)'(' 
    {
        createLeafNode(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1(), null); 
    }
((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_0_0(), currentNode); 
	    }
	    lv_args_2=ruleType 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getConstructorRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		add($current, "args", lv_args_2, "Type", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)(',' 
    {
        createLeafNode(grammarAccess.getConstructorAccess().getCommaKeyword_2_1_0(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_1_1_0(), currentNode); 
	    }
	    lv_args_4=ruleType 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getConstructorRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		add($current, "args", lv_args_4, "Type", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
))*)?')' 
    {
        createLeafNode(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_3(), null); 
    }
);





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getTypeAccess().getNameJAVAIDParserRuleCall_0(), currentNode); 
	    }
	    lv_name_0=ruleJAVAID 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_0, "JAVAID", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
);





// Entry rule entryRuleJAVAID
entryRuleJAVAID returns [String current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getJAVAIDRule(), currentNode); } 
	 iv_ruleJAVAID=ruleJAVAID 
	 { $current=$iv_ruleJAVAID.current.getText(); }  
	 EOF 
;

// Rule JAVAID
ruleJAVAID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
	    lastConsumedDatatypeToken = $current;
    }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    createLeafNode(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_0(), null); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0(), null); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    createLeafNode(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1(), null); 
    }
)*)
    ;





// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral returns [String current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getBooleanLiteralRule(), currentNode); } 
	 iv_ruleBooleanLiteral=ruleBooleanLiteral 
	 { $current=$iv_ruleBooleanLiteral.current.getText(); }  
	 EOF 
;

// Rule BooleanLiteral
ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
	    lastConsumedDatatypeToken = $current;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getBooleanLiteralAccess().getTrueParserRuleCall_0(), currentNode); 
    }
    this_True_0=ruleTrue    {
		$current.merge(this_True_0);
    }

    { 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getBooleanLiteralAccess().getFalseParserRuleCall_1(), currentNode); 
    }
    this_False_1=ruleFalse    {
		$current.merge(this_False_1);
    }

    { 
        currentNode = currentNode.getParent();
    }
)
    ;





// Entry rule entryRuleTrue
entryRuleTrue returns [String current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getTrueRule(), currentNode); } 
	 iv_ruleTrue=ruleTrue 
	 { $current=$iv_ruleTrue.current.getText(); }  
	 EOF 
;

// Rule True
ruleTrue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
	    lastConsumedDatatypeToken = $current;
    }:

	kw='true' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getTrueAccess().getTrueKeyword(), null); 
    }

    ;





// Entry rule entryRuleFalse
entryRuleFalse returns [String current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getFalseRule(), currentNode); } 
	 iv_ruleFalse=ruleFalse 
	 { $current=$iv_ruleFalse.current.getText(); }  
	 EOF 
;

// Rule False
ruleFalse returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
	    lastConsumedDatatypeToken = $current;
    }:

	kw='false' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getFalseAccess().getFalseKeyword(), null); 
    }

    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


