package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NOT", "RULE_CHAR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "','", "'{'", "'}'", "'from'", "'*'", "'as'", "'='", "';'", "'('", "')'", "'++'", "'--'", "'function'", "'.'", "'true'", "'false'", "'null'", "'<='", "'<'", "'>='", "'>'", "'!='", "'=='", "'&&'", "'||'", "'/'", "'%'", "'+'", "'-'", "'**'", "'+='", "'-='", "'*='", "'/='", "'%='", "'**='", "'if'", "'else'", "'for'", "'while'", "'do'", "'continue'", "'break'", "'return'", "'console.log'", "'try'", "'catch'", "'switch'", "'case'", "':'", "'default'", "'split'", "'join'", "'slice'", "'throw'", "'int'", "'String'", "'char'", "'let'", "'boolean'", "'float'", "'var'", "'const'", "'void'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainModel"
    // InternalMyDsl.g:65:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // InternalMyDsl.g:65:52: (iv_ruleDomainModel= ruleDomainModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalMyDsl.g:72:1: ruleDomainModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalMyDsl.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalMyDsl.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_CHAR)||LA1_0==13||LA1_0==22||(LA1_0>=24 && LA1_0<=26)||(LA1_0>=28 && LA1_0<=30)||LA1_0==50||(LA1_0>=52 && LA1_0<=59)||LA1_0==61||(LA1_0>=65 && LA1_0<=77)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalMyDsl.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getDomainModelAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleImport"
    // InternalMyDsl.g:101:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMyDsl.g:101:47: (iv_ruleImport= ruleImport EOF )
            // InternalMyDsl.g:102:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMyDsl.g:108:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ( ( (lv_importedElement_1_0= ruleImportElement ) ) (otherlv_2= ',' )? ) | (otherlv_3= '{' ( ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )* )? otherlv_7= '}' ) )+ otherlv_8= 'from' )? ( (lv_importURI_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_importURI_9_0=null;
        EObject lv_importedElement_1_0 = null;

        EObject lv_importedElements_4_0 = null;

        EObject lv_importedElements_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:114:2: ( (otherlv_0= 'import' ( ( ( ( (lv_importedElement_1_0= ruleImportElement ) ) (otherlv_2= ',' )? ) | (otherlv_3= '{' ( ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )* )? otherlv_7= '}' ) )+ otherlv_8= 'from' )? ( (lv_importURI_9_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:115:2: (otherlv_0= 'import' ( ( ( ( (lv_importedElement_1_0= ruleImportElement ) ) (otherlv_2= ',' )? ) | (otherlv_3= '{' ( ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )* )? otherlv_7= '}' ) )+ otherlv_8= 'from' )? ( (lv_importURI_9_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:115:2: (otherlv_0= 'import' ( ( ( ( (lv_importedElement_1_0= ruleImportElement ) ) (otherlv_2= ',' )? ) | (otherlv_3= '{' ( ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )* )? otherlv_7= '}' ) )+ otherlv_8= 'from' )? ( (lv_importURI_9_0= RULE_STRING ) ) )
            // InternalMyDsl.g:116:3: otherlv_0= 'import' ( ( ( ( (lv_importedElement_1_0= ruleImportElement ) ) (otherlv_2= ',' )? ) | (otherlv_3= '{' ( ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )* )? otherlv_7= '}' ) )+ otherlv_8= 'from' )? ( (lv_importURI_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMyDsl.g:120:3: ( ( ( ( (lv_importedElement_1_0= ruleImportElement ) ) (otherlv_2= ',' )? ) | (otherlv_3= '{' ( ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )* )? otherlv_7= '}' ) )+ otherlv_8= 'from' )?
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:121:4: ( ( ( (lv_importedElement_1_0= ruleImportElement ) ) (otherlv_2= ',' )? ) | (otherlv_3= '{' ( ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )* )? otherlv_7= '}' ) )+ otherlv_8= 'from'
                    {
                    // InternalMyDsl.g:121:4: ( ( ( (lv_importedElement_1_0= ruleImportElement ) ) (otherlv_2= ',' )? ) | (otherlv_3= '{' ( ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )* )? otherlv_7= '}' ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||LA5_0==18) ) {
                            alt5=1;
                        }
                        else if ( (LA5_0==15) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:122:5: ( ( (lv_importedElement_1_0= ruleImportElement ) ) (otherlv_2= ',' )? )
                    	    {
                    	    // InternalMyDsl.g:122:5: ( ( (lv_importedElement_1_0= ruleImportElement ) ) (otherlv_2= ',' )? )
                    	    // InternalMyDsl.g:123:6: ( (lv_importedElement_1_0= ruleImportElement ) ) (otherlv_2= ',' )?
                    	    {
                    	    // InternalMyDsl.g:123:6: ( (lv_importedElement_1_0= ruleImportElement ) )
                    	    // InternalMyDsl.g:124:7: (lv_importedElement_1_0= ruleImportElement )
                    	    {
                    	    // InternalMyDsl.g:124:7: (lv_importedElement_1_0= ruleImportElement )
                    	    // InternalMyDsl.g:125:8: lv_importedElement_1_0= ruleImportElement
                    	    {

                    	    								newCompositeNode(grammarAccess.getImportAccess().getImportedElementImportElementParserRuleCall_1_0_0_0_0());
                    	    							
                    	    pushFollow(FOLLOW_5);
                    	    lv_importedElement_1_0=ruleImportElement();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getImportRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"importedElement",
                    	    									lv_importedElement_1_0,
                    	    									"org.xtext.example.mydsl.MyDsl.ImportElement");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    // InternalMyDsl.g:142:6: (otherlv_2= ',' )?
                    	    int alt2=2;
                    	    int LA2_0 = input.LA(1);

                    	    if ( (LA2_0==14) ) {
                    	        alt2=1;
                    	    }
                    	    switch (alt2) {
                    	        case 1 :
                    	            // InternalMyDsl.g:143:7: otherlv_2= ','
                    	            {
                    	            otherlv_2=(Token)match(input,14,FOLLOW_6); 

                    	            							newLeafNode(otherlv_2, grammarAccess.getImportAccess().getCommaKeyword_1_0_0_1());
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:150:5: (otherlv_3= '{' ( ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )* )? otherlv_7= '}' )
                    	    {
                    	    // InternalMyDsl.g:150:5: (otherlv_3= '{' ( ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )* )? otherlv_7= '}' )
                    	    // InternalMyDsl.g:151:6: otherlv_3= '{' ( ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )* )? otherlv_7= '}'
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_7); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_1_0_1_0());
                    	    					
                    	    // InternalMyDsl.g:155:6: ( ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )* )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||LA4_0==18) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // InternalMyDsl.g:156:7: ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )*
                    	            {
                    	            // InternalMyDsl.g:156:7: ( (lv_importedElements_4_0= ruleImportElement ) )
                    	            // InternalMyDsl.g:157:8: (lv_importedElements_4_0= ruleImportElement )
                    	            {
                    	            // InternalMyDsl.g:157:8: (lv_importedElements_4_0= ruleImportElement )
                    	            // InternalMyDsl.g:158:9: lv_importedElements_4_0= ruleImportElement
                    	            {

                    	            									newCompositeNode(grammarAccess.getImportAccess().getImportedElementsImportElementParserRuleCall_1_0_1_1_0_0());
                    	            								
                    	            pushFollow(FOLLOW_8);
                    	            lv_importedElements_4_0=ruleImportElement();

                    	            state._fsp--;


                    	            									if (current==null) {
                    	            										current = createModelElementForParent(grammarAccess.getImportRule());
                    	            									}
                    	            									add(
                    	            										current,
                    	            										"importedElements",
                    	            										lv_importedElements_4_0,
                    	            										"org.xtext.example.mydsl.MyDsl.ImportElement");
                    	            									afterParserOrEnumRuleCall();
                    	            								

                    	            }


                    	            }

                    	            // InternalMyDsl.g:175:7: (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )*
                    	            loop3:
                    	            do {
                    	                int alt3=2;
                    	                int LA3_0 = input.LA(1);

                    	                if ( (LA3_0==14) ) {
                    	                    alt3=1;
                    	                }


                    	                switch (alt3) {
                    	            	case 1 :
                    	            	    // InternalMyDsl.g:176:8: otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) )
                    	            	    {
                    	            	    otherlv_5=(Token)match(input,14,FOLLOW_9); 

                    	            	    								newLeafNode(otherlv_5, grammarAccess.getImportAccess().getCommaKeyword_1_0_1_1_1_0());
                    	            	    							
                    	            	    // InternalMyDsl.g:180:8: ( (lv_importedElements_6_0= ruleImportElement ) )
                    	            	    // InternalMyDsl.g:181:9: (lv_importedElements_6_0= ruleImportElement )
                    	            	    {
                    	            	    // InternalMyDsl.g:181:9: (lv_importedElements_6_0= ruleImportElement )
                    	            	    // InternalMyDsl.g:182:10: lv_importedElements_6_0= ruleImportElement
                    	            	    {

                    	            	    										newCompositeNode(grammarAccess.getImportAccess().getImportedElementsImportElementParserRuleCall_1_0_1_1_1_1_0());
                    	            	    									
                    	            	    pushFollow(FOLLOW_8);
                    	            	    lv_importedElements_6_0=ruleImportElement();

                    	            	    state._fsp--;


                    	            	    										if (current==null) {
                    	            	    											current = createModelElementForParent(grammarAccess.getImportRule());
                    	            	    										}
                    	            	    										add(
                    	            	    											current,
                    	            	    											"importedElements",
                    	            	    											lv_importedElements_6_0,
                    	            	    											"org.xtext.example.mydsl.MyDsl.ImportElement");
                    	            	    										afterParserOrEnumRuleCall();
                    	            	    									

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop3;
                    	                }
                    	            } while (true);


                    	            }
                    	            break;

                    	    }

                    	    otherlv_7=(Token)match(input,16,FOLLOW_6); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getImportAccess().getRightCurlyBracketKeyword_1_0_1_2());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getImportAccess().getFromKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:212:3: ( (lv_importURI_9_0= RULE_STRING ) )
            // InternalMyDsl.g:213:4: (lv_importURI_9_0= RULE_STRING )
            {
            // InternalMyDsl.g:213:4: (lv_importURI_9_0= RULE_STRING )
            // InternalMyDsl.g:214:5: lv_importURI_9_0= RULE_STRING
            {
            lv_importURI_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_9_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_9_0,
            						"org.xtext.example.mydsl.MyDsl.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleImportElement"
    // InternalMyDsl.g:234:1: entryRuleImportElement returns [EObject current=null] : iv_ruleImportElement= ruleImportElement EOF ;
    public final EObject entryRuleImportElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportElement = null;


        try {
            // InternalMyDsl.g:234:54: (iv_ruleImportElement= ruleImportElement EOF )
            // InternalMyDsl.g:235:2: iv_ruleImportElement= ruleImportElement EOF
            {
             newCompositeNode(grammarAccess.getImportElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportElement=ruleImportElement();

            state._fsp--;

             current =iv_ruleImportElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImportElement"


    // $ANTLR start "ruleImportElement"
    // InternalMyDsl.g:241:1: ruleImportElement returns [EObject current=null] : ( ( ( (lv_element_0_1= RULE_ID | lv_element_0_2= '*' | lv_element_0_3= RULE_STRING ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleImportElement() throws RecognitionException {
        EObject current = null;

        Token lv_element_0_1=null;
        Token lv_element_0_2=null;
        Token lv_element_0_3=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:247:2: ( ( ( ( (lv_element_0_1= RULE_ID | lv_element_0_2= '*' | lv_element_0_3= RULE_STRING ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ) )
            // InternalMyDsl.g:248:2: ( ( ( (lv_element_0_1= RULE_ID | lv_element_0_2= '*' | lv_element_0_3= RULE_STRING ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? )
            {
            // InternalMyDsl.g:248:2: ( ( ( (lv_element_0_1= RULE_ID | lv_element_0_2= '*' | lv_element_0_3= RULE_STRING ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? )
            // InternalMyDsl.g:249:3: ( ( (lv_element_0_1= RULE_ID | lv_element_0_2= '*' | lv_element_0_3= RULE_STRING ) ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )?
            {
            // InternalMyDsl.g:249:3: ( ( (lv_element_0_1= RULE_ID | lv_element_0_2= '*' | lv_element_0_3= RULE_STRING ) ) )
            // InternalMyDsl.g:250:4: ( (lv_element_0_1= RULE_ID | lv_element_0_2= '*' | lv_element_0_3= RULE_STRING ) )
            {
            // InternalMyDsl.g:250:4: ( (lv_element_0_1= RULE_ID | lv_element_0_2= '*' | lv_element_0_3= RULE_STRING ) )
            // InternalMyDsl.g:251:5: (lv_element_0_1= RULE_ID | lv_element_0_2= '*' | lv_element_0_3= RULE_STRING )
            {
            // InternalMyDsl.g:251:5: (lv_element_0_1= RULE_ID | lv_element_0_2= '*' | lv_element_0_3= RULE_STRING )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:252:6: lv_element_0_1= RULE_ID
                    {
                    lv_element_0_1=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_element_0_1, grammarAccess.getImportElementAccess().getElementIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"element",
                    							lv_element_0_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:267:6: lv_element_0_2= '*'
                    {
                    lv_element_0_2=(Token)match(input,18,FOLLOW_11); 

                    						newLeafNode(lv_element_0_2, grammarAccess.getImportElementAccess().getElementAsteriskKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportElementRule());
                    						}
                    						setWithLastConsumed(current, "element", lv_element_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:278:6: lv_element_0_3= RULE_STRING
                    {
                    lv_element_0_3=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_element_0_3, grammarAccess.getImportElementAccess().getElementSTRINGTerminalRuleCall_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"element",
                    							lv_element_0_3,
                    							"org.xtext.example.mydsl.MyDsl.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:295:3: (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:296:4: otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getImportElementAccess().getAsKeyword_1_0());
                    			
                    // InternalMyDsl.g:300:4: ( (lv_alias_2_0= RULE_ID ) )
                    // InternalMyDsl.g:301:5: (lv_alias_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:301:5: (lv_alias_2_0= RULE_ID )
                    // InternalMyDsl.g:302:6: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_alias_2_0, grammarAccess.getImportElementAccess().getAliasIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportElement"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:323:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:323:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:324:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:330:1: ruleStatement returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_ExpressionStatement_1= ruleExpressionStatement | this_IfStatement_2= ruleIfStatement | this_ForLoop_3= ruleForLoop | this_WhileLoop_4= ruleWhileLoop | this_DoWhileLoop_5= ruleDoWhileLoop | ruleContinueStatement | ruleBreakStatement | this_FunctionDeclaration_8= ruleFunctionDeclaration | this_FunctionCall_9= ruleFunctionCall | this_FunctionReturn_10= ruleFunctionReturn | this_ConsoleLogStatement_11= ruleConsoleLogStatement | this_TryCatchStatement_12= ruleTryCatchStatement | this_SwitchStatement_13= ruleSwitchStatement | this_StringManipulationStatement_14= ruleStringManipulationStatement | this_ThrowStatement_15= ruleThrowStatement | this_Import_16= ruleImport ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_ExpressionStatement_1 = null;

        EObject this_IfStatement_2 = null;

        EObject this_ForLoop_3 = null;

        EObject this_WhileLoop_4 = null;

        EObject this_DoWhileLoop_5 = null;

        EObject this_FunctionDeclaration_8 = null;

        EObject this_FunctionCall_9 = null;

        EObject this_FunctionReturn_10 = null;

        EObject this_ConsoleLogStatement_11 = null;

        EObject this_TryCatchStatement_12 = null;

        EObject this_SwitchStatement_13 = null;

        EObject this_StringManipulationStatement_14 = null;

        EObject this_ThrowStatement_15 = null;

        EObject this_Import_16 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:336:2: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_ExpressionStatement_1= ruleExpressionStatement | this_IfStatement_2= ruleIfStatement | this_ForLoop_3= ruleForLoop | this_WhileLoop_4= ruleWhileLoop | this_DoWhileLoop_5= ruleDoWhileLoop | ruleContinueStatement | ruleBreakStatement | this_FunctionDeclaration_8= ruleFunctionDeclaration | this_FunctionCall_9= ruleFunctionCall | this_FunctionReturn_10= ruleFunctionReturn | this_ConsoleLogStatement_11= ruleConsoleLogStatement | this_TryCatchStatement_12= ruleTryCatchStatement | this_SwitchStatement_13= ruleSwitchStatement | this_StringManipulationStatement_14= ruleStringManipulationStatement | this_ThrowStatement_15= ruleThrowStatement | this_Import_16= ruleImport ) )
            // InternalMyDsl.g:337:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ExpressionStatement_1= ruleExpressionStatement | this_IfStatement_2= ruleIfStatement | this_ForLoop_3= ruleForLoop | this_WhileLoop_4= ruleWhileLoop | this_DoWhileLoop_5= ruleDoWhileLoop | ruleContinueStatement | ruleBreakStatement | this_FunctionDeclaration_8= ruleFunctionDeclaration | this_FunctionCall_9= ruleFunctionCall | this_FunctionReturn_10= ruleFunctionReturn | this_ConsoleLogStatement_11= ruleConsoleLogStatement | this_TryCatchStatement_12= ruleTryCatchStatement | this_SwitchStatement_13= ruleSwitchStatement | this_StringManipulationStatement_14= ruleStringManipulationStatement | this_ThrowStatement_15= ruleThrowStatement | this_Import_16= ruleImport )
            {
            // InternalMyDsl.g:337:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ExpressionStatement_1= ruleExpressionStatement | this_IfStatement_2= ruleIfStatement | this_ForLoop_3= ruleForLoop | this_WhileLoop_4= ruleWhileLoop | this_DoWhileLoop_5= ruleDoWhileLoop | ruleContinueStatement | ruleBreakStatement | this_FunctionDeclaration_8= ruleFunctionDeclaration | this_FunctionCall_9= ruleFunctionCall | this_FunctionReturn_10= ruleFunctionReturn | this_ConsoleLogStatement_11= ruleConsoleLogStatement | this_TryCatchStatement_12= ruleTryCatchStatement | this_SwitchStatement_13= ruleSwitchStatement | this_StringManipulationStatement_14= ruleStringManipulationStatement | this_ThrowStatement_15= ruleThrowStatement | this_Import_16= ruleImport )
            int alt9=17;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:338:3: this_VariableDeclaration_0= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:347:3: this_ExpressionStatement_1= ruleExpressionStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getExpressionStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionStatement_1=ruleExpressionStatement();

                    state._fsp--;


                    			current = this_ExpressionStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:356:3: this_IfStatement_2= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_2=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:365:3: this_ForLoop_3= ruleForLoop
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getForLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForLoop_3=ruleForLoop();

                    state._fsp--;


                    			current = this_ForLoop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:374:3: this_WhileLoop_4= ruleWhileLoop
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileLoop_4=ruleWhileLoop();

                    state._fsp--;


                    			current = this_WhileLoop_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:383:3: this_DoWhileLoop_5= ruleDoWhileLoop
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDoWhileLoopParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoWhileLoop_5=ruleDoWhileLoop();

                    state._fsp--;


                    			current = this_DoWhileLoop_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:392:3: ruleContinueStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getContinueStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    ruleContinueStatement();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:400:3: ruleBreakStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    ruleBreakStatement();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:408:3: this_FunctionDeclaration_8= ruleFunctionDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFunctionDeclarationParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionDeclaration_8=ruleFunctionDeclaration();

                    state._fsp--;


                    			current = this_FunctionDeclaration_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:417:3: this_FunctionCall_9= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_9=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:426:3: this_FunctionReturn_10= ruleFunctionReturn
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFunctionReturnParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionReturn_10=ruleFunctionReturn();

                    state._fsp--;


                    			current = this_FunctionReturn_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:435:3: this_ConsoleLogStatement_11= ruleConsoleLogStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getConsoleLogStatementParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConsoleLogStatement_11=ruleConsoleLogStatement();

                    state._fsp--;


                    			current = this_ConsoleLogStatement_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:444:3: this_TryCatchStatement_12= ruleTryCatchStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTryCatchStatementParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_TryCatchStatement_12=ruleTryCatchStatement();

                    state._fsp--;


                    			current = this_TryCatchStatement_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:453:3: this_SwitchStatement_13= ruleSwitchStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_SwitchStatement_13=ruleSwitchStatement();

                    state._fsp--;


                    			current = this_SwitchStatement_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:462:3: this_StringManipulationStatement_14= ruleStringManipulationStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getStringManipulationStatementParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringManipulationStatement_14=ruleStringManipulationStatement();

                    state._fsp--;


                    			current = this_StringManipulationStatement_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalMyDsl.g:471:3: this_ThrowStatement_15= ruleThrowStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getThrowStatementParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_ThrowStatement_15=ruleThrowStatement();

                    state._fsp--;


                    			current = this_ThrowStatement_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalMyDsl.g:480:3: this_Import_16= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getImportParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_16=ruleImport();

                    state._fsp--;


                    			current = this_Import_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleBlock"
    // InternalMyDsl.g:492:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMyDsl.g:492:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMyDsl.g:493:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMyDsl.g:499:1: ruleBlock returns [EObject current=null] : (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:505:2: ( (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' ) )
            // InternalMyDsl.g:506:2: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
            {
            // InternalMyDsl.g:506:2: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}' )
            // InternalMyDsl.g:507:3: otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:511:3: ( (lv_statements_1_0= ruleStatement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_CHAR)||LA10_0==13||LA10_0==22||(LA10_0>=24 && LA10_0<=26)||(LA10_0>=28 && LA10_0<=30)||LA10_0==50||(LA10_0>=52 && LA10_0<=59)||LA10_0==61||(LA10_0>=65 && LA10_0<=77)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:512:4: (lv_statements_1_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:512:4: (lv_statements_1_0= ruleStatement )
            	    // InternalMyDsl.g:513:5: lv_statements_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMyDsl.g:538:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalMyDsl.g:538:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalMyDsl.g:539:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMyDsl.g:545:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:551:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )? otherlv_4= ';' ) )
            // InternalMyDsl.g:552:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )? otherlv_4= ';' )
            {
            // InternalMyDsl.g:552:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )? otherlv_4= ';' )
            // InternalMyDsl.g:553:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )? otherlv_4= ';'
            {
            // InternalMyDsl.g:553:3: ( (lv_type_0_0= ruleType ) )
            // InternalMyDsl.g:554:4: (lv_type_0_0= ruleType )
            {
            // InternalMyDsl.g:554:4: (lv_type_0_0= ruleType )
            // InternalMyDsl.g:555:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:572:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:573:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:573:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:574:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:590:3: (otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:591:4: otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalMyDsl.g:595:4: ( (lv_expr_3_0= ruleExpression ) )
                    // InternalMyDsl.g:596:5: (lv_expr_3_0= ruleExpression )
                    {
                    // InternalMyDsl.g:596:5: (lv_expr_3_0= ruleExpression )
                    // InternalMyDsl.g:597:6: lv_expr_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExprExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_expr_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_3_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleExpressionStatement"
    // InternalMyDsl.g:623:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalMyDsl.g:623:60: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalMyDsl.g:624:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
            {
             newCompositeNode(grammarAccess.getExpressionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionStatement=ruleExpressionStatement();

            state._fsp--;

             current =iv_ruleExpressionStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpressionStatement"


    // $ANTLR start "ruleExpressionStatement"
    // InternalMyDsl.g:630:1: ruleExpressionStatement returns [EObject current=null] : ( ( (lv_expr_0_0= ruleExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:636:2: ( ( ( (lv_expr_0_0= ruleExpression ) ) otherlv_1= ';' ) )
            // InternalMyDsl.g:637:2: ( ( (lv_expr_0_0= ruleExpression ) ) otherlv_1= ';' )
            {
            // InternalMyDsl.g:637:2: ( ( (lv_expr_0_0= ruleExpression ) ) otherlv_1= ';' )
            // InternalMyDsl.g:638:3: ( (lv_expr_0_0= ruleExpression ) ) otherlv_1= ';'
            {
            // InternalMyDsl.g:638:3: ( (lv_expr_0_0= ruleExpression ) )
            // InternalMyDsl.g:639:4: (lv_expr_0_0= ruleExpression )
            {
            // InternalMyDsl.g:639:4: (lv_expr_0_0= ruleExpression )
            // InternalMyDsl.g:640:5: lv_expr_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionStatementAccess().getExprExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_expr_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionStatementRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_0_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:665:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:665:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:666:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:672:1: ruleExpression returns [EObject current=null] : (this_LogicalExpression_0= ruleLogicalExpression | this_PostfixOperator_1= rulePostfixOperator | this_PrefixOperator_2= rulePrefixOperator | this_AugmentedAssignment_3= ruleAugmentedAssignment ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalExpression_0 = null;

        EObject this_PostfixOperator_1 = null;

        EObject this_PrefixOperator_2 = null;

        EObject this_AugmentedAssignment_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:678:2: ( (this_LogicalExpression_0= ruleLogicalExpression | this_PostfixOperator_1= rulePostfixOperator | this_PrefixOperator_2= rulePrefixOperator | this_AugmentedAssignment_3= ruleAugmentedAssignment ) )
            // InternalMyDsl.g:679:2: (this_LogicalExpression_0= ruleLogicalExpression | this_PostfixOperator_1= rulePostfixOperator | this_PrefixOperator_2= rulePrefixOperator | this_AugmentedAssignment_3= ruleAugmentedAssignment )
            {
            // InternalMyDsl.g:679:2: (this_LogicalExpression_0= ruleLogicalExpression | this_PostfixOperator_1= rulePostfixOperator | this_PrefixOperator_2= rulePrefixOperator | this_AugmentedAssignment_3= ruleAugmentedAssignment )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_NOT:
            case RULE_CHAR:
            case 22:
            case 26:
            case 28:
            case 29:
            case 30:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 24:
                case 25:
                    {
                    alt12=2;
                    }
                    break;
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    {
                    alt12=4;
                    }
                    break;
                case EOF:
                case 14:
                case 18:
                case 20:
                case 21:
                case 23:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 63:
                    {
                    alt12=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }

                }
                break;
            case 24:
            case 25:
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
                    // InternalMyDsl.g:680:3: this_LogicalExpression_0= ruleLogicalExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLogicalExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalExpression_0=ruleLogicalExpression();

                    state._fsp--;


                    			current = this_LogicalExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:689:3: this_PostfixOperator_1= rulePostfixOperator
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPostfixOperatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PostfixOperator_1=rulePostfixOperator();

                    state._fsp--;


                    			current = this_PostfixOperator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:698:3: this_PrefixOperator_2= rulePrefixOperator
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPrefixOperatorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrefixOperator_2=rulePrefixOperator();

                    state._fsp--;


                    			current = this_PrefixOperator_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:707:3: this_AugmentedAssignment_3= ruleAugmentedAssignment
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAugmentedAssignmentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AugmentedAssignment_3=ruleAugmentedAssignment();

                    state._fsp--;


                    			current = this_AugmentedAssignment_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAugmentedAssignment"
    // InternalMyDsl.g:719:1: entryRuleAugmentedAssignment returns [EObject current=null] : iv_ruleAugmentedAssignment= ruleAugmentedAssignment EOF ;
    public final EObject entryRuleAugmentedAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAugmentedAssignment = null;


        try {
            // InternalMyDsl.g:719:60: (iv_ruleAugmentedAssignment= ruleAugmentedAssignment EOF )
            // InternalMyDsl.g:720:2: iv_ruleAugmentedAssignment= ruleAugmentedAssignment EOF
            {
             newCompositeNode(grammarAccess.getAugmentedAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAugmentedAssignment=ruleAugmentedAssignment();

            state._fsp--;

             current =iv_ruleAugmentedAssignment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAugmentedAssignment"


    // $ANTLR start "ruleAugmentedAssignment"
    // InternalMyDsl.g:726:1: ruleAugmentedAssignment returns [EObject current=null] : (this_VariableReference_0= ruleVariableReference ruleAugmentedOperator ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAugmentedAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_VariableReference_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:732:2: ( (this_VariableReference_0= ruleVariableReference ruleAugmentedOperator ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:733:2: (this_VariableReference_0= ruleVariableReference ruleAugmentedOperator ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:733:2: (this_VariableReference_0= ruleVariableReference ruleAugmentedOperator ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalMyDsl.g:734:3: this_VariableReference_0= ruleVariableReference ruleAugmentedOperator ( (lv_expr_2_0= ruleExpression ) )
            {

            			newCompositeNode(grammarAccess.getAugmentedAssignmentAccess().getVariableReferenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_VariableReference_0=ruleVariableReference();

            state._fsp--;


            			current = this_VariableReference_0;
            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getAugmentedAssignmentAccess().getAugmentedOperatorParserRuleCall_1());
            		
            pushFollow(FOLLOW_15);
            ruleAugmentedOperator();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:749:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalMyDsl.g:750:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalMyDsl.g:750:4: (lv_expr_2_0= ruleExpression )
            // InternalMyDsl.g:751:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAugmentedAssignmentAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAugmentedAssignmentRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAugmentedAssignment"


    // $ANTLR start "entryRuleLogicalExpression"
    // InternalMyDsl.g:772:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // InternalMyDsl.g:772:58: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // InternalMyDsl.g:773:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalExpression=ruleLogicalExpression();

            state._fsp--;

             current =iv_ruleLogicalExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogicalExpression"


    // $ANTLR start "ruleLogicalExpression"
    // InternalMyDsl.g:779:1: ruleLogicalExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( ( () ruleLogicalOperator ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:785:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( ( () ruleLogicalOperator ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalMyDsl.g:786:2: (this_ComparisonExpression_0= ruleComparisonExpression ( ( () ruleLogicalOperator ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalMyDsl.g:786:2: (this_ComparisonExpression_0= ruleComparisonExpression ( ( () ruleLogicalOperator ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalMyDsl.g:787:3: this_ComparisonExpression_0= ruleComparisonExpression ( ( () ruleLogicalOperator ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalExpressionAccess().getComparisonExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;


            			current = this_ComparisonExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:795:3: ( ( () ruleLogicalOperator ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=37 && LA13_0<=38)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:796:4: ( () ruleLogicalOperator ) ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalMyDsl.g:796:4: ( () ruleLogicalOperator )
            	    // InternalMyDsl.g:797:5: () ruleLogicalOperator
            	    {
            	    // InternalMyDsl.g:797:5: ()
            	    // InternalMyDsl.g:798:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getLogicalExpressionAccess().getLogicalExpressionLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }


            	    					newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLogicalOperatorParserRuleCall_1_0_1());
            	    				
            	    pushFollow(FOLLOW_19);
            	    ruleLogicalOperator();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }

            	    // InternalMyDsl.g:812:4: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalMyDsl.g:813:5: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalMyDsl.g:813:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalMyDsl.g:814:6: lv_right_3_0= ruleComparisonExpression
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRightComparisonExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.ComparisonExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalMyDsl.g:836:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalMyDsl.g:836:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalMyDsl.g:837:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalMyDsl.g:843:1: ruleComparisonExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ruleComparisonOperator ( (lv_right_3_0= ruleArithmeticExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:849:2: ( (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ruleComparisonOperator ( (lv_right_3_0= ruleArithmeticExpression ) ) )* ) )
            // InternalMyDsl.g:850:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ruleComparisonOperator ( (lv_right_3_0= ruleArithmeticExpression ) ) )* )
            {
            // InternalMyDsl.g:850:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ruleComparisonOperator ( (lv_right_3_0= ruleArithmeticExpression ) ) )* )
            // InternalMyDsl.g:851:3: this_ArithmeticExpression_0= ruleArithmeticExpression ( () ruleComparisonOperator ( (lv_right_3_0= ruleArithmeticExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getArithmeticExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;


            			current = this_ArithmeticExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:859:3: ( () ruleComparisonOperator ( (lv_right_3_0= ruleArithmeticExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20||(LA14_0>=31 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:860:4: () ruleComparisonOperator ( (lv_right_3_0= ruleArithmeticExpression ) )
            	    {
            	    // InternalMyDsl.g:860:4: ()
            	    // InternalMyDsl.g:861:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getComparisonExpressionAccess().getComparisonOperatorParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_19);
            	    ruleComparisonOperator();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalMyDsl.g:874:4: ( (lv_right_3_0= ruleArithmeticExpression ) )
            	    // InternalMyDsl.g:875:5: (lv_right_3_0= ruleArithmeticExpression )
            	    {
            	    // InternalMyDsl.g:875:5: (lv_right_3_0= ruleArithmeticExpression )
            	    // InternalMyDsl.g:876:6: lv_right_3_0= ruleArithmeticExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightArithmeticExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleArithmeticExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.ArithmeticExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalMyDsl.g:898:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalMyDsl.g:898:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalMyDsl.g:899:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
             newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;

             current =iv_ruleArithmeticExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalMyDsl.g:905:1: ruleArithmeticExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ruleArithmeticOperator ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:911:2: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ruleArithmeticOperator ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* ) )
            // InternalMyDsl.g:912:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ruleArithmeticOperator ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // InternalMyDsl.g:912:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ruleArithmeticOperator ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* )
            // InternalMyDsl.g:913:3: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ruleArithmeticOperator ( (lv_right_3_0= ruleMultiplicationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getMultiplicationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;


            			current = this_MultiplicationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:921:3: ( () ruleArithmeticOperator ( (lv_right_3_0= ruleMultiplicationExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=41 && LA15_0<=42)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:922:4: () ruleArithmeticOperator ( (lv_right_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // InternalMyDsl.g:922:4: ()
            	    // InternalMyDsl.g:923:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getArithmeticExpressionAccess().getArithmeticExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getArithmeticOperatorParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_19);
            	    ruleArithmeticOperator();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalMyDsl.g:936:4: ( (lv_right_3_0= ruleMultiplicationExpression ) )
            	    // InternalMyDsl.g:937:5: (lv_right_3_0= ruleMultiplicationExpression )
            	    {
            	    // InternalMyDsl.g:937:5: (lv_right_3_0= ruleMultiplicationExpression )
            	    // InternalMyDsl.g:938:6: lv_right_3_0= ruleMultiplicationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getRightMultiplicationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleMultiplicationExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.MultiplicationExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // InternalMyDsl.g:960:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // InternalMyDsl.g:960:65: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // InternalMyDsl.g:961:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;

             current =iv_ruleMultiplicationExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // InternalMyDsl.g:967:1: ruleMultiplicationExpression returns [EObject current=null] : (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ruleMultiplicationOperator ( (lv_right_3_0= ruleExponentiationExpression ) ) )* ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentiationExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:973:2: ( (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ruleMultiplicationOperator ( (lv_right_3_0= ruleExponentiationExpression ) ) )* ) )
            // InternalMyDsl.g:974:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ruleMultiplicationOperator ( (lv_right_3_0= ruleExponentiationExpression ) ) )* )
            {
            // InternalMyDsl.g:974:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( () ruleMultiplicationOperator ( (lv_right_3_0= ruleExponentiationExpression ) ) )* )
            // InternalMyDsl.g:975:3: this_ExponentiationExpression_0= ruleExponentiationExpression ( () ruleMultiplicationOperator ( (lv_right_3_0= ruleExponentiationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getExponentiationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_ExponentiationExpression_0=ruleExponentiationExpression();

            state._fsp--;


            			current = this_ExponentiationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:983:3: ( () ruleMultiplicationOperator ( (lv_right_3_0= ruleExponentiationExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18||(LA16_0>=39 && LA16_0<=40)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:984:4: () ruleMultiplicationOperator ( (lv_right_3_0= ruleExponentiationExpression ) )
            	    {
            	    // InternalMyDsl.g:984:4: ()
            	    // InternalMyDsl.g:985:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getMultiplicationOperatorParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_19);
            	    ruleMultiplicationOperator();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalMyDsl.g:998:4: ( (lv_right_3_0= ruleExponentiationExpression ) )
            	    // InternalMyDsl.g:999:5: (lv_right_3_0= ruleExponentiationExpression )
            	    {
            	    // InternalMyDsl.g:999:5: (lv_right_3_0= ruleExponentiationExpression )
            	    // InternalMyDsl.g:1000:6: lv_right_3_0= ruleExponentiationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExponentiationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleExponentiationExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.ExponentiationExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleExponentiationExpression"
    // InternalMyDsl.g:1022:1: entryRuleExponentiationExpression returns [EObject current=null] : iv_ruleExponentiationExpression= ruleExponentiationExpression EOF ;
    public final EObject entryRuleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentiationExpression = null;


        try {
            // InternalMyDsl.g:1022:65: (iv_ruleExponentiationExpression= ruleExponentiationExpression EOF )
            // InternalMyDsl.g:1023:2: iv_ruleExponentiationExpression= ruleExponentiationExpression EOF
            {
             newCompositeNode(grammarAccess.getExponentiationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponentiationExpression=ruleExponentiationExpression();

            state._fsp--;

             current =iv_ruleExponentiationExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExponentiationExpression"


    // $ANTLR start "ruleExponentiationExpression"
    // InternalMyDsl.g:1029:1: ruleExponentiationExpression returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ruleExponentiationOperator ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleExponentiationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1035:2: ( (this_Primary_0= rulePrimary ( () ruleExponentiationOperator ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalMyDsl.g:1036:2: (this_Primary_0= rulePrimary ( () ruleExponentiationOperator ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalMyDsl.g:1036:2: (this_Primary_0= rulePrimary ( () ruleExponentiationOperator ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalMyDsl.g:1037:3: this_Primary_0= rulePrimary ( () ruleExponentiationOperator ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1045:3: ( () ruleExponentiationOperator ( (lv_right_3_0= rulePrimary ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==43) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1046:4: () ruleExponentiationOperator ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMyDsl.g:1046:4: ()
            	    // InternalMyDsl.g:1047:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExponentiationExpressionAccess().getExponentiationExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getExponentiationOperatorParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_19);
            	    ruleExponentiationOperator();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalMyDsl.g:1060:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMyDsl.g:1061:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMyDsl.g:1061:5: (lv_right_3_0= rulePrimary )
            	    // InternalMyDsl.g:1062:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExponentiationExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExponentiationExpression"


    // $ANTLR start "entryRulePrimary"
    // InternalMyDsl.g:1084:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMyDsl.g:1084:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMyDsl.g:1085:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMyDsl.g:1091:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_NumberLiteral_3= ruleNumberLiteral | this_StringLiteral_4= ruleStringLiteral | this_CharLiteral_5= ruleCharLiteral | this_VariableReference_6= ruleVariableReference | this_AnonymousFunction_7= ruleAnonymousFunction | this_Boolean_8= ruleBoolean | this_NotBoolean_9= ruleNotBoolean ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_NumberLiteral_3 = null;

        EObject this_StringLiteral_4 = null;

        EObject this_CharLiteral_5 = null;

        EObject this_VariableReference_6 = null;

        EObject this_AnonymousFunction_7 = null;

        EObject this_Boolean_8 = null;

        EObject this_NotBoolean_9 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1097:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_NumberLiteral_3= ruleNumberLiteral | this_StringLiteral_4= ruleStringLiteral | this_CharLiteral_5= ruleCharLiteral | this_VariableReference_6= ruleVariableReference | this_AnonymousFunction_7= ruleAnonymousFunction | this_Boolean_8= ruleBoolean | this_NotBoolean_9= ruleNotBoolean ) )
            // InternalMyDsl.g:1098:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_NumberLiteral_3= ruleNumberLiteral | this_StringLiteral_4= ruleStringLiteral | this_CharLiteral_5= ruleCharLiteral | this_VariableReference_6= ruleVariableReference | this_AnonymousFunction_7= ruleAnonymousFunction | this_Boolean_8= ruleBoolean | this_NotBoolean_9= ruleNotBoolean )
            {
            // InternalMyDsl.g:1098:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_NumberLiteral_3= ruleNumberLiteral | this_StringLiteral_4= ruleStringLiteral | this_CharLiteral_5= ruleCharLiteral | this_VariableReference_6= ruleVariableReference | this_AnonymousFunction_7= ruleAnonymousFunction | this_Boolean_8= ruleBoolean | this_NotBoolean_9= ruleNotBoolean )
            int alt18=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
                {
                alt18=2;
                }
                break;
            case RULE_STRING:
                {
                alt18=3;
                }
                break;
            case RULE_CHAR:
                {
                alt18=4;
                }
                break;
            case RULE_ID:
                {
                alt18=5;
                }
                break;
            case 26:
                {
                alt18=6;
                }
                break;
            case 28:
            case 29:
            case 30:
                {
                alt18=7;
                }
                break;
            case RULE_NOT:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1099:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalMyDsl.g:1099:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalMyDsl.g:1100:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_24);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1118:3: this_NumberLiteral_3= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_3=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1127:3: this_StringLiteral_4= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_4=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1136:3: this_CharLiteral_5= ruleCharLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getCharLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharLiteral_5=ruleCharLiteral();

                    state._fsp--;


                    			current = this_CharLiteral_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1145:3: this_VariableReference_6= ruleVariableReference
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableReferenceParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableReference_6=ruleVariableReference();

                    state._fsp--;


                    			current = this_VariableReference_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1154:3: this_AnonymousFunction_7= ruleAnonymousFunction
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAnonymousFunctionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnonymousFunction_7=ruleAnonymousFunction();

                    state._fsp--;


                    			current = this_AnonymousFunction_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1163:3: this_Boolean_8= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getBooleanParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_8=ruleBoolean();

                    state._fsp--;


                    			current = this_Boolean_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1172:3: this_NotBoolean_9= ruleNotBoolean
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNotBooleanParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotBoolean_9=ruleNotBoolean();

                    state._fsp--;


                    			current = this_NotBoolean_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRulePostfixOperator"
    // InternalMyDsl.g:1184:1: entryRulePostfixOperator returns [EObject current=null] : iv_rulePostfixOperator= rulePostfixOperator EOF ;
    public final EObject entryRulePostfixOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixOperator = null;


        try {
            // InternalMyDsl.g:1184:56: (iv_rulePostfixOperator= rulePostfixOperator EOF )
            // InternalMyDsl.g:1185:2: iv_rulePostfixOperator= rulePostfixOperator EOF
            {
             newCompositeNode(grammarAccess.getPostfixOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePostfixOperator=rulePostfixOperator();

            state._fsp--;

             current =iv_rulePostfixOperator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePostfixOperator"


    // $ANTLR start "rulePostfixOperator"
    // InternalMyDsl.g:1191:1: rulePostfixOperator returns [EObject current=null] : (this_VariableReference_0= ruleVariableReference (otherlv_1= '++' | otherlv_2= '--' ) ) ;
    public final EObject rulePostfixOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_VariableReference_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1197:2: ( (this_VariableReference_0= ruleVariableReference (otherlv_1= '++' | otherlv_2= '--' ) ) )
            // InternalMyDsl.g:1198:2: (this_VariableReference_0= ruleVariableReference (otherlv_1= '++' | otherlv_2= '--' ) )
            {
            // InternalMyDsl.g:1198:2: (this_VariableReference_0= ruleVariableReference (otherlv_1= '++' | otherlv_2= '--' ) )
            // InternalMyDsl.g:1199:3: this_VariableReference_0= ruleVariableReference (otherlv_1= '++' | otherlv_2= '--' )
            {

            			newCompositeNode(grammarAccess.getPostfixOperatorAccess().getVariableReferenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_VariableReference_0=ruleVariableReference();

            state._fsp--;


            			current = this_VariableReference_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1207:3: (otherlv_1= '++' | otherlv_2= '--' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            else if ( (LA19_0==25) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1208:4: otherlv_1= '++'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPostfixOperatorAccess().getPlusSignPlusSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1213:4: otherlv_2= '--'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPostfixOperatorAccess().getHyphenMinusHyphenMinusKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostfixOperator"


    // $ANTLR start "entryRulePrefixOperator"
    // InternalMyDsl.g:1222:1: entryRulePrefixOperator returns [EObject current=null] : iv_rulePrefixOperator= rulePrefixOperator EOF ;
    public final EObject entryRulePrefixOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixOperator = null;


        try {
            // InternalMyDsl.g:1222:55: (iv_rulePrefixOperator= rulePrefixOperator EOF )
            // InternalMyDsl.g:1223:2: iv_rulePrefixOperator= rulePrefixOperator EOF
            {
             newCompositeNode(grammarAccess.getPrefixOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefixOperator=rulePrefixOperator();

            state._fsp--;

             current =iv_rulePrefixOperator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrefixOperator"


    // $ANTLR start "rulePrefixOperator"
    // InternalMyDsl.g:1229:1: rulePrefixOperator returns [EObject current=null] : ( (otherlv_0= '++' | otherlv_1= '--' ) this_VariableReference_2= ruleVariableReference ) ;
    public final EObject rulePrefixOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_VariableReference_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1235:2: ( ( (otherlv_0= '++' | otherlv_1= '--' ) this_VariableReference_2= ruleVariableReference ) )
            // InternalMyDsl.g:1236:2: ( (otherlv_0= '++' | otherlv_1= '--' ) this_VariableReference_2= ruleVariableReference )
            {
            // InternalMyDsl.g:1236:2: ( (otherlv_0= '++' | otherlv_1= '--' ) this_VariableReference_2= ruleVariableReference )
            // InternalMyDsl.g:1237:3: (otherlv_0= '++' | otherlv_1= '--' ) this_VariableReference_2= ruleVariableReference
            {
            // InternalMyDsl.g:1237:3: (otherlv_0= '++' | otherlv_1= '--' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            else if ( (LA20_0==25) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1238:4: otherlv_0= '++'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrefixOperatorAccess().getPlusSignPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1243:4: otherlv_1= '--'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrefixOperatorAccess().getHyphenMinusHyphenMinusKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getPrefixOperatorAccess().getVariableReferenceParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_VariableReference_2=ruleVariableReference();

            state._fsp--;


            			current = this_VariableReference_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixOperator"


    // $ANTLR start "entryRuleAnonymousFunction"
    // InternalMyDsl.g:1260:1: entryRuleAnonymousFunction returns [EObject current=null] : iv_ruleAnonymousFunction= ruleAnonymousFunction EOF ;
    public final EObject entryRuleAnonymousFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousFunction = null;


        try {
            // InternalMyDsl.g:1260:58: (iv_ruleAnonymousFunction= ruleAnonymousFunction EOF )
            // InternalMyDsl.g:1261:2: iv_ruleAnonymousFunction= ruleAnonymousFunction EOF
            {
             newCompositeNode(grammarAccess.getAnonymousFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnonymousFunction=ruleAnonymousFunction();

            state._fsp--;

             current =iv_ruleAnonymousFunction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnonymousFunction"


    // $ANTLR start "ruleAnonymousFunction"
    // InternalMyDsl.g:1267:1: ruleAnonymousFunction returns [EObject current=null] : (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBlock ) ) ) ;
    public final EObject ruleAnonymousFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_parameters_2_0=null;
        Token otherlv_3=null;
        Token lv_parameters_4_0=null;
        Token otherlv_5=null;
        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1273:2: ( (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBlock ) ) ) )
            // InternalMyDsl.g:1274:2: (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBlock ) ) )
            {
            // InternalMyDsl.g:1274:2: (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBlock ) ) )
            // InternalMyDsl.g:1275:3: otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAnonymousFunctionAccess().getFunctionKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getAnonymousFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1283:3: ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1284:4: ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    {
                    // InternalMyDsl.g:1284:4: ( (lv_parameters_2_0= RULE_ID ) )
                    // InternalMyDsl.g:1285:5: (lv_parameters_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1285:5: (lv_parameters_2_0= RULE_ID )
                    // InternalMyDsl.g:1286:6: lv_parameters_2_0= RULE_ID
                    {
                    lv_parameters_2_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(lv_parameters_2_0, grammarAccess.getAnonymousFunctionAccess().getParametersIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnonymousFunctionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMyDsl.g:1302:4: (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMyDsl.g:1303:5: otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAnonymousFunctionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMyDsl.g:1307:5: ( (lv_parameters_4_0= RULE_ID ) )
                    	    // InternalMyDsl.g:1308:6: (lv_parameters_4_0= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1308:6: (lv_parameters_4_0= RULE_ID )
                    	    // InternalMyDsl.g:1309:7: lv_parameters_4_0= RULE_ID
                    	    {
                    	    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    	    							newLeafNode(lv_parameters_4_0, grammarAccess.getAnonymousFunctionAccess().getParametersIDTerminalRuleCall_2_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAnonymousFunctionRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_4_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getAnonymousFunctionAccess().getRightParenthesisKeyword_3());
            		
            // InternalMyDsl.g:1331:3: ( (lv_body_6_0= ruleBlock ) )
            // InternalMyDsl.g:1332:4: (lv_body_6_0= ruleBlock )
            {
            // InternalMyDsl.g:1332:4: (lv_body_6_0= ruleBlock )
            // InternalMyDsl.g:1333:5: lv_body_6_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getAnonymousFunctionAccess().getBodyBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_6_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnonymousFunctionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"org.xtext.example.mydsl.MyDsl.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnonymousFunction"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMyDsl.g:1354:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalMyDsl.g:1354:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMyDsl.g:1355:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMyDsl.g:1361:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1367:2: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // InternalMyDsl.g:1368:2: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // InternalMyDsl.g:1368:2: ( (lv_value_0_0= ruleNUMBER ) )
            // InternalMyDsl.g:1369:3: (lv_value_0_0= ruleNUMBER )
            {
            // InternalMyDsl.g:1369:3: (lv_value_0_0= ruleNUMBER )
            // InternalMyDsl.g:1370:4: lv_value_0_0= ruleNUMBER
            {

            				newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNUMBER();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl.MyDsl.NUMBER");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNUMBER"
    // InternalMyDsl.g:1390:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalMyDsl.g:1390:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalMyDsl.g:1391:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalMyDsl.g:1397:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1403:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalMyDsl.g:1404:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalMyDsl.g:1404:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalMyDsl.g:1405:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
            		
            // InternalMyDsl.g:1412:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1413:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,27,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleBoolean"
    // InternalMyDsl.g:1430:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalMyDsl.g:1430:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalMyDsl.g:1431:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalMyDsl.g:1437:1: ruleBoolean returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' | lv_value_1_3= 'null' ) ) ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token lv_value_1_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1443:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' | lv_value_1_3= 'null' ) ) ) ) )
            // InternalMyDsl.g:1444:2: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' | lv_value_1_3= 'null' ) ) ) )
            {
            // InternalMyDsl.g:1444:2: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' | lv_value_1_3= 'null' ) ) ) )
            // InternalMyDsl.g:1445:3: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' | lv_value_1_3= 'null' ) ) )
            {
            // InternalMyDsl.g:1445:3: ()
            // InternalMyDsl.g:1446:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAccess().getBooleanAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1452:3: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' | lv_value_1_3= 'null' ) ) )
            // InternalMyDsl.g:1453:4: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' | lv_value_1_3= 'null' ) )
            {
            // InternalMyDsl.g:1453:4: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' | lv_value_1_3= 'null' ) )
            // InternalMyDsl.g:1454:5: (lv_value_1_1= 'true' | lv_value_1_2= 'false' | lv_value_1_3= 'null' )
            {
            // InternalMyDsl.g:1454:5: (lv_value_1_1= 'true' | lv_value_1_2= 'false' | lv_value_1_3= 'null' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt24=1;
                }
                break;
            case 29:
                {
                alt24=2;
                }
                break;
            case 30:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1455:6: lv_value_1_1= 'true'
                    {
                    lv_value_1_1=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_value_1_1, grammarAccess.getBooleanAccess().getValueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1466:6: lv_value_1_2= 'false'
                    {
                    lv_value_1_2=(Token)match(input,29,FOLLOW_2); 

                    						newLeafNode(lv_value_1_2, grammarAccess.getBooleanAccess().getValueFalseKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1477:6: lv_value_1_3= 'null'
                    {
                    lv_value_1_3=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_value_1_3, grammarAccess.getBooleanAccess().getValueNullKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_3, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleNotBoolean"
    // InternalMyDsl.g:1494:1: entryRuleNotBoolean returns [EObject current=null] : iv_ruleNotBoolean= ruleNotBoolean EOF ;
    public final EObject entryRuleNotBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotBoolean = null;


        try {
            // InternalMyDsl.g:1494:51: (iv_ruleNotBoolean= ruleNotBoolean EOF )
            // InternalMyDsl.g:1495:2: iv_ruleNotBoolean= ruleNotBoolean EOF
            {
             newCompositeNode(grammarAccess.getNotBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotBoolean=ruleNotBoolean();

            state._fsp--;

             current =iv_ruleNotBoolean; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNotBoolean"


    // $ANTLR start "ruleNotBoolean"
    // InternalMyDsl.g:1501:1: ruleNotBoolean returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NOT ) ) ) ;
    public final EObject ruleNotBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1507:2: ( ( () ( (lv_value_1_0= RULE_NOT ) ) ) )
            // InternalMyDsl.g:1508:2: ( () ( (lv_value_1_0= RULE_NOT ) ) )
            {
            // InternalMyDsl.g:1508:2: ( () ( (lv_value_1_0= RULE_NOT ) ) )
            // InternalMyDsl.g:1509:3: () ( (lv_value_1_0= RULE_NOT ) )
            {
            // InternalMyDsl.g:1509:3: ()
            // InternalMyDsl.g:1510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNotBooleanAccess().getNotBooleanAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1516:3: ( (lv_value_1_0= RULE_NOT ) )
            // InternalMyDsl.g:1517:4: (lv_value_1_0= RULE_NOT )
            {
            // InternalMyDsl.g:1517:4: (lv_value_1_0= RULE_NOT )
            // InternalMyDsl.g:1518:5: lv_value_1_0= RULE_NOT
            {
            lv_value_1_0=(Token)match(input,RULE_NOT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNotBooleanAccess().getValueNOTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotBooleanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyDsl.NOT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotBoolean"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMyDsl.g:1538:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMyDsl.g:1538:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMyDsl.g:1539:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMyDsl.g:1545:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1551:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1552:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1552:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:1553:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:1553:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:1554:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl.MyDsl.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleCharLiteral"
    // InternalMyDsl.g:1573:1: entryRuleCharLiteral returns [EObject current=null] : iv_ruleCharLiteral= ruleCharLiteral EOF ;
    public final EObject entryRuleCharLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLiteral = null;


        try {
            // InternalMyDsl.g:1573:52: (iv_ruleCharLiteral= ruleCharLiteral EOF )
            // InternalMyDsl.g:1574:2: iv_ruleCharLiteral= ruleCharLiteral EOF
            {
             newCompositeNode(grammarAccess.getCharLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharLiteral=ruleCharLiteral();

            state._fsp--;

             current =iv_ruleCharLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharLiteral"


    // $ANTLR start "ruleCharLiteral"
    // InternalMyDsl.g:1580:1: ruleCharLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_CHAR ) ) ;
    public final EObject ruleCharLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1586:2: ( ( (lv_value_0_0= RULE_CHAR ) ) )
            // InternalMyDsl.g:1587:2: ( (lv_value_0_0= RULE_CHAR ) )
            {
            // InternalMyDsl.g:1587:2: ( (lv_value_0_0= RULE_CHAR ) )
            // InternalMyDsl.g:1588:3: (lv_value_0_0= RULE_CHAR )
            {
            // InternalMyDsl.g:1588:3: (lv_value_0_0= RULE_CHAR )
            // InternalMyDsl.g:1589:4: lv_value_0_0= RULE_CHAR
            {
            lv_value_0_0=(Token)match(input,RULE_CHAR,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getCharLiteralAccess().getValueCHARTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCharLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl.MyDsl.CHAR");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // InternalMyDsl.g:1608:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalMyDsl.g:1608:58: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalMyDsl.g:1609:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalMyDsl.g:1615:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1621:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMyDsl.g:1622:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1622:2: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:1623:3: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:1623:3: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:1624:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getNameVariableDeclarationCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleComparisonOperator"
    // InternalMyDsl.g:1638:1: entryRuleComparisonOperator returns [String current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final String entryRuleComparisonOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparisonOperator = null;


        try {
            // InternalMyDsl.g:1638:58: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // InternalMyDsl.g:1639:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonOperator=ruleComparisonOperator();

            state._fsp--;

             current =iv_ruleComparisonOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalMyDsl.g:1645:1: ruleComparisonOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<=' | kw= '<' | kw= '>=' | kw= '>' | kw= '!=' | kw= '==' | kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleComparisonOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1651:2: ( (kw= '<=' | kw= '<' | kw= '>=' | kw= '>' | kw= '!=' | kw= '==' | kw= '=' ) )
            // InternalMyDsl.g:1652:2: (kw= '<=' | kw= '<' | kw= '>=' | kw= '>' | kw= '!=' | kw= '==' | kw= '=' )
            {
            // InternalMyDsl.g:1652:2: (kw= '<=' | kw= '<' | kw= '>=' | kw= '>' | kw= '!=' | kw= '==' | kw= '=' )
            int alt25=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt25=1;
                }
                break;
            case 32:
                {
                alt25=2;
                }
                break;
            case 33:
                {
                alt25=3;
                }
                break;
            case 34:
                {
                alt25=4;
                }
                break;
            case 35:
                {
                alt25=5;
                }
                break;
            case 36:
                {
                alt25=6;
                }
                break;
            case 20:
                {
                alt25=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1653:3: kw= '<='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1659:3: kw= '<'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1665:3: kw= '>='
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1671:3: kw= '>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1677:3: kw= '!='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1683:3: kw= '=='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1689:3: kw= '='
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualsSignKeyword_6());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "entryRuleLogicalOperator"
    // InternalMyDsl.g:1698:1: entryRuleLogicalOperator returns [String current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final String entryRuleLogicalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalOperator = null;


        try {
            // InternalMyDsl.g:1698:55: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalMyDsl.g:1699:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
            {
             newCompositeNode(grammarAccess.getLogicalOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOperator=ruleLogicalOperator();

            state._fsp--;

             current =iv_ruleLogicalOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogicalOperator"


    // $ANTLR start "ruleLogicalOperator"
    // InternalMyDsl.g:1705:1: ruleLogicalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= '||' ) ;
    public final AntlrDatatypeRuleToken ruleLogicalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1711:2: ( (kw= '&&' | kw= '||' ) )
            // InternalMyDsl.g:1712:2: (kw= '&&' | kw= '||' )
            {
            // InternalMyDsl.g:1712:2: (kw= '&&' | kw= '||' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            else if ( (LA26_0==38) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1713:3: kw= '&&'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getAmpersandAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1719:3: kw= '||'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getVerticalLineVerticalLineKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "entryRuleMultiplicationOperator"
    // InternalMyDsl.g:1728:1: entryRuleMultiplicationOperator returns [String current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final String entryRuleMultiplicationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicationOperator = null;


        try {
            // InternalMyDsl.g:1728:62: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // InternalMyDsl.g:1729:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;

             current =iv_ruleMultiplicationOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplicationOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // InternalMyDsl.g:1735:1: ruleMultiplicationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1741:2: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // InternalMyDsl.g:1742:2: (kw= '*' | kw= '/' | kw= '%' )
            {
            // InternalMyDsl.g:1742:2: (kw= '*' | kw= '/' | kw= '%' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt27=1;
                }
                break;
            case 39:
                {
                alt27=2;
                }
                break;
            case 40:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1743:3: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicationOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1749:3: kw= '/'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicationOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1755:3: kw= '%'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicationOperatorAccess().getPercentSignKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "entryRuleArithmeticOperator"
    // InternalMyDsl.g:1764:1: entryRuleArithmeticOperator returns [String current=null] : iv_ruleArithmeticOperator= ruleArithmeticOperator EOF ;
    public final String entryRuleArithmeticOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArithmeticOperator = null;


        try {
            // InternalMyDsl.g:1764:58: (iv_ruleArithmeticOperator= ruleArithmeticOperator EOF )
            // InternalMyDsl.g:1765:2: iv_ruleArithmeticOperator= ruleArithmeticOperator EOF
            {
             newCompositeNode(grammarAccess.getArithmeticOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticOperator=ruleArithmeticOperator();

            state._fsp--;

             current =iv_ruleArithmeticOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArithmeticOperator"


    // $ANTLR start "ruleArithmeticOperator"
    // InternalMyDsl.g:1771:1: ruleArithmeticOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleArithmeticOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1777:2: ( (kw= '+' | kw= '-' ) )
            // InternalMyDsl.g:1778:2: (kw= '+' | kw= '-' )
            {
            // InternalMyDsl.g:1778:2: (kw= '+' | kw= '-' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            else if ( (LA28_0==42) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1779:3: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArithmeticOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1785:3: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArithmeticOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticOperator"


    // $ANTLR start "entryRuleExponentiationOperator"
    // InternalMyDsl.g:1794:1: entryRuleExponentiationOperator returns [String current=null] : iv_ruleExponentiationOperator= ruleExponentiationOperator EOF ;
    public final String entryRuleExponentiationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponentiationOperator = null;


        try {
            // InternalMyDsl.g:1794:62: (iv_ruleExponentiationOperator= ruleExponentiationOperator EOF )
            // InternalMyDsl.g:1795:2: iv_ruleExponentiationOperator= ruleExponentiationOperator EOF
            {
             newCompositeNode(grammarAccess.getExponentiationOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponentiationOperator=ruleExponentiationOperator();

            state._fsp--;

             current =iv_ruleExponentiationOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExponentiationOperator"


    // $ANTLR start "ruleExponentiationOperator"
    // InternalMyDsl.g:1801:1: ruleExponentiationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '**' ;
    public final AntlrDatatypeRuleToken ruleExponentiationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1807:2: (kw= '**' )
            // InternalMyDsl.g:1808:2: kw= '**'
            {
            kw=(Token)match(input,43,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getExponentiationOperatorAccess().getAsteriskAsteriskKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExponentiationOperator"


    // $ANTLR start "entryRuleAugmentedOperator"
    // InternalMyDsl.g:1816:1: entryRuleAugmentedOperator returns [String current=null] : iv_ruleAugmentedOperator= ruleAugmentedOperator EOF ;
    public final String entryRuleAugmentedOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAugmentedOperator = null;


        try {
            // InternalMyDsl.g:1816:57: (iv_ruleAugmentedOperator= ruleAugmentedOperator EOF )
            // InternalMyDsl.g:1817:2: iv_ruleAugmentedOperator= ruleAugmentedOperator EOF
            {
             newCompositeNode(grammarAccess.getAugmentedOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAugmentedOperator=ruleAugmentedOperator();

            state._fsp--;

             current =iv_ruleAugmentedOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAugmentedOperator"


    // $ANTLR start "ruleAugmentedOperator"
    // InternalMyDsl.g:1823:1: ruleAugmentedOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '**=' ) ;
    public final AntlrDatatypeRuleToken ruleAugmentedOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1829:2: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '**=' ) )
            // InternalMyDsl.g:1830:2: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '**=' )
            {
            // InternalMyDsl.g:1830:2: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '**=' )
            int alt29=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt29=1;
                }
                break;
            case 45:
                {
                alt29=2;
                }
                break;
            case 46:
                {
                alt29=3;
                }
                break;
            case 47:
                {
                alt29=4;
                }
                break;
            case 48:
                {
                alt29=5;
                }
                break;
            case 49:
                {
                alt29=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1831:3: kw= '+='
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAugmentedOperatorAccess().getPlusSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1837:3: kw= '-='
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAugmentedOperatorAccess().getHyphenMinusEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1843:3: kw= '*='
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAugmentedOperatorAccess().getAsteriskEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1849:3: kw= '/='
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAugmentedOperatorAccess().getSolidusEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1855:3: kw= '%='
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAugmentedOperatorAccess().getPercentSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1861:3: kw= '**='
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAugmentedOperatorAccess().getAsteriskAsteriskEqualsSignKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAugmentedOperator"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMyDsl.g:1870:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalMyDsl.g:1870:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalMyDsl.g:1871:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMyDsl.g:1877:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBranch_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBranch_6_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenBranch_4_0 = null;

        EObject lv_elseBranch_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1883:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBranch_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBranch_6_0= ruleBlock ) ) )? ) )
            // InternalMyDsl.g:1884:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBranch_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBranch_6_0= ruleBlock ) ) )? )
            {
            // InternalMyDsl.g:1884:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBranch_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBranch_6_0= ruleBlock ) ) )? )
            // InternalMyDsl.g:1885:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBranch_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBranch_6_0= ruleBlock ) ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1893:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalMyDsl.g:1894:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalMyDsl.g:1894:4: (lv_condition_2_0= ruleExpression )
            // InternalMyDsl.g:1895:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
            		
            // InternalMyDsl.g:1916:3: ( (lv_thenBranch_4_0= ruleBlock ) )
            // InternalMyDsl.g:1917:4: (lv_thenBranch_4_0= ruleBlock )
            {
            // InternalMyDsl.g:1917:4: (lv_thenBranch_4_0= ruleBlock )
            // InternalMyDsl.g:1918:5: lv_thenBranch_4_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getThenBranchBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_32);
            lv_thenBranch_4_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"thenBranch",
            						lv_thenBranch_4_0,
            						"org.xtext.example.mydsl.MyDsl.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1935:3: (otherlv_5= 'else' ( (lv_elseBranch_6_0= ruleBlock ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1936:4: otherlv_5= 'else' ( (lv_elseBranch_6_0= ruleBlock ) )
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                    			
                    // InternalMyDsl.g:1940:4: ( (lv_elseBranch_6_0= ruleBlock ) )
                    // InternalMyDsl.g:1941:5: (lv_elseBranch_6_0= ruleBlock )
                    {
                    // InternalMyDsl.g:1941:5: (lv_elseBranch_6_0= ruleBlock )
                    // InternalMyDsl.g:1942:6: lv_elseBranch_6_0= ruleBlock
                    {

                    						newCompositeNode(grammarAccess.getIfStatementAccess().getElseBranchBlockParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseBranch_6_0=ruleBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    						}
                    						set(
                    							current,
                    							"elseBranch",
                    							lv_elseBranch_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleForLoop"
    // InternalMyDsl.g:1964:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalMyDsl.g:1964:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalMyDsl.g:1965:2: iv_ruleForLoop= ruleForLoop EOF
            {
             newCompositeNode(grammarAccess.getForLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForLoop=ruleForLoop();

            state._fsp--;

             current =iv_ruleForLoop; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalMyDsl.g:1971:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initialization_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_body_8_0= ruleBlock ) ) ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_initialization_2_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_increment_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1977:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initialization_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_body_8_0= ruleBlock ) ) ) )
            // InternalMyDsl.g:1978:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initialization_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_body_8_0= ruleBlock ) ) )
            {
            // InternalMyDsl.g:1978:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initialization_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_body_8_0= ruleBlock ) ) )
            // InternalMyDsl.g:1979:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initialization_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_body_8_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1987:3: ( (lv_initialization_2_0= ruleExpression ) )
            // InternalMyDsl.g:1988:4: (lv_initialization_2_0= ruleExpression )
            {
            // InternalMyDsl.g:1988:4: (lv_initialization_2_0= ruleExpression )
            // InternalMyDsl.g:1989:5: lv_initialization_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getForLoopAccess().getInitializationExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_initialization_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForLoopRule());
            					}
            					set(
            						current,
            						"initialization",
            						lv_initialization_2_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getForLoopAccess().getSemicolonKeyword_3());
            		
            // InternalMyDsl.g:2010:3: ( (lv_condition_4_0= ruleExpression ) )
            // InternalMyDsl.g:2011:4: (lv_condition_4_0= ruleExpression )
            {
            // InternalMyDsl.g:2011:4: (lv_condition_4_0= ruleExpression )
            // InternalMyDsl.g:2012:5: lv_condition_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getForLoopAccess().getConditionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_condition_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForLoopRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_4_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getForLoopAccess().getSemicolonKeyword_5());
            		
            // InternalMyDsl.g:2033:3: ( (lv_increment_6_0= ruleExpression ) )
            // InternalMyDsl.g:2034:4: (lv_increment_6_0= ruleExpression )
            {
            // InternalMyDsl.g:2034:4: (lv_increment_6_0= ruleExpression )
            // InternalMyDsl.g:2035:5: lv_increment_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getForLoopAccess().getIncrementExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
            lv_increment_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForLoopRule());
            					}
            					set(
            						current,
            						"increment",
            						lv_increment_6_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_7, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7());
            		
            // InternalMyDsl.g:2056:3: ( (lv_body_8_0= ruleBlock ) )
            // InternalMyDsl.g:2057:4: (lv_body_8_0= ruleBlock )
            {
            // InternalMyDsl.g:2057:4: (lv_body_8_0= ruleBlock )
            // InternalMyDsl.g:2058:5: lv_body_8_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getForLoopAccess().getBodyBlockParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_8_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForLoopRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_8_0,
            						"org.xtext.example.mydsl.MyDsl.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalMyDsl.g:2079:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalMyDsl.g:2079:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalMyDsl.g:2080:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getWhileLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileLoop=ruleWhileLoop();

            state._fsp--;

             current =iv_ruleWhileLoop; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalMyDsl.g:2086:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2092:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleBlock ) ) ) )
            // InternalMyDsl.g:2093:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleBlock ) ) )
            {
            // InternalMyDsl.g:2093:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleBlock ) ) )
            // InternalMyDsl.g:2094:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2102:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalMyDsl.g:2103:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalMyDsl.g:2103:4: (lv_condition_2_0= ruleExpression )
            // InternalMyDsl.g:2104:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileLoopAccess().getConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3());
            		
            // InternalMyDsl.g:2125:3: ( (lv_body_4_0= ruleBlock ) )
            // InternalMyDsl.g:2126:4: (lv_body_4_0= ruleBlock )
            {
            // InternalMyDsl.g:2126:4: (lv_body_4_0= ruleBlock )
            // InternalMyDsl.g:2127:5: lv_body_4_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getWhileLoopAccess().getBodyBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_4_0,
            						"org.xtext.example.mydsl.MyDsl.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleDoWhileLoop"
    // InternalMyDsl.g:2148:1: entryRuleDoWhileLoop returns [EObject current=null] : iv_ruleDoWhileLoop= ruleDoWhileLoop EOF ;
    public final EObject entryRuleDoWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileLoop = null;


        try {
            // InternalMyDsl.g:2148:52: (iv_ruleDoWhileLoop= ruleDoWhileLoop EOF )
            // InternalMyDsl.g:2149:2: iv_ruleDoWhileLoop= ruleDoWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getDoWhileLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoWhileLoop=ruleDoWhileLoop();

            state._fsp--;

             current =iv_ruleDoWhileLoop; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoWhileLoop"


    // $ANTLR start "ruleDoWhileLoop"
    // InternalMyDsl.g:2155:1: ruleDoWhileLoop returns [EObject current=null] : (otherlv_0= 'do' ( (lv_body_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleDoWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_body_1_0 = null;

        EObject lv_condition_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2161:2: ( (otherlv_0= 'do' ( (lv_body_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalMyDsl.g:2162:2: (otherlv_0= 'do' ( (lv_body_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalMyDsl.g:2162:2: (otherlv_0= 'do' ( (lv_body_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalMyDsl.g:2163:3: otherlv_0= 'do' ( (lv_body_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getDoWhileLoopAccess().getDoKeyword_0());
            		
            // InternalMyDsl.g:2167:3: ( (lv_body_1_0= ruleBlock ) )
            // InternalMyDsl.g:2168:4: (lv_body_1_0= ruleBlock )
            {
            // InternalMyDsl.g:2168:4: (lv_body_1_0= ruleBlock )
            // InternalMyDsl.g:2169:5: lv_body_1_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getDoWhileLoopAccess().getBodyBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_body_1_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoWhileLoopRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.xtext.example.mydsl.MyDsl.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:2194:3: ( (lv_condition_4_0= ruleExpression ) )
            // InternalMyDsl.g:2195:4: (lv_condition_4_0= ruleExpression )
            {
            // InternalMyDsl.g:2195:4: (lv_condition_4_0= ruleExpression )
            // InternalMyDsl.g:2196:5: lv_condition_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDoWhileLoopAccess().getConditionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_condition_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoWhileLoopRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_4_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getDoWhileLoopAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDoWhileLoopAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoWhileLoop"


    // $ANTLR start "entryRuleContinueStatement"
    // InternalMyDsl.g:2225:1: entryRuleContinueStatement returns [String current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final String entryRuleContinueStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContinueStatement = null;


        try {
            // InternalMyDsl.g:2225:57: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // InternalMyDsl.g:2226:2: iv_ruleContinueStatement= ruleContinueStatement EOF
            {
             newCompositeNode(grammarAccess.getContinueStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContinueStatement=ruleContinueStatement();

            state._fsp--;

             current =iv_ruleContinueStatement.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContinueStatement"


    // $ANTLR start "ruleContinueStatement"
    // InternalMyDsl.g:2232:1: ruleContinueStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'continue' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleContinueStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2238:2: ( (kw= 'continue' kw= ';' ) )
            // InternalMyDsl.g:2239:2: (kw= 'continue' kw= ';' )
            {
            // InternalMyDsl.g:2239:2: (kw= 'continue' kw= ';' )
            // InternalMyDsl.g:2240:3: kw= 'continue' kw= ';'
            {
            kw=(Token)match(input,55,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getContinueStatementAccess().getContinueKeyword_0());
            		
            kw=(Token)match(input,21,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getContinueStatementAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContinueStatement"


    // $ANTLR start "entryRuleBreakStatement"
    // InternalMyDsl.g:2254:1: entryRuleBreakStatement returns [String current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final String entryRuleBreakStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBreakStatement = null;


        try {
            // InternalMyDsl.g:2254:54: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalMyDsl.g:2255:2: iv_ruleBreakStatement= ruleBreakStatement EOF
            {
             newCompositeNode(grammarAccess.getBreakStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBreakStatement=ruleBreakStatement();

            state._fsp--;

             current =iv_ruleBreakStatement.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBreakStatement"


    // $ANTLR start "ruleBreakStatement"
    // InternalMyDsl.g:2261:1: ruleBreakStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'break' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleBreakStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2267:2: ( (kw= 'break' kw= ';' ) )
            // InternalMyDsl.g:2268:2: (kw= 'break' kw= ';' )
            {
            // InternalMyDsl.g:2268:2: (kw= 'break' kw= ';' )
            // InternalMyDsl.g:2269:3: kw= 'break' kw= ';'
            {
            kw=(Token)match(input,56,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getBreakStatementAccess().getBreakKeyword_0());
            		
            kw=(Token)match(input,21,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getBreakStatementAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreakStatement"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalMyDsl.g:2283:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // InternalMyDsl.g:2283:60: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // InternalMyDsl.g:2284:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;

             current =iv_ruleFunctionDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalMyDsl.g:2290:1: ruleFunctionDeclaration returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleType ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleBlock ) ) ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_parameters_4_0=null;
        Token otherlv_5=null;
        Token lv_parameters_6_0=null;
        Token otherlv_7=null;
        Enumerator lv_returnType_0_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2296:2: ( ( ( (lv_returnType_0_0= ruleType ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleBlock ) ) ) )
            // InternalMyDsl.g:2297:2: ( ( (lv_returnType_0_0= ruleType ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleBlock ) ) )
            {
            // InternalMyDsl.g:2297:2: ( ( (lv_returnType_0_0= ruleType ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleBlock ) ) )
            // InternalMyDsl.g:2298:3: ( (lv_returnType_0_0= ruleType ) )? otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleBlock ) )
            {
            // InternalMyDsl.g:2298:3: ( (lv_returnType_0_0= ruleType ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=69 && LA31_0<=77)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2299:4: (lv_returnType_0_0= ruleType )
                    {
                    // InternalMyDsl.g:2299:4: (lv_returnType_0_0= ruleType )
                    // InternalMyDsl.g:2300:5: lv_returnType_0_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getReturnTypeTypeEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_34);
                    lv_returnType_0_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"returnType",
                    						lv_returnType_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_1());
            		
            // InternalMyDsl.g:2321:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:2322:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:2322:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:2323:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:2343:3: ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:2344:4: ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )*
                    {
                    // InternalMyDsl.g:2344:4: ( (lv_parameters_4_0= RULE_ID ) )
                    // InternalMyDsl.g:2345:5: (lv_parameters_4_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2345:5: (lv_parameters_4_0= RULE_ID )
                    // InternalMyDsl.g:2346:6: lv_parameters_4_0= RULE_ID
                    {
                    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(lv_parameters_4_0, grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMyDsl.g:2362:4: (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==14) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalMyDsl.g:2363:5: otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalMyDsl.g:2367:5: ( (lv_parameters_6_0= RULE_ID ) )
                    	    // InternalMyDsl.g:2368:6: (lv_parameters_6_0= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2368:6: (lv_parameters_6_0= RULE_ID )
                    	    // InternalMyDsl.g:2369:7: lv_parameters_6_0= RULE_ID
                    	    {
                    	    lv_parameters_6_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    	    							newLeafNode(lv_parameters_6_0, grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_4_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_6_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_5());
            		
            // InternalMyDsl.g:2391:3: ( (lv_body_8_0= ruleBlock ) )
            // InternalMyDsl.g:2392:4: (lv_body_8_0= ruleBlock )
            {
            // InternalMyDsl.g:2392:4: (lv_body_8_0= ruleBlock )
            // InternalMyDsl.g:2393:5: lv_body_8_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_8_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_8_0,
            						"org.xtext.example.mydsl.MyDsl.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalMyDsl.g:2414:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalMyDsl.g:2414:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalMyDsl.g:2415:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalMyDsl.g:2421:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2427:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' otherlv_6= ';' ) )
            // InternalMyDsl.g:2428:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalMyDsl.g:2428:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' otherlv_6= ';' )
            // InternalMyDsl.g:2429:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' otherlv_6= ';'
            {
            // InternalMyDsl.g:2429:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:2430:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:2430:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:2431:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getNameFunctionDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2446:3: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_CHAR)||LA35_0==22||(LA35_0>=24 && LA35_0<=26)||(LA35_0>=28 && LA35_0<=30)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:2447:4: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    {
                    // InternalMyDsl.g:2447:4: ( (lv_arguments_2_0= ruleExpression ) )
                    // InternalMyDsl.g:2448:5: (lv_arguments_2_0= ruleExpression )
                    {
                    // InternalMyDsl.g:2448:5: (lv_arguments_2_0= ruleExpression )
                    // InternalMyDsl.g:2449:6: lv_arguments_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_arguments_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2466:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalMyDsl.g:2467:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMyDsl.g:2471:5: ( (lv_arguments_4_0= ruleExpression ) )
                    	    // InternalMyDsl.g:2472:6: (lv_arguments_4_0= ruleExpression )
                    	    {
                    	    // InternalMyDsl.g:2472:6: (lv_arguments_4_0= ruleExpression )
                    	    // InternalMyDsl.g:2473:7: lv_arguments_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_arguments_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_4_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleFunctionReturn"
    // InternalMyDsl.g:2504:1: entryRuleFunctionReturn returns [EObject current=null] : iv_ruleFunctionReturn= ruleFunctionReturn EOF ;
    public final EObject entryRuleFunctionReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionReturn = null;


        try {
            // InternalMyDsl.g:2504:55: (iv_ruleFunctionReturn= ruleFunctionReturn EOF )
            // InternalMyDsl.g:2505:2: iv_ruleFunctionReturn= ruleFunctionReturn EOF
            {
             newCompositeNode(grammarAccess.getFunctionReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionReturn=ruleFunctionReturn();

            state._fsp--;

             current =iv_ruleFunctionReturn; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionReturn"


    // $ANTLR start "ruleFunctionReturn"
    // InternalMyDsl.g:2511:1: ruleFunctionReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleFunctionReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2517:2: ( (otherlv_0= 'return' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:2518:2: (otherlv_0= 'return' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:2518:2: (otherlv_0= 'return' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ';' )
            // InternalMyDsl.g:2519:3: otherlv_0= 'return' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionReturnAccess().getReturnKeyword_0());
            		
            // InternalMyDsl.g:2523:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalMyDsl.g:2524:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalMyDsl.g:2524:4: (lv_expr_1_0= ruleExpression )
            // InternalMyDsl.g:2525:5: lv_expr_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFunctionReturnAccess().getExprExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_expr_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionReturnRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionReturnAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionReturn"


    // $ANTLR start "entryRuleConsoleLogStatement"
    // InternalMyDsl.g:2550:1: entryRuleConsoleLogStatement returns [EObject current=null] : iv_ruleConsoleLogStatement= ruleConsoleLogStatement EOF ;
    public final EObject entryRuleConsoleLogStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsoleLogStatement = null;


        try {
            // InternalMyDsl.g:2550:60: (iv_ruleConsoleLogStatement= ruleConsoleLogStatement EOF )
            // InternalMyDsl.g:2551:2: iv_ruleConsoleLogStatement= ruleConsoleLogStatement EOF
            {
             newCompositeNode(grammarAccess.getConsoleLogStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConsoleLogStatement=ruleConsoleLogStatement();

            state._fsp--;

             current =iv_ruleConsoleLogStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConsoleLogStatement"


    // $ANTLR start "ruleConsoleLogStatement"
    // InternalMyDsl.g:2557:1: ruleConsoleLogStatement returns [EObject current=null] : ( () otherlv_1= 'console.log' otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleConsoleLogStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2563:2: ( ( () otherlv_1= 'console.log' otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) )
            // InternalMyDsl.g:2564:2: ( () otherlv_1= 'console.log' otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            {
            // InternalMyDsl.g:2564:2: ( () otherlv_1= 'console.log' otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            // InternalMyDsl.g:2565:3: () otherlv_1= 'console.log' otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' otherlv_7= ';'
            {
            // InternalMyDsl.g:2565:3: ()
            // InternalMyDsl.g:2566:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConsoleLogStatementAccess().getConsoleLogStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getConsoleLogStatementAccess().getConsoleLogKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getConsoleLogStatementAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:2580:3: ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_CHAR)||LA37_0==22||(LA37_0>=24 && LA37_0<=26)||(LA37_0>=28 && LA37_0<=30)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:2581:4: ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
                    {
                    // InternalMyDsl.g:2581:4: ( (lv_arguments_3_0= ruleExpression ) )
                    // InternalMyDsl.g:2582:5: (lv_arguments_3_0= ruleExpression )
                    {
                    // InternalMyDsl.g:2582:5: (lv_arguments_3_0= ruleExpression )
                    // InternalMyDsl.g:2583:6: lv_arguments_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getConsoleLogStatementAccess().getArgumentsExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_arguments_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConsoleLogStatementRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2600:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalMyDsl.g:2601:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getConsoleLogStatementAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMyDsl.g:2605:5: ( (lv_arguments_5_0= ruleExpression ) )
                    	    // InternalMyDsl.g:2606:6: (lv_arguments_5_0= ruleExpression )
                    	    {
                    	    // InternalMyDsl.g:2606:6: (lv_arguments_5_0= ruleExpression )
                    	    // InternalMyDsl.g:2607:7: lv_arguments_5_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getConsoleLogStatementAccess().getArgumentsExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_arguments_5_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConsoleLogStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getConsoleLogStatementAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConsoleLogStatementAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConsoleLogStatement"


    // $ANTLR start "entryRuleTryCatchStatement"
    // InternalMyDsl.g:2638:1: entryRuleTryCatchStatement returns [EObject current=null] : iv_ruleTryCatchStatement= ruleTryCatchStatement EOF ;
    public final EObject entryRuleTryCatchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTryCatchStatement = null;


        try {
            // InternalMyDsl.g:2638:58: (iv_ruleTryCatchStatement= ruleTryCatchStatement EOF )
            // InternalMyDsl.g:2639:2: iv_ruleTryCatchStatement= ruleTryCatchStatement EOF
            {
             newCompositeNode(grammarAccess.getTryCatchStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTryCatchStatement=ruleTryCatchStatement();

            state._fsp--;

             current =iv_ruleTryCatchStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTryCatchStatement"


    // $ANTLR start "ruleTryCatchStatement"
    // InternalMyDsl.g:2645:1: ruleTryCatchStatement returns [EObject current=null] : (otherlv_0= 'try' ( (lv_tryBlock_1_0= ruleBlock ) ) otherlv_2= 'catch' otherlv_3= '(' ( (lv_exception_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_catchBlock_6_0= ruleBlock ) ) ) ;
    public final EObject ruleTryCatchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_exception_4_0=null;
        Token otherlv_5=null;
        EObject lv_tryBlock_1_0 = null;

        EObject lv_catchBlock_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2651:2: ( (otherlv_0= 'try' ( (lv_tryBlock_1_0= ruleBlock ) ) otherlv_2= 'catch' otherlv_3= '(' ( (lv_exception_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_catchBlock_6_0= ruleBlock ) ) ) )
            // InternalMyDsl.g:2652:2: (otherlv_0= 'try' ( (lv_tryBlock_1_0= ruleBlock ) ) otherlv_2= 'catch' otherlv_3= '(' ( (lv_exception_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_catchBlock_6_0= ruleBlock ) ) )
            {
            // InternalMyDsl.g:2652:2: (otherlv_0= 'try' ( (lv_tryBlock_1_0= ruleBlock ) ) otherlv_2= 'catch' otherlv_3= '(' ( (lv_exception_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_catchBlock_6_0= ruleBlock ) ) )
            // InternalMyDsl.g:2653:3: otherlv_0= 'try' ( (lv_tryBlock_1_0= ruleBlock ) ) otherlv_2= 'catch' otherlv_3= '(' ( (lv_exception_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_catchBlock_6_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getTryCatchStatementAccess().getTryKeyword_0());
            		
            // InternalMyDsl.g:2657:3: ( (lv_tryBlock_1_0= ruleBlock ) )
            // InternalMyDsl.g:2658:4: (lv_tryBlock_1_0= ruleBlock )
            {
            // InternalMyDsl.g:2658:4: (lv_tryBlock_1_0= ruleBlock )
            // InternalMyDsl.g:2659:5: lv_tryBlock_1_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getTryCatchStatementAccess().getTryBlockBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_tryBlock_1_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTryCatchStatementRule());
            					}
            					set(
            						current,
            						"tryBlock",
            						lv_tryBlock_1_0,
            						"org.xtext.example.mydsl.MyDsl.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getTryCatchStatementAccess().getCatchKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getTryCatchStatementAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:2684:3: ( (lv_exception_4_0= RULE_ID ) )
            // InternalMyDsl.g:2685:4: (lv_exception_4_0= RULE_ID )
            {
            // InternalMyDsl.g:2685:4: (lv_exception_4_0= RULE_ID )
            // InternalMyDsl.g:2686:5: lv_exception_4_0= RULE_ID
            {
            lv_exception_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_exception_4_0, grammarAccess.getTryCatchStatementAccess().getExceptionIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTryCatchStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"exception",
            						lv_exception_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getTryCatchStatementAccess().getRightParenthesisKeyword_5());
            		
            // InternalMyDsl.g:2706:3: ( (lv_catchBlock_6_0= ruleBlock ) )
            // InternalMyDsl.g:2707:4: (lv_catchBlock_6_0= ruleBlock )
            {
            // InternalMyDsl.g:2707:4: (lv_catchBlock_6_0= ruleBlock )
            // InternalMyDsl.g:2708:5: lv_catchBlock_6_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getTryCatchStatementAccess().getCatchBlockBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_catchBlock_6_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTryCatchStatementRule());
            					}
            					set(
            						current,
            						"catchBlock",
            						lv_catchBlock_6_0,
            						"org.xtext.example.mydsl.MyDsl.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTryCatchStatement"


    // $ANTLR start "entryRuleSwitchStatement"
    // InternalMyDsl.g:2729:1: entryRuleSwitchStatement returns [EObject current=null] : iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
    public final EObject entryRuleSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchStatement = null;


        try {
            // InternalMyDsl.g:2729:56: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
            // InternalMyDsl.g:2730:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
            {
             newCompositeNode(grammarAccess.getSwitchStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitchStatement=ruleSwitchStatement();

            state._fsp--;

             current =iv_ruleSwitchStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSwitchStatement"


    // $ANTLR start "ruleSwitchStatement"
    // InternalMyDsl.g:2736:1: ruleSwitchStatement returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )* ( (lv_defaultCase_6_0= ruleDefault ) )? otherlv_7= '}' ) ;
    public final EObject ruleSwitchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_expression_2_0 = null;

        EObject lv_cases_5_0 = null;

        EObject lv_defaultCase_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2742:2: ( (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )* ( (lv_defaultCase_6_0= ruleDefault ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:2743:2: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )* ( (lv_defaultCase_6_0= ruleDefault ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:2743:2: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )* ( (lv_defaultCase_6_0= ruleDefault ) )? otherlv_7= '}' )
            // InternalMyDsl.g:2744:3: otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )* ( (lv_defaultCase_6_0= ruleDefault ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2752:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalMyDsl.g:2753:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalMyDsl.g:2753:4: (lv_expression_2_0= ruleExpression )
            // InternalMyDsl.g:2754:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSwitchStatementAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getSwitchStatementAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:2779:3: ( (lv_cases_5_0= ruleCase ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==62) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:2780:4: (lv_cases_5_0= ruleCase )
            	    {
            	    // InternalMyDsl.g:2780:4: (lv_cases_5_0= ruleCase )
            	    // InternalMyDsl.g:2781:5: lv_cases_5_0= ruleCase
            	    {

            	    					newCompositeNode(grammarAccess.getSwitchStatementAccess().getCasesCaseParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_cases_5_0=ruleCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cases",
            	    						lv_cases_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Case");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalMyDsl.g:2798:3: ( (lv_defaultCase_6_0= ruleDefault ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==64) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2799:4: (lv_defaultCase_6_0= ruleDefault )
                    {
                    // InternalMyDsl.g:2799:4: (lv_defaultCase_6_0= ruleDefault )
                    // InternalMyDsl.g:2800:5: lv_defaultCase_6_0= ruleDefault
                    {

                    					newCompositeNode(grammarAccess.getSwitchStatementAccess().getDefaultCaseDefaultParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_defaultCase_6_0=ruleDefault();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
                    					}
                    					set(
                    						current,
                    						"defaultCase",
                    						lv_defaultCase_6_0,
                    						"org.xtext.example.mydsl.MyDsl.Default");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSwitchStatementAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchStatement"


    // $ANTLR start "entryRuleCase"
    // InternalMyDsl.g:2825:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalMyDsl.g:2825:45: (iv_ruleCase= ruleCase EOF )
            // InternalMyDsl.g:2826:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalMyDsl.g:2832:1: ruleCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )* ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2838:2: ( (otherlv_0= 'case' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )* ) )
            // InternalMyDsl.g:2839:2: (otherlv_0= 'case' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )* )
            {
            // InternalMyDsl.g:2839:2: (otherlv_0= 'case' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )* )
            // InternalMyDsl.g:2840:3: otherlv_0= 'case' ( (lv_value_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )*
            {
            otherlv_0=(Token)match(input,62,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
            		
            // InternalMyDsl.g:2844:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalMyDsl.g:2845:4: (lv_value_1_0= ruleExpression )
            {
            // InternalMyDsl.g:2845:4: (lv_value_1_0= ruleExpression )
            // InternalMyDsl.g:2846:5: lv_value_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCaseAccess().getValueExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_value_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,63,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:2867:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_CHAR)||LA40_0==13||LA40_0==22||(LA40_0>=24 && LA40_0<=26)||(LA40_0>=28 && LA40_0<=30)||LA40_0==50||(LA40_0>=52 && LA40_0<=59)||LA40_0==61||(LA40_0>=65 && LA40_0<=77)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:2868:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:2868:4: (lv_statements_3_0= ruleStatement )
            	    // InternalMyDsl.g:2869:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getCaseAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleDefault"
    // InternalMyDsl.g:2890:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalMyDsl.g:2890:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalMyDsl.g:2891:2: iv_ruleDefault= ruleDefault EOF
            {
             newCompositeNode(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalMyDsl.g:2897:1: ruleDefault returns [EObject current=null] : ( () otherlv_1= 'default' otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )* ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2903:2: ( ( () otherlv_1= 'default' otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )* ) )
            // InternalMyDsl.g:2904:2: ( () otherlv_1= 'default' otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )* )
            {
            // InternalMyDsl.g:2904:2: ( () otherlv_1= 'default' otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )* )
            // InternalMyDsl.g:2905:3: () otherlv_1= 'default' otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )*
            {
            // InternalMyDsl.g:2905:3: ()
            // InternalMyDsl.g:2906:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefaultAccess().getDefaultAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getDefaultKeyword_1());
            		
            otherlv_2=(Token)match(input,63,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getDefaultAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:2920:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_CHAR)||LA41_0==13||LA41_0==22||(LA41_0>=24 && LA41_0<=26)||(LA41_0>=28 && LA41_0<=30)||LA41_0==50||(LA41_0>=52 && LA41_0<=59)||LA41_0==61||(LA41_0>=65 && LA41_0<=77)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMyDsl.g:2921:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:2921:4: (lv_statements_3_0= ruleStatement )
            	    // InternalMyDsl.g:2922:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getDefaultAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDefaultRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleStringManipulationStatement"
    // InternalMyDsl.g:2943:1: entryRuleStringManipulationStatement returns [EObject current=null] : iv_ruleStringManipulationStatement= ruleStringManipulationStatement EOF ;
    public final EObject entryRuleStringManipulationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringManipulationStatement = null;


        try {
            // InternalMyDsl.g:2943:68: (iv_ruleStringManipulationStatement= ruleStringManipulationStatement EOF )
            // InternalMyDsl.g:2944:2: iv_ruleStringManipulationStatement= ruleStringManipulationStatement EOF
            {
             newCompositeNode(grammarAccess.getStringManipulationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringManipulationStatement=ruleStringManipulationStatement();

            state._fsp--;

             current =iv_ruleStringManipulationStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringManipulationStatement"


    // $ANTLR start "ruleStringManipulationStatement"
    // InternalMyDsl.g:2950:1: ruleStringManipulationStatement returns [EObject current=null] : (this_StringManipulationFunctionCall_0= ruleStringManipulationFunctionCall otherlv_1= ';' ) ;
    public final EObject ruleStringManipulationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_StringManipulationFunctionCall_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2956:2: ( (this_StringManipulationFunctionCall_0= ruleStringManipulationFunctionCall otherlv_1= ';' ) )
            // InternalMyDsl.g:2957:2: (this_StringManipulationFunctionCall_0= ruleStringManipulationFunctionCall otherlv_1= ';' )
            {
            // InternalMyDsl.g:2957:2: (this_StringManipulationFunctionCall_0= ruleStringManipulationFunctionCall otherlv_1= ';' )
            // InternalMyDsl.g:2958:3: this_StringManipulationFunctionCall_0= ruleStringManipulationFunctionCall otherlv_1= ';'
            {

            			newCompositeNode(grammarAccess.getStringManipulationStatementAccess().getStringManipulationFunctionCallParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_StringManipulationFunctionCall_0=ruleStringManipulationFunctionCall();

            state._fsp--;


            			current = this_StringManipulationFunctionCall_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStringManipulationStatementAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringManipulationStatement"


    // $ANTLR start "entryRuleStringManipulationFunctionCall"
    // InternalMyDsl.g:2974:1: entryRuleStringManipulationFunctionCall returns [EObject current=null] : iv_ruleStringManipulationFunctionCall= ruleStringManipulationFunctionCall EOF ;
    public final EObject entryRuleStringManipulationFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringManipulationFunctionCall = null;


        try {
            // InternalMyDsl.g:2974:71: (iv_ruleStringManipulationFunctionCall= ruleStringManipulationFunctionCall EOF )
            // InternalMyDsl.g:2975:2: iv_ruleStringManipulationFunctionCall= ruleStringManipulationFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getStringManipulationFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringManipulationFunctionCall=ruleStringManipulationFunctionCall();

            state._fsp--;

             current =iv_ruleStringManipulationFunctionCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringManipulationFunctionCall"


    // $ANTLR start "ruleStringManipulationFunctionCall"
    // InternalMyDsl.g:2981:1: ruleStringManipulationFunctionCall returns [EObject current=null] : (this_SplitFunctionCall_0= ruleSplitFunctionCall | this_JoinFunctionCall_1= ruleJoinFunctionCall | this_SliceFunctionCall_2= ruleSliceFunctionCall ) ;
    public final EObject ruleStringManipulationFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject this_SplitFunctionCall_0 = null;

        EObject this_JoinFunctionCall_1 = null;

        EObject this_SliceFunctionCall_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2987:2: ( (this_SplitFunctionCall_0= ruleSplitFunctionCall | this_JoinFunctionCall_1= ruleJoinFunctionCall | this_SliceFunctionCall_2= ruleSliceFunctionCall ) )
            // InternalMyDsl.g:2988:2: (this_SplitFunctionCall_0= ruleSplitFunctionCall | this_JoinFunctionCall_1= ruleJoinFunctionCall | this_SliceFunctionCall_2= ruleSliceFunctionCall )
            {
            // InternalMyDsl.g:2988:2: (this_SplitFunctionCall_0= ruleSplitFunctionCall | this_JoinFunctionCall_1= ruleJoinFunctionCall | this_SliceFunctionCall_2= ruleSliceFunctionCall )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt42=1;
                }
                break;
            case 66:
                {
                alt42=2;
                }
                break;
            case 67:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:2989:3: this_SplitFunctionCall_0= ruleSplitFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getStringManipulationFunctionCallAccess().getSplitFunctionCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitFunctionCall_0=ruleSplitFunctionCall();

                    state._fsp--;


                    			current = this_SplitFunctionCall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2998:3: this_JoinFunctionCall_1= ruleJoinFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getStringManipulationFunctionCallAccess().getJoinFunctionCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JoinFunctionCall_1=ruleJoinFunctionCall();

                    state._fsp--;


                    			current = this_JoinFunctionCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3007:3: this_SliceFunctionCall_2= ruleSliceFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getStringManipulationFunctionCallAccess().getSliceFunctionCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SliceFunctionCall_2=ruleSliceFunctionCall();

                    state._fsp--;


                    			current = this_SliceFunctionCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringManipulationFunctionCall"


    // $ANTLR start "entryRuleSplitFunctionCall"
    // InternalMyDsl.g:3019:1: entryRuleSplitFunctionCall returns [EObject current=null] : iv_ruleSplitFunctionCall= ruleSplitFunctionCall EOF ;
    public final EObject entryRuleSplitFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitFunctionCall = null;


        try {
            // InternalMyDsl.g:3019:58: (iv_ruleSplitFunctionCall= ruleSplitFunctionCall EOF )
            // InternalMyDsl.g:3020:2: iv_ruleSplitFunctionCall= ruleSplitFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getSplitFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitFunctionCall=ruleSplitFunctionCall();

            state._fsp--;

             current =iv_ruleSplitFunctionCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSplitFunctionCall"


    // $ANTLR start "ruleSplitFunctionCall"
    // InternalMyDsl.g:3026:1: ruleSplitFunctionCall returns [EObject current=null] : (otherlv_0= 'split' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleStringLiteral ) ) otherlv_5= ')' ) ;
    public final EObject ruleSplitFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_str_2_0 = null;

        EObject lv_delimiter_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3032:2: ( (otherlv_0= 'split' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleStringLiteral ) ) otherlv_5= ')' ) )
            // InternalMyDsl.g:3033:2: (otherlv_0= 'split' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleStringLiteral ) ) otherlv_5= ')' )
            {
            // InternalMyDsl.g:3033:2: (otherlv_0= 'split' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleStringLiteral ) ) otherlv_5= ')' )
            // InternalMyDsl.g:3034:3: otherlv_0= 'split' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleStringLiteral ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitFunctionCallAccess().getSplitKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSplitFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:3042:3: ( (lv_str_2_0= ruleExpression ) )
            // InternalMyDsl.g:3043:4: (lv_str_2_0= ruleExpression )
            {
            // InternalMyDsl.g:3043:4: (lv_str_2_0= ruleExpression )
            // InternalMyDsl.g:3044:5: lv_str_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSplitFunctionCallAccess().getStrExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_str_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSplitFunctionCallRule());
            					}
            					set(
            						current,
            						"str",
            						lv_str_2_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSplitFunctionCallAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:3065:3: ( (lv_delimiter_4_0= ruleStringLiteral ) )
            // InternalMyDsl.g:3066:4: (lv_delimiter_4_0= ruleStringLiteral )
            {
            // InternalMyDsl.g:3066:4: (lv_delimiter_4_0= ruleStringLiteral )
            // InternalMyDsl.g:3067:5: lv_delimiter_4_0= ruleStringLiteral
            {

            					newCompositeNode(grammarAccess.getSplitFunctionCallAccess().getDelimiterStringLiteralParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_delimiter_4_0=ruleStringLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSplitFunctionCallRule());
            					}
            					set(
            						current,
            						"delimiter",
            						lv_delimiter_4_0,
            						"org.xtext.example.mydsl.MyDsl.StringLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSplitFunctionCallAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSplitFunctionCall"


    // $ANTLR start "entryRuleJoinFunctionCall"
    // InternalMyDsl.g:3092:1: entryRuleJoinFunctionCall returns [EObject current=null] : iv_ruleJoinFunctionCall= ruleJoinFunctionCall EOF ;
    public final EObject entryRuleJoinFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinFunctionCall = null;


        try {
            // InternalMyDsl.g:3092:57: (iv_ruleJoinFunctionCall= ruleJoinFunctionCall EOF )
            // InternalMyDsl.g:3093:2: iv_ruleJoinFunctionCall= ruleJoinFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getJoinFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoinFunctionCall=ruleJoinFunctionCall();

            state._fsp--;

             current =iv_ruleJoinFunctionCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJoinFunctionCall"


    // $ANTLR start "ruleJoinFunctionCall"
    // InternalMyDsl.g:3099:1: ruleJoinFunctionCall returns [EObject current=null] : (otherlv_0= 'join' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_str_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_delimiter_6_0= ruleStringLiteral ) ) otherlv_7= ')' ) ;
    public final EObject ruleJoinFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_str_2_0 = null;

        EObject lv_str_4_0 = null;

        EObject lv_delimiter_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3105:2: ( (otherlv_0= 'join' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_str_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_delimiter_6_0= ruleStringLiteral ) ) otherlv_7= ')' ) )
            // InternalMyDsl.g:3106:2: (otherlv_0= 'join' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_str_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_delimiter_6_0= ruleStringLiteral ) ) otherlv_7= ')' )
            {
            // InternalMyDsl.g:3106:2: (otherlv_0= 'join' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_str_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_delimiter_6_0= ruleStringLiteral ) ) otherlv_7= ')' )
            // InternalMyDsl.g:3107:3: otherlv_0= 'join' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_str_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_delimiter_6_0= ruleStringLiteral ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getJoinFunctionCallAccess().getJoinKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getJoinFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:3115:3: ( (lv_str_2_0= ruleExpression ) )
            // InternalMyDsl.g:3116:4: (lv_str_2_0= ruleExpression )
            {
            // InternalMyDsl.g:3116:4: (lv_str_2_0= ruleExpression )
            // InternalMyDsl.g:3117:5: lv_str_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getJoinFunctionCallAccess().getStrExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_str_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinFunctionCallRule());
            					}
            					add(
            						current,
            						"str",
            						lv_str_2_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3134:3: (otherlv_3= ',' ( (lv_str_4_0= ruleExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==14) ) {
                    int LA43_1 = input.LA(2);

                    if ( ((LA43_1>=RULE_ID && LA43_1<=RULE_CHAR)||LA43_1==22||(LA43_1>=24 && LA43_1<=26)||(LA43_1>=28 && LA43_1<=30)) ) {
                        alt43=1;
                    }
                    else if ( (LA43_1==RULE_STRING) ) {
                        int LA43_3 = input.LA(3);

                        if ( (LA43_3==14||LA43_3==18||LA43_3==20||(LA43_3>=31 && LA43_3<=43)) ) {
                            alt43=1;
                        }


                    }


                }


                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:3135:4: otherlv_3= ',' ( (lv_str_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getJoinFunctionCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:3139:4: ( (lv_str_4_0= ruleExpression ) )
            	    // InternalMyDsl.g:3140:5: (lv_str_4_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:3140:5: (lv_str_4_0= ruleExpression )
            	    // InternalMyDsl.g:3141:6: lv_str_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getJoinFunctionCallAccess().getStrExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_str_4_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJoinFunctionCallRule());
            	    						}
            	    						add(
            	    							current,
            	    							"str",
            	    							lv_str_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getJoinFunctionCallAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:3163:3: ( (lv_delimiter_6_0= ruleStringLiteral ) )
            // InternalMyDsl.g:3164:4: (lv_delimiter_6_0= ruleStringLiteral )
            {
            // InternalMyDsl.g:3164:4: (lv_delimiter_6_0= ruleStringLiteral )
            // InternalMyDsl.g:3165:5: lv_delimiter_6_0= ruleStringLiteral
            {

            					newCompositeNode(grammarAccess.getJoinFunctionCallAccess().getDelimiterStringLiteralParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
            lv_delimiter_6_0=ruleStringLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinFunctionCallRule());
            					}
            					set(
            						current,
            						"delimiter",
            						lv_delimiter_6_0,
            						"org.xtext.example.mydsl.MyDsl.StringLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getJoinFunctionCallAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinFunctionCall"


    // $ANTLR start "entryRuleSliceFunctionCall"
    // InternalMyDsl.g:3190:1: entryRuleSliceFunctionCall returns [EObject current=null] : iv_ruleSliceFunctionCall= ruleSliceFunctionCall EOF ;
    public final EObject entryRuleSliceFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSliceFunctionCall = null;


        try {
            // InternalMyDsl.g:3190:58: (iv_ruleSliceFunctionCall= ruleSliceFunctionCall EOF )
            // InternalMyDsl.g:3191:2: iv_ruleSliceFunctionCall= ruleSliceFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getSliceFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSliceFunctionCall=ruleSliceFunctionCall();

            state._fsp--;

             current =iv_ruleSliceFunctionCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSliceFunctionCall"


    // $ANTLR start "ruleSliceFunctionCall"
    // InternalMyDsl.g:3197:1: ruleSliceFunctionCall returns [EObject current=null] : (otherlv_0= 'slice' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_start_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_end_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleSliceFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_start_4_0=null;
        Token otherlv_5=null;
        Token lv_end_6_0=null;
        Token otherlv_7=null;
        EObject lv_str_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3203:2: ( (otherlv_0= 'slice' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_start_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_end_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalMyDsl.g:3204:2: (otherlv_0= 'slice' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_start_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_end_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalMyDsl.g:3204:2: (otherlv_0= 'slice' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_start_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_end_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalMyDsl.g:3205:3: otherlv_0= 'slice' otherlv_1= '(' ( (lv_str_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_start_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_end_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSliceFunctionCallAccess().getSliceKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSliceFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:3213:3: ( (lv_str_2_0= ruleExpression ) )
            // InternalMyDsl.g:3214:4: (lv_str_2_0= ruleExpression )
            {
            // InternalMyDsl.g:3214:4: (lv_str_2_0= ruleExpression )
            // InternalMyDsl.g:3215:5: lv_str_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSliceFunctionCallAccess().getStrExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_str_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSliceFunctionCallRule());
            					}
            					set(
            						current,
            						"str",
            						lv_str_2_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getSliceFunctionCallAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:3236:3: ( (lv_start_4_0= RULE_INT ) )
            // InternalMyDsl.g:3237:4: (lv_start_4_0= RULE_INT )
            {
            // InternalMyDsl.g:3237:4: (lv_start_4_0= RULE_INT )
            // InternalMyDsl.g:3238:5: lv_start_4_0= RULE_INT
            {
            lv_start_4_0=(Token)match(input,RULE_INT,FOLLOW_41); 

            					newLeafNode(lv_start_4_0, grammarAccess.getSliceFunctionCallAccess().getStartINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSliceFunctionCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getSliceFunctionCallAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:3258:3: ( (lv_end_6_0= RULE_INT ) )
            // InternalMyDsl.g:3259:4: (lv_end_6_0= RULE_INT )
            {
            // InternalMyDsl.g:3259:4: (lv_end_6_0= RULE_INT )
            // InternalMyDsl.g:3260:5: lv_end_6_0= RULE_INT
            {
            lv_end_6_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_end_6_0, grammarAccess.getSliceFunctionCallAccess().getEndINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSliceFunctionCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSliceFunctionCallAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSliceFunctionCall"


    // $ANTLR start "entryRuleThrowStatement"
    // InternalMyDsl.g:3284:1: entryRuleThrowStatement returns [EObject current=null] : iv_ruleThrowStatement= ruleThrowStatement EOF ;
    public final EObject entryRuleThrowStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrowStatement = null;


        try {
            // InternalMyDsl.g:3284:55: (iv_ruleThrowStatement= ruleThrowStatement EOF )
            // InternalMyDsl.g:3285:2: iv_ruleThrowStatement= ruleThrowStatement EOF
            {
             newCompositeNode(grammarAccess.getThrowStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThrowStatement=ruleThrowStatement();

            state._fsp--;

             current =iv_ruleThrowStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleThrowStatement"


    // $ANTLR start "ruleThrowStatement"
    // InternalMyDsl.g:3291:1: ruleThrowStatement returns [EObject current=null] : (otherlv_0= 'throw' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleThrowStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3297:2: ( (otherlv_0= 'throw' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:3298:2: (otherlv_0= 'throw' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:3298:2: (otherlv_0= 'throw' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ';' )
            // InternalMyDsl.g:3299:3: otherlv_0= 'throw' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getThrowStatementAccess().getThrowKeyword_0());
            		
            // InternalMyDsl.g:3303:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalMyDsl.g:3304:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalMyDsl.g:3304:4: (lv_expr_1_0= ruleExpression )
            // InternalMyDsl.g:3305:5: lv_expr_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getThrowStatementAccess().getExprExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_expr_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThrowStatementRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getThrowStatementAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThrowStatement"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:3330:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'let' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'var' ) | (enumLiteral_7= 'const' ) | (enumLiteral_8= 'void' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3336:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'let' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'var' ) | (enumLiteral_7= 'const' ) | (enumLiteral_8= 'void' ) ) )
            // InternalMyDsl.g:3337:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'let' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'var' ) | (enumLiteral_7= 'const' ) | (enumLiteral_8= 'void' ) )
            {
            // InternalMyDsl.g:3337:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'let' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'var' ) | (enumLiteral_7= 'const' ) | (enumLiteral_8= 'void' ) )
            int alt44=9;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt44=1;
                }
                break;
            case 70:
                {
                alt44=2;
                }
                break;
            case 71:
                {
                alt44=3;
                }
                break;
            case 72:
                {
                alt44=4;
                }
                break;
            case 73:
                {
                alt44=5;
                }
                break;
            case 74:
                {
                alt44=6;
                }
                break;
            case 75:
                {
                alt44=7;
                }
                break;
            case 76:
                {
                alt44=8;
                }
                break;
            case 77:
                {
                alt44=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:3338:3: (enumLiteral_0= 'int' )
                    {
                    // InternalMyDsl.g:3338:3: (enumLiteral_0= 'int' )
                    // InternalMyDsl.g:3339:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3346:3: (enumLiteral_1= 'String' )
                    {
                    // InternalMyDsl.g:3346:3: (enumLiteral_1= 'String' )
                    // InternalMyDsl.g:3347:4: enumLiteral_1= 'String'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3354:3: (enumLiteral_2= 'char' )
                    {
                    // InternalMyDsl.g:3354:3: (enumLiteral_2= 'char' )
                    // InternalMyDsl.g:3355:4: enumLiteral_2= 'char'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCharEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getCharEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3362:3: (enumLiteral_3= 'let' )
                    {
                    // InternalMyDsl.g:3362:3: (enumLiteral_3= 'let' )
                    // InternalMyDsl.g:3363:4: enumLiteral_3= 'let'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getLetEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getLetEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3370:3: (enumLiteral_4= 'boolean' )
                    {
                    // InternalMyDsl.g:3370:3: (enumLiteral_4= 'boolean' )
                    // InternalMyDsl.g:3371:4: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3378:3: (enumLiteral_5= 'float' )
                    {
                    // InternalMyDsl.g:3378:3: (enumLiteral_5= 'float' )
                    // InternalMyDsl.g:3379:4: enumLiteral_5= 'float'
                    {
                    enumLiteral_5=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:3386:3: (enumLiteral_6= 'var' )
                    {
                    // InternalMyDsl.g:3386:3: (enumLiteral_6= 'var' )
                    // InternalMyDsl.g:3387:4: enumLiteral_6= 'var'
                    {
                    enumLiteral_6=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getVarEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getVarEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:3394:3: (enumLiteral_7= 'const' )
                    {
                    // InternalMyDsl.g:3394:3: (enumLiteral_7= 'const' )
                    // InternalMyDsl.g:3395:4: enumLiteral_7= 'const'
                    {
                    enumLiteral_7=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getConstEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getConstEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:3402:3: (enumLiteral_8= 'void' )
                    {
                    // InternalMyDsl.g:3402:3: (enumLiteral_8= 'void' )
                    // InternalMyDsl.g:3403:4: enumLiteral_8= 'void'
                    {
                    enumLiteral_8=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getVoidEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTypeAccess().getVoidEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\2\uffff\1\5\6\uffff";
    static final String dfa_3s = "\1\4\1\uffff\3\4\1\uffff\3\4";
    static final String dfa_4s = "\1\22\1\uffff\1\115\1\61\1\53\1\uffff\1\36\2\53";
    static final String dfa_5s = "\1\uffff\1\1\3\uffff\1\2\3\uffff";
    static final String dfa_6s = "\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\1\11\uffff\1\1\2\uffff\1\1",
            "",
            "\1\4\1\3\3\5\4\uffff\1\5\2\1\1\5\3\1\2\uffff\1\5\1\uffff\3\5\1\uffff\3\5\23\uffff\1\5\1\uffff\10\5\1\uffff\2\5\1\uffff\16\5",
            "\2\1\10\uffff\2\1\1\uffff\1\1\1\6\1\1\3\5\1\uffff\2\5\5\uffff\23\5",
            "\2\1\10\uffff\2\1\1\uffff\1\1\1\6\1\1\2\5\11\uffff\15\5",
            "",
            "\1\7\1\10\3\5\5\uffff\2\1\1\uffff\3\1\2\uffff\1\5\3\uffff\1\5\1\uffff\3\5",
            "\2\1\10\uffff\2\1\1\uffff\1\1\1\6\1\1\2\5\11\uffff\15\5",
            "\2\1\10\uffff\2\1\1\uffff\1\1\1\6\1\1\2\5\11\uffff\15\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "120:3: ( ( ( ( (lv_importedElement_1_0= ruleImportElement ) ) (otherlv_2= ',' )? ) | (otherlv_3= '{' ( ( (lv_importedElements_4_0= ruleImportElement ) ) (otherlv_5= ',' ( (lv_importedElements_6_0= ruleImportElement ) ) )* )? otherlv_7= '}' ) )+ otherlv_8= 'from' )?";
        }
    }
    static final String dfa_8s = "\35\uffff";
    static final String dfa_9s = "\1\4\11\5\1\uffff\1\22\1\5\20\uffff";
    static final String dfa_10s = "\1\115\11\32\1\uffff\1\61\1\26\20\uffff";
    static final String dfa_11s = "\12\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\1\1\11\1\12";
    static final String dfa_12s = "\35\uffff}>";
    static final String[] dfa_13s = {
            "\1\12\1\13\3\12\4\uffff\1\31\10\uffff\1\12\1\uffff\2\12\1\14\1\uffff\3\12\23\uffff\1\15\1\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\26\3\uffff\3\27\1\30\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\32\24\uffff\1\33",
            "\1\32\24\uffff\1\33",
            "\1\32\24\uffff\1\33",
            "\1\32\24\uffff\1\33",
            "\1\32\24\uffff\1\33",
            "\1\32\24\uffff\1\33",
            "\1\32\24\uffff\1\33",
            "\1\32\24\uffff\1\33",
            "\1\32\24\uffff\1\33",
            "",
            "\1\12\1\uffff\2\12\1\34\1\uffff\2\12\5\uffff\23\12",
            "\1\33\20\uffff\1\12",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "337:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ExpressionStatement_1= ruleExpressionStatement | this_IfStatement_2= ruleIfStatement | this_ForLoop_3= ruleForLoop | this_WhileLoop_4= ruleWhileLoop | this_DoWhileLoop_5= ruleDoWhileLoop | ruleContinueStatement | ruleBreakStatement | this_FunctionDeclaration_8= ruleFunctionDeclaration | this_FunctionCall_9= ruleFunctionCall | this_FunctionReturn_10= ruleFunctionReturn | this_ConsoleLogStatement_11= ruleConsoleLogStatement | this_TryCatchStatement_12= ruleTryCatchStatement | this_SwitchStatement_13= ruleSwitchStatement | this_StringManipulationStatement_14= ruleStringManipulationStatement | this_ThrowStatement_15= ruleThrowStatement | this_Import_16= ruleImport )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x2FF40000774021F2L,0x0000000000003FFEL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000048030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000006C030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000068030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x2FF40000774121F0L,0x0000000000003FFEL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000774001F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0003F00000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000744001F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001F80100002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000018000040002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000077C001F0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x4000000000010000L,0x0000000000000001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2FF40000774021F0L,0x0000000000003FFEL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000004000L});

}