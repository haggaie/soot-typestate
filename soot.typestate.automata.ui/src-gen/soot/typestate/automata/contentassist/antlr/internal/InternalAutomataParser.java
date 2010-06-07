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


    // $ANTLR start entryRuleInvocation
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:222:1: entryRuleInvocation : ruleInvocation EOF ;
    public final void entryRuleInvocation() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:222:21: ( ruleInvocation EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:223:1: ruleInvocation EOF
            {
             before(grammarAccess.getInvocationRule()); 
            pushFollow(FOLLOW_ruleInvocation_in_entryRuleInvocation420);
            ruleInvocation();
            _fsp--;

             after(grammarAccess.getInvocationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvocation427); 

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
    // $ANTLR end entryRuleInvocation


    // $ANTLR start ruleInvocation
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:230:1: ruleInvocation : ( ( rule__Invocation__Alternatives ) ) ;
    public final void ruleInvocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:234:2: ( ( ( rule__Invocation__Alternatives ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:235:1: ( ( rule__Invocation__Alternatives ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:235:1: ( ( rule__Invocation__Alternatives ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:236:1: ( rule__Invocation__Alternatives )
            {
             before(grammarAccess.getInvocationAccess().getAlternatives()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:237:1: ( rule__Invocation__Alternatives )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:237:2: rule__Invocation__Alternatives
            {
            pushFollow(FOLLOW_rule__Invocation__Alternatives_in_ruleInvocation454);
            rule__Invocation__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getInvocationAccess().getAlternatives()); 

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
    // $ANTLR end ruleInvocation


    // $ANTLR start entryRuleMethod
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:249:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:249:17: ( ruleMethod EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:250:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod480);
            ruleMethod();
            _fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod487); 

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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:257:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:261:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:262:1: ( ( rule__Method__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:262:1: ( ( rule__Method__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:263:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:264:1: ( rule__Method__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:264:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod514);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:276:1: entryRuleConstructor : ruleConstructor EOF ;
    public final void entryRuleConstructor() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:276:22: ( ruleConstructor EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:277:1: ruleConstructor EOF
            {
             before(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor540);
            ruleConstructor();
            _fsp--;

             after(grammarAccess.getConstructorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor547); 

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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:284:1: ruleConstructor : ( ( rule__Constructor__Group__0 ) ) ;
    public final void ruleConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:288:2: ( ( ( rule__Constructor__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:289:1: ( ( rule__Constructor__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:289:1: ( ( rule__Constructor__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:290:1: ( rule__Constructor__Group__0 )
            {
             before(grammarAccess.getConstructorAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:291:1: ( rule__Constructor__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:291:2: rule__Constructor__Group__0
            {
            pushFollow(FOLLOW_rule__Constructor__Group__0_in_ruleConstructor574);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:303:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:303:15: ( ruleType EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:304:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType600);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType607); 

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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:311:1: ruleType : ( ( rule__Type__NameAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:315:2: ( ( ( rule__Type__NameAssignment ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:316:1: ( ( rule__Type__NameAssignment ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:316:1: ( ( rule__Type__NameAssignment ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:317:1: ( rule__Type__NameAssignment )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:318:1: ( rule__Type__NameAssignment )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:318:2: rule__Type__NameAssignment
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_in_ruleType634);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:330:1: entryRuleJAVAID : ruleJAVAID EOF ;
    public final void entryRuleJAVAID() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:330:17: ( ruleJAVAID EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:331:1: ruleJAVAID EOF
            {
             before(grammarAccess.getJAVAIDRule()); 
            pushFollow(FOLLOW_ruleJAVAID_in_entryRuleJAVAID660);
            ruleJAVAID();
            _fsp--;

             after(grammarAccess.getJAVAIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJAVAID667); 

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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:338:1: ruleJAVAID : ( ( rule__JAVAID__Group__0 ) ) ;
    public final void ruleJAVAID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:342:2: ( ( ( rule__JAVAID__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:343:1: ( ( rule__JAVAID__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:343:1: ( ( rule__JAVAID__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:344:1: ( rule__JAVAID__Group__0 )
            {
             before(grammarAccess.getJAVAIDAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:345:1: ( rule__JAVAID__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:345:2: rule__JAVAID__Group__0
            {
            pushFollow(FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID694);
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


    // $ANTLR start rule__Invocation__Alternatives
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:357:1: rule__Invocation__Alternatives : ( ( ruleMethod ) | ( ruleConstructor ) );
    public final void rule__Invocation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:361:1: ( ( ruleMethod ) | ( ruleConstructor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==21) ) {
                    alt1=2;
                }
                else if ( (LA1_1==RULE_ID||LA1_1==24) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("357:1: rule__Invocation__Alternatives : ( ( ruleMethod ) | ( ruleConstructor ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("357:1: rule__Invocation__Alternatives : ( ( ruleMethod ) | ( ruleConstructor ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:362:1: ( ruleMethod )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:362:1: ( ruleMethod )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:363:1: ruleMethod
                    {
                     before(grammarAccess.getInvocationAccess().getMethodParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMethod_in_rule__Invocation__Alternatives730);
                    ruleMethod();
                    _fsp--;

                     after(grammarAccess.getInvocationAccess().getMethodParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:368:6: ( ruleConstructor )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:368:6: ( ruleConstructor )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:369:1: ruleConstructor
                    {
                     before(grammarAccess.getInvocationAccess().getConstructorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleConstructor_in_rule__Invocation__Alternatives747);
                    ruleConstructor();
                    _fsp--;

                     after(grammarAccess.getInvocationAccess().getConstructorParserRuleCall_1()); 

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
    // $ANTLR end rule__Invocation__Alternatives


    // $ANTLR start rule__Automata__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:381:1: rule__Automata__Group__0 : ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1 ;
    public final void rule__Automata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:385:1: ( ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:386:1: ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:386:1: ( ( rule__Automata__PackageAssignment_0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:387:1: ( rule__Automata__PackageAssignment_0 )?
            {
             before(grammarAccess.getAutomataAccess().getPackageAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:388:1: ( rule__Automata__PackageAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:388:2: rule__Automata__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Automata__PackageAssignment_0_in_rule__Automata__Group__0781);
                    rule__Automata__PackageAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomataAccess().getPackageAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Automata__Group__1_in_rule__Automata__Group__0791);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:399:1: rule__Automata__Group__1 : ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) ) ;
    public final void rule__Automata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:403:1: ( ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:404:1: ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:404:1: ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:405:1: ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:405:1: ( ( rule__Automata__AutomataAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:406:1: ( rule__Automata__AutomataAssignment_1 )
            {
             before(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:407:1: ( rule__Automata__AutomataAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:407:2: rule__Automata__AutomataAssignment_1
            {
            pushFollow(FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__1821);
            rule__Automata__AutomataAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 

            }

            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:410:1: ( ( rule__Automata__AutomataAssignment_1 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:411:1: ( rule__Automata__AutomataAssignment_1 )*
            {
             before(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:412:1: ( rule__Automata__AutomataAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:412:2: rule__Automata__AutomataAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__1833);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:427:1: rule__Package__Group__0 : ( 'package' ) rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:431:1: ( ( 'package' ) rule__Package__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:432:1: ( 'package' ) rule__Package__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:432:1: ( 'package' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:433:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Package__Group__0875); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0885);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:447:1: rule__Package__Group__1 : ( ( rule__Package__NameAssignment_1 ) ) rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:451:1: ( ( ( rule__Package__NameAssignment_1 ) ) rule__Package__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:452:1: ( ( rule__Package__NameAssignment_1 ) ) rule__Package__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:452:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:453:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:454:1: ( rule__Package__NameAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:454:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1913);
            rule__Package__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1922);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:465:1: rule__Package__Group__2 : ( ';' ) ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:469:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:470:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:470:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:471:1: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Package__Group__2951); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:490:1: rule__Automaton__Group__0 : ( 'automaton' ) rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:494:1: ( ( 'automaton' ) rule__Automaton__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:495:1: ( 'automaton' ) rule__Automaton__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:495:1: ( 'automaton' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:496:1: 'automaton'
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Automaton__Group__0993); 
             after(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__1_in_rule__Automaton__Group__01003);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:510:1: rule__Automaton__Group__1 : ( ( rule__Automaton__KlassAssignment_1 ) ) rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:514:1: ( ( ( rule__Automaton__KlassAssignment_1 ) ) rule__Automaton__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:515:1: ( ( rule__Automaton__KlassAssignment_1 ) ) rule__Automaton__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:515:1: ( ( rule__Automaton__KlassAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:516:1: ( rule__Automaton__KlassAssignment_1 )
            {
             before(grammarAccess.getAutomatonAccess().getKlassAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:517:1: ( rule__Automaton__KlassAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:517:2: rule__Automaton__KlassAssignment_1
            {
            pushFollow(FOLLOW_rule__Automaton__KlassAssignment_1_in_rule__Automaton__Group__11031);
            rule__Automaton__KlassAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getKlassAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__2_in_rule__Automaton__Group__11040);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:528:1: rule__Automaton__Group__2 : ( '{' ) rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:532:1: ( ( '{' ) rule__Automaton__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:533:1: ( '{' ) rule__Automaton__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:533:1: ( '{' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:534:1: '{'
            {
             before(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Automaton__Group__21069); 
             after(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__3_in_rule__Automaton__Group__21079);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:548:1: rule__Automaton__Group__3 : ( 'initial' ) rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:552:1: ( ( 'initial' ) rule__Automaton__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:553:1: ( 'initial' ) rule__Automaton__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:553:1: ( 'initial' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:554:1: 'initial'
            {
             before(grammarAccess.getAutomatonAccess().getInitialKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Automaton__Group__31108); 
             after(grammarAccess.getAutomatonAccess().getInitialKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__4_in_rule__Automaton__Group__31118);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:568:1: rule__Automaton__Group__4 : ( '=' ) rule__Automaton__Group__5 ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:572:1: ( ( '=' ) rule__Automaton__Group__5 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:573:1: ( '=' ) rule__Automaton__Group__5
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:573:1: ( '=' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:574:1: '='
            {
             before(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Automaton__Group__41147); 
             after(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__5_in_rule__Automaton__Group__41157);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:588:1: rule__Automaton__Group__5 : ( ( rule__Automaton__InitialStateAssignment_5 ) ) rule__Automaton__Group__6 ;
    public final void rule__Automaton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:592:1: ( ( ( rule__Automaton__InitialStateAssignment_5 ) ) rule__Automaton__Group__6 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:593:1: ( ( rule__Automaton__InitialStateAssignment_5 ) ) rule__Automaton__Group__6
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:593:1: ( ( rule__Automaton__InitialStateAssignment_5 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:594:1: ( rule__Automaton__InitialStateAssignment_5 )
            {
             before(grammarAccess.getAutomatonAccess().getInitialStateAssignment_5()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:595:1: ( rule__Automaton__InitialStateAssignment_5 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:595:2: rule__Automaton__InitialStateAssignment_5
            {
            pushFollow(FOLLOW_rule__Automaton__InitialStateAssignment_5_in_rule__Automaton__Group__51185);
            rule__Automaton__InitialStateAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getInitialStateAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__6_in_rule__Automaton__Group__51194);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:606:1: rule__Automaton__Group__6 : ( ';' ) rule__Automaton__Group__7 ;
    public final void rule__Automaton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:610:1: ( ( ';' ) rule__Automaton__Group__7 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:611:1: ( ';' ) rule__Automaton__Group__7
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:611:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:612:1: ';'
            {
             before(grammarAccess.getAutomatonAccess().getSemicolonKeyword_6()); 
            match(input,12,FOLLOW_12_in_rule__Automaton__Group__61223); 
             after(grammarAccess.getAutomatonAccess().getSemicolonKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__7_in_rule__Automaton__Group__61233);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:626:1: rule__Automaton__Group__7 : ( ( rule__Automaton__Group_7__0 )? ) rule__Automaton__Group__8 ;
    public final void rule__Automaton__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:630:1: ( ( ( rule__Automaton__Group_7__0 )? ) rule__Automaton__Group__8 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:631:1: ( ( rule__Automaton__Group_7__0 )? ) rule__Automaton__Group__8
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:631:1: ( ( rule__Automaton__Group_7__0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:632:1: ( rule__Automaton__Group_7__0 )?
            {
             before(grammarAccess.getAutomatonAccess().getGroup_7()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:633:1: ( rule__Automaton__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:633:2: rule__Automaton__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Automaton__Group_7__0_in_rule__Automaton__Group__71261);
                    rule__Automaton__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatonAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__8_in_rule__Automaton__Group__71271);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:644:1: rule__Automaton__Group__8 : ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) ) rule__Automaton__Group__9 ;
    public final void rule__Automaton__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:648:1: ( ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) ) rule__Automaton__Group__9 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:649:1: ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) ) rule__Automaton__Group__9
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:649:1: ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:650:1: ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:650:1: ( ( rule__Automaton__StatesAssignment_8 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:651:1: ( rule__Automaton__StatesAssignment_8 )
            {
             before(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:652:1: ( rule__Automaton__StatesAssignment_8 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:652:2: rule__Automaton__StatesAssignment_8
            {
            pushFollow(FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81301);
            rule__Automaton__StatesAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 

            }

            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:655:1: ( ( rule__Automaton__StatesAssignment_8 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:656:1: ( rule__Automaton__StatesAssignment_8 )*
            {
             before(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:657:1: ( rule__Automaton__StatesAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:657:2: rule__Automaton__StatesAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81313);
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

            pushFollow(FOLLOW_rule__Automaton__Group__9_in_rule__Automaton__Group__81325);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:669:1: rule__Automaton__Group__9 : ( '}' ) ;
    public final void rule__Automaton__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:673:1: ( ( '}' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:674:1: ( '}' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:674:1: ( '}' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:675:1: '}'
            {
             before(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_17_in_rule__Automaton__Group__91354); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:708:1: rule__Automaton__Group_7__0 : ( 'error' ) rule__Automaton__Group_7__1 ;
    public final void rule__Automaton__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:712:1: ( ( 'error' ) rule__Automaton__Group_7__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:713:1: ( 'error' ) rule__Automaton__Group_7__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:713:1: ( 'error' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:714:1: 'error'
            {
             before(grammarAccess.getAutomatonAccess().getErrorKeyword_7_0()); 
            match(input,18,FOLLOW_18_in_rule__Automaton__Group_7__01410); 
             after(grammarAccess.getAutomatonAccess().getErrorKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group_7__1_in_rule__Automaton__Group_7__01420);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:728:1: rule__Automaton__Group_7__1 : ( '=' ) rule__Automaton__Group_7__2 ;
    public final void rule__Automaton__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:732:1: ( ( '=' ) rule__Automaton__Group_7__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:733:1: ( '=' ) rule__Automaton__Group_7__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:733:1: ( '=' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:734:1: '='
            {
             before(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_7_1()); 
            match(input,16,FOLLOW_16_in_rule__Automaton__Group_7__11449); 
             after(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group_7__2_in_rule__Automaton__Group_7__11459);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:748:1: rule__Automaton__Group_7__2 : ( ( rule__Automaton__ErrorStateAssignment_7_2 ) ) rule__Automaton__Group_7__3 ;
    public final void rule__Automaton__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:752:1: ( ( ( rule__Automaton__ErrorStateAssignment_7_2 ) ) rule__Automaton__Group_7__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:753:1: ( ( rule__Automaton__ErrorStateAssignment_7_2 ) ) rule__Automaton__Group_7__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:753:1: ( ( rule__Automaton__ErrorStateAssignment_7_2 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:754:1: ( rule__Automaton__ErrorStateAssignment_7_2 )
            {
             before(grammarAccess.getAutomatonAccess().getErrorStateAssignment_7_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:755:1: ( rule__Automaton__ErrorStateAssignment_7_2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:755:2: rule__Automaton__ErrorStateAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Automaton__ErrorStateAssignment_7_2_in_rule__Automaton__Group_7__21487);
            rule__Automaton__ErrorStateAssignment_7_2();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getErrorStateAssignment_7_2()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group_7__3_in_rule__Automaton__Group_7__21496);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:766:1: rule__Automaton__Group_7__3 : ( ';' ) ;
    public final void rule__Automaton__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:770:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:771:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:771:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:772:1: ';'
            {
             before(grammarAccess.getAutomatonAccess().getSemicolonKeyword_7_3()); 
            match(input,12,FOLLOW_12_in_rule__Automaton__Group_7__31525); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:793:1: rule__State__Group__0 : ( 'state' ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:797:1: ( ( 'state' ) rule__State__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:798:1: ( 'state' ) rule__State__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:798:1: ( 'state' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:799:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__State__Group__01569); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__01579);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:813:1: rule__State__Group__1 : ( ( rule__State__NameAssignment_1 ) ) rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:817:1: ( ( ( rule__State__NameAssignment_1 ) ) rule__State__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:818:1: ( ( rule__State__NameAssignment_1 ) ) rule__State__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:818:1: ( ( rule__State__NameAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:819:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:820:1: ( rule__State__NameAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:820:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__11607);
            rule__State__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__11616);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:831:1: rule__State__Group__2 : ( '{' ) rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:835:1: ( ( '{' ) rule__State__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:836:1: ( '{' ) rule__State__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:836:1: ( '{' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:837:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__State__Group__21645); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__21655);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:851:1: rule__State__Group__3 : ( ( rule__State__TransitionsAssignment_3 )* ) rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:855:1: ( ( ( rule__State__TransitionsAssignment_3 )* ) rule__State__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:856:1: ( ( rule__State__TransitionsAssignment_3 )* ) rule__State__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:856:1: ( ( rule__State__TransitionsAssignment_3 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:857:1: ( rule__State__TransitionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:858:1: ( rule__State__TransitionsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:858:2: rule__State__TransitionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__State__TransitionsAssignment_3_in_rule__State__Group__31683);
            	    rule__State__TransitionsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__31693);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:869:1: rule__State__Group__4 : ( '}' ) ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:873:1: ( ( '}' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:874:1: ( '}' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:874:1: ( '}' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:875:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__State__Group__41722); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end rule__State__Group__4


    // $ANTLR start rule__Transition__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:898:1: rule__Transition__Group__0 : ( ( rule__Transition__InvocationAssignment_0 ) ) rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:902:1: ( ( ( rule__Transition__InvocationAssignment_0 ) ) rule__Transition__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:903:1: ( ( rule__Transition__InvocationAssignment_0 ) ) rule__Transition__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:903:1: ( ( rule__Transition__InvocationAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:904:1: ( rule__Transition__InvocationAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getInvocationAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:905:1: ( rule__Transition__InvocationAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:905:2: rule__Transition__InvocationAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__InvocationAssignment_0_in_rule__Transition__Group__01767);
            rule__Transition__InvocationAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getInvocationAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01776);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:916:1: rule__Transition__Group__1 : ( '->' ) rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:920:1: ( ( '->' ) rule__Transition__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:921:1: ( '->' ) rule__Transition__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:921:1: ( '->' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:922:1: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Transition__Group__11805); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11815);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:936:1: rule__Transition__Group__2 : ( ( rule__Transition__StateAssignment_2 ) ) rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:940:1: ( ( ( rule__Transition__StateAssignment_2 ) ) rule__Transition__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:941:1: ( ( rule__Transition__StateAssignment_2 ) ) rule__Transition__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:941:1: ( ( rule__Transition__StateAssignment_2 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:942:1: ( rule__Transition__StateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:943:1: ( rule__Transition__StateAssignment_2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:943:2: rule__Transition__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__21843);
            rule__Transition__StateAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getStateAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21852);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:954:1: rule__Transition__Group__3 : ( ';' ) ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:958:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:959:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:959:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:960:1: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Transition__Group__31881); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:981:1: rule__Method__Group__0 : ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:985:1: ( ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:986:1: ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:986:1: ( ( rule__Method__ReturntypeAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:987:1: ( rule__Method__ReturntypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getReturntypeAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:988:1: ( rule__Method__ReturntypeAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:988:2: rule__Method__ReturntypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Method__ReturntypeAssignment_0_in_rule__Method__Group__01924);
            rule__Method__ReturntypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturntypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__01933);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:999:1: rule__Method__Group__1 : ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1003:1: ( ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1004:1: ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1004:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1005:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1006:1: ( rule__Method__NameAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1006:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__11961);
            rule__Method__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__11970);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1017:1: rule__Method__Group__2 : ( '(' ) rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1021:1: ( ( '(' ) rule__Method__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1022:1: ( '(' ) rule__Method__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1022:1: ( '(' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1023:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Method__Group__21999); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22009);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1037:1: rule__Method__Group__3 : ( ( rule__Method__Group_3__0 )? ) rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1041:1: ( ( ( rule__Method__Group_3__0 )? ) rule__Method__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1042:1: ( ( rule__Method__Group_3__0 )? ) rule__Method__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1042:1: ( ( rule__Method__Group_3__0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1043:1: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1044:1: ( rule__Method__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1044:2: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__32037);
                    rule__Method__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32047);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1055:1: rule__Method__Group__4 : ( ')' ) ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1059:1: ( ( ')' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1060:1: ( ')' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1060:1: ( ')' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1061:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__Method__Group__42076); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1084:1: rule__Method__Group_3__0 : ( ( rule__Method__ArgsAssignment_3_0 ) ) rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1088:1: ( ( ( rule__Method__ArgsAssignment_3_0 ) ) rule__Method__Group_3__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1089:1: ( ( rule__Method__ArgsAssignment_3_0 ) ) rule__Method__Group_3__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1089:1: ( ( rule__Method__ArgsAssignment_3_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1090:1: ( rule__Method__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1091:1: ( rule__Method__ArgsAssignment_3_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1091:2: rule__Method__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Method__ArgsAssignment_3_0_in_rule__Method__Group_3__02121);
            rule__Method__ArgsAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getArgsAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__02130);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1102:1: rule__Method__Group_3__1 : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1106:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1107:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1107:1: ( ( rule__Method__Group_3_1__0 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1108:1: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1109:1: ( rule__Method__Group_3_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1109:2: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__12158);
            	    rule__Method__Group_3_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1123:1: rule__Method__Group_3_1__0 : ( ',' ) rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1127:1: ( ( ',' ) rule__Method__Group_3_1__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1128:1: ( ',' ) rule__Method__Group_3_1__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1128:1: ( ',' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1129:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Method__Group_3_1__02198); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__02208);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1143:1: rule__Method__Group_3_1__1 : ( ( rule__Method__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1147:1: ( ( ( rule__Method__ArgsAssignment_3_1_1 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1148:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1148:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1149:1: ( rule__Method__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_1_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1150:1: ( rule__Method__ArgsAssignment_3_1_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1150:2: rule__Method__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Method__ArgsAssignment_3_1_1_in_rule__Method__Group_3_1__12236);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1164:1: rule__Constructor__Group__0 : ( ( rule__Constructor__KlassAssignment_0 ) ) rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1168:1: ( ( ( rule__Constructor__KlassAssignment_0 ) ) rule__Constructor__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1169:1: ( ( rule__Constructor__KlassAssignment_0 ) ) rule__Constructor__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1169:1: ( ( rule__Constructor__KlassAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1170:1: ( rule__Constructor__KlassAssignment_0 )
            {
             before(grammarAccess.getConstructorAccess().getKlassAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1171:1: ( rule__Constructor__KlassAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1171:2: rule__Constructor__KlassAssignment_0
            {
            pushFollow(FOLLOW_rule__Constructor__KlassAssignment_0_in_rule__Constructor__Group__02274);
            rule__Constructor__KlassAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getConstructorAccess().getKlassAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02283);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1182:1: rule__Constructor__Group__1 : ( '(' ) rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1186:1: ( ( '(' ) rule__Constructor__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1187:1: ( '(' ) rule__Constructor__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1187:1: ( '(' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1188:1: '('
            {
             before(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Constructor__Group__12312); 
             after(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12322);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1202:1: rule__Constructor__Group__2 : ( ( rule__Constructor__Group_2__0 )? ) rule__Constructor__Group__3 ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1206:1: ( ( ( rule__Constructor__Group_2__0 )? ) rule__Constructor__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1207:1: ( ( rule__Constructor__Group_2__0 )? ) rule__Constructor__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1207:1: ( ( rule__Constructor__Group_2__0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1208:1: ( rule__Constructor__Group_2__0 )?
            {
             before(grammarAccess.getConstructorAccess().getGroup_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1209:1: ( rule__Constructor__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1209:2: rule__Constructor__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Constructor__Group_2__0_in_rule__Constructor__Group__22350);
                    rule__Constructor__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22360);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1220:1: rule__Constructor__Group__3 : ( ')' ) ;
    public final void rule__Constructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1224:1: ( ( ')' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1225:1: ( ')' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1225:1: ( ')' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1226:1: ')'
            {
             before(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Constructor__Group__32389); 
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


    // $ANTLR start rule__Constructor__Group_2__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1247:1: rule__Constructor__Group_2__0 : ( ( rule__Constructor__ArgsAssignment_2_0 ) ) rule__Constructor__Group_2__1 ;
    public final void rule__Constructor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1251:1: ( ( ( rule__Constructor__ArgsAssignment_2_0 ) ) rule__Constructor__Group_2__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1252:1: ( ( rule__Constructor__ArgsAssignment_2_0 ) ) rule__Constructor__Group_2__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1252:1: ( ( rule__Constructor__ArgsAssignment_2_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1253:1: ( rule__Constructor__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getConstructorAccess().getArgsAssignment_2_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1254:1: ( rule__Constructor__ArgsAssignment_2_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1254:2: rule__Constructor__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Constructor__ArgsAssignment_2_0_in_rule__Constructor__Group_2__02432);
            rule__Constructor__ArgsAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getConstructorAccess().getArgsAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group_2__1_in_rule__Constructor__Group_2__02441);
            rule__Constructor__Group_2__1();
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
    // $ANTLR end rule__Constructor__Group_2__0


    // $ANTLR start rule__Constructor__Group_2__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1265:1: rule__Constructor__Group_2__1 : ( ( rule__Constructor__Group_2_1__0 )* ) ;
    public final void rule__Constructor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1269:1: ( ( ( rule__Constructor__Group_2_1__0 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1270:1: ( ( rule__Constructor__Group_2_1__0 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1270:1: ( ( rule__Constructor__Group_2_1__0 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1271:1: ( rule__Constructor__Group_2_1__0 )*
            {
             before(grammarAccess.getConstructorAccess().getGroup_2_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1272:1: ( rule__Constructor__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1272:2: rule__Constructor__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor__Group_2_1__0_in_rule__Constructor__Group_2__12469);
            	    rule__Constructor__Group_2_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getConstructorAccess().getGroup_2_1()); 

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
    // $ANTLR end rule__Constructor__Group_2__1


    // $ANTLR start rule__Constructor__Group_2_1__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1286:1: rule__Constructor__Group_2_1__0 : ( ',' ) rule__Constructor__Group_2_1__1 ;
    public final void rule__Constructor__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1290:1: ( ( ',' ) rule__Constructor__Group_2_1__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1291:1: ( ',' ) rule__Constructor__Group_2_1__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1291:1: ( ',' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1292:1: ','
            {
             before(grammarAccess.getConstructorAccess().getCommaKeyword_2_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Constructor__Group_2_1__02509); 
             after(grammarAccess.getConstructorAccess().getCommaKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group_2_1__1_in_rule__Constructor__Group_2_1__02519);
            rule__Constructor__Group_2_1__1();
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
    // $ANTLR end rule__Constructor__Group_2_1__0


    // $ANTLR start rule__Constructor__Group_2_1__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1306:1: rule__Constructor__Group_2_1__1 : ( ( rule__Constructor__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Constructor__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1310:1: ( ( ( rule__Constructor__ArgsAssignment_2_1_1 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1311:1: ( ( rule__Constructor__ArgsAssignment_2_1_1 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1311:1: ( ( rule__Constructor__ArgsAssignment_2_1_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1312:1: ( rule__Constructor__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getConstructorAccess().getArgsAssignment_2_1_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1313:1: ( rule__Constructor__ArgsAssignment_2_1_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1313:2: rule__Constructor__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Constructor__ArgsAssignment_2_1_1_in_rule__Constructor__Group_2_1__12547);
            rule__Constructor__ArgsAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getConstructorAccess().getArgsAssignment_2_1_1()); 

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
    // $ANTLR end rule__Constructor__Group_2_1__1


    // $ANTLR start rule__JAVAID__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1327:1: rule__JAVAID__Group__0 : ( RULE_ID ) rule__JAVAID__Group__1 ;
    public final void rule__JAVAID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1331:1: ( ( RULE_ID ) rule__JAVAID__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1332:1: ( RULE_ID ) rule__JAVAID__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1332:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1333:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group__02585); 
             after(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__02593);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1345:1: rule__JAVAID__Group__1 : ( ( rule__JAVAID__Group_1__0 )* ) ;
    public final void rule__JAVAID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1349:1: ( ( ( rule__JAVAID__Group_1__0 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1350:1: ( ( rule__JAVAID__Group_1__0 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1350:1: ( ( rule__JAVAID__Group_1__0 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1351:1: ( rule__JAVAID__Group_1__0 )*
            {
             before(grammarAccess.getJAVAIDAccess().getGroup_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1352:1: ( rule__JAVAID__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1352:2: rule__JAVAID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__12621);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1366:1: rule__JAVAID__Group_1__0 : ( '.' ) rule__JAVAID__Group_1__1 ;
    public final void rule__JAVAID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1370:1: ( ( '.' ) rule__JAVAID__Group_1__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1371:1: ( '.' ) rule__JAVAID__Group_1__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1371:1: ( '.' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1372:1: '.'
            {
             before(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__JAVAID__Group_1__02661); 
             after(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__02671);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1386:1: rule__JAVAID__Group_1__1 : ( RULE_ID ) ;
    public final void rule__JAVAID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1390:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1391:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1391:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1392:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__12699); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1407:1: rule__Automata__PackageAssignment_0 : ( rulePackage ) ;
    public final void rule__Automata__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1411:1: ( ( rulePackage ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1412:1: ( rulePackage )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1412:1: ( rulePackage )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1413:1: rulePackage
            {
             before(grammarAccess.getAutomataAccess().getPackagePackageParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Automata__PackageAssignment_02736);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1422:1: rule__Automata__AutomataAssignment_1 : ( ruleAutomaton ) ;
    public final void rule__Automata__AutomataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1426:1: ( ( ruleAutomaton ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1427:1: ( ruleAutomaton )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1427:1: ( ruleAutomaton )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1428:1: ruleAutomaton
            {
             before(grammarAccess.getAutomataAccess().getAutomataAutomatonParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAutomaton_in_rule__Automata__AutomataAssignment_12767);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1437:1: rule__Package__NameAssignment_1 : ( ruleJAVAID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1441:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1442:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1442:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1443:1: ruleJAVAID
            {
             before(grammarAccess.getPackageAccess().getNameJAVAIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Package__NameAssignment_12798);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1452:1: rule__Automaton__KlassAssignment_1 : ( ruleClass ) ;
    public final void rule__Automaton__KlassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1456:1: ( ( ruleClass ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1457:1: ( ruleClass )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1457:1: ( ruleClass )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1458:1: ruleClass
            {
             before(grammarAccess.getAutomatonAccess().getKlassClassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__Automaton__KlassAssignment_12829);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1467:1: rule__Automaton__InitialStateAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Automaton__InitialStateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1471:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1472:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1472:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1473:1: ( RULE_ID )
            {
             before(grammarAccess.getAutomatonAccess().getInitialStateStateCrossReference_5_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1474:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1475:1: RULE_ID
            {
             before(grammarAccess.getAutomatonAccess().getInitialStateStateIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Automaton__InitialStateAssignment_52864); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1486:1: rule__Automaton__ErrorStateAssignment_7_2 : ( ( RULE_ID ) ) ;
    public final void rule__Automaton__ErrorStateAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1490:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1491:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1491:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1492:1: ( RULE_ID )
            {
             before(grammarAccess.getAutomatonAccess().getErrorStateStateCrossReference_7_2_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1493:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1494:1: RULE_ID
            {
             before(grammarAccess.getAutomatonAccess().getErrorStateStateIDTerminalRuleCall_7_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Automaton__ErrorStateAssignment_7_22903); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1505:1: rule__Automaton__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Automaton__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1509:1: ( ( ruleState ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1510:1: ( ruleState )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1510:1: ( ruleState )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1511:1: ruleState
            {
             before(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Automaton__StatesAssignment_82938);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1520:1: rule__Class__NameAssignment : ( ruleJAVAID ) ;
    public final void rule__Class__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1524:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1525:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1525:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1526:1: ruleJAVAID
            {
             before(grammarAccess.getClassAccess().getNameJAVAIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Class__NameAssignment2969);
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


    // $ANTLR start rule__State__NameAssignment_1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1535:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1539:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1540:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1540:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1541:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_13000); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__State__NameAssignment_1


    // $ANTLR start rule__State__TransitionsAssignment_3
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1550:1: rule__State__TransitionsAssignment_3 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1554:1: ( ( ruleTransition ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1555:1: ( ruleTransition )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1555:1: ( ruleTransition )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1556:1: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_33031);
            ruleTransition();
            _fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 

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
    // $ANTLR end rule__State__TransitionsAssignment_3


    // $ANTLR start rule__Transition__InvocationAssignment_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1565:1: rule__Transition__InvocationAssignment_0 : ( ruleInvocation ) ;
    public final void rule__Transition__InvocationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1569:1: ( ( ruleInvocation ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1570:1: ( ruleInvocation )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1570:1: ( ruleInvocation )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1571:1: ruleInvocation
            {
             before(grammarAccess.getTransitionAccess().getInvocationInvocationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInvocation_in_rule__Transition__InvocationAssignment_03062);
            ruleInvocation();
            _fsp--;

             after(grammarAccess.getTransitionAccess().getInvocationInvocationParserRuleCall_0_0()); 

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
    // $ANTLR end rule__Transition__InvocationAssignment_0


    // $ANTLR start rule__Transition__StateAssignment_2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1580:1: rule__Transition__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1584:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1585:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1585:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1586:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1587:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1588:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_23097); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1599:1: rule__Method__ReturntypeAssignment_0 : ( ruleType ) ;
    public final void rule__Method__ReturntypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1603:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1604:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1604:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1605:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getReturntypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ReturntypeAssignment_03132);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1614:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1618:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1619:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1619:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1620:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_13163); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1629:1: rule__Method__ArgsAssignment_3_0 : ( ruleType ) ;
    public final void rule__Method__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1633:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1634:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1634:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1635:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_03194);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1644:1: rule__Method__ArgsAssignment_3_1_1 : ( ruleType ) ;
    public final void rule__Method__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1648:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1649:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1649:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1650:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_1_13225);
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


    // $ANTLR start rule__Constructor__KlassAssignment_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1659:1: rule__Constructor__KlassAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Constructor__KlassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1663:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1664:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1664:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1665:1: ( RULE_ID )
            {
             before(grammarAccess.getConstructorAccess().getKlassClassCrossReference_0_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1666:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1667:1: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getKlassClassIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor__KlassAssignment_03260); 
             after(grammarAccess.getConstructorAccess().getKlassClassIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getConstructorAccess().getKlassClassCrossReference_0_0()); 

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
    // $ANTLR end rule__Constructor__KlassAssignment_0


    // $ANTLR start rule__Constructor__ArgsAssignment_2_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1678:1: rule__Constructor__ArgsAssignment_2_0 : ( ruleType ) ;
    public final void rule__Constructor__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1682:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1683:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1683:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1684:1: ruleType
            {
             before(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_2_03295);
            ruleType();
            _fsp--;

             after(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_0_0()); 

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
    // $ANTLR end rule__Constructor__ArgsAssignment_2_0


    // $ANTLR start rule__Constructor__ArgsAssignment_2_1_1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1693:1: rule__Constructor__ArgsAssignment_2_1_1 : ( ruleType ) ;
    public final void rule__Constructor__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1697:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1698:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1698:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1699:1: ruleType
            {
             before(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_2_1_13326);
            ruleType();
            _fsp--;

             after(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end rule__Constructor__ArgsAssignment_2_1_1


    // $ANTLR start rule__Type__NameAssignment
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1708:1: rule__Type__NameAssignment : ( ruleJAVAID ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1712:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1713:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1713:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1714:1: ruleJAVAID
            {
             before(grammarAccess.getTypeAccess().getNameJAVAIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Type__NameAssignment3357);
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
    public static final BitSet FOLLOW_ruleInvocation_in_entryRuleInvocation420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvocation427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invocation__Alternatives_in_ruleInvocation454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__0_in_ruleConstructor574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_in_ruleType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_entryRuleJAVAID660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJAVAID667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Invocation__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_rule__Invocation__Alternatives747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automata__PackageAssignment_0_in_rule__Automata__Group__0781 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Automata__Group__1_in_rule__Automata__Group__0791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__1821 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__1833 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11_in_rule__Package__Group__0875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1913 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Package__Group__2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Automaton__Group__0993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Automaton__Group__1_in_rule__Automaton__Group__01003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__KlassAssignment_1_in_rule__Automaton__Group__11031 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__2_in_rule__Automaton__Group__11040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Automaton__Group__21069 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__3_in_rule__Automaton__Group__21079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Automaton__Group__31108 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__4_in_rule__Automaton__Group__31118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Automaton__Group__41147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Automaton__Group__5_in_rule__Automaton__Group__41157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__InitialStateAssignment_5_in_rule__Automaton__Group__51185 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__6_in_rule__Automaton__Group__51194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Automaton__Group__61223 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__7_in_rule__Automaton__Group__61233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__0_in_rule__Automaton__Group__71261 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__8_in_rule__Automaton__Group__71271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81301 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81313 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__9_in_rule__Automaton__Group__81325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Automaton__Group__91354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Automaton__Group_7__01410 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__1_in_rule__Automaton__Group_7__01420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Automaton__Group_7__11449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__2_in_rule__Automaton__Group_7__11459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__ErrorStateAssignment_7_2_in_rule__Automaton__Group_7__21487 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__3_in_rule__Automaton__Group_7__21496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Automaton__Group_7__31525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__State__Group__01569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__01579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__11607 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__State__Group__21645 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__21655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TransitionsAssignment_3_in_rule__State__Group__31683 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__31693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__Group__41722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__InvocationAssignment_0_in_rule__Transition__Group__01767 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Transition__Group__11805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__21843 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Transition__Group__31881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ReturntypeAssignment_0_in_rule__Method__Group__01924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__01933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__11961 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__11970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Method__Group__21999 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__32037 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Method__Group__42076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ArgsAssignment_3_0_in_rule__Method__Group_3__02121 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__02130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__12158 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_rule__Method__Group_3_1__02198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__02208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ArgsAssignment_3_1_1_in_rule__Method__Group_3_1__12236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__KlassAssignment_0_in_rule__Constructor__Group__02274 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Constructor__Group__12312 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_2__0_in_rule__Constructor__Group__22350 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Constructor__Group__32389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ArgsAssignment_2_0_in_rule__Constructor__Group_2__02432 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_2__1_in_rule__Constructor__Group_2__02441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_2_1__0_in_rule__Constructor__Group_2__12469 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_rule__Constructor__Group_2_1__02509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constructor__Group_2_1__1_in_rule__Constructor__Group_2_1__02519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ArgsAssignment_2_1_1_in_rule__Constructor__Group_2_1__12547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group__02585 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__02593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__12621 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_rule__JAVAID__Group_1__02661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__02671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__12699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Automata__PackageAssignment_02736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomaton_in_rule__Automata__AutomataAssignment_12767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Package__NameAssignment_12798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Automaton__KlassAssignment_12829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Automaton__InitialStateAssignment_52864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Automaton__ErrorStateAssignment_7_22903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Automaton__StatesAssignment_82938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Class__NameAssignment2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_13000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_33031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocation_in_rule__Transition__InvocationAssignment_03062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_23097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ReturntypeAssignment_03132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_13163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_03194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_1_13225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor__KlassAssignment_03260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_2_03295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_2_1_13326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Type__NameAssignment3357 = new BitSet(new long[]{0x0000000000000002L});

}