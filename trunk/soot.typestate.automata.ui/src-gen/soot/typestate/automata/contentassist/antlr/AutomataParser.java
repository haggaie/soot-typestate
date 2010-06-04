/*
* generated by Xtext
*/
package soot.typestate.automata.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import soot.typestate.automata.services.AutomataGrammarAccess;

public class AutomataParser extends AbstractContentAssistParser {
	
	@Inject
	private AutomataGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected soot.typestate.automata.contentassist.antlr.internal.InternalAutomataLexer createLexer(CharStream stream) {
		return new soot.typestate.automata.contentassist.antlr.internal.InternalAutomataLexer(stream);
	}
	
	@Override
	protected soot.typestate.automata.contentassist.antlr.internal.InternalAutomataParser createParser() {
		soot.typestate.automata.contentassist.antlr.internal.InternalAutomataParser result = new soot.typestate.automata.contentassist.antlr.internal.InternalAutomataParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				{
					put(grammarAccess.getTransitionAccess().getAlternatives_0(), "rule__Transition__Alternatives_0");
					put(grammarAccess.getAutomataAccess().getGroup(), "rule__Automata__Group__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getAutomatonAccess().getGroup(), "rule__Automaton__Group__0");
					put(grammarAccess.getAutomatonAccess().getGroup_7(), "rule__Automaton__Group_7__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_3(), "rule__Method__Group_3__0");
					put(grammarAccess.getMethodAccess().getGroup_3_1(), "rule__Method__Group_3_1__0");
					put(grammarAccess.getConstructorAccess().getGroup(), "rule__Constructor__Group__0");
					put(grammarAccess.getJAVAIDAccess().getGroup(), "rule__JAVAID__Group__0");
					put(grammarAccess.getJAVAIDAccess().getGroup_1(), "rule__JAVAID__Group_1__0");
					put(grammarAccess.getAutomataAccess().getPackageAssignment_0(), "rule__Automata__PackageAssignment_0");
					put(grammarAccess.getAutomataAccess().getAutomataAssignment_1(), "rule__Automata__AutomataAssignment_1");
					put(grammarAccess.getPackageAccess().getNameAssignment_1(), "rule__Package__NameAssignment_1");
					put(grammarAccess.getAutomatonAccess().getKlassAssignment_1(), "rule__Automaton__KlassAssignment_1");
					put(grammarAccess.getAutomatonAccess().getInitialStateAssignment_5(), "rule__Automaton__InitialStateAssignment_5");
					put(grammarAccess.getAutomatonAccess().getErrorStateAssignment_7_2(), "rule__Automaton__ErrorStateAssignment_7_2");
					put(grammarAccess.getAutomatonAccess().getStatesAssignment_8(), "rule__Automaton__StatesAssignment_8");
					put(grammarAccess.getClassAccess().getNameAssignment(), "rule__Class__NameAssignment");
					put(grammarAccess.getStateAccess().getInitialAssignment_0(), "rule__State__InitialAssignment_0");
					put(grammarAccess.getStateAccess().getNameAssignment_2(), "rule__State__NameAssignment_2");
					put(grammarAccess.getStateAccess().getTransitionsAssignment_4(), "rule__State__TransitionsAssignment_4");
					put(grammarAccess.getTransitionAccess().getMethodAssignment_0_0(), "rule__Transition__MethodAssignment_0_0");
					put(grammarAccess.getTransitionAccess().getStateAssignment_2(), "rule__Transition__StateAssignment_2");
					put(grammarAccess.getMethodAccess().getReturntypeAssignment_0(), "rule__Method__ReturntypeAssignment_0");
					put(grammarAccess.getMethodAccess().getNameAssignment_1(), "rule__Method__NameAssignment_1");
					put(grammarAccess.getMethodAccess().getArgsAssignment_3_0(), "rule__Method__ArgsAssignment_3_0");
					put(grammarAccess.getMethodAccess().getArgsAssignment_3_1_1(), "rule__Method__ArgsAssignment_3_1_1");
					put(grammarAccess.getConstructorAccess().getArgsAssignment_2(), "rule__Constructor__ArgsAssignment_2");
					put(grammarAccess.getTypeAccess().getNameAssignment(), "rule__Type__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			soot.typestate.automata.contentassist.antlr.internal.InternalAutomataParser typedParser = (soot.typestate.automata.contentassist.antlr.internal.InternalAutomataParser) parser;
			typedParser.entryRuleAutomata();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AutomataGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AutomataGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
