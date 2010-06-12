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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'package'", "';'", "'automaton'", "'{'", "'initial'", "'='", "'}'", "'error'", "'state'", "'->'", "'returns'", "'('", "')'", "','", "'.'", "'true'"
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:203:1: ruleTransition : ( ( rule__Transition__Alternatives ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:207:2: ( ( ( rule__Transition__Alternatives ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:208:1: ( ( rule__Transition__Alternatives ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:208:1: ( ( rule__Transition__Alternatives ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:209:1: ( rule__Transition__Alternatives )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:210:1: ( rule__Transition__Alternatives )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:210:2: rule__Transition__Alternatives
            {
            pushFollow(FOLLOW_rule__Transition__Alternatives_in_ruleTransition394);
            rule__Transition__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives()); 

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


    // $ANTLR start entryRuleInvocationTransition
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:222:1: entryRuleInvocationTransition : ruleInvocationTransition EOF ;
    public final void entryRuleInvocationTransition() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:222:31: ( ruleInvocationTransition EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:223:1: ruleInvocationTransition EOF
            {
             before(grammarAccess.getInvocationTransitionRule()); 
            pushFollow(FOLLOW_ruleInvocationTransition_in_entryRuleInvocationTransition420);
            ruleInvocationTransition();
            _fsp--;

             after(grammarAccess.getInvocationTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvocationTransition427); 

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
    // $ANTLR end entryRuleInvocationTransition


    // $ANTLR start ruleInvocationTransition
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:230:1: ruleInvocationTransition : ( ( rule__InvocationTransition__Group__0 ) ) ;
    public final void ruleInvocationTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:234:2: ( ( ( rule__InvocationTransition__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:235:1: ( ( rule__InvocationTransition__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:235:1: ( ( rule__InvocationTransition__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:236:1: ( rule__InvocationTransition__Group__0 )
            {
             before(grammarAccess.getInvocationTransitionAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:237:1: ( rule__InvocationTransition__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:237:2: rule__InvocationTransition__Group__0
            {
            pushFollow(FOLLOW_rule__InvocationTransition__Group__0_in_ruleInvocationTransition454);
            rule__InvocationTransition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInvocationTransitionAccess().getGroup()); 

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
    // $ANTLR end ruleInvocationTransition


    // $ANTLR start entryRuleBranchedTransition
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:249:1: entryRuleBranchedTransition : ruleBranchedTransition EOF ;
    public final void entryRuleBranchedTransition() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:249:29: ( ruleBranchedTransition EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:250:1: ruleBranchedTransition EOF
            {
             before(grammarAccess.getBranchedTransitionRule()); 
            pushFollow(FOLLOW_ruleBranchedTransition_in_entryRuleBranchedTransition480);
            ruleBranchedTransition();
            _fsp--;

             after(grammarAccess.getBranchedTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranchedTransition487); 

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
    // $ANTLR end entryRuleBranchedTransition


    // $ANTLR start ruleBranchedTransition
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:257:1: ruleBranchedTransition : ( ( rule__BranchedTransition__Group__0 ) ) ;
    public final void ruleBranchedTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:261:2: ( ( ( rule__BranchedTransition__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:262:1: ( ( rule__BranchedTransition__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:262:1: ( ( rule__BranchedTransition__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:263:1: ( rule__BranchedTransition__Group__0 )
            {
             before(grammarAccess.getBranchedTransitionAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:264:1: ( rule__BranchedTransition__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:264:2: rule__BranchedTransition__Group__0
            {
            pushFollow(FOLLOW_rule__BranchedTransition__Group__0_in_ruleBranchedTransition514);
            rule__BranchedTransition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBranchedTransitionAccess().getGroup()); 

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
    // $ANTLR end ruleBranchedTransition


    // $ANTLR start entryRuleInvocation
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:276:1: entryRuleInvocation : ruleInvocation EOF ;
    public final void entryRuleInvocation() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:276:21: ( ruleInvocation EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:277:1: ruleInvocation EOF
            {
             before(grammarAccess.getInvocationRule()); 
            pushFollow(FOLLOW_ruleInvocation_in_entryRuleInvocation540);
            ruleInvocation();
            _fsp--;

             after(grammarAccess.getInvocationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvocation547); 

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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:284:1: ruleInvocation : ( ( rule__Invocation__Alternatives ) ) ;
    public final void ruleInvocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:288:2: ( ( ( rule__Invocation__Alternatives ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:289:1: ( ( rule__Invocation__Alternatives ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:289:1: ( ( rule__Invocation__Alternatives ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:290:1: ( rule__Invocation__Alternatives )
            {
             before(grammarAccess.getInvocationAccess().getAlternatives()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:291:1: ( rule__Invocation__Alternatives )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:291:2: rule__Invocation__Alternatives
            {
            pushFollow(FOLLOW_rule__Invocation__Alternatives_in_ruleInvocation574);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:303:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:303:17: ( ruleMethod EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:304:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod600);
            ruleMethod();
            _fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod607); 

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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:311:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:315:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:316:1: ( ( rule__Method__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:316:1: ( ( rule__Method__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:317:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:318:1: ( rule__Method__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:318:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod634);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:330:1: entryRuleConstructor : ruleConstructor EOF ;
    public final void entryRuleConstructor() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:330:22: ( ruleConstructor EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:331:1: ruleConstructor EOF
            {
             before(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor660);
            ruleConstructor();
            _fsp--;

             after(grammarAccess.getConstructorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor667); 

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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:338:1: ruleConstructor : ( ( rule__Constructor__Group__0 ) ) ;
    public final void ruleConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:342:2: ( ( ( rule__Constructor__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:343:1: ( ( rule__Constructor__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:343:1: ( ( rule__Constructor__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:344:1: ( rule__Constructor__Group__0 )
            {
             before(grammarAccess.getConstructorAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:345:1: ( rule__Constructor__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:345:2: rule__Constructor__Group__0
            {
            pushFollow(FOLLOW_rule__Constructor__Group__0_in_ruleConstructor694);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:357:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:357:15: ( ruleType EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:358:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType720);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType727); 

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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:365:1: ruleType : ( ( rule__Type__NameAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:369:2: ( ( ( rule__Type__NameAssignment ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:370:1: ( ( rule__Type__NameAssignment ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:370:1: ( ( rule__Type__NameAssignment ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:371:1: ( rule__Type__NameAssignment )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:372:1: ( rule__Type__NameAssignment )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:372:2: rule__Type__NameAssignment
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_in_ruleType754);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:384:1: entryRuleJAVAID : ruleJAVAID EOF ;
    public final void entryRuleJAVAID() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:384:17: ( ruleJAVAID EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:385:1: ruleJAVAID EOF
            {
             before(grammarAccess.getJAVAIDRule()); 
            pushFollow(FOLLOW_ruleJAVAID_in_entryRuleJAVAID780);
            ruleJAVAID();
            _fsp--;

             after(grammarAccess.getJAVAIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJAVAID787); 

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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:392:1: ruleJAVAID : ( ( rule__JAVAID__Group__0 ) ) ;
    public final void ruleJAVAID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:396:2: ( ( ( rule__JAVAID__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:397:1: ( ( rule__JAVAID__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:397:1: ( ( rule__JAVAID__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:398:1: ( rule__JAVAID__Group__0 )
            {
             before(grammarAccess.getJAVAIDAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:399:1: ( rule__JAVAID__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:399:2: rule__JAVAID__Group__0
            {
            pushFollow(FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID814);
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


    // $ANTLR start entryRuleBooleanLiteral
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:411:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:411:25: ( ruleBooleanLiteral EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:412:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral840);
            ruleBooleanLiteral();
            _fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral847); 

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
    // $ANTLR end entryRuleBooleanLiteral


    // $ANTLR start ruleBooleanLiteral
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:419:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Alternatives ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:423:2: ( ( ( rule__BooleanLiteral__Alternatives ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:424:1: ( ( rule__BooleanLiteral__Alternatives ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:424:1: ( ( rule__BooleanLiteral__Alternatives ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:425:1: ( rule__BooleanLiteral__Alternatives )
            {
             before(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:426:1: ( rule__BooleanLiteral__Alternatives )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:426:2: rule__BooleanLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Alternatives_in_ruleBooleanLiteral874);
            rule__BooleanLiteral__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 

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
    // $ANTLR end ruleBooleanLiteral


    // $ANTLR start rule__Transition__Alternatives
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:438:1: rule__Transition__Alternatives : ( ( ruleInvocationTransition ) | ( ruleBranchedTransition ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:442:1: ( ( ruleInvocationTransition ) | ( ruleBranchedTransition ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:443:1: ( ruleInvocationTransition )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:443:1: ( ruleInvocationTransition )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:444:1: ruleInvocationTransition
                    {
                     before(grammarAccess.getTransitionAccess().getInvocationTransitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInvocationTransition_in_rule__Transition__Alternatives910);
                    ruleInvocationTransition();
                    _fsp--;

                     after(grammarAccess.getTransitionAccess().getInvocationTransitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:449:6: ( ruleBranchedTransition )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:449:6: ( ruleBranchedTransition )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:450:1: ruleBranchedTransition
                    {
                     before(grammarAccess.getTransitionAccess().getBranchedTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBranchedTransition_in_rule__Transition__Alternatives927);
                    ruleBranchedTransition();
                    _fsp--;

                     after(grammarAccess.getTransitionAccess().getBranchedTransitionParserRuleCall_1()); 

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
    // $ANTLR end rule__Transition__Alternatives


    // $ANTLR start rule__Invocation__Alternatives
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:460:1: rule__Invocation__Alternatives : ( ( ruleMethod ) | ( ruleConstructor ) );
    public final void rule__Invocation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:464:1: ( ( ruleMethod ) | ( ruleConstructor ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==23) ) {
                    alt2=2;
                }
                else if ( (LA2_1==RULE_ID||LA2_1==26) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("460:1: rule__Invocation__Alternatives : ( ( ruleMethod ) | ( ruleConstructor ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("460:1: rule__Invocation__Alternatives : ( ( ruleMethod ) | ( ruleConstructor ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:465:1: ( ruleMethod )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:465:1: ( ruleMethod )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:466:1: ruleMethod
                    {
                     before(grammarAccess.getInvocationAccess().getMethodParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMethod_in_rule__Invocation__Alternatives959);
                    ruleMethod();
                    _fsp--;

                     after(grammarAccess.getInvocationAccess().getMethodParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:471:6: ( ruleConstructor )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:471:6: ( ruleConstructor )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:472:1: ruleConstructor
                    {
                     before(grammarAccess.getInvocationAccess().getConstructorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleConstructor_in_rule__Invocation__Alternatives976);
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


    // $ANTLR start rule__BooleanLiteral__Alternatives
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:482:1: rule__BooleanLiteral__Alternatives : ( ( ( rule__BooleanLiteral__TrueAssignment_0 ) ) | ( 'false' ) );
    public final void rule__BooleanLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:486:1: ( ( ( rule__BooleanLiteral__TrueAssignment_0 ) ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("482:1: rule__BooleanLiteral__Alternatives : ( ( ( rule__BooleanLiteral__TrueAssignment_0 ) ) | ( 'false' ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:487:1: ( ( rule__BooleanLiteral__TrueAssignment_0 ) )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:487:1: ( ( rule__BooleanLiteral__TrueAssignment_0 ) )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:488:1: ( rule__BooleanLiteral__TrueAssignment_0 )
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getTrueAssignment_0()); 
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:489:1: ( rule__BooleanLiteral__TrueAssignment_0 )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:489:2: rule__BooleanLiteral__TrueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BooleanLiteral__TrueAssignment_0_in_rule__BooleanLiteral__Alternatives1008);
                    rule__BooleanLiteral__TrueAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBooleanLiteralAccess().getTrueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:493:6: ( 'false' )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:493:6: ( 'false' )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:494:1: 'false'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1()); 
                    match(input,11,FOLLOW_11_in_rule__BooleanLiteral__Alternatives1027); 
                     after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1()); 

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
    // $ANTLR end rule__BooleanLiteral__Alternatives


    // $ANTLR start rule__Automata__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:508:1: rule__Automata__Group__0 : ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1 ;
    public final void rule__Automata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:512:1: ( ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:513:1: ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:513:1: ( ( rule__Automata__PackageAssignment_0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:514:1: ( rule__Automata__PackageAssignment_0 )?
            {
             before(grammarAccess.getAutomataAccess().getPackageAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:515:1: ( rule__Automata__PackageAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:515:2: rule__Automata__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Automata__PackageAssignment_0_in_rule__Automata__Group__01063);
                    rule__Automata__PackageAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomataAccess().getPackageAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Automata__Group__1_in_rule__Automata__Group__01073);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:526:1: rule__Automata__Group__1 : ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) ) ;
    public final void rule__Automata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:530:1: ( ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:531:1: ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:531:1: ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:532:1: ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:532:1: ( ( rule__Automata__AutomataAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:533:1: ( rule__Automata__AutomataAssignment_1 )
            {
             before(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:534:1: ( rule__Automata__AutomataAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:534:2: rule__Automata__AutomataAssignment_1
            {
            pushFollow(FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__11103);
            rule__Automata__AutomataAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 

            }

            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:537:1: ( ( rule__Automata__AutomataAssignment_1 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:538:1: ( rule__Automata__AutomataAssignment_1 )*
            {
             before(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:539:1: ( rule__Automata__AutomataAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:539:2: rule__Automata__AutomataAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__11115);
            	    rule__Automata__AutomataAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:554:1: rule__Package__Group__0 : ( 'package' ) rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:558:1: ( ( 'package' ) rule__Package__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:559:1: ( 'package' ) rule__Package__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:559:1: ( 'package' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:560:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Package__Group__01157); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01167);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:574:1: rule__Package__Group__1 : ( ( rule__Package__NameAssignment_1 ) ) rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:578:1: ( ( ( rule__Package__NameAssignment_1 ) ) rule__Package__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:579:1: ( ( rule__Package__NameAssignment_1 ) ) rule__Package__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:579:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:580:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:581:1: ( rule__Package__NameAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:581:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__11195);
            rule__Package__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11204);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:592:1: rule__Package__Group__2 : ( ';' ) ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:596:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:597:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:597:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:598:1: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Package__Group__21233); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:617:1: rule__Automaton__Group__0 : ( 'automaton' ) rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:621:1: ( ( 'automaton' ) rule__Automaton__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:622:1: ( 'automaton' ) rule__Automaton__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:622:1: ( 'automaton' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:623:1: 'automaton'
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Automaton__Group__01275); 
             after(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__1_in_rule__Automaton__Group__01285);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:637:1: rule__Automaton__Group__1 : ( ( rule__Automaton__KlassAssignment_1 ) ) rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:641:1: ( ( ( rule__Automaton__KlassAssignment_1 ) ) rule__Automaton__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:642:1: ( ( rule__Automaton__KlassAssignment_1 ) ) rule__Automaton__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:642:1: ( ( rule__Automaton__KlassAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:643:1: ( rule__Automaton__KlassAssignment_1 )
            {
             before(grammarAccess.getAutomatonAccess().getKlassAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:644:1: ( rule__Automaton__KlassAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:644:2: rule__Automaton__KlassAssignment_1
            {
            pushFollow(FOLLOW_rule__Automaton__KlassAssignment_1_in_rule__Automaton__Group__11313);
            rule__Automaton__KlassAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getKlassAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__2_in_rule__Automaton__Group__11322);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:655:1: rule__Automaton__Group__2 : ( '{' ) rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:659:1: ( ( '{' ) rule__Automaton__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:660:1: ( '{' ) rule__Automaton__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:660:1: ( '{' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:661:1: '{'
            {
             before(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Automaton__Group__21351); 
             after(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__3_in_rule__Automaton__Group__21361);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:675:1: rule__Automaton__Group__3 : ( 'initial' ) rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:679:1: ( ( 'initial' ) rule__Automaton__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:680:1: ( 'initial' ) rule__Automaton__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:680:1: ( 'initial' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:681:1: 'initial'
            {
             before(grammarAccess.getAutomatonAccess().getInitialKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Automaton__Group__31390); 
             after(grammarAccess.getAutomatonAccess().getInitialKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__4_in_rule__Automaton__Group__31400);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:695:1: rule__Automaton__Group__4 : ( '=' ) rule__Automaton__Group__5 ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:699:1: ( ( '=' ) rule__Automaton__Group__5 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:700:1: ( '=' ) rule__Automaton__Group__5
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:700:1: ( '=' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:701:1: '='
            {
             before(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Automaton__Group__41429); 
             after(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__5_in_rule__Automaton__Group__41439);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:715:1: rule__Automaton__Group__5 : ( ( rule__Automaton__InitialStateAssignment_5 ) ) rule__Automaton__Group__6 ;
    public final void rule__Automaton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:719:1: ( ( ( rule__Automaton__InitialStateAssignment_5 ) ) rule__Automaton__Group__6 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:720:1: ( ( rule__Automaton__InitialStateAssignment_5 ) ) rule__Automaton__Group__6
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:720:1: ( ( rule__Automaton__InitialStateAssignment_5 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:721:1: ( rule__Automaton__InitialStateAssignment_5 )
            {
             before(grammarAccess.getAutomatonAccess().getInitialStateAssignment_5()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:722:1: ( rule__Automaton__InitialStateAssignment_5 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:722:2: rule__Automaton__InitialStateAssignment_5
            {
            pushFollow(FOLLOW_rule__Automaton__InitialStateAssignment_5_in_rule__Automaton__Group__51467);
            rule__Automaton__InitialStateAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getInitialStateAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__6_in_rule__Automaton__Group__51476);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:733:1: rule__Automaton__Group__6 : ( ';' ) rule__Automaton__Group__7 ;
    public final void rule__Automaton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:737:1: ( ( ';' ) rule__Automaton__Group__7 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:738:1: ( ';' ) rule__Automaton__Group__7
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:738:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:739:1: ';'
            {
             before(grammarAccess.getAutomatonAccess().getSemicolonKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Automaton__Group__61505); 
             after(grammarAccess.getAutomatonAccess().getSemicolonKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__7_in_rule__Automaton__Group__61515);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:753:1: rule__Automaton__Group__7 : ( ( rule__Automaton__Group_7__0 )? ) rule__Automaton__Group__8 ;
    public final void rule__Automaton__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:757:1: ( ( ( rule__Automaton__Group_7__0 )? ) rule__Automaton__Group__8 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:758:1: ( ( rule__Automaton__Group_7__0 )? ) rule__Automaton__Group__8
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:758:1: ( ( rule__Automaton__Group_7__0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:759:1: ( rule__Automaton__Group_7__0 )?
            {
             before(grammarAccess.getAutomatonAccess().getGroup_7()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:760:1: ( rule__Automaton__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:760:2: rule__Automaton__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Automaton__Group_7__0_in_rule__Automaton__Group__71543);
                    rule__Automaton__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatonAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__8_in_rule__Automaton__Group__71553);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:771:1: rule__Automaton__Group__8 : ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) ) rule__Automaton__Group__9 ;
    public final void rule__Automaton__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:775:1: ( ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) ) rule__Automaton__Group__9 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:776:1: ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) ) rule__Automaton__Group__9
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:776:1: ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:777:1: ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:777:1: ( ( rule__Automaton__StatesAssignment_8 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:778:1: ( rule__Automaton__StatesAssignment_8 )
            {
             before(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:779:1: ( rule__Automaton__StatesAssignment_8 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:779:2: rule__Automaton__StatesAssignment_8
            {
            pushFollow(FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81583);
            rule__Automaton__StatesAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 

            }

            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:782:1: ( ( rule__Automaton__StatesAssignment_8 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:783:1: ( rule__Automaton__StatesAssignment_8 )*
            {
             before(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:784:1: ( rule__Automaton__StatesAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:784:2: rule__Automaton__StatesAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81595);
            	    rule__Automaton__StatesAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 

            }


            }

            pushFollow(FOLLOW_rule__Automaton__Group__9_in_rule__Automaton__Group__81607);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:796:1: rule__Automaton__Group__9 : ( '}' ) ;
    public final void rule__Automaton__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:800:1: ( ( '}' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:801:1: ( '}' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:801:1: ( '}' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:802:1: '}'
            {
             before(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_18_in_rule__Automaton__Group__91636); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:835:1: rule__Automaton__Group_7__0 : ( 'error' ) rule__Automaton__Group_7__1 ;
    public final void rule__Automaton__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:839:1: ( ( 'error' ) rule__Automaton__Group_7__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:840:1: ( 'error' ) rule__Automaton__Group_7__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:840:1: ( 'error' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:841:1: 'error'
            {
             before(grammarAccess.getAutomatonAccess().getErrorKeyword_7_0()); 
            match(input,19,FOLLOW_19_in_rule__Automaton__Group_7__01692); 
             after(grammarAccess.getAutomatonAccess().getErrorKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group_7__1_in_rule__Automaton__Group_7__01702);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:855:1: rule__Automaton__Group_7__1 : ( '=' ) rule__Automaton__Group_7__2 ;
    public final void rule__Automaton__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:859:1: ( ( '=' ) rule__Automaton__Group_7__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:860:1: ( '=' ) rule__Automaton__Group_7__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:860:1: ( '=' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:861:1: '='
            {
             before(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_7_1()); 
            match(input,17,FOLLOW_17_in_rule__Automaton__Group_7__11731); 
             after(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group_7__2_in_rule__Automaton__Group_7__11741);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:875:1: rule__Automaton__Group_7__2 : ( ( rule__Automaton__ErrorStateAssignment_7_2 ) ) rule__Automaton__Group_7__3 ;
    public final void rule__Automaton__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:879:1: ( ( ( rule__Automaton__ErrorStateAssignment_7_2 ) ) rule__Automaton__Group_7__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:880:1: ( ( rule__Automaton__ErrorStateAssignment_7_2 ) ) rule__Automaton__Group_7__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:880:1: ( ( rule__Automaton__ErrorStateAssignment_7_2 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:881:1: ( rule__Automaton__ErrorStateAssignment_7_2 )
            {
             before(grammarAccess.getAutomatonAccess().getErrorStateAssignment_7_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:882:1: ( rule__Automaton__ErrorStateAssignment_7_2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:882:2: rule__Automaton__ErrorStateAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Automaton__ErrorStateAssignment_7_2_in_rule__Automaton__Group_7__21769);
            rule__Automaton__ErrorStateAssignment_7_2();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getErrorStateAssignment_7_2()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group_7__3_in_rule__Automaton__Group_7__21778);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:893:1: rule__Automaton__Group_7__3 : ( ';' ) ;
    public final void rule__Automaton__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:897:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:898:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:898:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:899:1: ';'
            {
             before(grammarAccess.getAutomatonAccess().getSemicolonKeyword_7_3()); 
            match(input,13,FOLLOW_13_in_rule__Automaton__Group_7__31807); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:920:1: rule__State__Group__0 : ( 'state' ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:924:1: ( ( 'state' ) rule__State__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:925:1: ( 'state' ) rule__State__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:925:1: ( 'state' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:926:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__State__Group__01851); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__01861);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:940:1: rule__State__Group__1 : ( ( rule__State__NameAssignment_1 ) ) rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:944:1: ( ( ( rule__State__NameAssignment_1 ) ) rule__State__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:945:1: ( ( rule__State__NameAssignment_1 ) ) rule__State__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:945:1: ( ( rule__State__NameAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:946:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:947:1: ( rule__State__NameAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:947:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__11889);
            rule__State__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__11898);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:958:1: rule__State__Group__2 : ( '{' ) rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:962:1: ( ( '{' ) rule__State__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:963:1: ( '{' ) rule__State__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:963:1: ( '{' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:964:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__State__Group__21927); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__21937);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:978:1: rule__State__Group__3 : ( ( rule__State__TransitionsAssignment_3 )* ) rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:982:1: ( ( ( rule__State__TransitionsAssignment_3 )* ) rule__State__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:983:1: ( ( rule__State__TransitionsAssignment_3 )* ) rule__State__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:983:1: ( ( rule__State__TransitionsAssignment_3 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:984:1: ( rule__State__TransitionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:985:1: ( rule__State__TransitionsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:985:2: rule__State__TransitionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__State__TransitionsAssignment_3_in_rule__State__Group__31965);
            	    rule__State__TransitionsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__31975);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:996:1: rule__State__Group__4 : ( '}' ) ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1000:1: ( ( '}' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1001:1: ( '}' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1001:1: ( '}' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1002:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__State__Group__42004); 
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


    // $ANTLR start rule__InvocationTransition__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1025:1: rule__InvocationTransition__Group__0 : ( ( rule__InvocationTransition__InvocationAssignment_0 ) ) rule__InvocationTransition__Group__1 ;
    public final void rule__InvocationTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1029:1: ( ( ( rule__InvocationTransition__InvocationAssignment_0 ) ) rule__InvocationTransition__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1030:1: ( ( rule__InvocationTransition__InvocationAssignment_0 ) ) rule__InvocationTransition__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1030:1: ( ( rule__InvocationTransition__InvocationAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1031:1: ( rule__InvocationTransition__InvocationAssignment_0 )
            {
             before(grammarAccess.getInvocationTransitionAccess().getInvocationAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1032:1: ( rule__InvocationTransition__InvocationAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1032:2: rule__InvocationTransition__InvocationAssignment_0
            {
            pushFollow(FOLLOW_rule__InvocationTransition__InvocationAssignment_0_in_rule__InvocationTransition__Group__02049);
            rule__InvocationTransition__InvocationAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getInvocationTransitionAccess().getInvocationAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__InvocationTransition__Group__1_in_rule__InvocationTransition__Group__02058);
            rule__InvocationTransition__Group__1();
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
    // $ANTLR end rule__InvocationTransition__Group__0


    // $ANTLR start rule__InvocationTransition__Group__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1043:1: rule__InvocationTransition__Group__1 : ( '->' ) rule__InvocationTransition__Group__2 ;
    public final void rule__InvocationTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1047:1: ( ( '->' ) rule__InvocationTransition__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1048:1: ( '->' ) rule__InvocationTransition__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1048:1: ( '->' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1049:1: '->'
            {
             before(grammarAccess.getInvocationTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__InvocationTransition__Group__12087); 
             after(grammarAccess.getInvocationTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__InvocationTransition__Group__2_in_rule__InvocationTransition__Group__12097);
            rule__InvocationTransition__Group__2();
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
    // $ANTLR end rule__InvocationTransition__Group__1


    // $ANTLR start rule__InvocationTransition__Group__2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1063:1: rule__InvocationTransition__Group__2 : ( ( rule__InvocationTransition__StateAssignment_2 ) ) rule__InvocationTransition__Group__3 ;
    public final void rule__InvocationTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1067:1: ( ( ( rule__InvocationTransition__StateAssignment_2 ) ) rule__InvocationTransition__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1068:1: ( ( rule__InvocationTransition__StateAssignment_2 ) ) rule__InvocationTransition__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1068:1: ( ( rule__InvocationTransition__StateAssignment_2 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1069:1: ( rule__InvocationTransition__StateAssignment_2 )
            {
             before(grammarAccess.getInvocationTransitionAccess().getStateAssignment_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1070:1: ( rule__InvocationTransition__StateAssignment_2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1070:2: rule__InvocationTransition__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__InvocationTransition__StateAssignment_2_in_rule__InvocationTransition__Group__22125);
            rule__InvocationTransition__StateAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInvocationTransitionAccess().getStateAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__InvocationTransition__Group__3_in_rule__InvocationTransition__Group__22134);
            rule__InvocationTransition__Group__3();
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
    // $ANTLR end rule__InvocationTransition__Group__2


    // $ANTLR start rule__InvocationTransition__Group__3
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1081:1: rule__InvocationTransition__Group__3 : ( ';' ) ;
    public final void rule__InvocationTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1085:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1086:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1086:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1087:1: ';'
            {
             before(grammarAccess.getInvocationTransitionAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__InvocationTransition__Group__32163); 
             after(grammarAccess.getInvocationTransitionAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end rule__InvocationTransition__Group__3


    // $ANTLR start rule__BranchedTransition__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1108:1: rule__BranchedTransition__Group__0 : ( ( rule__BranchedTransition__InvocationAssignment_0 ) ) rule__BranchedTransition__Group__1 ;
    public final void rule__BranchedTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1112:1: ( ( ( rule__BranchedTransition__InvocationAssignment_0 ) ) rule__BranchedTransition__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1113:1: ( ( rule__BranchedTransition__InvocationAssignment_0 ) ) rule__BranchedTransition__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1113:1: ( ( rule__BranchedTransition__InvocationAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1114:1: ( rule__BranchedTransition__InvocationAssignment_0 )
            {
             before(grammarAccess.getBranchedTransitionAccess().getInvocationAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1115:1: ( rule__BranchedTransition__InvocationAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1115:2: rule__BranchedTransition__InvocationAssignment_0
            {
            pushFollow(FOLLOW_rule__BranchedTransition__InvocationAssignment_0_in_rule__BranchedTransition__Group__02206);
            rule__BranchedTransition__InvocationAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBranchedTransitionAccess().getInvocationAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BranchedTransition__Group__1_in_rule__BranchedTransition__Group__02215);
            rule__BranchedTransition__Group__1();
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
    // $ANTLR end rule__BranchedTransition__Group__0


    // $ANTLR start rule__BranchedTransition__Group__1
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1126:1: rule__BranchedTransition__Group__1 : ( 'returns' ) rule__BranchedTransition__Group__2 ;
    public final void rule__BranchedTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1130:1: ( ( 'returns' ) rule__BranchedTransition__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1131:1: ( 'returns' ) rule__BranchedTransition__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1131:1: ( 'returns' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1132:1: 'returns'
            {
             before(grammarAccess.getBranchedTransitionAccess().getReturnsKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__BranchedTransition__Group__12244); 
             after(grammarAccess.getBranchedTransitionAccess().getReturnsKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BranchedTransition__Group__2_in_rule__BranchedTransition__Group__12254);
            rule__BranchedTransition__Group__2();
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
    // $ANTLR end rule__BranchedTransition__Group__1


    // $ANTLR start rule__BranchedTransition__Group__2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1146:1: rule__BranchedTransition__Group__2 : ( ( rule__BranchedTransition__ValueAssignment_2 ) ) rule__BranchedTransition__Group__3 ;
    public final void rule__BranchedTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1150:1: ( ( ( rule__BranchedTransition__ValueAssignment_2 ) ) rule__BranchedTransition__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1151:1: ( ( rule__BranchedTransition__ValueAssignment_2 ) ) rule__BranchedTransition__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1151:1: ( ( rule__BranchedTransition__ValueAssignment_2 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1152:1: ( rule__BranchedTransition__ValueAssignment_2 )
            {
             before(grammarAccess.getBranchedTransitionAccess().getValueAssignment_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1153:1: ( rule__BranchedTransition__ValueAssignment_2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1153:2: rule__BranchedTransition__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__BranchedTransition__ValueAssignment_2_in_rule__BranchedTransition__Group__22282);
            rule__BranchedTransition__ValueAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBranchedTransitionAccess().getValueAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BranchedTransition__Group__3_in_rule__BranchedTransition__Group__22291);
            rule__BranchedTransition__Group__3();
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
    // $ANTLR end rule__BranchedTransition__Group__2


    // $ANTLR start rule__BranchedTransition__Group__3
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1164:1: rule__BranchedTransition__Group__3 : ( '->' ) rule__BranchedTransition__Group__4 ;
    public final void rule__BranchedTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1168:1: ( ( '->' ) rule__BranchedTransition__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1169:1: ( '->' ) rule__BranchedTransition__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1169:1: ( '->' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1170:1: '->'
            {
             before(grammarAccess.getBranchedTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__BranchedTransition__Group__32320); 
             after(grammarAccess.getBranchedTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__BranchedTransition__Group__4_in_rule__BranchedTransition__Group__32330);
            rule__BranchedTransition__Group__4();
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
    // $ANTLR end rule__BranchedTransition__Group__3


    // $ANTLR start rule__BranchedTransition__Group__4
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1184:1: rule__BranchedTransition__Group__4 : ( ( rule__BranchedTransition__StateAssignment_4 ) ) rule__BranchedTransition__Group__5 ;
    public final void rule__BranchedTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1188:1: ( ( ( rule__BranchedTransition__StateAssignment_4 ) ) rule__BranchedTransition__Group__5 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1189:1: ( ( rule__BranchedTransition__StateAssignment_4 ) ) rule__BranchedTransition__Group__5
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1189:1: ( ( rule__BranchedTransition__StateAssignment_4 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1190:1: ( rule__BranchedTransition__StateAssignment_4 )
            {
             before(grammarAccess.getBranchedTransitionAccess().getStateAssignment_4()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1191:1: ( rule__BranchedTransition__StateAssignment_4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1191:2: rule__BranchedTransition__StateAssignment_4
            {
            pushFollow(FOLLOW_rule__BranchedTransition__StateAssignment_4_in_rule__BranchedTransition__Group__42358);
            rule__BranchedTransition__StateAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getBranchedTransitionAccess().getStateAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__BranchedTransition__Group__5_in_rule__BranchedTransition__Group__42367);
            rule__BranchedTransition__Group__5();
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
    // $ANTLR end rule__BranchedTransition__Group__4


    // $ANTLR start rule__BranchedTransition__Group__5
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1202:1: rule__BranchedTransition__Group__5 : ( ';' ) ;
    public final void rule__BranchedTransition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1206:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1207:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1207:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1208:1: ';'
            {
             before(grammarAccess.getBranchedTransitionAccess().getSemicolonKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__BranchedTransition__Group__52396); 
             after(grammarAccess.getBranchedTransitionAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end rule__BranchedTransition__Group__5


    // $ANTLR start rule__Method__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1233:1: rule__Method__Group__0 : ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1237:1: ( ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1238:1: ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1238:1: ( ( rule__Method__ReturntypeAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1239:1: ( rule__Method__ReturntypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getReturntypeAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1240:1: ( rule__Method__ReturntypeAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1240:2: rule__Method__ReturntypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Method__ReturntypeAssignment_0_in_rule__Method__Group__02443);
            rule__Method__ReturntypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturntypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02452);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1251:1: rule__Method__Group__1 : ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1255:1: ( ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1256:1: ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1256:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1257:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1258:1: ( rule__Method__NameAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1258:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__12480);
            rule__Method__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12489);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1269:1: rule__Method__Group__2 : ( '(' ) rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1273:1: ( ( '(' ) rule__Method__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1274:1: ( '(' ) rule__Method__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1274:1: ( '(' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1275:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Method__Group__22518); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22528);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1289:1: rule__Method__Group__3 : ( ( rule__Method__Group_3__0 )? ) rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1293:1: ( ( ( rule__Method__Group_3__0 )? ) rule__Method__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1294:1: ( ( rule__Method__Group_3__0 )? ) rule__Method__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1294:1: ( ( rule__Method__Group_3__0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1295:1: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1296:1: ( rule__Method__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1296:2: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__32556);
                    rule__Method__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32566);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1307:1: rule__Method__Group__4 : ( ')' ) ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1311:1: ( ( ')' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1312:1: ( ')' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1312:1: ( ')' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1313:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Method__Group__42595); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1336:1: rule__Method__Group_3__0 : ( ( rule__Method__ArgsAssignment_3_0 ) ) rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1340:1: ( ( ( rule__Method__ArgsAssignment_3_0 ) ) rule__Method__Group_3__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1341:1: ( ( rule__Method__ArgsAssignment_3_0 ) ) rule__Method__Group_3__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1341:1: ( ( rule__Method__ArgsAssignment_3_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1342:1: ( rule__Method__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1343:1: ( rule__Method__ArgsAssignment_3_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1343:2: rule__Method__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Method__ArgsAssignment_3_0_in_rule__Method__Group_3__02640);
            rule__Method__ArgsAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getArgsAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__02649);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1354:1: rule__Method__Group_3__1 : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1358:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1359:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1359:1: ( ( rule__Method__Group_3_1__0 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1360:1: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1361:1: ( rule__Method__Group_3_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1361:2: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__12677);
            	    rule__Method__Group_3_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1375:1: rule__Method__Group_3_1__0 : ( ',' ) rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1379:1: ( ( ',' ) rule__Method__Group_3_1__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1380:1: ( ',' ) rule__Method__Group_3_1__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1380:1: ( ',' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1381:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Method__Group_3_1__02717); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__02727);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1395:1: rule__Method__Group_3_1__1 : ( ( rule__Method__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1399:1: ( ( ( rule__Method__ArgsAssignment_3_1_1 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1400:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1400:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1401:1: ( rule__Method__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_1_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1402:1: ( rule__Method__ArgsAssignment_3_1_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1402:2: rule__Method__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Method__ArgsAssignment_3_1_1_in_rule__Method__Group_3_1__12755);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1416:1: rule__Constructor__Group__0 : ( ( rule__Constructor__KlassAssignment_0 ) ) rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1420:1: ( ( ( rule__Constructor__KlassAssignment_0 ) ) rule__Constructor__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1421:1: ( ( rule__Constructor__KlassAssignment_0 ) ) rule__Constructor__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1421:1: ( ( rule__Constructor__KlassAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1422:1: ( rule__Constructor__KlassAssignment_0 )
            {
             before(grammarAccess.getConstructorAccess().getKlassAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1423:1: ( rule__Constructor__KlassAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1423:2: rule__Constructor__KlassAssignment_0
            {
            pushFollow(FOLLOW_rule__Constructor__KlassAssignment_0_in_rule__Constructor__Group__02793);
            rule__Constructor__KlassAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getConstructorAccess().getKlassAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02802);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1434:1: rule__Constructor__Group__1 : ( '(' ) rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1438:1: ( ( '(' ) rule__Constructor__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1439:1: ( '(' ) rule__Constructor__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1439:1: ( '(' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1440:1: '('
            {
             before(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Constructor__Group__12831); 
             after(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12841);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1454:1: rule__Constructor__Group__2 : ( ( rule__Constructor__Group_2__0 )? ) rule__Constructor__Group__3 ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1458:1: ( ( ( rule__Constructor__Group_2__0 )? ) rule__Constructor__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1459:1: ( ( rule__Constructor__Group_2__0 )? ) rule__Constructor__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1459:1: ( ( rule__Constructor__Group_2__0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1460:1: ( rule__Constructor__Group_2__0 )?
            {
             before(grammarAccess.getConstructorAccess().getGroup_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1461:1: ( rule__Constructor__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1461:2: rule__Constructor__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Constructor__Group_2__0_in_rule__Constructor__Group__22869);
                    rule__Constructor__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22879);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1472:1: rule__Constructor__Group__3 : ( ')' ) ;
    public final void rule__Constructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1476:1: ( ( ')' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1477:1: ( ')' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1477:1: ( ')' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1478:1: ')'
            {
             before(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Constructor__Group__32908); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1499:1: rule__Constructor__Group_2__0 : ( ( rule__Constructor__ArgsAssignment_2_0 ) ) rule__Constructor__Group_2__1 ;
    public final void rule__Constructor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1503:1: ( ( ( rule__Constructor__ArgsAssignment_2_0 ) ) rule__Constructor__Group_2__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1504:1: ( ( rule__Constructor__ArgsAssignment_2_0 ) ) rule__Constructor__Group_2__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1504:1: ( ( rule__Constructor__ArgsAssignment_2_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1505:1: ( rule__Constructor__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getConstructorAccess().getArgsAssignment_2_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1506:1: ( rule__Constructor__ArgsAssignment_2_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1506:2: rule__Constructor__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Constructor__ArgsAssignment_2_0_in_rule__Constructor__Group_2__02951);
            rule__Constructor__ArgsAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getConstructorAccess().getArgsAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group_2__1_in_rule__Constructor__Group_2__02960);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1517:1: rule__Constructor__Group_2__1 : ( ( rule__Constructor__Group_2_1__0 )* ) ;
    public final void rule__Constructor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1521:1: ( ( ( rule__Constructor__Group_2_1__0 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1522:1: ( ( rule__Constructor__Group_2_1__0 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1522:1: ( ( rule__Constructor__Group_2_1__0 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1523:1: ( rule__Constructor__Group_2_1__0 )*
            {
             before(grammarAccess.getConstructorAccess().getGroup_2_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1524:1: ( rule__Constructor__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1524:2: rule__Constructor__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor__Group_2_1__0_in_rule__Constructor__Group_2__12988);
            	    rule__Constructor__Group_2_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1538:1: rule__Constructor__Group_2_1__0 : ( ',' ) rule__Constructor__Group_2_1__1 ;
    public final void rule__Constructor__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1542:1: ( ( ',' ) rule__Constructor__Group_2_1__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1543:1: ( ',' ) rule__Constructor__Group_2_1__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1543:1: ( ',' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1544:1: ','
            {
             before(grammarAccess.getConstructorAccess().getCommaKeyword_2_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Constructor__Group_2_1__03028); 
             after(grammarAccess.getConstructorAccess().getCommaKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group_2_1__1_in_rule__Constructor__Group_2_1__03038);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1558:1: rule__Constructor__Group_2_1__1 : ( ( rule__Constructor__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Constructor__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1562:1: ( ( ( rule__Constructor__ArgsAssignment_2_1_1 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1563:1: ( ( rule__Constructor__ArgsAssignment_2_1_1 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1563:1: ( ( rule__Constructor__ArgsAssignment_2_1_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1564:1: ( rule__Constructor__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getConstructorAccess().getArgsAssignment_2_1_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1565:1: ( rule__Constructor__ArgsAssignment_2_1_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1565:2: rule__Constructor__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Constructor__ArgsAssignment_2_1_1_in_rule__Constructor__Group_2_1__13066);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1579:1: rule__JAVAID__Group__0 : ( RULE_ID ) rule__JAVAID__Group__1 ;
    public final void rule__JAVAID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1583:1: ( ( RULE_ID ) rule__JAVAID__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1584:1: ( RULE_ID ) rule__JAVAID__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1584:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1585:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group__03104); 
             after(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__03112);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1597:1: rule__JAVAID__Group__1 : ( ( rule__JAVAID__Group_1__0 )* ) ;
    public final void rule__JAVAID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1601:1: ( ( ( rule__JAVAID__Group_1__0 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1602:1: ( ( rule__JAVAID__Group_1__0 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1602:1: ( ( rule__JAVAID__Group_1__0 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1603:1: ( rule__JAVAID__Group_1__0 )*
            {
             before(grammarAccess.getJAVAIDAccess().getGroup_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1604:1: ( rule__JAVAID__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1604:2: rule__JAVAID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__13140);
            	    rule__JAVAID__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1618:1: rule__JAVAID__Group_1__0 : ( '.' ) rule__JAVAID__Group_1__1 ;
    public final void rule__JAVAID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1622:1: ( ( '.' ) rule__JAVAID__Group_1__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1623:1: ( '.' ) rule__JAVAID__Group_1__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1623:1: ( '.' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1624:1: '.'
            {
             before(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__JAVAID__Group_1__03180); 
             after(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__03190);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1638:1: rule__JAVAID__Group_1__1 : ( RULE_ID ) ;
    public final void rule__JAVAID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1642:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1643:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1643:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1644:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__13218); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1659:1: rule__Automata__PackageAssignment_0 : ( rulePackage ) ;
    public final void rule__Automata__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1663:1: ( ( rulePackage ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1664:1: ( rulePackage )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1664:1: ( rulePackage )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1665:1: rulePackage
            {
             before(grammarAccess.getAutomataAccess().getPackagePackageParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Automata__PackageAssignment_03255);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1674:1: rule__Automata__AutomataAssignment_1 : ( ruleAutomaton ) ;
    public final void rule__Automata__AutomataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1678:1: ( ( ruleAutomaton ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1679:1: ( ruleAutomaton )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1679:1: ( ruleAutomaton )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1680:1: ruleAutomaton
            {
             before(grammarAccess.getAutomataAccess().getAutomataAutomatonParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAutomaton_in_rule__Automata__AutomataAssignment_13286);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1689:1: rule__Package__NameAssignment_1 : ( ruleJAVAID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1693:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1694:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1694:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1695:1: ruleJAVAID
            {
             before(grammarAccess.getPackageAccess().getNameJAVAIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Package__NameAssignment_13317);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1704:1: rule__Automaton__KlassAssignment_1 : ( ruleClass ) ;
    public final void rule__Automaton__KlassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1708:1: ( ( ruleClass ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1709:1: ( ruleClass )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1709:1: ( ruleClass )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1710:1: ruleClass
            {
             before(grammarAccess.getAutomatonAccess().getKlassClassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__Automaton__KlassAssignment_13348);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1719:1: rule__Automaton__InitialStateAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Automaton__InitialStateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1723:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1724:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1724:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1725:1: ( RULE_ID )
            {
             before(grammarAccess.getAutomatonAccess().getInitialStateStateCrossReference_5_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1726:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1727:1: RULE_ID
            {
             before(grammarAccess.getAutomatonAccess().getInitialStateStateIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Automaton__InitialStateAssignment_53383); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1738:1: rule__Automaton__ErrorStateAssignment_7_2 : ( ( RULE_ID ) ) ;
    public final void rule__Automaton__ErrorStateAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1742:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1743:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1743:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1744:1: ( RULE_ID )
            {
             before(grammarAccess.getAutomatonAccess().getErrorStateStateCrossReference_7_2_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1745:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1746:1: RULE_ID
            {
             before(grammarAccess.getAutomatonAccess().getErrorStateStateIDTerminalRuleCall_7_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Automaton__ErrorStateAssignment_7_23422); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1757:1: rule__Automaton__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Automaton__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1761:1: ( ( ruleState ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1762:1: ( ruleState )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1762:1: ( ruleState )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1763:1: ruleState
            {
             before(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Automaton__StatesAssignment_83457);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1772:1: rule__Class__NameAssignment : ( ruleJAVAID ) ;
    public final void rule__Class__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1776:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1777:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1777:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1778:1: ruleJAVAID
            {
             before(grammarAccess.getClassAccess().getNameJAVAIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Class__NameAssignment3488);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1787:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1791:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1792:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1792:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1793:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_13519); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1802:1: rule__State__TransitionsAssignment_3 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1806:1: ( ( ruleTransition ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1807:1: ( ruleTransition )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1807:1: ( ruleTransition )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1808:1: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_33550);
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


    // $ANTLR start rule__InvocationTransition__InvocationAssignment_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1817:1: rule__InvocationTransition__InvocationAssignment_0 : ( ruleInvocation ) ;
    public final void rule__InvocationTransition__InvocationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1821:1: ( ( ruleInvocation ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1822:1: ( ruleInvocation )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1822:1: ( ruleInvocation )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1823:1: ruleInvocation
            {
             before(grammarAccess.getInvocationTransitionAccess().getInvocationInvocationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInvocation_in_rule__InvocationTransition__InvocationAssignment_03581);
            ruleInvocation();
            _fsp--;

             after(grammarAccess.getInvocationTransitionAccess().getInvocationInvocationParserRuleCall_0_0()); 

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
    // $ANTLR end rule__InvocationTransition__InvocationAssignment_0


    // $ANTLR start rule__InvocationTransition__StateAssignment_2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1832:1: rule__InvocationTransition__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__InvocationTransition__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1836:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1837:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1837:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1838:1: ( RULE_ID )
            {
             before(grammarAccess.getInvocationTransitionAccess().getStateStateCrossReference_2_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1839:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1840:1: RULE_ID
            {
             before(grammarAccess.getInvocationTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InvocationTransition__StateAssignment_23616); 
             after(grammarAccess.getInvocationTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getInvocationTransitionAccess().getStateStateCrossReference_2_0()); 

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
    // $ANTLR end rule__InvocationTransition__StateAssignment_2


    // $ANTLR start rule__BranchedTransition__InvocationAssignment_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1851:1: rule__BranchedTransition__InvocationAssignment_0 : ( ruleInvocation ) ;
    public final void rule__BranchedTransition__InvocationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1855:1: ( ( ruleInvocation ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1856:1: ( ruleInvocation )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1856:1: ( ruleInvocation )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1857:1: ruleInvocation
            {
             before(grammarAccess.getBranchedTransitionAccess().getInvocationInvocationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInvocation_in_rule__BranchedTransition__InvocationAssignment_03651);
            ruleInvocation();
            _fsp--;

             after(grammarAccess.getBranchedTransitionAccess().getInvocationInvocationParserRuleCall_0_0()); 

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
    // $ANTLR end rule__BranchedTransition__InvocationAssignment_0


    // $ANTLR start rule__BranchedTransition__ValueAssignment_2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1866:1: rule__BranchedTransition__ValueAssignment_2 : ( ruleBooleanLiteral ) ;
    public final void rule__BranchedTransition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1870:1: ( ( ruleBooleanLiteral ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1871:1: ( ruleBooleanLiteral )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1871:1: ( ruleBooleanLiteral )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1872:1: ruleBooleanLiteral
            {
             before(grammarAccess.getBranchedTransitionAccess().getValueBooleanLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__BranchedTransition__ValueAssignment_23682);
            ruleBooleanLiteral();
            _fsp--;

             after(grammarAccess.getBranchedTransitionAccess().getValueBooleanLiteralParserRuleCall_2_0()); 

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
    // $ANTLR end rule__BranchedTransition__ValueAssignment_2


    // $ANTLR start rule__BranchedTransition__StateAssignment_4
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1881:1: rule__BranchedTransition__StateAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__BranchedTransition__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1885:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1886:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1886:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1887:1: ( RULE_ID )
            {
             before(grammarAccess.getBranchedTransitionAccess().getStateStateCrossReference_4_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1888:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1889:1: RULE_ID
            {
             before(grammarAccess.getBranchedTransitionAccess().getStateStateIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BranchedTransition__StateAssignment_43717); 
             after(grammarAccess.getBranchedTransitionAccess().getStateStateIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBranchedTransitionAccess().getStateStateCrossReference_4_0()); 

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
    // $ANTLR end rule__BranchedTransition__StateAssignment_4


    // $ANTLR start rule__Method__ReturntypeAssignment_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1900:1: rule__Method__ReturntypeAssignment_0 : ( ruleType ) ;
    public final void rule__Method__ReturntypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1904:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1905:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1905:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1906:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getReturntypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ReturntypeAssignment_03752);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1915:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1919:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1920:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1920:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1921:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_13783); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1930:1: rule__Method__ArgsAssignment_3_0 : ( ruleType ) ;
    public final void rule__Method__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1934:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1935:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1935:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1936:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_03814);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1945:1: rule__Method__ArgsAssignment_3_1_1 : ( ruleType ) ;
    public final void rule__Method__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1949:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1950:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1950:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1951:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_1_13845);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1960:1: rule__Constructor__KlassAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Constructor__KlassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1964:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1965:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1965:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1966:1: ( RULE_ID )
            {
             before(grammarAccess.getConstructorAccess().getKlassClassCrossReference_0_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1967:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1968:1: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getKlassClassIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor__KlassAssignment_03880); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1979:1: rule__Constructor__ArgsAssignment_2_0 : ( ruleType ) ;
    public final void rule__Constructor__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1983:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1984:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1984:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1985:1: ruleType
            {
             before(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_2_03915);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1994:1: rule__Constructor__ArgsAssignment_2_1_1 : ( ruleType ) ;
    public final void rule__Constructor__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1998:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1999:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1999:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2000:1: ruleType
            {
             before(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_2_1_13946);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2009:1: rule__Type__NameAssignment : ( ruleJAVAID ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2013:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2014:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2014:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2015:1: ruleJAVAID
            {
             before(grammarAccess.getTypeAccess().getNameJAVAIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Type__NameAssignment3977);
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


    // $ANTLR start rule__BooleanLiteral__TrueAssignment_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2024:1: rule__BooleanLiteral__TrueAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__BooleanLiteral__TrueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2028:1: ( ( ( 'true' ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2029:1: ( ( 'true' ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2029:1: ( ( 'true' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2030:1: ( 'true' )
            {
             before(grammarAccess.getBooleanLiteralAccess().getTrueTrueKeyword_0_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2031:1: ( 'true' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2032:1: 'true'
            {
             before(grammarAccess.getBooleanLiteralAccess().getTrueTrueKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__BooleanLiteral__TrueAssignment_04013); 
             after(grammarAccess.getBooleanLiteralAccess().getTrueTrueKeyword_0_0()); 

            }

             after(grammarAccess.getBooleanLiteralAccess().getTrueTrueKeyword_0_0()); 

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
    // $ANTLR end rule__BooleanLiteral__TrueAssignment_0


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\31\uffff";
    static final String DFA1_eofS =
        "\31\uffff";
    static final String DFA1_minS =
        "\4\4\1\27\1\30\1\25\4\4\2\uffff\1\30\1\25\2\30\3\4\3\30\1\4\1\30";
    static final String DFA1_maxS =
        "\1\4\1\32\1\30\1\4\1\27\1\32\1\26\1\32\1\30\2\4\2\uffff\1\32\1\26"+
        "\2\32\3\4\3\32\1\4\1\32";
    static final String DFA1_acceptS =
        "\13\uffff\1\1\1\2\14\uffff";
    static final String DFA1_specialS =
        "\31\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\4\22\uffff\1\2\2\uffff\1\3",
            "\1\5\23\uffff\1\6",
            "\1\7",
            "\1\10",
            "\1\6\1\12\1\11",
            "\1\13\1\14",
            "\1\4\25\uffff\1\3",
            "\1\15\23\uffff\1\16",
            "\1\17",
            "\1\20",
            "",
            "",
            "\1\16\1\22\1\21",
            "\1\13\1\14",
            "\1\6\1\12\1\11",
            "\1\6\1\12\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\16\1\22\1\21",
            "\1\16\1\22\1\27",
            "\1\6\1\12\1\23",
            "\1\30",
            "\1\16\1\22\1\27"
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
            return "438:1: rule__Transition__Alternatives : ( ( ruleInvocationTransition ) | ( ruleBranchedTransition ) );";
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
    public static final BitSet FOLLOW_rule__Transition__Alternatives_in_ruleTransition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocationTransition_in_entryRuleInvocationTransition420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvocationTransition427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InvocationTransition__Group__0_in_ruleInvocationTransition454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranchedTransition_in_entryRuleBranchedTransition480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranchedTransition487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BranchedTransition__Group__0_in_ruleBranchedTransition514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocation_in_entryRuleInvocation540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvocation547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invocation__Alternatives_in_ruleInvocation574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__0_in_ruleConstructor694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_in_ruleType754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_entryRuleJAVAID780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJAVAID787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Alternatives_in_ruleBooleanLiteral874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocationTransition_in_rule__Transition__Alternatives910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranchedTransition_in_rule__Transition__Alternatives927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Invocation__Alternatives959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_rule__Invocation__Alternatives976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__TrueAssignment_0_in_rule__BooleanLiteral__Alternatives1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BooleanLiteral__Alternatives1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automata__PackageAssignment_0_in_rule__Automata__Group__01063 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Automata__Group__1_in_rule__Automata__Group__01073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__11103 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__11115 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12_in_rule__Package__Group__01157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__11195 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Package__Group__21233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Automaton__Group__01275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Automaton__Group__1_in_rule__Automaton__Group__01285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__KlassAssignment_1_in_rule__Automaton__Group__11313 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__2_in_rule__Automaton__Group__11322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Automaton__Group__21351 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__3_in_rule__Automaton__Group__21361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Automaton__Group__31390 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__4_in_rule__Automaton__Group__31400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Automaton__Group__41429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Automaton__Group__5_in_rule__Automaton__Group__41439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__InitialStateAssignment_5_in_rule__Automaton__Group__51467 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__6_in_rule__Automaton__Group__51476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Automaton__Group__61505 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__7_in_rule__Automaton__Group__61515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__0_in_rule__Automaton__Group__71543 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__8_in_rule__Automaton__Group__71553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81583 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81595 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__9_in_rule__Automaton__Group__81607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Automaton__Group__91636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Automaton__Group_7__01692 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__1_in_rule__Automaton__Group_7__01702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Automaton__Group_7__11731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__2_in_rule__Automaton__Group_7__11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__ErrorStateAssignment_7_2_in_rule__Automaton__Group_7__21769 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__3_in_rule__Automaton__Group_7__21778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Automaton__Group_7__31807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__State__Group__01851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__01861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__11889 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__11898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__State__Group__21927 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__21937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TransitionsAssignment_3_in_rule__State__Group__31965 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__31975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__State__Group__42004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InvocationTransition__InvocationAssignment_0_in_rule__InvocationTransition__Group__02049 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__InvocationTransition__Group__1_in_rule__InvocationTransition__Group__02058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__InvocationTransition__Group__12087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InvocationTransition__Group__2_in_rule__InvocationTransition__Group__12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InvocationTransition__StateAssignment_2_in_rule__InvocationTransition__Group__22125 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InvocationTransition__Group__3_in_rule__InvocationTransition__Group__22134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__InvocationTransition__Group__32163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BranchedTransition__InvocationAssignment_0_in_rule__BranchedTransition__Group__02206 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BranchedTransition__Group__1_in_rule__BranchedTransition__Group__02215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BranchedTransition__Group__12244 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_rule__BranchedTransition__Group__2_in_rule__BranchedTransition__Group__12254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BranchedTransition__ValueAssignment_2_in_rule__BranchedTransition__Group__22282 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BranchedTransition__Group__3_in_rule__BranchedTransition__Group__22291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BranchedTransition__Group__32320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BranchedTransition__Group__4_in_rule__BranchedTransition__Group__32330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BranchedTransition__StateAssignment_4_in_rule__BranchedTransition__Group__42358 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__BranchedTransition__Group__5_in_rule__BranchedTransition__Group__42367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BranchedTransition__Group__52396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ReturntypeAssignment_0_in_rule__Method__Group__02443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__12480 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Method__Group__22518 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__32556 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Method__Group__42595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ArgsAssignment_3_0_in_rule__Method__Group_3__02640 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__02649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__12677 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_rule__Method__Group_3_1__02717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__02727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ArgsAssignment_3_1_1_in_rule__Method__Group_3_1__12755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__KlassAssignment_0_in_rule__Constructor__Group__02793 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Constructor__Group__12831 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_2__0_in_rule__Constructor__Group__22869 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constructor__Group__32908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ArgsAssignment_2_0_in_rule__Constructor__Group_2__02951 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_2__1_in_rule__Constructor__Group_2__02960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_2_1__0_in_rule__Constructor__Group_2__12988 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_rule__Constructor__Group_2_1__03028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constructor__Group_2_1__1_in_rule__Constructor__Group_2_1__03038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ArgsAssignment_2_1_1_in_rule__Constructor__Group_2_1__13066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group__03104 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__03112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__13140 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_rule__JAVAID__Group_1__03180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__03190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__13218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Automata__PackageAssignment_03255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomaton_in_rule__Automata__AutomataAssignment_13286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Package__NameAssignment_13317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Automaton__KlassAssignment_13348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Automaton__InitialStateAssignment_53383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Automaton__ErrorStateAssignment_7_23422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Automaton__StatesAssignment_83457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Class__NameAssignment3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_13519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_33550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocation_in_rule__InvocationTransition__InvocationAssignment_03581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InvocationTransition__StateAssignment_23616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocation_in_rule__BranchedTransition__InvocationAssignment_03651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__BranchedTransition__ValueAssignment_23682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BranchedTransition__StateAssignment_43717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ReturntypeAssignment_03752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_13783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_03814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_1_13845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor__KlassAssignment_03880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_2_03915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_2_1_13946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Type__NameAssignment3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BooleanLiteral__TrueAssignment_04013 = new BitSet(new long[]{0x0000000000000002L});

}