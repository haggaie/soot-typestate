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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'package'", "';'", "'automaton'", "'{'", "'initial'", "'='", "'}'", "'error'", "'state'", "'->'", "'returns'", "'('", "')'", "','", "'.'"
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


    // $ANTLR start entryRuleTrue
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:438:1: entryRuleTrue : ruleTrue EOF ;
    public final void entryRuleTrue() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:438:15: ( ruleTrue EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:439:1: ruleTrue EOF
            {
             before(grammarAccess.getTrueRule()); 
            pushFollow(FOLLOW_ruleTrue_in_entryRuleTrue900);
            ruleTrue();
            _fsp--;

             after(grammarAccess.getTrueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrue907); 

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
    // $ANTLR end entryRuleTrue


    // $ANTLR start ruleTrue
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:446:1: ruleTrue : ( 'true' ) ;
    public final void ruleTrue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:450:2: ( ( 'true' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:451:1: ( 'true' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:451:1: ( 'true' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:452:1: 'true'
            {
             before(grammarAccess.getTrueAccess().getTrueKeyword()); 
            match(input,11,FOLLOW_11_in_ruleTrue935); 
             after(grammarAccess.getTrueAccess().getTrueKeyword()); 

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
    // $ANTLR end ruleTrue


    // $ANTLR start entryRuleFalse
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:467:1: entryRuleFalse : ruleFalse EOF ;
    public final void entryRuleFalse() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:467:16: ( ruleFalse EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:468:1: ruleFalse EOF
            {
             before(grammarAccess.getFalseRule()); 
            pushFollow(FOLLOW_ruleFalse_in_entryRuleFalse962);
            ruleFalse();
            _fsp--;

             after(grammarAccess.getFalseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFalse969); 

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
    // $ANTLR end entryRuleFalse


    // $ANTLR start ruleFalse
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:475:1: ruleFalse : ( 'false' ) ;
    public final void ruleFalse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:479:2: ( ( 'false' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:480:1: ( 'false' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:480:1: ( 'false' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:481:1: 'false'
            {
             before(grammarAccess.getFalseAccess().getFalseKeyword()); 
            match(input,12,FOLLOW_12_in_ruleFalse997); 
             after(grammarAccess.getFalseAccess().getFalseKeyword()); 

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
    // $ANTLR end ruleFalse


    // $ANTLR start rule__Transition__Alternatives
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:496:1: rule__Transition__Alternatives : ( ( ruleInvocationTransition ) | ( ruleBranchedTransition ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:500:1: ( ( ruleInvocationTransition ) | ( ruleBranchedTransition ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:501:1: ( ruleInvocationTransition )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:501:1: ( ruleInvocationTransition )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:502:1: ruleInvocationTransition
                    {
                     before(grammarAccess.getTransitionAccess().getInvocationTransitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInvocationTransition_in_rule__Transition__Alternatives1034);
                    ruleInvocationTransition();
                    _fsp--;

                     after(grammarAccess.getTransitionAccess().getInvocationTransitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:507:6: ( ruleBranchedTransition )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:507:6: ( ruleBranchedTransition )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:508:1: ruleBranchedTransition
                    {
                     before(grammarAccess.getTransitionAccess().getBranchedTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBranchedTransition_in_rule__Transition__Alternatives1051);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:518:1: rule__Invocation__Alternatives : ( ( ruleMethod ) | ( ruleConstructor ) );
    public final void rule__Invocation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:522:1: ( ( ruleMethod ) | ( ruleConstructor ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==24) ) {
                    alt2=2;
                }
                else if ( (LA2_1==RULE_ID||LA2_1==27) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("518:1: rule__Invocation__Alternatives : ( ( ruleMethod ) | ( ruleConstructor ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("518:1: rule__Invocation__Alternatives : ( ( ruleMethod ) | ( ruleConstructor ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:523:1: ( ruleMethod )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:523:1: ( ruleMethod )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:524:1: ruleMethod
                    {
                     before(grammarAccess.getInvocationAccess().getMethodParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMethod_in_rule__Invocation__Alternatives1083);
                    ruleMethod();
                    _fsp--;

                     after(grammarAccess.getInvocationAccess().getMethodParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:529:6: ( ruleConstructor )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:529:6: ( ruleConstructor )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:530:1: ruleConstructor
                    {
                     before(grammarAccess.getInvocationAccess().getConstructorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleConstructor_in_rule__Invocation__Alternatives1100);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:540:1: rule__BooleanLiteral__Alternatives : ( ( ruleTrue ) | ( ruleFalse ) );
    public final void rule__BooleanLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:544:1: ( ( ruleTrue ) | ( ruleFalse ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("540:1: rule__BooleanLiteral__Alternatives : ( ( ruleTrue ) | ( ruleFalse ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:545:1: ( ruleTrue )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:545:1: ( ruleTrue )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:546:1: ruleTrue
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getTrueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTrue_in_rule__BooleanLiteral__Alternatives1132);
                    ruleTrue();
                    _fsp--;

                     after(grammarAccess.getBooleanLiteralAccess().getTrueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:551:6: ( ruleFalse )
                    {
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:551:6: ( ruleFalse )
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:552:1: ruleFalse
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getFalseParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFalse_in_rule__BooleanLiteral__Alternatives1149);
                    ruleFalse();
                    _fsp--;

                     after(grammarAccess.getBooleanLiteralAccess().getFalseParserRuleCall_1()); 

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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:564:1: rule__Automata__Group__0 : ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1 ;
    public final void rule__Automata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:568:1: ( ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:569:1: ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:569:1: ( ( rule__Automata__PackageAssignment_0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:570:1: ( rule__Automata__PackageAssignment_0 )?
            {
             before(grammarAccess.getAutomataAccess().getPackageAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:571:1: ( rule__Automata__PackageAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:571:2: rule__Automata__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Automata__PackageAssignment_0_in_rule__Automata__Group__01183);
                    rule__Automata__PackageAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomataAccess().getPackageAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Automata__Group__1_in_rule__Automata__Group__01193);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:582:1: rule__Automata__Group__1 : ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) ) ;
    public final void rule__Automata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:586:1: ( ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:587:1: ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:587:1: ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:588:1: ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:588:1: ( ( rule__Automata__AutomataAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:589:1: ( rule__Automata__AutomataAssignment_1 )
            {
             before(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:590:1: ( rule__Automata__AutomataAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:590:2: rule__Automata__AutomataAssignment_1
            {
            pushFollow(FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__11223);
            rule__Automata__AutomataAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 

            }

            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:593:1: ( ( rule__Automata__AutomataAssignment_1 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:594:1: ( rule__Automata__AutomataAssignment_1 )*
            {
             before(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:595:1: ( rule__Automata__AutomataAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:595:2: rule__Automata__AutomataAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__11235);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:610:1: rule__Package__Group__0 : ( 'package' ) rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:614:1: ( ( 'package' ) rule__Package__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:615:1: ( 'package' ) rule__Package__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:615:1: ( 'package' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:616:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Package__Group__01277); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01287);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:630:1: rule__Package__Group__1 : ( ( rule__Package__NameAssignment_1 ) ) rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:634:1: ( ( ( rule__Package__NameAssignment_1 ) ) rule__Package__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:635:1: ( ( rule__Package__NameAssignment_1 ) ) rule__Package__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:635:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:636:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:637:1: ( rule__Package__NameAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:637:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__11315);
            rule__Package__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11324);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:648:1: rule__Package__Group__2 : ( ';' ) ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:652:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:653:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:653:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:654:1: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Package__Group__21353); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:673:1: rule__Automaton__Group__0 : ( 'automaton' ) rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:677:1: ( ( 'automaton' ) rule__Automaton__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:678:1: ( 'automaton' ) rule__Automaton__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:678:1: ( 'automaton' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:679:1: 'automaton'
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Automaton__Group__01395); 
             after(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__1_in_rule__Automaton__Group__01405);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:693:1: rule__Automaton__Group__1 : ( ( rule__Automaton__KlassAssignment_1 ) ) rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:697:1: ( ( ( rule__Automaton__KlassAssignment_1 ) ) rule__Automaton__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:698:1: ( ( rule__Automaton__KlassAssignment_1 ) ) rule__Automaton__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:698:1: ( ( rule__Automaton__KlassAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:699:1: ( rule__Automaton__KlassAssignment_1 )
            {
             before(grammarAccess.getAutomatonAccess().getKlassAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:700:1: ( rule__Automaton__KlassAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:700:2: rule__Automaton__KlassAssignment_1
            {
            pushFollow(FOLLOW_rule__Automaton__KlassAssignment_1_in_rule__Automaton__Group__11433);
            rule__Automaton__KlassAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getKlassAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__2_in_rule__Automaton__Group__11442);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:711:1: rule__Automaton__Group__2 : ( '{' ) rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:715:1: ( ( '{' ) rule__Automaton__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:716:1: ( '{' ) rule__Automaton__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:716:1: ( '{' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:717:1: '{'
            {
             before(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Automaton__Group__21471); 
             after(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__3_in_rule__Automaton__Group__21481);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:731:1: rule__Automaton__Group__3 : ( 'initial' ) rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:735:1: ( ( 'initial' ) rule__Automaton__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:736:1: ( 'initial' ) rule__Automaton__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:736:1: ( 'initial' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:737:1: 'initial'
            {
             before(grammarAccess.getAutomatonAccess().getInitialKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Automaton__Group__31510); 
             after(grammarAccess.getAutomatonAccess().getInitialKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__4_in_rule__Automaton__Group__31520);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:751:1: rule__Automaton__Group__4 : ( '=' ) rule__Automaton__Group__5 ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:755:1: ( ( '=' ) rule__Automaton__Group__5 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:756:1: ( '=' ) rule__Automaton__Group__5
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:756:1: ( '=' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:757:1: '='
            {
             before(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Automaton__Group__41549); 
             after(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__5_in_rule__Automaton__Group__41559);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:771:1: rule__Automaton__Group__5 : ( ( rule__Automaton__InitialStateAssignment_5 ) ) rule__Automaton__Group__6 ;
    public final void rule__Automaton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:775:1: ( ( ( rule__Automaton__InitialStateAssignment_5 ) ) rule__Automaton__Group__6 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:776:1: ( ( rule__Automaton__InitialStateAssignment_5 ) ) rule__Automaton__Group__6
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:776:1: ( ( rule__Automaton__InitialStateAssignment_5 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:777:1: ( rule__Automaton__InitialStateAssignment_5 )
            {
             before(grammarAccess.getAutomatonAccess().getInitialStateAssignment_5()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:778:1: ( rule__Automaton__InitialStateAssignment_5 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:778:2: rule__Automaton__InitialStateAssignment_5
            {
            pushFollow(FOLLOW_rule__Automaton__InitialStateAssignment_5_in_rule__Automaton__Group__51587);
            rule__Automaton__InitialStateAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getInitialStateAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__6_in_rule__Automaton__Group__51596);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:789:1: rule__Automaton__Group__6 : ( ';' ) rule__Automaton__Group__7 ;
    public final void rule__Automaton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:793:1: ( ( ';' ) rule__Automaton__Group__7 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:794:1: ( ';' ) rule__Automaton__Group__7
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:794:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:795:1: ';'
            {
             before(grammarAccess.getAutomatonAccess().getSemicolonKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Automaton__Group__61625); 
             after(grammarAccess.getAutomatonAccess().getSemicolonKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__7_in_rule__Automaton__Group__61635);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:809:1: rule__Automaton__Group__7 : ( ( rule__Automaton__Group_7__0 )? ) rule__Automaton__Group__8 ;
    public final void rule__Automaton__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:813:1: ( ( ( rule__Automaton__Group_7__0 )? ) rule__Automaton__Group__8 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:814:1: ( ( rule__Automaton__Group_7__0 )? ) rule__Automaton__Group__8
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:814:1: ( ( rule__Automaton__Group_7__0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:815:1: ( rule__Automaton__Group_7__0 )?
            {
             before(grammarAccess.getAutomatonAccess().getGroup_7()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:816:1: ( rule__Automaton__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:816:2: rule__Automaton__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Automaton__Group_7__0_in_rule__Automaton__Group__71663);
                    rule__Automaton__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatonAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__8_in_rule__Automaton__Group__71673);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:827:1: rule__Automaton__Group__8 : ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) ) rule__Automaton__Group__9 ;
    public final void rule__Automaton__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:831:1: ( ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) ) rule__Automaton__Group__9 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:832:1: ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) ) rule__Automaton__Group__9
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:832:1: ( ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:833:1: ( ( rule__Automaton__StatesAssignment_8 ) ) ( ( rule__Automaton__StatesAssignment_8 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:833:1: ( ( rule__Automaton__StatesAssignment_8 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:834:1: ( rule__Automaton__StatesAssignment_8 )
            {
             before(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:835:1: ( rule__Automaton__StatesAssignment_8 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:835:2: rule__Automaton__StatesAssignment_8
            {
            pushFollow(FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81703);
            rule__Automaton__StatesAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 

            }

            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:838:1: ( ( rule__Automaton__StatesAssignment_8 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:839:1: ( rule__Automaton__StatesAssignment_8 )*
            {
             before(grammarAccess.getAutomatonAccess().getStatesAssignment_8()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:840:1: ( rule__Automaton__StatesAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:840:2: rule__Automaton__StatesAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81715);
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

            pushFollow(FOLLOW_rule__Automaton__Group__9_in_rule__Automaton__Group__81727);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:852:1: rule__Automaton__Group__9 : ( '}' ) ;
    public final void rule__Automaton__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:856:1: ( ( '}' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:857:1: ( '}' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:857:1: ( '}' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:858:1: '}'
            {
             before(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_19_in_rule__Automaton__Group__91756); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:891:1: rule__Automaton__Group_7__0 : ( 'error' ) rule__Automaton__Group_7__1 ;
    public final void rule__Automaton__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:895:1: ( ( 'error' ) rule__Automaton__Group_7__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:896:1: ( 'error' ) rule__Automaton__Group_7__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:896:1: ( 'error' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:897:1: 'error'
            {
             before(grammarAccess.getAutomatonAccess().getErrorKeyword_7_0()); 
            match(input,20,FOLLOW_20_in_rule__Automaton__Group_7__01812); 
             after(grammarAccess.getAutomatonAccess().getErrorKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group_7__1_in_rule__Automaton__Group_7__01822);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:911:1: rule__Automaton__Group_7__1 : ( '=' ) rule__Automaton__Group_7__2 ;
    public final void rule__Automaton__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:915:1: ( ( '=' ) rule__Automaton__Group_7__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:916:1: ( '=' ) rule__Automaton__Group_7__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:916:1: ( '=' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:917:1: '='
            {
             before(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_7_1()); 
            match(input,18,FOLLOW_18_in_rule__Automaton__Group_7__11851); 
             after(grammarAccess.getAutomatonAccess().getEqualsSignKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group_7__2_in_rule__Automaton__Group_7__11861);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:931:1: rule__Automaton__Group_7__2 : ( ( rule__Automaton__ErrorStateAssignment_7_2 ) ) rule__Automaton__Group_7__3 ;
    public final void rule__Automaton__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:935:1: ( ( ( rule__Automaton__ErrorStateAssignment_7_2 ) ) rule__Automaton__Group_7__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:936:1: ( ( rule__Automaton__ErrorStateAssignment_7_2 ) ) rule__Automaton__Group_7__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:936:1: ( ( rule__Automaton__ErrorStateAssignment_7_2 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:937:1: ( rule__Automaton__ErrorStateAssignment_7_2 )
            {
             before(grammarAccess.getAutomatonAccess().getErrorStateAssignment_7_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:938:1: ( rule__Automaton__ErrorStateAssignment_7_2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:938:2: rule__Automaton__ErrorStateAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Automaton__ErrorStateAssignment_7_2_in_rule__Automaton__Group_7__21889);
            rule__Automaton__ErrorStateAssignment_7_2();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getErrorStateAssignment_7_2()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group_7__3_in_rule__Automaton__Group_7__21898);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:949:1: rule__Automaton__Group_7__3 : ( ';' ) ;
    public final void rule__Automaton__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:953:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:954:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:954:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:955:1: ';'
            {
             before(grammarAccess.getAutomatonAccess().getSemicolonKeyword_7_3()); 
            match(input,14,FOLLOW_14_in_rule__Automaton__Group_7__31927); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:976:1: rule__State__Group__0 : ( 'state' ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:980:1: ( ( 'state' ) rule__State__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:981:1: ( 'state' ) rule__State__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:981:1: ( 'state' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:982:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__State__Group__01971); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__01981);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:996:1: rule__State__Group__1 : ( ( rule__State__NameAssignment_1 ) ) rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1000:1: ( ( ( rule__State__NameAssignment_1 ) ) rule__State__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1001:1: ( ( rule__State__NameAssignment_1 ) ) rule__State__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1001:1: ( ( rule__State__NameAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1002:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1003:1: ( rule__State__NameAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1003:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__12009);
            rule__State__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__12018);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1014:1: rule__State__Group__2 : ( '{' ) rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1018:1: ( ( '{' ) rule__State__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1019:1: ( '{' ) rule__State__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1019:1: ( '{' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1020:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__State__Group__22047); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__22057);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1034:1: rule__State__Group__3 : ( ( rule__State__TransitionsAssignment_3 )* ) rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1038:1: ( ( ( rule__State__TransitionsAssignment_3 )* ) rule__State__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1039:1: ( ( rule__State__TransitionsAssignment_3 )* ) rule__State__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1039:1: ( ( rule__State__TransitionsAssignment_3 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1040:1: ( rule__State__TransitionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1041:1: ( rule__State__TransitionsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1041:2: rule__State__TransitionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__State__TransitionsAssignment_3_in_rule__State__Group__32085);
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

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__32095);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1052:1: rule__State__Group__4 : ( '}' ) ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1056:1: ( ( '}' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1057:1: ( '}' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1057:1: ( '}' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1058:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__State__Group__42124); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1081:1: rule__InvocationTransition__Group__0 : ( ( rule__InvocationTransition__InvocationAssignment_0 ) ) rule__InvocationTransition__Group__1 ;
    public final void rule__InvocationTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1085:1: ( ( ( rule__InvocationTransition__InvocationAssignment_0 ) ) rule__InvocationTransition__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1086:1: ( ( rule__InvocationTransition__InvocationAssignment_0 ) ) rule__InvocationTransition__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1086:1: ( ( rule__InvocationTransition__InvocationAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1087:1: ( rule__InvocationTransition__InvocationAssignment_0 )
            {
             before(grammarAccess.getInvocationTransitionAccess().getInvocationAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1088:1: ( rule__InvocationTransition__InvocationAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1088:2: rule__InvocationTransition__InvocationAssignment_0
            {
            pushFollow(FOLLOW_rule__InvocationTransition__InvocationAssignment_0_in_rule__InvocationTransition__Group__02169);
            rule__InvocationTransition__InvocationAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getInvocationTransitionAccess().getInvocationAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__InvocationTransition__Group__1_in_rule__InvocationTransition__Group__02178);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1099:1: rule__InvocationTransition__Group__1 : ( '->' ) rule__InvocationTransition__Group__2 ;
    public final void rule__InvocationTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1103:1: ( ( '->' ) rule__InvocationTransition__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1104:1: ( '->' ) rule__InvocationTransition__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1104:1: ( '->' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1105:1: '->'
            {
             before(grammarAccess.getInvocationTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__InvocationTransition__Group__12207); 
             after(grammarAccess.getInvocationTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__InvocationTransition__Group__2_in_rule__InvocationTransition__Group__12217);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1119:1: rule__InvocationTransition__Group__2 : ( ( rule__InvocationTransition__StateAssignment_2 ) ) rule__InvocationTransition__Group__3 ;
    public final void rule__InvocationTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1123:1: ( ( ( rule__InvocationTransition__StateAssignment_2 ) ) rule__InvocationTransition__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1124:1: ( ( rule__InvocationTransition__StateAssignment_2 ) ) rule__InvocationTransition__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1124:1: ( ( rule__InvocationTransition__StateAssignment_2 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1125:1: ( rule__InvocationTransition__StateAssignment_2 )
            {
             before(grammarAccess.getInvocationTransitionAccess().getStateAssignment_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1126:1: ( rule__InvocationTransition__StateAssignment_2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1126:2: rule__InvocationTransition__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__InvocationTransition__StateAssignment_2_in_rule__InvocationTransition__Group__22245);
            rule__InvocationTransition__StateAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInvocationTransitionAccess().getStateAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__InvocationTransition__Group__3_in_rule__InvocationTransition__Group__22254);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1137:1: rule__InvocationTransition__Group__3 : ( ';' ) ;
    public final void rule__InvocationTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1141:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1142:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1142:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1143:1: ';'
            {
             before(grammarAccess.getInvocationTransitionAccess().getSemicolonKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__InvocationTransition__Group__32283); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1164:1: rule__BranchedTransition__Group__0 : ( ( rule__BranchedTransition__InvocationAssignment_0 ) ) rule__BranchedTransition__Group__1 ;
    public final void rule__BranchedTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1168:1: ( ( ( rule__BranchedTransition__InvocationAssignment_0 ) ) rule__BranchedTransition__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1169:1: ( ( rule__BranchedTransition__InvocationAssignment_0 ) ) rule__BranchedTransition__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1169:1: ( ( rule__BranchedTransition__InvocationAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1170:1: ( rule__BranchedTransition__InvocationAssignment_0 )
            {
             before(grammarAccess.getBranchedTransitionAccess().getInvocationAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1171:1: ( rule__BranchedTransition__InvocationAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1171:2: rule__BranchedTransition__InvocationAssignment_0
            {
            pushFollow(FOLLOW_rule__BranchedTransition__InvocationAssignment_0_in_rule__BranchedTransition__Group__02326);
            rule__BranchedTransition__InvocationAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBranchedTransitionAccess().getInvocationAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BranchedTransition__Group__1_in_rule__BranchedTransition__Group__02335);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1182:1: rule__BranchedTransition__Group__1 : ( 'returns' ) rule__BranchedTransition__Group__2 ;
    public final void rule__BranchedTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1186:1: ( ( 'returns' ) rule__BranchedTransition__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1187:1: ( 'returns' ) rule__BranchedTransition__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1187:1: ( 'returns' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1188:1: 'returns'
            {
             before(grammarAccess.getBranchedTransitionAccess().getReturnsKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__BranchedTransition__Group__12364); 
             after(grammarAccess.getBranchedTransitionAccess().getReturnsKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BranchedTransition__Group__2_in_rule__BranchedTransition__Group__12374);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1202:1: rule__BranchedTransition__Group__2 : ( ( rule__BranchedTransition__ValueAssignment_2 ) ) rule__BranchedTransition__Group__3 ;
    public final void rule__BranchedTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1206:1: ( ( ( rule__BranchedTransition__ValueAssignment_2 ) ) rule__BranchedTransition__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1207:1: ( ( rule__BranchedTransition__ValueAssignment_2 ) ) rule__BranchedTransition__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1207:1: ( ( rule__BranchedTransition__ValueAssignment_2 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1208:1: ( rule__BranchedTransition__ValueAssignment_2 )
            {
             before(grammarAccess.getBranchedTransitionAccess().getValueAssignment_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1209:1: ( rule__BranchedTransition__ValueAssignment_2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1209:2: rule__BranchedTransition__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__BranchedTransition__ValueAssignment_2_in_rule__BranchedTransition__Group__22402);
            rule__BranchedTransition__ValueAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBranchedTransitionAccess().getValueAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BranchedTransition__Group__3_in_rule__BranchedTransition__Group__22411);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1220:1: rule__BranchedTransition__Group__3 : ( '->' ) rule__BranchedTransition__Group__4 ;
    public final void rule__BranchedTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1224:1: ( ( '->' ) rule__BranchedTransition__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1225:1: ( '->' ) rule__BranchedTransition__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1225:1: ( '->' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1226:1: '->'
            {
             before(grammarAccess.getBranchedTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__BranchedTransition__Group__32440); 
             after(grammarAccess.getBranchedTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__BranchedTransition__Group__4_in_rule__BranchedTransition__Group__32450);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1240:1: rule__BranchedTransition__Group__4 : ( ( rule__BranchedTransition__StateAssignment_4 ) ) rule__BranchedTransition__Group__5 ;
    public final void rule__BranchedTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1244:1: ( ( ( rule__BranchedTransition__StateAssignment_4 ) ) rule__BranchedTransition__Group__5 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1245:1: ( ( rule__BranchedTransition__StateAssignment_4 ) ) rule__BranchedTransition__Group__5
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1245:1: ( ( rule__BranchedTransition__StateAssignment_4 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1246:1: ( rule__BranchedTransition__StateAssignment_4 )
            {
             before(grammarAccess.getBranchedTransitionAccess().getStateAssignment_4()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1247:1: ( rule__BranchedTransition__StateAssignment_4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1247:2: rule__BranchedTransition__StateAssignment_4
            {
            pushFollow(FOLLOW_rule__BranchedTransition__StateAssignment_4_in_rule__BranchedTransition__Group__42478);
            rule__BranchedTransition__StateAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getBranchedTransitionAccess().getStateAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__BranchedTransition__Group__5_in_rule__BranchedTransition__Group__42487);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1258:1: rule__BranchedTransition__Group__5 : ( ';' ) ;
    public final void rule__BranchedTransition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1262:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1263:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1263:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1264:1: ';'
            {
             before(grammarAccess.getBranchedTransitionAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__BranchedTransition__Group__52516); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1289:1: rule__Method__Group__0 : ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1293:1: ( ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1294:1: ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1294:1: ( ( rule__Method__ReturntypeAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1295:1: ( rule__Method__ReturntypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getReturntypeAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1296:1: ( rule__Method__ReturntypeAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1296:2: rule__Method__ReturntypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Method__ReturntypeAssignment_0_in_rule__Method__Group__02563);
            rule__Method__ReturntypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturntypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02572);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1307:1: rule__Method__Group__1 : ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1311:1: ( ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1312:1: ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1312:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1313:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1314:1: ( rule__Method__NameAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1314:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__12600);
            rule__Method__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12609);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1325:1: rule__Method__Group__2 : ( '(' ) rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1329:1: ( ( '(' ) rule__Method__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1330:1: ( '(' ) rule__Method__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1330:1: ( '(' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1331:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Method__Group__22638); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22648);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1345:1: rule__Method__Group__3 : ( ( rule__Method__Group_3__0 )? ) rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1349:1: ( ( ( rule__Method__Group_3__0 )? ) rule__Method__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1350:1: ( ( rule__Method__Group_3__0 )? ) rule__Method__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1350:1: ( ( rule__Method__Group_3__0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1351:1: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1352:1: ( rule__Method__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1352:2: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__32676);
                    rule__Method__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32686);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1363:1: rule__Method__Group__4 : ( ')' ) ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1367:1: ( ( ')' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1368:1: ( ')' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1368:1: ( ')' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1369:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Method__Group__42715); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1392:1: rule__Method__Group_3__0 : ( ( rule__Method__ArgsAssignment_3_0 ) ) rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1396:1: ( ( ( rule__Method__ArgsAssignment_3_0 ) ) rule__Method__Group_3__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1397:1: ( ( rule__Method__ArgsAssignment_3_0 ) ) rule__Method__Group_3__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1397:1: ( ( rule__Method__ArgsAssignment_3_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1398:1: ( rule__Method__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1399:1: ( rule__Method__ArgsAssignment_3_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1399:2: rule__Method__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Method__ArgsAssignment_3_0_in_rule__Method__Group_3__02760);
            rule__Method__ArgsAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getArgsAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__02769);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1410:1: rule__Method__Group_3__1 : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1414:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1415:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1415:1: ( ( rule__Method__Group_3_1__0 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1416:1: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1417:1: ( rule__Method__Group_3_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1417:2: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__12797);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1431:1: rule__Method__Group_3_1__0 : ( ',' ) rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1435:1: ( ( ',' ) rule__Method__Group_3_1__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1436:1: ( ',' ) rule__Method__Group_3_1__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1436:1: ( ',' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1437:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Method__Group_3_1__02837); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__02847);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1451:1: rule__Method__Group_3_1__1 : ( ( rule__Method__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1455:1: ( ( ( rule__Method__ArgsAssignment_3_1_1 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1456:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1456:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1457:1: ( rule__Method__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_1_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1458:1: ( rule__Method__ArgsAssignment_3_1_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1458:2: rule__Method__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Method__ArgsAssignment_3_1_1_in_rule__Method__Group_3_1__12875);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1472:1: rule__Constructor__Group__0 : ( ( rule__Constructor__KlassAssignment_0 ) ) rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1476:1: ( ( ( rule__Constructor__KlassAssignment_0 ) ) rule__Constructor__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1477:1: ( ( rule__Constructor__KlassAssignment_0 ) ) rule__Constructor__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1477:1: ( ( rule__Constructor__KlassAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1478:1: ( rule__Constructor__KlassAssignment_0 )
            {
             before(grammarAccess.getConstructorAccess().getKlassAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1479:1: ( rule__Constructor__KlassAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1479:2: rule__Constructor__KlassAssignment_0
            {
            pushFollow(FOLLOW_rule__Constructor__KlassAssignment_0_in_rule__Constructor__Group__02913);
            rule__Constructor__KlassAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getConstructorAccess().getKlassAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02922);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1490:1: rule__Constructor__Group__1 : ( '(' ) rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1494:1: ( ( '(' ) rule__Constructor__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1495:1: ( '(' ) rule__Constructor__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1495:1: ( '(' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1496:1: '('
            {
             before(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Constructor__Group__12951); 
             after(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12961);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1510:1: rule__Constructor__Group__2 : ( ( rule__Constructor__Group_2__0 )? ) rule__Constructor__Group__3 ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1514:1: ( ( ( rule__Constructor__Group_2__0 )? ) rule__Constructor__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1515:1: ( ( rule__Constructor__Group_2__0 )? ) rule__Constructor__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1515:1: ( ( rule__Constructor__Group_2__0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1516:1: ( rule__Constructor__Group_2__0 )?
            {
             before(grammarAccess.getConstructorAccess().getGroup_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1517:1: ( rule__Constructor__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1517:2: rule__Constructor__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Constructor__Group_2__0_in_rule__Constructor__Group__22989);
                    rule__Constructor__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22999);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1528:1: rule__Constructor__Group__3 : ( ')' ) ;
    public final void rule__Constructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1532:1: ( ( ')' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1533:1: ( ')' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1533:1: ( ')' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1534:1: ')'
            {
             before(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Constructor__Group__33028); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1555:1: rule__Constructor__Group_2__0 : ( ( rule__Constructor__ArgsAssignment_2_0 ) ) rule__Constructor__Group_2__1 ;
    public final void rule__Constructor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1559:1: ( ( ( rule__Constructor__ArgsAssignment_2_0 ) ) rule__Constructor__Group_2__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1560:1: ( ( rule__Constructor__ArgsAssignment_2_0 ) ) rule__Constructor__Group_2__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1560:1: ( ( rule__Constructor__ArgsAssignment_2_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1561:1: ( rule__Constructor__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getConstructorAccess().getArgsAssignment_2_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1562:1: ( rule__Constructor__ArgsAssignment_2_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1562:2: rule__Constructor__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Constructor__ArgsAssignment_2_0_in_rule__Constructor__Group_2__03071);
            rule__Constructor__ArgsAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getConstructorAccess().getArgsAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group_2__1_in_rule__Constructor__Group_2__03080);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1573:1: rule__Constructor__Group_2__1 : ( ( rule__Constructor__Group_2_1__0 )* ) ;
    public final void rule__Constructor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1577:1: ( ( ( rule__Constructor__Group_2_1__0 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1578:1: ( ( rule__Constructor__Group_2_1__0 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1578:1: ( ( rule__Constructor__Group_2_1__0 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1579:1: ( rule__Constructor__Group_2_1__0 )*
            {
             before(grammarAccess.getConstructorAccess().getGroup_2_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1580:1: ( rule__Constructor__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1580:2: rule__Constructor__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor__Group_2_1__0_in_rule__Constructor__Group_2__13108);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1594:1: rule__Constructor__Group_2_1__0 : ( ',' ) rule__Constructor__Group_2_1__1 ;
    public final void rule__Constructor__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1598:1: ( ( ',' ) rule__Constructor__Group_2_1__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1599:1: ( ',' ) rule__Constructor__Group_2_1__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1599:1: ( ',' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1600:1: ','
            {
             before(grammarAccess.getConstructorAccess().getCommaKeyword_2_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Constructor__Group_2_1__03148); 
             after(grammarAccess.getConstructorAccess().getCommaKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Constructor__Group_2_1__1_in_rule__Constructor__Group_2_1__03158);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1614:1: rule__Constructor__Group_2_1__1 : ( ( rule__Constructor__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Constructor__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1618:1: ( ( ( rule__Constructor__ArgsAssignment_2_1_1 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1619:1: ( ( rule__Constructor__ArgsAssignment_2_1_1 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1619:1: ( ( rule__Constructor__ArgsAssignment_2_1_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1620:1: ( rule__Constructor__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getConstructorAccess().getArgsAssignment_2_1_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1621:1: ( rule__Constructor__ArgsAssignment_2_1_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1621:2: rule__Constructor__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Constructor__ArgsAssignment_2_1_1_in_rule__Constructor__Group_2_1__13186);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1635:1: rule__JAVAID__Group__0 : ( RULE_ID ) rule__JAVAID__Group__1 ;
    public final void rule__JAVAID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1639:1: ( ( RULE_ID ) rule__JAVAID__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1640:1: ( RULE_ID ) rule__JAVAID__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1640:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1641:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group__03224); 
             after(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__03232);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1653:1: rule__JAVAID__Group__1 : ( ( rule__JAVAID__Group_1__0 )* ) ;
    public final void rule__JAVAID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1657:1: ( ( ( rule__JAVAID__Group_1__0 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1658:1: ( ( rule__JAVAID__Group_1__0 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1658:1: ( ( rule__JAVAID__Group_1__0 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1659:1: ( rule__JAVAID__Group_1__0 )*
            {
             before(grammarAccess.getJAVAIDAccess().getGroup_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1660:1: ( rule__JAVAID__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1660:2: rule__JAVAID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__13260);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1674:1: rule__JAVAID__Group_1__0 : ( '.' ) rule__JAVAID__Group_1__1 ;
    public final void rule__JAVAID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1678:1: ( ( '.' ) rule__JAVAID__Group_1__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1679:1: ( '.' ) rule__JAVAID__Group_1__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1679:1: ( '.' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1680:1: '.'
            {
             before(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__JAVAID__Group_1__03300); 
             after(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__03310);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1694:1: rule__JAVAID__Group_1__1 : ( RULE_ID ) ;
    public final void rule__JAVAID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1698:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1699:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1699:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1700:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__13338); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1715:1: rule__Automata__PackageAssignment_0 : ( rulePackage ) ;
    public final void rule__Automata__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1719:1: ( ( rulePackage ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1720:1: ( rulePackage )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1720:1: ( rulePackage )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1721:1: rulePackage
            {
             before(grammarAccess.getAutomataAccess().getPackagePackageParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Automata__PackageAssignment_03375);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1730:1: rule__Automata__AutomataAssignment_1 : ( ruleAutomaton ) ;
    public final void rule__Automata__AutomataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1734:1: ( ( ruleAutomaton ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1735:1: ( ruleAutomaton )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1735:1: ( ruleAutomaton )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1736:1: ruleAutomaton
            {
             before(grammarAccess.getAutomataAccess().getAutomataAutomatonParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAutomaton_in_rule__Automata__AutomataAssignment_13406);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1745:1: rule__Package__NameAssignment_1 : ( ruleJAVAID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1749:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1750:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1750:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1751:1: ruleJAVAID
            {
             before(grammarAccess.getPackageAccess().getNameJAVAIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Package__NameAssignment_13437);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1760:1: rule__Automaton__KlassAssignment_1 : ( ruleClass ) ;
    public final void rule__Automaton__KlassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1764:1: ( ( ruleClass ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1765:1: ( ruleClass )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1765:1: ( ruleClass )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1766:1: ruleClass
            {
             before(grammarAccess.getAutomatonAccess().getKlassClassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__Automaton__KlassAssignment_13468);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1775:1: rule__Automaton__InitialStateAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Automaton__InitialStateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1779:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1780:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1780:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1781:1: ( RULE_ID )
            {
             before(grammarAccess.getAutomatonAccess().getInitialStateStateCrossReference_5_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1782:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1783:1: RULE_ID
            {
             before(grammarAccess.getAutomatonAccess().getInitialStateStateIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Automaton__InitialStateAssignment_53503); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1794:1: rule__Automaton__ErrorStateAssignment_7_2 : ( ( RULE_ID ) ) ;
    public final void rule__Automaton__ErrorStateAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1798:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1799:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1799:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1800:1: ( RULE_ID )
            {
             before(grammarAccess.getAutomatonAccess().getErrorStateStateCrossReference_7_2_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1801:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1802:1: RULE_ID
            {
             before(grammarAccess.getAutomatonAccess().getErrorStateStateIDTerminalRuleCall_7_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Automaton__ErrorStateAssignment_7_23542); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1813:1: rule__Automaton__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Automaton__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1817:1: ( ( ruleState ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1818:1: ( ruleState )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1818:1: ( ruleState )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1819:1: ruleState
            {
             before(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Automaton__StatesAssignment_83577);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1828:1: rule__Class__NameAssignment : ( ruleJAVAID ) ;
    public final void rule__Class__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1832:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1833:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1833:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1834:1: ruleJAVAID
            {
             before(grammarAccess.getClassAccess().getNameJAVAIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Class__NameAssignment3608);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1843:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1847:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1848:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1848:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1849:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_13639); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1858:1: rule__State__TransitionsAssignment_3 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1862:1: ( ( ruleTransition ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1863:1: ( ruleTransition )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1863:1: ( ruleTransition )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1864:1: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_33670);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1873:1: rule__InvocationTransition__InvocationAssignment_0 : ( ruleInvocation ) ;
    public final void rule__InvocationTransition__InvocationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1877:1: ( ( ruleInvocation ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1878:1: ( ruleInvocation )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1878:1: ( ruleInvocation )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1879:1: ruleInvocation
            {
             before(grammarAccess.getInvocationTransitionAccess().getInvocationInvocationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInvocation_in_rule__InvocationTransition__InvocationAssignment_03701);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1888:1: rule__InvocationTransition__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__InvocationTransition__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1892:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1893:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1893:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1894:1: ( RULE_ID )
            {
             before(grammarAccess.getInvocationTransitionAccess().getStateStateCrossReference_2_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1895:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1896:1: RULE_ID
            {
             before(grammarAccess.getInvocationTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InvocationTransition__StateAssignment_23736); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1907:1: rule__BranchedTransition__InvocationAssignment_0 : ( ruleInvocation ) ;
    public final void rule__BranchedTransition__InvocationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1911:1: ( ( ruleInvocation ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1912:1: ( ruleInvocation )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1912:1: ( ruleInvocation )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1913:1: ruleInvocation
            {
             before(grammarAccess.getBranchedTransitionAccess().getInvocationInvocationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInvocation_in_rule__BranchedTransition__InvocationAssignment_03771);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1922:1: rule__BranchedTransition__ValueAssignment_2 : ( ruleBooleanLiteral ) ;
    public final void rule__BranchedTransition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1926:1: ( ( ruleBooleanLiteral ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1927:1: ( ruleBooleanLiteral )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1927:1: ( ruleBooleanLiteral )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1928:1: ruleBooleanLiteral
            {
             before(grammarAccess.getBranchedTransitionAccess().getValueBooleanLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__BranchedTransition__ValueAssignment_23802);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1937:1: rule__BranchedTransition__StateAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__BranchedTransition__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1941:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1942:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1942:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1943:1: ( RULE_ID )
            {
             before(grammarAccess.getBranchedTransitionAccess().getStateStateCrossReference_4_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1944:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1945:1: RULE_ID
            {
             before(grammarAccess.getBranchedTransitionAccess().getStateStateIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BranchedTransition__StateAssignment_43837); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1956:1: rule__Method__ReturntypeAssignment_0 : ( ruleType ) ;
    public final void rule__Method__ReturntypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1960:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1961:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1961:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1962:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getReturntypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ReturntypeAssignment_03872);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1971:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1975:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1976:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1976:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1977:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_13903); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1986:1: rule__Method__ArgsAssignment_3_0 : ( ruleType ) ;
    public final void rule__Method__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1990:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1991:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1991:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1992:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_03934);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2001:1: rule__Method__ArgsAssignment_3_1_1 : ( ruleType ) ;
    public final void rule__Method__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2005:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2006:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2006:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2007:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_1_13965);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2016:1: rule__Constructor__KlassAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Constructor__KlassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2020:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2021:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2021:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2022:1: ( RULE_ID )
            {
             before(grammarAccess.getConstructorAccess().getKlassClassCrossReference_0_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2023:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2024:1: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getKlassClassIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor__KlassAssignment_04000); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2035:1: rule__Constructor__ArgsAssignment_2_0 : ( ruleType ) ;
    public final void rule__Constructor__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2039:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2040:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2040:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2041:1: ruleType
            {
             before(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_2_04035);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2050:1: rule__Constructor__ArgsAssignment_2_1_1 : ( ruleType ) ;
    public final void rule__Constructor__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2054:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2055:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2055:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2056:1: ruleType
            {
             before(grammarAccess.getConstructorAccess().getArgsTypeParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_2_1_14066);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2065:1: rule__Type__NameAssignment : ( ruleJAVAID ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2069:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2070:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2070:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:2071:1: ruleJAVAID
            {
             before(grammarAccess.getTypeAccess().getNameJAVAIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Type__NameAssignment4097);
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
        "\31\uffff";
    static final String DFA1_eofS =
        "\31\uffff";
    static final String DFA1_minS =
        "\3\4\1\30\3\4\1\31\1\26\1\31\1\26\2\4\2\uffff\2\4\4\31\2\4\2\31";
    static final String DFA1_maxS =
        "\1\4\1\33\1\4\1\30\1\31\1\33\1\31\1\33\1\27\1\33\1\27\2\4\2\uffff"+
        "\2\4\4\33\2\4\2\33";
    static final String DFA1_acceptS =
        "\15\uffff\1\2\1\1\12\uffff";
    static final String DFA1_specialS =
        "\31\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\3\23\uffff\1\4\2\uffff\1\2",
            "\1\5",
            "\1\6",
            "\1\7\24\uffff\1\10",
            "\1\3\26\uffff\1\2",
            "\1\11\24\uffff\1\12",
            "\1\10\1\14\1\13",
            "\1\16\1\15",
            "\1\12\1\20\1\17",
            "\1\16\1\15",
            "\1\21",
            "\1\22",
            "",
            "",
            "\1\23",
            "\1\24",
            "\1\10\1\14\1\13",
            "\1\10\1\14\1\25",
            "\1\12\1\20\1\17",
            "\1\12\1\20\1\26",
            "\1\27",
            "\1\30",
            "\1\10\1\14\1\25",
            "\1\12\1\20\1\26"
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
            return "496:1: rule__Transition__Alternatives : ( ( ruleInvocationTransition ) | ( ruleBranchedTransition ) );";
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
    public static final BitSet FOLLOW_ruleTrue_in_entryRuleTrue900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrue907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTrue935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFalse_in_entryRuleFalse962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFalse969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleFalse997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocationTransition_in_rule__Transition__Alternatives1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranchedTransition_in_rule__Transition__Alternatives1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Invocation__Alternatives1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_rule__Invocation__Alternatives1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrue_in_rule__BooleanLiteral__Alternatives1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFalse_in_rule__BooleanLiteral__Alternatives1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automata__PackageAssignment_0_in_rule__Automata__Group__01183 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Automata__Group__1_in_rule__Automata__Group__01193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__11223 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__11235 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_13_in_rule__Package__Group__01277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__11315 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Package__Group__21353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Automaton__Group__01395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Automaton__Group__1_in_rule__Automaton__Group__01405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__KlassAssignment_1_in_rule__Automaton__Group__11433 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__2_in_rule__Automaton__Group__11442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Automaton__Group__21471 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__3_in_rule__Automaton__Group__21481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Automaton__Group__31510 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__4_in_rule__Automaton__Group__31520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Automaton__Group__41549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Automaton__Group__5_in_rule__Automaton__Group__41559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__InitialStateAssignment_5_in_rule__Automaton__Group__51587 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__6_in_rule__Automaton__Group__51596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Automaton__Group__61625 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__7_in_rule__Automaton__Group__61635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__0_in_rule__Automaton__Group__71663 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__8_in_rule__Automaton__Group__71673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81703 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Automaton__StatesAssignment_8_in_rule__Automaton__Group__81715 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__9_in_rule__Automaton__Group__81727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Automaton__Group__91756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Automaton__Group_7__01812 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__1_in_rule__Automaton__Group_7__01822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Automaton__Group_7__11851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__2_in_rule__Automaton__Group_7__11861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__ErrorStateAssignment_7_2_in_rule__Automaton__Group_7__21889 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Automaton__Group_7__3_in_rule__Automaton__Group_7__21898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Automaton__Group_7__31927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__Group__01971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__01981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__12009 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__12018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__Group__22047 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__22057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TransitionsAssignment_3_in_rule__State__Group__32085 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__32095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__State__Group__42124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InvocationTransition__InvocationAssignment_0_in_rule__InvocationTransition__Group__02169 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__InvocationTransition__Group__1_in_rule__InvocationTransition__Group__02178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__InvocationTransition__Group__12207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InvocationTransition__Group__2_in_rule__InvocationTransition__Group__12217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InvocationTransition__StateAssignment_2_in_rule__InvocationTransition__Group__22245 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__InvocationTransition__Group__3_in_rule__InvocationTransition__Group__22254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__InvocationTransition__Group__32283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BranchedTransition__InvocationAssignment_0_in_rule__BranchedTransition__Group__02326 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BranchedTransition__Group__1_in_rule__BranchedTransition__Group__02335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BranchedTransition__Group__12364 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__BranchedTransition__Group__2_in_rule__BranchedTransition__Group__12374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BranchedTransition__ValueAssignment_2_in_rule__BranchedTransition__Group__22402 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BranchedTransition__Group__3_in_rule__BranchedTransition__Group__22411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BranchedTransition__Group__32440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BranchedTransition__Group__4_in_rule__BranchedTransition__Group__32450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BranchedTransition__StateAssignment_4_in_rule__BranchedTransition__Group__42478 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__BranchedTransition__Group__5_in_rule__BranchedTransition__Group__42487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BranchedTransition__Group__52516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ReturntypeAssignment_0_in_rule__Method__Group__02563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__12600 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Method__Group__22638 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__32676 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Method__Group__42715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ArgsAssignment_3_0_in_rule__Method__Group_3__02760 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__02769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__12797 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_rule__Method__Group_3_1__02837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__02847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ArgsAssignment_3_1_1_in_rule__Method__Group_3_1__12875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__KlassAssignment_0_in_rule__Constructor__Group__02913 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constructor__Group__12951 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_2__0_in_rule__Constructor__Group__22989 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Constructor__Group__33028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ArgsAssignment_2_0_in_rule__Constructor__Group_2__03071 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_2__1_in_rule__Constructor__Group_2__03080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_2_1__0_in_rule__Constructor__Group_2__13108 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_rule__Constructor__Group_2_1__03148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constructor__Group_2_1__1_in_rule__Constructor__Group_2_1__03158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ArgsAssignment_2_1_1_in_rule__Constructor__Group_2_1__13186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group__03224 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__03232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__13260 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rule__JAVAID__Group_1__03300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__03310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__13338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Automata__PackageAssignment_03375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomaton_in_rule__Automata__AutomataAssignment_13406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Package__NameAssignment_13437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Automaton__KlassAssignment_13468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Automaton__InitialStateAssignment_53503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Automaton__ErrorStateAssignment_7_23542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Automaton__StatesAssignment_83577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Class__NameAssignment3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_13639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_33670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocation_in_rule__InvocationTransition__InvocationAssignment_03701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InvocationTransition__StateAssignment_23736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocation_in_rule__BranchedTransition__InvocationAssignment_03771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__BranchedTransition__ValueAssignment_23802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BranchedTransition__StateAssignment_43837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ReturntypeAssignment_03872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_13903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_03934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ArgsAssignment_3_1_13965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor__KlassAssignment_04000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_2_04035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Constructor__ArgsAssignment_2_1_14066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Type__NameAssignment4097 = new BitSet(new long[]{0x0000000000000002L});

}