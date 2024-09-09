package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_NOT", "RULE_CHAR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'**'", "'*'", "'++'", "'--'", "'true'", "'false'", "'null'", "'<='", "'<'", "'>='", "'>'", "'!='", "'=='", "'='", "'&&'", "'||'", "'/'", "'%'", "'+'", "'-'", "'+='", "'-='", "'*='", "'/='", "'%='", "'**='", "'int'", "'String'", "'char'", "'let'", "'boolean'", "'float'", "'var'", "'const'", "'void'", "'import'", "'from'", "','", "'{'", "'}'", "'as'", "';'", "'('", "')'", "'function'", "'.'", "'if'", "'else'", "'for'", "'while'", "'do'", "'continue'", "'break'", "'return'", "'console.log'", "'try'", "'catch'", "'switch'", "'case'", "':'", "'default'", "'split'", "'join'", "'slice'", "'throw'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int RULE_CHAR=8;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_NOT=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainModel"
    // InternalMyDsl.g:53:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleDomainModel EOF )
            // InternalMyDsl.g:55:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalMyDsl.g:62:1: ruleDomainModel : ( ( rule__DomainModel__StatementsAssignment )* ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__DomainModel__StatementsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__DomainModel__StatementsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__DomainModel__StatementsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__DomainModel__StatementsAssignment )*
            {
             before(grammarAccess.getDomainModelAccess().getStatementsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__DomainModel__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_CHAR)||(LA1_0>=15 && LA1_0<=19)||(LA1_0>=39 && LA1_0<=48)||LA1_0==55||LA1_0==57||LA1_0==59||(LA1_0>=61 && LA1_0<=68)||LA1_0==70||(LA1_0>=74 && LA1_0<=77)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__DomainModel__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DomainModel__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getStatementsAssignment()); 

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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleImport"
    // InternalMyDsl.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleImport EOF )
            // InternalMyDsl.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMyDsl.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Import__Group__0 )
            // InternalMyDsl.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleImportElement"
    // InternalMyDsl.g:103:1: entryRuleImportElement : ruleImportElement EOF ;
    public final void entryRuleImportElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleImportElement EOF )
            // InternalMyDsl.g:105:1: ruleImportElement EOF
            {
             before(grammarAccess.getImportElementRule()); 
            pushFollow(FOLLOW_1);
            ruleImportElement();

            state._fsp--;

             after(grammarAccess.getImportElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImportElement"


    // $ANTLR start "ruleImportElement"
    // InternalMyDsl.g:112:1: ruleImportElement : ( ( rule__ImportElement__Group__0 ) ) ;
    public final void ruleImportElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__ImportElement__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__ImportElement__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__ImportElement__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__ImportElement__Group__0 )
            {
             before(grammarAccess.getImportElementAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__ImportElement__Group__0 )
            // InternalMyDsl.g:119:4: rule__ImportElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportElementAccess().getGroup()); 

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
    // $ANTLR end "ruleImportElement"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:128:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleStatement EOF )
            // InternalMyDsl.g:130:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:137:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Statement__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Statement__Alternatives )
            // InternalMyDsl.g:144:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleBlock"
    // InternalMyDsl.g:153:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleBlock EOF )
            // InternalMyDsl.g:155:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMyDsl.g:162:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Block__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Block__Group__0 )
            // InternalMyDsl.g:169:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMyDsl.g:178:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleVariableDeclaration EOF )
            // InternalMyDsl.g:180:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMyDsl.g:187:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__VariableDeclaration__Group__0 )
            // InternalMyDsl.g:194:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleExpressionStatement"
    // InternalMyDsl.g:203:1: entryRuleExpressionStatement : ruleExpressionStatement EOF ;
    public final void entryRuleExpressionStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleExpressionStatement EOF )
            // InternalMyDsl.g:205:1: ruleExpressionStatement EOF
            {
             before(grammarAccess.getExpressionStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionStatement();

            state._fsp--;

             after(grammarAccess.getExpressionStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpressionStatement"


    // $ANTLR start "ruleExpressionStatement"
    // InternalMyDsl.g:212:1: ruleExpressionStatement : ( ( rule__ExpressionStatement__Group__0 ) ) ;
    public final void ruleExpressionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__ExpressionStatement__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__ExpressionStatement__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__ExpressionStatement__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__ExpressionStatement__Group__0 )
            {
             before(grammarAccess.getExpressionStatementAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__ExpressionStatement__Group__0 )
            // InternalMyDsl.g:219:4: rule__ExpressionStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleExpressionStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:228:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleExpression EOF )
            // InternalMyDsl.g:230:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:237:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:244:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAugmentedAssignment"
    // InternalMyDsl.g:253:1: entryRuleAugmentedAssignment : ruleAugmentedAssignment EOF ;
    public final void entryRuleAugmentedAssignment() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleAugmentedAssignment EOF )
            // InternalMyDsl.g:255:1: ruleAugmentedAssignment EOF
            {
             before(grammarAccess.getAugmentedAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAugmentedAssignment();

            state._fsp--;

             after(grammarAccess.getAugmentedAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAugmentedAssignment"


    // $ANTLR start "ruleAugmentedAssignment"
    // InternalMyDsl.g:262:1: ruleAugmentedAssignment : ( ( rule__AugmentedAssignment__Group__0 ) ) ;
    public final void ruleAugmentedAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__AugmentedAssignment__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__AugmentedAssignment__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__AugmentedAssignment__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__AugmentedAssignment__Group__0 )
            {
             before(grammarAccess.getAugmentedAssignmentAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__AugmentedAssignment__Group__0 )
            // InternalMyDsl.g:269:4: rule__AugmentedAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AugmentedAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAugmentedAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleAugmentedAssignment"


    // $ANTLR start "entryRuleLogicalExpression"
    // InternalMyDsl.g:278:1: entryRuleLogicalExpression : ruleLogicalExpression EOF ;
    public final void entryRuleLogicalExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleLogicalExpression EOF )
            // InternalMyDsl.g:280:1: ruleLogicalExpression EOF
            {
             before(grammarAccess.getLogicalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalExpression();

            state._fsp--;

             after(grammarAccess.getLogicalExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogicalExpression"


    // $ANTLR start "ruleLogicalExpression"
    // InternalMyDsl.g:287:1: ruleLogicalExpression : ( ( rule__LogicalExpression__Group__0 ) ) ;
    public final void ruleLogicalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__LogicalExpression__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__LogicalExpression__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__LogicalExpression__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__LogicalExpression__Group__0 )
            {
             before(grammarAccess.getLogicalExpressionAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__LogicalExpression__Group__0 )
            // InternalMyDsl.g:294:4: rule__LogicalExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleLogicalExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalMyDsl.g:303:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleComparisonExpression EOF )
            // InternalMyDsl.g:305:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalMyDsl.g:312:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ComparisonExpression__Group__0 )
            // InternalMyDsl.g:319:4: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalMyDsl.g:328:1: entryRuleArithmeticExpression : ruleArithmeticExpression EOF ;
    public final void entryRuleArithmeticExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleArithmeticExpression EOF )
            // InternalMyDsl.g:330:1: ruleArithmeticExpression EOF
            {
             before(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getArithmeticExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalMyDsl.g:337:1: ruleArithmeticExpression : ( ( rule__ArithmeticExpression__Group__0 ) ) ;
    public final void ruleArithmeticExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__ArithmeticExpression__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__ArithmeticExpression__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__ArithmeticExpression__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__ArithmeticExpression__Group__0 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__ArithmeticExpression__Group__0 )
            // InternalMyDsl.g:344:4: rule__ArithmeticExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // InternalMyDsl.g:353:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleMultiplicationExpression EOF )
            // InternalMyDsl.g:355:1: ruleMultiplicationExpression EOF
            {
             before(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // InternalMyDsl.g:362:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Group__0 ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__MultiplicationExpression__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__MultiplicationExpression__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__MultiplicationExpression__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__MultiplicationExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__MultiplicationExpression__Group__0 )
            // InternalMyDsl.g:369:4: rule__MultiplicationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleExponentiationExpression"
    // InternalMyDsl.g:378:1: entryRuleExponentiationExpression : ruleExponentiationExpression EOF ;
    public final void entryRuleExponentiationExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleExponentiationExpression EOF )
            // InternalMyDsl.g:380:1: ruleExponentiationExpression EOF
            {
             before(grammarAccess.getExponentiationExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExponentiationExpression();

            state._fsp--;

             after(grammarAccess.getExponentiationExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExponentiationExpression"


    // $ANTLR start "ruleExponentiationExpression"
    // InternalMyDsl.g:387:1: ruleExponentiationExpression : ( ( rule__ExponentiationExpression__Group__0 ) ) ;
    public final void ruleExponentiationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__ExponentiationExpression__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__ExponentiationExpression__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__ExponentiationExpression__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__ExponentiationExpression__Group__0 )
            {
             before(grammarAccess.getExponentiationExpressionAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__ExponentiationExpression__Group__0 )
            // InternalMyDsl.g:394:4: rule__ExponentiationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExponentiationExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleExponentiationExpression"


    // $ANTLR start "entryRulePrimary"
    // InternalMyDsl.g:403:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( rulePrimary EOF )
            // InternalMyDsl.g:405:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMyDsl.g:412:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Primary__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__Primary__Alternatives )
            // InternalMyDsl.g:419:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRulePostfixOperator"
    // InternalMyDsl.g:428:1: entryRulePostfixOperator : rulePostfixOperator EOF ;
    public final void entryRulePostfixOperator() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( rulePostfixOperator EOF )
            // InternalMyDsl.g:430:1: rulePostfixOperator EOF
            {
             before(grammarAccess.getPostfixOperatorRule()); 
            pushFollow(FOLLOW_1);
            rulePostfixOperator();

            state._fsp--;

             after(grammarAccess.getPostfixOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePostfixOperator"


    // $ANTLR start "rulePostfixOperator"
    // InternalMyDsl.g:437:1: rulePostfixOperator : ( ( rule__PostfixOperator__Group__0 ) ) ;
    public final void rulePostfixOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__PostfixOperator__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__PostfixOperator__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__PostfixOperator__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__PostfixOperator__Group__0 )
            {
             before(grammarAccess.getPostfixOperatorAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__PostfixOperator__Group__0 )
            // InternalMyDsl.g:444:4: rule__PostfixOperator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PostfixOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPostfixOperatorAccess().getGroup()); 

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
    // $ANTLR end "rulePostfixOperator"


    // $ANTLR start "entryRulePrefixOperator"
    // InternalMyDsl.g:453:1: entryRulePrefixOperator : rulePrefixOperator EOF ;
    public final void entryRulePrefixOperator() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( rulePrefixOperator EOF )
            // InternalMyDsl.g:455:1: rulePrefixOperator EOF
            {
             before(grammarAccess.getPrefixOperatorRule()); 
            pushFollow(FOLLOW_1);
            rulePrefixOperator();

            state._fsp--;

             after(grammarAccess.getPrefixOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrefixOperator"


    // $ANTLR start "rulePrefixOperator"
    // InternalMyDsl.g:462:1: rulePrefixOperator : ( ( rule__PrefixOperator__Group__0 ) ) ;
    public final void rulePrefixOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__PrefixOperator__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__PrefixOperator__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__PrefixOperator__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__PrefixOperator__Group__0 )
            {
             before(grammarAccess.getPrefixOperatorAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__PrefixOperator__Group__0 )
            // InternalMyDsl.g:469:4: rule__PrefixOperator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrefixOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrefixOperatorAccess().getGroup()); 

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
    // $ANTLR end "rulePrefixOperator"


    // $ANTLR start "entryRuleAnonymousFunction"
    // InternalMyDsl.g:478:1: entryRuleAnonymousFunction : ruleAnonymousFunction EOF ;
    public final void entryRuleAnonymousFunction() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleAnonymousFunction EOF )
            // InternalMyDsl.g:480:1: ruleAnonymousFunction EOF
            {
             before(grammarAccess.getAnonymousFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleAnonymousFunction();

            state._fsp--;

             after(grammarAccess.getAnonymousFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnonymousFunction"


    // $ANTLR start "ruleAnonymousFunction"
    // InternalMyDsl.g:487:1: ruleAnonymousFunction : ( ( rule__AnonymousFunction__Group__0 ) ) ;
    public final void ruleAnonymousFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__AnonymousFunction__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__AnonymousFunction__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__AnonymousFunction__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__AnonymousFunction__Group__0 )
            {
             before(grammarAccess.getAnonymousFunctionAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__AnonymousFunction__Group__0 )
            // InternalMyDsl.g:494:4: rule__AnonymousFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnonymousFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnonymousFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleAnonymousFunction"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMyDsl.g:503:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleNumberLiteral EOF )
            // InternalMyDsl.g:505:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMyDsl.g:512:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalMyDsl.g:518:3: ( rule__NumberLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            // InternalMyDsl.g:519:3: ( rule__NumberLiteral__ValueAssignment )
            // InternalMyDsl.g:519:4: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNUMBER"
    // InternalMyDsl.g:528:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleNUMBER EOF )
            // InternalMyDsl.g:530:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalMyDsl.g:537:1: ruleNUMBER : ( ( rule__NUMBER__Group__0 ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__NUMBER__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__NUMBER__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__NUMBER__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__NUMBER__Group__0 )
            {
             before(grammarAccess.getNUMBERAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__NUMBER__Group__0 )
            // InternalMyDsl.g:544:4: rule__NUMBER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERAccess().getGroup()); 

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
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleBoolean"
    // InternalMyDsl.g:553:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleBoolean EOF )
            // InternalMyDsl.g:555:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalMyDsl.g:562:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Boolean__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Boolean__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Boolean__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Boolean__Group__0 )
            {
             before(grammarAccess.getBooleanAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Boolean__Group__0 )
            // InternalMyDsl.g:569:4: rule__Boolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getGroup()); 

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleNotBoolean"
    // InternalMyDsl.g:578:1: entryRuleNotBoolean : ruleNotBoolean EOF ;
    public final void entryRuleNotBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleNotBoolean EOF )
            // InternalMyDsl.g:580:1: ruleNotBoolean EOF
            {
             before(grammarAccess.getNotBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleNotBoolean();

            state._fsp--;

             after(grammarAccess.getNotBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNotBoolean"


    // $ANTLR start "ruleNotBoolean"
    // InternalMyDsl.g:587:1: ruleNotBoolean : ( ( rule__NotBoolean__Group__0 ) ) ;
    public final void ruleNotBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__NotBoolean__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__NotBoolean__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__NotBoolean__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__NotBoolean__Group__0 )
            {
             before(grammarAccess.getNotBooleanAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__NotBoolean__Group__0 )
            // InternalMyDsl.g:594:4: rule__NotBoolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotBoolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotBooleanAccess().getGroup()); 

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
    // $ANTLR end "ruleNotBoolean"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMyDsl.g:603:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleStringLiteral EOF )
            // InternalMyDsl.g:605:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMyDsl.g:612:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalMyDsl.g:618:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalMyDsl.g:619:3: ( rule__StringLiteral__ValueAssignment )
            // InternalMyDsl.g:619:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleCharLiteral"
    // InternalMyDsl.g:628:1: entryRuleCharLiteral : ruleCharLiteral EOF ;
    public final void entryRuleCharLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleCharLiteral EOF )
            // InternalMyDsl.g:630:1: ruleCharLiteral EOF
            {
             before(grammarAccess.getCharLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleCharLiteral();

            state._fsp--;

             after(grammarAccess.getCharLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharLiteral"


    // $ANTLR start "ruleCharLiteral"
    // InternalMyDsl.g:637:1: ruleCharLiteral : ( ( rule__CharLiteral__ValueAssignment ) ) ;
    public final void ruleCharLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__CharLiteral__ValueAssignment ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__CharLiteral__ValueAssignment ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__CharLiteral__ValueAssignment ) )
            // InternalMyDsl.g:643:3: ( rule__CharLiteral__ValueAssignment )
            {
             before(grammarAccess.getCharLiteralAccess().getValueAssignment()); 
            // InternalMyDsl.g:644:3: ( rule__CharLiteral__ValueAssignment )
            // InternalMyDsl.g:644:4: rule__CharLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CharLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCharLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleCharLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // InternalMyDsl.g:653:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleVariableReference EOF )
            // InternalMyDsl.g:655:1: ruleVariableReference EOF
            {
             before(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getVariableReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalMyDsl.g:662:1: ruleVariableReference : ( ( rule__VariableReference__NameAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__VariableReference__NameAssignment ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__VariableReference__NameAssignment ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__VariableReference__NameAssignment ) )
            // InternalMyDsl.g:668:3: ( rule__VariableReference__NameAssignment )
            {
             before(grammarAccess.getVariableReferenceAccess().getNameAssignment()); 
            // InternalMyDsl.g:669:3: ( rule__VariableReference__NameAssignment )
            // InternalMyDsl.g:669:4: rule__VariableReference__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableReference__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableReferenceAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleComparisonOperator"
    // InternalMyDsl.g:678:1: entryRuleComparisonOperator : ruleComparisonOperator EOF ;
    public final void entryRuleComparisonOperator() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleComparisonOperator EOF )
            // InternalMyDsl.g:680:1: ruleComparisonOperator EOF
            {
             before(grammarAccess.getComparisonOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalMyDsl.g:687:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalMyDsl.g:693:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalMyDsl.g:694:3: ( rule__ComparisonOperator__Alternatives )
            // InternalMyDsl.g:694:4: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "entryRuleLogicalOperator"
    // InternalMyDsl.g:703:1: entryRuleLogicalOperator : ruleLogicalOperator EOF ;
    public final void entryRuleLogicalOperator() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleLogicalOperator EOF )
            // InternalMyDsl.g:705:1: ruleLogicalOperator EOF
            {
             before(grammarAccess.getLogicalOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalOperator();

            state._fsp--;

             after(grammarAccess.getLogicalOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogicalOperator"


    // $ANTLR start "ruleLogicalOperator"
    // InternalMyDsl.g:712:1: ruleLogicalOperator : ( ( rule__LogicalOperator__Alternatives ) ) ;
    public final void ruleLogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__LogicalOperator__Alternatives ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__LogicalOperator__Alternatives ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__LogicalOperator__Alternatives ) )
            // InternalMyDsl.g:718:3: ( rule__LogicalOperator__Alternatives )
            {
             before(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 
            // InternalMyDsl.g:719:3: ( rule__LogicalOperator__Alternatives )
            // InternalMyDsl.g:719:4: rule__LogicalOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "entryRuleMultiplicationOperator"
    // InternalMyDsl.g:728:1: entryRuleMultiplicationOperator : ruleMultiplicationOperator EOF ;
    public final void entryRuleMultiplicationOperator() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleMultiplicationOperator EOF )
            // InternalMyDsl.g:730:1: ruleMultiplicationOperator EOF
            {
             before(grammarAccess.getMultiplicationOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicationOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicationOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplicationOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // InternalMyDsl.g:737:1: ruleMultiplicationOperator : ( ( rule__MultiplicationOperator__Alternatives ) ) ;
    public final void ruleMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__MultiplicationOperator__Alternatives ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__MultiplicationOperator__Alternatives ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__MultiplicationOperator__Alternatives ) )
            // InternalMyDsl.g:743:3: ( rule__MultiplicationOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicationOperatorAccess().getAlternatives()); 
            // InternalMyDsl.g:744:3: ( rule__MultiplicationOperator__Alternatives )
            // InternalMyDsl.g:744:4: rule__MultiplicationOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "entryRuleArithmeticOperator"
    // InternalMyDsl.g:753:1: entryRuleArithmeticOperator : ruleArithmeticOperator EOF ;
    public final void entryRuleArithmeticOperator() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleArithmeticOperator EOF )
            // InternalMyDsl.g:755:1: ruleArithmeticOperator EOF
            {
             before(grammarAccess.getArithmeticOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleArithmeticOperator();

            state._fsp--;

             after(grammarAccess.getArithmeticOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArithmeticOperator"


    // $ANTLR start "ruleArithmeticOperator"
    // InternalMyDsl.g:762:1: ruleArithmeticOperator : ( ( rule__ArithmeticOperator__Alternatives ) ) ;
    public final void ruleArithmeticOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__ArithmeticOperator__Alternatives ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__ArithmeticOperator__Alternatives ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__ArithmeticOperator__Alternatives ) )
            // InternalMyDsl.g:768:3: ( rule__ArithmeticOperator__Alternatives )
            {
             before(grammarAccess.getArithmeticOperatorAccess().getAlternatives()); 
            // InternalMyDsl.g:769:3: ( rule__ArithmeticOperator__Alternatives )
            // InternalMyDsl.g:769:4: rule__ArithmeticOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleArithmeticOperator"


    // $ANTLR start "entryRuleExponentiationOperator"
    // InternalMyDsl.g:778:1: entryRuleExponentiationOperator : ruleExponentiationOperator EOF ;
    public final void entryRuleExponentiationOperator() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleExponentiationOperator EOF )
            // InternalMyDsl.g:780:1: ruleExponentiationOperator EOF
            {
             before(grammarAccess.getExponentiationOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleExponentiationOperator();

            state._fsp--;

             after(grammarAccess.getExponentiationOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExponentiationOperator"


    // $ANTLR start "ruleExponentiationOperator"
    // InternalMyDsl.g:787:1: ruleExponentiationOperator : ( '**' ) ;
    public final void ruleExponentiationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( '**' ) )
            // InternalMyDsl.g:792:2: ( '**' )
            {
            // InternalMyDsl.g:792:2: ( '**' )
            // InternalMyDsl.g:793:3: '**'
            {
             before(grammarAccess.getExponentiationOperatorAccess().getAsteriskAsteriskKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExponentiationOperatorAccess().getAsteriskAsteriskKeyword()); 

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
    // $ANTLR end "ruleExponentiationOperator"


    // $ANTLR start "entryRuleAugmentedOperator"
    // InternalMyDsl.g:803:1: entryRuleAugmentedOperator : ruleAugmentedOperator EOF ;
    public final void entryRuleAugmentedOperator() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleAugmentedOperator EOF )
            // InternalMyDsl.g:805:1: ruleAugmentedOperator EOF
            {
             before(grammarAccess.getAugmentedOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleAugmentedOperator();

            state._fsp--;

             after(grammarAccess.getAugmentedOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAugmentedOperator"


    // $ANTLR start "ruleAugmentedOperator"
    // InternalMyDsl.g:812:1: ruleAugmentedOperator : ( ( rule__AugmentedOperator__Alternatives ) ) ;
    public final void ruleAugmentedOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__AugmentedOperator__Alternatives ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__AugmentedOperator__Alternatives ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__AugmentedOperator__Alternatives ) )
            // InternalMyDsl.g:818:3: ( rule__AugmentedOperator__Alternatives )
            {
             before(grammarAccess.getAugmentedOperatorAccess().getAlternatives()); 
            // InternalMyDsl.g:819:3: ( rule__AugmentedOperator__Alternatives )
            // InternalMyDsl.g:819:4: rule__AugmentedOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AugmentedOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAugmentedOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAugmentedOperator"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMyDsl.g:828:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:829:1: ( ruleIfStatement EOF )
            // InternalMyDsl.g:830:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMyDsl.g:837:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalMyDsl.g:842:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalMyDsl.g:842:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalMyDsl.g:843:3: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // InternalMyDsl.g:844:3: ( rule__IfStatement__Group__0 )
            // InternalMyDsl.g:844:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleForLoop"
    // InternalMyDsl.g:853:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:854:1: ( ruleForLoop EOF )
            // InternalMyDsl.g:855:1: ruleForLoop EOF
            {
             before(grammarAccess.getForLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleForLoop();

            state._fsp--;

             after(grammarAccess.getForLoopRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalMyDsl.g:862:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalMyDsl.g:867:2: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalMyDsl.g:867:2: ( ( rule__ForLoop__Group__0 ) )
            // InternalMyDsl.g:868:3: ( rule__ForLoop__Group__0 )
            {
             before(grammarAccess.getForLoopAccess().getGroup()); 
            // InternalMyDsl.g:869:3: ( rule__ForLoop__Group__0 )
            // InternalMyDsl.g:869:4: rule__ForLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getGroup()); 

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
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalMyDsl.g:878:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:879:1: ( ruleWhileLoop EOF )
            // InternalMyDsl.g:880:1: ruleWhileLoop EOF
            {
             before(grammarAccess.getWhileLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleWhileLoop();

            state._fsp--;

             after(grammarAccess.getWhileLoopRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalMyDsl.g:887:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalMyDsl.g:892:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalMyDsl.g:892:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalMyDsl.g:893:3: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // InternalMyDsl.g:894:3: ( rule__WhileLoop__Group__0 )
            // InternalMyDsl.g:894:4: rule__WhileLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getGroup()); 

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
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleDoWhileLoop"
    // InternalMyDsl.g:903:1: entryRuleDoWhileLoop : ruleDoWhileLoop EOF ;
    public final void entryRuleDoWhileLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:904:1: ( ruleDoWhileLoop EOF )
            // InternalMyDsl.g:905:1: ruleDoWhileLoop EOF
            {
             before(grammarAccess.getDoWhileLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleDoWhileLoop();

            state._fsp--;

             after(grammarAccess.getDoWhileLoopRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoWhileLoop"


    // $ANTLR start "ruleDoWhileLoop"
    // InternalMyDsl.g:912:1: ruleDoWhileLoop : ( ( rule__DoWhileLoop__Group__0 ) ) ;
    public final void ruleDoWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:2: ( ( ( rule__DoWhileLoop__Group__0 ) ) )
            // InternalMyDsl.g:917:2: ( ( rule__DoWhileLoop__Group__0 ) )
            {
            // InternalMyDsl.g:917:2: ( ( rule__DoWhileLoop__Group__0 ) )
            // InternalMyDsl.g:918:3: ( rule__DoWhileLoop__Group__0 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getGroup()); 
            // InternalMyDsl.g:919:3: ( rule__DoWhileLoop__Group__0 )
            // InternalMyDsl.g:919:4: rule__DoWhileLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoWhileLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileLoopAccess().getGroup()); 

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
    // $ANTLR end "ruleDoWhileLoop"


    // $ANTLR start "entryRuleContinueStatement"
    // InternalMyDsl.g:928:1: entryRuleContinueStatement : ruleContinueStatement EOF ;
    public final void entryRuleContinueStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:929:1: ( ruleContinueStatement EOF )
            // InternalMyDsl.g:930:1: ruleContinueStatement EOF
            {
             before(grammarAccess.getContinueStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleContinueStatement();

            state._fsp--;

             after(grammarAccess.getContinueStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContinueStatement"


    // $ANTLR start "ruleContinueStatement"
    // InternalMyDsl.g:937:1: ruleContinueStatement : ( ( rule__ContinueStatement__Group__0 ) ) ;
    public final void ruleContinueStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:2: ( ( ( rule__ContinueStatement__Group__0 ) ) )
            // InternalMyDsl.g:942:2: ( ( rule__ContinueStatement__Group__0 ) )
            {
            // InternalMyDsl.g:942:2: ( ( rule__ContinueStatement__Group__0 ) )
            // InternalMyDsl.g:943:3: ( rule__ContinueStatement__Group__0 )
            {
             before(grammarAccess.getContinueStatementAccess().getGroup()); 
            // InternalMyDsl.g:944:3: ( rule__ContinueStatement__Group__0 )
            // InternalMyDsl.g:944:4: rule__ContinueStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContinueStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContinueStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleContinueStatement"


    // $ANTLR start "entryRuleBreakStatement"
    // InternalMyDsl.g:953:1: entryRuleBreakStatement : ruleBreakStatement EOF ;
    public final void entryRuleBreakStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:954:1: ( ruleBreakStatement EOF )
            // InternalMyDsl.g:955:1: ruleBreakStatement EOF
            {
             before(grammarAccess.getBreakStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleBreakStatement();

            state._fsp--;

             after(grammarAccess.getBreakStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBreakStatement"


    // $ANTLR start "ruleBreakStatement"
    // InternalMyDsl.g:962:1: ruleBreakStatement : ( ( rule__BreakStatement__Group__0 ) ) ;
    public final void ruleBreakStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:2: ( ( ( rule__BreakStatement__Group__0 ) ) )
            // InternalMyDsl.g:967:2: ( ( rule__BreakStatement__Group__0 ) )
            {
            // InternalMyDsl.g:967:2: ( ( rule__BreakStatement__Group__0 ) )
            // InternalMyDsl.g:968:3: ( rule__BreakStatement__Group__0 )
            {
             before(grammarAccess.getBreakStatementAccess().getGroup()); 
            // InternalMyDsl.g:969:3: ( rule__BreakStatement__Group__0 )
            // InternalMyDsl.g:969:4: rule__BreakStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BreakStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBreakStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleBreakStatement"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalMyDsl.g:978:1: entryRuleFunctionDeclaration : ruleFunctionDeclaration EOF ;
    public final void entryRuleFunctionDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:979:1: ( ruleFunctionDeclaration EOF )
            // InternalMyDsl.g:980:1: ruleFunctionDeclaration EOF
            {
             before(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionDeclaration();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalMyDsl.g:987:1: ruleFunctionDeclaration : ( ( rule__FunctionDeclaration__Group__0 ) ) ;
    public final void ruleFunctionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:2: ( ( ( rule__FunctionDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:992:2: ( ( rule__FunctionDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:992:2: ( ( rule__FunctionDeclaration__Group__0 ) )
            // InternalMyDsl.g:993:3: ( rule__FunctionDeclaration__Group__0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:994:3: ( rule__FunctionDeclaration__Group__0 )
            // InternalMyDsl.g:994:4: rule__FunctionDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalMyDsl.g:1003:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalMyDsl.g:1004:1: ( ruleFunctionCall EOF )
            // InternalMyDsl.g:1005:1: ruleFunctionCall EOF
            {
             before(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalMyDsl.g:1012:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalMyDsl.g:1017:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalMyDsl.g:1017:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalMyDsl.g:1018:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalMyDsl.g:1019:3: ( rule__FunctionCall__Group__0 )
            // InternalMyDsl.g:1019:4: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleFunctionReturn"
    // InternalMyDsl.g:1028:1: entryRuleFunctionReturn : ruleFunctionReturn EOF ;
    public final void entryRuleFunctionReturn() throws RecognitionException {
        try {
            // InternalMyDsl.g:1029:1: ( ruleFunctionReturn EOF )
            // InternalMyDsl.g:1030:1: ruleFunctionReturn EOF
            {
             before(grammarAccess.getFunctionReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionReturn();

            state._fsp--;

             after(grammarAccess.getFunctionReturnRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionReturn"


    // $ANTLR start "ruleFunctionReturn"
    // InternalMyDsl.g:1037:1: ruleFunctionReturn : ( ( rule__FunctionReturn__Group__0 ) ) ;
    public final void ruleFunctionReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:2: ( ( ( rule__FunctionReturn__Group__0 ) ) )
            // InternalMyDsl.g:1042:2: ( ( rule__FunctionReturn__Group__0 ) )
            {
            // InternalMyDsl.g:1042:2: ( ( rule__FunctionReturn__Group__0 ) )
            // InternalMyDsl.g:1043:3: ( rule__FunctionReturn__Group__0 )
            {
             before(grammarAccess.getFunctionReturnAccess().getGroup()); 
            // InternalMyDsl.g:1044:3: ( rule__FunctionReturn__Group__0 )
            // InternalMyDsl.g:1044:4: rule__FunctionReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReturn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionReturnAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionReturn"


    // $ANTLR start "entryRuleConsoleLogStatement"
    // InternalMyDsl.g:1053:1: entryRuleConsoleLogStatement : ruleConsoleLogStatement EOF ;
    public final void entryRuleConsoleLogStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:1054:1: ( ruleConsoleLogStatement EOF )
            // InternalMyDsl.g:1055:1: ruleConsoleLogStatement EOF
            {
             before(grammarAccess.getConsoleLogStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleConsoleLogStatement();

            state._fsp--;

             after(grammarAccess.getConsoleLogStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConsoleLogStatement"


    // $ANTLR start "ruleConsoleLogStatement"
    // InternalMyDsl.g:1062:1: ruleConsoleLogStatement : ( ( rule__ConsoleLogStatement__Group__0 ) ) ;
    public final void ruleConsoleLogStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:2: ( ( ( rule__ConsoleLogStatement__Group__0 ) ) )
            // InternalMyDsl.g:1067:2: ( ( rule__ConsoleLogStatement__Group__0 ) )
            {
            // InternalMyDsl.g:1067:2: ( ( rule__ConsoleLogStatement__Group__0 ) )
            // InternalMyDsl.g:1068:3: ( rule__ConsoleLogStatement__Group__0 )
            {
             before(grammarAccess.getConsoleLogStatementAccess().getGroup()); 
            // InternalMyDsl.g:1069:3: ( rule__ConsoleLogStatement__Group__0 )
            // InternalMyDsl.g:1069:4: rule__ConsoleLogStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConsoleLogStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConsoleLogStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleConsoleLogStatement"


    // $ANTLR start "entryRuleTryCatchStatement"
    // InternalMyDsl.g:1078:1: entryRuleTryCatchStatement : ruleTryCatchStatement EOF ;
    public final void entryRuleTryCatchStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:1079:1: ( ruleTryCatchStatement EOF )
            // InternalMyDsl.g:1080:1: ruleTryCatchStatement EOF
            {
             before(grammarAccess.getTryCatchStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleTryCatchStatement();

            state._fsp--;

             after(grammarAccess.getTryCatchStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTryCatchStatement"


    // $ANTLR start "ruleTryCatchStatement"
    // InternalMyDsl.g:1087:1: ruleTryCatchStatement : ( ( rule__TryCatchStatement__Group__0 ) ) ;
    public final void ruleTryCatchStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:2: ( ( ( rule__TryCatchStatement__Group__0 ) ) )
            // InternalMyDsl.g:1092:2: ( ( rule__TryCatchStatement__Group__0 ) )
            {
            // InternalMyDsl.g:1092:2: ( ( rule__TryCatchStatement__Group__0 ) )
            // InternalMyDsl.g:1093:3: ( rule__TryCatchStatement__Group__0 )
            {
             before(grammarAccess.getTryCatchStatementAccess().getGroup()); 
            // InternalMyDsl.g:1094:3: ( rule__TryCatchStatement__Group__0 )
            // InternalMyDsl.g:1094:4: rule__TryCatchStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TryCatchStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTryCatchStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleTryCatchStatement"


    // $ANTLR start "entryRuleSwitchStatement"
    // InternalMyDsl.g:1103:1: entryRuleSwitchStatement : ruleSwitchStatement EOF ;
    public final void entryRuleSwitchStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:1104:1: ( ruleSwitchStatement EOF )
            // InternalMyDsl.g:1105:1: ruleSwitchStatement EOF
            {
             before(grammarAccess.getSwitchStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSwitchStatement();

            state._fsp--;

             after(grammarAccess.getSwitchStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSwitchStatement"


    // $ANTLR start "ruleSwitchStatement"
    // InternalMyDsl.g:1112:1: ruleSwitchStatement : ( ( rule__SwitchStatement__Group__0 ) ) ;
    public final void ruleSwitchStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:2: ( ( ( rule__SwitchStatement__Group__0 ) ) )
            // InternalMyDsl.g:1117:2: ( ( rule__SwitchStatement__Group__0 ) )
            {
            // InternalMyDsl.g:1117:2: ( ( rule__SwitchStatement__Group__0 ) )
            // InternalMyDsl.g:1118:3: ( rule__SwitchStatement__Group__0 )
            {
             before(grammarAccess.getSwitchStatementAccess().getGroup()); 
            // InternalMyDsl.g:1119:3: ( rule__SwitchStatement__Group__0 )
            // InternalMyDsl.g:1119:4: rule__SwitchStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSwitchStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleSwitchStatement"


    // $ANTLR start "entryRuleCase"
    // InternalMyDsl.g:1128:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalMyDsl.g:1129:1: ( ruleCase EOF )
            // InternalMyDsl.g:1130:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getCaseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalMyDsl.g:1137:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:2: ( ( ( rule__Case__Group__0 ) ) )
            // InternalMyDsl.g:1142:2: ( ( rule__Case__Group__0 ) )
            {
            // InternalMyDsl.g:1142:2: ( ( rule__Case__Group__0 ) )
            // InternalMyDsl.g:1143:3: ( rule__Case__Group__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup()); 
            // InternalMyDsl.g:1144:3: ( rule__Case__Group__0 )
            // InternalMyDsl.g:1144:4: rule__Case__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup()); 

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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleDefault"
    // InternalMyDsl.g:1153:1: entryRuleDefault : ruleDefault EOF ;
    public final void entryRuleDefault() throws RecognitionException {
        try {
            // InternalMyDsl.g:1154:1: ( ruleDefault EOF )
            // InternalMyDsl.g:1155:1: ruleDefault EOF
            {
             before(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            ruleDefault();

            state._fsp--;

             after(grammarAccess.getDefaultRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalMyDsl.g:1162:1: ruleDefault : ( ( rule__Default__Group__0 ) ) ;
    public final void ruleDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:2: ( ( ( rule__Default__Group__0 ) ) )
            // InternalMyDsl.g:1167:2: ( ( rule__Default__Group__0 ) )
            {
            // InternalMyDsl.g:1167:2: ( ( rule__Default__Group__0 ) )
            // InternalMyDsl.g:1168:3: ( rule__Default__Group__0 )
            {
             before(grammarAccess.getDefaultAccess().getGroup()); 
            // InternalMyDsl.g:1169:3: ( rule__Default__Group__0 )
            // InternalMyDsl.g:1169:4: rule__Default__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Default__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultAccess().getGroup()); 

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
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleStringManipulationStatement"
    // InternalMyDsl.g:1178:1: entryRuleStringManipulationStatement : ruleStringManipulationStatement EOF ;
    public final void entryRuleStringManipulationStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:1179:1: ( ruleStringManipulationStatement EOF )
            // InternalMyDsl.g:1180:1: ruleStringManipulationStatement EOF
            {
             before(grammarAccess.getStringManipulationStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStringManipulationStatement();

            state._fsp--;

             after(grammarAccess.getStringManipulationStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringManipulationStatement"


    // $ANTLR start "ruleStringManipulationStatement"
    // InternalMyDsl.g:1187:1: ruleStringManipulationStatement : ( ( rule__StringManipulationStatement__Group__0 ) ) ;
    public final void ruleStringManipulationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1191:2: ( ( ( rule__StringManipulationStatement__Group__0 ) ) )
            // InternalMyDsl.g:1192:2: ( ( rule__StringManipulationStatement__Group__0 ) )
            {
            // InternalMyDsl.g:1192:2: ( ( rule__StringManipulationStatement__Group__0 ) )
            // InternalMyDsl.g:1193:3: ( rule__StringManipulationStatement__Group__0 )
            {
             before(grammarAccess.getStringManipulationStatementAccess().getGroup()); 
            // InternalMyDsl.g:1194:3: ( rule__StringManipulationStatement__Group__0 )
            // InternalMyDsl.g:1194:4: rule__StringManipulationStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringManipulationStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringManipulationStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleStringManipulationStatement"


    // $ANTLR start "entryRuleStringManipulationFunctionCall"
    // InternalMyDsl.g:1203:1: entryRuleStringManipulationFunctionCall : ruleStringManipulationFunctionCall EOF ;
    public final void entryRuleStringManipulationFunctionCall() throws RecognitionException {
        try {
            // InternalMyDsl.g:1204:1: ( ruleStringManipulationFunctionCall EOF )
            // InternalMyDsl.g:1205:1: ruleStringManipulationFunctionCall EOF
            {
             before(grammarAccess.getStringManipulationFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleStringManipulationFunctionCall();

            state._fsp--;

             after(grammarAccess.getStringManipulationFunctionCallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringManipulationFunctionCall"


    // $ANTLR start "ruleStringManipulationFunctionCall"
    // InternalMyDsl.g:1212:1: ruleStringManipulationFunctionCall : ( ( rule__StringManipulationFunctionCall__Alternatives ) ) ;
    public final void ruleStringManipulationFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:2: ( ( ( rule__StringManipulationFunctionCall__Alternatives ) ) )
            // InternalMyDsl.g:1217:2: ( ( rule__StringManipulationFunctionCall__Alternatives ) )
            {
            // InternalMyDsl.g:1217:2: ( ( rule__StringManipulationFunctionCall__Alternatives ) )
            // InternalMyDsl.g:1218:3: ( rule__StringManipulationFunctionCall__Alternatives )
            {
             before(grammarAccess.getStringManipulationFunctionCallAccess().getAlternatives()); 
            // InternalMyDsl.g:1219:3: ( rule__StringManipulationFunctionCall__Alternatives )
            // InternalMyDsl.g:1219:4: rule__StringManipulationFunctionCall__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringManipulationFunctionCall__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringManipulationFunctionCallAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStringManipulationFunctionCall"


    // $ANTLR start "entryRuleSplitFunctionCall"
    // InternalMyDsl.g:1228:1: entryRuleSplitFunctionCall : ruleSplitFunctionCall EOF ;
    public final void entryRuleSplitFunctionCall() throws RecognitionException {
        try {
            // InternalMyDsl.g:1229:1: ( ruleSplitFunctionCall EOF )
            // InternalMyDsl.g:1230:1: ruleSplitFunctionCall EOF
            {
             before(grammarAccess.getSplitFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleSplitFunctionCall();

            state._fsp--;

             after(grammarAccess.getSplitFunctionCallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSplitFunctionCall"


    // $ANTLR start "ruleSplitFunctionCall"
    // InternalMyDsl.g:1237:1: ruleSplitFunctionCall : ( ( rule__SplitFunctionCall__Group__0 ) ) ;
    public final void ruleSplitFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1241:2: ( ( ( rule__SplitFunctionCall__Group__0 ) ) )
            // InternalMyDsl.g:1242:2: ( ( rule__SplitFunctionCall__Group__0 ) )
            {
            // InternalMyDsl.g:1242:2: ( ( rule__SplitFunctionCall__Group__0 ) )
            // InternalMyDsl.g:1243:3: ( rule__SplitFunctionCall__Group__0 )
            {
             before(grammarAccess.getSplitFunctionCallAccess().getGroup()); 
            // InternalMyDsl.g:1244:3: ( rule__SplitFunctionCall__Group__0 )
            // InternalMyDsl.g:1244:4: rule__SplitFunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SplitFunctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSplitFunctionCallAccess().getGroup()); 

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
    // $ANTLR end "ruleSplitFunctionCall"


    // $ANTLR start "entryRuleJoinFunctionCall"
    // InternalMyDsl.g:1253:1: entryRuleJoinFunctionCall : ruleJoinFunctionCall EOF ;
    public final void entryRuleJoinFunctionCall() throws RecognitionException {
        try {
            // InternalMyDsl.g:1254:1: ( ruleJoinFunctionCall EOF )
            // InternalMyDsl.g:1255:1: ruleJoinFunctionCall EOF
            {
             before(grammarAccess.getJoinFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleJoinFunctionCall();

            state._fsp--;

             after(grammarAccess.getJoinFunctionCallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJoinFunctionCall"


    // $ANTLR start "ruleJoinFunctionCall"
    // InternalMyDsl.g:1262:1: ruleJoinFunctionCall : ( ( rule__JoinFunctionCall__Group__0 ) ) ;
    public final void ruleJoinFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:2: ( ( ( rule__JoinFunctionCall__Group__0 ) ) )
            // InternalMyDsl.g:1267:2: ( ( rule__JoinFunctionCall__Group__0 ) )
            {
            // InternalMyDsl.g:1267:2: ( ( rule__JoinFunctionCall__Group__0 ) )
            // InternalMyDsl.g:1268:3: ( rule__JoinFunctionCall__Group__0 )
            {
             before(grammarAccess.getJoinFunctionCallAccess().getGroup()); 
            // InternalMyDsl.g:1269:3: ( rule__JoinFunctionCall__Group__0 )
            // InternalMyDsl.g:1269:4: rule__JoinFunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JoinFunctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinFunctionCallAccess().getGroup()); 

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
    // $ANTLR end "ruleJoinFunctionCall"


    // $ANTLR start "entryRuleSliceFunctionCall"
    // InternalMyDsl.g:1278:1: entryRuleSliceFunctionCall : ruleSliceFunctionCall EOF ;
    public final void entryRuleSliceFunctionCall() throws RecognitionException {
        try {
            // InternalMyDsl.g:1279:1: ( ruleSliceFunctionCall EOF )
            // InternalMyDsl.g:1280:1: ruleSliceFunctionCall EOF
            {
             before(grammarAccess.getSliceFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleSliceFunctionCall();

            state._fsp--;

             after(grammarAccess.getSliceFunctionCallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSliceFunctionCall"


    // $ANTLR start "ruleSliceFunctionCall"
    // InternalMyDsl.g:1287:1: ruleSliceFunctionCall : ( ( rule__SliceFunctionCall__Group__0 ) ) ;
    public final void ruleSliceFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:2: ( ( ( rule__SliceFunctionCall__Group__0 ) ) )
            // InternalMyDsl.g:1292:2: ( ( rule__SliceFunctionCall__Group__0 ) )
            {
            // InternalMyDsl.g:1292:2: ( ( rule__SliceFunctionCall__Group__0 ) )
            // InternalMyDsl.g:1293:3: ( rule__SliceFunctionCall__Group__0 )
            {
             before(grammarAccess.getSliceFunctionCallAccess().getGroup()); 
            // InternalMyDsl.g:1294:3: ( rule__SliceFunctionCall__Group__0 )
            // InternalMyDsl.g:1294:4: rule__SliceFunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SliceFunctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSliceFunctionCallAccess().getGroup()); 

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
    // $ANTLR end "ruleSliceFunctionCall"


    // $ANTLR start "entryRuleThrowStatement"
    // InternalMyDsl.g:1303:1: entryRuleThrowStatement : ruleThrowStatement EOF ;
    public final void entryRuleThrowStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:1304:1: ( ruleThrowStatement EOF )
            // InternalMyDsl.g:1305:1: ruleThrowStatement EOF
            {
             before(grammarAccess.getThrowStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleThrowStatement();

            state._fsp--;

             after(grammarAccess.getThrowStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleThrowStatement"


    // $ANTLR start "ruleThrowStatement"
    // InternalMyDsl.g:1312:1: ruleThrowStatement : ( ( rule__ThrowStatement__Group__0 ) ) ;
    public final void ruleThrowStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1316:2: ( ( ( rule__ThrowStatement__Group__0 ) ) )
            // InternalMyDsl.g:1317:2: ( ( rule__ThrowStatement__Group__0 ) )
            {
            // InternalMyDsl.g:1317:2: ( ( rule__ThrowStatement__Group__0 ) )
            // InternalMyDsl.g:1318:3: ( rule__ThrowStatement__Group__0 )
            {
             before(grammarAccess.getThrowStatementAccess().getGroup()); 
            // InternalMyDsl.g:1319:3: ( rule__ThrowStatement__Group__0 )
            // InternalMyDsl.g:1319:4: rule__ThrowStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ThrowStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThrowStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleThrowStatement"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:1328:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1332:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:1333:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:1333:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:1334:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:1335:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:1335:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Import__Alternatives_1_0"
    // InternalMyDsl.g:1343:1: rule__Import__Alternatives_1_0 : ( ( ( rule__Import__Group_1_0_0__0 ) ) | ( ( rule__Import__Group_1_0_1__0 ) ) );
    public final void rule__Import__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1347:1: ( ( ( rule__Import__Group_1_0_0__0 ) ) | ( ( rule__Import__Group_1_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)||LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==51) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:1348:2: ( ( rule__Import__Group_1_0_0__0 ) )
                    {
                    // InternalMyDsl.g:1348:2: ( ( rule__Import__Group_1_0_0__0 ) )
                    // InternalMyDsl.g:1349:3: ( rule__Import__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getImportAccess().getGroup_1_0_0()); 
                    // InternalMyDsl.g:1350:3: ( rule__Import__Group_1_0_0__0 )
                    // InternalMyDsl.g:1350:4: rule__Import__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1354:2: ( ( rule__Import__Group_1_0_1__0 ) )
                    {
                    // InternalMyDsl.g:1354:2: ( ( rule__Import__Group_1_0_1__0 ) )
                    // InternalMyDsl.g:1355:3: ( rule__Import__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getImportAccess().getGroup_1_0_1()); 
                    // InternalMyDsl.g:1356:3: ( rule__Import__Group_1_0_1__0 )
                    // InternalMyDsl.g:1356:4: rule__Import__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Import__Alternatives_1_0"


    // $ANTLR start "rule__ImportElement__ElementAlternatives_0_0"
    // InternalMyDsl.g:1364:1: rule__ImportElement__ElementAlternatives_0_0 : ( ( RULE_ID ) | ( '*' ) | ( RULE_STRING ) );
    public final void rule__ImportElement__ElementAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1368:1: ( ( RULE_ID ) | ( '*' ) | ( RULE_STRING ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1369:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:1369:2: ( RULE_ID )
                    // InternalMyDsl.g:1370:3: RULE_ID
                    {
                     before(grammarAccess.getImportElementAccess().getElementIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getImportElementAccess().getElementIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1375:2: ( '*' )
                    {
                    // InternalMyDsl.g:1375:2: ( '*' )
                    // InternalMyDsl.g:1376:3: '*'
                    {
                     before(grammarAccess.getImportElementAccess().getElementAsteriskKeyword_0_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getImportElementAccess().getElementAsteriskKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1381:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:1381:2: ( RULE_STRING )
                    // InternalMyDsl.g:1382:3: RULE_STRING
                    {
                     before(grammarAccess.getImportElementAccess().getElementSTRINGTerminalRuleCall_0_0_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getImportElementAccess().getElementSTRINGTerminalRuleCall_0_0_2()); 

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
    // $ANTLR end "rule__ImportElement__ElementAlternatives_0_0"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyDsl.g:1391:1: rule__Statement__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleExpressionStatement ) | ( ruleIfStatement ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleContinueStatement ) | ( ruleBreakStatement ) | ( ruleFunctionDeclaration ) | ( ruleFunctionCall ) | ( ruleFunctionReturn ) | ( ruleConsoleLogStatement ) | ( ruleTryCatchStatement ) | ( ruleSwitchStatement ) | ( ruleStringManipulationStatement ) | ( ruleThrowStatement ) | ( ruleImport ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1395:1: ( ( ruleVariableDeclaration ) | ( ruleExpressionStatement ) | ( ruleIfStatement ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleContinueStatement ) | ( ruleBreakStatement ) | ( ruleFunctionDeclaration ) | ( ruleFunctionCall ) | ( ruleFunctionReturn ) | ( ruleConsoleLogStatement ) | ( ruleTryCatchStatement ) | ( ruleSwitchStatement ) | ( ruleStringManipulationStatement ) | ( ruleThrowStatement ) | ( ruleImport ) )
            int alt4=17;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1396:2: ( ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:1396:2: ( ruleVariableDeclaration )
                    // InternalMyDsl.g:1397:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1402:2: ( ruleExpressionStatement )
                    {
                    // InternalMyDsl.g:1402:2: ( ruleExpressionStatement )
                    // InternalMyDsl.g:1403:3: ruleExpressionStatement
                    {
                     before(grammarAccess.getStatementAccess().getExpressionStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getExpressionStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1408:2: ( ruleIfStatement )
                    {
                    // InternalMyDsl.g:1408:2: ( ruleIfStatement )
                    // InternalMyDsl.g:1409:3: ruleIfStatement
                    {
                     before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1414:2: ( ruleForLoop )
                    {
                    // InternalMyDsl.g:1414:2: ( ruleForLoop )
                    // InternalMyDsl.g:1415:3: ruleForLoop
                    {
                     before(grammarAccess.getStatementAccess().getForLoopParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleForLoop();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getForLoopParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1420:2: ( ruleWhileLoop )
                    {
                    // InternalMyDsl.g:1420:2: ( ruleWhileLoop )
                    // InternalMyDsl.g:1421:3: ruleWhileLoop
                    {
                     before(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleWhileLoop();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1426:2: ( ruleDoWhileLoop )
                    {
                    // InternalMyDsl.g:1426:2: ( ruleDoWhileLoop )
                    // InternalMyDsl.g:1427:3: ruleDoWhileLoop
                    {
                     before(grammarAccess.getStatementAccess().getDoWhileLoopParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDoWhileLoop();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDoWhileLoopParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1432:2: ( ruleContinueStatement )
                    {
                    // InternalMyDsl.g:1432:2: ( ruleContinueStatement )
                    // InternalMyDsl.g:1433:3: ruleContinueStatement
                    {
                     before(grammarAccess.getStatementAccess().getContinueStatementParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleContinueStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getContinueStatementParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1438:2: ( ruleBreakStatement )
                    {
                    // InternalMyDsl.g:1438:2: ( ruleBreakStatement )
                    // InternalMyDsl.g:1439:3: ruleBreakStatement
                    {
                     before(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleBreakStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1444:2: ( ruleFunctionDeclaration )
                    {
                    // InternalMyDsl.g:1444:2: ( ruleFunctionDeclaration )
                    // InternalMyDsl.g:1445:3: ruleFunctionDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getFunctionDeclarationParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getFunctionDeclarationParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1450:2: ( ruleFunctionCall )
                    {
                    // InternalMyDsl.g:1450:2: ( ruleFunctionCall )
                    // InternalMyDsl.g:1451:3: ruleFunctionCall
                    {
                     before(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1456:2: ( ruleFunctionReturn )
                    {
                    // InternalMyDsl.g:1456:2: ( ruleFunctionReturn )
                    // InternalMyDsl.g:1457:3: ruleFunctionReturn
                    {
                     before(grammarAccess.getStatementAccess().getFunctionReturnParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionReturn();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getFunctionReturnParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:1462:2: ( ruleConsoleLogStatement )
                    {
                    // InternalMyDsl.g:1462:2: ( ruleConsoleLogStatement )
                    // InternalMyDsl.g:1463:3: ruleConsoleLogStatement
                    {
                     before(grammarAccess.getStatementAccess().getConsoleLogStatementParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleConsoleLogStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConsoleLogStatementParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:1468:2: ( ruleTryCatchStatement )
                    {
                    // InternalMyDsl.g:1468:2: ( ruleTryCatchStatement )
                    // InternalMyDsl.g:1469:3: ruleTryCatchStatement
                    {
                     before(grammarAccess.getStatementAccess().getTryCatchStatementParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleTryCatchStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTryCatchStatementParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:1474:2: ( ruleSwitchStatement )
                    {
                    // InternalMyDsl.g:1474:2: ( ruleSwitchStatement )
                    // InternalMyDsl.g:1475:3: ruleSwitchStatement
                    {
                     before(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleSwitchStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:1480:2: ( ruleStringManipulationStatement )
                    {
                    // InternalMyDsl.g:1480:2: ( ruleStringManipulationStatement )
                    // InternalMyDsl.g:1481:3: ruleStringManipulationStatement
                    {
                     before(grammarAccess.getStatementAccess().getStringManipulationStatementParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleStringManipulationStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStringManipulationStatementParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalMyDsl.g:1486:2: ( ruleThrowStatement )
                    {
                    // InternalMyDsl.g:1486:2: ( ruleThrowStatement )
                    // InternalMyDsl.g:1487:3: ruleThrowStatement
                    {
                     before(grammarAccess.getStatementAccess().getThrowStatementParserRuleCall_15()); 
                    pushFollow(FOLLOW_2);
                    ruleThrowStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getThrowStatementParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalMyDsl.g:1492:2: ( ruleImport )
                    {
                    // InternalMyDsl.g:1492:2: ( ruleImport )
                    // InternalMyDsl.g:1493:3: ruleImport
                    {
                     before(grammarAccess.getStatementAccess().getImportParserRuleCall_16()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getImportParserRuleCall_16()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:1502:1: rule__Expression__Alternatives : ( ( ruleLogicalExpression ) | ( rulePostfixOperator ) | ( rulePrefixOperator ) | ( ruleAugmentedAssignment ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1506:1: ( ( ruleLogicalExpression ) | ( rulePostfixOperator ) | ( rulePrefixOperator ) | ( ruleAugmentedAssignment ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_NOT:
            case RULE_CHAR:
            case 17:
            case 18:
            case 19:
            case 55:
            case 57:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 13:
                case 14:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 50:
                case 54:
                case 56:
                case 72:
                    {
                    alt5=1;
                    }
                    break;
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                    {
                    alt5=4;
                    }
                    break;
                case 15:
                case 16:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }

                }
                break;
            case 15:
            case 16:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1507:2: ( ruleLogicalExpression )
                    {
                    // InternalMyDsl.g:1507:2: ( ruleLogicalExpression )
                    // InternalMyDsl.g:1508:3: ruleLogicalExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLogicalExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLogicalExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLogicalExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1513:2: ( rulePostfixOperator )
                    {
                    // InternalMyDsl.g:1513:2: ( rulePostfixOperator )
                    // InternalMyDsl.g:1514:3: rulePostfixOperator
                    {
                     before(grammarAccess.getExpressionAccess().getPostfixOperatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePostfixOperator();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getPostfixOperatorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1519:2: ( rulePrefixOperator )
                    {
                    // InternalMyDsl.g:1519:2: ( rulePrefixOperator )
                    // InternalMyDsl.g:1520:3: rulePrefixOperator
                    {
                     before(grammarAccess.getExpressionAccess().getPrefixOperatorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrefixOperator();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getPrefixOperatorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1525:2: ( ruleAugmentedAssignment )
                    {
                    // InternalMyDsl.g:1525:2: ( ruleAugmentedAssignment )
                    // InternalMyDsl.g:1526:3: ruleAugmentedAssignment
                    {
                     before(grammarAccess.getExpressionAccess().getAugmentedAssignmentParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAugmentedAssignment();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getAugmentedAssignmentParserRuleCall_3()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMyDsl.g:1535:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleCharLiteral ) | ( ruleVariableReference ) | ( ruleAnonymousFunction ) | ( ruleBoolean ) | ( ruleNotBoolean ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1539:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleCharLiteral ) | ( ruleVariableReference ) | ( ruleAnonymousFunction ) | ( ruleBoolean ) | ( ruleNotBoolean ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case RULE_CHAR:
                {
                alt6=4;
                }
                break;
            case RULE_ID:
                {
                alt6=5;
                }
                break;
            case 57:
                {
                alt6=6;
                }
                break;
            case 17:
            case 18:
            case 19:
                {
                alt6=7;
                }
                break;
            case RULE_NOT:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1540:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1540:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMyDsl.g:1541:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMyDsl.g:1542:3: ( rule__Primary__Group_0__0 )
                    // InternalMyDsl.g:1542:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1546:2: ( ruleNumberLiteral )
                    {
                    // InternalMyDsl.g:1546:2: ( ruleNumberLiteral )
                    // InternalMyDsl.g:1547:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1552:2: ( ruleStringLiteral )
                    {
                    // InternalMyDsl.g:1552:2: ( ruleStringLiteral )
                    // InternalMyDsl.g:1553:3: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1558:2: ( ruleCharLiteral )
                    {
                    // InternalMyDsl.g:1558:2: ( ruleCharLiteral )
                    // InternalMyDsl.g:1559:3: ruleCharLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getCharLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCharLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getCharLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1564:2: ( ruleVariableReference )
                    {
                    // InternalMyDsl.g:1564:2: ( ruleVariableReference )
                    // InternalMyDsl.g:1565:3: ruleVariableReference
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableReferenceParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableReference();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableReferenceParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1570:2: ( ruleAnonymousFunction )
                    {
                    // InternalMyDsl.g:1570:2: ( ruleAnonymousFunction )
                    // InternalMyDsl.g:1571:3: ruleAnonymousFunction
                    {
                     before(grammarAccess.getPrimaryAccess().getAnonymousFunctionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAnonymousFunction();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAnonymousFunctionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1576:2: ( ruleBoolean )
                    {
                    // InternalMyDsl.g:1576:2: ( ruleBoolean )
                    // InternalMyDsl.g:1577:3: ruleBoolean
                    {
                     before(grammarAccess.getPrimaryAccess().getBooleanParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getBooleanParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1582:2: ( ruleNotBoolean )
                    {
                    // InternalMyDsl.g:1582:2: ( ruleNotBoolean )
                    // InternalMyDsl.g:1583:3: ruleNotBoolean
                    {
                     before(grammarAccess.getPrimaryAccess().getNotBooleanParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleNotBoolean();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNotBooleanParserRuleCall_7()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__PostfixOperator__Alternatives_1"
    // InternalMyDsl.g:1592:1: rule__PostfixOperator__Alternatives_1 : ( ( '++' ) | ( '--' ) );
    public final void rule__PostfixOperator__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1596:1: ( ( '++' ) | ( '--' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1597:2: ( '++' )
                    {
                    // InternalMyDsl.g:1597:2: ( '++' )
                    // InternalMyDsl.g:1598:3: '++'
                    {
                     before(grammarAccess.getPostfixOperatorAccess().getPlusSignPlusSignKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPostfixOperatorAccess().getPlusSignPlusSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1603:2: ( '--' )
                    {
                    // InternalMyDsl.g:1603:2: ( '--' )
                    // InternalMyDsl.g:1604:3: '--'
                    {
                     before(grammarAccess.getPostfixOperatorAccess().getHyphenMinusHyphenMinusKeyword_1_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPostfixOperatorAccess().getHyphenMinusHyphenMinusKeyword_1_1()); 

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
    // $ANTLR end "rule__PostfixOperator__Alternatives_1"


    // $ANTLR start "rule__PrefixOperator__Alternatives_0"
    // InternalMyDsl.g:1613:1: rule__PrefixOperator__Alternatives_0 : ( ( '++' ) | ( '--' ) );
    public final void rule__PrefixOperator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1617:1: ( ( '++' ) | ( '--' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1618:2: ( '++' )
                    {
                    // InternalMyDsl.g:1618:2: ( '++' )
                    // InternalMyDsl.g:1619:3: '++'
                    {
                     before(grammarAccess.getPrefixOperatorAccess().getPlusSignPlusSignKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPrefixOperatorAccess().getPlusSignPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1624:2: ( '--' )
                    {
                    // InternalMyDsl.g:1624:2: ( '--' )
                    // InternalMyDsl.g:1625:3: '--'
                    {
                     before(grammarAccess.getPrefixOperatorAccess().getHyphenMinusHyphenMinusKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPrefixOperatorAccess().getHyphenMinusHyphenMinusKeyword_0_1()); 

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
    // $ANTLR end "rule__PrefixOperator__Alternatives_0"


    // $ANTLR start "rule__Boolean__ValueAlternatives_1_0"
    // InternalMyDsl.g:1634:1: rule__Boolean__ValueAlternatives_1_0 : ( ( 'true' ) | ( 'false' ) | ( 'null' ) );
    public final void rule__Boolean__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( ( 'true' ) | ( 'false' ) | ( 'null' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 19:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1639:2: ( 'true' )
                    {
                    // InternalMyDsl.g:1639:2: ( 'true' )
                    // InternalMyDsl.g:1640:3: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getValueTrueKeyword_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getValueTrueKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1645:2: ( 'false' )
                    {
                    // InternalMyDsl.g:1645:2: ( 'false' )
                    // InternalMyDsl.g:1646:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getValueFalseKeyword_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getValueFalseKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1651:2: ( 'null' )
                    {
                    // InternalMyDsl.g:1651:2: ( 'null' )
                    // InternalMyDsl.g:1652:3: 'null'
                    {
                     before(grammarAccess.getBooleanAccess().getValueNullKeyword_1_0_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getValueNullKeyword_1_0_2()); 

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
    // $ANTLR end "rule__Boolean__ValueAlternatives_1_0"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // InternalMyDsl.g:1661:1: rule__ComparisonOperator__Alternatives : ( ( '<=' ) | ( '<' ) | ( '>=' ) | ( '>' ) | ( '!=' ) | ( '==' ) | ( '=' ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1665:1: ( ( '<=' ) | ( '<' ) | ( '>=' ) | ( '>' ) | ( '!=' ) | ( '==' ) | ( '=' ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            case 24:
                {
                alt10=5;
                }
                break;
            case 25:
                {
                alt10=6;
                }
                break;
            case 26:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1666:2: ( '<=' )
                    {
                    // InternalMyDsl.g:1666:2: ( '<=' )
                    // InternalMyDsl.g:1667:3: '<='
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1672:2: ( '<' )
                    {
                    // InternalMyDsl.g:1672:2: ( '<' )
                    // InternalMyDsl.g:1673:3: '<'
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1678:2: ( '>=' )
                    {
                    // InternalMyDsl.g:1678:2: ( '>=' )
                    // InternalMyDsl.g:1679:3: '>='
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1684:2: ( '>' )
                    {
                    // InternalMyDsl.g:1684:2: ( '>' )
                    // InternalMyDsl.g:1685:3: '>'
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1690:2: ( '!=' )
                    {
                    // InternalMyDsl.g:1690:2: ( '!=' )
                    // InternalMyDsl.g:1691:3: '!='
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1696:2: ( '==' )
                    {
                    // InternalMyDsl.g:1696:2: ( '==' )
                    // InternalMyDsl.g:1697:3: '=='
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_5()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1702:2: ( '=' )
                    {
                    // InternalMyDsl.g:1702:2: ( '=' )
                    // InternalMyDsl.g:1703:3: '='
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEqualsSignKeyword_6()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getComparisonOperatorAccess().getEqualsSignKeyword_6()); 

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
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__LogicalOperator__Alternatives"
    // InternalMyDsl.g:1712:1: rule__LogicalOperator__Alternatives : ( ( '&&' ) | ( '||' ) );
    public final void rule__LogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1716:1: ( ( '&&' ) | ( '||' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1717:2: ( '&&' )
                    {
                    // InternalMyDsl.g:1717:2: ( '&&' )
                    // InternalMyDsl.g:1718:3: '&&'
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getAmpersandAmpersandKeyword_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getLogicalOperatorAccess().getAmpersandAmpersandKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1723:2: ( '||' )
                    {
                    // InternalMyDsl.g:1723:2: ( '||' )
                    // InternalMyDsl.g:1724:3: '||'
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getVerticalLineVerticalLineKeyword_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getLogicalOperatorAccess().getVerticalLineVerticalLineKeyword_1()); 

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
    // $ANTLR end "rule__LogicalOperator__Alternatives"


    // $ANTLR start "rule__MultiplicationOperator__Alternatives"
    // InternalMyDsl.g:1733:1: rule__MultiplicationOperator__Alternatives : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__MultiplicationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1737:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1738:2: ( '*' )
                    {
                    // InternalMyDsl.g:1738:2: ( '*' )
                    // InternalMyDsl.g:1739:3: '*'
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getAsteriskKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationOperatorAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1744:2: ( '/' )
                    {
                    // InternalMyDsl.g:1744:2: ( '/' )
                    // InternalMyDsl.g:1745:3: '/'
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getSolidusKeyword_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationOperatorAccess().getSolidusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1750:2: ( '%' )
                    {
                    // InternalMyDsl.g:1750:2: ( '%' )
                    // InternalMyDsl.g:1751:3: '%'
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getPercentSignKeyword_2()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationOperatorAccess().getPercentSignKeyword_2()); 

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
    // $ANTLR end "rule__MultiplicationOperator__Alternatives"


    // $ANTLR start "rule__ArithmeticOperator__Alternatives"
    // InternalMyDsl.g:1760:1: rule__ArithmeticOperator__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__ArithmeticOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1764:1: ( ( '+' ) | ( '-' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1765:2: ( '+' )
                    {
                    // InternalMyDsl.g:1765:2: ( '+' )
                    // InternalMyDsl.g:1766:3: '+'
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getArithmeticOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1771:2: ( '-' )
                    {
                    // InternalMyDsl.g:1771:2: ( '-' )
                    // InternalMyDsl.g:1772:3: '-'
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getArithmeticOperatorAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__ArithmeticOperator__Alternatives"


    // $ANTLR start "rule__AugmentedOperator__Alternatives"
    // InternalMyDsl.g:1781:1: rule__AugmentedOperator__Alternatives : ( ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '**=' ) );
    public final void rule__AugmentedOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1785:1: ( ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '**=' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 35:
                {
                alt14=3;
                }
                break;
            case 36:
                {
                alt14=4;
                }
                break;
            case 37:
                {
                alt14=5;
                }
                break;
            case 38:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1786:2: ( '+=' )
                    {
                    // InternalMyDsl.g:1786:2: ( '+=' )
                    // InternalMyDsl.g:1787:3: '+='
                    {
                     before(grammarAccess.getAugmentedOperatorAccess().getPlusSignEqualsSignKeyword_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getAugmentedOperatorAccess().getPlusSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1792:2: ( '-=' )
                    {
                    // InternalMyDsl.g:1792:2: ( '-=' )
                    // InternalMyDsl.g:1793:3: '-='
                    {
                     before(grammarAccess.getAugmentedOperatorAccess().getHyphenMinusEqualsSignKeyword_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getAugmentedOperatorAccess().getHyphenMinusEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1798:2: ( '*=' )
                    {
                    // InternalMyDsl.g:1798:2: ( '*=' )
                    // InternalMyDsl.g:1799:3: '*='
                    {
                     before(grammarAccess.getAugmentedOperatorAccess().getAsteriskEqualsSignKeyword_2()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getAugmentedOperatorAccess().getAsteriskEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1804:2: ( '/=' )
                    {
                    // InternalMyDsl.g:1804:2: ( '/=' )
                    // InternalMyDsl.g:1805:3: '/='
                    {
                     before(grammarAccess.getAugmentedOperatorAccess().getSolidusEqualsSignKeyword_3()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getAugmentedOperatorAccess().getSolidusEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1810:2: ( '%=' )
                    {
                    // InternalMyDsl.g:1810:2: ( '%=' )
                    // InternalMyDsl.g:1811:3: '%='
                    {
                     before(grammarAccess.getAugmentedOperatorAccess().getPercentSignEqualsSignKeyword_4()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getAugmentedOperatorAccess().getPercentSignEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1816:2: ( '**=' )
                    {
                    // InternalMyDsl.g:1816:2: ( '**=' )
                    // InternalMyDsl.g:1817:3: '**='
                    {
                     before(grammarAccess.getAugmentedOperatorAccess().getAsteriskAsteriskEqualsSignKeyword_5()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getAugmentedOperatorAccess().getAsteriskAsteriskEqualsSignKeyword_5()); 

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
    // $ANTLR end "rule__AugmentedOperator__Alternatives"


    // $ANTLR start "rule__StringManipulationFunctionCall__Alternatives"
    // InternalMyDsl.g:1826:1: rule__StringManipulationFunctionCall__Alternatives : ( ( ruleSplitFunctionCall ) | ( ruleJoinFunctionCall ) | ( ruleSliceFunctionCall ) );
    public final void rule__StringManipulationFunctionCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1830:1: ( ( ruleSplitFunctionCall ) | ( ruleJoinFunctionCall ) | ( ruleSliceFunctionCall ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt15=1;
                }
                break;
            case 75:
                {
                alt15=2;
                }
                break;
            case 76:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1831:2: ( ruleSplitFunctionCall )
                    {
                    // InternalMyDsl.g:1831:2: ( ruleSplitFunctionCall )
                    // InternalMyDsl.g:1832:3: ruleSplitFunctionCall
                    {
                     before(grammarAccess.getStringManipulationFunctionCallAccess().getSplitFunctionCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSplitFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getStringManipulationFunctionCallAccess().getSplitFunctionCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1837:2: ( ruleJoinFunctionCall )
                    {
                    // InternalMyDsl.g:1837:2: ( ruleJoinFunctionCall )
                    // InternalMyDsl.g:1838:3: ruleJoinFunctionCall
                    {
                     before(grammarAccess.getStringManipulationFunctionCallAccess().getJoinFunctionCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJoinFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getStringManipulationFunctionCallAccess().getJoinFunctionCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1843:2: ( ruleSliceFunctionCall )
                    {
                    // InternalMyDsl.g:1843:2: ( ruleSliceFunctionCall )
                    // InternalMyDsl.g:1844:3: ruleSliceFunctionCall
                    {
                     before(grammarAccess.getStringManipulationFunctionCallAccess().getSliceFunctionCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSliceFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getStringManipulationFunctionCallAccess().getSliceFunctionCallParserRuleCall_2()); 

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
    // $ANTLR end "rule__StringManipulationFunctionCall__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:1853:1: rule__Type__Alternatives : ( ( ( 'int' ) ) | ( ( 'String' ) ) | ( ( 'char' ) ) | ( ( 'let' ) ) | ( ( 'boolean' ) ) | ( ( 'float' ) ) | ( ( 'var' ) ) | ( ( 'const' ) ) | ( ( 'void' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1857:1: ( ( ( 'int' ) ) | ( ( 'String' ) ) | ( ( 'char' ) ) | ( ( 'let' ) ) | ( ( 'boolean' ) ) | ( ( 'float' ) ) | ( ( 'var' ) ) | ( ( 'const' ) ) | ( ( 'void' ) ) )
            int alt16=9;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt16=1;
                }
                break;
            case 40:
                {
                alt16=2;
                }
                break;
            case 41:
                {
                alt16=3;
                }
                break;
            case 42:
                {
                alt16=4;
                }
                break;
            case 43:
                {
                alt16=5;
                }
                break;
            case 44:
                {
                alt16=6;
                }
                break;
            case 45:
                {
                alt16=7;
                }
                break;
            case 46:
                {
                alt16=8;
                }
                break;
            case 47:
                {
                alt16=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1858:2: ( ( 'int' ) )
                    {
                    // InternalMyDsl.g:1858:2: ( ( 'int' ) )
                    // InternalMyDsl.g:1859:3: ( 'int' )
                    {
                     before(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1860:3: ( 'int' )
                    // InternalMyDsl.g:1860:4: 'int'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1864:2: ( ( 'String' ) )
                    {
                    // InternalMyDsl.g:1864:2: ( ( 'String' ) )
                    // InternalMyDsl.g:1865:3: ( 'String' )
                    {
                     before(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1866:3: ( 'String' )
                    // InternalMyDsl.g:1866:4: 'String'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1870:2: ( ( 'char' ) )
                    {
                    // InternalMyDsl.g:1870:2: ( ( 'char' ) )
                    // InternalMyDsl.g:1871:3: ( 'char' )
                    {
                     before(grammarAccess.getTypeAccess().getCharEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1872:3: ( 'char' )
                    // InternalMyDsl.g:1872:4: 'char'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getCharEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1876:2: ( ( 'let' ) )
                    {
                    // InternalMyDsl.g:1876:2: ( ( 'let' ) )
                    // InternalMyDsl.g:1877:3: ( 'let' )
                    {
                     before(grammarAccess.getTypeAccess().getLetEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1878:3: ( 'let' )
                    // InternalMyDsl.g:1878:4: 'let'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getLetEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1882:2: ( ( 'boolean' ) )
                    {
                    // InternalMyDsl.g:1882:2: ( ( 'boolean' ) )
                    // InternalMyDsl.g:1883:3: ( 'boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:1884:3: ( 'boolean' )
                    // InternalMyDsl.g:1884:4: 'boolean'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1888:2: ( ( 'float' ) )
                    {
                    // InternalMyDsl.g:1888:2: ( ( 'float' ) )
                    // InternalMyDsl.g:1889:3: ( 'float' )
                    {
                     before(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:1890:3: ( 'float' )
                    // InternalMyDsl.g:1890:4: 'float'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1894:2: ( ( 'var' ) )
                    {
                    // InternalMyDsl.g:1894:2: ( ( 'var' ) )
                    // InternalMyDsl.g:1895:3: ( 'var' )
                    {
                     before(grammarAccess.getTypeAccess().getVarEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:1896:3: ( 'var' )
                    // InternalMyDsl.g:1896:4: 'var'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getVarEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1900:2: ( ( 'const' ) )
                    {
                    // InternalMyDsl.g:1900:2: ( ( 'const' ) )
                    // InternalMyDsl.g:1901:3: ( 'const' )
                    {
                     before(grammarAccess.getTypeAccess().getConstEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:1902:3: ( 'const' )
                    // InternalMyDsl.g:1902:4: 'const'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getConstEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1906:2: ( ( 'void' ) )
                    {
                    // InternalMyDsl.g:1906:2: ( ( 'void' ) )
                    // InternalMyDsl.g:1907:3: ( 'void' )
                    {
                     before(grammarAccess.getTypeAccess().getVoidEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:1908:3: ( 'void' )
                    // InternalMyDsl.g:1908:4: 'void'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getVoidEnumLiteralDeclaration_8()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMyDsl.g:1916:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1920:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMyDsl.g:1921:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMyDsl.g:1928:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1932:1: ( ( 'import' ) )
            // InternalMyDsl.g:1933:1: ( 'import' )
            {
            // InternalMyDsl.g:1933:1: ( 'import' )
            // InternalMyDsl.g:1934:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMyDsl.g:1943:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1947:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMyDsl.g:1948:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMyDsl.g:1955:1: rule__Import__Group__1__Impl : ( ( rule__Import__Group_1__0 )? ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1959:1: ( ( ( rule__Import__Group_1__0 )? ) )
            // InternalMyDsl.g:1960:1: ( ( rule__Import__Group_1__0 )? )
            {
            // InternalMyDsl.g:1960:1: ( ( rule__Import__Group_1__0 )? )
            // InternalMyDsl.g:1961:2: ( rule__Import__Group_1__0 )?
            {
             before(grammarAccess.getImportAccess().getGroup_1()); 
            // InternalMyDsl.g:1962:2: ( rule__Import__Group_1__0 )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1962:3: rule__Import__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalMyDsl.g:1970:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1974:1: ( rule__Import__Group__2__Impl )
            // InternalMyDsl.g:1975:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalMyDsl.g:1981:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportURIAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1985:1: ( ( ( rule__Import__ImportURIAssignment_2 ) ) )
            // InternalMyDsl.g:1986:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            {
            // InternalMyDsl.g:1986:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            // InternalMyDsl.g:1987:2: ( rule__Import__ImportURIAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_2()); 
            // InternalMyDsl.g:1988:2: ( rule__Import__ImportURIAssignment_2 )
            // InternalMyDsl.g:1988:3: rule__Import__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_2()); 

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
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group_1__0"
    // InternalMyDsl.g:1997:1: rule__Import__Group_1__0 : rule__Import__Group_1__0__Impl rule__Import__Group_1__1 ;
    public final void rule__Import__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2001:1: ( rule__Import__Group_1__0__Impl rule__Import__Group_1__1 )
            // InternalMyDsl.g:2002:2: rule__Import__Group_1__0__Impl rule__Import__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Import__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__0"


    // $ANTLR start "rule__Import__Group_1__0__Impl"
    // InternalMyDsl.g:2009:1: rule__Import__Group_1__0__Impl : ( ( ( rule__Import__Alternatives_1_0 ) ) ( ( rule__Import__Alternatives_1_0 )* ) ) ;
    public final void rule__Import__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2013:1: ( ( ( ( rule__Import__Alternatives_1_0 ) ) ( ( rule__Import__Alternatives_1_0 )* ) ) )
            // InternalMyDsl.g:2014:1: ( ( ( rule__Import__Alternatives_1_0 ) ) ( ( rule__Import__Alternatives_1_0 )* ) )
            {
            // InternalMyDsl.g:2014:1: ( ( ( rule__Import__Alternatives_1_0 ) ) ( ( rule__Import__Alternatives_1_0 )* ) )
            // InternalMyDsl.g:2015:2: ( ( rule__Import__Alternatives_1_0 ) ) ( ( rule__Import__Alternatives_1_0 )* )
            {
            // InternalMyDsl.g:2015:2: ( ( rule__Import__Alternatives_1_0 ) )
            // InternalMyDsl.g:2016:3: ( rule__Import__Alternatives_1_0 )
            {
             before(grammarAccess.getImportAccess().getAlternatives_1_0()); 
            // InternalMyDsl.g:2017:3: ( rule__Import__Alternatives_1_0 )
            // InternalMyDsl.g:2017:4: rule__Import__Alternatives_1_0
            {
            pushFollow(FOLLOW_6);
            rule__Import__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getAlternatives_1_0()); 

            }

            // InternalMyDsl.g:2020:2: ( ( rule__Import__Alternatives_1_0 )* )
            // InternalMyDsl.g:2021:3: ( rule__Import__Alternatives_1_0 )*
            {
             before(grammarAccess.getImportAccess().getAlternatives_1_0()); 
            // InternalMyDsl.g:2022:3: ( rule__Import__Alternatives_1_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||LA18_0==14||LA18_0==51) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2022:4: rule__Import__Alternatives_1_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Import__Alternatives_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getImportAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Import__Group_1__0__Impl"


    // $ANTLR start "rule__Import__Group_1__1"
    // InternalMyDsl.g:2031:1: rule__Import__Group_1__1 : rule__Import__Group_1__1__Impl ;
    public final void rule__Import__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2035:1: ( rule__Import__Group_1__1__Impl )
            // InternalMyDsl.g:2036:2: rule__Import__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__1"


    // $ANTLR start "rule__Import__Group_1__1__Impl"
    // InternalMyDsl.g:2042:1: rule__Import__Group_1__1__Impl : ( 'from' ) ;
    public final void rule__Import__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2046:1: ( ( 'from' ) )
            // InternalMyDsl.g:2047:1: ( 'from' )
            {
            // InternalMyDsl.g:2047:1: ( 'from' )
            // InternalMyDsl.g:2048:2: 'from'
            {
             before(grammarAccess.getImportAccess().getFromKeyword_1_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getFromKeyword_1_1()); 

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
    // $ANTLR end "rule__Import__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group_1_0_0__0"
    // InternalMyDsl.g:2058:1: rule__Import__Group_1_0_0__0 : rule__Import__Group_1_0_0__0__Impl rule__Import__Group_1_0_0__1 ;
    public final void rule__Import__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( rule__Import__Group_1_0_0__0__Impl rule__Import__Group_1_0_0__1 )
            // InternalMyDsl.g:2063:2: rule__Import__Group_1_0_0__0__Impl rule__Import__Group_1_0_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1_0_0__0"


    // $ANTLR start "rule__Import__Group_1_0_0__0__Impl"
    // InternalMyDsl.g:2070:1: rule__Import__Group_1_0_0__0__Impl : ( ( rule__Import__ImportedElementAssignment_1_0_0_0 ) ) ;
    public final void rule__Import__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2074:1: ( ( ( rule__Import__ImportedElementAssignment_1_0_0_0 ) ) )
            // InternalMyDsl.g:2075:1: ( ( rule__Import__ImportedElementAssignment_1_0_0_0 ) )
            {
            // InternalMyDsl.g:2075:1: ( ( rule__Import__ImportedElementAssignment_1_0_0_0 ) )
            // InternalMyDsl.g:2076:2: ( rule__Import__ImportedElementAssignment_1_0_0_0 )
            {
             before(grammarAccess.getImportAccess().getImportedElementAssignment_1_0_0_0()); 
            // InternalMyDsl.g:2077:2: ( rule__Import__ImportedElementAssignment_1_0_0_0 )
            // InternalMyDsl.g:2077:3: rule__Import__ImportedElementAssignment_1_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedElementAssignment_1_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedElementAssignment_1_0_0_0()); 

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
    // $ANTLR end "rule__Import__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Import__Group_1_0_0__1"
    // InternalMyDsl.g:2085:1: rule__Import__Group_1_0_0__1 : rule__Import__Group_1_0_0__1__Impl ;
    public final void rule__Import__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( rule__Import__Group_1_0_0__1__Impl )
            // InternalMyDsl.g:2090:2: rule__Import__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1_0_0__1"


    // $ANTLR start "rule__Import__Group_1_0_0__1__Impl"
    // InternalMyDsl.g:2096:1: rule__Import__Group_1_0_0__1__Impl : ( ( ',' )? ) ;
    public final void rule__Import__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2100:1: ( ( ( ',' )? ) )
            // InternalMyDsl.g:2101:1: ( ( ',' )? )
            {
            // InternalMyDsl.g:2101:1: ( ( ',' )? )
            // InternalMyDsl.g:2102:2: ( ',' )?
            {
             before(grammarAccess.getImportAccess().getCommaKeyword_1_0_0_1()); 
            // InternalMyDsl.g:2103:2: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==50) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2103:3: ','
                    {
                    match(input,50,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getImportAccess().getCommaKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__Import__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Import__Group_1_0_1__0"
    // InternalMyDsl.g:2112:1: rule__Import__Group_1_0_1__0 : rule__Import__Group_1_0_1__0__Impl rule__Import__Group_1_0_1__1 ;
    public final void rule__Import__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( rule__Import__Group_1_0_1__0__Impl rule__Import__Group_1_0_1__1 )
            // InternalMyDsl.g:2117:2: rule__Import__Group_1_0_1__0__Impl rule__Import__Group_1_0_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1_0_1__0"


    // $ANTLR start "rule__Import__Group_1_0_1__0__Impl"
    // InternalMyDsl.g:2124:1: rule__Import__Group_1_0_1__0__Impl : ( '{' ) ;
    public final void rule__Import__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2128:1: ( ( '{' ) )
            // InternalMyDsl.g:2129:1: ( '{' )
            {
            // InternalMyDsl.g:2129:1: ( '{' )
            // InternalMyDsl.g:2130:2: '{'
            {
             before(grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_1_0_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_1_0_1_0()); 

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
    // $ANTLR end "rule__Import__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Import__Group_1_0_1__1"
    // InternalMyDsl.g:2139:1: rule__Import__Group_1_0_1__1 : rule__Import__Group_1_0_1__1__Impl rule__Import__Group_1_0_1__2 ;
    public final void rule__Import__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2143:1: ( rule__Import__Group_1_0_1__1__Impl rule__Import__Group_1_0_1__2 )
            // InternalMyDsl.g:2144:2: rule__Import__Group_1_0_1__1__Impl rule__Import__Group_1_0_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group_1_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_1_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1_0_1__1"


    // $ANTLR start "rule__Import__Group_1_0_1__1__Impl"
    // InternalMyDsl.g:2151:1: rule__Import__Group_1_0_1__1__Impl : ( ( rule__Import__Group_1_0_1_1__0 )? ) ;
    public final void rule__Import__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2155:1: ( ( ( rule__Import__Group_1_0_1_1__0 )? ) )
            // InternalMyDsl.g:2156:1: ( ( rule__Import__Group_1_0_1_1__0 )? )
            {
            // InternalMyDsl.g:2156:1: ( ( rule__Import__Group_1_0_1_1__0 )? )
            // InternalMyDsl.g:2157:2: ( rule__Import__Group_1_0_1_1__0 )?
            {
             before(grammarAccess.getImportAccess().getGroup_1_0_1_1()); 
            // InternalMyDsl.g:2158:2: ( rule__Import__Group_1_0_1_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)||LA20_0==14) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:2158:3: rule__Import__Group_1_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import__Group_1_0_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportAccess().getGroup_1_0_1_1()); 

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
    // $ANTLR end "rule__Import__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Import__Group_1_0_1__2"
    // InternalMyDsl.g:2166:1: rule__Import__Group_1_0_1__2 : rule__Import__Group_1_0_1__2__Impl ;
    public final void rule__Import__Group_1_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( rule__Import__Group_1_0_1__2__Impl )
            // InternalMyDsl.g:2171:2: rule__Import__Group_1_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_1_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1_0_1__2"


    // $ANTLR start "rule__Import__Group_1_0_1__2__Impl"
    // InternalMyDsl.g:2177:1: rule__Import__Group_1_0_1__2__Impl : ( '}' ) ;
    public final void rule__Import__Group_1_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2181:1: ( ( '}' ) )
            // InternalMyDsl.g:2182:1: ( '}' )
            {
            // InternalMyDsl.g:2182:1: ( '}' )
            // InternalMyDsl.g:2183:2: '}'
            {
             before(grammarAccess.getImportAccess().getRightCurlyBracketKeyword_1_0_1_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getRightCurlyBracketKeyword_1_0_1_2()); 

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
    // $ANTLR end "rule__Import__Group_1_0_1__2__Impl"


    // $ANTLR start "rule__Import__Group_1_0_1_1__0"
    // InternalMyDsl.g:2193:1: rule__Import__Group_1_0_1_1__0 : rule__Import__Group_1_0_1_1__0__Impl rule__Import__Group_1_0_1_1__1 ;
    public final void rule__Import__Group_1_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( rule__Import__Group_1_0_1_1__0__Impl rule__Import__Group_1_0_1_1__1 )
            // InternalMyDsl.g:2198:2: rule__Import__Group_1_0_1_1__0__Impl rule__Import__Group_1_0_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group_1_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_1_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1_0_1_1__0"


    // $ANTLR start "rule__Import__Group_1_0_1_1__0__Impl"
    // InternalMyDsl.g:2205:1: rule__Import__Group_1_0_1_1__0__Impl : ( ( rule__Import__ImportedElementsAssignment_1_0_1_1_0 ) ) ;
    public final void rule__Import__Group_1_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2209:1: ( ( ( rule__Import__ImportedElementsAssignment_1_0_1_1_0 ) ) )
            // InternalMyDsl.g:2210:1: ( ( rule__Import__ImportedElementsAssignment_1_0_1_1_0 ) )
            {
            // InternalMyDsl.g:2210:1: ( ( rule__Import__ImportedElementsAssignment_1_0_1_1_0 ) )
            // InternalMyDsl.g:2211:2: ( rule__Import__ImportedElementsAssignment_1_0_1_1_0 )
            {
             before(grammarAccess.getImportAccess().getImportedElementsAssignment_1_0_1_1_0()); 
            // InternalMyDsl.g:2212:2: ( rule__Import__ImportedElementsAssignment_1_0_1_1_0 )
            // InternalMyDsl.g:2212:3: rule__Import__ImportedElementsAssignment_1_0_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedElementsAssignment_1_0_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedElementsAssignment_1_0_1_1_0()); 

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
    // $ANTLR end "rule__Import__Group_1_0_1_1__0__Impl"


    // $ANTLR start "rule__Import__Group_1_0_1_1__1"
    // InternalMyDsl.g:2220:1: rule__Import__Group_1_0_1_1__1 : rule__Import__Group_1_0_1_1__1__Impl ;
    public final void rule__Import__Group_1_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2224:1: ( rule__Import__Group_1_0_1_1__1__Impl )
            // InternalMyDsl.g:2225:2: rule__Import__Group_1_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_1_0_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1_0_1_1__1"


    // $ANTLR start "rule__Import__Group_1_0_1_1__1__Impl"
    // InternalMyDsl.g:2231:1: rule__Import__Group_1_0_1_1__1__Impl : ( ( rule__Import__Group_1_0_1_1_1__0 )* ) ;
    public final void rule__Import__Group_1_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2235:1: ( ( ( rule__Import__Group_1_0_1_1_1__0 )* ) )
            // InternalMyDsl.g:2236:1: ( ( rule__Import__Group_1_0_1_1_1__0 )* )
            {
            // InternalMyDsl.g:2236:1: ( ( rule__Import__Group_1_0_1_1_1__0 )* )
            // InternalMyDsl.g:2237:2: ( rule__Import__Group_1_0_1_1_1__0 )*
            {
             before(grammarAccess.getImportAccess().getGroup_1_0_1_1_1()); 
            // InternalMyDsl.g:2238:2: ( rule__Import__Group_1_0_1_1_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==50) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2238:3: rule__Import__Group_1_0_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Import__Group_1_0_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getImportAccess().getGroup_1_0_1_1_1()); 

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
    // $ANTLR end "rule__Import__Group_1_0_1_1__1__Impl"


    // $ANTLR start "rule__Import__Group_1_0_1_1_1__0"
    // InternalMyDsl.g:2247:1: rule__Import__Group_1_0_1_1_1__0 : rule__Import__Group_1_0_1_1_1__0__Impl rule__Import__Group_1_0_1_1_1__1 ;
    public final void rule__Import__Group_1_0_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( rule__Import__Group_1_0_1_1_1__0__Impl rule__Import__Group_1_0_1_1_1__1 )
            // InternalMyDsl.g:2252:2: rule__Import__Group_1_0_1_1_1__0__Impl rule__Import__Group_1_0_1_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Import__Group_1_0_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_1_0_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1_0_1_1_1__0"


    // $ANTLR start "rule__Import__Group_1_0_1_1_1__0__Impl"
    // InternalMyDsl.g:2259:1: rule__Import__Group_1_0_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Import__Group_1_0_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2263:1: ( ( ',' ) )
            // InternalMyDsl.g:2264:1: ( ',' )
            {
            // InternalMyDsl.g:2264:1: ( ',' )
            // InternalMyDsl.g:2265:2: ','
            {
             before(grammarAccess.getImportAccess().getCommaKeyword_1_0_1_1_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getCommaKeyword_1_0_1_1_1_0()); 

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
    // $ANTLR end "rule__Import__Group_1_0_1_1_1__0__Impl"


    // $ANTLR start "rule__Import__Group_1_0_1_1_1__1"
    // InternalMyDsl.g:2274:1: rule__Import__Group_1_0_1_1_1__1 : rule__Import__Group_1_0_1_1_1__1__Impl ;
    public final void rule__Import__Group_1_0_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2278:1: ( rule__Import__Group_1_0_1_1_1__1__Impl )
            // InternalMyDsl.g:2279:2: rule__Import__Group_1_0_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_1_0_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1_0_1_1_1__1"


    // $ANTLR start "rule__Import__Group_1_0_1_1_1__1__Impl"
    // InternalMyDsl.g:2285:1: rule__Import__Group_1_0_1_1_1__1__Impl : ( ( rule__Import__ImportedElementsAssignment_1_0_1_1_1_1 ) ) ;
    public final void rule__Import__Group_1_0_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2289:1: ( ( ( rule__Import__ImportedElementsAssignment_1_0_1_1_1_1 ) ) )
            // InternalMyDsl.g:2290:1: ( ( rule__Import__ImportedElementsAssignment_1_0_1_1_1_1 ) )
            {
            // InternalMyDsl.g:2290:1: ( ( rule__Import__ImportedElementsAssignment_1_0_1_1_1_1 ) )
            // InternalMyDsl.g:2291:2: ( rule__Import__ImportedElementsAssignment_1_0_1_1_1_1 )
            {
             before(grammarAccess.getImportAccess().getImportedElementsAssignment_1_0_1_1_1_1()); 
            // InternalMyDsl.g:2292:2: ( rule__Import__ImportedElementsAssignment_1_0_1_1_1_1 )
            // InternalMyDsl.g:2292:3: rule__Import__ImportedElementsAssignment_1_0_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedElementsAssignment_1_0_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedElementsAssignment_1_0_1_1_1_1()); 

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
    // $ANTLR end "rule__Import__Group_1_0_1_1_1__1__Impl"


    // $ANTLR start "rule__ImportElement__Group__0"
    // InternalMyDsl.g:2301:1: rule__ImportElement__Group__0 : rule__ImportElement__Group__0__Impl rule__ImportElement__Group__1 ;
    public final void rule__ImportElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( rule__ImportElement__Group__0__Impl rule__ImportElement__Group__1 )
            // InternalMyDsl.g:2306:2: rule__ImportElement__Group__0__Impl rule__ImportElement__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ImportElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportElement__Group__0"


    // $ANTLR start "rule__ImportElement__Group__0__Impl"
    // InternalMyDsl.g:2313:1: rule__ImportElement__Group__0__Impl : ( ( rule__ImportElement__ElementAssignment_0 ) ) ;
    public final void rule__ImportElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2317:1: ( ( ( rule__ImportElement__ElementAssignment_0 ) ) )
            // InternalMyDsl.g:2318:1: ( ( rule__ImportElement__ElementAssignment_0 ) )
            {
            // InternalMyDsl.g:2318:1: ( ( rule__ImportElement__ElementAssignment_0 ) )
            // InternalMyDsl.g:2319:2: ( rule__ImportElement__ElementAssignment_0 )
            {
             before(grammarAccess.getImportElementAccess().getElementAssignment_0()); 
            // InternalMyDsl.g:2320:2: ( rule__ImportElement__ElementAssignment_0 )
            // InternalMyDsl.g:2320:3: rule__ImportElement__ElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ImportElement__ElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImportElementAccess().getElementAssignment_0()); 

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
    // $ANTLR end "rule__ImportElement__Group__0__Impl"


    // $ANTLR start "rule__ImportElement__Group__1"
    // InternalMyDsl.g:2328:1: rule__ImportElement__Group__1 : rule__ImportElement__Group__1__Impl ;
    public final void rule__ImportElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2332:1: ( rule__ImportElement__Group__1__Impl )
            // InternalMyDsl.g:2333:2: rule__ImportElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportElement__Group__1"


    // $ANTLR start "rule__ImportElement__Group__1__Impl"
    // InternalMyDsl.g:2339:1: rule__ImportElement__Group__1__Impl : ( ( rule__ImportElement__Group_1__0 )? ) ;
    public final void rule__ImportElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2343:1: ( ( ( rule__ImportElement__Group_1__0 )? ) )
            // InternalMyDsl.g:2344:1: ( ( rule__ImportElement__Group_1__0 )? )
            {
            // InternalMyDsl.g:2344:1: ( ( rule__ImportElement__Group_1__0 )? )
            // InternalMyDsl.g:2345:2: ( rule__ImportElement__Group_1__0 )?
            {
             before(grammarAccess.getImportElementAccess().getGroup_1()); 
            // InternalMyDsl.g:2346:2: ( rule__ImportElement__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==53) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2346:3: rule__ImportElement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportElement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportElementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ImportElement__Group__1__Impl"


    // $ANTLR start "rule__ImportElement__Group_1__0"
    // InternalMyDsl.g:2355:1: rule__ImportElement__Group_1__0 : rule__ImportElement__Group_1__0__Impl rule__ImportElement__Group_1__1 ;
    public final void rule__ImportElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2359:1: ( rule__ImportElement__Group_1__0__Impl rule__ImportElement__Group_1__1 )
            // InternalMyDsl.g:2360:2: rule__ImportElement__Group_1__0__Impl rule__ImportElement__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ImportElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportElement__Group_1__0"


    // $ANTLR start "rule__ImportElement__Group_1__0__Impl"
    // InternalMyDsl.g:2367:1: rule__ImportElement__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__ImportElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2371:1: ( ( 'as' ) )
            // InternalMyDsl.g:2372:1: ( 'as' )
            {
            // InternalMyDsl.g:2372:1: ( 'as' )
            // InternalMyDsl.g:2373:2: 'as'
            {
             before(grammarAccess.getImportElementAccess().getAsKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getImportElementAccess().getAsKeyword_1_0()); 

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
    // $ANTLR end "rule__ImportElement__Group_1__0__Impl"


    // $ANTLR start "rule__ImportElement__Group_1__1"
    // InternalMyDsl.g:2382:1: rule__ImportElement__Group_1__1 : rule__ImportElement__Group_1__1__Impl ;
    public final void rule__ImportElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2386:1: ( rule__ImportElement__Group_1__1__Impl )
            // InternalMyDsl.g:2387:2: rule__ImportElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportElement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportElement__Group_1__1"


    // $ANTLR start "rule__ImportElement__Group_1__1__Impl"
    // InternalMyDsl.g:2393:1: rule__ImportElement__Group_1__1__Impl : ( ( rule__ImportElement__AliasAssignment_1_1 ) ) ;
    public final void rule__ImportElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2397:1: ( ( ( rule__ImportElement__AliasAssignment_1_1 ) ) )
            // InternalMyDsl.g:2398:1: ( ( rule__ImportElement__AliasAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2398:1: ( ( rule__ImportElement__AliasAssignment_1_1 ) )
            // InternalMyDsl.g:2399:2: ( rule__ImportElement__AliasAssignment_1_1 )
            {
             before(grammarAccess.getImportElementAccess().getAliasAssignment_1_1()); 
            // InternalMyDsl.g:2400:2: ( rule__ImportElement__AliasAssignment_1_1 )
            // InternalMyDsl.g:2400:3: rule__ImportElement__AliasAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportElement__AliasAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImportElementAccess().getAliasAssignment_1_1()); 

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
    // $ANTLR end "rule__ImportElement__Group_1__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalMyDsl.g:2409:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2413:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalMyDsl.g:2414:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalMyDsl.g:2421:1: rule__Block__Group__0__Impl : ( '{' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2425:1: ( ( '{' ) )
            // InternalMyDsl.g:2426:1: ( '{' )
            {
            // InternalMyDsl.g:2426:1: ( '{' )
            // InternalMyDsl.g:2427:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalMyDsl.g:2436:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2440:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalMyDsl.g:2441:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalMyDsl.g:2448:1: rule__Block__Group__1__Impl : ( ( rule__Block__StatementsAssignment_1 )* ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2452:1: ( ( ( rule__Block__StatementsAssignment_1 )* ) )
            // InternalMyDsl.g:2453:1: ( ( rule__Block__StatementsAssignment_1 )* )
            {
            // InternalMyDsl.g:2453:1: ( ( rule__Block__StatementsAssignment_1 )* )
            // InternalMyDsl.g:2454:2: ( rule__Block__StatementsAssignment_1 )*
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // InternalMyDsl.g:2455:2: ( rule__Block__StatementsAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_CHAR)||(LA23_0>=15 && LA23_0<=19)||(LA23_0>=39 && LA23_0<=48)||LA23_0==55||LA23_0==57||LA23_0==59||(LA23_0>=61 && LA23_0<=68)||LA23_0==70||(LA23_0>=74 && LA23_0<=77)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:2455:3: rule__Block__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Block__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 

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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalMyDsl.g:2463:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2467:1: ( rule__Block__Group__2__Impl )
            // InternalMyDsl.g:2468:2: rule__Block__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalMyDsl.g:2474:1: rule__Block__Group__2__Impl : ( '}' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2478:1: ( ( '}' ) )
            // InternalMyDsl.g:2479:1: ( '}' )
            {
            // InternalMyDsl.g:2479:1: ( '}' )
            // InternalMyDsl.g:2480:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalMyDsl.g:2490:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalMyDsl.g:2495:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalMyDsl.g:2502:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2506:1: ( ( ( rule__VariableDeclaration__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:2507:1: ( ( rule__VariableDeclaration__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2507:1: ( ( rule__VariableDeclaration__TypeAssignment_0 ) )
            // InternalMyDsl.g:2508:2: ( rule__VariableDeclaration__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:2509:2: ( rule__VariableDeclaration__TypeAssignment_0 )
            // InternalMyDsl.g:2509:3: rule__VariableDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalMyDsl.g:2517:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalMyDsl.g:2522:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalMyDsl.g:2529:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2533:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2534:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2534:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalMyDsl.g:2535:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2536:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalMyDsl.g:2536:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalMyDsl.g:2544:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2548:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalMyDsl.g:2549:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalMyDsl.g:2556:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__Group_2__0 )? ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2560:1: ( ( ( rule__VariableDeclaration__Group_2__0 )? ) )
            // InternalMyDsl.g:2561:1: ( ( rule__VariableDeclaration__Group_2__0 )? )
            {
            // InternalMyDsl.g:2561:1: ( ( rule__VariableDeclaration__Group_2__0 )? )
            // InternalMyDsl.g:2562:2: ( rule__VariableDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup_2()); 
            // InternalMyDsl.g:2563:2: ( rule__VariableDeclaration__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2563:3: rule__VariableDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalMyDsl.g:2571:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2575:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalMyDsl.g:2576:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalMyDsl.g:2582:1: rule__VariableDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2586:1: ( ( ';' ) )
            // InternalMyDsl.g:2587:1: ( ';' )
            {
            // InternalMyDsl.g:2587:1: ( ';' )
            // InternalMyDsl.g:2588:2: ';'
            {
             before(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_2__0"
    // InternalMyDsl.g:2598:1: rule__VariableDeclaration__Group_2__0 : rule__VariableDeclaration__Group_2__0__Impl rule__VariableDeclaration__Group_2__1 ;
    public final void rule__VariableDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( rule__VariableDeclaration__Group_2__0__Impl rule__VariableDeclaration__Group_2__1 )
            // InternalMyDsl.g:2603:2: rule__VariableDeclaration__Group_2__0__Impl rule__VariableDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__VariableDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2__0"


    // $ANTLR start "rule__VariableDeclaration__Group_2__0__Impl"
    // InternalMyDsl.g:2610:1: rule__VariableDeclaration__Group_2__0__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2614:1: ( ( '=' ) )
            // InternalMyDsl.g:2615:1: ( '=' )
            {
            // InternalMyDsl.g:2615:1: ( '=' )
            // InternalMyDsl.g:2616:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_2__1"
    // InternalMyDsl.g:2625:1: rule__VariableDeclaration__Group_2__1 : rule__VariableDeclaration__Group_2__1__Impl ;
    public final void rule__VariableDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2629:1: ( rule__VariableDeclaration__Group_2__1__Impl )
            // InternalMyDsl.g:2630:2: rule__VariableDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2__1"


    // $ANTLR start "rule__VariableDeclaration__Group_2__1__Impl"
    // InternalMyDsl.g:2636:1: rule__VariableDeclaration__Group_2__1__Impl : ( ( rule__VariableDeclaration__ExprAssignment_2_1 ) ) ;
    public final void rule__VariableDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2640:1: ( ( ( rule__VariableDeclaration__ExprAssignment_2_1 ) ) )
            // InternalMyDsl.g:2641:1: ( ( rule__VariableDeclaration__ExprAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2641:1: ( ( rule__VariableDeclaration__ExprAssignment_2_1 ) )
            // InternalMyDsl.g:2642:2: ( rule__VariableDeclaration__ExprAssignment_2_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getExprAssignment_2_1()); 
            // InternalMyDsl.g:2643:2: ( rule__VariableDeclaration__ExprAssignment_2_1 )
            // InternalMyDsl.g:2643:3: rule__VariableDeclaration__ExprAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ExprAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getExprAssignment_2_1()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__ExpressionStatement__Group__0"
    // InternalMyDsl.g:2652:1: rule__ExpressionStatement__Group__0 : rule__ExpressionStatement__Group__0__Impl rule__ExpressionStatement__Group__1 ;
    public final void rule__ExpressionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( rule__ExpressionStatement__Group__0__Impl rule__ExpressionStatement__Group__1 )
            // InternalMyDsl.g:2657:2: rule__ExpressionStatement__Group__0__Impl rule__ExpressionStatement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionStatement__Group__0"


    // $ANTLR start "rule__ExpressionStatement__Group__0__Impl"
    // InternalMyDsl.g:2664:1: rule__ExpressionStatement__Group__0__Impl : ( ( rule__ExpressionStatement__ExprAssignment_0 ) ) ;
    public final void rule__ExpressionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2668:1: ( ( ( rule__ExpressionStatement__ExprAssignment_0 ) ) )
            // InternalMyDsl.g:2669:1: ( ( rule__ExpressionStatement__ExprAssignment_0 ) )
            {
            // InternalMyDsl.g:2669:1: ( ( rule__ExpressionStatement__ExprAssignment_0 ) )
            // InternalMyDsl.g:2670:2: ( rule__ExpressionStatement__ExprAssignment_0 )
            {
             before(grammarAccess.getExpressionStatementAccess().getExprAssignment_0()); 
            // InternalMyDsl.g:2671:2: ( rule__ExpressionStatement__ExprAssignment_0 )
            // InternalMyDsl.g:2671:3: rule__ExpressionStatement__ExprAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionStatement__ExprAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionStatementAccess().getExprAssignment_0()); 

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
    // $ANTLR end "rule__ExpressionStatement__Group__0__Impl"


    // $ANTLR start "rule__ExpressionStatement__Group__1"
    // InternalMyDsl.g:2679:1: rule__ExpressionStatement__Group__1 : rule__ExpressionStatement__Group__1__Impl ;
    public final void rule__ExpressionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( rule__ExpressionStatement__Group__1__Impl )
            // InternalMyDsl.g:2684:2: rule__ExpressionStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionStatement__Group__1"


    // $ANTLR start "rule__ExpressionStatement__Group__1__Impl"
    // InternalMyDsl.g:2690:1: rule__ExpressionStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__ExpressionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2694:1: ( ( ';' ) )
            // InternalMyDsl.g:2695:1: ( ';' )
            {
            // InternalMyDsl.g:2695:1: ( ';' )
            // InternalMyDsl.g:2696:2: ';'
            {
             before(grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__ExpressionStatement__Group__1__Impl"


    // $ANTLR start "rule__AugmentedAssignment__Group__0"
    // InternalMyDsl.g:2706:1: rule__AugmentedAssignment__Group__0 : rule__AugmentedAssignment__Group__0__Impl rule__AugmentedAssignment__Group__1 ;
    public final void rule__AugmentedAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2710:1: ( rule__AugmentedAssignment__Group__0__Impl rule__AugmentedAssignment__Group__1 )
            // InternalMyDsl.g:2711:2: rule__AugmentedAssignment__Group__0__Impl rule__AugmentedAssignment__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__AugmentedAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AugmentedAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AugmentedAssignment__Group__0"


    // $ANTLR start "rule__AugmentedAssignment__Group__0__Impl"
    // InternalMyDsl.g:2718:1: rule__AugmentedAssignment__Group__0__Impl : ( ruleVariableReference ) ;
    public final void rule__AugmentedAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2722:1: ( ( ruleVariableReference ) )
            // InternalMyDsl.g:2723:1: ( ruleVariableReference )
            {
            // InternalMyDsl.g:2723:1: ( ruleVariableReference )
            // InternalMyDsl.g:2724:2: ruleVariableReference
            {
             before(grammarAccess.getAugmentedAssignmentAccess().getVariableReferenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getAugmentedAssignmentAccess().getVariableReferenceParserRuleCall_0()); 

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
    // $ANTLR end "rule__AugmentedAssignment__Group__0__Impl"


    // $ANTLR start "rule__AugmentedAssignment__Group__1"
    // InternalMyDsl.g:2733:1: rule__AugmentedAssignment__Group__1 : rule__AugmentedAssignment__Group__1__Impl rule__AugmentedAssignment__Group__2 ;
    public final void rule__AugmentedAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2737:1: ( rule__AugmentedAssignment__Group__1__Impl rule__AugmentedAssignment__Group__2 )
            // InternalMyDsl.g:2738:2: rule__AugmentedAssignment__Group__1__Impl rule__AugmentedAssignment__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__AugmentedAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AugmentedAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AugmentedAssignment__Group__1"


    // $ANTLR start "rule__AugmentedAssignment__Group__1__Impl"
    // InternalMyDsl.g:2745:1: rule__AugmentedAssignment__Group__1__Impl : ( ruleAugmentedOperator ) ;
    public final void rule__AugmentedAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2749:1: ( ( ruleAugmentedOperator ) )
            // InternalMyDsl.g:2750:1: ( ruleAugmentedOperator )
            {
            // InternalMyDsl.g:2750:1: ( ruleAugmentedOperator )
            // InternalMyDsl.g:2751:2: ruleAugmentedOperator
            {
             before(grammarAccess.getAugmentedAssignmentAccess().getAugmentedOperatorParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleAugmentedOperator();

            state._fsp--;

             after(grammarAccess.getAugmentedAssignmentAccess().getAugmentedOperatorParserRuleCall_1()); 

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
    // $ANTLR end "rule__AugmentedAssignment__Group__1__Impl"


    // $ANTLR start "rule__AugmentedAssignment__Group__2"
    // InternalMyDsl.g:2760:1: rule__AugmentedAssignment__Group__2 : rule__AugmentedAssignment__Group__2__Impl ;
    public final void rule__AugmentedAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( rule__AugmentedAssignment__Group__2__Impl )
            // InternalMyDsl.g:2765:2: rule__AugmentedAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AugmentedAssignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AugmentedAssignment__Group__2"


    // $ANTLR start "rule__AugmentedAssignment__Group__2__Impl"
    // InternalMyDsl.g:2771:1: rule__AugmentedAssignment__Group__2__Impl : ( ( rule__AugmentedAssignment__ExprAssignment_2 ) ) ;
    public final void rule__AugmentedAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2775:1: ( ( ( rule__AugmentedAssignment__ExprAssignment_2 ) ) )
            // InternalMyDsl.g:2776:1: ( ( rule__AugmentedAssignment__ExprAssignment_2 ) )
            {
            // InternalMyDsl.g:2776:1: ( ( rule__AugmentedAssignment__ExprAssignment_2 ) )
            // InternalMyDsl.g:2777:2: ( rule__AugmentedAssignment__ExprAssignment_2 )
            {
             before(grammarAccess.getAugmentedAssignmentAccess().getExprAssignment_2()); 
            // InternalMyDsl.g:2778:2: ( rule__AugmentedAssignment__ExprAssignment_2 )
            // InternalMyDsl.g:2778:3: rule__AugmentedAssignment__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AugmentedAssignment__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAugmentedAssignmentAccess().getExprAssignment_2()); 

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
    // $ANTLR end "rule__AugmentedAssignment__Group__2__Impl"


    // $ANTLR start "rule__LogicalExpression__Group__0"
    // InternalMyDsl.g:2787:1: rule__LogicalExpression__Group__0 : rule__LogicalExpression__Group__0__Impl rule__LogicalExpression__Group__1 ;
    public final void rule__LogicalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2791:1: ( rule__LogicalExpression__Group__0__Impl rule__LogicalExpression__Group__1 )
            // InternalMyDsl.g:2792:2: rule__LogicalExpression__Group__0__Impl rule__LogicalExpression__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__LogicalExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalExpression__Group__0"


    // $ANTLR start "rule__LogicalExpression__Group__0__Impl"
    // InternalMyDsl.g:2799:1: rule__LogicalExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__LogicalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2803:1: ( ( ruleComparisonExpression ) )
            // InternalMyDsl.g:2804:1: ( ruleComparisonExpression )
            {
            // InternalMyDsl.g:2804:1: ( ruleComparisonExpression )
            // InternalMyDsl.g:2805:2: ruleComparisonExpression
            {
             before(grammarAccess.getLogicalExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getLogicalExpressionAccess().getComparisonExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__LogicalExpression__Group__0__Impl"


    // $ANTLR start "rule__LogicalExpression__Group__1"
    // InternalMyDsl.g:2814:1: rule__LogicalExpression__Group__1 : rule__LogicalExpression__Group__1__Impl ;
    public final void rule__LogicalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2818:1: ( rule__LogicalExpression__Group__1__Impl )
            // InternalMyDsl.g:2819:2: rule__LogicalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalExpression__Group__1"


    // $ANTLR start "rule__LogicalExpression__Group__1__Impl"
    // InternalMyDsl.g:2825:1: rule__LogicalExpression__Group__1__Impl : ( ( rule__LogicalExpression__Group_1__0 )* ) ;
    public final void rule__LogicalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2829:1: ( ( ( rule__LogicalExpression__Group_1__0 )* ) )
            // InternalMyDsl.g:2830:1: ( ( rule__LogicalExpression__Group_1__0 )* )
            {
            // InternalMyDsl.g:2830:1: ( ( rule__LogicalExpression__Group_1__0 )* )
            // InternalMyDsl.g:2831:2: ( rule__LogicalExpression__Group_1__0 )*
            {
             before(grammarAccess.getLogicalExpressionAccess().getGroup_1()); 
            // InternalMyDsl.g:2832:2: ( rule__LogicalExpression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=27 && LA25_0<=28)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:2832:3: rule__LogicalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__LogicalExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getLogicalExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LogicalExpression__Group__1__Impl"


    // $ANTLR start "rule__LogicalExpression__Group_1__0"
    // InternalMyDsl.g:2841:1: rule__LogicalExpression__Group_1__0 : rule__LogicalExpression__Group_1__0__Impl rule__LogicalExpression__Group_1__1 ;
    public final void rule__LogicalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2845:1: ( rule__LogicalExpression__Group_1__0__Impl rule__LogicalExpression__Group_1__1 )
            // InternalMyDsl.g:2846:2: rule__LogicalExpression__Group_1__0__Impl rule__LogicalExpression__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__LogicalExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalExpression__Group_1__0"


    // $ANTLR start "rule__LogicalExpression__Group_1__0__Impl"
    // InternalMyDsl.g:2853:1: rule__LogicalExpression__Group_1__0__Impl : ( ( rule__LogicalExpression__Group_1_0__0 ) ) ;
    public final void rule__LogicalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2857:1: ( ( ( rule__LogicalExpression__Group_1_0__0 ) ) )
            // InternalMyDsl.g:2858:1: ( ( rule__LogicalExpression__Group_1_0__0 ) )
            {
            // InternalMyDsl.g:2858:1: ( ( rule__LogicalExpression__Group_1_0__0 ) )
            // InternalMyDsl.g:2859:2: ( rule__LogicalExpression__Group_1_0__0 )
            {
             before(grammarAccess.getLogicalExpressionAccess().getGroup_1_0()); 
            // InternalMyDsl.g:2860:2: ( rule__LogicalExpression__Group_1_0__0 )
            // InternalMyDsl.g:2860:3: rule__LogicalExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalExpression__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalExpressionAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__LogicalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalExpression__Group_1__1"
    // InternalMyDsl.g:2868:1: rule__LogicalExpression__Group_1__1 : rule__LogicalExpression__Group_1__1__Impl ;
    public final void rule__LogicalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2872:1: ( rule__LogicalExpression__Group_1__1__Impl )
            // InternalMyDsl.g:2873:2: rule__LogicalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalExpression__Group_1__1"


    // $ANTLR start "rule__LogicalExpression__Group_1__1__Impl"
    // InternalMyDsl.g:2879:1: rule__LogicalExpression__Group_1__1__Impl : ( ( rule__LogicalExpression__RightAssignment_1_1 ) ) ;
    public final void rule__LogicalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2883:1: ( ( ( rule__LogicalExpression__RightAssignment_1_1 ) ) )
            // InternalMyDsl.g:2884:1: ( ( rule__LogicalExpression__RightAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2884:1: ( ( rule__LogicalExpression__RightAssignment_1_1 ) )
            // InternalMyDsl.g:2885:2: ( rule__LogicalExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getLogicalExpressionAccess().getRightAssignment_1_1()); 
            // InternalMyDsl.g:2886:2: ( rule__LogicalExpression__RightAssignment_1_1 )
            // InternalMyDsl.g:2886:3: rule__LogicalExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicalExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalExpressionAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__LogicalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalExpression__Group_1_0__0"
    // InternalMyDsl.g:2895:1: rule__LogicalExpression__Group_1_0__0 : rule__LogicalExpression__Group_1_0__0__Impl rule__LogicalExpression__Group_1_0__1 ;
    public final void rule__LogicalExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2899:1: ( rule__LogicalExpression__Group_1_0__0__Impl rule__LogicalExpression__Group_1_0__1 )
            // InternalMyDsl.g:2900:2: rule__LogicalExpression__Group_1_0__0__Impl rule__LogicalExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_18);
            rule__LogicalExpression__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalExpression__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalExpression__Group_1_0__0"


    // $ANTLR start "rule__LogicalExpression__Group_1_0__0__Impl"
    // InternalMyDsl.g:2907:1: rule__LogicalExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__LogicalExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2911:1: ( ( () ) )
            // InternalMyDsl.g:2912:1: ( () )
            {
            // InternalMyDsl.g:2912:1: ( () )
            // InternalMyDsl.g:2913:2: ()
            {
             before(grammarAccess.getLogicalExpressionAccess().getLogicalExpressionLeftAction_1_0_0()); 
            // InternalMyDsl.g:2914:2: ()
            // InternalMyDsl.g:2914:3: 
            {
            }

             after(grammarAccess.getLogicalExpressionAccess().getLogicalExpressionLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__LogicalExpression__Group_1_0__1"
    // InternalMyDsl.g:2922:1: rule__LogicalExpression__Group_1_0__1 : rule__LogicalExpression__Group_1_0__1__Impl ;
    public final void rule__LogicalExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2926:1: ( rule__LogicalExpression__Group_1_0__1__Impl )
            // InternalMyDsl.g:2927:2: rule__LogicalExpression__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalExpression__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalExpression__Group_1_0__1"


    // $ANTLR start "rule__LogicalExpression__Group_1_0__1__Impl"
    // InternalMyDsl.g:2933:1: rule__LogicalExpression__Group_1_0__1__Impl : ( ruleLogicalOperator ) ;
    public final void rule__LogicalExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2937:1: ( ( ruleLogicalOperator ) )
            // InternalMyDsl.g:2938:1: ( ruleLogicalOperator )
            {
            // InternalMyDsl.g:2938:1: ( ruleLogicalOperator )
            // InternalMyDsl.g:2939:2: ruleLogicalOperator
            {
             before(grammarAccess.getLogicalExpressionAccess().getLogicalOperatorParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleLogicalOperator();

            state._fsp--;

             after(grammarAccess.getLogicalExpressionAccess().getLogicalOperatorParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__LogicalExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalMyDsl.g:2949:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2953:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalMyDsl.g:2954:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalMyDsl.g:2961:1: rule__ComparisonExpression__Group__0__Impl : ( ruleArithmeticExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2965:1: ( ( ruleArithmeticExpression ) )
            // InternalMyDsl.g:2966:1: ( ruleArithmeticExpression )
            {
            // InternalMyDsl.g:2966:1: ( ruleArithmeticExpression )
            // InternalMyDsl.g:2967:2: ruleArithmeticExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalMyDsl.g:2976:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2980:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalMyDsl.g:2981:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalMyDsl.g:2987:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2991:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // InternalMyDsl.g:2992:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // InternalMyDsl.g:2992:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // InternalMyDsl.g:2993:2: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalMyDsl.g:2994:2: ( rule__ComparisonExpression__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=20 && LA26_0<=26)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:2994:3: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // InternalMyDsl.g:3003:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3007:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalMyDsl.g:3008:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // InternalMyDsl.g:3015:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3019:1: ( ( () ) )
            // InternalMyDsl.g:3020:1: ( () )
            {
            // InternalMyDsl.g:3020:1: ( () )
            // InternalMyDsl.g:3021:2: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:3022:2: ()
            // InternalMyDsl.g:3022:3: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // InternalMyDsl.g:3030:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3034:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalMyDsl.g:3035:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // InternalMyDsl.g:3042:1: rule__ComparisonExpression__Group_1__1__Impl : ( ruleComparisonOperator ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3046:1: ( ( ruleComparisonOperator ) )
            // InternalMyDsl.g:3047:1: ( ruleComparisonOperator )
            {
            // InternalMyDsl.g:3047:1: ( ruleComparisonOperator )
            // InternalMyDsl.g:3048:2: ruleComparisonOperator
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonOperatorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getComparisonOperatorParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2"
    // InternalMyDsl.g:3057:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3061:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalMyDsl.g:3062:2: rule__ComparisonExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2__Impl"
    // InternalMyDsl.g:3068:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3072:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:3073:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:3073:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            // InternalMyDsl.g:3074:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:3075:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            // InternalMyDsl.g:3075:3: rule__ComparisonExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ComparisonExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ArithmeticExpression__Group__0"
    // InternalMyDsl.g:3084:1: rule__ArithmeticExpression__Group__0 : rule__ArithmeticExpression__Group__0__Impl rule__ArithmeticExpression__Group__1 ;
    public final void rule__ArithmeticExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3088:1: ( rule__ArithmeticExpression__Group__0__Impl rule__ArithmeticExpression__Group__1 )
            // InternalMyDsl.g:3089:2: rule__ArithmeticExpression__Group__0__Impl rule__ArithmeticExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ArithmeticExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticExpression__Group__0"


    // $ANTLR start "rule__ArithmeticExpression__Group__0__Impl"
    // InternalMyDsl.g:3096:1: rule__ArithmeticExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__ArithmeticExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3100:1: ( ( ruleMultiplicationExpression ) )
            // InternalMyDsl.g:3101:1: ( ruleMultiplicationExpression )
            {
            // InternalMyDsl.g:3101:1: ( ruleMultiplicationExpression )
            // InternalMyDsl.g:3102:2: ruleMultiplicationExpression
            {
             before(grammarAccess.getArithmeticExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getArithmeticExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__ArithmeticExpression__Group__0__Impl"


    // $ANTLR start "rule__ArithmeticExpression__Group__1"
    // InternalMyDsl.g:3111:1: rule__ArithmeticExpression__Group__1 : rule__ArithmeticExpression__Group__1__Impl ;
    public final void rule__ArithmeticExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3115:1: ( rule__ArithmeticExpression__Group__1__Impl )
            // InternalMyDsl.g:3116:2: rule__ArithmeticExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticExpression__Group__1"


    // $ANTLR start "rule__ArithmeticExpression__Group__1__Impl"
    // InternalMyDsl.g:3122:1: rule__ArithmeticExpression__Group__1__Impl : ( ( rule__ArithmeticExpression__Group_1__0 )* ) ;
    public final void rule__ArithmeticExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3126:1: ( ( ( rule__ArithmeticExpression__Group_1__0 )* ) )
            // InternalMyDsl.g:3127:1: ( ( rule__ArithmeticExpression__Group_1__0 )* )
            {
            // InternalMyDsl.g:3127:1: ( ( rule__ArithmeticExpression__Group_1__0 )* )
            // InternalMyDsl.g:3128:2: ( rule__ArithmeticExpression__Group_1__0 )*
            {
             before(grammarAccess.getArithmeticExpressionAccess().getGroup_1()); 
            // InternalMyDsl.g:3129:2: ( rule__ArithmeticExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=31 && LA27_0<=32)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:3129:3: rule__ArithmeticExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ArithmeticExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getArithmeticExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ArithmeticExpression__Group__1__Impl"


    // $ANTLR start "rule__ArithmeticExpression__Group_1__0"
    // InternalMyDsl.g:3138:1: rule__ArithmeticExpression__Group_1__0 : rule__ArithmeticExpression__Group_1__0__Impl rule__ArithmeticExpression__Group_1__1 ;
    public final void rule__ArithmeticExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3142:1: ( rule__ArithmeticExpression__Group_1__0__Impl rule__ArithmeticExpression__Group_1__1 )
            // InternalMyDsl.g:3143:2: rule__ArithmeticExpression__Group_1__0__Impl rule__ArithmeticExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__ArithmeticExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticExpression__Group_1__0"


    // $ANTLR start "rule__ArithmeticExpression__Group_1__0__Impl"
    // InternalMyDsl.g:3150:1: rule__ArithmeticExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ArithmeticExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3154:1: ( ( () ) )
            // InternalMyDsl.g:3155:1: ( () )
            {
            // InternalMyDsl.g:3155:1: ( () )
            // InternalMyDsl.g:3156:2: ()
            {
             before(grammarAccess.getArithmeticExpressionAccess().getArithmeticExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:3157:2: ()
            // InternalMyDsl.g:3157:3: 
            {
            }

             after(grammarAccess.getArithmeticExpressionAccess().getArithmeticExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ArithmeticExpression__Group_1__1"
    // InternalMyDsl.g:3165:1: rule__ArithmeticExpression__Group_1__1 : rule__ArithmeticExpression__Group_1__1__Impl rule__ArithmeticExpression__Group_1__2 ;
    public final void rule__ArithmeticExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3169:1: ( rule__ArithmeticExpression__Group_1__1__Impl rule__ArithmeticExpression__Group_1__2 )
            // InternalMyDsl.g:3170:2: rule__ArithmeticExpression__Group_1__1__Impl rule__ArithmeticExpression__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__ArithmeticExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticExpression__Group_1__1"


    // $ANTLR start "rule__ArithmeticExpression__Group_1__1__Impl"
    // InternalMyDsl.g:3177:1: rule__ArithmeticExpression__Group_1__1__Impl : ( ruleArithmeticOperator ) ;
    public final void rule__ArithmeticExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3181:1: ( ( ruleArithmeticOperator ) )
            // InternalMyDsl.g:3182:1: ( ruleArithmeticOperator )
            {
            // InternalMyDsl.g:3182:1: ( ruleArithmeticOperator )
            // InternalMyDsl.g:3183:2: ruleArithmeticOperator
            {
             before(grammarAccess.getArithmeticExpressionAccess().getArithmeticOperatorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticOperator();

            state._fsp--;

             after(grammarAccess.getArithmeticExpressionAccess().getArithmeticOperatorParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__ArithmeticExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ArithmeticExpression__Group_1__2"
    // InternalMyDsl.g:3192:1: rule__ArithmeticExpression__Group_1__2 : rule__ArithmeticExpression__Group_1__2__Impl ;
    public final void rule__ArithmeticExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3196:1: ( rule__ArithmeticExpression__Group_1__2__Impl )
            // InternalMyDsl.g:3197:2: rule__ArithmeticExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticExpression__Group_1__2"


    // $ANTLR start "rule__ArithmeticExpression__Group_1__2__Impl"
    // InternalMyDsl.g:3203:1: rule__ArithmeticExpression__Group_1__2__Impl : ( ( rule__ArithmeticExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ArithmeticExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3207:1: ( ( ( rule__ArithmeticExpression__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:3208:1: ( ( rule__ArithmeticExpression__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:3208:1: ( ( rule__ArithmeticExpression__RightAssignment_1_2 ) )
            // InternalMyDsl.g:3209:2: ( rule__ArithmeticExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:3210:2: ( rule__ArithmeticExpression__RightAssignment_1_2 )
            // InternalMyDsl.g:3210:3: rule__ArithmeticExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ArithmeticExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group__0"
    // InternalMyDsl.g:3219:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3223:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // InternalMyDsl.g:3224:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__MultiplicationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__0"


    // $ANTLR start "rule__MultiplicationExpression__Group__0__Impl"
    // InternalMyDsl.g:3231:1: rule__MultiplicationExpression__Group__0__Impl : ( ruleExponentiationExpression ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3235:1: ( ( ruleExponentiationExpression ) )
            // InternalMyDsl.g:3236:1: ( ruleExponentiationExpression )
            {
            // InternalMyDsl.g:3236:1: ( ruleExponentiationExpression )
            // InternalMyDsl.g:3237:2: ruleExponentiationExpression
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getExponentiationExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExponentiationExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getExponentiationExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__MultiplicationExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group__1"
    // InternalMyDsl.g:3246:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3250:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // InternalMyDsl.g:3251:2: rule__MultiplicationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__1"


    // $ANTLR start "rule__MultiplicationExpression__Group__1__Impl"
    // InternalMyDsl.g:3257:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3261:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )* ) )
            // InternalMyDsl.g:3262:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            {
            // InternalMyDsl.g:3262:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            // InternalMyDsl.g:3263:2: ( rule__MultiplicationExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            // InternalMyDsl.g:3264:2: ( rule__MultiplicationExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14||(LA28_0>=29 && LA28_0<=30)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:3264:3: rule__MultiplicationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__MultiplicationExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MultiplicationExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0"
    // InternalMyDsl.g:3273:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3277:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // InternalMyDsl.g:3278:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0__Impl"
    // InternalMyDsl.g:3285:1: rule__MultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3289:1: ( ( () ) )
            // InternalMyDsl.g:3290:1: ( () )
            {
            // InternalMyDsl.g:3290:1: ( () )
            // InternalMyDsl.g:3291:2: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:3292:2: ()
            // InternalMyDsl.g:3292:3: 
            {
            }

             after(grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1"
    // InternalMyDsl.g:3300:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3304:1: ( rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 )
            // InternalMyDsl.g:3305:2: rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__MultiplicationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1__Impl"
    // InternalMyDsl.g:3312:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ruleMultiplicationOperator ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3316:1: ( ( ruleMultiplicationOperator ) )
            // InternalMyDsl.g:3317:1: ( ruleMultiplicationOperator )
            {
            // InternalMyDsl.g:3317:1: ( ruleMultiplicationOperator )
            // InternalMyDsl.g:3318:2: ruleMultiplicationOperator
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getMultiplicationOperatorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getMultiplicationOperatorParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__2"
    // InternalMyDsl.g:3327:1: rule__MultiplicationExpression__Group_1__2 : rule__MultiplicationExpression__Group_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3331:1: ( rule__MultiplicationExpression__Group_1__2__Impl )
            // InternalMyDsl.g:3332:2: rule__MultiplicationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__2"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__2__Impl"
    // InternalMyDsl.g:3338:1: rule__MultiplicationExpression__Group_1__2__Impl : ( ( rule__MultiplicationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3342:1: ( ( ( rule__MultiplicationExpression__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:3343:1: ( ( rule__MultiplicationExpression__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:3343:1: ( ( rule__MultiplicationExpression__RightAssignment_1_2 ) )
            // InternalMyDsl.g:3344:2: ( rule__MultiplicationExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:3345:2: ( rule__MultiplicationExpression__RightAssignment_1_2 )
            // InternalMyDsl.g:3345:3: rule__MultiplicationExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__MultiplicationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ExponentiationExpression__Group__0"
    // InternalMyDsl.g:3354:1: rule__ExponentiationExpression__Group__0 : rule__ExponentiationExpression__Group__0__Impl rule__ExponentiationExpression__Group__1 ;
    public final void rule__ExponentiationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3358:1: ( rule__ExponentiationExpression__Group__0__Impl rule__ExponentiationExpression__Group__1 )
            // InternalMyDsl.g:3359:2: rule__ExponentiationExpression__Group__0__Impl rule__ExponentiationExpression__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ExponentiationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group__0"


    // $ANTLR start "rule__ExponentiationExpression__Group__0__Impl"
    // InternalMyDsl.g:3366:1: rule__ExponentiationExpression__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ExponentiationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3370:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:3371:1: ( rulePrimary )
            {
            // InternalMyDsl.g:3371:1: ( rulePrimary )
            // InternalMyDsl.g:3372:2: rulePrimary
            {
             before(grammarAccess.getExponentiationExpressionAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getExponentiationExpressionAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__ExponentiationExpression__Group__0__Impl"


    // $ANTLR start "rule__ExponentiationExpression__Group__1"
    // InternalMyDsl.g:3381:1: rule__ExponentiationExpression__Group__1 : rule__ExponentiationExpression__Group__1__Impl ;
    public final void rule__ExponentiationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3385:1: ( rule__ExponentiationExpression__Group__1__Impl )
            // InternalMyDsl.g:3386:2: rule__ExponentiationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group__1"


    // $ANTLR start "rule__ExponentiationExpression__Group__1__Impl"
    // InternalMyDsl.g:3392:1: rule__ExponentiationExpression__Group__1__Impl : ( ( rule__ExponentiationExpression__Group_1__0 )* ) ;
    public final void rule__ExponentiationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3396:1: ( ( ( rule__ExponentiationExpression__Group_1__0 )* ) )
            // InternalMyDsl.g:3397:1: ( ( rule__ExponentiationExpression__Group_1__0 )* )
            {
            // InternalMyDsl.g:3397:1: ( ( rule__ExponentiationExpression__Group_1__0 )* )
            // InternalMyDsl.g:3398:2: ( rule__ExponentiationExpression__Group_1__0 )*
            {
             before(grammarAccess.getExponentiationExpressionAccess().getGroup_1()); 
            // InternalMyDsl.g:3399:2: ( rule__ExponentiationExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==13) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:3399:3: rule__ExponentiationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__ExponentiationExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getExponentiationExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExponentiationExpression__Group__1__Impl"


    // $ANTLR start "rule__ExponentiationExpression__Group_1__0"
    // InternalMyDsl.g:3408:1: rule__ExponentiationExpression__Group_1__0 : rule__ExponentiationExpression__Group_1__0__Impl rule__ExponentiationExpression__Group_1__1 ;
    public final void rule__ExponentiationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3412:1: ( rule__ExponentiationExpression__Group_1__0__Impl rule__ExponentiationExpression__Group_1__1 )
            // InternalMyDsl.g:3413:2: rule__ExponentiationExpression__Group_1__0__Impl rule__ExponentiationExpression__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__ExponentiationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group_1__0"


    // $ANTLR start "rule__ExponentiationExpression__Group_1__0__Impl"
    // InternalMyDsl.g:3420:1: rule__ExponentiationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ExponentiationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3424:1: ( ( () ) )
            // InternalMyDsl.g:3425:1: ( () )
            {
            // InternalMyDsl.g:3425:1: ( () )
            // InternalMyDsl.g:3426:2: ()
            {
             before(grammarAccess.getExponentiationExpressionAccess().getExponentiationExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:3427:2: ()
            // InternalMyDsl.g:3427:3: 
            {
            }

             after(grammarAccess.getExponentiationExpressionAccess().getExponentiationExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ExponentiationExpression__Group_1__1"
    // InternalMyDsl.g:3435:1: rule__ExponentiationExpression__Group_1__1 : rule__ExponentiationExpression__Group_1__1__Impl rule__ExponentiationExpression__Group_1__2 ;
    public final void rule__ExponentiationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3439:1: ( rule__ExponentiationExpression__Group_1__1__Impl rule__ExponentiationExpression__Group_1__2 )
            // InternalMyDsl.g:3440:2: rule__ExponentiationExpression__Group_1__1__Impl rule__ExponentiationExpression__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__ExponentiationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group_1__1"


    // $ANTLR start "rule__ExponentiationExpression__Group_1__1__Impl"
    // InternalMyDsl.g:3447:1: rule__ExponentiationExpression__Group_1__1__Impl : ( ruleExponentiationOperator ) ;
    public final void rule__ExponentiationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3451:1: ( ( ruleExponentiationOperator ) )
            // InternalMyDsl.g:3452:1: ( ruleExponentiationOperator )
            {
            // InternalMyDsl.g:3452:1: ( ruleExponentiationOperator )
            // InternalMyDsl.g:3453:2: ruleExponentiationOperator
            {
             before(grammarAccess.getExponentiationExpressionAccess().getExponentiationOperatorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExponentiationOperator();

            state._fsp--;

             after(grammarAccess.getExponentiationExpressionAccess().getExponentiationOperatorParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__ExponentiationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ExponentiationExpression__Group_1__2"
    // InternalMyDsl.g:3462:1: rule__ExponentiationExpression__Group_1__2 : rule__ExponentiationExpression__Group_1__2__Impl ;
    public final void rule__ExponentiationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3466:1: ( rule__ExponentiationExpression__Group_1__2__Impl )
            // InternalMyDsl.g:3467:2: rule__ExponentiationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentiationExpression__Group_1__2"


    // $ANTLR start "rule__ExponentiationExpression__Group_1__2__Impl"
    // InternalMyDsl.g:3473:1: rule__ExponentiationExpression__Group_1__2__Impl : ( ( rule__ExponentiationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ExponentiationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3477:1: ( ( ( rule__ExponentiationExpression__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:3478:1: ( ( rule__ExponentiationExpression__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:3478:1: ( ( rule__ExponentiationExpression__RightAssignment_1_2 ) )
            // InternalMyDsl.g:3479:2: ( rule__ExponentiationExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExponentiationExpressionAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:3480:2: ( rule__ExponentiationExpression__RightAssignment_1_2 )
            // InternalMyDsl.g:3480:3: rule__ExponentiationExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExponentiationExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExponentiationExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ExponentiationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMyDsl.g:3489:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3493:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMyDsl.g:3494:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMyDsl.g:3501:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3505:1: ( ( '(' ) )
            // InternalMyDsl.g:3506:1: ( '(' )
            {
            // InternalMyDsl.g:3506:1: ( '(' )
            // InternalMyDsl.g:3507:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMyDsl.g:3516:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3520:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalMyDsl.g:3521:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_29);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMyDsl.g:3528:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3532:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3533:1: ( ruleExpression )
            {
            // InternalMyDsl.g:3533:1: ( ruleExpression )
            // InternalMyDsl.g:3534:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalMyDsl.g:3543:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3547:1: ( rule__Primary__Group_0__2__Impl )
            // InternalMyDsl.g:3548:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalMyDsl.g:3554:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3558:1: ( ( ')' ) )
            // InternalMyDsl.g:3559:1: ( ')' )
            {
            // InternalMyDsl.g:3559:1: ( ')' )
            // InternalMyDsl.g:3560:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__PostfixOperator__Group__0"
    // InternalMyDsl.g:3570:1: rule__PostfixOperator__Group__0 : rule__PostfixOperator__Group__0__Impl rule__PostfixOperator__Group__1 ;
    public final void rule__PostfixOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3574:1: ( rule__PostfixOperator__Group__0__Impl rule__PostfixOperator__Group__1 )
            // InternalMyDsl.g:3575:2: rule__PostfixOperator__Group__0__Impl rule__PostfixOperator__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__PostfixOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PostfixOperator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixOperator__Group__0"


    // $ANTLR start "rule__PostfixOperator__Group__0__Impl"
    // InternalMyDsl.g:3582:1: rule__PostfixOperator__Group__0__Impl : ( ruleVariableReference ) ;
    public final void rule__PostfixOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3586:1: ( ( ruleVariableReference ) )
            // InternalMyDsl.g:3587:1: ( ruleVariableReference )
            {
            // InternalMyDsl.g:3587:1: ( ruleVariableReference )
            // InternalMyDsl.g:3588:2: ruleVariableReference
            {
             before(grammarAccess.getPostfixOperatorAccess().getVariableReferenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getPostfixOperatorAccess().getVariableReferenceParserRuleCall_0()); 

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
    // $ANTLR end "rule__PostfixOperator__Group__0__Impl"


    // $ANTLR start "rule__PostfixOperator__Group__1"
    // InternalMyDsl.g:3597:1: rule__PostfixOperator__Group__1 : rule__PostfixOperator__Group__1__Impl ;
    public final void rule__PostfixOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3601:1: ( rule__PostfixOperator__Group__1__Impl )
            // InternalMyDsl.g:3602:2: rule__PostfixOperator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PostfixOperator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixOperator__Group__1"


    // $ANTLR start "rule__PostfixOperator__Group__1__Impl"
    // InternalMyDsl.g:3608:1: rule__PostfixOperator__Group__1__Impl : ( ( rule__PostfixOperator__Alternatives_1 ) ) ;
    public final void rule__PostfixOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3612:1: ( ( ( rule__PostfixOperator__Alternatives_1 ) ) )
            // InternalMyDsl.g:3613:1: ( ( rule__PostfixOperator__Alternatives_1 ) )
            {
            // InternalMyDsl.g:3613:1: ( ( rule__PostfixOperator__Alternatives_1 ) )
            // InternalMyDsl.g:3614:2: ( rule__PostfixOperator__Alternatives_1 )
            {
             before(grammarAccess.getPostfixOperatorAccess().getAlternatives_1()); 
            // InternalMyDsl.g:3615:2: ( rule__PostfixOperator__Alternatives_1 )
            // InternalMyDsl.g:3615:3: rule__PostfixOperator__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__PostfixOperator__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPostfixOperatorAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__PostfixOperator__Group__1__Impl"


    // $ANTLR start "rule__PrefixOperator__Group__0"
    // InternalMyDsl.g:3624:1: rule__PrefixOperator__Group__0 : rule__PrefixOperator__Group__0__Impl rule__PrefixOperator__Group__1 ;
    public final void rule__PrefixOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3628:1: ( rule__PrefixOperator__Group__0__Impl rule__PrefixOperator__Group__1 )
            // InternalMyDsl.g:3629:2: rule__PrefixOperator__Group__0__Impl rule__PrefixOperator__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__PrefixOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrefixOperator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOperator__Group__0"


    // $ANTLR start "rule__PrefixOperator__Group__0__Impl"
    // InternalMyDsl.g:3636:1: rule__PrefixOperator__Group__0__Impl : ( ( rule__PrefixOperator__Alternatives_0 ) ) ;
    public final void rule__PrefixOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3640:1: ( ( ( rule__PrefixOperator__Alternatives_0 ) ) )
            // InternalMyDsl.g:3641:1: ( ( rule__PrefixOperator__Alternatives_0 ) )
            {
            // InternalMyDsl.g:3641:1: ( ( rule__PrefixOperator__Alternatives_0 ) )
            // InternalMyDsl.g:3642:2: ( rule__PrefixOperator__Alternatives_0 )
            {
             before(grammarAccess.getPrefixOperatorAccess().getAlternatives_0()); 
            // InternalMyDsl.g:3643:2: ( rule__PrefixOperator__Alternatives_0 )
            // InternalMyDsl.g:3643:3: rule__PrefixOperator__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PrefixOperator__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPrefixOperatorAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__PrefixOperator__Group__0__Impl"


    // $ANTLR start "rule__PrefixOperator__Group__1"
    // InternalMyDsl.g:3651:1: rule__PrefixOperator__Group__1 : rule__PrefixOperator__Group__1__Impl ;
    public final void rule__PrefixOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3655:1: ( rule__PrefixOperator__Group__1__Impl )
            // InternalMyDsl.g:3656:2: rule__PrefixOperator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrefixOperator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOperator__Group__1"


    // $ANTLR start "rule__PrefixOperator__Group__1__Impl"
    // InternalMyDsl.g:3662:1: rule__PrefixOperator__Group__1__Impl : ( ruleVariableReference ) ;
    public final void rule__PrefixOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3666:1: ( ( ruleVariableReference ) )
            // InternalMyDsl.g:3667:1: ( ruleVariableReference )
            {
            // InternalMyDsl.g:3667:1: ( ruleVariableReference )
            // InternalMyDsl.g:3668:2: ruleVariableReference
            {
             before(grammarAccess.getPrefixOperatorAccess().getVariableReferenceParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getPrefixOperatorAccess().getVariableReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__PrefixOperator__Group__1__Impl"


    // $ANTLR start "rule__AnonymousFunction__Group__0"
    // InternalMyDsl.g:3678:1: rule__AnonymousFunction__Group__0 : rule__AnonymousFunction__Group__0__Impl rule__AnonymousFunction__Group__1 ;
    public final void rule__AnonymousFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3682:1: ( rule__AnonymousFunction__Group__0__Impl rule__AnonymousFunction__Group__1 )
            // InternalMyDsl.g:3683:2: rule__AnonymousFunction__Group__0__Impl rule__AnonymousFunction__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__AnonymousFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnonymousFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousFunction__Group__0"


    // $ANTLR start "rule__AnonymousFunction__Group__0__Impl"
    // InternalMyDsl.g:3690:1: rule__AnonymousFunction__Group__0__Impl : ( 'function' ) ;
    public final void rule__AnonymousFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3694:1: ( ( 'function' ) )
            // InternalMyDsl.g:3695:1: ( 'function' )
            {
            // InternalMyDsl.g:3695:1: ( 'function' )
            // InternalMyDsl.g:3696:2: 'function'
            {
             before(grammarAccess.getAnonymousFunctionAccess().getFunctionKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getAnonymousFunctionAccess().getFunctionKeyword_0()); 

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
    // $ANTLR end "rule__AnonymousFunction__Group__0__Impl"


    // $ANTLR start "rule__AnonymousFunction__Group__1"
    // InternalMyDsl.g:3705:1: rule__AnonymousFunction__Group__1 : rule__AnonymousFunction__Group__1__Impl rule__AnonymousFunction__Group__2 ;
    public final void rule__AnonymousFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3709:1: ( rule__AnonymousFunction__Group__1__Impl rule__AnonymousFunction__Group__2 )
            // InternalMyDsl.g:3710:2: rule__AnonymousFunction__Group__1__Impl rule__AnonymousFunction__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__AnonymousFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnonymousFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousFunction__Group__1"


    // $ANTLR start "rule__AnonymousFunction__Group__1__Impl"
    // InternalMyDsl.g:3717:1: rule__AnonymousFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__AnonymousFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3721:1: ( ( '(' ) )
            // InternalMyDsl.g:3722:1: ( '(' )
            {
            // InternalMyDsl.g:3722:1: ( '(' )
            // InternalMyDsl.g:3723:2: '('
            {
             before(grammarAccess.getAnonymousFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getAnonymousFunctionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__AnonymousFunction__Group__1__Impl"


    // $ANTLR start "rule__AnonymousFunction__Group__2"
    // InternalMyDsl.g:3732:1: rule__AnonymousFunction__Group__2 : rule__AnonymousFunction__Group__2__Impl rule__AnonymousFunction__Group__3 ;
    public final void rule__AnonymousFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3736:1: ( rule__AnonymousFunction__Group__2__Impl rule__AnonymousFunction__Group__3 )
            // InternalMyDsl.g:3737:2: rule__AnonymousFunction__Group__2__Impl rule__AnonymousFunction__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__AnonymousFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnonymousFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousFunction__Group__2"


    // $ANTLR start "rule__AnonymousFunction__Group__2__Impl"
    // InternalMyDsl.g:3744:1: rule__AnonymousFunction__Group__2__Impl : ( ( rule__AnonymousFunction__Group_2__0 )? ) ;
    public final void rule__AnonymousFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3748:1: ( ( ( rule__AnonymousFunction__Group_2__0 )? ) )
            // InternalMyDsl.g:3749:1: ( ( rule__AnonymousFunction__Group_2__0 )? )
            {
            // InternalMyDsl.g:3749:1: ( ( rule__AnonymousFunction__Group_2__0 )? )
            // InternalMyDsl.g:3750:2: ( rule__AnonymousFunction__Group_2__0 )?
            {
             before(grammarAccess.getAnonymousFunctionAccess().getGroup_2()); 
            // InternalMyDsl.g:3751:2: ( rule__AnonymousFunction__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:3751:3: rule__AnonymousFunction__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnonymousFunction__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnonymousFunctionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AnonymousFunction__Group__2__Impl"


    // $ANTLR start "rule__AnonymousFunction__Group__3"
    // InternalMyDsl.g:3759:1: rule__AnonymousFunction__Group__3 : rule__AnonymousFunction__Group__3__Impl rule__AnonymousFunction__Group__4 ;
    public final void rule__AnonymousFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3763:1: ( rule__AnonymousFunction__Group__3__Impl rule__AnonymousFunction__Group__4 )
            // InternalMyDsl.g:3764:2: rule__AnonymousFunction__Group__3__Impl rule__AnonymousFunction__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__AnonymousFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnonymousFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousFunction__Group__3"


    // $ANTLR start "rule__AnonymousFunction__Group__3__Impl"
    // InternalMyDsl.g:3771:1: rule__AnonymousFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__AnonymousFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3775:1: ( ( ')' ) )
            // InternalMyDsl.g:3776:1: ( ')' )
            {
            // InternalMyDsl.g:3776:1: ( ')' )
            // InternalMyDsl.g:3777:2: ')'
            {
             before(grammarAccess.getAnonymousFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAnonymousFunctionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__AnonymousFunction__Group__3__Impl"


    // $ANTLR start "rule__AnonymousFunction__Group__4"
    // InternalMyDsl.g:3786:1: rule__AnonymousFunction__Group__4 : rule__AnonymousFunction__Group__4__Impl ;
    public final void rule__AnonymousFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3790:1: ( rule__AnonymousFunction__Group__4__Impl )
            // InternalMyDsl.g:3791:2: rule__AnonymousFunction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnonymousFunction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousFunction__Group__4"


    // $ANTLR start "rule__AnonymousFunction__Group__4__Impl"
    // InternalMyDsl.g:3797:1: rule__AnonymousFunction__Group__4__Impl : ( ( rule__AnonymousFunction__BodyAssignment_4 ) ) ;
    public final void rule__AnonymousFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3801:1: ( ( ( rule__AnonymousFunction__BodyAssignment_4 ) ) )
            // InternalMyDsl.g:3802:1: ( ( rule__AnonymousFunction__BodyAssignment_4 ) )
            {
            // InternalMyDsl.g:3802:1: ( ( rule__AnonymousFunction__BodyAssignment_4 ) )
            // InternalMyDsl.g:3803:2: ( rule__AnonymousFunction__BodyAssignment_4 )
            {
             before(grammarAccess.getAnonymousFunctionAccess().getBodyAssignment_4()); 
            // InternalMyDsl.g:3804:2: ( rule__AnonymousFunction__BodyAssignment_4 )
            // InternalMyDsl.g:3804:3: rule__AnonymousFunction__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AnonymousFunction__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnonymousFunctionAccess().getBodyAssignment_4()); 

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
    // $ANTLR end "rule__AnonymousFunction__Group__4__Impl"


    // $ANTLR start "rule__AnonymousFunction__Group_2__0"
    // InternalMyDsl.g:3813:1: rule__AnonymousFunction__Group_2__0 : rule__AnonymousFunction__Group_2__0__Impl rule__AnonymousFunction__Group_2__1 ;
    public final void rule__AnonymousFunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3817:1: ( rule__AnonymousFunction__Group_2__0__Impl rule__AnonymousFunction__Group_2__1 )
            // InternalMyDsl.g:3818:2: rule__AnonymousFunction__Group_2__0__Impl rule__AnonymousFunction__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__AnonymousFunction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnonymousFunction__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousFunction__Group_2__0"


    // $ANTLR start "rule__AnonymousFunction__Group_2__0__Impl"
    // InternalMyDsl.g:3825:1: rule__AnonymousFunction__Group_2__0__Impl : ( ( rule__AnonymousFunction__ParametersAssignment_2_0 ) ) ;
    public final void rule__AnonymousFunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3829:1: ( ( ( rule__AnonymousFunction__ParametersAssignment_2_0 ) ) )
            // InternalMyDsl.g:3830:1: ( ( rule__AnonymousFunction__ParametersAssignment_2_0 ) )
            {
            // InternalMyDsl.g:3830:1: ( ( rule__AnonymousFunction__ParametersAssignment_2_0 ) )
            // InternalMyDsl.g:3831:2: ( rule__AnonymousFunction__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getAnonymousFunctionAccess().getParametersAssignment_2_0()); 
            // InternalMyDsl.g:3832:2: ( rule__AnonymousFunction__ParametersAssignment_2_0 )
            // InternalMyDsl.g:3832:3: rule__AnonymousFunction__ParametersAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AnonymousFunction__ParametersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAnonymousFunctionAccess().getParametersAssignment_2_0()); 

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
    // $ANTLR end "rule__AnonymousFunction__Group_2__0__Impl"


    // $ANTLR start "rule__AnonymousFunction__Group_2__1"
    // InternalMyDsl.g:3840:1: rule__AnonymousFunction__Group_2__1 : rule__AnonymousFunction__Group_2__1__Impl ;
    public final void rule__AnonymousFunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3844:1: ( rule__AnonymousFunction__Group_2__1__Impl )
            // InternalMyDsl.g:3845:2: rule__AnonymousFunction__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnonymousFunction__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousFunction__Group_2__1"


    // $ANTLR start "rule__AnonymousFunction__Group_2__1__Impl"
    // InternalMyDsl.g:3851:1: rule__AnonymousFunction__Group_2__1__Impl : ( ( rule__AnonymousFunction__Group_2_1__0 )* ) ;
    public final void rule__AnonymousFunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3855:1: ( ( ( rule__AnonymousFunction__Group_2_1__0 )* ) )
            // InternalMyDsl.g:3856:1: ( ( rule__AnonymousFunction__Group_2_1__0 )* )
            {
            // InternalMyDsl.g:3856:1: ( ( rule__AnonymousFunction__Group_2_1__0 )* )
            // InternalMyDsl.g:3857:2: ( rule__AnonymousFunction__Group_2_1__0 )*
            {
             before(grammarAccess.getAnonymousFunctionAccess().getGroup_2_1()); 
            // InternalMyDsl.g:3858:2: ( rule__AnonymousFunction__Group_2_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==50) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:3858:3: rule__AnonymousFunction__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AnonymousFunction__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getAnonymousFunctionAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__AnonymousFunction__Group_2__1__Impl"


    // $ANTLR start "rule__AnonymousFunction__Group_2_1__0"
    // InternalMyDsl.g:3867:1: rule__AnonymousFunction__Group_2_1__0 : rule__AnonymousFunction__Group_2_1__0__Impl rule__AnonymousFunction__Group_2_1__1 ;
    public final void rule__AnonymousFunction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3871:1: ( rule__AnonymousFunction__Group_2_1__0__Impl rule__AnonymousFunction__Group_2_1__1 )
            // InternalMyDsl.g:3872:2: rule__AnonymousFunction__Group_2_1__0__Impl rule__AnonymousFunction__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__AnonymousFunction__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnonymousFunction__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousFunction__Group_2_1__0"


    // $ANTLR start "rule__AnonymousFunction__Group_2_1__0__Impl"
    // InternalMyDsl.g:3879:1: rule__AnonymousFunction__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__AnonymousFunction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3883:1: ( ( ',' ) )
            // InternalMyDsl.g:3884:1: ( ',' )
            {
            // InternalMyDsl.g:3884:1: ( ',' )
            // InternalMyDsl.g:3885:2: ','
            {
             before(grammarAccess.getAnonymousFunctionAccess().getCommaKeyword_2_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAnonymousFunctionAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__AnonymousFunction__Group_2_1__0__Impl"


    // $ANTLR start "rule__AnonymousFunction__Group_2_1__1"
    // InternalMyDsl.g:3894:1: rule__AnonymousFunction__Group_2_1__1 : rule__AnonymousFunction__Group_2_1__1__Impl ;
    public final void rule__AnonymousFunction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3898:1: ( rule__AnonymousFunction__Group_2_1__1__Impl )
            // InternalMyDsl.g:3899:2: rule__AnonymousFunction__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnonymousFunction__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousFunction__Group_2_1__1"


    // $ANTLR start "rule__AnonymousFunction__Group_2_1__1__Impl"
    // InternalMyDsl.g:3905:1: rule__AnonymousFunction__Group_2_1__1__Impl : ( ( rule__AnonymousFunction__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__AnonymousFunction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3909:1: ( ( ( rule__AnonymousFunction__ParametersAssignment_2_1_1 ) ) )
            // InternalMyDsl.g:3910:1: ( ( rule__AnonymousFunction__ParametersAssignment_2_1_1 ) )
            {
            // InternalMyDsl.g:3910:1: ( ( rule__AnonymousFunction__ParametersAssignment_2_1_1 ) )
            // InternalMyDsl.g:3911:2: ( rule__AnonymousFunction__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getAnonymousFunctionAccess().getParametersAssignment_2_1_1()); 
            // InternalMyDsl.g:3912:2: ( rule__AnonymousFunction__ParametersAssignment_2_1_1 )
            // InternalMyDsl.g:3912:3: rule__AnonymousFunction__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AnonymousFunction__ParametersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAnonymousFunctionAccess().getParametersAssignment_2_1_1()); 

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
    // $ANTLR end "rule__AnonymousFunction__Group_2_1__1__Impl"


    // $ANTLR start "rule__NUMBER__Group__0"
    // InternalMyDsl.g:3921:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3925:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // InternalMyDsl.g:3926:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__NUMBER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__0"


    // $ANTLR start "rule__NUMBER__Group__0__Impl"
    // InternalMyDsl.g:3933:1: rule__NUMBER__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3937:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3938:1: ( RULE_INT )
            {
            // InternalMyDsl.g:3938:1: ( RULE_INT )
            // InternalMyDsl.g:3939:2: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__NUMBER__Group__0__Impl"


    // $ANTLR start "rule__NUMBER__Group__1"
    // InternalMyDsl.g:3948:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3952:1: ( rule__NUMBER__Group__1__Impl )
            // InternalMyDsl.g:3953:2: rule__NUMBER__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__1"


    // $ANTLR start "rule__NUMBER__Group__1__Impl"
    // InternalMyDsl.g:3959:1: rule__NUMBER__Group__1__Impl : ( ( rule__NUMBER__Group_1__0 )? ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3963:1: ( ( ( rule__NUMBER__Group_1__0 )? ) )
            // InternalMyDsl.g:3964:1: ( ( rule__NUMBER__Group_1__0 )? )
            {
            // InternalMyDsl.g:3964:1: ( ( rule__NUMBER__Group_1__0 )? )
            // InternalMyDsl.g:3965:2: ( rule__NUMBER__Group_1__0 )?
            {
             before(grammarAccess.getNUMBERAccess().getGroup_1()); 
            // InternalMyDsl.g:3966:2: ( rule__NUMBER__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==58) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:3966:3: rule__NUMBER__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NUMBER__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNUMBERAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NUMBER__Group__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__0"
    // InternalMyDsl.g:3975:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3979:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // InternalMyDsl.g:3980:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__NUMBER__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__0"


    // $ANTLR start "rule__NUMBER__Group_1__0__Impl"
    // InternalMyDsl.g:3987:1: rule__NUMBER__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3991:1: ( ( '.' ) )
            // InternalMyDsl.g:3992:1: ( '.' )
            {
            // InternalMyDsl.g:3992:1: ( '.' )
            // InternalMyDsl.g:3993:2: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__NUMBER__Group_1__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__1"
    // InternalMyDsl.g:4002:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4006:1: ( rule__NUMBER__Group_1__1__Impl )
            // InternalMyDsl.g:4007:2: rule__NUMBER__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__1"


    // $ANTLR start "rule__NUMBER__Group_1__1__Impl"
    // InternalMyDsl.g:4013:1: rule__NUMBER__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4017:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4018:1: ( RULE_INT )
            {
            // InternalMyDsl.g:4018:1: ( RULE_INT )
            // InternalMyDsl.g:4019:2: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__NUMBER__Group_1__1__Impl"


    // $ANTLR start "rule__Boolean__Group__0"
    // InternalMyDsl.g:4029:1: rule__Boolean__Group__0 : rule__Boolean__Group__0__Impl rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4033:1: ( rule__Boolean__Group__0__Impl rule__Boolean__Group__1 )
            // InternalMyDsl.g:4034:2: rule__Boolean__Group__0__Impl rule__Boolean__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Boolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__0"


    // $ANTLR start "rule__Boolean__Group__0__Impl"
    // InternalMyDsl.g:4041:1: rule__Boolean__Group__0__Impl : ( () ) ;
    public final void rule__Boolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4045:1: ( ( () ) )
            // InternalMyDsl.g:4046:1: ( () )
            {
            // InternalMyDsl.g:4046:1: ( () )
            // InternalMyDsl.g:4047:2: ()
            {
             before(grammarAccess.getBooleanAccess().getBooleanAction_0()); 
            // InternalMyDsl.g:4048:2: ()
            // InternalMyDsl.g:4048:3: 
            {
            }

             after(grammarAccess.getBooleanAccess().getBooleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__0__Impl"


    // $ANTLR start "rule__Boolean__Group__1"
    // InternalMyDsl.g:4056:1: rule__Boolean__Group__1 : rule__Boolean__Group__1__Impl ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4060:1: ( rule__Boolean__Group__1__Impl )
            // InternalMyDsl.g:4061:2: rule__Boolean__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__1"


    // $ANTLR start "rule__Boolean__Group__1__Impl"
    // InternalMyDsl.g:4067:1: rule__Boolean__Group__1__Impl : ( ( rule__Boolean__ValueAssignment_1 ) ) ;
    public final void rule__Boolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4071:1: ( ( ( rule__Boolean__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:4072:1: ( ( rule__Boolean__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:4072:1: ( ( rule__Boolean__ValueAssignment_1 ) )
            // InternalMyDsl.g:4073:2: ( rule__Boolean__ValueAssignment_1 )
            {
             before(grammarAccess.getBooleanAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:4074:2: ( rule__Boolean__ValueAssignment_1 )
            // InternalMyDsl.g:4074:3: rule__Boolean__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Boolean__Group__1__Impl"


    // $ANTLR start "rule__NotBoolean__Group__0"
    // InternalMyDsl.g:4083:1: rule__NotBoolean__Group__0 : rule__NotBoolean__Group__0__Impl rule__NotBoolean__Group__1 ;
    public final void rule__NotBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4087:1: ( rule__NotBoolean__Group__0__Impl rule__NotBoolean__Group__1 )
            // InternalMyDsl.g:4088:2: rule__NotBoolean__Group__0__Impl rule__NotBoolean__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__NotBoolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotBoolean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotBoolean__Group__0"


    // $ANTLR start "rule__NotBoolean__Group__0__Impl"
    // InternalMyDsl.g:4095:1: rule__NotBoolean__Group__0__Impl : ( () ) ;
    public final void rule__NotBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4099:1: ( ( () ) )
            // InternalMyDsl.g:4100:1: ( () )
            {
            // InternalMyDsl.g:4100:1: ( () )
            // InternalMyDsl.g:4101:2: ()
            {
             before(grammarAccess.getNotBooleanAccess().getNotBooleanAction_0()); 
            // InternalMyDsl.g:4102:2: ()
            // InternalMyDsl.g:4102:3: 
            {
            }

             after(grammarAccess.getNotBooleanAccess().getNotBooleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotBoolean__Group__0__Impl"


    // $ANTLR start "rule__NotBoolean__Group__1"
    // InternalMyDsl.g:4110:1: rule__NotBoolean__Group__1 : rule__NotBoolean__Group__1__Impl ;
    public final void rule__NotBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4114:1: ( rule__NotBoolean__Group__1__Impl )
            // InternalMyDsl.g:4115:2: rule__NotBoolean__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotBoolean__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotBoolean__Group__1"


    // $ANTLR start "rule__NotBoolean__Group__1__Impl"
    // InternalMyDsl.g:4121:1: rule__NotBoolean__Group__1__Impl : ( ( rule__NotBoolean__ValueAssignment_1 ) ) ;
    public final void rule__NotBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4125:1: ( ( ( rule__NotBoolean__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:4126:1: ( ( rule__NotBoolean__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:4126:1: ( ( rule__NotBoolean__ValueAssignment_1 ) )
            // InternalMyDsl.g:4127:2: ( rule__NotBoolean__ValueAssignment_1 )
            {
             before(grammarAccess.getNotBooleanAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:4128:2: ( rule__NotBoolean__ValueAssignment_1 )
            // InternalMyDsl.g:4128:3: rule__NotBoolean__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NotBoolean__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNotBooleanAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__NotBoolean__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalMyDsl.g:4137:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4141:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalMyDsl.g:4142:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalMyDsl.g:4149:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4153:1: ( ( 'if' ) )
            // InternalMyDsl.g:4154:1: ( 'if' )
            {
            // InternalMyDsl.g:4154:1: ( 'if' )
            // InternalMyDsl.g:4155:2: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalMyDsl.g:4164:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4168:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalMyDsl.g:4169:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalMyDsl.g:4176:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4180:1: ( ( '(' ) )
            // InternalMyDsl.g:4181:1: ( '(' )
            {
            // InternalMyDsl.g:4181:1: ( '(' )
            // InternalMyDsl.g:4182:2: '('
            {
             before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalMyDsl.g:4191:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4195:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalMyDsl.g:4196:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalMyDsl.g:4203:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__ConditionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4207:1: ( ( ( rule__IfStatement__ConditionAssignment_2 ) ) )
            // InternalMyDsl.g:4208:1: ( ( rule__IfStatement__ConditionAssignment_2 ) )
            {
            // InternalMyDsl.g:4208:1: ( ( rule__IfStatement__ConditionAssignment_2 ) )
            // InternalMyDsl.g:4209:2: ( rule__IfStatement__ConditionAssignment_2 )
            {
             before(grammarAccess.getIfStatementAccess().getConditionAssignment_2()); 
            // InternalMyDsl.g:4210:2: ( rule__IfStatement__ConditionAssignment_2 )
            // InternalMyDsl.g:4210:3: rule__IfStatement__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getConditionAssignment_2()); 

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
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalMyDsl.g:4218:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4222:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalMyDsl.g:4223:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalMyDsl.g:4230:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4234:1: ( ( ')' ) )
            // InternalMyDsl.g:4235:1: ( ')' )
            {
            // InternalMyDsl.g:4235:1: ( ')' )
            // InternalMyDsl.g:4236:2: ')'
            {
             before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalMyDsl.g:4245:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4249:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalMyDsl.g:4250:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalMyDsl.g:4257:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__ThenBranchAssignment_4 ) ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4261:1: ( ( ( rule__IfStatement__ThenBranchAssignment_4 ) ) )
            // InternalMyDsl.g:4262:1: ( ( rule__IfStatement__ThenBranchAssignment_4 ) )
            {
            // InternalMyDsl.g:4262:1: ( ( rule__IfStatement__ThenBranchAssignment_4 ) )
            // InternalMyDsl.g:4263:2: ( rule__IfStatement__ThenBranchAssignment_4 )
            {
             before(grammarAccess.getIfStatementAccess().getThenBranchAssignment_4()); 
            // InternalMyDsl.g:4264:2: ( rule__IfStatement__ThenBranchAssignment_4 )
            // InternalMyDsl.g:4264:3: rule__IfStatement__ThenBranchAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ThenBranchAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getThenBranchAssignment_4()); 

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
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalMyDsl.g:4272:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4276:1: ( rule__IfStatement__Group__5__Impl )
            // InternalMyDsl.g:4277:2: rule__IfStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalMyDsl.g:4283:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__Group_5__0 )? ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4287:1: ( ( ( rule__IfStatement__Group_5__0 )? ) )
            // InternalMyDsl.g:4288:1: ( ( rule__IfStatement__Group_5__0 )? )
            {
            // InternalMyDsl.g:4288:1: ( ( rule__IfStatement__Group_5__0 )? )
            // InternalMyDsl.g:4289:2: ( rule__IfStatement__Group_5__0 )?
            {
             before(grammarAccess.getIfStatementAccess().getGroup_5()); 
            // InternalMyDsl.g:4290:2: ( rule__IfStatement__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==60) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:4290:3: rule__IfStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStatement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfStatementAccess().getGroup_5()); 

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
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__0"
    // InternalMyDsl.g:4299:1: rule__IfStatement__Group_5__0 : rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 ;
    public final void rule__IfStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4303:1: ( rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 )
            // InternalMyDsl.g:4304:2: rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1
            {
            pushFollow(FOLLOW_33);
            rule__IfStatement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__0"


    // $ANTLR start "rule__IfStatement__Group_5__0__Impl"
    // InternalMyDsl.g:4311:1: rule__IfStatement__Group_5__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4315:1: ( ( 'else' ) )
            // InternalMyDsl.g:4316:1: ( 'else' )
            {
            // InternalMyDsl.g:4316:1: ( 'else' )
            // InternalMyDsl.g:4317:2: 'else'
            {
             before(grammarAccess.getIfStatementAccess().getElseKeyword_5_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getElseKeyword_5_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_5__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__1"
    // InternalMyDsl.g:4326:1: rule__IfStatement__Group_5__1 : rule__IfStatement__Group_5__1__Impl ;
    public final void rule__IfStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4330:1: ( rule__IfStatement__Group_5__1__Impl )
            // InternalMyDsl.g:4331:2: rule__IfStatement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__1"


    // $ANTLR start "rule__IfStatement__Group_5__1__Impl"
    // InternalMyDsl.g:4337:1: rule__IfStatement__Group_5__1__Impl : ( ( rule__IfStatement__ElseBranchAssignment_5_1 ) ) ;
    public final void rule__IfStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4341:1: ( ( ( rule__IfStatement__ElseBranchAssignment_5_1 ) ) )
            // InternalMyDsl.g:4342:1: ( ( rule__IfStatement__ElseBranchAssignment_5_1 ) )
            {
            // InternalMyDsl.g:4342:1: ( ( rule__IfStatement__ElseBranchAssignment_5_1 ) )
            // InternalMyDsl.g:4343:2: ( rule__IfStatement__ElseBranchAssignment_5_1 )
            {
             before(grammarAccess.getIfStatementAccess().getElseBranchAssignment_5_1()); 
            // InternalMyDsl.g:4344:2: ( rule__IfStatement__ElseBranchAssignment_5_1 )
            // InternalMyDsl.g:4344:3: rule__IfStatement__ElseBranchAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ElseBranchAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getElseBranchAssignment_5_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_5__1__Impl"


    // $ANTLR start "rule__ForLoop__Group__0"
    // InternalMyDsl.g:4353:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4357:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalMyDsl.g:4358:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ForLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0"


    // $ANTLR start "rule__ForLoop__Group__0__Impl"
    // InternalMyDsl.g:4365:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4369:1: ( ( 'for' ) )
            // InternalMyDsl.g:4370:1: ( 'for' )
            {
            // InternalMyDsl.g:4370:1: ( 'for' )
            // InternalMyDsl.g:4371:2: 'for'
            {
             before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getForKeyword_0()); 

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
    // $ANTLR end "rule__ForLoop__Group__0__Impl"


    // $ANTLR start "rule__ForLoop__Group__1"
    // InternalMyDsl.g:4380:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4384:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalMyDsl.g:4385:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ForLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1"


    // $ANTLR start "rule__ForLoop__Group__1__Impl"
    // InternalMyDsl.g:4392:1: rule__ForLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4396:1: ( ( '(' ) )
            // InternalMyDsl.g:4397:1: ( '(' )
            {
            // InternalMyDsl.g:4397:1: ( '(' )
            // InternalMyDsl.g:4398:2: '('
            {
             before(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ForLoop__Group__1__Impl"


    // $ANTLR start "rule__ForLoop__Group__2"
    // InternalMyDsl.g:4407:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4411:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalMyDsl.g:4412:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ForLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2"


    // $ANTLR start "rule__ForLoop__Group__2__Impl"
    // InternalMyDsl.g:4419:1: rule__ForLoop__Group__2__Impl : ( ( rule__ForLoop__InitializationAssignment_2 ) ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4423:1: ( ( ( rule__ForLoop__InitializationAssignment_2 ) ) )
            // InternalMyDsl.g:4424:1: ( ( rule__ForLoop__InitializationAssignment_2 ) )
            {
            // InternalMyDsl.g:4424:1: ( ( rule__ForLoop__InitializationAssignment_2 ) )
            // InternalMyDsl.g:4425:2: ( rule__ForLoop__InitializationAssignment_2 )
            {
             before(grammarAccess.getForLoopAccess().getInitializationAssignment_2()); 
            // InternalMyDsl.g:4426:2: ( rule__ForLoop__InitializationAssignment_2 )
            // InternalMyDsl.g:4426:3: rule__ForLoop__InitializationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__InitializationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getInitializationAssignment_2()); 

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
    // $ANTLR end "rule__ForLoop__Group__2__Impl"


    // $ANTLR start "rule__ForLoop__Group__3"
    // InternalMyDsl.g:4434:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4438:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalMyDsl.g:4439:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ForLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3"


    // $ANTLR start "rule__ForLoop__Group__3__Impl"
    // InternalMyDsl.g:4446:1: rule__ForLoop__Group__3__Impl : ( ';' ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4450:1: ( ( ';' ) )
            // InternalMyDsl.g:4451:1: ( ';' )
            {
            // InternalMyDsl.g:4451:1: ( ';' )
            // InternalMyDsl.g:4452:2: ';'
            {
             before(grammarAccess.getForLoopAccess().getSemicolonKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__ForLoop__Group__3__Impl"


    // $ANTLR start "rule__ForLoop__Group__4"
    // InternalMyDsl.g:4461:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4465:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // InternalMyDsl.g:4466:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ForLoop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4"


    // $ANTLR start "rule__ForLoop__Group__4__Impl"
    // InternalMyDsl.g:4473:1: rule__ForLoop__Group__4__Impl : ( ( rule__ForLoop__ConditionAssignment_4 ) ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4477:1: ( ( ( rule__ForLoop__ConditionAssignment_4 ) ) )
            // InternalMyDsl.g:4478:1: ( ( rule__ForLoop__ConditionAssignment_4 ) )
            {
            // InternalMyDsl.g:4478:1: ( ( rule__ForLoop__ConditionAssignment_4 ) )
            // InternalMyDsl.g:4479:2: ( rule__ForLoop__ConditionAssignment_4 )
            {
             before(grammarAccess.getForLoopAccess().getConditionAssignment_4()); 
            // InternalMyDsl.g:4480:2: ( rule__ForLoop__ConditionAssignment_4 )
            // InternalMyDsl.g:4480:3: rule__ForLoop__ConditionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__ConditionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getConditionAssignment_4()); 

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
    // $ANTLR end "rule__ForLoop__Group__4__Impl"


    // $ANTLR start "rule__ForLoop__Group__5"
    // InternalMyDsl.g:4488:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4492:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // InternalMyDsl.g:4493:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ForLoop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5"


    // $ANTLR start "rule__ForLoop__Group__5__Impl"
    // InternalMyDsl.g:4500:1: rule__ForLoop__Group__5__Impl : ( ';' ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4504:1: ( ( ';' ) )
            // InternalMyDsl.g:4505:1: ( ';' )
            {
            // InternalMyDsl.g:4505:1: ( ';' )
            // InternalMyDsl.g:4506:2: ';'
            {
             before(grammarAccess.getForLoopAccess().getSemicolonKeyword_5()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__ForLoop__Group__5__Impl"


    // $ANTLR start "rule__ForLoop__Group__6"
    // InternalMyDsl.g:4515:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4519:1: ( rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 )
            // InternalMyDsl.g:4520:2: rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__ForLoop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6"


    // $ANTLR start "rule__ForLoop__Group__6__Impl"
    // InternalMyDsl.g:4527:1: rule__ForLoop__Group__6__Impl : ( ( rule__ForLoop__IncrementAssignment_6 ) ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4531:1: ( ( ( rule__ForLoop__IncrementAssignment_6 ) ) )
            // InternalMyDsl.g:4532:1: ( ( rule__ForLoop__IncrementAssignment_6 ) )
            {
            // InternalMyDsl.g:4532:1: ( ( rule__ForLoop__IncrementAssignment_6 ) )
            // InternalMyDsl.g:4533:2: ( rule__ForLoop__IncrementAssignment_6 )
            {
             before(grammarAccess.getForLoopAccess().getIncrementAssignment_6()); 
            // InternalMyDsl.g:4534:2: ( rule__ForLoop__IncrementAssignment_6 )
            // InternalMyDsl.g:4534:3: rule__ForLoop__IncrementAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__IncrementAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getIncrementAssignment_6()); 

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
    // $ANTLR end "rule__ForLoop__Group__6__Impl"


    // $ANTLR start "rule__ForLoop__Group__7"
    // InternalMyDsl.g:4542:1: rule__ForLoop__Group__7 : rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8 ;
    public final void rule__ForLoop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4546:1: ( rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8 )
            // InternalMyDsl.g:4547:2: rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__ForLoop__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__7"


    // $ANTLR start "rule__ForLoop__Group__7__Impl"
    // InternalMyDsl.g:4554:1: rule__ForLoop__Group__7__Impl : ( ')' ) ;
    public final void rule__ForLoop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4558:1: ( ( ')' ) )
            // InternalMyDsl.g:4559:1: ( ')' )
            {
            // InternalMyDsl.g:4559:1: ( ')' )
            // InternalMyDsl.g:4560:2: ')'
            {
             before(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__ForLoop__Group__7__Impl"


    // $ANTLR start "rule__ForLoop__Group__8"
    // InternalMyDsl.g:4569:1: rule__ForLoop__Group__8 : rule__ForLoop__Group__8__Impl ;
    public final void rule__ForLoop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4573:1: ( rule__ForLoop__Group__8__Impl )
            // InternalMyDsl.g:4574:2: rule__ForLoop__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__8"


    // $ANTLR start "rule__ForLoop__Group__8__Impl"
    // InternalMyDsl.g:4580:1: rule__ForLoop__Group__8__Impl : ( ( rule__ForLoop__BodyAssignment_8 ) ) ;
    public final void rule__ForLoop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4584:1: ( ( ( rule__ForLoop__BodyAssignment_8 ) ) )
            // InternalMyDsl.g:4585:1: ( ( rule__ForLoop__BodyAssignment_8 ) )
            {
            // InternalMyDsl.g:4585:1: ( ( rule__ForLoop__BodyAssignment_8 ) )
            // InternalMyDsl.g:4586:2: ( rule__ForLoop__BodyAssignment_8 )
            {
             before(grammarAccess.getForLoopAccess().getBodyAssignment_8()); 
            // InternalMyDsl.g:4587:2: ( rule__ForLoop__BodyAssignment_8 )
            // InternalMyDsl.g:4587:3: rule__ForLoop__BodyAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__BodyAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getBodyAssignment_8()); 

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
    // $ANTLR end "rule__ForLoop__Group__8__Impl"


    // $ANTLR start "rule__WhileLoop__Group__0"
    // InternalMyDsl.g:4596:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4600:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalMyDsl.g:4601:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__WhileLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0"


    // $ANTLR start "rule__WhileLoop__Group__0__Impl"
    // InternalMyDsl.g:4608:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4612:1: ( ( 'while' ) )
            // InternalMyDsl.g:4613:1: ( 'while' )
            {
            // InternalMyDsl.g:4613:1: ( 'while' )
            // InternalMyDsl.g:4614:2: 'while'
            {
             before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 

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
    // $ANTLR end "rule__WhileLoop__Group__0__Impl"


    // $ANTLR start "rule__WhileLoop__Group__1"
    // InternalMyDsl.g:4623:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4627:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalMyDsl.g:4628:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__WhileLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1"


    // $ANTLR start "rule__WhileLoop__Group__1__Impl"
    // InternalMyDsl.g:4635:1: rule__WhileLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4639:1: ( ( '(' ) )
            // InternalMyDsl.g:4640:1: ( '(' )
            {
            // InternalMyDsl.g:4640:1: ( '(' )
            // InternalMyDsl.g:4641:2: '('
            {
             before(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__WhileLoop__Group__1__Impl"


    // $ANTLR start "rule__WhileLoop__Group__2"
    // InternalMyDsl.g:4650:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4654:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalMyDsl.g:4655:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__WhileLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2"


    // $ANTLR start "rule__WhileLoop__Group__2__Impl"
    // InternalMyDsl.g:4662:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__ConditionAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4666:1: ( ( ( rule__WhileLoop__ConditionAssignment_2 ) ) )
            // InternalMyDsl.g:4667:1: ( ( rule__WhileLoop__ConditionAssignment_2 ) )
            {
            // InternalMyDsl.g:4667:1: ( ( rule__WhileLoop__ConditionAssignment_2 ) )
            // InternalMyDsl.g:4668:2: ( rule__WhileLoop__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getConditionAssignment_2()); 
            // InternalMyDsl.g:4669:2: ( rule__WhileLoop__ConditionAssignment_2 )
            // InternalMyDsl.g:4669:3: rule__WhileLoop__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getConditionAssignment_2()); 

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
    // $ANTLR end "rule__WhileLoop__Group__2__Impl"


    // $ANTLR start "rule__WhileLoop__Group__3"
    // InternalMyDsl.g:4677:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4681:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalMyDsl.g:4682:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__WhileLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3"


    // $ANTLR start "rule__WhileLoop__Group__3__Impl"
    // InternalMyDsl.g:4689:1: rule__WhileLoop__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4693:1: ( ( ')' ) )
            // InternalMyDsl.g:4694:1: ( ')' )
            {
            // InternalMyDsl.g:4694:1: ( ')' )
            // InternalMyDsl.g:4695:2: ')'
            {
             before(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__WhileLoop__Group__3__Impl"


    // $ANTLR start "rule__WhileLoop__Group__4"
    // InternalMyDsl.g:4704:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4708:1: ( rule__WhileLoop__Group__4__Impl )
            // InternalMyDsl.g:4709:2: rule__WhileLoop__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4"


    // $ANTLR start "rule__WhileLoop__Group__4__Impl"
    // InternalMyDsl.g:4715:1: rule__WhileLoop__Group__4__Impl : ( ( rule__WhileLoop__BodyAssignment_4 ) ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4719:1: ( ( ( rule__WhileLoop__BodyAssignment_4 ) ) )
            // InternalMyDsl.g:4720:1: ( ( rule__WhileLoop__BodyAssignment_4 ) )
            {
            // InternalMyDsl.g:4720:1: ( ( rule__WhileLoop__BodyAssignment_4 ) )
            // InternalMyDsl.g:4721:2: ( rule__WhileLoop__BodyAssignment_4 )
            {
             before(grammarAccess.getWhileLoopAccess().getBodyAssignment_4()); 
            // InternalMyDsl.g:4722:2: ( rule__WhileLoop__BodyAssignment_4 )
            // InternalMyDsl.g:4722:3: rule__WhileLoop__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getBodyAssignment_4()); 

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
    // $ANTLR end "rule__WhileLoop__Group__4__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__0"
    // InternalMyDsl.g:4731:1: rule__DoWhileLoop__Group__0 : rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1 ;
    public final void rule__DoWhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4735:1: ( rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1 )
            // InternalMyDsl.g:4736:2: rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__DoWhileLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWhileLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__0"


    // $ANTLR start "rule__DoWhileLoop__Group__0__Impl"
    // InternalMyDsl.g:4743:1: rule__DoWhileLoop__Group__0__Impl : ( 'do' ) ;
    public final void rule__DoWhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4747:1: ( ( 'do' ) )
            // InternalMyDsl.g:4748:1: ( 'do' )
            {
            // InternalMyDsl.g:4748:1: ( 'do' )
            // InternalMyDsl.g:4749:2: 'do'
            {
             before(grammarAccess.getDoWhileLoopAccess().getDoKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDoWhileLoopAccess().getDoKeyword_0()); 

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
    // $ANTLR end "rule__DoWhileLoop__Group__0__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__1"
    // InternalMyDsl.g:4758:1: rule__DoWhileLoop__Group__1 : rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2 ;
    public final void rule__DoWhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4762:1: ( rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2 )
            // InternalMyDsl.g:4763:2: rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__DoWhileLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWhileLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__1"


    // $ANTLR start "rule__DoWhileLoop__Group__1__Impl"
    // InternalMyDsl.g:4770:1: rule__DoWhileLoop__Group__1__Impl : ( ( rule__DoWhileLoop__BodyAssignment_1 ) ) ;
    public final void rule__DoWhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4774:1: ( ( ( rule__DoWhileLoop__BodyAssignment_1 ) ) )
            // InternalMyDsl.g:4775:1: ( ( rule__DoWhileLoop__BodyAssignment_1 ) )
            {
            // InternalMyDsl.g:4775:1: ( ( rule__DoWhileLoop__BodyAssignment_1 ) )
            // InternalMyDsl.g:4776:2: ( rule__DoWhileLoop__BodyAssignment_1 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getBodyAssignment_1()); 
            // InternalMyDsl.g:4777:2: ( rule__DoWhileLoop__BodyAssignment_1 )
            // InternalMyDsl.g:4777:3: rule__DoWhileLoop__BodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DoWhileLoop__BodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileLoopAccess().getBodyAssignment_1()); 

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
    // $ANTLR end "rule__DoWhileLoop__Group__1__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__2"
    // InternalMyDsl.g:4785:1: rule__DoWhileLoop__Group__2 : rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3 ;
    public final void rule__DoWhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4789:1: ( rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3 )
            // InternalMyDsl.g:4790:2: rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__DoWhileLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWhileLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__2"


    // $ANTLR start "rule__DoWhileLoop__Group__2__Impl"
    // InternalMyDsl.g:4797:1: rule__DoWhileLoop__Group__2__Impl : ( 'while' ) ;
    public final void rule__DoWhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4801:1: ( ( 'while' ) )
            // InternalMyDsl.g:4802:1: ( 'while' )
            {
            // InternalMyDsl.g:4802:1: ( 'while' )
            // InternalMyDsl.g:4803:2: 'while'
            {
             before(grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2()); 

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
    // $ANTLR end "rule__DoWhileLoop__Group__2__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__3"
    // InternalMyDsl.g:4812:1: rule__DoWhileLoop__Group__3 : rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4 ;
    public final void rule__DoWhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4816:1: ( rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4 )
            // InternalMyDsl.g:4817:2: rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__DoWhileLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWhileLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__3"


    // $ANTLR start "rule__DoWhileLoop__Group__3__Impl"
    // InternalMyDsl.g:4824:1: rule__DoWhileLoop__Group__3__Impl : ( '(' ) ;
    public final void rule__DoWhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4828:1: ( ( '(' ) )
            // InternalMyDsl.g:4829:1: ( '(' )
            {
            // InternalMyDsl.g:4829:1: ( '(' )
            // InternalMyDsl.g:4830:2: '('
            {
             before(grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__DoWhileLoop__Group__3__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__4"
    // InternalMyDsl.g:4839:1: rule__DoWhileLoop__Group__4 : rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5 ;
    public final void rule__DoWhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4843:1: ( rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5 )
            // InternalMyDsl.g:4844:2: rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__DoWhileLoop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWhileLoop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__4"


    // $ANTLR start "rule__DoWhileLoop__Group__4__Impl"
    // InternalMyDsl.g:4851:1: rule__DoWhileLoop__Group__4__Impl : ( ( rule__DoWhileLoop__ConditionAssignment_4 ) ) ;
    public final void rule__DoWhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4855:1: ( ( ( rule__DoWhileLoop__ConditionAssignment_4 ) ) )
            // InternalMyDsl.g:4856:1: ( ( rule__DoWhileLoop__ConditionAssignment_4 ) )
            {
            // InternalMyDsl.g:4856:1: ( ( rule__DoWhileLoop__ConditionAssignment_4 ) )
            // InternalMyDsl.g:4857:2: ( rule__DoWhileLoop__ConditionAssignment_4 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getConditionAssignment_4()); 
            // InternalMyDsl.g:4858:2: ( rule__DoWhileLoop__ConditionAssignment_4 )
            // InternalMyDsl.g:4858:3: rule__DoWhileLoop__ConditionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DoWhileLoop__ConditionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileLoopAccess().getConditionAssignment_4()); 

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
    // $ANTLR end "rule__DoWhileLoop__Group__4__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__5"
    // InternalMyDsl.g:4866:1: rule__DoWhileLoop__Group__5 : rule__DoWhileLoop__Group__5__Impl rule__DoWhileLoop__Group__6 ;
    public final void rule__DoWhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4870:1: ( rule__DoWhileLoop__Group__5__Impl rule__DoWhileLoop__Group__6 )
            // InternalMyDsl.g:4871:2: rule__DoWhileLoop__Group__5__Impl rule__DoWhileLoop__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__DoWhileLoop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoWhileLoop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__5"


    // $ANTLR start "rule__DoWhileLoop__Group__5__Impl"
    // InternalMyDsl.g:4878:1: rule__DoWhileLoop__Group__5__Impl : ( ')' ) ;
    public final void rule__DoWhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4882:1: ( ( ')' ) )
            // InternalMyDsl.g:4883:1: ( ')' )
            {
            // InternalMyDsl.g:4883:1: ( ')' )
            // InternalMyDsl.g:4884:2: ')'
            {
             before(grammarAccess.getDoWhileLoopAccess().getRightParenthesisKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getDoWhileLoopAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__DoWhileLoop__Group__5__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__6"
    // InternalMyDsl.g:4893:1: rule__DoWhileLoop__Group__6 : rule__DoWhileLoop__Group__6__Impl ;
    public final void rule__DoWhileLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4897:1: ( rule__DoWhileLoop__Group__6__Impl )
            // InternalMyDsl.g:4898:2: rule__DoWhileLoop__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoWhileLoop__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__6"


    // $ANTLR start "rule__DoWhileLoop__Group__6__Impl"
    // InternalMyDsl.g:4904:1: rule__DoWhileLoop__Group__6__Impl : ( ';' ) ;
    public final void rule__DoWhileLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4908:1: ( ( ';' ) )
            // InternalMyDsl.g:4909:1: ( ';' )
            {
            // InternalMyDsl.g:4909:1: ( ';' )
            // InternalMyDsl.g:4910:2: ';'
            {
             before(grammarAccess.getDoWhileLoopAccess().getSemicolonKeyword_6()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDoWhileLoopAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__DoWhileLoop__Group__6__Impl"


    // $ANTLR start "rule__ContinueStatement__Group__0"
    // InternalMyDsl.g:4920:1: rule__ContinueStatement__Group__0 : rule__ContinueStatement__Group__0__Impl rule__ContinueStatement__Group__1 ;
    public final void rule__ContinueStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4924:1: ( rule__ContinueStatement__Group__0__Impl rule__ContinueStatement__Group__1 )
            // InternalMyDsl.g:4925:2: rule__ContinueStatement__Group__0__Impl rule__ContinueStatement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ContinueStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContinueStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContinueStatement__Group__0"


    // $ANTLR start "rule__ContinueStatement__Group__0__Impl"
    // InternalMyDsl.g:4932:1: rule__ContinueStatement__Group__0__Impl : ( 'continue' ) ;
    public final void rule__ContinueStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4936:1: ( ( 'continue' ) )
            // InternalMyDsl.g:4937:1: ( 'continue' )
            {
            // InternalMyDsl.g:4937:1: ( 'continue' )
            // InternalMyDsl.g:4938:2: 'continue'
            {
             before(grammarAccess.getContinueStatementAccess().getContinueKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getContinueStatementAccess().getContinueKeyword_0()); 

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
    // $ANTLR end "rule__ContinueStatement__Group__0__Impl"


    // $ANTLR start "rule__ContinueStatement__Group__1"
    // InternalMyDsl.g:4947:1: rule__ContinueStatement__Group__1 : rule__ContinueStatement__Group__1__Impl ;
    public final void rule__ContinueStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4951:1: ( rule__ContinueStatement__Group__1__Impl )
            // InternalMyDsl.g:4952:2: rule__ContinueStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContinueStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContinueStatement__Group__1"


    // $ANTLR start "rule__ContinueStatement__Group__1__Impl"
    // InternalMyDsl.g:4958:1: rule__ContinueStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__ContinueStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4962:1: ( ( ';' ) )
            // InternalMyDsl.g:4963:1: ( ';' )
            {
            // InternalMyDsl.g:4963:1: ( ';' )
            // InternalMyDsl.g:4964:2: ';'
            {
             before(grammarAccess.getContinueStatementAccess().getSemicolonKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getContinueStatementAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__ContinueStatement__Group__1__Impl"


    // $ANTLR start "rule__BreakStatement__Group__0"
    // InternalMyDsl.g:4974:1: rule__BreakStatement__Group__0 : rule__BreakStatement__Group__0__Impl rule__BreakStatement__Group__1 ;
    public final void rule__BreakStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4978:1: ( rule__BreakStatement__Group__0__Impl rule__BreakStatement__Group__1 )
            // InternalMyDsl.g:4979:2: rule__BreakStatement__Group__0__Impl rule__BreakStatement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BreakStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BreakStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreakStatement__Group__0"


    // $ANTLR start "rule__BreakStatement__Group__0__Impl"
    // InternalMyDsl.g:4986:1: rule__BreakStatement__Group__0__Impl : ( 'break' ) ;
    public final void rule__BreakStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4990:1: ( ( 'break' ) )
            // InternalMyDsl.g:4991:1: ( 'break' )
            {
            // InternalMyDsl.g:4991:1: ( 'break' )
            // InternalMyDsl.g:4992:2: 'break'
            {
             before(grammarAccess.getBreakStatementAccess().getBreakKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getBreakStatementAccess().getBreakKeyword_0()); 

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
    // $ANTLR end "rule__BreakStatement__Group__0__Impl"


    // $ANTLR start "rule__BreakStatement__Group__1"
    // InternalMyDsl.g:5001:1: rule__BreakStatement__Group__1 : rule__BreakStatement__Group__1__Impl ;
    public final void rule__BreakStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5005:1: ( rule__BreakStatement__Group__1__Impl )
            // InternalMyDsl.g:5006:2: rule__BreakStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BreakStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreakStatement__Group__1"


    // $ANTLR start "rule__BreakStatement__Group__1__Impl"
    // InternalMyDsl.g:5012:1: rule__BreakStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__BreakStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5016:1: ( ( ';' ) )
            // InternalMyDsl.g:5017:1: ( ';' )
            {
            // InternalMyDsl.g:5017:1: ( ';' )
            // InternalMyDsl.g:5018:2: ';'
            {
             before(grammarAccess.getBreakStatementAccess().getSemicolonKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getBreakStatementAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__BreakStatement__Group__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__0"
    // InternalMyDsl.g:5028:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5032:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // InternalMyDsl.g:5033:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__FunctionDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__0"


    // $ANTLR start "rule__FunctionDeclaration__Group__0__Impl"
    // InternalMyDsl.g:5040:1: rule__FunctionDeclaration__Group__0__Impl : ( ( rule__FunctionDeclaration__ReturnTypeAssignment_0 )? ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5044:1: ( ( ( rule__FunctionDeclaration__ReturnTypeAssignment_0 )? ) )
            // InternalMyDsl.g:5045:1: ( ( rule__FunctionDeclaration__ReturnTypeAssignment_0 )? )
            {
            // InternalMyDsl.g:5045:1: ( ( rule__FunctionDeclaration__ReturnTypeAssignment_0 )? )
            // InternalMyDsl.g:5046:2: ( rule__FunctionDeclaration__ReturnTypeAssignment_0 )?
            {
             before(grammarAccess.getFunctionDeclarationAccess().getReturnTypeAssignment_0()); 
            // InternalMyDsl.g:5047:2: ( rule__FunctionDeclaration__ReturnTypeAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=39 && LA34_0<=47)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:5047:3: rule__FunctionDeclaration__ReturnTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDeclaration__ReturnTypeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclarationAccess().getReturnTypeAssignment_0()); 

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
    // $ANTLR end "rule__FunctionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__1"
    // InternalMyDsl.g:5055:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5059:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // InternalMyDsl.g:5060:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__FunctionDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__1"


    // $ANTLR start "rule__FunctionDeclaration__Group__1__Impl"
    // InternalMyDsl.g:5067:1: rule__FunctionDeclaration__Group__1__Impl : ( 'function' ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5071:1: ( ( 'function' ) )
            // InternalMyDsl.g:5072:1: ( 'function' )
            {
            // InternalMyDsl.g:5072:1: ( 'function' )
            // InternalMyDsl.g:5073:2: 'function'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_1()); 

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
    // $ANTLR end "rule__FunctionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__2"
    // InternalMyDsl.g:5082:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5086:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // InternalMyDsl.g:5087:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__FunctionDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__2"


    // $ANTLR start "rule__FunctionDeclaration__Group__2__Impl"
    // InternalMyDsl.g:5094:1: rule__FunctionDeclaration__Group__2__Impl : ( ( rule__FunctionDeclaration__NameAssignment_2 ) ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5098:1: ( ( ( rule__FunctionDeclaration__NameAssignment_2 ) ) )
            // InternalMyDsl.g:5099:1: ( ( rule__FunctionDeclaration__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:5099:1: ( ( rule__FunctionDeclaration__NameAssignment_2 ) )
            // InternalMyDsl.g:5100:2: ( rule__FunctionDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:5101:2: ( rule__FunctionDeclaration__NameAssignment_2 )
            // InternalMyDsl.g:5101:3: rule__FunctionDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__FunctionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__3"
    // InternalMyDsl.g:5109:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5113:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // InternalMyDsl.g:5114:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__FunctionDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__3"


    // $ANTLR start "rule__FunctionDeclaration__Group__3__Impl"
    // InternalMyDsl.g:5121:1: rule__FunctionDeclaration__Group__3__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5125:1: ( ( '(' ) )
            // InternalMyDsl.g:5126:1: ( '(' )
            {
            // InternalMyDsl.g:5126:1: ( '(' )
            // InternalMyDsl.g:5127:2: '('
            {
             before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__FunctionDeclaration__Group__3__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__4"
    // InternalMyDsl.g:5136:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5 ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5140:1: ( rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5 )
            // InternalMyDsl.g:5141:2: rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__FunctionDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__4"


    // $ANTLR start "rule__FunctionDeclaration__Group__4__Impl"
    // InternalMyDsl.g:5148:1: rule__FunctionDeclaration__Group__4__Impl : ( ( rule__FunctionDeclaration__Group_4__0 )? ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5152:1: ( ( ( rule__FunctionDeclaration__Group_4__0 )? ) )
            // InternalMyDsl.g:5153:1: ( ( rule__FunctionDeclaration__Group_4__0 )? )
            {
            // InternalMyDsl.g:5153:1: ( ( rule__FunctionDeclaration__Group_4__0 )? )
            // InternalMyDsl.g:5154:2: ( rule__FunctionDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_4()); 
            // InternalMyDsl.g:5155:2: ( rule__FunctionDeclaration__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:5155:3: rule__FunctionDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDeclaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__FunctionDeclaration__Group__4__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__5"
    // InternalMyDsl.g:5163:1: rule__FunctionDeclaration__Group__5 : rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6 ;
    public final void rule__FunctionDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5167:1: ( rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6 )
            // InternalMyDsl.g:5168:2: rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__FunctionDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__5"


    // $ANTLR start "rule__FunctionDeclaration__Group__5__Impl"
    // InternalMyDsl.g:5175:1: rule__FunctionDeclaration__Group__5__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5179:1: ( ( ')' ) )
            // InternalMyDsl.g:5180:1: ( ')' )
            {
            // InternalMyDsl.g:5180:1: ( ')' )
            // InternalMyDsl.g:5181:2: ')'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__FunctionDeclaration__Group__5__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__6"
    // InternalMyDsl.g:5190:1: rule__FunctionDeclaration__Group__6 : rule__FunctionDeclaration__Group__6__Impl ;
    public final void rule__FunctionDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5194:1: ( rule__FunctionDeclaration__Group__6__Impl )
            // InternalMyDsl.g:5195:2: rule__FunctionDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__6"


    // $ANTLR start "rule__FunctionDeclaration__Group__6__Impl"
    // InternalMyDsl.g:5201:1: rule__FunctionDeclaration__Group__6__Impl : ( ( rule__FunctionDeclaration__BodyAssignment_6 ) ) ;
    public final void rule__FunctionDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5205:1: ( ( ( rule__FunctionDeclaration__BodyAssignment_6 ) ) )
            // InternalMyDsl.g:5206:1: ( ( rule__FunctionDeclaration__BodyAssignment_6 ) )
            {
            // InternalMyDsl.g:5206:1: ( ( rule__FunctionDeclaration__BodyAssignment_6 ) )
            // InternalMyDsl.g:5207:2: ( rule__FunctionDeclaration__BodyAssignment_6 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_6()); 
            // InternalMyDsl.g:5208:2: ( rule__FunctionDeclaration__BodyAssignment_6 )
            // InternalMyDsl.g:5208:3: rule__FunctionDeclaration__BodyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__BodyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_6()); 

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
    // $ANTLR end "rule__FunctionDeclaration__Group__6__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_4__0"
    // InternalMyDsl.g:5217:1: rule__FunctionDeclaration__Group_4__0 : rule__FunctionDeclaration__Group_4__0__Impl rule__FunctionDeclaration__Group_4__1 ;
    public final void rule__FunctionDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5221:1: ( rule__FunctionDeclaration__Group_4__0__Impl rule__FunctionDeclaration__Group_4__1 )
            // InternalMyDsl.g:5222:2: rule__FunctionDeclaration__Group_4__0__Impl rule__FunctionDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__FunctionDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_4__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_4__0__Impl"
    // InternalMyDsl.g:5229:1: rule__FunctionDeclaration__Group_4__0__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_4_0 ) ) ;
    public final void rule__FunctionDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5233:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_4_0 ) ) )
            // InternalMyDsl.g:5234:1: ( ( rule__FunctionDeclaration__ParametersAssignment_4_0 ) )
            {
            // InternalMyDsl.g:5234:1: ( ( rule__FunctionDeclaration__ParametersAssignment_4_0 ) )
            // InternalMyDsl.g:5235:2: ( rule__FunctionDeclaration__ParametersAssignment_4_0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_4_0()); 
            // InternalMyDsl.g:5236:2: ( rule__FunctionDeclaration__ParametersAssignment_4_0 )
            // InternalMyDsl.g:5236:3: rule__FunctionDeclaration__ParametersAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__ParametersAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_4_0()); 

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
    // $ANTLR end "rule__FunctionDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_4__1"
    // InternalMyDsl.g:5244:1: rule__FunctionDeclaration__Group_4__1 : rule__FunctionDeclaration__Group_4__1__Impl ;
    public final void rule__FunctionDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5248:1: ( rule__FunctionDeclaration__Group_4__1__Impl )
            // InternalMyDsl.g:5249:2: rule__FunctionDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_4__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_4__1__Impl"
    // InternalMyDsl.g:5255:1: rule__FunctionDeclaration__Group_4__1__Impl : ( ( rule__FunctionDeclaration__Group_4_1__0 )* ) ;
    public final void rule__FunctionDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5259:1: ( ( ( rule__FunctionDeclaration__Group_4_1__0 )* ) )
            // InternalMyDsl.g:5260:1: ( ( rule__FunctionDeclaration__Group_4_1__0 )* )
            {
            // InternalMyDsl.g:5260:1: ( ( rule__FunctionDeclaration__Group_4_1__0 )* )
            // InternalMyDsl.g:5261:2: ( rule__FunctionDeclaration__Group_4_1__0 )*
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_4_1()); 
            // InternalMyDsl.g:5262:2: ( rule__FunctionDeclaration__Group_4_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==50) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:5262:3: rule__FunctionDeclaration__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__FunctionDeclaration__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__FunctionDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_4_1__0"
    // InternalMyDsl.g:5271:1: rule__FunctionDeclaration__Group_4_1__0 : rule__FunctionDeclaration__Group_4_1__0__Impl rule__FunctionDeclaration__Group_4_1__1 ;
    public final void rule__FunctionDeclaration__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5275:1: ( rule__FunctionDeclaration__Group_4_1__0__Impl rule__FunctionDeclaration__Group_4_1__1 )
            // InternalMyDsl.g:5276:2: rule__FunctionDeclaration__Group_4_1__0__Impl rule__FunctionDeclaration__Group_4_1__1
            {
            pushFollow(FOLLOW_12);
            rule__FunctionDeclaration__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_4_1__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_4_1__0__Impl"
    // InternalMyDsl.g:5283:1: rule__FunctionDeclaration__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionDeclaration__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5287:1: ( ( ',' ) )
            // InternalMyDsl.g:5288:1: ( ',' )
            {
            // InternalMyDsl.g:5288:1: ( ',' )
            // InternalMyDsl.g:5289:2: ','
            {
             before(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_4_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__FunctionDeclaration__Group_4_1__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_4_1__1"
    // InternalMyDsl.g:5298:1: rule__FunctionDeclaration__Group_4_1__1 : rule__FunctionDeclaration__Group_4_1__1__Impl ;
    public final void rule__FunctionDeclaration__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5302:1: ( rule__FunctionDeclaration__Group_4_1__1__Impl )
            // InternalMyDsl.g:5303:2: rule__FunctionDeclaration__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group_4_1__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_4_1__1__Impl"
    // InternalMyDsl.g:5309:1: rule__FunctionDeclaration__Group_4_1__1__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_4_1_1 ) ) ;
    public final void rule__FunctionDeclaration__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5313:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_4_1_1 ) ) )
            // InternalMyDsl.g:5314:1: ( ( rule__FunctionDeclaration__ParametersAssignment_4_1_1 ) )
            {
            // InternalMyDsl.g:5314:1: ( ( rule__FunctionDeclaration__ParametersAssignment_4_1_1 ) )
            // InternalMyDsl.g:5315:2: ( rule__FunctionDeclaration__ParametersAssignment_4_1_1 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_4_1_1()); 
            // InternalMyDsl.g:5316:2: ( rule__FunctionDeclaration__ParametersAssignment_4_1_1 )
            // InternalMyDsl.g:5316:3: rule__FunctionDeclaration__ParametersAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__ParametersAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_4_1_1()); 

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
    // $ANTLR end "rule__FunctionDeclaration__Group_4_1__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalMyDsl.g:5325:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5329:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalMyDsl.g:5330:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0"


    // $ANTLR start "rule__FunctionCall__Group__0__Impl"
    // InternalMyDsl.g:5337:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__NameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5341:1: ( ( ( rule__FunctionCall__NameAssignment_0 ) ) )
            // InternalMyDsl.g:5342:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:5342:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            // InternalMyDsl.g:5343:2: ( rule__FunctionCall__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:5344:2: ( rule__FunctionCall__NameAssignment_0 )
            // InternalMyDsl.g:5344:3: rule__FunctionCall__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // InternalMyDsl.g:5352:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5356:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalMyDsl.g:5357:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1"


    // $ANTLR start "rule__FunctionCall__Group__1__Impl"
    // InternalMyDsl.g:5364:1: rule__FunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5368:1: ( ( '(' ) )
            // InternalMyDsl.g:5369:1: ( '(' )
            {
            // InternalMyDsl.g:5369:1: ( '(' )
            // InternalMyDsl.g:5370:2: '('
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FunctionCall__Group__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__2"
    // InternalMyDsl.g:5379:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5383:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalMyDsl.g:5384:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2"


    // $ANTLR start "rule__FunctionCall__Group__2__Impl"
    // InternalMyDsl.g:5391:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Group_2__0 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5395:1: ( ( ( rule__FunctionCall__Group_2__0 )? ) )
            // InternalMyDsl.g:5396:1: ( ( rule__FunctionCall__Group_2__0 )? )
            {
            // InternalMyDsl.g:5396:1: ( ( rule__FunctionCall__Group_2__0 )? )
            // InternalMyDsl.g:5397:2: ( rule__FunctionCall__Group_2__0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2()); 
            // InternalMyDsl.g:5398:2: ( rule__FunctionCall__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_CHAR)||(LA37_0>=15 && LA37_0<=19)||LA37_0==55||LA37_0==57) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:5398:3: rule__FunctionCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallAccess().getGroup_2()); 

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
    // $ANTLR end "rule__FunctionCall__Group__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__3"
    // InternalMyDsl.g:5406:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5410:1: ( rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 )
            // InternalMyDsl.g:5411:2: rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3"


    // $ANTLR start "rule__FunctionCall__Group__3__Impl"
    // InternalMyDsl.g:5418:1: rule__FunctionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5422:1: ( ( ')' ) )
            // InternalMyDsl.g:5423:1: ( ')' )
            {
            // InternalMyDsl.g:5423:1: ( ')' )
            // InternalMyDsl.g:5424:2: ')'
            {
             before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__FunctionCall__Group__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group__4"
    // InternalMyDsl.g:5433:1: rule__FunctionCall__Group__4 : rule__FunctionCall__Group__4__Impl ;
    public final void rule__FunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5437:1: ( rule__FunctionCall__Group__4__Impl )
            // InternalMyDsl.g:5438:2: rule__FunctionCall__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__4"


    // $ANTLR start "rule__FunctionCall__Group__4__Impl"
    // InternalMyDsl.g:5444:1: rule__FunctionCall__Group__4__Impl : ( ';' ) ;
    public final void rule__FunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5448:1: ( ( ';' ) )
            // InternalMyDsl.g:5449:1: ( ';' )
            {
            // InternalMyDsl.g:5449:1: ( ';' )
            // InternalMyDsl.g:5450:2: ';'
            {
             before(grammarAccess.getFunctionCallAccess().getSemicolonKeyword_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__FunctionCall__Group__4__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2__0"
    // InternalMyDsl.g:5460:1: rule__FunctionCall__Group_2__0 : rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 ;
    public final void rule__FunctionCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5464:1: ( rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 )
            // InternalMyDsl.g:5465:2: rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__FunctionCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__0"


    // $ANTLR start "rule__FunctionCall__Group_2__0__Impl"
    // InternalMyDsl.g:5472:1: rule__FunctionCall__Group_2__0__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_2_0 ) ) ;
    public final void rule__FunctionCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5476:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_2_0 ) ) )
            // InternalMyDsl.g:5477:1: ( ( rule__FunctionCall__ArgumentsAssignment_2_0 ) )
            {
            // InternalMyDsl.g:5477:1: ( ( rule__FunctionCall__ArgumentsAssignment_2_0 ) )
            // InternalMyDsl.g:5478:2: ( rule__FunctionCall__ArgumentsAssignment_2_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_0()); 
            // InternalMyDsl.g:5479:2: ( rule__FunctionCall__ArgumentsAssignment_2_0 )
            // InternalMyDsl.g:5479:3: rule__FunctionCall__ArgumentsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ArgumentsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_0()); 

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
    // $ANTLR end "rule__FunctionCall__Group_2__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2__1"
    // InternalMyDsl.g:5487:1: rule__FunctionCall__Group_2__1 : rule__FunctionCall__Group_2__1__Impl ;
    public final void rule__FunctionCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5491:1: ( rule__FunctionCall__Group_2__1__Impl )
            // InternalMyDsl.g:5492:2: rule__FunctionCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__1"


    // $ANTLR start "rule__FunctionCall__Group_2__1__Impl"
    // InternalMyDsl.g:5498:1: rule__FunctionCall__Group_2__1__Impl : ( ( rule__FunctionCall__Group_2_1__0 )* ) ;
    public final void rule__FunctionCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5502:1: ( ( ( rule__FunctionCall__Group_2_1__0 )* ) )
            // InternalMyDsl.g:5503:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            {
            // InternalMyDsl.g:5503:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            // InternalMyDsl.g:5504:2: ( rule__FunctionCall__Group_2_1__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 
            // InternalMyDsl.g:5505:2: ( rule__FunctionCall__Group_2_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==50) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:5505:3: rule__FunctionCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__FunctionCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__FunctionCall__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_1__0"
    // InternalMyDsl.g:5514:1: rule__FunctionCall__Group_2_1__0 : rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 ;
    public final void rule__FunctionCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5518:1: ( rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 )
            // InternalMyDsl.g:5519:2: rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__FunctionCall__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_1__0"


    // $ANTLR start "rule__FunctionCall__Group_2_1__0__Impl"
    // InternalMyDsl.g:5526:1: rule__FunctionCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5530:1: ( ( ',' ) )
            // InternalMyDsl.g:5531:1: ( ',' )
            {
            // InternalMyDsl.g:5531:1: ( ',' )
            // InternalMyDsl.g:5532:2: ','
            {
             before(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__FunctionCall__Group_2_1__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_1__1"
    // InternalMyDsl.g:5541:1: rule__FunctionCall__Group_2_1__1 : rule__FunctionCall__Group_2_1__1__Impl ;
    public final void rule__FunctionCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5545:1: ( rule__FunctionCall__Group_2_1__1__Impl )
            // InternalMyDsl.g:5546:2: rule__FunctionCall__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_1__1"


    // $ANTLR start "rule__FunctionCall__Group_2_1__1__Impl"
    // InternalMyDsl.g:5552:1: rule__FunctionCall__Group_2_1__1__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_2_1_1 ) ) ;
    public final void rule__FunctionCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5556:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_2_1_1 ) ) )
            // InternalMyDsl.g:5557:1: ( ( rule__FunctionCall__ArgumentsAssignment_2_1_1 ) )
            {
            // InternalMyDsl.g:5557:1: ( ( rule__FunctionCall__ArgumentsAssignment_2_1_1 ) )
            // InternalMyDsl.g:5558:2: ( rule__FunctionCall__ArgumentsAssignment_2_1_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_1_1()); 
            // InternalMyDsl.g:5559:2: ( rule__FunctionCall__ArgumentsAssignment_2_1_1 )
            // InternalMyDsl.g:5559:3: rule__FunctionCall__ArgumentsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ArgumentsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__FunctionCall__Group_2_1__1__Impl"


    // $ANTLR start "rule__FunctionReturn__Group__0"
    // InternalMyDsl.g:5568:1: rule__FunctionReturn__Group__0 : rule__FunctionReturn__Group__0__Impl rule__FunctionReturn__Group__1 ;
    public final void rule__FunctionReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5572:1: ( rule__FunctionReturn__Group__0__Impl rule__FunctionReturn__Group__1 )
            // InternalMyDsl.g:5573:2: rule__FunctionReturn__Group__0__Impl rule__FunctionReturn__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__FunctionReturn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionReturn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionReturn__Group__0"


    // $ANTLR start "rule__FunctionReturn__Group__0__Impl"
    // InternalMyDsl.g:5580:1: rule__FunctionReturn__Group__0__Impl : ( 'return' ) ;
    public final void rule__FunctionReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5584:1: ( ( 'return' ) )
            // InternalMyDsl.g:5585:1: ( 'return' )
            {
            // InternalMyDsl.g:5585:1: ( 'return' )
            // InternalMyDsl.g:5586:2: 'return'
            {
             before(grammarAccess.getFunctionReturnAccess().getReturnKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getFunctionReturnAccess().getReturnKeyword_0()); 

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
    // $ANTLR end "rule__FunctionReturn__Group__0__Impl"


    // $ANTLR start "rule__FunctionReturn__Group__1"
    // InternalMyDsl.g:5595:1: rule__FunctionReturn__Group__1 : rule__FunctionReturn__Group__1__Impl rule__FunctionReturn__Group__2 ;
    public final void rule__FunctionReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5599:1: ( rule__FunctionReturn__Group__1__Impl rule__FunctionReturn__Group__2 )
            // InternalMyDsl.g:5600:2: rule__FunctionReturn__Group__1__Impl rule__FunctionReturn__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__FunctionReturn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionReturn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionReturn__Group__1"


    // $ANTLR start "rule__FunctionReturn__Group__1__Impl"
    // InternalMyDsl.g:5607:1: rule__FunctionReturn__Group__1__Impl : ( ( rule__FunctionReturn__ExprAssignment_1 ) ) ;
    public final void rule__FunctionReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5611:1: ( ( ( rule__FunctionReturn__ExprAssignment_1 ) ) )
            // InternalMyDsl.g:5612:1: ( ( rule__FunctionReturn__ExprAssignment_1 ) )
            {
            // InternalMyDsl.g:5612:1: ( ( rule__FunctionReturn__ExprAssignment_1 ) )
            // InternalMyDsl.g:5613:2: ( rule__FunctionReturn__ExprAssignment_1 )
            {
             before(grammarAccess.getFunctionReturnAccess().getExprAssignment_1()); 
            // InternalMyDsl.g:5614:2: ( rule__FunctionReturn__ExprAssignment_1 )
            // InternalMyDsl.g:5614:3: rule__FunctionReturn__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReturn__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionReturnAccess().getExprAssignment_1()); 

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
    // $ANTLR end "rule__FunctionReturn__Group__1__Impl"


    // $ANTLR start "rule__FunctionReturn__Group__2"
    // InternalMyDsl.g:5622:1: rule__FunctionReturn__Group__2 : rule__FunctionReturn__Group__2__Impl ;
    public final void rule__FunctionReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5626:1: ( rule__FunctionReturn__Group__2__Impl )
            // InternalMyDsl.g:5627:2: rule__FunctionReturn__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionReturn__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionReturn__Group__2"


    // $ANTLR start "rule__FunctionReturn__Group__2__Impl"
    // InternalMyDsl.g:5633:1: rule__FunctionReturn__Group__2__Impl : ( ';' ) ;
    public final void rule__FunctionReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5637:1: ( ( ';' ) )
            // InternalMyDsl.g:5638:1: ( ';' )
            {
            // InternalMyDsl.g:5638:1: ( ';' )
            // InternalMyDsl.g:5639:2: ';'
            {
             before(grammarAccess.getFunctionReturnAccess().getSemicolonKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getFunctionReturnAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__FunctionReturn__Group__2__Impl"


    // $ANTLR start "rule__ConsoleLogStatement__Group__0"
    // InternalMyDsl.g:5649:1: rule__ConsoleLogStatement__Group__0 : rule__ConsoleLogStatement__Group__0__Impl rule__ConsoleLogStatement__Group__1 ;
    public final void rule__ConsoleLogStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5653:1: ( rule__ConsoleLogStatement__Group__0__Impl rule__ConsoleLogStatement__Group__1 )
            // InternalMyDsl.g:5654:2: rule__ConsoleLogStatement__Group__0__Impl rule__ConsoleLogStatement__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__ConsoleLogStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsoleLogStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleLogStatement__Group__0"


    // $ANTLR start "rule__ConsoleLogStatement__Group__0__Impl"
    // InternalMyDsl.g:5661:1: rule__ConsoleLogStatement__Group__0__Impl : ( () ) ;
    public final void rule__ConsoleLogStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5665:1: ( ( () ) )
            // InternalMyDsl.g:5666:1: ( () )
            {
            // InternalMyDsl.g:5666:1: ( () )
            // InternalMyDsl.g:5667:2: ()
            {
             before(grammarAccess.getConsoleLogStatementAccess().getConsoleLogStatementAction_0()); 
            // InternalMyDsl.g:5668:2: ()
            // InternalMyDsl.g:5668:3: 
            {
            }

             after(grammarAccess.getConsoleLogStatementAccess().getConsoleLogStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleLogStatement__Group__0__Impl"


    // $ANTLR start "rule__ConsoleLogStatement__Group__1"
    // InternalMyDsl.g:5676:1: rule__ConsoleLogStatement__Group__1 : rule__ConsoleLogStatement__Group__1__Impl rule__ConsoleLogStatement__Group__2 ;
    public final void rule__ConsoleLogStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5680:1: ( rule__ConsoleLogStatement__Group__1__Impl rule__ConsoleLogStatement__Group__2 )
            // InternalMyDsl.g:5681:2: rule__ConsoleLogStatement__Group__1__Impl rule__ConsoleLogStatement__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__ConsoleLogStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsoleLogStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleLogStatement__Group__1"


    // $ANTLR start "rule__ConsoleLogStatement__Group__1__Impl"
    // InternalMyDsl.g:5688:1: rule__ConsoleLogStatement__Group__1__Impl : ( 'console.log' ) ;
    public final void rule__ConsoleLogStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5692:1: ( ( 'console.log' ) )
            // InternalMyDsl.g:5693:1: ( 'console.log' )
            {
            // InternalMyDsl.g:5693:1: ( 'console.log' )
            // InternalMyDsl.g:5694:2: 'console.log'
            {
             before(grammarAccess.getConsoleLogStatementAccess().getConsoleLogKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getConsoleLogStatementAccess().getConsoleLogKeyword_1()); 

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
    // $ANTLR end "rule__ConsoleLogStatement__Group__1__Impl"


    // $ANTLR start "rule__ConsoleLogStatement__Group__2"
    // InternalMyDsl.g:5703:1: rule__ConsoleLogStatement__Group__2 : rule__ConsoleLogStatement__Group__2__Impl rule__ConsoleLogStatement__Group__3 ;
    public final void rule__ConsoleLogStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5707:1: ( rule__ConsoleLogStatement__Group__2__Impl rule__ConsoleLogStatement__Group__3 )
            // InternalMyDsl.g:5708:2: rule__ConsoleLogStatement__Group__2__Impl rule__ConsoleLogStatement__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__ConsoleLogStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsoleLogStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleLogStatement__Group__2"


    // $ANTLR start "rule__ConsoleLogStatement__Group__2__Impl"
    // InternalMyDsl.g:5715:1: rule__ConsoleLogStatement__Group__2__Impl : ( '(' ) ;
    public final void rule__ConsoleLogStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5719:1: ( ( '(' ) )
            // InternalMyDsl.g:5720:1: ( '(' )
            {
            // InternalMyDsl.g:5720:1: ( '(' )
            // InternalMyDsl.g:5721:2: '('
            {
             before(grammarAccess.getConsoleLogStatementAccess().getLeftParenthesisKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getConsoleLogStatementAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ConsoleLogStatement__Group__2__Impl"


    // $ANTLR start "rule__ConsoleLogStatement__Group__3"
    // InternalMyDsl.g:5730:1: rule__ConsoleLogStatement__Group__3 : rule__ConsoleLogStatement__Group__3__Impl rule__ConsoleLogStatement__Group__4 ;
    public final void rule__ConsoleLogStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5734:1: ( rule__ConsoleLogStatement__Group__3__Impl rule__ConsoleLogStatement__Group__4 )
            // InternalMyDsl.g:5735:2: rule__ConsoleLogStatement__Group__3__Impl rule__ConsoleLogStatement__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__ConsoleLogStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsoleLogStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleLogStatement__Group__3"


    // $ANTLR start "rule__ConsoleLogStatement__Group__3__Impl"
    // InternalMyDsl.g:5742:1: rule__ConsoleLogStatement__Group__3__Impl : ( ( rule__ConsoleLogStatement__Group_3__0 )? ) ;
    public final void rule__ConsoleLogStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5746:1: ( ( ( rule__ConsoleLogStatement__Group_3__0 )? ) )
            // InternalMyDsl.g:5747:1: ( ( rule__ConsoleLogStatement__Group_3__0 )? )
            {
            // InternalMyDsl.g:5747:1: ( ( rule__ConsoleLogStatement__Group_3__0 )? )
            // InternalMyDsl.g:5748:2: ( rule__ConsoleLogStatement__Group_3__0 )?
            {
             before(grammarAccess.getConsoleLogStatementAccess().getGroup_3()); 
            // InternalMyDsl.g:5749:2: ( rule__ConsoleLogStatement__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_CHAR)||(LA39_0>=15 && LA39_0<=19)||LA39_0==55||LA39_0==57) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:5749:3: rule__ConsoleLogStatement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConsoleLogStatement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConsoleLogStatementAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ConsoleLogStatement__Group__3__Impl"


    // $ANTLR start "rule__ConsoleLogStatement__Group__4"
    // InternalMyDsl.g:5757:1: rule__ConsoleLogStatement__Group__4 : rule__ConsoleLogStatement__Group__4__Impl rule__ConsoleLogStatement__Group__5 ;
    public final void rule__ConsoleLogStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5761:1: ( rule__ConsoleLogStatement__Group__4__Impl rule__ConsoleLogStatement__Group__5 )
            // InternalMyDsl.g:5762:2: rule__ConsoleLogStatement__Group__4__Impl rule__ConsoleLogStatement__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ConsoleLogStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsoleLogStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleLogStatement__Group__4"


    // $ANTLR start "rule__ConsoleLogStatement__Group__4__Impl"
    // InternalMyDsl.g:5769:1: rule__ConsoleLogStatement__Group__4__Impl : ( ')' ) ;
    public final void rule__ConsoleLogStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5773:1: ( ( ')' ) )
            // InternalMyDsl.g:5774:1: ( ')' )
            {
            // InternalMyDsl.g:5774:1: ( ')' )
            // InternalMyDsl.g:5775:2: ')'
            {
             before(grammarAccess.getConsoleLogStatementAccess().getRightParenthesisKeyword_4()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getConsoleLogStatementAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__ConsoleLogStatement__Group__4__Impl"


    // $ANTLR start "rule__ConsoleLogStatement__Group__5"
    // InternalMyDsl.g:5784:1: rule__ConsoleLogStatement__Group__5 : rule__ConsoleLogStatement__Group__5__Impl ;
    public final void rule__ConsoleLogStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5788:1: ( rule__ConsoleLogStatement__Group__5__Impl )
            // InternalMyDsl.g:5789:2: rule__ConsoleLogStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConsoleLogStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleLogStatement__Group__5"


    // $ANTLR start "rule__ConsoleLogStatement__Group__5__Impl"
    // InternalMyDsl.g:5795:1: rule__ConsoleLogStatement__Group__5__Impl : ( ';' ) ;
    public final void rule__ConsoleLogStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5799:1: ( ( ';' ) )
            // InternalMyDsl.g:5800:1: ( ';' )
            {
            // InternalMyDsl.g:5800:1: ( ';' )
            // InternalMyDsl.g:5801:2: ';'
            {
             before(grammarAccess.getConsoleLogStatementAccess().getSemicolonKeyword_5()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getConsoleLogStatementAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__ConsoleLogStatement__Group__5__Impl"


    // $ANTLR start "rule__ConsoleLogStatement__Group_3__0"
    // InternalMyDsl.g:5811:1: rule__ConsoleLogStatement__Group_3__0 : rule__ConsoleLogStatement__Group_3__0__Impl rule__ConsoleLogStatement__Group_3__1 ;
    public final void rule__ConsoleLogStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5815:1: ( rule__ConsoleLogStatement__Group_3__0__Impl rule__ConsoleLogStatement__Group_3__1 )
            // InternalMyDsl.g:5816:2: rule__ConsoleLogStatement__Group_3__0__Impl rule__ConsoleLogStatement__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__ConsoleLogStatement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsoleLogStatement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleLogStatement__Group_3__0"


    // $ANTLR start "rule__ConsoleLogStatement__Group_3__0__Impl"
    // InternalMyDsl.g:5823:1: rule__ConsoleLogStatement__Group_3__0__Impl : ( ( rule__ConsoleLogStatement__ArgumentsAssignment_3_0 ) ) ;
    public final void rule__ConsoleLogStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5827:1: ( ( ( rule__ConsoleLogStatement__ArgumentsAssignment_3_0 ) ) )
            // InternalMyDsl.g:5828:1: ( ( rule__ConsoleLogStatement__ArgumentsAssignment_3_0 ) )
            {
            // InternalMyDsl.g:5828:1: ( ( rule__ConsoleLogStatement__ArgumentsAssignment_3_0 ) )
            // InternalMyDsl.g:5829:2: ( rule__ConsoleLogStatement__ArgumentsAssignment_3_0 )
            {
             before(grammarAccess.getConsoleLogStatementAccess().getArgumentsAssignment_3_0()); 
            // InternalMyDsl.g:5830:2: ( rule__ConsoleLogStatement__ArgumentsAssignment_3_0 )
            // InternalMyDsl.g:5830:3: rule__ConsoleLogStatement__ArgumentsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ConsoleLogStatement__ArgumentsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getConsoleLogStatementAccess().getArgumentsAssignment_3_0()); 

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
    // $ANTLR end "rule__ConsoleLogStatement__Group_3__0__Impl"


    // $ANTLR start "rule__ConsoleLogStatement__Group_3__1"
    // InternalMyDsl.g:5838:1: rule__ConsoleLogStatement__Group_3__1 : rule__ConsoleLogStatement__Group_3__1__Impl ;
    public final void rule__ConsoleLogStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5842:1: ( rule__ConsoleLogStatement__Group_3__1__Impl )
            // InternalMyDsl.g:5843:2: rule__ConsoleLogStatement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConsoleLogStatement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleLogStatement__Group_3__1"


    // $ANTLR start "rule__ConsoleLogStatement__Group_3__1__Impl"
    // InternalMyDsl.g:5849:1: rule__ConsoleLogStatement__Group_3__1__Impl : ( ( rule__ConsoleLogStatement__Group_3_1__0 )* ) ;
    public final void rule__ConsoleLogStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5853:1: ( ( ( rule__ConsoleLogStatement__Group_3_1__0 )* ) )
            // InternalMyDsl.g:5854:1: ( ( rule__ConsoleLogStatement__Group_3_1__0 )* )
            {
            // InternalMyDsl.g:5854:1: ( ( rule__ConsoleLogStatement__Group_3_1__0 )* )
            // InternalMyDsl.g:5855:2: ( rule__ConsoleLogStatement__Group_3_1__0 )*
            {
             before(grammarAccess.getConsoleLogStatementAccess().getGroup_3_1()); 
            // InternalMyDsl.g:5856:2: ( rule__ConsoleLogStatement__Group_3_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==50) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:5856:3: rule__ConsoleLogStatement__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ConsoleLogStatement__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getConsoleLogStatementAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__ConsoleLogStatement__Group_3__1__Impl"


    // $ANTLR start "rule__ConsoleLogStatement__Group_3_1__0"
    // InternalMyDsl.g:5865:1: rule__ConsoleLogStatement__Group_3_1__0 : rule__ConsoleLogStatement__Group_3_1__0__Impl rule__ConsoleLogStatement__Group_3_1__1 ;
    public final void rule__ConsoleLogStatement__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5869:1: ( rule__ConsoleLogStatement__Group_3_1__0__Impl rule__ConsoleLogStatement__Group_3_1__1 )
            // InternalMyDsl.g:5870:2: rule__ConsoleLogStatement__Group_3_1__0__Impl rule__ConsoleLogStatement__Group_3_1__1
            {
            pushFollow(FOLLOW_15);
            rule__ConsoleLogStatement__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsoleLogStatement__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleLogStatement__Group_3_1__0"


    // $ANTLR start "rule__ConsoleLogStatement__Group_3_1__0__Impl"
    // InternalMyDsl.g:5877:1: rule__ConsoleLogStatement__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ConsoleLogStatement__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5881:1: ( ( ',' ) )
            // InternalMyDsl.g:5882:1: ( ',' )
            {
            // InternalMyDsl.g:5882:1: ( ',' )
            // InternalMyDsl.g:5883:2: ','
            {
             before(grammarAccess.getConsoleLogStatementAccess().getCommaKeyword_3_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getConsoleLogStatementAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__ConsoleLogStatement__Group_3_1__0__Impl"


    // $ANTLR start "rule__ConsoleLogStatement__Group_3_1__1"
    // InternalMyDsl.g:5892:1: rule__ConsoleLogStatement__Group_3_1__1 : rule__ConsoleLogStatement__Group_3_1__1__Impl ;
    public final void rule__ConsoleLogStatement__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5896:1: ( rule__ConsoleLogStatement__Group_3_1__1__Impl )
            // InternalMyDsl.g:5897:2: rule__ConsoleLogStatement__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConsoleLogStatement__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleLogStatement__Group_3_1__1"


    // $ANTLR start "rule__ConsoleLogStatement__Group_3_1__1__Impl"
    // InternalMyDsl.g:5903:1: rule__ConsoleLogStatement__Group_3_1__1__Impl : ( ( rule__ConsoleLogStatement__ArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__ConsoleLogStatement__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5907:1: ( ( ( rule__ConsoleLogStatement__ArgumentsAssignment_3_1_1 ) ) )
            // InternalMyDsl.g:5908:1: ( ( rule__ConsoleLogStatement__ArgumentsAssignment_3_1_1 ) )
            {
            // InternalMyDsl.g:5908:1: ( ( rule__ConsoleLogStatement__ArgumentsAssignment_3_1_1 ) )
            // InternalMyDsl.g:5909:2: ( rule__ConsoleLogStatement__ArgumentsAssignment_3_1_1 )
            {
             before(grammarAccess.getConsoleLogStatementAccess().getArgumentsAssignment_3_1_1()); 
            // InternalMyDsl.g:5910:2: ( rule__ConsoleLogStatement__ArgumentsAssignment_3_1_1 )
            // InternalMyDsl.g:5910:3: rule__ConsoleLogStatement__ArgumentsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConsoleLogStatement__ArgumentsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConsoleLogStatementAccess().getArgumentsAssignment_3_1_1()); 

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
    // $ANTLR end "rule__ConsoleLogStatement__Group_3_1__1__Impl"


    // $ANTLR start "rule__TryCatchStatement__Group__0"
    // InternalMyDsl.g:5919:1: rule__TryCatchStatement__Group__0 : rule__TryCatchStatement__Group__0__Impl rule__TryCatchStatement__Group__1 ;
    public final void rule__TryCatchStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5923:1: ( rule__TryCatchStatement__Group__0__Impl rule__TryCatchStatement__Group__1 )
            // InternalMyDsl.g:5924:2: rule__TryCatchStatement__Group__0__Impl rule__TryCatchStatement__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__TryCatchStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TryCatchStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TryCatchStatement__Group__0"


    // $ANTLR start "rule__TryCatchStatement__Group__0__Impl"
    // InternalMyDsl.g:5931:1: rule__TryCatchStatement__Group__0__Impl : ( 'try' ) ;
    public final void rule__TryCatchStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5935:1: ( ( 'try' ) )
            // InternalMyDsl.g:5936:1: ( 'try' )
            {
            // InternalMyDsl.g:5936:1: ( 'try' )
            // InternalMyDsl.g:5937:2: 'try'
            {
             before(grammarAccess.getTryCatchStatementAccess().getTryKeyword_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getTryCatchStatementAccess().getTryKeyword_0()); 

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
    // $ANTLR end "rule__TryCatchStatement__Group__0__Impl"


    // $ANTLR start "rule__TryCatchStatement__Group__1"
    // InternalMyDsl.g:5946:1: rule__TryCatchStatement__Group__1 : rule__TryCatchStatement__Group__1__Impl rule__TryCatchStatement__Group__2 ;
    public final void rule__TryCatchStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5950:1: ( rule__TryCatchStatement__Group__1__Impl rule__TryCatchStatement__Group__2 )
            // InternalMyDsl.g:5951:2: rule__TryCatchStatement__Group__1__Impl rule__TryCatchStatement__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__TryCatchStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TryCatchStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TryCatchStatement__Group__1"


    // $ANTLR start "rule__TryCatchStatement__Group__1__Impl"
    // InternalMyDsl.g:5958:1: rule__TryCatchStatement__Group__1__Impl : ( ( rule__TryCatchStatement__TryBlockAssignment_1 ) ) ;
    public final void rule__TryCatchStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5962:1: ( ( ( rule__TryCatchStatement__TryBlockAssignment_1 ) ) )
            // InternalMyDsl.g:5963:1: ( ( rule__TryCatchStatement__TryBlockAssignment_1 ) )
            {
            // InternalMyDsl.g:5963:1: ( ( rule__TryCatchStatement__TryBlockAssignment_1 ) )
            // InternalMyDsl.g:5964:2: ( rule__TryCatchStatement__TryBlockAssignment_1 )
            {
             before(grammarAccess.getTryCatchStatementAccess().getTryBlockAssignment_1()); 
            // InternalMyDsl.g:5965:2: ( rule__TryCatchStatement__TryBlockAssignment_1 )
            // InternalMyDsl.g:5965:3: rule__TryCatchStatement__TryBlockAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TryCatchStatement__TryBlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTryCatchStatementAccess().getTryBlockAssignment_1()); 

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
    // $ANTLR end "rule__TryCatchStatement__Group__1__Impl"


    // $ANTLR start "rule__TryCatchStatement__Group__2"
    // InternalMyDsl.g:5973:1: rule__TryCatchStatement__Group__2 : rule__TryCatchStatement__Group__2__Impl rule__TryCatchStatement__Group__3 ;
    public final void rule__TryCatchStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5977:1: ( rule__TryCatchStatement__Group__2__Impl rule__TryCatchStatement__Group__3 )
            // InternalMyDsl.g:5978:2: rule__TryCatchStatement__Group__2__Impl rule__TryCatchStatement__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__TryCatchStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TryCatchStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TryCatchStatement__Group__2"


    // $ANTLR start "rule__TryCatchStatement__Group__2__Impl"
    // InternalMyDsl.g:5985:1: rule__TryCatchStatement__Group__2__Impl : ( 'catch' ) ;
    public final void rule__TryCatchStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5989:1: ( ( 'catch' ) )
            // InternalMyDsl.g:5990:1: ( 'catch' )
            {
            // InternalMyDsl.g:5990:1: ( 'catch' )
            // InternalMyDsl.g:5991:2: 'catch'
            {
             before(grammarAccess.getTryCatchStatementAccess().getCatchKeyword_2()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getTryCatchStatementAccess().getCatchKeyword_2()); 

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
    // $ANTLR end "rule__TryCatchStatement__Group__2__Impl"


    // $ANTLR start "rule__TryCatchStatement__Group__3"
    // InternalMyDsl.g:6000:1: rule__TryCatchStatement__Group__3 : rule__TryCatchStatement__Group__3__Impl rule__TryCatchStatement__Group__4 ;
    public final void rule__TryCatchStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6004:1: ( rule__TryCatchStatement__Group__3__Impl rule__TryCatchStatement__Group__4 )
            // InternalMyDsl.g:6005:2: rule__TryCatchStatement__Group__3__Impl rule__TryCatchStatement__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__TryCatchStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TryCatchStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TryCatchStatement__Group__3"


    // $ANTLR start "rule__TryCatchStatement__Group__3__Impl"
    // InternalMyDsl.g:6012:1: rule__TryCatchStatement__Group__3__Impl : ( '(' ) ;
    public final void rule__TryCatchStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6016:1: ( ( '(' ) )
            // InternalMyDsl.g:6017:1: ( '(' )
            {
            // InternalMyDsl.g:6017:1: ( '(' )
            // InternalMyDsl.g:6018:2: '('
            {
             before(grammarAccess.getTryCatchStatementAccess().getLeftParenthesisKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTryCatchStatementAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__TryCatchStatement__Group__3__Impl"


    // $ANTLR start "rule__TryCatchStatement__Group__4"
    // InternalMyDsl.g:6027:1: rule__TryCatchStatement__Group__4 : rule__TryCatchStatement__Group__4__Impl rule__TryCatchStatement__Group__5 ;
    public final void rule__TryCatchStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6031:1: ( rule__TryCatchStatement__Group__4__Impl rule__TryCatchStatement__Group__5 )
            // InternalMyDsl.g:6032:2: rule__TryCatchStatement__Group__4__Impl rule__TryCatchStatement__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__TryCatchStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TryCatchStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TryCatchStatement__Group__4"


    // $ANTLR start "rule__TryCatchStatement__Group__4__Impl"
    // InternalMyDsl.g:6039:1: rule__TryCatchStatement__Group__4__Impl : ( ( rule__TryCatchStatement__ExceptionAssignment_4 ) ) ;
    public final void rule__TryCatchStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6043:1: ( ( ( rule__TryCatchStatement__ExceptionAssignment_4 ) ) )
            // InternalMyDsl.g:6044:1: ( ( rule__TryCatchStatement__ExceptionAssignment_4 ) )
            {
            // InternalMyDsl.g:6044:1: ( ( rule__TryCatchStatement__ExceptionAssignment_4 ) )
            // InternalMyDsl.g:6045:2: ( rule__TryCatchStatement__ExceptionAssignment_4 )
            {
             before(grammarAccess.getTryCatchStatementAccess().getExceptionAssignment_4()); 
            // InternalMyDsl.g:6046:2: ( rule__TryCatchStatement__ExceptionAssignment_4 )
            // InternalMyDsl.g:6046:3: rule__TryCatchStatement__ExceptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TryCatchStatement__ExceptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTryCatchStatementAccess().getExceptionAssignment_4()); 

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
    // $ANTLR end "rule__TryCatchStatement__Group__4__Impl"


    // $ANTLR start "rule__TryCatchStatement__Group__5"
    // InternalMyDsl.g:6054:1: rule__TryCatchStatement__Group__5 : rule__TryCatchStatement__Group__5__Impl rule__TryCatchStatement__Group__6 ;
    public final void rule__TryCatchStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6058:1: ( rule__TryCatchStatement__Group__5__Impl rule__TryCatchStatement__Group__6 )
            // InternalMyDsl.g:6059:2: rule__TryCatchStatement__Group__5__Impl rule__TryCatchStatement__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__TryCatchStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TryCatchStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TryCatchStatement__Group__5"


    // $ANTLR start "rule__TryCatchStatement__Group__5__Impl"
    // InternalMyDsl.g:6066:1: rule__TryCatchStatement__Group__5__Impl : ( ')' ) ;
    public final void rule__TryCatchStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6070:1: ( ( ')' ) )
            // InternalMyDsl.g:6071:1: ( ')' )
            {
            // InternalMyDsl.g:6071:1: ( ')' )
            // InternalMyDsl.g:6072:2: ')'
            {
             before(grammarAccess.getTryCatchStatementAccess().getRightParenthesisKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTryCatchStatementAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__TryCatchStatement__Group__5__Impl"


    // $ANTLR start "rule__TryCatchStatement__Group__6"
    // InternalMyDsl.g:6081:1: rule__TryCatchStatement__Group__6 : rule__TryCatchStatement__Group__6__Impl ;
    public final void rule__TryCatchStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6085:1: ( rule__TryCatchStatement__Group__6__Impl )
            // InternalMyDsl.g:6086:2: rule__TryCatchStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TryCatchStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TryCatchStatement__Group__6"


    // $ANTLR start "rule__TryCatchStatement__Group__6__Impl"
    // InternalMyDsl.g:6092:1: rule__TryCatchStatement__Group__6__Impl : ( ( rule__TryCatchStatement__CatchBlockAssignment_6 ) ) ;
    public final void rule__TryCatchStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6096:1: ( ( ( rule__TryCatchStatement__CatchBlockAssignment_6 ) ) )
            // InternalMyDsl.g:6097:1: ( ( rule__TryCatchStatement__CatchBlockAssignment_6 ) )
            {
            // InternalMyDsl.g:6097:1: ( ( rule__TryCatchStatement__CatchBlockAssignment_6 ) )
            // InternalMyDsl.g:6098:2: ( rule__TryCatchStatement__CatchBlockAssignment_6 )
            {
             before(grammarAccess.getTryCatchStatementAccess().getCatchBlockAssignment_6()); 
            // InternalMyDsl.g:6099:2: ( rule__TryCatchStatement__CatchBlockAssignment_6 )
            // InternalMyDsl.g:6099:3: rule__TryCatchStatement__CatchBlockAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TryCatchStatement__CatchBlockAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTryCatchStatementAccess().getCatchBlockAssignment_6()); 

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
    // $ANTLR end "rule__TryCatchStatement__Group__6__Impl"


    // $ANTLR start "rule__SwitchStatement__Group__0"
    // InternalMyDsl.g:6108:1: rule__SwitchStatement__Group__0 : rule__SwitchStatement__Group__0__Impl rule__SwitchStatement__Group__1 ;
    public final void rule__SwitchStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6112:1: ( rule__SwitchStatement__Group__0__Impl rule__SwitchStatement__Group__1 )
            // InternalMyDsl.g:6113:2: rule__SwitchStatement__Group__0__Impl rule__SwitchStatement__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__SwitchStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchStatement__Group__0"


    // $ANTLR start "rule__SwitchStatement__Group__0__Impl"
    // InternalMyDsl.g:6120:1: rule__SwitchStatement__Group__0__Impl : ( 'switch' ) ;
    public final void rule__SwitchStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6124:1: ( ( 'switch' ) )
            // InternalMyDsl.g:6125:1: ( 'switch' )
            {
            // InternalMyDsl.g:6125:1: ( 'switch' )
            // InternalMyDsl.g:6126:2: 'switch'
            {
             before(grammarAccess.getSwitchStatementAccess().getSwitchKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getSwitchStatementAccess().getSwitchKeyword_0()); 

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
    // $ANTLR end "rule__SwitchStatement__Group__0__Impl"


    // $ANTLR start "rule__SwitchStatement__Group__1"
    // InternalMyDsl.g:6135:1: rule__SwitchStatement__Group__1 : rule__SwitchStatement__Group__1__Impl rule__SwitchStatement__Group__2 ;
    public final void rule__SwitchStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6139:1: ( rule__SwitchStatement__Group__1__Impl rule__SwitchStatement__Group__2 )
            // InternalMyDsl.g:6140:2: rule__SwitchStatement__Group__1__Impl rule__SwitchStatement__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__SwitchStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchStatement__Group__1"


    // $ANTLR start "rule__SwitchStatement__Group__1__Impl"
    // InternalMyDsl.g:6147:1: rule__SwitchStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__SwitchStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6151:1: ( ( '(' ) )
            // InternalMyDsl.g:6152:1: ( '(' )
            {
            // InternalMyDsl.g:6152:1: ( '(' )
            // InternalMyDsl.g:6153:2: '('
            {
             before(grammarAccess.getSwitchStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSwitchStatementAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__SwitchStatement__Group__1__Impl"


    // $ANTLR start "rule__SwitchStatement__Group__2"
    // InternalMyDsl.g:6162:1: rule__SwitchStatement__Group__2 : rule__SwitchStatement__Group__2__Impl rule__SwitchStatement__Group__3 ;
    public final void rule__SwitchStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6166:1: ( rule__SwitchStatement__Group__2__Impl rule__SwitchStatement__Group__3 )
            // InternalMyDsl.g:6167:2: rule__SwitchStatement__Group__2__Impl rule__SwitchStatement__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__SwitchStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchStatement__Group__2"


    // $ANTLR start "rule__SwitchStatement__Group__2__Impl"
    // InternalMyDsl.g:6174:1: rule__SwitchStatement__Group__2__Impl : ( ( rule__SwitchStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__SwitchStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6178:1: ( ( ( rule__SwitchStatement__ExpressionAssignment_2 ) ) )
            // InternalMyDsl.g:6179:1: ( ( rule__SwitchStatement__ExpressionAssignment_2 ) )
            {
            // InternalMyDsl.g:6179:1: ( ( rule__SwitchStatement__ExpressionAssignment_2 ) )
            // InternalMyDsl.g:6180:2: ( rule__SwitchStatement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getSwitchStatementAccess().getExpressionAssignment_2()); 
            // InternalMyDsl.g:6181:2: ( rule__SwitchStatement__ExpressionAssignment_2 )
            // InternalMyDsl.g:6181:3: rule__SwitchStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SwitchStatement__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSwitchStatementAccess().getExpressionAssignment_2()); 

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
    // $ANTLR end "rule__SwitchStatement__Group__2__Impl"


    // $ANTLR start "rule__SwitchStatement__Group__3"
    // InternalMyDsl.g:6189:1: rule__SwitchStatement__Group__3 : rule__SwitchStatement__Group__3__Impl rule__SwitchStatement__Group__4 ;
    public final void rule__SwitchStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6193:1: ( rule__SwitchStatement__Group__3__Impl rule__SwitchStatement__Group__4 )
            // InternalMyDsl.g:6194:2: rule__SwitchStatement__Group__3__Impl rule__SwitchStatement__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__SwitchStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchStatement__Group__3"


    // $ANTLR start "rule__SwitchStatement__Group__3__Impl"
    // InternalMyDsl.g:6201:1: rule__SwitchStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__SwitchStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6205:1: ( ( ')' ) )
            // InternalMyDsl.g:6206:1: ( ')' )
            {
            // InternalMyDsl.g:6206:1: ( ')' )
            // InternalMyDsl.g:6207:2: ')'
            {
             before(grammarAccess.getSwitchStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getSwitchStatementAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__SwitchStatement__Group__3__Impl"


    // $ANTLR start "rule__SwitchStatement__Group__4"
    // InternalMyDsl.g:6216:1: rule__SwitchStatement__Group__4 : rule__SwitchStatement__Group__4__Impl rule__SwitchStatement__Group__5 ;
    public final void rule__SwitchStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6220:1: ( rule__SwitchStatement__Group__4__Impl rule__SwitchStatement__Group__5 )
            // InternalMyDsl.g:6221:2: rule__SwitchStatement__Group__4__Impl rule__SwitchStatement__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__SwitchStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchStatement__Group__4"


    // $ANTLR start "rule__SwitchStatement__Group__4__Impl"
    // InternalMyDsl.g:6228:1: rule__SwitchStatement__Group__4__Impl : ( '{' ) ;
    public final void rule__SwitchStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6232:1: ( ( '{' ) )
            // InternalMyDsl.g:6233:1: ( '{' )
            {
            // InternalMyDsl.g:6233:1: ( '{' )
            // InternalMyDsl.g:6234:2: '{'
            {
             before(grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__SwitchStatement__Group__4__Impl"


    // $ANTLR start "rule__SwitchStatement__Group__5"
    // InternalMyDsl.g:6243:1: rule__SwitchStatement__Group__5 : rule__SwitchStatement__Group__5__Impl rule__SwitchStatement__Group__6 ;
    public final void rule__SwitchStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6247:1: ( rule__SwitchStatement__Group__5__Impl rule__SwitchStatement__Group__6 )
            // InternalMyDsl.g:6248:2: rule__SwitchStatement__Group__5__Impl rule__SwitchStatement__Group__6
            {
            pushFollow(FOLLOW_43);
            rule__SwitchStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchStatement__Group__5"


    // $ANTLR start "rule__SwitchStatement__Group__5__Impl"
    // InternalMyDsl.g:6255:1: rule__SwitchStatement__Group__5__Impl : ( ( rule__SwitchStatement__CasesAssignment_5 )* ) ;
    public final void rule__SwitchStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6259:1: ( ( ( rule__SwitchStatement__CasesAssignment_5 )* ) )
            // InternalMyDsl.g:6260:1: ( ( rule__SwitchStatement__CasesAssignment_5 )* )
            {
            // InternalMyDsl.g:6260:1: ( ( rule__SwitchStatement__CasesAssignment_5 )* )
            // InternalMyDsl.g:6261:2: ( rule__SwitchStatement__CasesAssignment_5 )*
            {
             before(grammarAccess.getSwitchStatementAccess().getCasesAssignment_5()); 
            // InternalMyDsl.g:6262:2: ( rule__SwitchStatement__CasesAssignment_5 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==71) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMyDsl.g:6262:3: rule__SwitchStatement__CasesAssignment_5
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__SwitchStatement__CasesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getSwitchStatementAccess().getCasesAssignment_5()); 

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
    // $ANTLR end "rule__SwitchStatement__Group__5__Impl"


    // $ANTLR start "rule__SwitchStatement__Group__6"
    // InternalMyDsl.g:6270:1: rule__SwitchStatement__Group__6 : rule__SwitchStatement__Group__6__Impl rule__SwitchStatement__Group__7 ;
    public final void rule__SwitchStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6274:1: ( rule__SwitchStatement__Group__6__Impl rule__SwitchStatement__Group__7 )
            // InternalMyDsl.g:6275:2: rule__SwitchStatement__Group__6__Impl rule__SwitchStatement__Group__7
            {
            pushFollow(FOLLOW_43);
            rule__SwitchStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchStatement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchStatement__Group__6"


    // $ANTLR start "rule__SwitchStatement__Group__6__Impl"
    // InternalMyDsl.g:6282:1: rule__SwitchStatement__Group__6__Impl : ( ( rule__SwitchStatement__DefaultCaseAssignment_6 )? ) ;
    public final void rule__SwitchStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6286:1: ( ( ( rule__SwitchStatement__DefaultCaseAssignment_6 )? ) )
            // InternalMyDsl.g:6287:1: ( ( rule__SwitchStatement__DefaultCaseAssignment_6 )? )
            {
            // InternalMyDsl.g:6287:1: ( ( rule__SwitchStatement__DefaultCaseAssignment_6 )? )
            // InternalMyDsl.g:6288:2: ( rule__SwitchStatement__DefaultCaseAssignment_6 )?
            {
             before(grammarAccess.getSwitchStatementAccess().getDefaultCaseAssignment_6()); 
            // InternalMyDsl.g:6289:2: ( rule__SwitchStatement__DefaultCaseAssignment_6 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==73) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:6289:3: rule__SwitchStatement__DefaultCaseAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__SwitchStatement__DefaultCaseAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSwitchStatementAccess().getDefaultCaseAssignment_6()); 

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
    // $ANTLR end "rule__SwitchStatement__Group__6__Impl"


    // $ANTLR start "rule__SwitchStatement__Group__7"
    // InternalMyDsl.g:6297:1: rule__SwitchStatement__Group__7 : rule__SwitchStatement__Group__7__Impl ;
    public final void rule__SwitchStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6301:1: ( rule__SwitchStatement__Group__7__Impl )
            // InternalMyDsl.g:6302:2: rule__SwitchStatement__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchStatement__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchStatement__Group__7"


    // $ANTLR start "rule__SwitchStatement__Group__7__Impl"
    // InternalMyDsl.g:6308:1: rule__SwitchStatement__Group__7__Impl : ( '}' ) ;
    public final void rule__SwitchStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6312:1: ( ( '}' ) )
            // InternalMyDsl.g:6313:1: ( '}' )
            {
            // InternalMyDsl.g:6313:1: ( '}' )
            // InternalMyDsl.g:6314:2: '}'
            {
             before(grammarAccess.getSwitchStatementAccess().getRightCurlyBracketKeyword_7()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getSwitchStatementAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__SwitchStatement__Group__7__Impl"


    // $ANTLR start "rule__Case__Group__0"
    // InternalMyDsl.g:6324:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6328:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalMyDsl.g:6329:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Case__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0"


    // $ANTLR start "rule__Case__Group__0__Impl"
    // InternalMyDsl.g:6336:1: rule__Case__Group__0__Impl : ( 'case' ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6340:1: ( ( 'case' ) )
            // InternalMyDsl.g:6341:1: ( 'case' )
            {
            // InternalMyDsl.g:6341:1: ( 'case' )
            // InternalMyDsl.g:6342:2: 'case'
            {
             before(grammarAccess.getCaseAccess().getCaseKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getCaseKeyword_0()); 

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
    // $ANTLR end "rule__Case__Group__0__Impl"


    // $ANTLR start "rule__Case__Group__1"
    // InternalMyDsl.g:6351:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6355:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalMyDsl.g:6356:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Case__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1"


    // $ANTLR start "rule__Case__Group__1__Impl"
    // InternalMyDsl.g:6363:1: rule__Case__Group__1__Impl : ( ( rule__Case__ValueAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6367:1: ( ( ( rule__Case__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:6368:1: ( ( rule__Case__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:6368:1: ( ( rule__Case__ValueAssignment_1 ) )
            // InternalMyDsl.g:6369:2: ( rule__Case__ValueAssignment_1 )
            {
             before(grammarAccess.getCaseAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:6370:2: ( rule__Case__ValueAssignment_1 )
            // InternalMyDsl.g:6370:3: rule__Case__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Case__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Case__Group__1__Impl"


    // $ANTLR start "rule__Case__Group__2"
    // InternalMyDsl.g:6378:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6382:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // InternalMyDsl.g:6383:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Case__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__2"


    // $ANTLR start "rule__Case__Group__2__Impl"
    // InternalMyDsl.g:6390:1: rule__Case__Group__2__Impl : ( ':' ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6394:1: ( ( ':' ) )
            // InternalMyDsl.g:6395:1: ( ':' )
            {
            // InternalMyDsl.g:6395:1: ( ':' )
            // InternalMyDsl.g:6396:2: ':'
            {
             before(grammarAccess.getCaseAccess().getColonKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Case__Group__2__Impl"


    // $ANTLR start "rule__Case__Group__3"
    // InternalMyDsl.g:6405:1: rule__Case__Group__3 : rule__Case__Group__3__Impl ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6409:1: ( rule__Case__Group__3__Impl )
            // InternalMyDsl.g:6410:2: rule__Case__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__3"


    // $ANTLR start "rule__Case__Group__3__Impl"
    // InternalMyDsl.g:6416:1: rule__Case__Group__3__Impl : ( ( rule__Case__StatementsAssignment_3 )* ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6420:1: ( ( ( rule__Case__StatementsAssignment_3 )* ) )
            // InternalMyDsl.g:6421:1: ( ( rule__Case__StatementsAssignment_3 )* )
            {
            // InternalMyDsl.g:6421:1: ( ( rule__Case__StatementsAssignment_3 )* )
            // InternalMyDsl.g:6422:2: ( rule__Case__StatementsAssignment_3 )*
            {
             before(grammarAccess.getCaseAccess().getStatementsAssignment_3()); 
            // InternalMyDsl.g:6423:2: ( rule__Case__StatementsAssignment_3 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_CHAR)||(LA43_0>=15 && LA43_0<=19)||(LA43_0>=39 && LA43_0<=48)||LA43_0==55||LA43_0==57||LA43_0==59||(LA43_0>=61 && LA43_0<=68)||LA43_0==70||(LA43_0>=74 && LA43_0<=77)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:6423:3: rule__Case__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Case__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getCaseAccess().getStatementsAssignment_3()); 

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
    // $ANTLR end "rule__Case__Group__3__Impl"


    // $ANTLR start "rule__Default__Group__0"
    // InternalMyDsl.g:6432:1: rule__Default__Group__0 : rule__Default__Group__0__Impl rule__Default__Group__1 ;
    public final void rule__Default__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6436:1: ( rule__Default__Group__0__Impl rule__Default__Group__1 )
            // InternalMyDsl.g:6437:2: rule__Default__Group__0__Impl rule__Default__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Default__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__0"


    // $ANTLR start "rule__Default__Group__0__Impl"
    // InternalMyDsl.g:6444:1: rule__Default__Group__0__Impl : ( () ) ;
    public final void rule__Default__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6448:1: ( ( () ) )
            // InternalMyDsl.g:6449:1: ( () )
            {
            // InternalMyDsl.g:6449:1: ( () )
            // InternalMyDsl.g:6450:2: ()
            {
             before(grammarAccess.getDefaultAccess().getDefaultAction_0()); 
            // InternalMyDsl.g:6451:2: ()
            // InternalMyDsl.g:6451:3: 
            {
            }

             after(grammarAccess.getDefaultAccess().getDefaultAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__0__Impl"


    // $ANTLR start "rule__Default__Group__1"
    // InternalMyDsl.g:6459:1: rule__Default__Group__1 : rule__Default__Group__1__Impl rule__Default__Group__2 ;
    public final void rule__Default__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6463:1: ( rule__Default__Group__1__Impl rule__Default__Group__2 )
            // InternalMyDsl.g:6464:2: rule__Default__Group__1__Impl rule__Default__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Default__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__1"


    // $ANTLR start "rule__Default__Group__1__Impl"
    // InternalMyDsl.g:6471:1: rule__Default__Group__1__Impl : ( 'default' ) ;
    public final void rule__Default__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6475:1: ( ( 'default' ) )
            // InternalMyDsl.g:6476:1: ( 'default' )
            {
            // InternalMyDsl.g:6476:1: ( 'default' )
            // InternalMyDsl.g:6477:2: 'default'
            {
             before(grammarAccess.getDefaultAccess().getDefaultKeyword_1()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getDefaultKeyword_1()); 

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
    // $ANTLR end "rule__Default__Group__1__Impl"


    // $ANTLR start "rule__Default__Group__2"
    // InternalMyDsl.g:6486:1: rule__Default__Group__2 : rule__Default__Group__2__Impl rule__Default__Group__3 ;
    public final void rule__Default__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6490:1: ( rule__Default__Group__2__Impl rule__Default__Group__3 )
            // InternalMyDsl.g:6491:2: rule__Default__Group__2__Impl rule__Default__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Default__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__2"


    // $ANTLR start "rule__Default__Group__2__Impl"
    // InternalMyDsl.g:6498:1: rule__Default__Group__2__Impl : ( ':' ) ;
    public final void rule__Default__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6502:1: ( ( ':' ) )
            // InternalMyDsl.g:6503:1: ( ':' )
            {
            // InternalMyDsl.g:6503:1: ( ':' )
            // InternalMyDsl.g:6504:2: ':'
            {
             before(grammarAccess.getDefaultAccess().getColonKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Default__Group__2__Impl"


    // $ANTLR start "rule__Default__Group__3"
    // InternalMyDsl.g:6513:1: rule__Default__Group__3 : rule__Default__Group__3__Impl ;
    public final void rule__Default__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6517:1: ( rule__Default__Group__3__Impl )
            // InternalMyDsl.g:6518:2: rule__Default__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Default__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__3"


    // $ANTLR start "rule__Default__Group__3__Impl"
    // InternalMyDsl.g:6524:1: rule__Default__Group__3__Impl : ( ( rule__Default__StatementsAssignment_3 )* ) ;
    public final void rule__Default__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6528:1: ( ( ( rule__Default__StatementsAssignment_3 )* ) )
            // InternalMyDsl.g:6529:1: ( ( rule__Default__StatementsAssignment_3 )* )
            {
            // InternalMyDsl.g:6529:1: ( ( rule__Default__StatementsAssignment_3 )* )
            // InternalMyDsl.g:6530:2: ( rule__Default__StatementsAssignment_3 )*
            {
             before(grammarAccess.getDefaultAccess().getStatementsAssignment_3()); 
            // InternalMyDsl.g:6531:2: ( rule__Default__StatementsAssignment_3 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_CHAR)||(LA44_0>=15 && LA44_0<=19)||(LA44_0>=39 && LA44_0<=48)||LA44_0==55||LA44_0==57||LA44_0==59||(LA44_0>=61 && LA44_0<=68)||LA44_0==70||(LA44_0>=74 && LA44_0<=77)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMyDsl.g:6531:3: rule__Default__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Default__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getDefaultAccess().getStatementsAssignment_3()); 

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
    // $ANTLR end "rule__Default__Group__3__Impl"


    // $ANTLR start "rule__StringManipulationStatement__Group__0"
    // InternalMyDsl.g:6540:1: rule__StringManipulationStatement__Group__0 : rule__StringManipulationStatement__Group__0__Impl rule__StringManipulationStatement__Group__1 ;
    public final void rule__StringManipulationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6544:1: ( rule__StringManipulationStatement__Group__0__Impl rule__StringManipulationStatement__Group__1 )
            // InternalMyDsl.g:6545:2: rule__StringManipulationStatement__Group__0__Impl rule__StringManipulationStatement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__StringManipulationStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringManipulationStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringManipulationStatement__Group__0"


    // $ANTLR start "rule__StringManipulationStatement__Group__0__Impl"
    // InternalMyDsl.g:6552:1: rule__StringManipulationStatement__Group__0__Impl : ( ruleStringManipulationFunctionCall ) ;
    public final void rule__StringManipulationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6556:1: ( ( ruleStringManipulationFunctionCall ) )
            // InternalMyDsl.g:6557:1: ( ruleStringManipulationFunctionCall )
            {
            // InternalMyDsl.g:6557:1: ( ruleStringManipulationFunctionCall )
            // InternalMyDsl.g:6558:2: ruleStringManipulationFunctionCall
            {
             before(grammarAccess.getStringManipulationStatementAccess().getStringManipulationFunctionCallParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStringManipulationFunctionCall();

            state._fsp--;

             after(grammarAccess.getStringManipulationStatementAccess().getStringManipulationFunctionCallParserRuleCall_0()); 

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
    // $ANTLR end "rule__StringManipulationStatement__Group__0__Impl"


    // $ANTLR start "rule__StringManipulationStatement__Group__1"
    // InternalMyDsl.g:6567:1: rule__StringManipulationStatement__Group__1 : rule__StringManipulationStatement__Group__1__Impl ;
    public final void rule__StringManipulationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6571:1: ( rule__StringManipulationStatement__Group__1__Impl )
            // InternalMyDsl.g:6572:2: rule__StringManipulationStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringManipulationStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringManipulationStatement__Group__1"


    // $ANTLR start "rule__StringManipulationStatement__Group__1__Impl"
    // InternalMyDsl.g:6578:1: rule__StringManipulationStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__StringManipulationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6582:1: ( ( ';' ) )
            // InternalMyDsl.g:6583:1: ( ';' )
            {
            // InternalMyDsl.g:6583:1: ( ';' )
            // InternalMyDsl.g:6584:2: ';'
            {
             before(grammarAccess.getStringManipulationStatementAccess().getSemicolonKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getStringManipulationStatementAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__StringManipulationStatement__Group__1__Impl"


    // $ANTLR start "rule__SplitFunctionCall__Group__0"
    // InternalMyDsl.g:6594:1: rule__SplitFunctionCall__Group__0 : rule__SplitFunctionCall__Group__0__Impl rule__SplitFunctionCall__Group__1 ;
    public final void rule__SplitFunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6598:1: ( rule__SplitFunctionCall__Group__0__Impl rule__SplitFunctionCall__Group__1 )
            // InternalMyDsl.g:6599:2: rule__SplitFunctionCall__Group__0__Impl rule__SplitFunctionCall__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__SplitFunctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SplitFunctionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SplitFunctionCall__Group__0"


    // $ANTLR start "rule__SplitFunctionCall__Group__0__Impl"
    // InternalMyDsl.g:6606:1: rule__SplitFunctionCall__Group__0__Impl : ( 'split' ) ;
    public final void rule__SplitFunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6610:1: ( ( 'split' ) )
            // InternalMyDsl.g:6611:1: ( 'split' )
            {
            // InternalMyDsl.g:6611:1: ( 'split' )
            // InternalMyDsl.g:6612:2: 'split'
            {
             before(grammarAccess.getSplitFunctionCallAccess().getSplitKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getSplitFunctionCallAccess().getSplitKeyword_0()); 

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
    // $ANTLR end "rule__SplitFunctionCall__Group__0__Impl"


    // $ANTLR start "rule__SplitFunctionCall__Group__1"
    // InternalMyDsl.g:6621:1: rule__SplitFunctionCall__Group__1 : rule__SplitFunctionCall__Group__1__Impl rule__SplitFunctionCall__Group__2 ;
    public final void rule__SplitFunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6625:1: ( rule__SplitFunctionCall__Group__1__Impl rule__SplitFunctionCall__Group__2 )
            // InternalMyDsl.g:6626:2: rule__SplitFunctionCall__Group__1__Impl rule__SplitFunctionCall__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__SplitFunctionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SplitFunctionCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SplitFunctionCall__Group__1"


    // $ANTLR start "rule__SplitFunctionCall__Group__1__Impl"
    // InternalMyDsl.g:6633:1: rule__SplitFunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__SplitFunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6637:1: ( ( '(' ) )
            // InternalMyDsl.g:6638:1: ( '(' )
            {
            // InternalMyDsl.g:6638:1: ( '(' )
            // InternalMyDsl.g:6639:2: '('
            {
             before(grammarAccess.getSplitFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSplitFunctionCallAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__SplitFunctionCall__Group__1__Impl"


    // $ANTLR start "rule__SplitFunctionCall__Group__2"
    // InternalMyDsl.g:6648:1: rule__SplitFunctionCall__Group__2 : rule__SplitFunctionCall__Group__2__Impl rule__SplitFunctionCall__Group__3 ;
    public final void rule__SplitFunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6652:1: ( rule__SplitFunctionCall__Group__2__Impl rule__SplitFunctionCall__Group__3 )
            // InternalMyDsl.g:6653:2: rule__SplitFunctionCall__Group__2__Impl rule__SplitFunctionCall__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SplitFunctionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SplitFunctionCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SplitFunctionCall__Group__2"


    // $ANTLR start "rule__SplitFunctionCall__Group__2__Impl"
    // InternalMyDsl.g:6660:1: rule__SplitFunctionCall__Group__2__Impl : ( ( rule__SplitFunctionCall__StrAssignment_2 ) ) ;
    public final void rule__SplitFunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6664:1: ( ( ( rule__SplitFunctionCall__StrAssignment_2 ) ) )
            // InternalMyDsl.g:6665:1: ( ( rule__SplitFunctionCall__StrAssignment_2 ) )
            {
            // InternalMyDsl.g:6665:1: ( ( rule__SplitFunctionCall__StrAssignment_2 ) )
            // InternalMyDsl.g:6666:2: ( rule__SplitFunctionCall__StrAssignment_2 )
            {
             before(grammarAccess.getSplitFunctionCallAccess().getStrAssignment_2()); 
            // InternalMyDsl.g:6667:2: ( rule__SplitFunctionCall__StrAssignment_2 )
            // InternalMyDsl.g:6667:3: rule__SplitFunctionCall__StrAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SplitFunctionCall__StrAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSplitFunctionCallAccess().getStrAssignment_2()); 

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
    // $ANTLR end "rule__SplitFunctionCall__Group__2__Impl"


    // $ANTLR start "rule__SplitFunctionCall__Group__3"
    // InternalMyDsl.g:6675:1: rule__SplitFunctionCall__Group__3 : rule__SplitFunctionCall__Group__3__Impl rule__SplitFunctionCall__Group__4 ;
    public final void rule__SplitFunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6679:1: ( rule__SplitFunctionCall__Group__3__Impl rule__SplitFunctionCall__Group__4 )
            // InternalMyDsl.g:6680:2: rule__SplitFunctionCall__Group__3__Impl rule__SplitFunctionCall__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__SplitFunctionCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SplitFunctionCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SplitFunctionCall__Group__3"


    // $ANTLR start "rule__SplitFunctionCall__Group__3__Impl"
    // InternalMyDsl.g:6687:1: rule__SplitFunctionCall__Group__3__Impl : ( ',' ) ;
    public final void rule__SplitFunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6691:1: ( ( ',' ) )
            // InternalMyDsl.g:6692:1: ( ',' )
            {
            // InternalMyDsl.g:6692:1: ( ',' )
            // InternalMyDsl.g:6693:2: ','
            {
             before(grammarAccess.getSplitFunctionCallAccess().getCommaKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSplitFunctionCallAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__SplitFunctionCall__Group__3__Impl"


    // $ANTLR start "rule__SplitFunctionCall__Group__4"
    // InternalMyDsl.g:6702:1: rule__SplitFunctionCall__Group__4 : rule__SplitFunctionCall__Group__4__Impl rule__SplitFunctionCall__Group__5 ;
    public final void rule__SplitFunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6706:1: ( rule__SplitFunctionCall__Group__4__Impl rule__SplitFunctionCall__Group__5 )
            // InternalMyDsl.g:6707:2: rule__SplitFunctionCall__Group__4__Impl rule__SplitFunctionCall__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__SplitFunctionCall__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SplitFunctionCall__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SplitFunctionCall__Group__4"


    // $ANTLR start "rule__SplitFunctionCall__Group__4__Impl"
    // InternalMyDsl.g:6714:1: rule__SplitFunctionCall__Group__4__Impl : ( ( rule__SplitFunctionCall__DelimiterAssignment_4 ) ) ;
    public final void rule__SplitFunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6718:1: ( ( ( rule__SplitFunctionCall__DelimiterAssignment_4 ) ) )
            // InternalMyDsl.g:6719:1: ( ( rule__SplitFunctionCall__DelimiterAssignment_4 ) )
            {
            // InternalMyDsl.g:6719:1: ( ( rule__SplitFunctionCall__DelimiterAssignment_4 ) )
            // InternalMyDsl.g:6720:2: ( rule__SplitFunctionCall__DelimiterAssignment_4 )
            {
             before(grammarAccess.getSplitFunctionCallAccess().getDelimiterAssignment_4()); 
            // InternalMyDsl.g:6721:2: ( rule__SplitFunctionCall__DelimiterAssignment_4 )
            // InternalMyDsl.g:6721:3: rule__SplitFunctionCall__DelimiterAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SplitFunctionCall__DelimiterAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSplitFunctionCallAccess().getDelimiterAssignment_4()); 

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
    // $ANTLR end "rule__SplitFunctionCall__Group__4__Impl"


    // $ANTLR start "rule__SplitFunctionCall__Group__5"
    // InternalMyDsl.g:6729:1: rule__SplitFunctionCall__Group__5 : rule__SplitFunctionCall__Group__5__Impl ;
    public final void rule__SplitFunctionCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6733:1: ( rule__SplitFunctionCall__Group__5__Impl )
            // InternalMyDsl.g:6734:2: rule__SplitFunctionCall__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SplitFunctionCall__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SplitFunctionCall__Group__5"


    // $ANTLR start "rule__SplitFunctionCall__Group__5__Impl"
    // InternalMyDsl.g:6740:1: rule__SplitFunctionCall__Group__5__Impl : ( ')' ) ;
    public final void rule__SplitFunctionCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6744:1: ( ( ')' ) )
            // InternalMyDsl.g:6745:1: ( ')' )
            {
            // InternalMyDsl.g:6745:1: ( ')' )
            // InternalMyDsl.g:6746:2: ')'
            {
             before(grammarAccess.getSplitFunctionCallAccess().getRightParenthesisKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getSplitFunctionCallAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__SplitFunctionCall__Group__5__Impl"


    // $ANTLR start "rule__JoinFunctionCall__Group__0"
    // InternalMyDsl.g:6756:1: rule__JoinFunctionCall__Group__0 : rule__JoinFunctionCall__Group__0__Impl rule__JoinFunctionCall__Group__1 ;
    public final void rule__JoinFunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6760:1: ( rule__JoinFunctionCall__Group__0__Impl rule__JoinFunctionCall__Group__1 )
            // InternalMyDsl.g:6761:2: rule__JoinFunctionCall__Group__0__Impl rule__JoinFunctionCall__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__JoinFunctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinFunctionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFunctionCall__Group__0"


    // $ANTLR start "rule__JoinFunctionCall__Group__0__Impl"
    // InternalMyDsl.g:6768:1: rule__JoinFunctionCall__Group__0__Impl : ( 'join' ) ;
    public final void rule__JoinFunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6772:1: ( ( 'join' ) )
            // InternalMyDsl.g:6773:1: ( 'join' )
            {
            // InternalMyDsl.g:6773:1: ( 'join' )
            // InternalMyDsl.g:6774:2: 'join'
            {
             before(grammarAccess.getJoinFunctionCallAccess().getJoinKeyword_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getJoinFunctionCallAccess().getJoinKeyword_0()); 

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
    // $ANTLR end "rule__JoinFunctionCall__Group__0__Impl"


    // $ANTLR start "rule__JoinFunctionCall__Group__1"
    // InternalMyDsl.g:6783:1: rule__JoinFunctionCall__Group__1 : rule__JoinFunctionCall__Group__1__Impl rule__JoinFunctionCall__Group__2 ;
    public final void rule__JoinFunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6787:1: ( rule__JoinFunctionCall__Group__1__Impl rule__JoinFunctionCall__Group__2 )
            // InternalMyDsl.g:6788:2: rule__JoinFunctionCall__Group__1__Impl rule__JoinFunctionCall__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__JoinFunctionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinFunctionCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFunctionCall__Group__1"


    // $ANTLR start "rule__JoinFunctionCall__Group__1__Impl"
    // InternalMyDsl.g:6795:1: rule__JoinFunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__JoinFunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6799:1: ( ( '(' ) )
            // InternalMyDsl.g:6800:1: ( '(' )
            {
            // InternalMyDsl.g:6800:1: ( '(' )
            // InternalMyDsl.g:6801:2: '('
            {
             before(grammarAccess.getJoinFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getJoinFunctionCallAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__JoinFunctionCall__Group__1__Impl"


    // $ANTLR start "rule__JoinFunctionCall__Group__2"
    // InternalMyDsl.g:6810:1: rule__JoinFunctionCall__Group__2 : rule__JoinFunctionCall__Group__2__Impl rule__JoinFunctionCall__Group__3 ;
    public final void rule__JoinFunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6814:1: ( rule__JoinFunctionCall__Group__2__Impl rule__JoinFunctionCall__Group__3 )
            // InternalMyDsl.g:6815:2: rule__JoinFunctionCall__Group__2__Impl rule__JoinFunctionCall__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__JoinFunctionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinFunctionCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFunctionCall__Group__2"


    // $ANTLR start "rule__JoinFunctionCall__Group__2__Impl"
    // InternalMyDsl.g:6822:1: rule__JoinFunctionCall__Group__2__Impl : ( ( rule__JoinFunctionCall__StrAssignment_2 ) ) ;
    public final void rule__JoinFunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6826:1: ( ( ( rule__JoinFunctionCall__StrAssignment_2 ) ) )
            // InternalMyDsl.g:6827:1: ( ( rule__JoinFunctionCall__StrAssignment_2 ) )
            {
            // InternalMyDsl.g:6827:1: ( ( rule__JoinFunctionCall__StrAssignment_2 ) )
            // InternalMyDsl.g:6828:2: ( rule__JoinFunctionCall__StrAssignment_2 )
            {
             before(grammarAccess.getJoinFunctionCallAccess().getStrAssignment_2()); 
            // InternalMyDsl.g:6829:2: ( rule__JoinFunctionCall__StrAssignment_2 )
            // InternalMyDsl.g:6829:3: rule__JoinFunctionCall__StrAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__JoinFunctionCall__StrAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinFunctionCallAccess().getStrAssignment_2()); 

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
    // $ANTLR end "rule__JoinFunctionCall__Group__2__Impl"


    // $ANTLR start "rule__JoinFunctionCall__Group__3"
    // InternalMyDsl.g:6837:1: rule__JoinFunctionCall__Group__3 : rule__JoinFunctionCall__Group__3__Impl rule__JoinFunctionCall__Group__4 ;
    public final void rule__JoinFunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6841:1: ( rule__JoinFunctionCall__Group__3__Impl rule__JoinFunctionCall__Group__4 )
            // InternalMyDsl.g:6842:2: rule__JoinFunctionCall__Group__3__Impl rule__JoinFunctionCall__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__JoinFunctionCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinFunctionCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFunctionCall__Group__3"


    // $ANTLR start "rule__JoinFunctionCall__Group__3__Impl"
    // InternalMyDsl.g:6849:1: rule__JoinFunctionCall__Group__3__Impl : ( ( rule__JoinFunctionCall__Group_3__0 )* ) ;
    public final void rule__JoinFunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6853:1: ( ( ( rule__JoinFunctionCall__Group_3__0 )* ) )
            // InternalMyDsl.g:6854:1: ( ( rule__JoinFunctionCall__Group_3__0 )* )
            {
            // InternalMyDsl.g:6854:1: ( ( rule__JoinFunctionCall__Group_3__0 )* )
            // InternalMyDsl.g:6855:2: ( rule__JoinFunctionCall__Group_3__0 )*
            {
             before(grammarAccess.getJoinFunctionCallAccess().getGroup_3()); 
            // InternalMyDsl.g:6856:2: ( rule__JoinFunctionCall__Group_3__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==50) ) {
                    int LA45_1 = input.LA(2);

                    if ( (LA45_1==RULE_STRING) ) {
                        int LA45_2 = input.LA(3);

                        if ( ((LA45_2>=13 && LA45_2<=14)||(LA45_2>=20 && LA45_2<=32)||LA45_2==50) ) {
                            alt45=1;
                        }


                    }
                    else if ( (LA45_1==RULE_ID||(LA45_1>=RULE_INT && LA45_1<=RULE_CHAR)||(LA45_1>=15 && LA45_1<=19)||LA45_1==55||LA45_1==57) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // InternalMyDsl.g:6856:3: rule__JoinFunctionCall__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__JoinFunctionCall__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getJoinFunctionCallAccess().getGroup_3()); 

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
    // $ANTLR end "rule__JoinFunctionCall__Group__3__Impl"


    // $ANTLR start "rule__JoinFunctionCall__Group__4"
    // InternalMyDsl.g:6864:1: rule__JoinFunctionCall__Group__4 : rule__JoinFunctionCall__Group__4__Impl rule__JoinFunctionCall__Group__5 ;
    public final void rule__JoinFunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6868:1: ( rule__JoinFunctionCall__Group__4__Impl rule__JoinFunctionCall__Group__5 )
            // InternalMyDsl.g:6869:2: rule__JoinFunctionCall__Group__4__Impl rule__JoinFunctionCall__Group__5
            {
            pushFollow(FOLLOW_48);
            rule__JoinFunctionCall__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinFunctionCall__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFunctionCall__Group__4"


    // $ANTLR start "rule__JoinFunctionCall__Group__4__Impl"
    // InternalMyDsl.g:6876:1: rule__JoinFunctionCall__Group__4__Impl : ( ',' ) ;
    public final void rule__JoinFunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6880:1: ( ( ',' ) )
            // InternalMyDsl.g:6881:1: ( ',' )
            {
            // InternalMyDsl.g:6881:1: ( ',' )
            // InternalMyDsl.g:6882:2: ','
            {
             before(grammarAccess.getJoinFunctionCallAccess().getCommaKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getJoinFunctionCallAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__JoinFunctionCall__Group__4__Impl"


    // $ANTLR start "rule__JoinFunctionCall__Group__5"
    // InternalMyDsl.g:6891:1: rule__JoinFunctionCall__Group__5 : rule__JoinFunctionCall__Group__5__Impl rule__JoinFunctionCall__Group__6 ;
    public final void rule__JoinFunctionCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6895:1: ( rule__JoinFunctionCall__Group__5__Impl rule__JoinFunctionCall__Group__6 )
            // InternalMyDsl.g:6896:2: rule__JoinFunctionCall__Group__5__Impl rule__JoinFunctionCall__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__JoinFunctionCall__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinFunctionCall__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFunctionCall__Group__5"


    // $ANTLR start "rule__JoinFunctionCall__Group__5__Impl"
    // InternalMyDsl.g:6903:1: rule__JoinFunctionCall__Group__5__Impl : ( ( rule__JoinFunctionCall__DelimiterAssignment_5 ) ) ;
    public final void rule__JoinFunctionCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6907:1: ( ( ( rule__JoinFunctionCall__DelimiterAssignment_5 ) ) )
            // InternalMyDsl.g:6908:1: ( ( rule__JoinFunctionCall__DelimiterAssignment_5 ) )
            {
            // InternalMyDsl.g:6908:1: ( ( rule__JoinFunctionCall__DelimiterAssignment_5 ) )
            // InternalMyDsl.g:6909:2: ( rule__JoinFunctionCall__DelimiterAssignment_5 )
            {
             before(grammarAccess.getJoinFunctionCallAccess().getDelimiterAssignment_5()); 
            // InternalMyDsl.g:6910:2: ( rule__JoinFunctionCall__DelimiterAssignment_5 )
            // InternalMyDsl.g:6910:3: rule__JoinFunctionCall__DelimiterAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__JoinFunctionCall__DelimiterAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJoinFunctionCallAccess().getDelimiterAssignment_5()); 

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
    // $ANTLR end "rule__JoinFunctionCall__Group__5__Impl"


    // $ANTLR start "rule__JoinFunctionCall__Group__6"
    // InternalMyDsl.g:6918:1: rule__JoinFunctionCall__Group__6 : rule__JoinFunctionCall__Group__6__Impl ;
    public final void rule__JoinFunctionCall__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6922:1: ( rule__JoinFunctionCall__Group__6__Impl )
            // InternalMyDsl.g:6923:2: rule__JoinFunctionCall__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoinFunctionCall__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFunctionCall__Group__6"


    // $ANTLR start "rule__JoinFunctionCall__Group__6__Impl"
    // InternalMyDsl.g:6929:1: rule__JoinFunctionCall__Group__6__Impl : ( ')' ) ;
    public final void rule__JoinFunctionCall__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6933:1: ( ( ')' ) )
            // InternalMyDsl.g:6934:1: ( ')' )
            {
            // InternalMyDsl.g:6934:1: ( ')' )
            // InternalMyDsl.g:6935:2: ')'
            {
             before(grammarAccess.getJoinFunctionCallAccess().getRightParenthesisKeyword_6()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getJoinFunctionCallAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__JoinFunctionCall__Group__6__Impl"


    // $ANTLR start "rule__JoinFunctionCall__Group_3__0"
    // InternalMyDsl.g:6945:1: rule__JoinFunctionCall__Group_3__0 : rule__JoinFunctionCall__Group_3__0__Impl rule__JoinFunctionCall__Group_3__1 ;
    public final void rule__JoinFunctionCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6949:1: ( rule__JoinFunctionCall__Group_3__0__Impl rule__JoinFunctionCall__Group_3__1 )
            // InternalMyDsl.g:6950:2: rule__JoinFunctionCall__Group_3__0__Impl rule__JoinFunctionCall__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__JoinFunctionCall__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinFunctionCall__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFunctionCall__Group_3__0"


    // $ANTLR start "rule__JoinFunctionCall__Group_3__0__Impl"
    // InternalMyDsl.g:6957:1: rule__JoinFunctionCall__Group_3__0__Impl : ( ',' ) ;
    public final void rule__JoinFunctionCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6961:1: ( ( ',' ) )
            // InternalMyDsl.g:6962:1: ( ',' )
            {
            // InternalMyDsl.g:6962:1: ( ',' )
            // InternalMyDsl.g:6963:2: ','
            {
             before(grammarAccess.getJoinFunctionCallAccess().getCommaKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getJoinFunctionCallAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__JoinFunctionCall__Group_3__0__Impl"


    // $ANTLR start "rule__JoinFunctionCall__Group_3__1"
    // InternalMyDsl.g:6972:1: rule__JoinFunctionCall__Group_3__1 : rule__JoinFunctionCall__Group_3__1__Impl ;
    public final void rule__JoinFunctionCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6976:1: ( rule__JoinFunctionCall__Group_3__1__Impl )
            // InternalMyDsl.g:6977:2: rule__JoinFunctionCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoinFunctionCall__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinFunctionCall__Group_3__1"


    // $ANTLR start "rule__JoinFunctionCall__Group_3__1__Impl"
    // InternalMyDsl.g:6983:1: rule__JoinFunctionCall__Group_3__1__Impl : ( ( rule__JoinFunctionCall__StrAssignment_3_1 ) ) ;
    public final void rule__JoinFunctionCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6987:1: ( ( ( rule__JoinFunctionCall__StrAssignment_3_1 ) ) )
            // InternalMyDsl.g:6988:1: ( ( rule__JoinFunctionCall__StrAssignment_3_1 ) )
            {
            // InternalMyDsl.g:6988:1: ( ( rule__JoinFunctionCall__StrAssignment_3_1 ) )
            // InternalMyDsl.g:6989:2: ( rule__JoinFunctionCall__StrAssignment_3_1 )
            {
             before(grammarAccess.getJoinFunctionCallAccess().getStrAssignment_3_1()); 
            // InternalMyDsl.g:6990:2: ( rule__JoinFunctionCall__StrAssignment_3_1 )
            // InternalMyDsl.g:6990:3: rule__JoinFunctionCall__StrAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__JoinFunctionCall__StrAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getJoinFunctionCallAccess().getStrAssignment_3_1()); 

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
    // $ANTLR end "rule__JoinFunctionCall__Group_3__1__Impl"


    // $ANTLR start "rule__SliceFunctionCall__Group__0"
    // InternalMyDsl.g:6999:1: rule__SliceFunctionCall__Group__0 : rule__SliceFunctionCall__Group__0__Impl rule__SliceFunctionCall__Group__1 ;
    public final void rule__SliceFunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7003:1: ( rule__SliceFunctionCall__Group__0__Impl rule__SliceFunctionCall__Group__1 )
            // InternalMyDsl.g:7004:2: rule__SliceFunctionCall__Group__0__Impl rule__SliceFunctionCall__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__SliceFunctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SliceFunctionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceFunctionCall__Group__0"


    // $ANTLR start "rule__SliceFunctionCall__Group__0__Impl"
    // InternalMyDsl.g:7011:1: rule__SliceFunctionCall__Group__0__Impl : ( 'slice' ) ;
    public final void rule__SliceFunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7015:1: ( ( 'slice' ) )
            // InternalMyDsl.g:7016:1: ( 'slice' )
            {
            // InternalMyDsl.g:7016:1: ( 'slice' )
            // InternalMyDsl.g:7017:2: 'slice'
            {
             before(grammarAccess.getSliceFunctionCallAccess().getSliceKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getSliceFunctionCallAccess().getSliceKeyword_0()); 

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
    // $ANTLR end "rule__SliceFunctionCall__Group__0__Impl"


    // $ANTLR start "rule__SliceFunctionCall__Group__1"
    // InternalMyDsl.g:7026:1: rule__SliceFunctionCall__Group__1 : rule__SliceFunctionCall__Group__1__Impl rule__SliceFunctionCall__Group__2 ;
    public final void rule__SliceFunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7030:1: ( rule__SliceFunctionCall__Group__1__Impl rule__SliceFunctionCall__Group__2 )
            // InternalMyDsl.g:7031:2: rule__SliceFunctionCall__Group__1__Impl rule__SliceFunctionCall__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__SliceFunctionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SliceFunctionCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceFunctionCall__Group__1"


    // $ANTLR start "rule__SliceFunctionCall__Group__1__Impl"
    // InternalMyDsl.g:7038:1: rule__SliceFunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__SliceFunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7042:1: ( ( '(' ) )
            // InternalMyDsl.g:7043:1: ( '(' )
            {
            // InternalMyDsl.g:7043:1: ( '(' )
            // InternalMyDsl.g:7044:2: '('
            {
             before(grammarAccess.getSliceFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSliceFunctionCallAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__SliceFunctionCall__Group__1__Impl"


    // $ANTLR start "rule__SliceFunctionCall__Group__2"
    // InternalMyDsl.g:7053:1: rule__SliceFunctionCall__Group__2 : rule__SliceFunctionCall__Group__2__Impl rule__SliceFunctionCall__Group__3 ;
    public final void rule__SliceFunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7057:1: ( rule__SliceFunctionCall__Group__2__Impl rule__SliceFunctionCall__Group__3 )
            // InternalMyDsl.g:7058:2: rule__SliceFunctionCall__Group__2__Impl rule__SliceFunctionCall__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SliceFunctionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SliceFunctionCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceFunctionCall__Group__2"


    // $ANTLR start "rule__SliceFunctionCall__Group__2__Impl"
    // InternalMyDsl.g:7065:1: rule__SliceFunctionCall__Group__2__Impl : ( ( rule__SliceFunctionCall__StrAssignment_2 ) ) ;
    public final void rule__SliceFunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7069:1: ( ( ( rule__SliceFunctionCall__StrAssignment_2 ) ) )
            // InternalMyDsl.g:7070:1: ( ( rule__SliceFunctionCall__StrAssignment_2 ) )
            {
            // InternalMyDsl.g:7070:1: ( ( rule__SliceFunctionCall__StrAssignment_2 ) )
            // InternalMyDsl.g:7071:2: ( rule__SliceFunctionCall__StrAssignment_2 )
            {
             before(grammarAccess.getSliceFunctionCallAccess().getStrAssignment_2()); 
            // InternalMyDsl.g:7072:2: ( rule__SliceFunctionCall__StrAssignment_2 )
            // InternalMyDsl.g:7072:3: rule__SliceFunctionCall__StrAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SliceFunctionCall__StrAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSliceFunctionCallAccess().getStrAssignment_2()); 

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
    // $ANTLR end "rule__SliceFunctionCall__Group__2__Impl"


    // $ANTLR start "rule__SliceFunctionCall__Group__3"
    // InternalMyDsl.g:7080:1: rule__SliceFunctionCall__Group__3 : rule__SliceFunctionCall__Group__3__Impl rule__SliceFunctionCall__Group__4 ;
    public final void rule__SliceFunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7084:1: ( rule__SliceFunctionCall__Group__3__Impl rule__SliceFunctionCall__Group__4 )
            // InternalMyDsl.g:7085:2: rule__SliceFunctionCall__Group__3__Impl rule__SliceFunctionCall__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__SliceFunctionCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SliceFunctionCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceFunctionCall__Group__3"


    // $ANTLR start "rule__SliceFunctionCall__Group__3__Impl"
    // InternalMyDsl.g:7092:1: rule__SliceFunctionCall__Group__3__Impl : ( ',' ) ;
    public final void rule__SliceFunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7096:1: ( ( ',' ) )
            // InternalMyDsl.g:7097:1: ( ',' )
            {
            // InternalMyDsl.g:7097:1: ( ',' )
            // InternalMyDsl.g:7098:2: ','
            {
             before(grammarAccess.getSliceFunctionCallAccess().getCommaKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSliceFunctionCallAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__SliceFunctionCall__Group__3__Impl"


    // $ANTLR start "rule__SliceFunctionCall__Group__4"
    // InternalMyDsl.g:7107:1: rule__SliceFunctionCall__Group__4 : rule__SliceFunctionCall__Group__4__Impl rule__SliceFunctionCall__Group__5 ;
    public final void rule__SliceFunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7111:1: ( rule__SliceFunctionCall__Group__4__Impl rule__SliceFunctionCall__Group__5 )
            // InternalMyDsl.g:7112:2: rule__SliceFunctionCall__Group__4__Impl rule__SliceFunctionCall__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__SliceFunctionCall__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SliceFunctionCall__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceFunctionCall__Group__4"


    // $ANTLR start "rule__SliceFunctionCall__Group__4__Impl"
    // InternalMyDsl.g:7119:1: rule__SliceFunctionCall__Group__4__Impl : ( ( rule__SliceFunctionCall__StartAssignment_4 ) ) ;
    public final void rule__SliceFunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7123:1: ( ( ( rule__SliceFunctionCall__StartAssignment_4 ) ) )
            // InternalMyDsl.g:7124:1: ( ( rule__SliceFunctionCall__StartAssignment_4 ) )
            {
            // InternalMyDsl.g:7124:1: ( ( rule__SliceFunctionCall__StartAssignment_4 ) )
            // InternalMyDsl.g:7125:2: ( rule__SliceFunctionCall__StartAssignment_4 )
            {
             before(grammarAccess.getSliceFunctionCallAccess().getStartAssignment_4()); 
            // InternalMyDsl.g:7126:2: ( rule__SliceFunctionCall__StartAssignment_4 )
            // InternalMyDsl.g:7126:3: rule__SliceFunctionCall__StartAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SliceFunctionCall__StartAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSliceFunctionCallAccess().getStartAssignment_4()); 

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
    // $ANTLR end "rule__SliceFunctionCall__Group__4__Impl"


    // $ANTLR start "rule__SliceFunctionCall__Group__5"
    // InternalMyDsl.g:7134:1: rule__SliceFunctionCall__Group__5 : rule__SliceFunctionCall__Group__5__Impl rule__SliceFunctionCall__Group__6 ;
    public final void rule__SliceFunctionCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7138:1: ( rule__SliceFunctionCall__Group__5__Impl rule__SliceFunctionCall__Group__6 )
            // InternalMyDsl.g:7139:2: rule__SliceFunctionCall__Group__5__Impl rule__SliceFunctionCall__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__SliceFunctionCall__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SliceFunctionCall__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceFunctionCall__Group__5"


    // $ANTLR start "rule__SliceFunctionCall__Group__5__Impl"
    // InternalMyDsl.g:7146:1: rule__SliceFunctionCall__Group__5__Impl : ( ',' ) ;
    public final void rule__SliceFunctionCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7150:1: ( ( ',' ) )
            // InternalMyDsl.g:7151:1: ( ',' )
            {
            // InternalMyDsl.g:7151:1: ( ',' )
            // InternalMyDsl.g:7152:2: ','
            {
             before(grammarAccess.getSliceFunctionCallAccess().getCommaKeyword_5()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSliceFunctionCallAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__SliceFunctionCall__Group__5__Impl"


    // $ANTLR start "rule__SliceFunctionCall__Group__6"
    // InternalMyDsl.g:7161:1: rule__SliceFunctionCall__Group__6 : rule__SliceFunctionCall__Group__6__Impl rule__SliceFunctionCall__Group__7 ;
    public final void rule__SliceFunctionCall__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7165:1: ( rule__SliceFunctionCall__Group__6__Impl rule__SliceFunctionCall__Group__7 )
            // InternalMyDsl.g:7166:2: rule__SliceFunctionCall__Group__6__Impl rule__SliceFunctionCall__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__SliceFunctionCall__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SliceFunctionCall__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceFunctionCall__Group__6"


    // $ANTLR start "rule__SliceFunctionCall__Group__6__Impl"
    // InternalMyDsl.g:7173:1: rule__SliceFunctionCall__Group__6__Impl : ( ( rule__SliceFunctionCall__EndAssignment_6 ) ) ;
    public final void rule__SliceFunctionCall__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7177:1: ( ( ( rule__SliceFunctionCall__EndAssignment_6 ) ) )
            // InternalMyDsl.g:7178:1: ( ( rule__SliceFunctionCall__EndAssignment_6 ) )
            {
            // InternalMyDsl.g:7178:1: ( ( rule__SliceFunctionCall__EndAssignment_6 ) )
            // InternalMyDsl.g:7179:2: ( rule__SliceFunctionCall__EndAssignment_6 )
            {
             before(grammarAccess.getSliceFunctionCallAccess().getEndAssignment_6()); 
            // InternalMyDsl.g:7180:2: ( rule__SliceFunctionCall__EndAssignment_6 )
            // InternalMyDsl.g:7180:3: rule__SliceFunctionCall__EndAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SliceFunctionCall__EndAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSliceFunctionCallAccess().getEndAssignment_6()); 

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
    // $ANTLR end "rule__SliceFunctionCall__Group__6__Impl"


    // $ANTLR start "rule__SliceFunctionCall__Group__7"
    // InternalMyDsl.g:7188:1: rule__SliceFunctionCall__Group__7 : rule__SliceFunctionCall__Group__7__Impl ;
    public final void rule__SliceFunctionCall__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7192:1: ( rule__SliceFunctionCall__Group__7__Impl )
            // InternalMyDsl.g:7193:2: rule__SliceFunctionCall__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SliceFunctionCall__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceFunctionCall__Group__7"


    // $ANTLR start "rule__SliceFunctionCall__Group__7__Impl"
    // InternalMyDsl.g:7199:1: rule__SliceFunctionCall__Group__7__Impl : ( ')' ) ;
    public final void rule__SliceFunctionCall__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7203:1: ( ( ')' ) )
            // InternalMyDsl.g:7204:1: ( ')' )
            {
            // InternalMyDsl.g:7204:1: ( ')' )
            // InternalMyDsl.g:7205:2: ')'
            {
             before(grammarAccess.getSliceFunctionCallAccess().getRightParenthesisKeyword_7()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getSliceFunctionCallAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__SliceFunctionCall__Group__7__Impl"


    // $ANTLR start "rule__ThrowStatement__Group__0"
    // InternalMyDsl.g:7215:1: rule__ThrowStatement__Group__0 : rule__ThrowStatement__Group__0__Impl rule__ThrowStatement__Group__1 ;
    public final void rule__ThrowStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7219:1: ( rule__ThrowStatement__Group__0__Impl rule__ThrowStatement__Group__1 )
            // InternalMyDsl.g:7220:2: rule__ThrowStatement__Group__0__Impl rule__ThrowStatement__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ThrowStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThrowStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThrowStatement__Group__0"


    // $ANTLR start "rule__ThrowStatement__Group__0__Impl"
    // InternalMyDsl.g:7227:1: rule__ThrowStatement__Group__0__Impl : ( 'throw' ) ;
    public final void rule__ThrowStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7231:1: ( ( 'throw' ) )
            // InternalMyDsl.g:7232:1: ( 'throw' )
            {
            // InternalMyDsl.g:7232:1: ( 'throw' )
            // InternalMyDsl.g:7233:2: 'throw'
            {
             before(grammarAccess.getThrowStatementAccess().getThrowKeyword_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getThrowStatementAccess().getThrowKeyword_0()); 

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
    // $ANTLR end "rule__ThrowStatement__Group__0__Impl"


    // $ANTLR start "rule__ThrowStatement__Group__1"
    // InternalMyDsl.g:7242:1: rule__ThrowStatement__Group__1 : rule__ThrowStatement__Group__1__Impl rule__ThrowStatement__Group__2 ;
    public final void rule__ThrowStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7246:1: ( rule__ThrowStatement__Group__1__Impl rule__ThrowStatement__Group__2 )
            // InternalMyDsl.g:7247:2: rule__ThrowStatement__Group__1__Impl rule__ThrowStatement__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ThrowStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThrowStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThrowStatement__Group__1"


    // $ANTLR start "rule__ThrowStatement__Group__1__Impl"
    // InternalMyDsl.g:7254:1: rule__ThrowStatement__Group__1__Impl : ( ( rule__ThrowStatement__ExprAssignment_1 ) ) ;
    public final void rule__ThrowStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7258:1: ( ( ( rule__ThrowStatement__ExprAssignment_1 ) ) )
            // InternalMyDsl.g:7259:1: ( ( rule__ThrowStatement__ExprAssignment_1 ) )
            {
            // InternalMyDsl.g:7259:1: ( ( rule__ThrowStatement__ExprAssignment_1 ) )
            // InternalMyDsl.g:7260:2: ( rule__ThrowStatement__ExprAssignment_1 )
            {
             before(grammarAccess.getThrowStatementAccess().getExprAssignment_1()); 
            // InternalMyDsl.g:7261:2: ( rule__ThrowStatement__ExprAssignment_1 )
            // InternalMyDsl.g:7261:3: rule__ThrowStatement__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ThrowStatement__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThrowStatementAccess().getExprAssignment_1()); 

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
    // $ANTLR end "rule__ThrowStatement__Group__1__Impl"


    // $ANTLR start "rule__ThrowStatement__Group__2"
    // InternalMyDsl.g:7269:1: rule__ThrowStatement__Group__2 : rule__ThrowStatement__Group__2__Impl ;
    public final void rule__ThrowStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7273:1: ( rule__ThrowStatement__Group__2__Impl )
            // InternalMyDsl.g:7274:2: rule__ThrowStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ThrowStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThrowStatement__Group__2"


    // $ANTLR start "rule__ThrowStatement__Group__2__Impl"
    // InternalMyDsl.g:7280:1: rule__ThrowStatement__Group__2__Impl : ( ';' ) ;
    public final void rule__ThrowStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7284:1: ( ( ';' ) )
            // InternalMyDsl.g:7285:1: ( ';' )
            {
            // InternalMyDsl.g:7285:1: ( ';' )
            // InternalMyDsl.g:7286:2: ';'
            {
             before(grammarAccess.getThrowStatementAccess().getSemicolonKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getThrowStatementAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__ThrowStatement__Group__2__Impl"


    // $ANTLR start "rule__DomainModel__StatementsAssignment"
    // InternalMyDsl.g:7296:1: rule__DomainModel__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__DomainModel__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7300:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:7301:2: ( ruleStatement )
            {
            // InternalMyDsl.g:7301:2: ( ruleStatement )
            // InternalMyDsl.g:7302:3: ruleStatement
            {
             before(grammarAccess.getDomainModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getStatementsStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__DomainModel__StatementsAssignment"


    // $ANTLR start "rule__Import__ImportedElementAssignment_1_0_0_0"
    // InternalMyDsl.g:7311:1: rule__Import__ImportedElementAssignment_1_0_0_0 : ( ruleImportElement ) ;
    public final void rule__Import__ImportedElementAssignment_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7315:1: ( ( ruleImportElement ) )
            // InternalMyDsl.g:7316:2: ( ruleImportElement )
            {
            // InternalMyDsl.g:7316:2: ( ruleImportElement )
            // InternalMyDsl.g:7317:3: ruleImportElement
            {
             before(grammarAccess.getImportAccess().getImportedElementImportElementParserRuleCall_1_0_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImportElement();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedElementImportElementParserRuleCall_1_0_0_0_0()); 

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
    // $ANTLR end "rule__Import__ImportedElementAssignment_1_0_0_0"


    // $ANTLR start "rule__Import__ImportedElementsAssignment_1_0_1_1_0"
    // InternalMyDsl.g:7326:1: rule__Import__ImportedElementsAssignment_1_0_1_1_0 : ( ruleImportElement ) ;
    public final void rule__Import__ImportedElementsAssignment_1_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7330:1: ( ( ruleImportElement ) )
            // InternalMyDsl.g:7331:2: ( ruleImportElement )
            {
            // InternalMyDsl.g:7331:2: ( ruleImportElement )
            // InternalMyDsl.g:7332:3: ruleImportElement
            {
             before(grammarAccess.getImportAccess().getImportedElementsImportElementParserRuleCall_1_0_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImportElement();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedElementsImportElementParserRuleCall_1_0_1_1_0_0()); 

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
    // $ANTLR end "rule__Import__ImportedElementsAssignment_1_0_1_1_0"


    // $ANTLR start "rule__Import__ImportedElementsAssignment_1_0_1_1_1_1"
    // InternalMyDsl.g:7341:1: rule__Import__ImportedElementsAssignment_1_0_1_1_1_1 : ( ruleImportElement ) ;
    public final void rule__Import__ImportedElementsAssignment_1_0_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7345:1: ( ( ruleImportElement ) )
            // InternalMyDsl.g:7346:2: ( ruleImportElement )
            {
            // InternalMyDsl.g:7346:2: ( ruleImportElement )
            // InternalMyDsl.g:7347:3: ruleImportElement
            {
             before(grammarAccess.getImportAccess().getImportedElementsImportElementParserRuleCall_1_0_1_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportElement();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedElementsImportElementParserRuleCall_1_0_1_1_1_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedElementsAssignment_1_0_1_1_1_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_2"
    // InternalMyDsl.g:7356:1: rule__Import__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7360:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:7361:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:7361:2: ( RULE_STRING )
            // InternalMyDsl.g:7362:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Import__ImportURIAssignment_2"


    // $ANTLR start "rule__ImportElement__ElementAssignment_0"
    // InternalMyDsl.g:7371:1: rule__ImportElement__ElementAssignment_0 : ( ( rule__ImportElement__ElementAlternatives_0_0 ) ) ;
    public final void rule__ImportElement__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7375:1: ( ( ( rule__ImportElement__ElementAlternatives_0_0 ) ) )
            // InternalMyDsl.g:7376:2: ( ( rule__ImportElement__ElementAlternatives_0_0 ) )
            {
            // InternalMyDsl.g:7376:2: ( ( rule__ImportElement__ElementAlternatives_0_0 ) )
            // InternalMyDsl.g:7377:3: ( rule__ImportElement__ElementAlternatives_0_0 )
            {
             before(grammarAccess.getImportElementAccess().getElementAlternatives_0_0()); 
            // InternalMyDsl.g:7378:3: ( rule__ImportElement__ElementAlternatives_0_0 )
            // InternalMyDsl.g:7378:4: rule__ImportElement__ElementAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ImportElement__ElementAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getImportElementAccess().getElementAlternatives_0_0()); 

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
    // $ANTLR end "rule__ImportElement__ElementAssignment_0"


    // $ANTLR start "rule__ImportElement__AliasAssignment_1_1"
    // InternalMyDsl.g:7386:1: rule__ImportElement__AliasAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__ImportElement__AliasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7390:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7391:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7391:2: ( RULE_ID )
            // InternalMyDsl.g:7392:3: RULE_ID
            {
             before(grammarAccess.getImportElementAccess().getAliasIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImportElementAccess().getAliasIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ImportElement__AliasAssignment_1_1"


    // $ANTLR start "rule__Block__StatementsAssignment_1"
    // InternalMyDsl.g:7401:1: rule__Block__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7405:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:7406:2: ( ruleStatement )
            {
            // InternalMyDsl.g:7406:2: ( ruleStatement )
            // InternalMyDsl.g:7407:3: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Block__StatementsAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__TypeAssignment_0"
    // InternalMyDsl.g:7416:1: rule__VariableDeclaration__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7420:1: ( ( ruleType ) )
            // InternalMyDsl.g:7421:2: ( ruleType )
            {
            // InternalMyDsl.g:7421:2: ( ruleType )
            // InternalMyDsl.g:7422:3: ruleType
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getTypeTypeEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalMyDsl.g:7431:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7435:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7436:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7436:2: ( RULE_ID )
            // InternalMyDsl.g:7437:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ExprAssignment_2_1"
    // InternalMyDsl.g:7446:1: rule__VariableDeclaration__ExprAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__VariableDeclaration__ExprAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7450:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:7451:2: ( ruleExpression )
            {
            // InternalMyDsl.g:7451:2: ( ruleExpression )
            // InternalMyDsl.g:7452:3: ruleExpression
            {
             before(grammarAccess.getVariableDeclarationAccess().getExprExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getExprExpressionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__ExprAssignment_2_1"


    // $ANTLR start "rule__ExpressionStatement__ExprAssignment_0"
    // InternalMyDsl.g:7461:1: rule__ExpressionStatement__ExprAssignment_0 : ( ruleExpression ) ;
    public final void rule__ExpressionStatement__ExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7465:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:7466:2: ( ruleExpression )
            {
            // InternalMyDsl.g:7466:2: ( ruleExpression )
            // InternalMyDsl.g:7467:3: ruleExpression
            {
             before(grammarAccess.getExpressionStatementAccess().getExprExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionStatementAccess().getExprExpressionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ExpressionStatement__ExprAssignment_0"


    // $ANTLR start "rule__AugmentedAssignment__ExprAssignment_2"
    // InternalMyDsl.g:7476:1: rule__AugmentedAssignment__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__AugmentedAssignment__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7480:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:7481:2: ( ruleExpression )
            {
            // InternalMyDsl.g:7481:2: ( ruleExpression )
            // InternalMyDsl.g:7482:3: ruleExpression
            {
             before(grammarAccess.getAugmentedAssignmentAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAugmentedAssignmentAccess().getExprExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AugmentedAssignment__ExprAssignment_2"


    // $ANTLR start "rule__LogicalExpression__RightAssignment_1_1"
    // InternalMyDsl.g:7491:1: rule__LogicalExpression__RightAssignment_1_1 : ( ruleComparisonExpression ) ;
    public final void rule__LogicalExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7495:1: ( ( ruleComparisonExpression ) )
            // InternalMyDsl.g:7496:2: ( ruleComparisonExpression )
            {
            // InternalMyDsl.g:7496:2: ( ruleComparisonExpression )
            // InternalMyDsl.g:7497:3: ruleComparisonExpression
            {
             before(grammarAccess.getLogicalExpressionAccess().getRightComparisonExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getLogicalExpressionAccess().getRightComparisonExpressionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LogicalExpression__RightAssignment_1_1"


    // $ANTLR start "rule__ComparisonExpression__RightAssignment_1_2"
    // InternalMyDsl.g:7506:1: rule__ComparisonExpression__RightAssignment_1_2 : ( ruleArithmeticExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7510:1: ( ( ruleArithmeticExpression ) )
            // InternalMyDsl.g:7511:2: ( ruleArithmeticExpression )
            {
            // InternalMyDsl.g:7511:2: ( ruleArithmeticExpression )
            // InternalMyDsl.g:7512:3: ruleArithmeticExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightArithmeticExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRightArithmeticExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ComparisonExpression__RightAssignment_1_2"


    // $ANTLR start "rule__ArithmeticExpression__RightAssignment_1_2"
    // InternalMyDsl.g:7521:1: rule__ArithmeticExpression__RightAssignment_1_2 : ( ruleMultiplicationExpression ) ;
    public final void rule__ArithmeticExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7525:1: ( ( ruleMultiplicationExpression ) )
            // InternalMyDsl.g:7526:2: ( ruleMultiplicationExpression )
            {
            // InternalMyDsl.g:7526:2: ( ruleMultiplicationExpression )
            // InternalMyDsl.g:7527:3: ruleMultiplicationExpression
            {
             before(grammarAccess.getArithmeticExpressionAccess().getRightMultiplicationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getArithmeticExpressionAccess().getRightMultiplicationExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ArithmeticExpression__RightAssignment_1_2"


    // $ANTLR start "rule__MultiplicationExpression__RightAssignment_1_2"
    // InternalMyDsl.g:7536:1: rule__MultiplicationExpression__RightAssignment_1_2 : ( ruleExponentiationExpression ) ;
    public final void rule__MultiplicationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7540:1: ( ( ruleExponentiationExpression ) )
            // InternalMyDsl.g:7541:2: ( ruleExponentiationExpression )
            {
            // InternalMyDsl.g:7541:2: ( ruleExponentiationExpression )
            // InternalMyDsl.g:7542:3: ruleExponentiationExpression
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExponentiationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExponentiationExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getRightExponentiationExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__MultiplicationExpression__RightAssignment_1_2"


    // $ANTLR start "rule__ExponentiationExpression__RightAssignment_1_2"
    // InternalMyDsl.g:7551:1: rule__ExponentiationExpression__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__ExponentiationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7555:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:7556:2: ( rulePrimary )
            {
            // InternalMyDsl.g:7556:2: ( rulePrimary )
            // InternalMyDsl.g:7557:3: rulePrimary
            {
             before(grammarAccess.getExponentiationExpressionAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getExponentiationExpressionAccess().getRightPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ExponentiationExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AnonymousFunction__ParametersAssignment_2_0"
    // InternalMyDsl.g:7566:1: rule__AnonymousFunction__ParametersAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__AnonymousFunction__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7570:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7571:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7571:2: ( RULE_ID )
            // InternalMyDsl.g:7572:3: RULE_ID
            {
             before(grammarAccess.getAnonymousFunctionAccess().getParametersIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnonymousFunctionAccess().getParametersIDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__AnonymousFunction__ParametersAssignment_2_0"


    // $ANTLR start "rule__AnonymousFunction__ParametersAssignment_2_1_1"
    // InternalMyDsl.g:7581:1: rule__AnonymousFunction__ParametersAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__AnonymousFunction__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7585:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7586:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7586:2: ( RULE_ID )
            // InternalMyDsl.g:7587:3: RULE_ID
            {
             before(grammarAccess.getAnonymousFunctionAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnonymousFunctionAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__AnonymousFunction__ParametersAssignment_2_1_1"


    // $ANTLR start "rule__AnonymousFunction__BodyAssignment_4"
    // InternalMyDsl.g:7596:1: rule__AnonymousFunction__BodyAssignment_4 : ( ruleBlock ) ;
    public final void rule__AnonymousFunction__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7600:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:7601:2: ( ruleBlock )
            {
            // InternalMyDsl.g:7601:2: ( ruleBlock )
            // InternalMyDsl.g:7602:3: ruleBlock
            {
             before(grammarAccess.getAnonymousFunctionAccess().getBodyBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getAnonymousFunctionAccess().getBodyBlockParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__AnonymousFunction__BodyAssignment_4"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // InternalMyDsl.g:7611:1: rule__NumberLiteral__ValueAssignment : ( ruleNUMBER ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7615:1: ( ( ruleNUMBER ) )
            // InternalMyDsl.g:7616:2: ( ruleNUMBER )
            {
            // InternalMyDsl.g:7616:2: ( ruleNUMBER )
            // InternalMyDsl.g:7617:3: ruleNUMBER
            {
             before(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 

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
    // $ANTLR end "rule__NumberLiteral__ValueAssignment"


    // $ANTLR start "rule__Boolean__ValueAssignment_1"
    // InternalMyDsl.g:7626:1: rule__Boolean__ValueAssignment_1 : ( ( rule__Boolean__ValueAlternatives_1_0 ) ) ;
    public final void rule__Boolean__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7630:1: ( ( ( rule__Boolean__ValueAlternatives_1_0 ) ) )
            // InternalMyDsl.g:7631:2: ( ( rule__Boolean__ValueAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:7631:2: ( ( rule__Boolean__ValueAlternatives_1_0 ) )
            // InternalMyDsl.g:7632:3: ( rule__Boolean__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getBooleanAccess().getValueAlternatives_1_0()); 
            // InternalMyDsl.g:7633:3: ( rule__Boolean__ValueAlternatives_1_0 )
            // InternalMyDsl.g:7633:4: rule__Boolean__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__ValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getValueAlternatives_1_0()); 

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
    // $ANTLR end "rule__Boolean__ValueAssignment_1"


    // $ANTLR start "rule__NotBoolean__ValueAssignment_1"
    // InternalMyDsl.g:7641:1: rule__NotBoolean__ValueAssignment_1 : ( RULE_NOT ) ;
    public final void rule__NotBoolean__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7645:1: ( ( RULE_NOT ) )
            // InternalMyDsl.g:7646:2: ( RULE_NOT )
            {
            // InternalMyDsl.g:7646:2: ( RULE_NOT )
            // InternalMyDsl.g:7647:3: RULE_NOT
            {
             before(grammarAccess.getNotBooleanAccess().getValueNOTTerminalRuleCall_1_0()); 
            match(input,RULE_NOT,FOLLOW_2); 
             after(grammarAccess.getNotBooleanAccess().getValueNOTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NotBoolean__ValueAssignment_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalMyDsl.g:7656:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7660:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:7661:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:7661:2: ( RULE_STRING )
            // InternalMyDsl.g:7662:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__CharLiteral__ValueAssignment"
    // InternalMyDsl.g:7671:1: rule__CharLiteral__ValueAssignment : ( RULE_CHAR ) ;
    public final void rule__CharLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7675:1: ( ( RULE_CHAR ) )
            // InternalMyDsl.g:7676:2: ( RULE_CHAR )
            {
            // InternalMyDsl.g:7676:2: ( RULE_CHAR )
            // InternalMyDsl.g:7677:3: RULE_CHAR
            {
             before(grammarAccess.getCharLiteralAccess().getValueCHARTerminalRuleCall_0()); 
            match(input,RULE_CHAR,FOLLOW_2); 
             after(grammarAccess.getCharLiteralAccess().getValueCHARTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__CharLiteral__ValueAssignment"


    // $ANTLR start "rule__VariableReference__NameAssignment"
    // InternalMyDsl.g:7686:1: rule__VariableReference__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7690:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7691:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7691:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7692:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableReferenceAccess().getNameVariableDeclarationCrossReference_0()); 
            // InternalMyDsl.g:7693:3: ( RULE_ID )
            // InternalMyDsl.g:7694:4: RULE_ID
            {
             before(grammarAccess.getVariableReferenceAccess().getNameVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableReferenceAccess().getNameVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVariableReferenceAccess().getNameVariableDeclarationCrossReference_0()); 

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
    // $ANTLR end "rule__VariableReference__NameAssignment"


    // $ANTLR start "rule__IfStatement__ConditionAssignment_2"
    // InternalMyDsl.g:7705:1: rule__IfStatement__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfStatement__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7709:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:7710:2: ( ruleExpression )
            {
            // InternalMyDsl.g:7710:2: ( ruleExpression )
            // InternalMyDsl.g:7711:3: ruleExpression
            {
             before(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__IfStatement__ConditionAssignment_2"


    // $ANTLR start "rule__IfStatement__ThenBranchAssignment_4"
    // InternalMyDsl.g:7720:1: rule__IfStatement__ThenBranchAssignment_4 : ( ruleBlock ) ;
    public final void rule__IfStatement__ThenBranchAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7724:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:7725:2: ( ruleBlock )
            {
            // InternalMyDsl.g:7725:2: ( ruleBlock )
            // InternalMyDsl.g:7726:3: ruleBlock
            {
             before(grammarAccess.getIfStatementAccess().getThenBranchBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getThenBranchBlockParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__IfStatement__ThenBranchAssignment_4"


    // $ANTLR start "rule__IfStatement__ElseBranchAssignment_5_1"
    // InternalMyDsl.g:7735:1: rule__IfStatement__ElseBranchAssignment_5_1 : ( ruleBlock ) ;
    public final void rule__IfStatement__ElseBranchAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7739:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:7740:2: ( ruleBlock )
            {
            // InternalMyDsl.g:7740:2: ( ruleBlock )
            // InternalMyDsl.g:7741:3: ruleBlock
            {
             before(grammarAccess.getIfStatementAccess().getElseBranchBlockParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getElseBranchBlockParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__IfStatement__ElseBranchAssignment_5_1"


    // $ANTLR start "rule__ForLoop__InitializationAssignment_2"
    // InternalMyDsl.g:7750:1: rule__ForLoop__InitializationAssignment_2 : ( ruleExpression ) ;
    public final void rule__ForLoop__InitializationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7754:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:7755:2: ( ruleExpression )
            {
            // InternalMyDsl.g:7755:2: ( ruleExpression )
            // InternalMyDsl.g:7756:3: ruleExpression
            {
             before(grammarAccess.getForLoopAccess().getInitializationExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getInitializationExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ForLoop__InitializationAssignment_2"


    // $ANTLR start "rule__ForLoop__ConditionAssignment_4"
    // InternalMyDsl.g:7765:1: rule__ForLoop__ConditionAssignment_4 : ( ruleExpression ) ;
    public final void rule__ForLoop__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7769:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:7770:2: ( ruleExpression )
            {
            // InternalMyDsl.g:7770:2: ( ruleExpression )
            // InternalMyDsl.g:7771:3: ruleExpression
            {
             before(grammarAccess.getForLoopAccess().getConditionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getConditionExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ForLoop__ConditionAssignment_4"


    // $ANTLR start "rule__ForLoop__IncrementAssignment_6"
    // InternalMyDsl.g:7780:1: rule__ForLoop__IncrementAssignment_6 : ( ruleExpression ) ;
    public final void rule__ForLoop__IncrementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7784:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:7785:2: ( ruleExpression )
            {
            // InternalMyDsl.g:7785:2: ( ruleExpression )
            // InternalMyDsl.g:7786:3: ruleExpression
            {
             before(grammarAccess.getForLoopAccess().getIncrementExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getIncrementExpressionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ForLoop__IncrementAssignment_6"


    // $ANTLR start "rule__ForLoop__BodyAssignment_8"
    // InternalMyDsl.g:7795:1: rule__ForLoop__BodyAssignment_8 : ( ruleBlock ) ;
    public final void rule__ForLoop__BodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7799:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:7800:2: ( ruleBlock )
            {
            // InternalMyDsl.g:7800:2: ( ruleBlock )
            // InternalMyDsl.g:7801:3: ruleBlock
            {
             before(grammarAccess.getForLoopAccess().getBodyBlockParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getBodyBlockParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ForLoop__BodyAssignment_8"


    // $ANTLR start "rule__WhileLoop__ConditionAssignment_2"
    // InternalMyDsl.g:7810:1: rule__WhileLoop__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileLoop__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7814:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:7815:2: ( ruleExpression )
            {
            // InternalMyDsl.g:7815:2: ( ruleExpression )
            // InternalMyDsl.g:7816:3: ruleExpression
            {
             before(grammarAccess.getWhileLoopAccess().getConditionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getConditionExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__WhileLoop__ConditionAssignment_2"


    // $ANTLR start "rule__WhileLoop__BodyAssignment_4"
    // InternalMyDsl.g:7825:1: rule__WhileLoop__BodyAssignment_4 : ( ruleBlock ) ;
    public final void rule__WhileLoop__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7829:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:7830:2: ( ruleBlock )
            {
            // InternalMyDsl.g:7830:2: ( ruleBlock )
            // InternalMyDsl.g:7831:3: ruleBlock
            {
             before(grammarAccess.getWhileLoopAccess().getBodyBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getBodyBlockParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__WhileLoop__BodyAssignment_4"


    // $ANTLR start "rule__DoWhileLoop__BodyAssignment_1"
    // InternalMyDsl.g:7840:1: rule__DoWhileLoop__BodyAssignment_1 : ( ruleBlock ) ;
    public final void rule__DoWhileLoop__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7844:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:7845:2: ( ruleBlock )
            {
            // InternalMyDsl.g:7845:2: ( ruleBlock )
            // InternalMyDsl.g:7846:3: ruleBlock
            {
             before(grammarAccess.getDoWhileLoopAccess().getBodyBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getDoWhileLoopAccess().getBodyBlockParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DoWhileLoop__BodyAssignment_1"


    // $ANTLR start "rule__DoWhileLoop__ConditionAssignment_4"
    // InternalMyDsl.g:7855:1: rule__DoWhileLoop__ConditionAssignment_4 : ( ruleExpression ) ;
    public final void rule__DoWhileLoop__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7859:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:7860:2: ( ruleExpression )
            {
            // InternalMyDsl.g:7860:2: ( ruleExpression )
            // InternalMyDsl.g:7861:3: ruleExpression
            {
             before(grammarAccess.getDoWhileLoopAccess().getConditionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDoWhileLoopAccess().getConditionExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DoWhileLoop__ConditionAssignment_4"


    // $ANTLR start "rule__FunctionDeclaration__ReturnTypeAssignment_0"
    // InternalMyDsl.g:7870:1: rule__FunctionDeclaration__ReturnTypeAssignment_0 : ( ruleType ) ;
    public final void rule__FunctionDeclaration__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7874:1: ( ( ruleType ) )
            // InternalMyDsl.g:7875:2: ( ruleType )
            {
            // InternalMyDsl.g:7875:2: ( ruleType )
            // InternalMyDsl.g:7876:3: ruleType
            {
             before(grammarAccess.getFunctionDeclarationAccess().getReturnTypeTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getReturnTypeTypeEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__FunctionDeclaration__ReturnTypeAssignment_0"


    // $ANTLR start "rule__FunctionDeclaration__NameAssignment_2"
    // InternalMyDsl.g:7885:1: rule__FunctionDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7889:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7890:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7890:2: ( RULE_ID )
            // InternalMyDsl.g:7891:3: RULE_ID
            {
             before(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__FunctionDeclaration__NameAssignment_2"


    // $ANTLR start "rule__FunctionDeclaration__ParametersAssignment_4_0"
    // InternalMyDsl.g:7900:1: rule__FunctionDeclaration__ParametersAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7904:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7905:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7905:2: ( RULE_ID )
            // InternalMyDsl.g:7906:3: RULE_ID
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_4_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__FunctionDeclaration__ParametersAssignment_4_0"


    // $ANTLR start "rule__FunctionDeclaration__ParametersAssignment_4_1_1"
    // InternalMyDsl.g:7915:1: rule__FunctionDeclaration__ParametersAssignment_4_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7919:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7920:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7920:2: ( RULE_ID )
            // InternalMyDsl.g:7921:3: RULE_ID
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_4_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__FunctionDeclaration__ParametersAssignment_4_1_1"


    // $ANTLR start "rule__FunctionDeclaration__BodyAssignment_6"
    // InternalMyDsl.g:7930:1: rule__FunctionDeclaration__BodyAssignment_6 : ( ruleBlock ) ;
    public final void rule__FunctionDeclaration__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7934:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:7935:2: ( ruleBlock )
            {
            // InternalMyDsl.g:7935:2: ( ruleBlock )
            // InternalMyDsl.g:7936:3: ruleBlock
            {
             before(grammarAccess.getFunctionDeclarationAccess().getBodyBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getBodyBlockParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__FunctionDeclaration__BodyAssignment_6"


    // $ANTLR start "rule__FunctionCall__NameAssignment_0"
    // InternalMyDsl.g:7945:1: rule__FunctionCall__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7949:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7950:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7950:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7951:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionCallAccess().getNameFunctionDeclarationCrossReference_0_0()); 
            // InternalMyDsl.g:7952:3: ( RULE_ID )
            // InternalMyDsl.g:7953:4: RULE_ID
            {
             before(grammarAccess.getFunctionCallAccess().getNameFunctionDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getNameFunctionDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFunctionCallAccess().getNameFunctionDeclarationCrossReference_0_0()); 

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
    // $ANTLR end "rule__FunctionCall__NameAssignment_0"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_2_0"
    // InternalMyDsl.g:7964:1: rule__FunctionCall__ArgumentsAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7968:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:7969:2: ( ruleExpression )
            {
            // InternalMyDsl.g:7969:2: ( ruleExpression )
            // InternalMyDsl.g:7970:3: ruleExpression
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsExpressionParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_2_0"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_2_1_1"
    // InternalMyDsl.g:7979:1: rule__FunctionCall__ArgumentsAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7983:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:7984:2: ( ruleExpression )
            {
            // InternalMyDsl.g:7984:2: ( ruleExpression )
            // InternalMyDsl.g:7985:3: ruleExpression
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsExpressionParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_2_1_1"


    // $ANTLR start "rule__FunctionReturn__ExprAssignment_1"
    // InternalMyDsl.g:7994:1: rule__FunctionReturn__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__FunctionReturn__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7998:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:7999:2: ( ruleExpression )
            {
            // InternalMyDsl.g:7999:2: ( ruleExpression )
            // InternalMyDsl.g:8000:3: ruleExpression
            {
             before(grammarAccess.getFunctionReturnAccess().getExprExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionReturnAccess().getExprExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FunctionReturn__ExprAssignment_1"


    // $ANTLR start "rule__ConsoleLogStatement__ArgumentsAssignment_3_0"
    // InternalMyDsl.g:8009:1: rule__ConsoleLogStatement__ArgumentsAssignment_3_0 : ( ruleExpression ) ;
    public final void rule__ConsoleLogStatement__ArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8013:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:8014:2: ( ruleExpression )
            {
            // InternalMyDsl.g:8014:2: ( ruleExpression )
            // InternalMyDsl.g:8015:3: ruleExpression
            {
             before(grammarAccess.getConsoleLogStatementAccess().getArgumentsExpressionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConsoleLogStatementAccess().getArgumentsExpressionParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__ConsoleLogStatement__ArgumentsAssignment_3_0"


    // $ANTLR start "rule__ConsoleLogStatement__ArgumentsAssignment_3_1_1"
    // InternalMyDsl.g:8024:1: rule__ConsoleLogStatement__ArgumentsAssignment_3_1_1 : ( ruleExpression ) ;
    public final void rule__ConsoleLogStatement__ArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8028:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:8029:2: ( ruleExpression )
            {
            // InternalMyDsl.g:8029:2: ( ruleExpression )
            // InternalMyDsl.g:8030:3: ruleExpression
            {
             before(grammarAccess.getConsoleLogStatementAccess().getArgumentsExpressionParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConsoleLogStatementAccess().getArgumentsExpressionParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__ConsoleLogStatement__ArgumentsAssignment_3_1_1"


    // $ANTLR start "rule__TryCatchStatement__TryBlockAssignment_1"
    // InternalMyDsl.g:8039:1: rule__TryCatchStatement__TryBlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__TryCatchStatement__TryBlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8043:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:8044:2: ( ruleBlock )
            {
            // InternalMyDsl.g:8044:2: ( ruleBlock )
            // InternalMyDsl.g:8045:3: ruleBlock
            {
             before(grammarAccess.getTryCatchStatementAccess().getTryBlockBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getTryCatchStatementAccess().getTryBlockBlockParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TryCatchStatement__TryBlockAssignment_1"


    // $ANTLR start "rule__TryCatchStatement__ExceptionAssignment_4"
    // InternalMyDsl.g:8054:1: rule__TryCatchStatement__ExceptionAssignment_4 : ( RULE_ID ) ;
    public final void rule__TryCatchStatement__ExceptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8058:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8059:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8059:2: ( RULE_ID )
            // InternalMyDsl.g:8060:3: RULE_ID
            {
             before(grammarAccess.getTryCatchStatementAccess().getExceptionIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTryCatchStatementAccess().getExceptionIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__TryCatchStatement__ExceptionAssignment_4"


    // $ANTLR start "rule__TryCatchStatement__CatchBlockAssignment_6"
    // InternalMyDsl.g:8069:1: rule__TryCatchStatement__CatchBlockAssignment_6 : ( ruleBlock ) ;
    public final void rule__TryCatchStatement__CatchBlockAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8073:1: ( ( ruleBlock ) )
            // InternalMyDsl.g:8074:2: ( ruleBlock )
            {
            // InternalMyDsl.g:8074:2: ( ruleBlock )
            // InternalMyDsl.g:8075:3: ruleBlock
            {
             before(grammarAccess.getTryCatchStatementAccess().getCatchBlockBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getTryCatchStatementAccess().getCatchBlockBlockParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__TryCatchStatement__CatchBlockAssignment_6"


    // $ANTLR start "rule__SwitchStatement__ExpressionAssignment_2"
    // InternalMyDsl.g:8084:1: rule__SwitchStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__SwitchStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8088:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:8089:2: ( ruleExpression )
            {
            // InternalMyDsl.g:8089:2: ( ruleExpression )
            // InternalMyDsl.g:8090:3: ruleExpression
            {
             before(grammarAccess.getSwitchStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSwitchStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SwitchStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__SwitchStatement__CasesAssignment_5"
    // InternalMyDsl.g:8099:1: rule__SwitchStatement__CasesAssignment_5 : ( ruleCase ) ;
    public final void rule__SwitchStatement__CasesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8103:1: ( ( ruleCase ) )
            // InternalMyDsl.g:8104:2: ( ruleCase )
            {
            // InternalMyDsl.g:8104:2: ( ruleCase )
            // InternalMyDsl.g:8105:3: ruleCase
            {
             before(grammarAccess.getSwitchStatementAccess().getCasesCaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getSwitchStatementAccess().getCasesCaseParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__SwitchStatement__CasesAssignment_5"


    // $ANTLR start "rule__SwitchStatement__DefaultCaseAssignment_6"
    // InternalMyDsl.g:8114:1: rule__SwitchStatement__DefaultCaseAssignment_6 : ( ruleDefault ) ;
    public final void rule__SwitchStatement__DefaultCaseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8118:1: ( ( ruleDefault ) )
            // InternalMyDsl.g:8119:2: ( ruleDefault )
            {
            // InternalMyDsl.g:8119:2: ( ruleDefault )
            // InternalMyDsl.g:8120:3: ruleDefault
            {
             before(grammarAccess.getSwitchStatementAccess().getDefaultCaseDefaultParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDefault();

            state._fsp--;

             after(grammarAccess.getSwitchStatementAccess().getDefaultCaseDefaultParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__SwitchStatement__DefaultCaseAssignment_6"


    // $ANTLR start "rule__Case__ValueAssignment_1"
    // InternalMyDsl.g:8129:1: rule__Case__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Case__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8133:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:8134:2: ( ruleExpression )
            {
            // InternalMyDsl.g:8134:2: ( ruleExpression )
            // InternalMyDsl.g:8135:3: ruleExpression
            {
             before(grammarAccess.getCaseAccess().getValueExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getValueExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Case__ValueAssignment_1"


    // $ANTLR start "rule__Case__StatementsAssignment_3"
    // InternalMyDsl.g:8144:1: rule__Case__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Case__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8148:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:8149:2: ( ruleStatement )
            {
            // InternalMyDsl.g:8149:2: ( ruleStatement )
            // InternalMyDsl.g:8150:3: ruleStatement
            {
             before(grammarAccess.getCaseAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getStatementsStatementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Case__StatementsAssignment_3"


    // $ANTLR start "rule__Default__StatementsAssignment_3"
    // InternalMyDsl.g:8159:1: rule__Default__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Default__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8163:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:8164:2: ( ruleStatement )
            {
            // InternalMyDsl.g:8164:2: ( ruleStatement )
            // InternalMyDsl.g:8165:3: ruleStatement
            {
             before(grammarAccess.getDefaultAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getDefaultAccess().getStatementsStatementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Default__StatementsAssignment_3"


    // $ANTLR start "rule__SplitFunctionCall__StrAssignment_2"
    // InternalMyDsl.g:8174:1: rule__SplitFunctionCall__StrAssignment_2 : ( ruleExpression ) ;
    public final void rule__SplitFunctionCall__StrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8178:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:8179:2: ( ruleExpression )
            {
            // InternalMyDsl.g:8179:2: ( ruleExpression )
            // InternalMyDsl.g:8180:3: ruleExpression
            {
             before(grammarAccess.getSplitFunctionCallAccess().getStrExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSplitFunctionCallAccess().getStrExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SplitFunctionCall__StrAssignment_2"


    // $ANTLR start "rule__SplitFunctionCall__DelimiterAssignment_4"
    // InternalMyDsl.g:8189:1: rule__SplitFunctionCall__DelimiterAssignment_4 : ( ruleStringLiteral ) ;
    public final void rule__SplitFunctionCall__DelimiterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8193:1: ( ( ruleStringLiteral ) )
            // InternalMyDsl.g:8194:2: ( ruleStringLiteral )
            {
            // InternalMyDsl.g:8194:2: ( ruleStringLiteral )
            // InternalMyDsl.g:8195:3: ruleStringLiteral
            {
             before(grammarAccess.getSplitFunctionCallAccess().getDelimiterStringLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getSplitFunctionCallAccess().getDelimiterStringLiteralParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SplitFunctionCall__DelimiterAssignment_4"


    // $ANTLR start "rule__JoinFunctionCall__StrAssignment_2"
    // InternalMyDsl.g:8204:1: rule__JoinFunctionCall__StrAssignment_2 : ( ruleExpression ) ;
    public final void rule__JoinFunctionCall__StrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8208:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:8209:2: ( ruleExpression )
            {
            // InternalMyDsl.g:8209:2: ( ruleExpression )
            // InternalMyDsl.g:8210:3: ruleExpression
            {
             before(grammarAccess.getJoinFunctionCallAccess().getStrExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getJoinFunctionCallAccess().getStrExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__JoinFunctionCall__StrAssignment_2"


    // $ANTLR start "rule__JoinFunctionCall__StrAssignment_3_1"
    // InternalMyDsl.g:8219:1: rule__JoinFunctionCall__StrAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__JoinFunctionCall__StrAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8223:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:8224:2: ( ruleExpression )
            {
            // InternalMyDsl.g:8224:2: ( ruleExpression )
            // InternalMyDsl.g:8225:3: ruleExpression
            {
             before(grammarAccess.getJoinFunctionCallAccess().getStrExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getJoinFunctionCallAccess().getStrExpressionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__JoinFunctionCall__StrAssignment_3_1"


    // $ANTLR start "rule__JoinFunctionCall__DelimiterAssignment_5"
    // InternalMyDsl.g:8234:1: rule__JoinFunctionCall__DelimiterAssignment_5 : ( ruleStringLiteral ) ;
    public final void rule__JoinFunctionCall__DelimiterAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8238:1: ( ( ruleStringLiteral ) )
            // InternalMyDsl.g:8239:2: ( ruleStringLiteral )
            {
            // InternalMyDsl.g:8239:2: ( ruleStringLiteral )
            // InternalMyDsl.g:8240:3: ruleStringLiteral
            {
             before(grammarAccess.getJoinFunctionCallAccess().getDelimiterStringLiteralParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getJoinFunctionCallAccess().getDelimiterStringLiteralParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__JoinFunctionCall__DelimiterAssignment_5"


    // $ANTLR start "rule__SliceFunctionCall__StrAssignment_2"
    // InternalMyDsl.g:8249:1: rule__SliceFunctionCall__StrAssignment_2 : ( ruleExpression ) ;
    public final void rule__SliceFunctionCall__StrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8253:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:8254:2: ( ruleExpression )
            {
            // InternalMyDsl.g:8254:2: ( ruleExpression )
            // InternalMyDsl.g:8255:3: ruleExpression
            {
             before(grammarAccess.getSliceFunctionCallAccess().getStrExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSliceFunctionCallAccess().getStrExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SliceFunctionCall__StrAssignment_2"


    // $ANTLR start "rule__SliceFunctionCall__StartAssignment_4"
    // InternalMyDsl.g:8264:1: rule__SliceFunctionCall__StartAssignment_4 : ( RULE_INT ) ;
    public final void rule__SliceFunctionCall__StartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8268:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:8269:2: ( RULE_INT )
            {
            // InternalMyDsl.g:8269:2: ( RULE_INT )
            // InternalMyDsl.g:8270:3: RULE_INT
            {
             before(grammarAccess.getSliceFunctionCallAccess().getStartINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSliceFunctionCallAccess().getStartINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__SliceFunctionCall__StartAssignment_4"


    // $ANTLR start "rule__SliceFunctionCall__EndAssignment_6"
    // InternalMyDsl.g:8279:1: rule__SliceFunctionCall__EndAssignment_6 : ( RULE_INT ) ;
    public final void rule__SliceFunctionCall__EndAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8283:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:8284:2: ( RULE_INT )
            {
            // InternalMyDsl.g:8284:2: ( RULE_INT )
            // InternalMyDsl.g:8285:3: RULE_INT
            {
             before(grammarAccess.getSliceFunctionCallAccess().getEndINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSliceFunctionCallAccess().getEndINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__SliceFunctionCall__EndAssignment_6"


    // $ANTLR start "rule__ThrowStatement__ExprAssignment_1"
    // InternalMyDsl.g:8294:1: rule__ThrowStatement__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__ThrowStatement__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8298:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:8299:2: ( ruleExpression )
            {
            // InternalMyDsl.g:8299:2: ( ruleExpression )
            // InternalMyDsl.g:8300:3: ruleExpression
            {
             before(grammarAccess.getThrowStatementAccess().getExprExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getThrowStatementAccess().getExprExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ThrowStatement__ExprAssignment_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\35\uffff";
    static final String dfa_2s = "\12\4\1\uffff\1\15\1\4\20\uffff";
    static final String dfa_3s = "\1\115\11\71\1\uffff\2\67\20\uffff";
    static final String dfa_4s = "\12\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\11\1\1\1\12";
    static final String dfa_5s = "\35\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\4\12\6\uffff\5\12\23\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\31\6\uffff\1\12\1\uffff\1\14\1\uffff\1\15\1\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\26\3\uffff\3\27\1\30",
            "\1\33\64\uffff\1\32",
            "\1\33\64\uffff\1\32",
            "\1\33\64\uffff\1\32",
            "\1\33\64\uffff\1\32",
            "\1\33\64\uffff\1\32",
            "\1\33\64\uffff\1\32",
            "\1\33\64\uffff\1\32",
            "\1\33\64\uffff\1\32",
            "\1\33\64\uffff\1\32",
            "",
            "\4\12\3\uffff\23\12\17\uffff\1\12\1\34",
            "\1\32\62\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1391:1: rule__Statement__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleExpressionStatement ) | ( ruleIfStatement ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleContinueStatement ) | ( ruleBreakStatement ) | ( ruleFunctionDeclaration ) | ( ruleFunctionCall ) | ( ruleFunctionReturn ) | ( ruleConsoleLogStatement ) | ( ruleTryCatchStatement ) | ( ruleSwitchStatement ) | ( ruleStringManipulationStatement ) | ( ruleThrowStatement ) | ( ruleImport ) );";
        }
    }
    static final String dfa_7s = "\11\uffff";
    static final String dfa_8s = "\2\uffff\1\5\6\uffff";
    static final String dfa_9s = "\1\4\1\uffff\3\4\1\uffff\3\4";
    static final String dfa_10s = "\1\63\1\uffff\1\115\1\67\1\66\1\uffff\1\71\2\66";
    static final String dfa_11s = "\1\uffff\1\1\3\uffff\1\2\3\uffff";
    static final String dfa_12s = "\11\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\2\10\uffff\1\1\44\uffff\1\1",
            "",
            "\1\3\1\4\3\5\5\uffff\1\1\5\5\23\uffff\12\5\3\1\1\5\1\1\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\10\5\1\uffff\2\5\1\uffff\5\5",
            "\2\1\7\uffff\1\5\1\6\2\5\3\uffff\23\5\12\uffff\3\1\1\uffff\1\1\2\5",
            "\2\1\7\uffff\1\5\1\6\5\uffff\15\5\20\uffff\3\1\1\uffff\1\1\1\5",
            "",
            "\1\10\1\7\3\5\5\uffff\1\1\2\uffff\3\5\35\uffff\3\1\1\uffff\1\1\1\uffff\1\5\1\uffff\1\5",
            "\2\1\7\uffff\1\5\1\6\5\uffff\15\5\20\uffff\3\1\1\uffff\1\1\1\5",
            "\2\1\7\uffff\1\5\1\6\5\uffff\15\5\20\uffff\3\1\1\uffff\1\1\1\5"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1962:2: ( rule__Import__Group_1__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xEA81FF80000F81F2L,0x0000000000003C5FL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0008000000004030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0008000000004032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0010000000004030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xEA91FF80000F81F0L,0x0000000000003C5FL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0040000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x02800000000F81F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000007E00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x02800000000E01F0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000007F00002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000060004002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0200FF8000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x03800000000F81F0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xEA81FF80000F81F0L,0x0000000000003C5FL});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000020L});

}