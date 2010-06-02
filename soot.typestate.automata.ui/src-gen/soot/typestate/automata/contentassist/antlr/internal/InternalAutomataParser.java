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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'automaton'", "'{'", "'}'", "'state'", "'->'", "'('", "')'", "'.'", "'initial'"
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


    // $ANTLR start entryRuleType
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:249:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:249:15: ( ruleType EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:250:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType480);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType487); 

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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:257:1: ruleType : ( ( rule__Type__NameAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:261:2: ( ( ( rule__Type__NameAssignment ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:262:1: ( ( rule__Type__NameAssignment ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:262:1: ( ( rule__Type__NameAssignment ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:263:1: ( rule__Type__NameAssignment )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:264:1: ( rule__Type__NameAssignment )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:264:2: rule__Type__NameAssignment
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_in_ruleType514);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:276:1: entryRuleJAVAID : ruleJAVAID EOF ;
    public final void entryRuleJAVAID() throws RecognitionException {
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:276:17: ( ruleJAVAID EOF )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:277:1: ruleJAVAID EOF
            {
             before(grammarAccess.getJAVAIDRule()); 
            pushFollow(FOLLOW_ruleJAVAID_in_entryRuleJAVAID540);
            ruleJAVAID();
            _fsp--;

             after(grammarAccess.getJAVAIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJAVAID547); 

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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:284:1: ruleJAVAID : ( ( rule__JAVAID__Group__0 ) ) ;
    public final void ruleJAVAID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:288:2: ( ( ( rule__JAVAID__Group__0 ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:289:1: ( ( rule__JAVAID__Group__0 ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:289:1: ( ( rule__JAVAID__Group__0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:290:1: ( rule__JAVAID__Group__0 )
            {
             before(grammarAccess.getJAVAIDAccess().getGroup()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:291:1: ( rule__JAVAID__Group__0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:291:2: rule__JAVAID__Group__0
            {
            pushFollow(FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID574);
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


    // $ANTLR start rule__Automata__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:305:1: rule__Automata__Group__0 : ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1 ;
    public final void rule__Automata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:309:1: ( ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:310:1: ( ( rule__Automata__PackageAssignment_0 )? ) rule__Automata__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:310:1: ( ( rule__Automata__PackageAssignment_0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:311:1: ( rule__Automata__PackageAssignment_0 )?
            {
             before(grammarAccess.getAutomataAccess().getPackageAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:312:1: ( rule__Automata__PackageAssignment_0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:312:2: rule__Automata__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Automata__PackageAssignment_0_in_rule__Automata__Group__0612);
                    rule__Automata__PackageAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomataAccess().getPackageAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Automata__Group__1_in_rule__Automata__Group__0622);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:323:1: rule__Automata__Group__1 : ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) ) ;
    public final void rule__Automata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:327:1: ( ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:328:1: ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:328:1: ( ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:329:1: ( ( rule__Automata__AutomataAssignment_1 ) ) ( ( rule__Automata__AutomataAssignment_1 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:329:1: ( ( rule__Automata__AutomataAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:330:1: ( rule__Automata__AutomataAssignment_1 )
            {
             before(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:331:1: ( rule__Automata__AutomataAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:331:2: rule__Automata__AutomataAssignment_1
            {
            pushFollow(FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__1652);
            rule__Automata__AutomataAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 

            }

            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:334:1: ( ( rule__Automata__AutomataAssignment_1 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:335:1: ( rule__Automata__AutomataAssignment_1 )*
            {
             before(grammarAccess.getAutomataAccess().getAutomataAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:336:1: ( rule__Automata__AutomataAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:336:2: rule__Automata__AutomataAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__1664);
            	    rule__Automata__AutomataAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:351:1: rule__Package__Group__0 : ( 'package' ) rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:355:1: ( ( 'package' ) rule__Package__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:356:1: ( 'package' ) rule__Package__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:356:1: ( 'package' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:357:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Package__Group__0706); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0716);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:371:1: rule__Package__Group__1 : ( ruleJAVAID ) rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:375:1: ( ( ruleJAVAID ) rule__Package__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:376:1: ( ruleJAVAID ) rule__Package__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:376:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:377:1: ruleJAVAID
            {
             before(grammarAccess.getPackageAccess().getJAVAIDParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Package__Group__1744);
            ruleJAVAID();
            _fsp--;

             after(grammarAccess.getPackageAccess().getJAVAIDParserRuleCall_1()); 

            }

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1752);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:389:1: rule__Package__Group__2 : ( ';' ) ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:393:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:394:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:394:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:395:1: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Package__Group__2781); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:414:1: rule__Automaton__Group__0 : ( 'automaton' ) rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:418:1: ( ( 'automaton' ) rule__Automaton__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:419:1: ( 'automaton' ) rule__Automaton__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:419:1: ( 'automaton' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:420:1: 'automaton'
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Automaton__Group__0823); 
             after(grammarAccess.getAutomatonAccess().getAutomatonKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__1_in_rule__Automaton__Group__0833);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:434:1: rule__Automaton__Group__1 : ( ruleClass ) rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:438:1: ( ( ruleClass ) rule__Automaton__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:439:1: ( ruleClass ) rule__Automaton__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:439:1: ( ruleClass )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:440:1: ruleClass
            {
             before(grammarAccess.getAutomatonAccess().getClassParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleClass_in_rule__Automaton__Group__1861);
            ruleClass();
            _fsp--;

             after(grammarAccess.getAutomatonAccess().getClassParserRuleCall_1()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__2_in_rule__Automaton__Group__1869);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:452:1: rule__Automaton__Group__2 : ( '{' ) rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:456:1: ( ( '{' ) rule__Automaton__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:457:1: ( '{' ) rule__Automaton__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:457:1: ( '{' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:458:1: '{'
            {
             before(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Automaton__Group__2898); 
             after(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Automaton__Group__3_in_rule__Automaton__Group__2908);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:472:1: rule__Automaton__Group__3 : ( ( ( rule__Automaton__StatesAssignment_3 ) ) ( ( rule__Automaton__StatesAssignment_3 )* ) ) rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:476:1: ( ( ( ( rule__Automaton__StatesAssignment_3 ) ) ( ( rule__Automaton__StatesAssignment_3 )* ) ) rule__Automaton__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:477:1: ( ( ( rule__Automaton__StatesAssignment_3 ) ) ( ( rule__Automaton__StatesAssignment_3 )* ) ) rule__Automaton__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:477:1: ( ( ( rule__Automaton__StatesAssignment_3 ) ) ( ( rule__Automaton__StatesAssignment_3 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:478:1: ( ( rule__Automaton__StatesAssignment_3 ) ) ( ( rule__Automaton__StatesAssignment_3 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:478:1: ( ( rule__Automaton__StatesAssignment_3 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:479:1: ( rule__Automaton__StatesAssignment_3 )
            {
             before(grammarAccess.getAutomatonAccess().getStatesAssignment_3()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:480:1: ( rule__Automaton__StatesAssignment_3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:480:2: rule__Automaton__StatesAssignment_3
            {
            pushFollow(FOLLOW_rule__Automaton__StatesAssignment_3_in_rule__Automaton__Group__3938);
            rule__Automaton__StatesAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getStatesAssignment_3()); 

            }

            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:483:1: ( ( rule__Automaton__StatesAssignment_3 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:484:1: ( rule__Automaton__StatesAssignment_3 )*
            {
             before(grammarAccess.getAutomatonAccess().getStatesAssignment_3()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:485:1: ( rule__Automaton__StatesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:485:2: rule__Automaton__StatesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Automaton__StatesAssignment_3_in_rule__Automaton__Group__3950);
            	    rule__Automaton__StatesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAutomatonAccess().getStatesAssignment_3()); 

            }


            }

            pushFollow(FOLLOW_rule__Automaton__Group__4_in_rule__Automaton__Group__3962);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:497:1: rule__Automaton__Group__4 : ( '}' ) ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:501:1: ( ( '}' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:502:1: ( '}' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:502:1: ( '}' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:503:1: '}'
            {
             before(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Automaton__Group__4991); 
             after(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end rule__Automaton__Group__4


    // $ANTLR start rule__State__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:526:1: rule__State__Group__0 : ( ( rule__State__InitialAssignment_0 )? ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:530:1: ( ( ( rule__State__InitialAssignment_0 )? ) rule__State__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:531:1: ( ( rule__State__InitialAssignment_0 )? ) rule__State__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:531:1: ( ( rule__State__InitialAssignment_0 )? )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:532:1: ( rule__State__InitialAssignment_0 )?
            {
             before(grammarAccess.getStateAccess().getInitialAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:533:1: ( rule__State__InitialAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:533:2: rule__State__InitialAssignment_0
                    {
                    pushFollow(FOLLOW_rule__State__InitialAssignment_0_in_rule__State__Group__01036);
                    rule__State__InitialAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getInitialAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__01046);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:544:1: rule__State__Group__1 : ( 'state' ) rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:548:1: ( ( 'state' ) rule__State__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:549:1: ( 'state' ) rule__State__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:549:1: ( 'state' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:550:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__State__Group__11075); 
             after(grammarAccess.getStateAccess().getStateKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__11085);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:564:1: rule__State__Group__2 : ( ( rule__State__NameAssignment_2 ) ) rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:568:1: ( ( ( rule__State__NameAssignment_2 ) ) rule__State__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:569:1: ( ( rule__State__NameAssignment_2 ) ) rule__State__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:569:1: ( ( rule__State__NameAssignment_2 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:570:1: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:571:1: ( rule__State__NameAssignment_2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:571:2: rule__State__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__21113);
            rule__State__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__21122);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:582:1: rule__State__Group__3 : ( '{' ) rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:586:1: ( ( '{' ) rule__State__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:587:1: ( '{' ) rule__State__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:587:1: ( '{' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:588:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__State__Group__31151); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__31161);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:602:1: rule__State__Group__4 : ( ( rule__State__TransitionsAssignment_4 )* ) rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:606:1: ( ( ( rule__State__TransitionsAssignment_4 )* ) rule__State__Group__5 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:607:1: ( ( rule__State__TransitionsAssignment_4 )* ) rule__State__Group__5
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:607:1: ( ( rule__State__TransitionsAssignment_4 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:608:1: ( rule__State__TransitionsAssignment_4 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_4()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:609:1: ( rule__State__TransitionsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:609:2: rule__State__TransitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__State__TransitionsAssignment_4_in_rule__State__Group__41189);
            	    rule__State__TransitionsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__41199);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:620:1: rule__State__Group__5 : ( '}' ) ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:624:1: ( ( '}' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:625:1: ( '}' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:625:1: ( '}' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:626:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__State__Group__51228); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:651:1: rule__Transition__Group__0 : ( ( rule__Transition__MethodAssignment_0 ) ) rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:655:1: ( ( ( rule__Transition__MethodAssignment_0 ) ) rule__Transition__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:656:1: ( ( rule__Transition__MethodAssignment_0 ) ) rule__Transition__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:656:1: ( ( rule__Transition__MethodAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:657:1: ( rule__Transition__MethodAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getMethodAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:658:1: ( rule__Transition__MethodAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:658:2: rule__Transition__MethodAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__MethodAssignment_0_in_rule__Transition__Group__01275);
            rule__Transition__MethodAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getMethodAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01284);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:669:1: rule__Transition__Group__1 : ( '->' ) rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:673:1: ( ( '->' ) rule__Transition__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:674:1: ( '->' ) rule__Transition__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:674:1: ( '->' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:675:1: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Transition__Group__11313); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11323);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:689:1: rule__Transition__Group__2 : ( ( rule__Transition__StateAssignment_2 ) ) rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:693:1: ( ( ( rule__Transition__StateAssignment_2 ) ) rule__Transition__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:694:1: ( ( rule__Transition__StateAssignment_2 ) ) rule__Transition__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:694:1: ( ( rule__Transition__StateAssignment_2 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:695:1: ( rule__Transition__StateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_2()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:696:1: ( rule__Transition__StateAssignment_2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:696:2: rule__Transition__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__21351);
            rule__Transition__StateAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getStateAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21360);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:707:1: rule__Transition__Group__3 : ( ';' ) ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:711:1: ( ( ';' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:712:1: ( ';' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:712:1: ( ';' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:713:1: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Transition__Group__31389); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:734:1: rule__Method__Group__0 : ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:738:1: ( ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:739:1: ( ( rule__Method__ReturntypeAssignment_0 ) ) rule__Method__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:739:1: ( ( rule__Method__ReturntypeAssignment_0 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:740:1: ( rule__Method__ReturntypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getReturntypeAssignment_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:741:1: ( rule__Method__ReturntypeAssignment_0 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:741:2: rule__Method__ReturntypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Method__ReturntypeAssignment_0_in_rule__Method__Group__01432);
            rule__Method__ReturntypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturntypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__01441);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:752:1: rule__Method__Group__1 : ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:756:1: ( ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:757:1: ( ( rule__Method__NameAssignment_1 ) ) rule__Method__Group__2
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:757:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:758:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:759:1: ( rule__Method__NameAssignment_1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:759:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__11469);
            rule__Method__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__11478);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:770:1: rule__Method__Group__2 : ( '(' ) rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:774:1: ( ( '(' ) rule__Method__Group__3 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:775:1: ( '(' ) rule__Method__Group__3
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:775:1: ( '(' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:776:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Method__Group__21507); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__21517);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:790:1: rule__Method__Group__3 : ( ( rule__Method__ArgsAssignment_3 )* ) rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:794:1: ( ( ( rule__Method__ArgsAssignment_3 )* ) rule__Method__Group__4 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:795:1: ( ( rule__Method__ArgsAssignment_3 )* ) rule__Method__Group__4
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:795:1: ( ( rule__Method__ArgsAssignment_3 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:796:1: ( rule__Method__ArgsAssignment_3 )*
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:797:1: ( rule__Method__ArgsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:797:2: rule__Method__ArgsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Method__ArgsAssignment_3_in_rule__Method__Group__31545);
            	    rule__Method__ArgsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getArgsAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__31555);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:808:1: rule__Method__Group__4 : ( ')' ) ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:812:1: ( ( ')' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:813:1: ( ')' )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:813:1: ( ')' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:814:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Method__Group__41584); 
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


    // $ANTLR start rule__JAVAID__Group__0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:837:1: rule__JAVAID__Group__0 : ( RULE_ID ) rule__JAVAID__Group__1 ;
    public final void rule__JAVAID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:841:1: ( ( RULE_ID ) rule__JAVAID__Group__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:842:1: ( RULE_ID ) rule__JAVAID__Group__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:842:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:843:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group__01629); 
             after(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__01637);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:855:1: rule__JAVAID__Group__1 : ( ( rule__JAVAID__Group_1__0 )* ) ;
    public final void rule__JAVAID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:859:1: ( ( ( rule__JAVAID__Group_1__0 )* ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:860:1: ( ( rule__JAVAID__Group_1__0 )* )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:860:1: ( ( rule__JAVAID__Group_1__0 )* )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:861:1: ( rule__JAVAID__Group_1__0 )*
            {
             before(grammarAccess.getJAVAIDAccess().getGroup_1()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:862:1: ( rule__JAVAID__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:862:2: rule__JAVAID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__11665);
            	    rule__JAVAID__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:876:1: rule__JAVAID__Group_1__0 : ( '.' ) rule__JAVAID__Group_1__1 ;
    public final void rule__JAVAID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:880:1: ( ( '.' ) rule__JAVAID__Group_1__1 )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:881:1: ( '.' ) rule__JAVAID__Group_1__1
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:881:1: ( '.' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:882:1: '.'
            {
             before(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__JAVAID__Group_1__01705); 
             after(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__01715);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:896:1: rule__JAVAID__Group_1__1 : ( RULE_ID ) ;
    public final void rule__JAVAID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:900:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:901:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:901:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:902:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__11743); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:917:1: rule__Automata__PackageAssignment_0 : ( rulePackage ) ;
    public final void rule__Automata__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:921:1: ( ( rulePackage ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:922:1: ( rulePackage )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:922:1: ( rulePackage )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:923:1: rulePackage
            {
             before(grammarAccess.getAutomataAccess().getPackagePackageParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Automata__PackageAssignment_01780);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:932:1: rule__Automata__AutomataAssignment_1 : ( ruleAutomaton ) ;
    public final void rule__Automata__AutomataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:936:1: ( ( ruleAutomaton ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:937:1: ( ruleAutomaton )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:937:1: ( ruleAutomaton )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:938:1: ruleAutomaton
            {
             before(grammarAccess.getAutomataAccess().getAutomataAutomatonParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAutomaton_in_rule__Automata__AutomataAssignment_11811);
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


    // $ANTLR start rule__Automaton__StatesAssignment_3
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:947:1: rule__Automaton__StatesAssignment_3 : ( ruleState ) ;
    public final void rule__Automaton__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:951:1: ( ( ruleState ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:952:1: ( ruleState )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:952:1: ( ruleState )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:953:1: ruleState
            {
             before(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Automaton__StatesAssignment_31842);
            ruleState();
            _fsp--;

             after(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_3_0()); 

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
    // $ANTLR end rule__Automaton__StatesAssignment_3


    // $ANTLR start rule__Class__NameAssignment
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:962:1: rule__Class__NameAssignment : ( ruleJAVAID ) ;
    public final void rule__Class__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:966:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:967:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:967:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:968:1: ruleJAVAID
            {
             before(grammarAccess.getClassAccess().getNameJAVAIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Class__NameAssignment1873);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:977:1: rule__State__InitialAssignment_0 : ( ( 'initial' ) ) ;
    public final void rule__State__InitialAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:981:1: ( ( ( 'initial' ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:982:1: ( ( 'initial' ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:982:1: ( ( 'initial' ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:983:1: ( 'initial' )
            {
             before(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:984:1: ( 'initial' )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:985:1: 'initial'
            {
             before(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__State__InitialAssignment_01909); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1000:1: rule__State__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1004:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1005:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1005:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1006:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_21948); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1015:1: rule__State__TransitionsAssignment_4 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1019:1: ( ( ruleTransition ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1020:1: ( ruleTransition )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1020:1: ( ruleTransition )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1021:1: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_41979);
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


    // $ANTLR start rule__Transition__MethodAssignment_0
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1030:1: rule__Transition__MethodAssignment_0 : ( ruleMethod ) ;
    public final void rule__Transition__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1034:1: ( ( ruleMethod ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1035:1: ( ruleMethod )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1035:1: ( ruleMethod )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1036:1: ruleMethod
            {
             before(grammarAccess.getTransitionAccess().getMethodMethodParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Transition__MethodAssignment_02010);
            ruleMethod();
            _fsp--;

             after(grammarAccess.getTransitionAccess().getMethodMethodParserRuleCall_0_0()); 

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
    // $ANTLR end rule__Transition__MethodAssignment_0


    // $ANTLR start rule__Transition__StateAssignment_2
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1045:1: rule__Transition__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1049:1: ( ( ( RULE_ID ) ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1050:1: ( ( RULE_ID ) )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1050:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1051:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1052:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1053:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_22045); 
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1064:1: rule__Method__ReturntypeAssignment_0 : ( ruleType ) ;
    public final void rule__Method__ReturntypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1068:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1069:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1069:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1070:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getReturntypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ReturntypeAssignment_02080);
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
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1079:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1083:1: ( ( RULE_ID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1084:1: ( RULE_ID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1084:1: ( RULE_ID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1085:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_12111); 
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


    // $ANTLR start rule__Method__ArgsAssignment_3
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1094:1: rule__Method__ArgsAssignment_3 : ( ruleType ) ;
    public final void rule__Method__ArgsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1098:1: ( ( ruleType ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1099:1: ( ruleType )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1099:1: ( ruleType )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1100:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ArgsAssignment_32142);
            ruleType();
            _fsp--;

             after(grammarAccess.getMethodAccess().getArgsTypeParserRuleCall_3_0()); 

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
    // $ANTLR end rule__Method__ArgsAssignment_3


    // $ANTLR start rule__Type__NameAssignment
    // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1109:1: rule__Type__NameAssignment : ( ruleJAVAID ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1113:1: ( ( ruleJAVAID ) )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1114:1: ( ruleJAVAID )
            {
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1114:1: ( ruleJAVAID )
            // ../soot.typestate.automata.ui/src-gen/soot/typestate/automata/contentassist/antlr/internal/InternalAutomata.g:1115:1: ruleJAVAID
            {
             before(grammarAccess.getTypeAccess().getNameJAVAIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__Type__NameAssignment2173);
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
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_in_ruleType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_entryRuleJAVAID540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJAVAID547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automata__PackageAssignment_0_in_rule__Automata__Group__0612 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Automata__Group__1_in_rule__Automata__Group__0622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__1652 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Automata__AutomataAssignment_1_in_rule__Automata__Group__1664 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11_in_rule__Package__Group__0706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Package__Group__1744 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Package__Group__2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Automaton__Group__0823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Automaton__Group__1_in_rule__Automaton__Group__0833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Automaton__Group__1861 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__2_in_rule__Automaton__Group__1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Automaton__Group__2898 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__3_in_rule__Automaton__Group__2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Automaton__StatesAssignment_3_in_rule__Automaton__Group__3938 = new BitSet(new long[]{0x0000000000218000L});
    public static final BitSet FOLLOW_rule__Automaton__StatesAssignment_3_in_rule__Automaton__Group__3950 = new BitSet(new long[]{0x0000000000218000L});
    public static final BitSet FOLLOW_rule__Automaton__Group__4_in_rule__Automaton__Group__3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Automaton__Group__4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__InitialAssignment_0_in_rule__State__Group__01036 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__01046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__Group__11075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__11085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__21113 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__21122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__State__Group__31151 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__31161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TransitionsAssignment_4_in_rule__State__Group__41189 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__41199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__State__Group__51228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__MethodAssignment_0_in_rule__Transition__Group__01275 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Transition__Group__11313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__21351 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Transition__Group__31389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ReturntypeAssignment_0_in_rule__Method__Group__01432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__01441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__11469 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__11478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Method__Group__21507 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__21517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ArgsAssignment_3_in_rule__Method__Group__31545 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__31555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Method__Group__41584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group__01629 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__01637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__11665 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rule__JAVAID__Group_1__01705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__01715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__11743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Automata__PackageAssignment_01780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomaton_in_rule__Automata__AutomataAssignment_11811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Automaton__StatesAssignment_31842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Class__NameAssignment1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__InitialAssignment_01909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_21948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_41979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Transition__MethodAssignment_02010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_22045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ReturntypeAssignment_02080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_12111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ArgsAssignment_32142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__Type__NameAssignment2173 = new BitSet(new long[]{0x0000000000000002L});

}