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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalAutomataParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'automaton'", "'{'", "'initial'", "'='", "'error'", "'}'", "'state'", "'->'", "'('", "')'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalAutomataParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g"; }


     
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



    // $ANTLR start entryRuleAutomata
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:72:1: entryRuleAutomata returns [EObject current=null] : iv_ruleAutomata= ruleAutomata EOF ;
    public final EObject entryRuleAutomata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomata = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:72:50: (iv_ruleAutomata= ruleAutomata EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:73:2: iv_ruleAutomata= ruleAutomata EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAutomataRule(), currentNode); 
            pushFollow(FOLLOW_ruleAutomata_in_entryRuleAutomata73);
            iv_ruleAutomata=ruleAutomata();
            _fsp--;

             current =iv_ruleAutomata; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutomata83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAutomata


    // $ANTLR start ruleAutomata
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:80:1: ruleAutomata returns [EObject current=null] : ( (lv_package_0= rulePackage )? (lv_automata_1= ruleAutomaton )+ ) ;
    public final EObject ruleAutomata() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0 = null;

        EObject lv_automata_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:85:6: ( ( (lv_package_0= rulePackage )? (lv_automata_1= ruleAutomaton )+ ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:86:1: ( (lv_package_0= rulePackage )? (lv_automata_1= ruleAutomaton )+ )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:86:1: ( (lv_package_0= rulePackage )? (lv_automata_1= ruleAutomaton )+ )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:86:2: (lv_package_0= rulePackage )? (lv_automata_1= ruleAutomaton )+
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:86:2: (lv_package_0= rulePackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:89:6: lv_package_0= rulePackage
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAutomataAccess().getPackagePackageParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePackage_in_ruleAutomata142);
                    lv_package_0=rulePackage();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAutomataRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "package", lv_package_0, "Package", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:107:3: (lv_automata_1= ruleAutomaton )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:110:6: lv_automata_1= ruleAutomaton
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAutomataAccess().getAutomataAutomatonParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAutomaton_in_ruleAutomata181);
            	    lv_automata_1=ruleAutomaton();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAutomataRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "automata", lv_automata_1, "Automaton", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAutomata


    // $ANTLR start entryRulePackage
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:135:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:135:49: (iv_rulePackage= rulePackage EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:136:2: iv_rulePackage= rulePackage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackageRule(), currentNode); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage219);
            iv_rulePackage=rulePackage();
            _fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage229); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePackage


    // $ANTLR start rulePackage
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:143:1: rulePackage returns [EObject current=null] : ( 'package' (lv_name_1= ruleJAVAID ) ';' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:148:6: ( ( 'package' (lv_name_1= ruleJAVAID ) ';' ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:149:1: ( 'package' (lv_name_1= ruleJAVAID ) ';' )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:149:1: ( 'package' (lv_name_1= ruleJAVAID ) ';' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:149:2: 'package' (lv_name_1= ruleJAVAID ) ';'
            {
            match(input,11,FOLLOW_11_in_rulePackage263); 

                    createLeafNode(grammarAccess.getPackageAccess().getPackageKeyword_0(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:153:1: (lv_name_1= ruleJAVAID )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:156:6: lv_name_1= ruleJAVAID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPackageAccess().getNameJAVAIDParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleJAVAID_in_rulePackage297);
            lv_name_1=ruleJAVAID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPackageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "JAVAID", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,12,FOLLOW_12_in_rulePackage310); 

                    createLeafNode(grammarAccess.getPackageAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePackage


    // $ANTLR start entryRuleAutomaton
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:185:1: entryRuleAutomaton returns [EObject current=null] : iv_ruleAutomaton= ruleAutomaton EOF ;
    public final EObject entryRuleAutomaton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomaton = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:185:51: (iv_ruleAutomaton= ruleAutomaton EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:186:2: iv_ruleAutomaton= ruleAutomaton EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAutomatonRule(), currentNode); 
            pushFollow(FOLLOW_ruleAutomaton_in_entryRuleAutomaton343);
            iv_ruleAutomaton=ruleAutomaton();
            _fsp--;

             current =iv_ruleAutomaton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutomaton353); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAutomaton


    // $ANTLR start ruleAutomaton
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:193:1: ruleAutomaton returns [EObject current=null] : ( 'automaton' (lv_klass_1= ruleClass ) '{' 'initial' '=' ( RULE_ID ) ';' ( 'error' '=' ( RULE_ID ) ';' )? (lv_states_11= ruleState )+ '}' ) ;
    public final EObject ruleAutomaton() throws RecognitionException {
        EObject current = null;

        EObject lv_klass_1 = null;

        EObject lv_states_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:198:6: ( ( 'automaton' (lv_klass_1= ruleClass ) '{' 'initial' '=' ( RULE_ID ) ';' ( 'error' '=' ( RULE_ID ) ';' )? (lv_states_11= ruleState )+ '}' ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:199:1: ( 'automaton' (lv_klass_1= ruleClass ) '{' 'initial' '=' ( RULE_ID ) ';' ( 'error' '=' ( RULE_ID ) ';' )? (lv_states_11= ruleState )+ '}' )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:199:1: ( 'automaton' (lv_klass_1= ruleClass ) '{' 'initial' '=' ( RULE_ID ) ';' ( 'error' '=' ( RULE_ID ) ';' )? (lv_states_11= ruleState )+ '}' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:199:2: 'automaton' (lv_klass_1= ruleClass ) '{' 'initial' '=' ( RULE_ID ) ';' ( 'error' '=' ( RULE_ID ) ';' )? (lv_states_11= ruleState )+ '}'
            {
            match(input,13,FOLLOW_13_in_ruleAutomaton387); 

                    createLeafNode(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:203:1: (lv_klass_1= ruleClass )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:206:6: lv_klass_1= ruleClass
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAutomatonAccess().getKlassClassParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleClass_in_ruleAutomaton421);
            lv_klass_1=ruleClass();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAutomatonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "klass", lv_klass_1, "Class", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,14,FOLLOW_14_in_ruleAutomaton434); 

                    createLeafNode(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,15,FOLLOW_15_in_ruleAutomaton443); 

                    createLeafNode(grammarAccess.getAutomatonAccess().getInitialKeyword_3(), null); 
                
            match(input,16,FOLLOW_16_in_ruleAutomaton452); 

                    createLeafNode(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_4(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:236:1: ( RULE_ID )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:239:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAutomatonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAutomaton474); 

            		createLeafNode(grammarAccess.getAutomatonAccess().getInitialStateStateCrossReference_5_0(), "initialState"); 
            	

            }

            match(input,12,FOLLOW_12_in_ruleAutomaton486); 

                    createLeafNode(grammarAccess.getAutomatonAccess().getSemicolonKeyword_6(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:256:1: ( 'error' '=' ( RULE_ID ) ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:256:2: 'error' '=' ( RULE_ID ) ';'
                    {
                    match(input,17,FOLLOW_17_in_ruleAutomaton496); 

                            createLeafNode(grammarAccess.getAutomatonAccess().getErrorKeyword_7_0(), null); 
                        
                    match(input,16,FOLLOW_16_in_ruleAutomaton505); 

                            createLeafNode(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_7_1(), null); 
                        
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:264:1: ( RULE_ID )
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:267:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAutomatonRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAutomaton527); 

                    		createLeafNode(grammarAccess.getAutomatonAccess().getErrorStateStateCrossReference_7_2_0(), "errorState"); 
                    	

                    }

                    match(input,12,FOLLOW_12_in_ruleAutomaton539); 

                            createLeafNode(grammarAccess.getAutomatonAccess().getSemicolonKeyword_7_3(), null); 
                        

                    }
                    break;

            }

            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:284:3: (lv_states_11= ruleState )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:287:6: lv_states_11= ruleState
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleAutomaton575);
            	    lv_states_11=ruleState();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAutomatonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "states", lv_states_11, "State", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match(input,18,FOLLOW_18_in_ruleAutomaton589); 

                    createLeafNode(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAutomaton


    // $ANTLR start entryRuleClass
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:316:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:316:47: (iv_ruleClass= ruleClass EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:317:2: iv_ruleClass= ruleClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass622);
            iv_ruleClass=ruleClass();
            _fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass632); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClass


    // $ANTLR start ruleClass
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:324:1: ruleClass returns [EObject current=null] : (lv_name_0= ruleJAVAID ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:329:6: ( (lv_name_0= ruleJAVAID ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:330:1: (lv_name_0= ruleJAVAID )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:330:1: (lv_name_0= ruleJAVAID )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:333:6: lv_name_0= ruleJAVAID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClassAccess().getNameJAVAIDParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleJAVAID_in_ruleClass690);
            lv_name_0=ruleJAVAID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "JAVAID", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleClass


    // $ANTLR start entryRuleState
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:358:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:358:47: (iv_ruleState= ruleState EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:359:2: iv_ruleState= ruleState EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState726);
            iv_ruleState=ruleState();
            _fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState736); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:366:1: ruleState returns [EObject current=null] : ( (lv_initial_0= 'initial' )? 'state' (lv_name_2= RULE_ID ) '{' (lv_transitions_4= ruleTransition )* '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0=null;
        Token lv_name_2=null;
        EObject lv_transitions_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:371:6: ( ( (lv_initial_0= 'initial' )? 'state' (lv_name_2= RULE_ID ) '{' (lv_transitions_4= ruleTransition )* '}' ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:372:1: ( (lv_initial_0= 'initial' )? 'state' (lv_name_2= RULE_ID ) '{' (lv_transitions_4= ruleTransition )* '}' )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:372:1: ( (lv_initial_0= 'initial' )? 'state' (lv_name_2= RULE_ID ) '{' (lv_transitions_4= ruleTransition )* '}' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:372:2: (lv_initial_0= 'initial' )? 'state' (lv_name_2= RULE_ID ) '{' (lv_transitions_4= ruleTransition )* '}'
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:372:2: (lv_initial_0= 'initial' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:374:6: lv_initial_0= 'initial'
                    {
                    lv_initial_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleState782); 

                            createLeafNode(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0(), "initial"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "initial", true, "initial", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleState805); 

                    createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:397:1: (lv_name_2= RULE_ID )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:399:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState827); 

            		createLeafNode(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,14,FOLLOW_14_in_ruleState844); 

                    createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:421:1: (lv_transitions_4= ruleTransition )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:424:6: lv_transitions_4= ruleTransition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState878);
            	    lv_transitions_4=ruleTransition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "transitions", lv_transitions_4, "Transition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleState892); 

                    createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleState


    // $ANTLR start entryRuleTransition
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:453:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:453:52: (iv_ruleTransition= ruleTransition EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:454:2: iv_ruleTransition= ruleTransition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition925);
            iv_ruleTransition=ruleTransition();
            _fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition935); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTransition


    // $ANTLR start ruleTransition
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:461:1: ruleTransition returns [EObject current=null] : ( ( (lv_method_0= ruleMethod ) | this_Constructor_1= ruleConstructor ) '->' ( RULE_ID ) ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject lv_method_0 = null;

        EObject this_Constructor_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:466:6: ( ( ( (lv_method_0= ruleMethod ) | this_Constructor_1= ruleConstructor ) '->' ( RULE_ID ) ';' ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:467:1: ( ( (lv_method_0= ruleMethod ) | this_Constructor_1= ruleConstructor ) '->' ( RULE_ID ) ';' )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:467:1: ( ( (lv_method_0= ruleMethod ) | this_Constructor_1= ruleConstructor ) '->' ( RULE_ID ) ';' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:467:2: ( (lv_method_0= ruleMethod ) | this_Constructor_1= ruleConstructor ) '->' ( RULE_ID ) ';'
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:467:2: ( (lv_method_0= ruleMethod ) | this_Constructor_1= ruleConstructor )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:467:3: (lv_method_0= ruleMethod )
                    {
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:467:3: (lv_method_0= ruleMethod )
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:470:6: lv_method_0= ruleMethod
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getMethodMethodParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleMethod_in_ruleTransition995);
                    lv_method_0=ruleMethod();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "method", lv_method_0, "Method", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:490:5: this_Constructor_1= ruleConstructor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getConstructorParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConstructor_in_ruleTransition1027);
                    this_Constructor_1=ruleConstructor();
                    _fsp--;

                     
                            current = this_Constructor_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_ruleTransition1036); 

                    createLeafNode(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:502:1: ( RULE_ID )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:505:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition1058); 

            		createLeafNode(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0(), "state"); 
            	

            }

            match(input,12,FOLLOW_12_in_ruleTransition1070); 

                    createLeafNode(grammarAccess.getTransitionAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTransition


    // $ANTLR start entryRuleMethod
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:529:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:529:48: (iv_ruleMethod= ruleMethod EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:530:2: iv_ruleMethod= ruleMethod EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMethodRule(), currentNode); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1103);
            iv_ruleMethod=ruleMethod();
            _fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1113); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMethod


    // $ANTLR start ruleMethod
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:537:1: ruleMethod returns [EObject current=null] : ( (lv_returntype_0= ruleType ) (lv_name_1= RULE_ID ) '(' (lv_args_3= ruleType )* ')' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_returntype_0 = null;

        EObject lv_args_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:542:6: ( ( (lv_returntype_0= ruleType ) (lv_name_1= RULE_ID ) '(' (lv_args_3= ruleType )* ')' ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:543:1: ( (lv_returntype_0= ruleType ) (lv_name_1= RULE_ID ) '(' (lv_args_3= ruleType )* ')' )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:543:1: ( (lv_returntype_0= ruleType ) (lv_name_1= RULE_ID ) '(' (lv_args_3= ruleType )* ')' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:543:2: (lv_returntype_0= ruleType ) (lv_name_1= RULE_ID ) '(' (lv_args_3= ruleType )* ')'
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:543:2: (lv_returntype_0= ruleType )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:546:6: lv_returntype_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMethodAccess().getReturntypeTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleMethod1172);
            lv_returntype_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMethodRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "returntype", lv_returntype_0, "Type", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:564:2: (lv_name_1= RULE_ID )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:566:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod1198); 

            		createLeafNode(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMethodRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,21,FOLLOW_21_in_ruleMethod1215); 

                    createLeafNode(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:588:1: (lv_args_3= ruleType )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:591:6: lv_args_3= ruleType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleMethod1249);
            	    lv_args_3=ruleType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMethodRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "args", lv_args_3, "Type", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,22,FOLLOW_22_in_ruleMethod1263); 

                    createLeafNode(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMethod


    // $ANTLR start entryRuleConstructor
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:620:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:620:53: (iv_ruleConstructor= ruleConstructor EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:621:2: iv_ruleConstructor= ruleConstructor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstructorRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor1296);
            iv_ruleConstructor=ruleConstructor();
            _fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor1306); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstructor


    // $ANTLR start ruleConstructor
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:628:1: ruleConstructor returns [EObject current=null] : (this_Class_0= ruleClass '(' (lv_args_2= ruleType )* ')' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject lv_args_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:633:6: ( (this_Class_0= ruleClass '(' (lv_args_2= ruleType )* ')' ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:634:1: (this_Class_0= ruleClass '(' (lv_args_2= ruleType )* ')' )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:634:1: (this_Class_0= ruleClass '(' (lv_args_2= ruleType )* ')' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:635:5: this_Class_0= ruleClass '(' (lv_args_2= ruleType )* ')'
            {
             
                    currentNode=createCompositeNode(grammarAccess.getConstructorAccess().getClassParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleClass_in_ruleConstructor1353);
            this_Class_0=ruleClass();
            _fsp--;

             
                    current = this_Class_0; 
                    currentNode = currentNode.getParent();
                
            match(input,21,FOLLOW_21_in_ruleConstructor1361); 

                    createLeafNode(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:647:1: (lv_args_2= ruleType )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:650:6: lv_args_2= ruleType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleConstructor1395);
            	    lv_args_2=ruleType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getConstructorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "args", lv_args_2, "Type", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,22,FOLLOW_22_in_ruleConstructor1409); 

                    createLeafNode(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstructor


    // $ANTLR start entryRuleType
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:679:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:679:46: (iv_ruleType= ruleType EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:680:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1442);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1452); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:687:1: ruleType returns [EObject current=null] : (lv_name_0= ruleJAVAID ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:692:6: ( (lv_name_0= ruleJAVAID ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:693:1: (lv_name_0= ruleJAVAID )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:693:1: (lv_name_0= ruleJAVAID )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:696:6: lv_name_0= ruleJAVAID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeAccess().getNameJAVAIDParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleJAVAID_in_ruleType1510);
            lv_name_0=ruleJAVAID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "JAVAID", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleJAVAID
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:721:1: entryRuleJAVAID returns [String current=null] : iv_ruleJAVAID= ruleJAVAID EOF ;
    public final String entryRuleJAVAID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJAVAID = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:721:47: (iv_ruleJAVAID= ruleJAVAID EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:722:2: iv_ruleJAVAID= ruleJAVAID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJAVAIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleJAVAID_in_entryRuleJAVAID1547);
            iv_ruleJAVAID=ruleJAVAID();
            _fsp--;

             current =iv_ruleJAVAID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJAVAID1558); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleJAVAID


    // $ANTLR start ruleJAVAID
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:729:1: ruleJAVAID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleJAVAID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:735:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:736:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:736:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:736:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJAVAID1598); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:743:1: (kw= '.' this_ID_2= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:744:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,23,FOLLOW_23_in_ruleJAVAID1617); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJAVAID1632); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleJAVAID


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\6\uffff";
    static final String DFA7_eofS =
        "\6\uffff";
    static final String DFA7_minS =
        "\3\4\2\uffff\1\4";
    static final String DFA7_maxS =
        "\1\4\1\27\1\4\2\uffff\1\27";
    static final String DFA7_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA7_specialS =
        "\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\3\20\uffff\1\4\1\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\3\20\uffff\1\4\1\uffff\1\2"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "467:2: ( (lv_method_0= ruleMethod ) | this_Constructor_1= ruleConstructor )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAutomata_in_entryRuleAutomata73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutomata83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleAutomata142 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleAutomaton_in_ruleAutomata181 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackage263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rulePackage297 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackage310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomaton_in_entryRuleAutomaton343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutomaton353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAutomaton387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClass_in_ruleAutomaton421 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAutomaton434 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAutomaton443 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAutomaton452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAutomaton474 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAutomaton486 = new BitSet(new long[]{0x00000000000A8000L});
    public static final BitSet FOLLOW_17_in_ruleAutomaton496 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAutomaton505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAutomaton527 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAutomaton539 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_ruleState_in_ruleAutomaton575 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_18_in_ruleAutomaton589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_ruleClass690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleState782 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleState805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState827 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState844 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState878 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleState892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleTransition995 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleTransition1027 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTransition1036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition1058 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTransition1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod1172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1198 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMethod1215 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod1249 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleMethod1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor1296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleConstructor1353 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConstructor1361 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleType_in_ruleConstructor1395 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleConstructor1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_ruleType1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_entryRuleJAVAID1547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJAVAID1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJAVAID1598 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleJAVAID1617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJAVAID1632 = new BitSet(new long[]{0x0000000000800002L});

}