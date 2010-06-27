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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'automaton'", "'{'", "'initial'", "'='", "'error'", "'}'", "'state'", "'->'", "'returns'", "'('", "','", "')'", "'.'", "'true'", "'false'"
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

                if ( (LA4_0==19) ) {
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
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:366:1: ruleState returns [EObject current=null] : ( 'state' (lv_name_1= RULE_ID ) '{' (lv_transitions_3= ruleTransition )* '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_transitions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:371:6: ( ( 'state' (lv_name_1= RULE_ID ) '{' (lv_transitions_3= ruleTransition )* '}' ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:372:1: ( 'state' (lv_name_1= RULE_ID ) '{' (lv_transitions_3= ruleTransition )* '}' )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:372:1: ( 'state' (lv_name_1= RULE_ID ) '{' (lv_transitions_3= ruleTransition )* '}' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:372:2: 'state' (lv_name_1= RULE_ID ) '{' (lv_transitions_3= ruleTransition )* '}'
            {
            match(input,19,FOLLOW_19_in_ruleState770); 

                    createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:376:1: (lv_name_1= RULE_ID )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:378:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState792); 

            		createLeafNode(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,14,FOLLOW_14_in_ruleState809); 

                    createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:400:1: (lv_transitions_3= ruleTransition )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:403:6: lv_transitions_3= ruleTransition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState843);
            	    lv_transitions_3=ruleTransition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "transitions", lv_transitions_3, "Transition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleState857); 

                    createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:432:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:432:52: (iv_ruleTransition= ruleTransition EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:433:2: iv_ruleTransition= ruleTransition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition890);
            iv_ruleTransition=ruleTransition();
            _fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition900); 

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
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:440:1: ruleTransition returns [EObject current=null] : (this_InvocationTransition_0= ruleInvocationTransition | this_BranchedTransition_1= ruleBranchedTransition ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject this_InvocationTransition_0 = null;

        EObject this_BranchedTransition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:445:6: ( (this_InvocationTransition_0= ruleInvocationTransition | this_BranchedTransition_1= ruleBranchedTransition ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:446:1: (this_InvocationTransition_0= ruleInvocationTransition | this_BranchedTransition_1= ruleBranchedTransition )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:446:1: (this_InvocationTransition_0= ruleInvocationTransition | this_BranchedTransition_1= ruleBranchedTransition )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:447:5: this_InvocationTransition_0= ruleInvocationTransition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getInvocationTransitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInvocationTransition_in_ruleTransition947);
                    this_InvocationTransition_0=ruleInvocationTransition();
                    _fsp--;

                     
                            current = this_InvocationTransition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:457:5: this_BranchedTransition_1= ruleBranchedTransition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getBranchedTransitionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBranchedTransition_in_ruleTransition974);
                    this_BranchedTransition_1=ruleBranchedTransition();
                    _fsp--;

                     
                            current = this_BranchedTransition_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

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


    // $ANTLR start entryRuleInvocationTransition
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:472:1: entryRuleInvocationTransition returns [EObject current=null] : iv_ruleInvocationTransition= ruleInvocationTransition EOF ;
    public final EObject entryRuleInvocationTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationTransition = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:472:62: (iv_ruleInvocationTransition= ruleInvocationTransition EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:473:2: iv_ruleInvocationTransition= ruleInvocationTransition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInvocationTransitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInvocationTransition_in_entryRuleInvocationTransition1006);
            iv_ruleInvocationTransition=ruleInvocationTransition();
            _fsp--;

             current =iv_ruleInvocationTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvocationTransition1016); 

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
    // $ANTLR end entryRuleInvocationTransition


    // $ANTLR start ruleInvocationTransition
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:480:1: ruleInvocationTransition returns [EObject current=null] : ( (lv_invocation_0= ruleInvocation ) '->' ( RULE_ID ) ';' ) ;
    public final EObject ruleInvocationTransition() throws RecognitionException {
        EObject current = null;

        EObject lv_invocation_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:485:6: ( ( (lv_invocation_0= ruleInvocation ) '->' ( RULE_ID ) ';' ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:486:1: ( (lv_invocation_0= ruleInvocation ) '->' ( RULE_ID ) ';' )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:486:1: ( (lv_invocation_0= ruleInvocation ) '->' ( RULE_ID ) ';' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:486:2: (lv_invocation_0= ruleInvocation ) '->' ( RULE_ID ) ';'
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:486:2: (lv_invocation_0= ruleInvocation )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:489:6: lv_invocation_0= ruleInvocation
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInvocationTransitionAccess().getInvocationInvocationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInvocation_in_ruleInvocationTransition1075);
            lv_invocation_0=ruleInvocation();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInvocationTransitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "invocation", lv_invocation_0, "Invocation", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,20,FOLLOW_20_in_ruleInvocationTransition1088); 

                    createLeafNode(grammarAccess.getInvocationTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:511:1: ( RULE_ID )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:514:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInvocationTransitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvocationTransition1110); 

            		createLeafNode(grammarAccess.getInvocationTransitionAccess().getStateStateCrossReference_2_0(), "state"); 
            	

            }

            match(input,12,FOLLOW_12_in_ruleInvocationTransition1122); 

                    createLeafNode(grammarAccess.getInvocationTransitionAccess().getSemicolonKeyword_3(), null); 
                

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
    // $ANTLR end ruleInvocationTransition


    // $ANTLR start entryRuleBranchedTransition
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:538:1: entryRuleBranchedTransition returns [EObject current=null] : iv_ruleBranchedTransition= ruleBranchedTransition EOF ;
    public final EObject entryRuleBranchedTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchedTransition = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:538:60: (iv_ruleBranchedTransition= ruleBranchedTransition EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:539:2: iv_ruleBranchedTransition= ruleBranchedTransition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBranchedTransitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBranchedTransition_in_entryRuleBranchedTransition1155);
            iv_ruleBranchedTransition=ruleBranchedTransition();
            _fsp--;

             current =iv_ruleBranchedTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranchedTransition1165); 

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
    // $ANTLR end entryRuleBranchedTransition


    // $ANTLR start ruleBranchedTransition
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:546:1: ruleBranchedTransition returns [EObject current=null] : ( (lv_invocation_0= ruleInvocation ) 'returns' (lv_value_2= ruleBooleanLiteral ) '->' ( RULE_ID ) ';' ) ;
    public final EObject ruleBranchedTransition() throws RecognitionException {
        EObject current = null;

        EObject lv_invocation_0 = null;

        AntlrDatatypeRuleToken lv_value_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:551:6: ( ( (lv_invocation_0= ruleInvocation ) 'returns' (lv_value_2= ruleBooleanLiteral ) '->' ( RULE_ID ) ';' ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:552:1: ( (lv_invocation_0= ruleInvocation ) 'returns' (lv_value_2= ruleBooleanLiteral ) '->' ( RULE_ID ) ';' )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:552:1: ( (lv_invocation_0= ruleInvocation ) 'returns' (lv_value_2= ruleBooleanLiteral ) '->' ( RULE_ID ) ';' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:552:2: (lv_invocation_0= ruleInvocation ) 'returns' (lv_value_2= ruleBooleanLiteral ) '->' ( RULE_ID ) ';'
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:552:2: (lv_invocation_0= ruleInvocation )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:555:6: lv_invocation_0= ruleInvocation
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBranchedTransitionAccess().getInvocationInvocationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInvocation_in_ruleBranchedTransition1224);
            lv_invocation_0=ruleInvocation();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBranchedTransitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "invocation", lv_invocation_0, "Invocation", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,21,FOLLOW_21_in_ruleBranchedTransition1237); 

                    createLeafNode(grammarAccess.getBranchedTransitionAccess().getReturnsKeyword_1(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:577:1: (lv_value_2= ruleBooleanLiteral )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:580:6: lv_value_2= ruleBooleanLiteral
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBranchedTransitionAccess().getValueBooleanLiteralParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBranchedTransition1271);
            lv_value_2=ruleBooleanLiteral();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBranchedTransitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_2, "BooleanLiteral", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,20,FOLLOW_20_in_ruleBranchedTransition1284); 

                    createLeafNode(grammarAccess.getBranchedTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:602:1: ( RULE_ID )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:605:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBranchedTransitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBranchedTransition1306); 

            		createLeafNode(grammarAccess.getBranchedTransitionAccess().getStateStateCrossReference_4_0(), "state"); 
            	

            }

            match(input,12,FOLLOW_12_in_ruleBranchedTransition1318); 

                    createLeafNode(grammarAccess.getBranchedTransitionAccess().getSemicolonKeyword_5(), null); 
                

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
    // $ANTLR end ruleBranchedTransition


    // $ANTLR start entryRuleInvocation
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:629:1: entryRuleInvocation returns [EObject current=null] : iv_ruleInvocation= ruleInvocation EOF ;
    public final EObject entryRuleInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocation = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:629:52: (iv_ruleInvocation= ruleInvocation EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:630:2: iv_ruleInvocation= ruleInvocation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInvocationRule(), currentNode); 
            pushFollow(FOLLOW_ruleInvocation_in_entryRuleInvocation1351);
            iv_ruleInvocation=ruleInvocation();
            _fsp--;

             current =iv_ruleInvocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvocation1361); 

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
    // $ANTLR end entryRuleInvocation


    // $ANTLR start ruleInvocation
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:637:1: ruleInvocation returns [EObject current=null] : (this_Method_0= ruleMethod | this_Constructor_1= ruleConstructor ) ;
    public final EObject ruleInvocation() throws RecognitionException {
        EObject current = null;

        EObject this_Method_0 = null;

        EObject this_Constructor_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:642:6: ( (this_Method_0= ruleMethod | this_Constructor_1= ruleConstructor ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:643:1: (this_Method_0= ruleMethod | this_Constructor_1= ruleConstructor )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:643:1: (this_Method_0= ruleMethod | this_Constructor_1= ruleConstructor )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==22) ) {
                    alt7=2;
                }
                else if ( (LA7_1==RULE_ID||LA7_1==25) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("643:1: (this_Method_0= ruleMethod | this_Constructor_1= ruleConstructor )", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("643:1: (this_Method_0= ruleMethod | this_Constructor_1= ruleConstructor )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:644:5: this_Method_0= ruleMethod
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInvocationAccess().getMethodParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMethod_in_ruleInvocation1408);
                    this_Method_0=ruleMethod();
                    _fsp--;

                     
                            current = this_Method_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:654:5: this_Constructor_1= ruleConstructor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInvocationAccess().getConstructorParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConstructor_in_ruleInvocation1435);
                    this_Constructor_1=ruleConstructor();
                    _fsp--;

                     
                            current = this_Constructor_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

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
    // $ANTLR end ruleInvocation


    // $ANTLR start entryRuleMethod
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:669:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:669:48: (iv_ruleMethod= ruleMethod EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:670:2: iv_ruleMethod= ruleMethod EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMethodRule(), currentNode); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1467);
            iv_ruleMethod=ruleMethod();
            _fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1477); 

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
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:677:1: ruleMethod returns [EObject current=null] : ( (lv_returntype_0= ruleType ) (lv_name_1= RULE_ID ) '(' ( (lv_args_3= ruleType ) ( ',' (lv_args_5= ruleType ) )* )? ')' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_returntype_0 = null;

        EObject lv_args_3 = null;

        EObject lv_args_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:682:6: ( ( (lv_returntype_0= ruleType ) (lv_name_1= RULE_ID ) '(' ( (lv_args_3= ruleType ) ( ',' (lv_args_5= ruleType ) )* )? ')' ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:683:1: ( (lv_returntype_0= ruleType ) (lv_name_1= RULE_ID ) '(' ( (lv_args_3= ruleType ) ( ',' (lv_args_5= ruleType ) )* )? ')' )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:683:1: ( (lv_returntype_0= ruleType ) (lv_name_1= RULE_ID ) '(' ( (lv_args_3= ruleType ) ( ',' (lv_args_5= ruleType ) )* )? ')' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:683:2: (lv_returntype_0= ruleType ) (lv_name_1= RULE_ID ) '(' ( (lv_args_3= ruleType ) ( ',' (lv_args_5= ruleType ) )* )? ')'
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:683:2: (lv_returntype_0= ruleType )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:686:6: lv_returntype_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMethodAccess().getReturntypeTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleMethod1536);
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

            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:704:2: (lv_name_1= RULE_ID )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:706:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod1562); 

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

            match(input,22,FOLLOW_22_in_ruleMethod1579); 

                    createLeafNode(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:728:1: ( (lv_args_3= ruleType ) ( ',' (lv_args_5= ruleType ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:728:2: (lv_args_3= ruleType ) ( ',' (lv_args_5= ruleType ) )*
                    {
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:728:2: (lv_args_3= ruleType )
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:731:6: lv_args_3= ruleType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleMethod1614);
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

                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:749:2: ( ',' (lv_args_5= ruleType ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==23) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:749:3: ',' (lv_args_5= ruleType )
                    	    {
                    	    match(input,23,FOLLOW_23_in_ruleMethod1628); 

                    	            createLeafNode(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0(), null); 
                    	        
                    	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:753:1: (lv_args_5= ruleType )
                    	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:756:6: lv_args_5= ruleType
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleMethod1662);
                    	    lv_args_5=ruleType();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMethodRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "args", lv_args_5, "Type", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,24,FOLLOW_24_in_ruleMethod1679); 

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
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:785:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:785:53: (iv_ruleConstructor= ruleConstructor EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:786:2: iv_ruleConstructor= ruleConstructor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstructorRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor1712);
            iv_ruleConstructor=ruleConstructor();
            _fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor1722); 

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
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:793:1: ruleConstructor returns [EObject current=null] : ( ( RULE_ID ) '(' ( (lv_args_2= ruleType ) ( ',' (lv_args_4= ruleType ) )* )? ')' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        EObject lv_args_2 = null;

        EObject lv_args_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:798:6: ( ( ( RULE_ID ) '(' ( (lv_args_2= ruleType ) ( ',' (lv_args_4= ruleType ) )* )? ')' ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:799:1: ( ( RULE_ID ) '(' ( (lv_args_2= ruleType ) ( ',' (lv_args_4= ruleType ) )* )? ')' )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:799:1: ( ( RULE_ID ) '(' ( (lv_args_2= ruleType ) ( ',' (lv_args_4= ruleType ) )* )? ')' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:799:2: ( RULE_ID ) '(' ( (lv_args_2= ruleType ) ( ',' (lv_args_4= ruleType ) )* )? ')'
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:799:2: ( RULE_ID )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:802:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getConstructorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor1769); 

            		createLeafNode(grammarAccess.getConstructorAccess().getKlassClassCrossReference_0_0(), "klass"); 
            	

            }

            match(input,22,FOLLOW_22_in_ruleConstructor1781); 

                    createLeafNode(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:819:1: ( (lv_args_2= ruleType ) ( ',' (lv_args_4= ruleType ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:819:2: (lv_args_2= ruleType ) ( ',' (lv_args_4= ruleType ) )*
                    {
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:819:2: (lv_args_2= ruleType )
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:822:6: lv_args_2= ruleType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleConstructor1816);
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

                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:840:2: ( ',' (lv_args_4= ruleType ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==23) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:840:3: ',' (lv_args_4= ruleType )
                    	    {
                    	    match(input,23,FOLLOW_23_in_ruleConstructor1830); 

                    	            createLeafNode(grammarAccess.getConstructorAccess().getCommaKeyword_2_1_0(), null); 
                    	        
                    	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:844:1: (lv_args_4= ruleType )
                    	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:847:6: lv_args_4= ruleType
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleConstructor1864);
                    	    lv_args_4=ruleType();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getConstructorRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "args", lv_args_4, "Type", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,24,FOLLOW_24_in_ruleConstructor1881); 

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
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:876:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:876:46: (iv_ruleType= ruleType EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:877:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1914);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1924); 

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
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:884:1: ruleType returns [EObject current=null] : (lv_name_0= ruleJAVAID ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:889:6: ( (lv_name_0= ruleJAVAID ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:890:1: (lv_name_0= ruleJAVAID )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:890:1: (lv_name_0= ruleJAVAID )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:893:6: lv_name_0= ruleJAVAID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeAccess().getNameJAVAIDParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleJAVAID_in_ruleType1982);
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
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:918:1: entryRuleJAVAID returns [String current=null] : iv_ruleJAVAID= ruleJAVAID EOF ;
    public final String entryRuleJAVAID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJAVAID = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:918:47: (iv_ruleJAVAID= ruleJAVAID EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:919:2: iv_ruleJAVAID= ruleJAVAID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJAVAIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleJAVAID_in_entryRuleJAVAID2019);
            iv_ruleJAVAID=ruleJAVAID();
            _fsp--;

             current =iv_ruleJAVAID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJAVAID2030); 

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
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:926:1: ruleJAVAID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleJAVAID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:932:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:933:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:933:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:933:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJAVAID2070); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:940:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:941:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,25,FOLLOW_25_in_ruleJAVAID2089); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJAVAID2104); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
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


    // $ANTLR start entryRuleBooleanLiteral
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:961:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:961:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:962:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2150);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();
            _fsp--;

             current =iv_ruleBooleanLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2161); 

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
    // $ANTLR end entryRuleBooleanLiteral


    // $ANTLR start ruleBooleanLiteral
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:969:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_True_0= ruleTrue | this_False_1= ruleFalse ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_True_0 = null;

        AntlrDatatypeRuleToken this_False_1 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:975:6: ( (this_True_0= ruleTrue | this_False_1= ruleFalse ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:976:1: (this_True_0= ruleTrue | this_False_1= ruleFalse )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:976:1: (this_True_0= ruleTrue | this_False_1= ruleFalse )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("976:1: (this_True_0= ruleTrue | this_False_1= ruleFalse )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:977:5: this_True_0= ruleTrue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBooleanLiteralAccess().getTrueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTrue_in_ruleBooleanLiteral2208);
                    this_True_0=ruleTrue();
                    _fsp--;


                    		current.merge(this_True_0);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:989:5: this_False_1= ruleFalse
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBooleanLiteralAccess().getFalseParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFalse_in_ruleBooleanLiteral2241);
                    this_False_1=ruleFalse();
                    _fsp--;


                    		current.merge(this_False_1);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

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
    // $ANTLR end ruleBooleanLiteral


    // $ANTLR start entryRuleTrue
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1007:1: entryRuleTrue returns [String current=null] : iv_ruleTrue= ruleTrue EOF ;
    public final String entryRuleTrue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTrue = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1007:45: (iv_ruleTrue= ruleTrue EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1008:2: iv_ruleTrue= ruleTrue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrueRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrue_in_entryRuleTrue2285);
            iv_ruleTrue=ruleTrue();
            _fsp--;

             current =iv_ruleTrue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrue2296); 

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
    // $ANTLR end entryRuleTrue


    // $ANTLR start ruleTrue
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1015:1: ruleTrue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'true' ;
    public final AntlrDatatypeRuleToken ruleTrue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1021:6: (kw= 'true' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1023:2: kw= 'true'
            {
            kw=(Token)input.LT(1);
            match(input,26,FOLLOW_26_in_ruleTrue2333); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getTrueAccess().getTrueKeyword(), null); 
                

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
    // $ANTLR end ruleTrue


    // $ANTLR start entryRuleFalse
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1036:1: entryRuleFalse returns [String current=null] : iv_ruleFalse= ruleFalse EOF ;
    public final String entryRuleFalse() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFalse = null;


        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1036:46: (iv_ruleFalse= ruleFalse EOF )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1037:2: iv_ruleFalse= ruleFalse EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFalseRule(), currentNode); 
            pushFollow(FOLLOW_ruleFalse_in_entryRuleFalse2371);
            iv_ruleFalse=ruleFalse();
            _fsp--;

             current =iv_ruleFalse.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFalse2382); 

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
    // $ANTLR end entryRuleFalse


    // $ANTLR start ruleFalse
    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1044:1: ruleFalse returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'false' ;
    public final AntlrDatatypeRuleToken ruleFalse() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1050:6: (kw= 'false' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1052:2: kw= 'false'
            {
            kw=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_ruleFalse2419); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getFalseAccess().getFalseKeyword(), null); 
                

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
    // $ANTLR end ruleFalse


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\31\uffff";
    static final String DFA6_eofS =
        "\31\uffff";
    static final String DFA6_minS =
        "\4\4\1\26\1\27\1\24\4\4\2\uffff\1\27\1\24\2\27\3\4\3\27\1\4\1\27";
    static final String DFA6_maxS =
        "\1\4\1\31\1\30\1\4\1\26\1\31\1\25\1\31\1\30\2\4\2\uffff\1\31\1\25"+
        "\2\31\3\4\3\31\1\4\1\31";
    static final String DFA6_acceptS =
        "\13\uffff\1\1\1\2\14\uffff";
    static final String DFA6_specialS =
        "\31\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\4\21\uffff\1\2\2\uffff\1\3",
            "\1\5\23\uffff\1\6",
            "\1\7",
            "\1\10",
            "\1\12\1\6\1\11",
            "\1\13\1\14",
            "\1\4\24\uffff\1\3",
            "\1\15\23\uffff\1\16",
            "\1\17",
            "\1\20",
            "",
            "",
            "\1\22\1\16\1\21",
            "\1\13\1\14",
            "\1\12\1\6\1\11",
            "\1\12\1\6\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\22\1\16\1\21",
            "\1\22\1\16\1\27",
            "\1\12\1\6\1\23",
            "\1\30",
            "\1\22\1\16\1\27"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "446:1: (this_InvocationTransition_0= ruleInvocationTransition | this_BranchedTransition_1= ruleBranchedTransition )";
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
    public static final BitSet FOLLOW_12_in_ruleAutomaton486 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruleAutomaton496 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAutomaton505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAutomaton527 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAutomaton539 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleState_in_ruleAutomaton575 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleAutomaton589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_ruleClass690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleState770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState792 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState809 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState843 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleState857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocationTransition_in_ruleTransition947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranchedTransition_in_ruleTransition974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocationTransition_in_entryRuleInvocationTransition1006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvocationTransition1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocation_in_ruleInvocationTransition1075 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInvocationTransition1088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvocationTransition1110 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInvocationTransition1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranchedTransition_in_entryRuleBranchedTransition1155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranchedTransition1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocation_in_ruleBranchedTransition1224 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBranchedTransition1237 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBranchedTransition1271 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBranchedTransition1284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBranchedTransition1306 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBranchedTransition1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocation_in_entryRuleInvocation1351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvocation1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleInvocation1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleInvocation1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod1536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1562 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMethod1579 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod1614 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleMethod1628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod1662 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleMethod1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor1712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor1769 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleConstructor1781 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleConstructor1816 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleConstructor1830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleConstructor1864 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleConstructor1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_ruleType1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_entryRuleJAVAID2019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJAVAID2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJAVAID2070 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleJAVAID2089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJAVAID2104 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrue_in_ruleBooleanLiteral2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFalse_in_ruleBooleanLiteral2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrue_in_entryRuleTrue2285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrue2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTrue2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFalse_in_entryRuleFalse2371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFalse2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFalse2419 = new BitSet(new long[]{0x0000000000000002L});

}