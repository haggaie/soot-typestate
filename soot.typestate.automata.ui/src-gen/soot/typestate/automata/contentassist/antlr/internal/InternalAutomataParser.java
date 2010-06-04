package soot.typestate.automata.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import soot.typestate.automata.services.AutomataGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalAutomataParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'automaton'", "'{'", "'initial'", "'='", "'}'", "'error'", "'state'", "'->'", "'('", "')'", "','", "'.'"
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
    public String getGrammarFileName() { return "../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g"; }


     
     	private AutomataGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AutomataGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleAutomata
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:60:1: entryRuleAutomata : ruleAutomata EOF ;
    public final void entryRuleAutomata() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:60:19: ( ruleAutomata EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:61:1: ruleAutomata EOF
            {
             before(grammarAccess.getAutomataRule()); 
            pushFollow(FOLLOW_ruleAutomata_in_entryRuleAutomata60);
            ruleAutomata();
            _fsp--;

             after(grammarAccess.getAutomataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutomata67); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAutomata


    // $ANTLR start ruleAutomata
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:68:1: ruleAutomata : ( ( rule__Automata__Group__0 ) ) ;
    public final void ruleAutomata() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:72:2: ( ( ( rule__Automata__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:73:1: ( ( rule__Automata__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:73:1: ( ( rule__Automata__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:74:1: ( rule__Automata__Group__0 )
            {
             before(grammarAccess.getAutomataAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:75:1: ( rule__Automata__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:75:2: rule__Automata__Group__0
            {
            pushFollow(FOLLOW_rule__Automata__Group__0_in_ruleAutomata94);
            rule__Automata__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAutomataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAutomata


    // $ANTLR start entryRulePackage
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:87:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:87:18: ( rulePackage EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:88:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage120);
            rulePackage();
            _fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage127); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePackage


    // $ANTLR start rulePackage
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:95:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:99:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:100:1: ( ( rule__Package__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:100:1: ( ( rule__Package__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:101:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:102:1: ( rule__Package__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:102:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage154);
            rule__Package__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePackage


    // $ANTLR start entryRuleAutomaton
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:114:1: entryRuleAutomaton : ruleAutomaton EOF ;
    public final void entryRuleAutomaton() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:114:20: ( ruleAutomaton EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:115:1: ruleAutomaton EOF
            {
             before(grammarAccess.getAutomatonRule()); 
            pushFollow(FOLLOW_ruleAutomaton_in_entryRuleAutomaton180);
            ruleAutomaton();
            _fsp--;

             after(grammarAccess.getAutomatonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutomaton187); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAutomaton


    // $ANTLR start ruleAutomaton
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:122:1: ruleAutomaton : ( ( rule__Automaton__Group__0 ) ) ;
    public final void ruleAutomaton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:126:2: ( ( ( rule__Automaton__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:127:1: ( ( rule__Automaton__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:127:1: ( ( rule__Automaton__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:128:1: ( rule__Automaton__Group__0 )
            {
             before(grammarAccess.getAutomatonAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:129:1: ( rule__Automaton__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:129:2: rule__Automaton__Group__0
            {
            pushFollow(FOLLOW_rule__Automaton__Group__0_in_ruleAutomaton214);
            rule__Automaton__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAutomaton


    // $ANTLR start entryRuleClass
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:141:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:141:16: ( ruleClass EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:142:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass240);
            ruleClass();
            _fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleClass


    // $ANTLR start ruleClass
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:149:1: ruleClass : ( ( rule__Class__NameAssignment ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:153:2: ( ( ( rule__Class__NameAssignment ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:154:1: ( ( rule__Class__NameAssignment ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:154:1: ( ( rule__Class__NameAssignment ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:155:1: ( rule__Class__NameAssignment )
            {
             before(grammarAccess.getClassAccess().getNameAssignment()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:156:1: ( rule__Class__NameAssignment )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:156:2: rule__Class__NameAssignment
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_in_ruleClass274);
            rule__Class__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleClass


    // $ANTLR start entryRuleState
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:168:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:168:16: ( ruleState EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:169:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState300);
            ruleState();
            _fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState307); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:176:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:180:2: ( ( ( rule__State__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:181:1: ( ( rule__State__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:181:1: ( ( rule__State__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:182:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:183:1: ( rule__State__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:183:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState334);
            rule__State__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleState


    // $ANTLR start entryRuleTransition
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:195:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:195:21: ( ruleTransition EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:196:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition360);
            ruleTransition();
            _fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTransition


    // $ANTLR start ruleTransition
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:203:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:207:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:208:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:208:1: ( ( rule__Transition__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:209:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:210:1: ( rule__Transition__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:210:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition394);
            rule__Transition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTransition


    // $ANTLR start entryRuleMethod
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:222:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:222:17: ( ruleMethod EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:223:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod420);
            ruleMethod();
            _fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod427); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMethod


    // $ANTLR start ruleMethod
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:230:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:234:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:235:1: ( ( rule__Method__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:235:1: ( ( rule__Method__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:236:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:237:1: ( rule__Method__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:237:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod454);
            rule__Method__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMethod


    // $ANTLR start entryRuleConstructor
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:249:1: entryRuleConstructor : ruleConstructor EOF ;
    public final void entryRuleConstructor() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:249:22: ( ruleConstructor EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:250:1: ruleConstructor EOF
            {
             before(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor480);
            ruleConstructor();
            _fsp--;

             after(grammarAccess.getConstructorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleConstructor


    // $ANTLR start ruleConstructor
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:257:1: ruleConstructor : ( ( rule__Constructor__Group__0 ) ) ;
    public final void ruleConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:261:2: ( ( ( rule__Constructor__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:262:1: ( ( rule__Constructor__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:262:1: ( ( rule__Constructor__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:263:1: ( rule__Constructor__Group__0 )
            {
             before(grammarAccess.getConstructorAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:264:1: ( rule__Constructor__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:264:2: rule__Constructor__Group__0
            {
            pushFollow(FOLLOW_rule__Constructor__Group__0_in_ruleConstructor514);
            rule__Constructor__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConstructorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConstructor


    // $ANTLR start entryRuleType
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:276:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:276:15: ( ruleType EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:277:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType540);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:284:1: ruleType : ( ( rule__Type__NameAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:288:2: ( ( ( rule__Type__NameAssignment ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:289:1: ( ( rule__Type__NameAssignment ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:289:1: ( ( rule__Type__NameAssignment ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:290:1: ( rule__Type__NameAssignment )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:291:1: ( rule__Type__NameAssignment )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:291:2: rule__Type__NameAssignment
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_in_ruleType574);
            rule__Type__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleJAVAID
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:303:1: entryRuleJAVAID : ruleJAVAID EOF ;
    public final void entryRuleJAVAID() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:303:17: ( ruleJAVAID EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:304:1: ruleJAVAID EOF
            {
             before(grammarAccess.getJAVAIDRule()); 
            pushFollow(FOLLOW_ruleJAVAID_in_entryRuleJAVAID600);
            ruleJAVAID();
            _fsp--;

             after(grammarAccess.getJAVAIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJAVAID607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleJAVAID


    // $ANTLR start ruleJAVAID
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:311:1: ruleJAVAID : ( ( rule__JAVAID__Group__0 ) ) ;
    public final void ruleJAVAID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:315:2: ( ( ( rule__JAVAID__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:316:1: ( ( rule__JAVAID__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:316:1: ( ( rule__JAVAID__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:317:1: ( rule__JAVAID__Group__0 )
            {
             before(grammarAccess.getJAVAIDAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:318:1: ( rule__JAVAID__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:318:2: rule__JAVAID__Group__0
            {
            pushFollow(FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID634);
            rule__JAVAID__Group__0();
            _fsp--;


            }

             after(grammarAccess.getJAVAIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleJAVAID


    // $ANTLR start rule__Transition__Alternatives_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:330:1: rule__Transition__Alternatives_0 : ( ( ( rule__Transition__MethodAssignment_0_0 ) ) | ( ruleConstructor ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:334:1: ( ( ( rule__Transition__MethodAssignment_0_0 ) ) | ( ruleConstructor ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:335:1: ( ( rule__Transition__MethodAssignment_0_0 ) )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:335:1: ( ( rule__Transition__MethodAssignment_0_0 ) )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:336:1: ( rule__Transition__MethodAssignment_0_0 )
                    {
                     before(grammarAccess.getTransitionAccess().getMethodAssignment_0_0()); 
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:337:1: ( rule__Transition__MethodAssignment_0_0 )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:337:2: rule__Transition__MethodAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Transition__MethodAssignment_0_0_in_rule__Transition__Alternatives_0670);
                    rule__Transition__MethodAssignment_0_0();
                    _fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getMethodAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:341:6: ( ruleConstructor )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:341:6: ( ruleConstructor )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:342:1: ruleConstructor
                    {
                     before(grammarAccess.getTransitionAccess().getConstructorParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleConstructor_in_rule__Transition__Alternatives_0688);
                    ruleConstructor();
                    _fsp--;

                     after(grammarAccess.getTransitionAccess().getConstructorParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Alternatives_0


    // $ANTLR start rule__Automata__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:354:1: rule__Automata__Group__0 : ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1 ;
    public final void rule__Automata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:358:1: ( ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:359:1: ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:359:1: ( ( rule__Automata__PackageAssignment_0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:360:1: ( rule__Automata__PackageAssignment_0 )?
            {
             before(grammarAccess.getAutomataAccess().getPackageAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:361:1: ( rule__Automata__PackageAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:361:2: rule__Automata__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Automata__PackageAssignment_0_in_rule__Automata__Group__0722);
                    rule__Automata__PackageAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomataAccess().getPackageAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Automata__Group__1_in_rule__Automata__Group__0732);
            rule__Automata__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automata__Group__0


    // $ANTLR start rule__Automata__Group__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:372:1: rule__Automata__Group__1 : ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) ) ;
    public final void rule__Automata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:376:1: ( ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:377:1: ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:377:1: ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:378:1: ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:378:1: ( ( rule__Automata__AutomataAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:379:1: ( rule__Automata__AutomataAssignment_1 )
            {
             before(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:380:1: ( rule__Automata__AutomataAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:380:2: rule__Automata__AutomataAssignment_1
            {
            pushFollow(FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__1762);
            rule__Automata__AutomataAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 

            }

            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:383:1: ( ( rule__Automata__AutomataAssignment_1 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:384:1: ( rule__Automata__AutomataAssignment_1 )*
            {
             before(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:385:1: ( rule__Automata__AutomataAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:385:2: rule__Automata__AutomataAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__1774);
            	    rule__Automata__AutomataAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automata__Group__1


    // $ANTLR start rule__Package__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:400:1: rule__Package__Group__0 : ( 'package' ) rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:404:1: ( ( 'package' ) rule__Package__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:405:1: ( 'package' ) rule__Package__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:405:1: ( 'package' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:406:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Package__Group__0816); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0826);
            rule__Package__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package__Group__0


    // $ANTLR start rule__Package__Group__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:420:1: rule__Package__Group__1 : ( ( rule__Package__NameAssignment_1 ) ) rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:424:1: ( ( ( rule__Package__NameAssignment_1 ) ) rule__Package__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:425:1: ( ( rule__Package__NameAssignment_1 ) ) rule__Package__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:425:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:426:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:427:1: ( rule__Package__NameAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:427:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1854);
            rule__Package__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1863);
            rule__Package__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package__Group__1


    // $ANTLR start rule__Package__Group__2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:438:1: rule__Package__Group__2 : ( ';' ) ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:442:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:443:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:443:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:444:1: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Package__Group__2892); 
             after(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package__Group__2


    // $ANTLR start rule__Automaton__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:463:1: rule__Automaton__Group__0 : ( 'automaton' ) rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:467:1: ( ( 'automaton' ) rule__Automaton__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:468:1: ( 'automaton' ) rule__Automaton__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:468:1: ( 'automaton' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:469:1: 'automaton'
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Automaton__Group__0934); 
             after(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__1_in_rule__Automaton__Group__0944);
            rule__Automaton__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group__0


    // $ANTLR start rule__Automaton__Group__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:483:1: rule__Automaton__Group__1 : ( ( rule__Automaton__KlassAssignment_1 ) ) rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:487:1: ( ( ( rule__Automaton__KlassAssignment_1 ) ) rule__Automaton__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:488:1: ( ( rule__Automaton__KlassAssignment_1 ) ) rule__Automaton__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:488:1: ( ( rule__Automaton__KlassAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:489:1: ( rule__Automaton__KlassAssignment_1 )
            {
             before(grammarAccess.getAutomatonAccess().getKlassAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:490:1: ( rule__Automaton__KlassAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:490:2: rule__Automaton__KlassAssignment_1
            {
            pushFollow(FOLLOW_rule__Automaton__KlassAssignment_1_in_rule__Automaton__Group__1972);
            rule__Automaton__KlassAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getKlassAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__2_in_rule__Automaton__Group__1981);
            rule__Automaton__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group__1


    // $ANTLR start rule__Automaton__Group__2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:501:1: rule__Automaton__Group__2 : ( '{' ) rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:505:1: ( ( '{' ) rule__Automaton__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:506:1: ( '{' ) rule__Automaton__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:506:1: ( '{' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:507:1: '{'
            {
             before(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Automaton__Group__21010); 
             after(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__3_in_rule__Automaton__Group__21020);
            rule__Automaton__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group__2


    // $ANTLR start rule__Automaton__Group__3
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:521:1: rule__Automaton__Group__3 : ( 'initial' ) rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:525:1: ( ( 'initial' ) rule__Automaton__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:526:1: ( 'initial' ) rule__Automaton__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:526:1: ( 'initial' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:527:1: 'initial'
            {
             before(grammarAccess.getAutomatonAccess().getInitialKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Automaton__Group__31049); 
             after(grammarAccess.getAutomatonAccess().getInitialKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__4_in_rule__Automaton__Group__31059);
            rule__Automaton__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group__3


    // $ANTLR start rule__Automaton__Group__4
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:541:1: rule__Automaton__Group__4 : ( '=' ) rule__Automaton__Group__5 ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:545:1: ( ( '=' ) rule__Automaton__Group__5 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:546:1: ( '=' ) rule__Automaton__Group__5
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:546:1: ( '=' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:547:1: '='
            {
             before(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Automaton__Group__41088); 
             after(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__5_in_rule__Automaton__Group__41098);
            rule__Automaton__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group__4


    // $ANTLR start rule__Automaton__Group__5
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:561:1: rule__Automaton__Group__5 : ( ( rule__Automaton__InitialStateAssignment_5 ) ) rule__Automaton__Group__6 ;
    public final void rule__Automaton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:565:1: ( ( ( rule__Automaton__InitialStateAssignment_5 ) ) rule__Automaton__Group__6 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:566:1: ( ( rule__Automaton__InitialStateAssignment_5 ) ) rule__Automaton__Group__6
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:566:1: ( ( rule__Automaton__InitialStateAssignment_5 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:567:1: ( rule__Automaton__InitialStateAssignment_5 )
            {
             before(grammarAccess.getAutomatonAccess().getInitialStateAssignment_5()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:568:1: ( rule__Automaton__InitialStateAssignment_5 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:568:2: rule__Automaton__InitialStateAssignment_5
            {
            pushFollow(FOLLOW_rule__Automaton__InitialStateAssignment_5_in_rule__Automaton__Group__51126);
            rule__Automaton__InitialStateAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getInitialStateAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__6_in_rule__Automaton__Group__51135);
            rule__Automaton__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group__5


    // $ANTLR start rule__Automaton__Group__6
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:579:1: rule__Automaton__Group__6 : ( ';' ) rule__Automaton__Group__7 ;
    public final void rule__Automaton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:583:1: ( ( ';' ) rule__Automaton__Group__7 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:584:1: ( ';' ) rule__Automaton__Group__7
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:584:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:585:1: ';'
            {
             before(grammarAccess.getAutomatonAccess().getSemicolonKeyword_6()); 
            match(input,12,FOLLOW_12_in_rule__Automaton__Group__61164); 
             after(grammarAccess.getAutomatonAccess().getSemicolonKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__7_in_rule__Automaton__Group__61174);
            rule__Automaton__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group__6


    // $ANTLR start rule__Automaton__Group__7
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:599:1: rule__Automaton__Group__7 : ( ( rule__Automaton__Group_7__0 )? ) rule__Automaton__Group__8 ;
    public final void rule__Automaton__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:603:1: ( ( ( rule__Automaton__Group_7__0 )? ) rule__Automaton__Group__8 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:604:1: ( ( rule__Automaton__Group_7__0 )? ) rule__Automaton__Group__8
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:604:1: ( ( rule__Automaton__Group_7__0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:605:1: ( rule__Automaton__Group_7__0 )?
            {
             before(grammarAccess.getAutomatonAccess().getGroup_7()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:606:1: ( rule__Automaton__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:606:2: rule__Automaton__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Automaton__Group_7__0_in_rule__Automaton__Group__71202);
                    rule__Automaton__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatonAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__8_in_rule__Automaton__Group__71212);
            rule__Automaton__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group__7


    // $ANTLR start rule__Automaton__Group__8
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:617:1: rule__Automaton__Group__8 : ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) ) rule__Automaton__Group__9 ;
    public final void rule__Automaton__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:621:1: ( ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) ) rule__Automaton__Group__9 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:622:1: ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) ) rule__Automaton__Group__9
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:622:1: ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:623:1: ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:623:1: ( ( rule__Automaton__StatesAssignment_8 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:624:1: ( rule__Automaton__StatesAssignment_8 )
            {
             before(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:625:1: ( rule__Automaton__StatesAssignment_8 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:625:2: rule__Automaton__StatesAssignment_8
            {
            pushFollow(FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81242);
            rule__Automaton__StatesAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 

            }

            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:628:1: ( ( rule__Automaton__StatesAssignment_8 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:629:1: ( rule__Automaton__StatesAssignment_8 )*
            {
             before(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:630:1: ( rule__Automaton__StatesAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:630:2: rule__Automaton__StatesAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81254);
            	    rule__Automaton__StatesAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 

            }


            }

            pushFollow(FOLLOW_rule__Automaton__Group__9_in_rule__Automaton__Group__81266);
            rule__Automaton__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group__8


    // $ANTLR start rule__Automaton__Group__9
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:642:1: rule__Automaton__Group__9 : ( '}' ) ;
    public final void rule__Automaton__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:646:1: ( ( '}' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:647:1: ( '}' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:647:1: ( '}' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:648:1: '}'
            {
             before(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_17_in_rule__Automaton__Group__91295); 
             after(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group__9


    // $ANTLR start rule__Automaton__Group_7__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:681:1: rule__Automaton__Group_7__0 : ( 'error' ) rule__Automaton__Group_7__1 ;
    public final void rule__Automaton__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:685:1: ( ( 'error' ) rule__Automaton__Group_7__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:686:1: ( 'error' ) rule__Automaton__Group_7__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:686:1: ( 'error' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:687:1: 'error'
            {
             before(grammarAccess.getAutomatonAccess().getErrorKeyword_7_0()); 
            match(input,18,FOLLOW_18_in_rule__Automaton__Group_7__01351); 
             after(grammarAccess.getAutomatonAccess().getErrorKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group_7__1_in_rule__Automaton__Group_7__01361);
            rule__Automaton__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group_7__0


    // $ANTLR start rule__Automaton__Group_7__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:701:1: rule__Automaton__Group_7__1 : ( '=' ) rule__Automaton__Group_7__2 ;
    public final void rule__Automaton__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:705:1: ( ( '=' ) rule__Automaton__Group_7__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:706:1: ( '=' ) rule__Automaton__Group_7__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:706:1: ( '=' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:707:1: '='
            {
             before(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_7_1()); 
            match(input,16,FOLLOW_16_in_rule__Automaton__Group_7__11390); 
             after(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group_7__2_in_rule__Automaton__Group_7__11400);
            rule__Automaton__Group_7__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group_7__1


    // $ANTLR start rule__Automaton__Group_7__2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:721:1: rule__Automaton__Group_7__2 : ( ( rule__Automaton__ErrorStateAssignment_7_2 ) ) rule__Automaton__Group_7__3 ;
    public final void rule__Automaton__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:725:1: ( ( ( rule__Automaton__ErrorStateAssignment_7_2 ) ) rule__Automaton__Group_7__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:726:1: ( ( rule__Automaton__ErrorStateAssignment_7_2 ) ) rule__Automaton__Group_7__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:726:1: ( ( rule__Automaton__ErrorStateAssignment_7_2 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:727:1: ( rule__Automaton__ErrorStateAssignment_7_2 )
            {
             before(grammarAccess.getAutomatonAccess().getErrorStateAssignment_7_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:728:1: ( rule__Automaton__ErrorStateAssignment_7_2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:728:2: rule__Automaton__ErrorStateAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Automaton__ErrorStateAssignment_7_2_in_rule__Automaton__Group_7__21428);
            rule__Automaton__ErrorStateAssignment_7_2();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getErrorStateAssignment_7_2()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group_7__3_in_rule__Automaton__Group_7__21437);
            rule__Automaton__Group_7__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group_7__2


    // $ANTLR start rule__Automaton__Group_7__3
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:739:1: rule__Automaton__Group_7__3 : ( ';' ) ;
    public final void rule__Automaton__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:743:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:744:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:744:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:745:1: ';'
            {
             before(grammarAccess.getAutomatonAccess().getSemicolonKeyword_7_3()); 
            match(input,12,FOLLOW_12_in_rule__Automaton__Group_7__31466); 
             after(grammarAccess.getAutomatonAccess().getSemicolonKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__Group_7__3


    // $ANTLR start rule__State__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:766:1: rule__State__Group__0 : ( ( rule__State__InitialAssignment_0 )? ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:770:1: ( ( ( rule__State__InitialAssignment_0 )? ) rule__State__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:771:1: ( ( rule__State__InitialAssignment_0 )? ) rule__State__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:771:1: ( ( rule__State__InitialAssignment_0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:772:1: ( rule__State__InitialAssignment_0 )?
            {
             before(grammarAccess.getStateAccess().getInitialAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:773:1: ( rule__State__InitialAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:773:2: rule__State__InitialAssignment_0
                    {
                    pushFollow(FOLLOW_rule__State__InitialAssignment_0_in_rule__State__Group__01509);
                    rule__State__InitialAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getInitialAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__01519);
            rule__State__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__0


    // $ANTLR start rule__State__Group__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:784:1: rule__State__Group__1 : ( 'state' ) rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:788:1: ( ( 'state' ) rule__State__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:789:1: ( 'state' ) rule__State__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:789:1: ( 'state' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:790:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__State__Group__11548); 
             after(grammarAccess.getStateAccess().getStateKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__11558);
            rule__State__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__1


    // $ANTLR start rule__State__Group__2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:804:1: rule__State__Group__2 : ( ( rule__State__NameAssignment_2 ) ) rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:808:1: ( ( ( rule__State__NameAssignment_2 ) ) rule__State__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:809:1: ( ( rule__State__NameAssignment_2 ) ) rule__State__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:809:1: ( ( rule__State__NameAssignment_2 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:810:1: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:811:1: ( rule__State__NameAssignment_2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:811:2: rule__State__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__21586);
            rule__State__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__21595);
            rule__State__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__2


    // $ANTLR start rule__State__Group__3
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:822:1: rule__State__Group__3 : ( '{' ) rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:826:1: ( ( '{' ) rule__State__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:827:1: ( '{' ) rule__State__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:827:1: ( '{' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:828:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__State__Group__31624); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__31634);
            rule__State__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__3


    // $ANTLR start rule__State__Group__4
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:842:1: rule__State__Group__4 : ( ( rule__State__TransitionsAssignment_4 )* ) rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:846:1: ( ( ( rule__State__TransitionsAssignment_4 )* ) rule__State__Group__5 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:847:1: ( ( rule__State__TransitionsAssignment_4 )* ) rule__State__Group__5
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:847:1: ( ( rule__State__TransitionsAssignment_4 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:848:1: ( rule__State__TransitionsAssignment_4 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_4()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:849:1: ( rule__State__TransitionsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:849:2: rule__State__TransitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__State__TransitionsAssignment_4_in_rule__State__Group__41662);
            	    rule__State__TransitionsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__41672);
            rule__State__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__4


    // $ANTLR start rule__State__Group__5
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:860:1: rule__State__Group__5 : ( '}' ) ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:864:1: ( ( '}' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:865:1: ( '}' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:865:1: ( '}' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:866:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__State__Group__51701); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__5


    // $ANTLR start rule__Transition__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:891:1: rule__Transition__Group__0 : ( ( rule__Transition__Alternatives_0 ) ) rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:895:1: ( ( ( rule__Transition__Alternatives_0 ) ) rule__Transition__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:896:1: ( ( rule__Transition__Alternatives_0 ) ) rule__Transition__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:896:1: ( ( rule__Transition__Alternatives_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:897:1: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:898:1: ( rule__Transition__Alternatives_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:898:2: rule__Transition__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Transition__Alternatives_0_in_rule__Transition__Group__01748);
            rule__Transition__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01757);
            rule__Transition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__0


    // $ANTLR start rule__Transition__Group__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:909:1: rule__Transition__Group__1 : ( '->' ) rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:913:1: ( ( '->' ) rule__Transition__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:914:1: ( '->' ) rule__Transition__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:914:1: ( '->' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:915:1: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Transition__Group__11786); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11796);
            rule__Transition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__1


    // $ANTLR start rule__Transition__Group__2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:929:1: rule__Transition__Group__2 : ( ( rule__Transition__StateAssignment_2 ) ) rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:933:1: ( ( ( rule__Transition__StateAssignment_2 ) ) rule__Transition__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:934:1: ( ( rule__Transition__StateAssignment_2 ) ) rule__Transition__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:934:1: ( ( rule__Transition__StateAssignment_2 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:935:1: ( rule__Transition__StateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:936:1: ( rule__Transition__StateAssignment_2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:936:2: rule__Transition__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__21824);
            rule__Transition__StateAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getStateAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21833);
            rule__Transition__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__2


    // $ANTLR start rule__Transition__Group__3
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:947:1: rule__Transition__Group__3 : ( ';' ) ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:951:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:952:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:952:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:953:1: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Transition__Group__31862); 
             after(grammarAccess.getTransitionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__3


    // $ANTLR start rule__Method__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:974:1: rule__Method__Group__0 : ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:978:1: ( ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:979:1: ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:979:1: ( ( rule__Method__ReturntypeAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:980:1: ( rule__Method__ReturntypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getReturntypeAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:981:1: ( rule__Method__ReturntypeAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:981:2: rule__Method__ReturntypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Method__ReturntypeAssignment_0_in_rule__Method__Group__01905);
            rule__Method__ReturntypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturntypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__01914);
            rule__Method__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Method__Group__0


    // $ANTLR start rule__Method__Group__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:992:1: rule__Method__Group__1 : ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:996:1: ( ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:997:1: ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:997:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:998:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:999:1: ( rule__Method__NameAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:999:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__11942);
            rule__Method__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__11951);
            rule__Method__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Method__Group__1


    // $ANTLR start rule__Method__Group__2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1010:1: rule__Method__Group__2 : ( '(' ) rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1014:1: ( ( '(' ) rule__Method__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1015:1: ( '(' ) rule__Method__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1015:1: ( '(' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1016:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Method__Group__21980); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__21990);
            rule__Method__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Method__Group__2


    // $ANTLR start rule__Method__Group__3
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1030:1: rule__Method__Group__3 : ( ( rule__Method__Group_3__0 )? ) rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1034:1: ( ( ( rule__Method__Group_3__0 )? ) rule__Method__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1035:1: ( ( rule__Method__Group_3__0 )? ) rule__Method__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1035:1: ( ( rule__Method__Group_3__0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1036:1: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1037:1: ( rule__Method__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1037:2: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__32018);
                    rule__Method__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32028);
            rule__Method__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Method__Group__3


    // $ANTLR start rule__Method__Group__4
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1048:1: rule__Method__Group__4 : ( ')' ) ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1052:1: ( ( ')' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1053:1: ( ')' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1053:1: ( ')' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1054:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__Method__Group__42057); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Method__Group__4


    // $ANTLR start rule__Method__Group_3__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1077:1: rule__Method__Group_3__0 : ( ( rule__Method__ArgsAssignment_3_0 ) ) rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1081:1: ( ( ( rule__Method__ArgsAssignment_3_0 ) ) rule__Method__Group_3__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1082:1: ( ( rule__Method__ArgsAssignment_3_0 ) ) rule__Method__Group_3__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1082:1: ( ( rule__Method__ArgsAssignment_3_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1083:1: ( rule__Method__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1084:1: ( rule__Method__ArgsAssignment_3_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1084:2: rule__Method__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Method__ArgsAssignment_3_0_in_rule__Method__Group_3__02102);
            rule__Method__ArgsAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getArgsAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__02111);
            rule__Method__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Method__Group_3__0


    // $ANTLR start rule__Method__Group_3__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1095:1: rule__Method__Group_3__1 : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1099:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1100:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1100:1: ( ( rule__Method__Group_3_1__0 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1101:1: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1102:1: ( rule__Method__Group_3_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1102:2: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__12139);
            	    rule__Method__Group_3_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Method__Group_3__1


    // $ANTLR start rule__Method__Group_3_1__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1116:1: rule__Method__Group_3_1__0 : ( ',' ) rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1120:1: ( ( ',' ) rule__Method__Group_3_1__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1121:1: ( ',' ) rule__Method__Group_3_1__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1121:1: ( ',' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1122:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Method__Group_3_1__02179); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__02189);
            rule__Method__Group_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Method__Group_3_1__0


    // $ANTLR start rule__Method__Group_3_1__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1136:1: rule__Method__Group_3_1__1 : ( ( rule__Method__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1140:1: ( ( ( rule__Method__ArgsAssignment_3_1_1 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1141:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1141:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1142:1: ( rule__Method__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_1_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1143:1: ( rule__Method__ArgsAssignment_3_1_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1143:2: rule__Method__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Method__ArgsAssignment_3_1_1_in_rule__Method__Group_3_1__12217);
            rule__Method__ArgsAssignment_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Method__Group_3_1__1


    // $ANTLR start rule__Constructor__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1157:1: rule__Constructor__Group__0 : ( ruleClass ) rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1161:1: ( ( ruleClass ) rule__Constructor__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1162:1: ( ruleClass ) rule__Constructor__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1162:1: ( ruleClass )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1163:1: ruleClass
            {
             before(grammarAccess.getConstructorAccess().getClassParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__Constructor__Group__02255);
            ruleClass();
            _fsp--;

             after(grammarAccess.getConstructorAccess().getClassParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02263);
            rule__Constructor__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constructor__Group__0


    // $ANTLR start rule__Constructor__Group__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1175:1: rule__Constructor__Group__1 : ( '(' ) rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1179:1: ( ( '(' ) rule__Constructor__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1180:1: ( '(' ) rule__Constructor__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1180:1: ( '(' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1181:1: '('
            {
             before(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Constructor__Group__12292); 
             after(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12302);
            rule__Constructor__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constructor__Group__1


    // $ANTLR start rule__Constructor__Group__2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1195:1: rule__Constructor__Group__2 : ( ( rule__Constructor__ArgsAssignment_2 )* ) rule__Constructor__Group__3 ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1199:1: ( ( ( rule__Constructor__ArgsAssignment_2 )* ) rule__Constructor__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1200:1: ( ( rule__Constructor__ArgsAssignment_2 )* ) rule__Constructor__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1200:1: ( ( rule__Constructor__ArgsAssignment_2 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1201:1: ( rule__Constructor__ArgsAssignment_2 )*
            {
             before(grammarAccess.getConstructorAccess().getArgsAssignment_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1202:1: ( rule__Constructor__ArgsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1202:2: rule__Constructor__ArgsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Constructor__ArgsAssignment_2_in_rule__Constructor__Group__22330);
            	    rule__Constructor__ArgsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getConstructorAccess().getArgsAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22340);
            rule__Constructor__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constructor__Group__2


    // $ANTLR start rule__Constructor__Group__3
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1213:1: rule__Constructor__Group__3 : ( ')' ) ;
    public final void rule__Constructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1217:1: ( ( ')' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1218:1: ( ')' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1218:1: ( ')' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1219:1: ')'
            {
             before(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Constructor__Group__32369); 
             after(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constructor__Group__3


    // $ANTLR start rule__JAVAID__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1240:1: rule__JAVAID__Group__0 : ( RULE_ID ) rule__JAVAID__Group__1 ;
    public final void rule__JAVAID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1244:1: ( ( RULE_ID ) rule__JAVAID__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1245:1: ( RULE_ID ) rule__JAVAID__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1245:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1246:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group__02412); 
             after(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__02420);
            rule__JAVAID__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__Group__0


    // $ANTLR start rule__JAVAID__Group__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1258:1: rule__JAVAID__Group__1 : ( ( rule__JAVAID__Group_1__0 )* ) ;
    public final void rule__JAVAID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1262:1: ( ( ( rule__JAVAID__Group_1__0 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1263:1: ( ( rule__JAVAID__Group_1__0 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1263:1: ( ( rule__JAVAID__Group_1__0 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1264:1: ( rule__JAVAID__Group_1__0 )*
            {
             before(grammarAccess.getJAVAIDAccess().getGroup_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1265:1: ( rule__JAVAID__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1265:2: rule__JAVAID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__12448);
            	    rule__JAVAID__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getJAVAIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__Group__1


    // $ANTLR start rule__JAVAID__Group_1__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1279:1: rule__JAVAID__Group_1__0 : ( '.' ) rule__JAVAID__Group_1__1 ;
    public final void rule__JAVAID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1283:1: ( ( '.' ) rule__JAVAID__Group_1__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1284:1: ( '.' ) rule__JAVAID__Group_1__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1284:1: ( '.' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1285:1: '.'
            {
             before(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__JAVAID__Group_1__02488); 
             after(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__02498);
            rule__JAVAID__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__Group_1__0


    // $ANTLR start rule__JAVAID__Group_1__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1299:1: rule__JAVAID__Group_1__1 : ( RULE_ID ) ;
    public final void rule__JAVAID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1303:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1304:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1304:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1305:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__12526); 
             after(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__Group_1__1


    // $ANTLR start rule__Automata__PackageAssignment_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1320:1: rule__Automata__PackageAssignment_0 : ( rulePackage ) ;
    public final void rule__Automata__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1324:1: ( ( rulePackage ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1325:1: ( rulePackage )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1325:1: ( rulePackage )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1326:1: rulePackage
            {
             before(grammarAccess.getAutomataAccess().getPackagePackageParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Automata__PackageAssignment_02563);
            rulePackage();
            _fsp--;

             after(grammarAccess.getAutomataAccess().getPackagePackageParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automata__PackageAssignment_0


    // $ANTLR start rule__Automata__AutomataAssignment_1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1335:1: rule__Automata__AutomataAssignment_1 : ( ruleAutomaton ) ;
    public final void rule__Automata__AutomataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1339:1: ( ( ruleAutomaton ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1340:1: ( ruleAutomaton )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1340:1: ( ruleAutomaton )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1341:1: ruleAutomaton
            {
             before(grammarAccess.getAutomataAccess().getAutomataAutomatonParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAutomaton_in_rule__Automata__AutomataAssignment_12594);
            ruleAutomaton();
            _fsp--;

             after(grammarAccess.getAutomataAccess().getAutomataAutomatonParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automata__AutomataAssignment_1


    // $ANTLR start rule__Package__NameAssignment_1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1350:1: rule__Package__NameAssignment_1 : ( ruleJAVAID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1354:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1355:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1355:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1356:1: ruleJAVAID
            {
             before(grammarAccess.getPackageAccess().getNameJAVAIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Package__NameAssignment_12625);
            ruleJAVAID();
            _fsp--;

             after(grammarAccess.getPackageAccess().getNameJAVAIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package__NameAssignment_1


    // $ANTLR start rule__Automaton__KlassAssignment_1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1365:1: rule__Automaton__KlassAssignment_1 : ( ruleClass ) ;
    public final void rule__Automaton__KlassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1369:1: ( ( ruleClass ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1370:1: ( ruleClass )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1370:1: ( ruleClass )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1371:1: ruleClass
            {
             before(grammarAccess.getAutomatonAccess().getKlassClassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__Automaton__KlassAssignment_12656);
            ruleClass();
            _fsp--;

             after(grammarAccess.getAutomatonAccess().getKlassClassParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__KlassAssignment_1


    // $ANTLR start rule__Automaton__InitialStateAssignment_5
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1380:1: rule__Automaton__InitialStateAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Automaton__InitialStateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1384:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1385:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1385:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1386:1: ( RULE_ID )
            {
             before(grammarAccess.getAutomatonAccess().getInitialStateStateCrossReference_5_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1387:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1388:1: RULE_ID
            {
             before(grammarAccess.getAutomatonAccess().getInitialStateStateIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Automaton__InitialStateAssignment_52691); 
             after(grammarAccess.getAutomatonAccess().getInitialStateStateIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAutomatonAccess().getInitialStateStateCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__InitialStateAssignment_5


    // $ANTLR start rule__Automaton__ErrorStateAssignment_7_2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1399:1: rule__Automaton__ErrorStateAssignment_7_2 : ( ( RULE_ID ) ) ;
    public final void rule__Automaton__ErrorStateAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1403:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1404:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1404:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1405:1: ( RULE_ID )
            {
             before(grammarAccess.getAutomatonAccess().getErrorStateStateCrossReference_7_2_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1406:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1407:1: RULE_ID
            {
             before(grammarAccess.getAutomatonAccess().getErrorStateStateIDTerminalRuleCall_7_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Automaton__ErrorStateAssignment_7_22730); 
             after(grammarAccess.getAutomatonAccess().getErrorStateStateIDTerminalRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getAutomatonAccess().getErrorStateStateCrossReference_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__ErrorStateAssignment_7_2


    // $ANTLR start rule__Automaton__StatesAssignment_8
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1418:1: rule__Automaton__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Automaton__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1422:1: ( ( ruleState ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1423:1: ( ruleState )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1423:1: ( ruleState )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1424:1: ruleState
            {
             before(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Automaton__StatesAssignment_82765);
            ruleState();
            _fsp--;

             after(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Automaton__StatesAssignment_8


    // $ANTLR start rule__Class__NameAssignment
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1433:1: rule__Class__NameAssignment : ( ruleJAVAID ) ;
    public final void rule__Class__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1437:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1438:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1438:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1439:1: ruleJAVAID
            {
             before(grammarAccess.getClassAccess().getNameJAVAIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Class__NameAssignment2796);
            ruleJAVAID();
            _fsp--;

             after(grammarAccess.getClassAccess().getNameJAVAIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class__NameAssignment


    // $ANTLR start rule__State__InitialAssignment_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1448:1: rule__State__InitialAssignment_0 : ( ( 'initial' ) ) ;
    public final void rule__State__InitialAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1452:1: ( ( ( 'initial' ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1453:1: ( ( 'initial' ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1453:1: ( ( 'initial' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1454:1: ( 'initial' )
            {
             before(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1455:1: ( 'initial' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1456:1: 'initial'
            {
             before(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); 
            match(input,15,FOLLOW_15_in_rule__State__InitialAssignment_02832); 
             after(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); 

            }

             after(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__InitialAssignment_0


    // $ANTLR start rule__State__NameAssignment_2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1471:1: rule__State__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1475:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1476:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1476:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1477:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_22871); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__NameAssignment_2


    // $ANTLR start rule__State__TransitionsAssignment_4
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1486:1: rule__State__TransitionsAssignment_4 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1490:1: ( ( ruleTransition ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1491:1: ( ruleTransition )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1491:1: ( ruleTransition )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1492:1: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_42902);
            ruleTransition();
            _fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__TransitionsAssignment_4


    // $ANTLR start rule__Transition__MethodAssignment_0_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1501:1: rule__Transition__MethodAssignment_0_0 : ( ruleMethod ) ;
    public final void rule__Transition__MethodAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1505:1: ( ( ruleMethod ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1506:1: ( ruleMethod )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1506:1: ( ruleMethod )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1507:1: ruleMethod
            {
             before(grammarAccess.getTransitionAccess().getMethodMethodParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Transition__MethodAssignment_0_02933);
            ruleMethod();
            _fsp--;

             after(grammarAccess.getTransitionAccess().getMethodMethodParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__MethodAssignment_0_0


    // $ANTLR start rule__Transition__StateAssignment_2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1516:1: rule__Transition__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1520:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1521:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1521:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1522:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1523:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1524:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_22968); 
             after(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__StateAssignment_2


    // $ANTLR start rule__Method__ReturntypeAssignment_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1535:1: rule__Method__ReturntypeAssignment_0 : ( ruleType ) ;
    public final void rule__Method__ReturntypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1539:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1540:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1540:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1541:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getReturntypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ReturntypeAssignment_03003);
            ruleType();
            _fsp--;

             after(grammarAccess.getMethodAccess().getReturntypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Method__ReturntypeAssignment_0


    // $ANTLR start rule__Method__NameAssignment_1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1550:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1554:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1555:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1555:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1556:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_13034); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Method__NameAssignment_1


    // $ANTLR start rule__Method__ArgsAssignment_3_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1565:1: rule__Method__ArgsAssignment_3_0 : ( ruleType ) ;
    public final void rule__Method__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1569:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1570:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1570:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1571:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_03065);
            ruleType();
            _fsp--;

             after(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Method__ArgsAssignment_3_0


    // $ANTLR start rule__Method__ArgsAssignment_3_1_1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1580:1: rule__Method__ArgsAssignment_3_1_1 : ( ruleType ) ;
    public final void rule__Method__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1584:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1585:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1585:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1586:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_1_13096);
            ruleType();
            _fsp--;

             after(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Method__ArgsAssignment_3_1_1


    // $ANTLR start rule__Constructor__ArgsAssignment_2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1595:1: rule__Constructor__ArgsAssignment_2 : ( ruleType ) ;
    public final void rule__Constructor__ArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1599:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1600:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1600:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1601:1: ruleType
            {
             before(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_23127);
            ruleType();
            _fsp--;

             after(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constructor__ArgsAssignment_2


    // $ANTLR start rule__Type__NameAssignment
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1610:1: rule__Type__NameAssignment : ( ruleJAVAID ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1614:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1615:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1615:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1616:1: ruleJAVAID
            {
             before(grammarAccess.getTypeAccess().getNameJAVAIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Type__NameAssignment3158);
            ruleJAVAID();
            _fsp--;

             after(grammarAccess.getTypeAccess().getNameJAVAIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__NameAssignment


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\6\uffff";
    static final String DFA1_eofS =
        "\6\uffff";
    static final String DFA1_minS =
        "\3\4\2\uffff\1\4";
    static final String DFA1_maxS =
        "\1\4\1\30\1\4\2\uffff\1\30";
    static final String DFA1_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA1_specialS =
        "\6\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\4\20\uffff\1\3\2\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\4\20\uffff\1\3\2\uffff\1\2"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "330:1: rule__Transition__Alternatives_0 : ( ( ( rule__Transition__MethodAssignment_0_0 ) ) | ( ruleConstructor ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleAutomata_in_entryRuleAutomata60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutomata67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automata__Group__0_in_ruleAutomata94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomaton_in_entryRuleAutomaton180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutomaton187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__Group__0_in_ruleAutomaton214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_in_ruleClass274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__0_in_ruleConstructor514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_in_ruleType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_entryRuleJAVAID600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJAVAID607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__MethodAssignment_0_0_in_rule__Transition__Alternatives_0670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_rule__Transition__Alternatives_0688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automata__PackageAssignment_0_in_rule__Automata__Group__0722 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Automata__Group__1_in_rule__Automata__Group__0732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__1762 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__1774 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11_in_rule__Package__Group__0816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1854 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Package__Group__2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Automaton__Group__0934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Automaton__Group__1_in_rule__Automaton__Group__0944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__KlassAssignment_1_in_rule__Automaton__Group__1972 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__2_in_rule__Automaton__Group__1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Automaton__Group__21010 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__3_in_rule__Automaton__Group__21020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Automaton__Group__31049 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__4_in_rule__Automaton__Group__31059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Automaton__Group__41088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Automaton__Group__5_in_rule__Automaton__Group__41098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__InitialStateAssignment_5_in_rule__Automaton__Group__51126 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__6_in_rule__Automaton__Group__51135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Automaton__Group__61164 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__7_in_rule__Automaton__Group__61174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__0_in_rule__Automaton__Group__71202 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__8_in_rule__Automaton__Group__71212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81242 = new BitSet(new long[]{0x00000000000A8000L});
    public static final BitSet FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81254 = new BitSet(new long[]{0x00000000000A8000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__9_in_rule__Automaton__Group__81266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Automaton__Group__91295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Automaton__Group_7__01351 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__1_in_rule__Automaton__Group_7__01361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Automaton__Group_7__11390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__2_in_rule__Automaton__Group_7__11400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__ErrorStateAssignment_7_2_in_rule__Automaton__Group_7__21428 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__3_in_rule__Automaton__Group_7__21437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Automaton__Group_7__31466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__InitialAssignment_0_in_rule__State__Group__01509 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__01519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__State__Group__11548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__11558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__21586 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__21595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__State__Group__31624 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__31634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TransitionsAssignment_4_in_rule__State__Group__41662 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__41672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__Group__51701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Alternatives_0_in_rule__Transition__Group__01748 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Transition__Group__11786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__21824 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Transition__Group__31862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ReturntypeAssignment_0_in_rule__Method__Group__01905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__01914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__11942 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__11951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Method__Group__21980 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__21990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__32018 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Method__Group__42057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ArgsAssignment_3_0_in_rule__Method__Group_3__02102 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__02111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__12139 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_rule__Method__Group_3_1__02179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__02189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ArgsAssignment_3_1_1_in_rule__Method__Group_3_1__12217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Constructor__Group__02255 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Constructor__Group__12292 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ArgsAssignment_2_in_rule__Constructor__Group__22330 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Constructor__Group__32369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group__02412 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__02420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__12448 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_rule__JAVAID__Group_1__02488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__02498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__12526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Automata__PackageAssignment_02563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomaton_in_rule__Automata__AutomataAssignment_12594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Package__NameAssignment_12625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Automaton__KlassAssignment_12656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Automaton__InitialStateAssignment_52691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Automaton__ErrorStateAssignment_7_22730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Automaton__StatesAssignment_82765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Class__NameAssignment2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__State__InitialAssignment_02832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_22871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_42902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Transition__MethodAssignment_0_02933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_22968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ReturntypeAssignment_03003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_13034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_03065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_1_13096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_23127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Type__NameAssignment3158 = new BitSet(new long[]{0x0000000000000002L});

}