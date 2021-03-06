// $ANTLR 3.5.1 /home/dcnorris/Documents/DroolsRule.g 2016-12-12 16:26:54

package com.stackleader.drools.netbeans.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DroolsRuleParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BINDING", "CHAR", "COLON", "DECLARE", 
		"DIALECT", "END", "ESC_SEQ", "EXPONENT", "EXTENDS", "FLOAT", "FQN", "GLOBAL", 
		"HEX_DIGIT", "ID", "IMPORT", "INT", "KEYWORD", "META", "METHOD", "MULTILINE_COMMENT", 
		"OCTAL_ESC", "OPERATOR", "PACKAGE", "PRIMITIVE", "RULE", "SALIENCE", "SEMICOLON", 
		"SEPARATOR", "SINGLELINE_COMMENT", "STRING", "THEN", "UNICODE_ESC", "WHEN", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int BINDING=4;
	public static final int CHAR=5;
	public static final int COLON=6;
	public static final int DECLARE=7;
	public static final int DIALECT=8;
	public static final int END=9;
	public static final int ESC_SEQ=10;
	public static final int EXPONENT=11;
	public static final int EXTENDS=12;
	public static final int FLOAT=13;
	public static final int FQN=14;
	public static final int GLOBAL=15;
	public static final int HEX_DIGIT=16;
	public static final int ID=17;
	public static final int IMPORT=18;
	public static final int INT=19;
	public static final int KEYWORD=20;
	public static final int META=21;
	public static final int METHOD=22;
	public static final int MULTILINE_COMMENT=23;
	public static final int OCTAL_ESC=24;
	public static final int OPERATOR=25;
	public static final int PACKAGE=26;
	public static final int PRIMITIVE=27;
	public static final int RULE=28;
	public static final int SALIENCE=29;
	public static final int SEMICOLON=30;
	public static final int SEPARATOR=31;
	public static final int SINGLELINE_COMMENT=32;
	public static final int STRING=33;
	public static final int THEN=34;
	public static final int UNICODE_ESC=35;
	public static final int WHEN=36;
	public static final int WS=37;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DroolsRuleParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DroolsRuleParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[40+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DroolsRuleParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/dcnorris/Documents/DroolsRule.g"; }


		@Override
		public void emitErrorMessage(String msg) {
		}


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/dcnorris/Documents/DroolsRule.g:54:1: program : ( declaration )* ( WS )* ;
	public final DroolsRuleParser.program_return program() throws RecognitionException {
		DroolsRuleParser.program_return retval = new DroolsRuleParser.program_return();
		retval.start = input.LT(1);
		int program_StartIndex = input.index();

		Object root_0 = null;

		Token WS2=null;
		ParserRuleReturnScope declaration1 =null;

		Object WS2_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// /home/dcnorris/Documents/DroolsRule.g:55:2: ( ( declaration )* ( WS )* )
			// /home/dcnorris/Documents/DroolsRule.g:55:4: ( declaration )* ( WS )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dcnorris/Documents/DroolsRule.g:55:4: ( declaration )*
			loop1:
			while (true) {
				int alt1=2;
				alt1 = dfa1.predict(input);
				switch (alt1) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:55:4: declaration
					{
					pushFollow(FOLLOW_declaration_in_program66);
					declaration1=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration1.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			// /home/dcnorris/Documents/DroolsRule.g:55:17: ( WS )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==WS) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:55:17: WS
					{
					WS2=(Token)match(input,WS,FOLLOW_WS_in_program69); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WS2_tree = (Object)adaptor.create(WS2);
					adaptor.addChild(root_0, WS2_tree);
					}

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// /home/dcnorris/Documents/DroolsRule.g:58:1: declaration : ( WS !)* ( packageDeclaration | importDeclaration | globalDeclaration | dialectDeclaration | typeDeclaration | ruleDeclaration ) ( WS !)* ( SEMICOLON )? ;
	public final DroolsRuleParser.declaration_return declaration() throws RecognitionException {
		DroolsRuleParser.declaration_return retval = new DroolsRuleParser.declaration_return();
		retval.start = input.LT(1);
		int declaration_StartIndex = input.index();

		Object root_0 = null;

		Token WS3=null;
		Token WS10=null;
		Token SEMICOLON11=null;
		ParserRuleReturnScope packageDeclaration4 =null;
		ParserRuleReturnScope importDeclaration5 =null;
		ParserRuleReturnScope globalDeclaration6 =null;
		ParserRuleReturnScope dialectDeclaration7 =null;
		ParserRuleReturnScope typeDeclaration8 =null;
		ParserRuleReturnScope ruleDeclaration9 =null;

		Object WS3_tree=null;
		Object WS10_tree=null;
		Object SEMICOLON11_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// /home/dcnorris/Documents/DroolsRule.g:59:2: ( ( WS !)* ( packageDeclaration | importDeclaration | globalDeclaration | dialectDeclaration | typeDeclaration | ruleDeclaration ) ( WS !)* ( SEMICOLON )? )
			// /home/dcnorris/Documents/DroolsRule.g:59:4: ( WS !)* ( packageDeclaration | importDeclaration | globalDeclaration | dialectDeclaration | typeDeclaration | ruleDeclaration ) ( WS !)* ( SEMICOLON )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dcnorris/Documents/DroolsRule.g:59:6: ( WS !)*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==WS) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:59:6: WS !
					{
					WS3=(Token)match(input,WS,FOLLOW_WS_in_declaration82); if (state.failed) return retval;
					}
					break;

				default :
					break loop3;
				}
			}

			// /home/dcnorris/Documents/DroolsRule.g:60:3: ( packageDeclaration | importDeclaration | globalDeclaration | dialectDeclaration | typeDeclaration | ruleDeclaration )
			int alt4=6;
			switch ( input.LA(1) ) {
			case PACKAGE:
				{
				alt4=1;
				}
				break;
			case IMPORT:
				{
				alt4=2;
				}
				break;
			case GLOBAL:
				{
				alt4=3;
				}
				break;
			case DIALECT:
				{
				alt4=4;
				}
				break;
			case DECLARE:
				{
				alt4=5;
				}
				break;
			case RULE:
				{
				alt4=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:60:5: packageDeclaration
					{
					pushFollow(FOLLOW_packageDeclaration_in_declaration90);
					packageDeclaration4=packageDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, packageDeclaration4.getTree());

					}
					break;
				case 2 :
					// /home/dcnorris/Documents/DroolsRule.g:60:26: importDeclaration
					{
					pushFollow(FOLLOW_importDeclaration_in_declaration94);
					importDeclaration5=importDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, importDeclaration5.getTree());

					}
					break;
				case 3 :
					// /home/dcnorris/Documents/DroolsRule.g:60:46: globalDeclaration
					{
					pushFollow(FOLLOW_globalDeclaration_in_declaration98);
					globalDeclaration6=globalDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, globalDeclaration6.getTree());

					}
					break;
				case 4 :
					// /home/dcnorris/Documents/DroolsRule.g:60:66: dialectDeclaration
					{
					pushFollow(FOLLOW_dialectDeclaration_in_declaration102);
					dialectDeclaration7=dialectDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dialectDeclaration7.getTree());

					}
					break;
				case 5 :
					// /home/dcnorris/Documents/DroolsRule.g:60:87: typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_declaration106);
					typeDeclaration8=typeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration8.getTree());

					}
					break;
				case 6 :
					// /home/dcnorris/Documents/DroolsRule.g:60:105: ruleDeclaration
					{
					pushFollow(FOLLOW_ruleDeclaration_in_declaration110);
					ruleDeclaration9=ruleDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ruleDeclaration9.getTree());

					}
					break;

			}

			// /home/dcnorris/Documents/DroolsRule.g:61:5: ( WS !)*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==WS) ) {
					int LA5_2 = input.LA(2);
					if ( (synpred9_DroolsRule()) ) {
						alt5=1;
					}

				}

				switch (alt5) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:61:5: WS !
					{
					WS10=(Token)match(input,WS,FOLLOW_WS_in_declaration116); if (state.failed) return retval;
					}
					break;

				default :
					break loop5;
				}
			}

			// /home/dcnorris/Documents/DroolsRule.g:61:8: ( SEMICOLON )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==SEMICOLON) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:61:8: SEMICOLON
					{
					SEMICOLON11=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declaration120); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLON11_tree = (Object)adaptor.create(SEMICOLON11);
					adaptor.addChild(root_0, SEMICOLON11_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, declaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class packageDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "packageDeclaration"
	// /home/dcnorris/Documents/DroolsRule.g:64:1: packageDeclaration : PACKAGE ( WS !)+ FQN ;
	public final DroolsRuleParser.packageDeclaration_return packageDeclaration() throws RecognitionException {
		DroolsRuleParser.packageDeclaration_return retval = new DroolsRuleParser.packageDeclaration_return();
		retval.start = input.LT(1);
		int packageDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token PACKAGE12=null;
		Token WS13=null;
		Token FQN14=null;

		Object PACKAGE12_tree=null;
		Object WS13_tree=null;
		Object FQN14_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// /home/dcnorris/Documents/DroolsRule.g:65:2: ( PACKAGE ( WS !)+ FQN )
			// /home/dcnorris/Documents/DroolsRule.g:65:5: PACKAGE ( WS !)+ FQN
			{
			root_0 = (Object)adaptor.nil();


			PACKAGE12=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration133); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PACKAGE12_tree = (Object)adaptor.create(PACKAGE12);
			adaptor.addChild(root_0, PACKAGE12_tree);
			}

			// /home/dcnorris/Documents/DroolsRule.g:65:15: ( WS !)+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==WS) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:65:15: WS !
					{
					WS13=(Token)match(input,WS,FOLLOW_WS_in_packageDeclaration135); if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			FQN14=(Token)match(input,FQN,FOLLOW_FQN_in_packageDeclaration139); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FQN14_tree = (Object)adaptor.create(FQN14);
			adaptor.addChild(root_0, FQN14_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, packageDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "packageDeclaration"


	public static class dialectDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dialectDeclaration"
	// /home/dcnorris/Documents/DroolsRule.g:68:1: dialectDeclaration : DIALECT ( WS !)+ STRING ;
	public final DroolsRuleParser.dialectDeclaration_return dialectDeclaration() throws RecognitionException {
		DroolsRuleParser.dialectDeclaration_return retval = new DroolsRuleParser.dialectDeclaration_return();
		retval.start = input.LT(1);
		int dialectDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token DIALECT15=null;
		Token WS16=null;
		Token STRING17=null;

		Object DIALECT15_tree=null;
		Object WS16_tree=null;
		Object STRING17_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// /home/dcnorris/Documents/DroolsRule.g:69:2: ( DIALECT ( WS !)+ STRING )
			// /home/dcnorris/Documents/DroolsRule.g:69:4: DIALECT ( WS !)+ STRING
			{
			root_0 = (Object)adaptor.nil();


			DIALECT15=(Token)match(input,DIALECT,FOLLOW_DIALECT_in_dialectDeclaration152); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DIALECT15_tree = (Object)adaptor.create(DIALECT15);
			adaptor.addChild(root_0, DIALECT15_tree);
			}

			// /home/dcnorris/Documents/DroolsRule.g:69:14: ( WS !)+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==WS) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:69:14: WS !
					{
					WS16=(Token)match(input,WS,FOLLOW_WS_in_dialectDeclaration154); if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			STRING17=(Token)match(input,STRING,FOLLOW_STRING_in_dialectDeclaration158); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STRING17_tree = (Object)adaptor.create(STRING17);
			adaptor.addChild(root_0, STRING17_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, dialectDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "dialectDeclaration"


	public static class importDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "importDeclaration"
	// /home/dcnorris/Documents/DroolsRule.g:72:1: importDeclaration : IMPORT ( WS !)+ FQN ;
	public final DroolsRuleParser.importDeclaration_return importDeclaration() throws RecognitionException {
		DroolsRuleParser.importDeclaration_return retval = new DroolsRuleParser.importDeclaration_return();
		retval.start = input.LT(1);
		int importDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token IMPORT18=null;
		Token WS19=null;
		Token FQN20=null;

		Object IMPORT18_tree=null;
		Object WS19_tree=null;
		Object FQN20_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// /home/dcnorris/Documents/DroolsRule.g:73:2: ( IMPORT ( WS !)+ FQN )
			// /home/dcnorris/Documents/DroolsRule.g:73:4: IMPORT ( WS !)+ FQN
			{
			root_0 = (Object)adaptor.nil();


			IMPORT18=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration170); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IMPORT18_tree = (Object)adaptor.create(IMPORT18);
			adaptor.addChild(root_0, IMPORT18_tree);
			}

			// /home/dcnorris/Documents/DroolsRule.g:73:13: ( WS !)+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==WS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:73:13: WS !
					{
					WS19=(Token)match(input,WS,FOLLOW_WS_in_importDeclaration172); if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			FQN20=(Token)match(input,FQN,FOLLOW_FQN_in_importDeclaration176); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FQN20_tree = (Object)adaptor.create(FQN20);
			adaptor.addChild(root_0, FQN20_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, importDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "importDeclaration"


	public static class globalDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "globalDeclaration"
	// /home/dcnorris/Documents/DroolsRule.g:76:1: globalDeclaration : GLOBAL ( WS )+ FQN ( WS )+ ID -> GLOBAL FQN ID ;
	public final DroolsRuleParser.globalDeclaration_return globalDeclaration() throws RecognitionException {
		DroolsRuleParser.globalDeclaration_return retval = new DroolsRuleParser.globalDeclaration_return();
		retval.start = input.LT(1);
		int globalDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token GLOBAL21=null;
		Token WS22=null;
		Token FQN23=null;
		Token WS24=null;
		Token ID25=null;

		Object GLOBAL21_tree=null;
		Object WS22_tree=null;
		Object FQN23_tree=null;
		Object WS24_tree=null;
		Object ID25_tree=null;
		RewriteRuleTokenStream stream_FQN=new RewriteRuleTokenStream(adaptor,"token FQN");
		RewriteRuleTokenStream stream_GLOBAL=new RewriteRuleTokenStream(adaptor,"token GLOBAL");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// /home/dcnorris/Documents/DroolsRule.g:77:2: ( GLOBAL ( WS )+ FQN ( WS )+ ID -> GLOBAL FQN ID )
			// /home/dcnorris/Documents/DroolsRule.g:77:4: GLOBAL ( WS )+ FQN ( WS )+ ID
			{
			GLOBAL21=(Token)match(input,GLOBAL,FOLLOW_GLOBAL_in_globalDeclaration188); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_GLOBAL.add(GLOBAL21);

			// /home/dcnorris/Documents/DroolsRule.g:77:11: ( WS )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==WS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:77:11: WS
					{
					WS22=(Token)match(input,WS,FOLLOW_WS_in_globalDeclaration190); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WS.add(WS22);

					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			FQN23=(Token)match(input,FQN,FOLLOW_FQN_in_globalDeclaration193); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FQN.add(FQN23);

			// /home/dcnorris/Documents/DroolsRule.g:77:19: ( WS )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==WS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:77:19: WS
					{
					WS24=(Token)match(input,WS,FOLLOW_WS_in_globalDeclaration195); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WS.add(WS24);

					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			ID25=(Token)match(input,ID,FOLLOW_ID_in_globalDeclaration198); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(ID25);

			// AST REWRITE
			// elements: GLOBAL, FQN, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 78:2: -> GLOBAL FQN ID
			{
				adaptor.addChild(root_0, stream_GLOBAL.nextNode());
				adaptor.addChild(root_0, stream_FQN.nextNode());
				adaptor.addChild(root_0, stream_ID.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, globalDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "globalDeclaration"


	public static class typeDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeDeclaration"
	// /home/dcnorris/Documents/DroolsRule.g:81:1: typeDeclaration : DECLARE ( WS !)+ ID ( WS !)+ ( EXTENDS FQN )? ( ( WS )* memberDeclaration )* ( WS )+ END ;
	public final DroolsRuleParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
		DroolsRuleParser.typeDeclaration_return retval = new DroolsRuleParser.typeDeclaration_return();
		retval.start = input.LT(1);
		int typeDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token DECLARE26=null;
		Token WS27=null;
		Token ID28=null;
		Token WS29=null;
		Token EXTENDS30=null;
		Token FQN31=null;
		Token WS32=null;
		Token WS34=null;
		Token END35=null;
		ParserRuleReturnScope memberDeclaration33 =null;

		Object DECLARE26_tree=null;
		Object WS27_tree=null;
		Object ID28_tree=null;
		Object WS29_tree=null;
		Object EXTENDS30_tree=null;
		Object FQN31_tree=null;
		Object WS32_tree=null;
		Object WS34_tree=null;
		Object END35_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// /home/dcnorris/Documents/DroolsRule.g:82:2: ( DECLARE ( WS !)+ ID ( WS !)+ ( EXTENDS FQN )? ( ( WS )* memberDeclaration )* ( WS )+ END )
			// /home/dcnorris/Documents/DroolsRule.g:82:4: DECLARE ( WS !)+ ID ( WS !)+ ( EXTENDS FQN )? ( ( WS )* memberDeclaration )* ( WS )+ END
			{
			root_0 = (Object)adaptor.nil();


			DECLARE26=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_typeDeclaration219); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DECLARE26_tree = (Object)adaptor.create(DECLARE26);
			adaptor.addChild(root_0, DECLARE26_tree);
			}

			// /home/dcnorris/Documents/DroolsRule.g:82:14: ( WS !)+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==WS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:82:14: WS !
					{
					WS27=(Token)match(input,WS,FOLLOW_WS_in_typeDeclaration221); if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			ID28=(Token)match(input,ID,FOLLOW_ID_in_typeDeclaration225); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID28_tree = (Object)adaptor.create(ID28);
			adaptor.addChild(root_0, ID28_tree);
			}

			// /home/dcnorris/Documents/DroolsRule.g:82:22: ( WS !)+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==WS) ) {
					int LA13_2 = input.LA(2);
					if ( (synpred17_DroolsRule()) ) {
						alt13=1;
					}

				}

				switch (alt13) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:82:22: WS !
					{
					WS29=(Token)match(input,WS,FOLLOW_WS_in_typeDeclaration227); if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			// /home/dcnorris/Documents/DroolsRule.g:82:25: ( EXTENDS FQN )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==EXTENDS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:82:26: EXTENDS FQN
					{
					EXTENDS30=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_typeDeclaration232); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXTENDS30_tree = (Object)adaptor.create(EXTENDS30);
					adaptor.addChild(root_0, EXTENDS30_tree);
					}

					FQN31=(Token)match(input,FQN,FOLLOW_FQN_in_typeDeclaration234); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FQN31_tree = (Object)adaptor.create(FQN31);
					adaptor.addChild(root_0, FQN31_tree);
					}

					}
					break;

			}

			// /home/dcnorris/Documents/DroolsRule.g:82:40: ( ( WS )* memberDeclaration )*
			loop16:
			while (true) {
				int alt16=2;
				alt16 = dfa16.predict(input);
				switch (alt16) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:82:41: ( WS )* memberDeclaration
					{
					// /home/dcnorris/Documents/DroolsRule.g:82:41: ( WS )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==WS) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /home/dcnorris/Documents/DroolsRule.g:82:41: WS
							{
							WS32=(Token)match(input,WS,FOLLOW_WS_in_typeDeclaration239); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							WS32_tree = (Object)adaptor.create(WS32);
							adaptor.addChild(root_0, WS32_tree);
							}

							}
							break;

						default :
							break loop15;
						}
					}

					pushFollow(FOLLOW_memberDeclaration_in_typeDeclaration242);
					memberDeclaration33=memberDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberDeclaration33.getTree());

					}
					break;

				default :
					break loop16;
				}
			}

			// /home/dcnorris/Documents/DroolsRule.g:82:65: ( WS )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==WS) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:82:65: WS
					{
					WS34=(Token)match(input,WS,FOLLOW_WS_in_typeDeclaration246); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WS34_tree = (Object)adaptor.create(WS34);
					adaptor.addChild(root_0, WS34_tree);
					}

					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			END35=(Token)match(input,END,FOLLOW_END_in_typeDeclaration249); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END35_tree = (Object)adaptor.create(END35);
			adaptor.addChild(root_0, END35_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, typeDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "typeDeclaration"


	public static class memberDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "memberDeclaration"
	// /home/dcnorris/Documents/DroolsRule.g:85:1: memberDeclaration : ID ( WS !)* COLON ( WS !)* ( PRIMITIVE | FQN ) ;
	public final DroolsRuleParser.memberDeclaration_return memberDeclaration() throws RecognitionException {
		DroolsRuleParser.memberDeclaration_return retval = new DroolsRuleParser.memberDeclaration_return();
		retval.start = input.LT(1);
		int memberDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token ID36=null;
		Token WS37=null;
		Token COLON38=null;
		Token WS39=null;
		Token set40=null;

		Object ID36_tree=null;
		Object WS37_tree=null;
		Object COLON38_tree=null;
		Object WS39_tree=null;
		Object set40_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// /home/dcnorris/Documents/DroolsRule.g:86:2: ( ID ( WS !)* COLON ( WS !)* ( PRIMITIVE | FQN ) )
			// /home/dcnorris/Documents/DroolsRule.g:86:4: ID ( WS !)* COLON ( WS !)* ( PRIMITIVE | FQN )
			{
			root_0 = (Object)adaptor.nil();


			ID36=(Token)match(input,ID,FOLLOW_ID_in_memberDeclaration261); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID36_tree = (Object)adaptor.create(ID36);
			adaptor.addChild(root_0, ID36_tree);
			}

			// /home/dcnorris/Documents/DroolsRule.g:86:9: ( WS !)*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==WS) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:86:9: WS !
					{
					WS37=(Token)match(input,WS,FOLLOW_WS_in_memberDeclaration263); if (state.failed) return retval;
					}
					break;

				default :
					break loop18;
				}
			}

			COLON38=(Token)match(input,COLON,FOLLOW_COLON_in_memberDeclaration267); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON38_tree = (Object)adaptor.create(COLON38);
			adaptor.addChild(root_0, COLON38_tree);
			}

			// /home/dcnorris/Documents/DroolsRule.g:86:20: ( WS !)*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==WS) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:86:20: WS !
					{
					WS39=(Token)match(input,WS,FOLLOW_WS_in_memberDeclaration269); if (state.failed) return retval;
					}
					break;

				default :
					break loop19;
				}
			}

			set40=input.LT(1);
			if ( input.LA(1)==FQN||input.LA(1)==PRIMITIVE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set40));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, memberDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberDeclaration"


	public static class ruleDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ruleDeclaration"
	// /home/dcnorris/Documents/DroolsRule.g:89:1: ruleDeclaration : RULE ( WS !)+ ( STRING ( WS !)+ )? WHEN ( WS !)+ ruleLHS THEN ( WS !)+ ruleRHS END ;
	public final DroolsRuleParser.ruleDeclaration_return ruleDeclaration() throws RecognitionException {
		DroolsRuleParser.ruleDeclaration_return retval = new DroolsRuleParser.ruleDeclaration_return();
		retval.start = input.LT(1);
		int ruleDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token RULE41=null;
		Token WS42=null;
		Token STRING43=null;
		Token WS44=null;
		Token WHEN45=null;
		Token WS46=null;
		Token THEN48=null;
		Token WS49=null;
		Token END51=null;
		ParserRuleReturnScope ruleLHS47 =null;
		ParserRuleReturnScope ruleRHS50 =null;

		Object RULE41_tree=null;
		Object WS42_tree=null;
		Object STRING43_tree=null;
		Object WS44_tree=null;
		Object WHEN45_tree=null;
		Object WS46_tree=null;
		Object THEN48_tree=null;
		Object WS49_tree=null;
		Object END51_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// /home/dcnorris/Documents/DroolsRule.g:90:2: ( RULE ( WS !)+ ( STRING ( WS !)+ )? WHEN ( WS !)+ ruleLHS THEN ( WS !)+ ruleRHS END )
			// /home/dcnorris/Documents/DroolsRule.g:90:4: RULE ( WS !)+ ( STRING ( WS !)+ )? WHEN ( WS !)+ ruleLHS THEN ( WS !)+ ruleRHS END
			{
			root_0 = (Object)adaptor.nil();


			RULE41=(Token)match(input,RULE,FOLLOW_RULE_in_ruleDeclaration290); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RULE41_tree = (Object)adaptor.create(RULE41);
			adaptor.addChild(root_0, RULE41_tree);
			}

			// /home/dcnorris/Documents/DroolsRule.g:90:11: ( WS !)+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==WS) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:90:11: WS !
					{
					WS42=(Token)match(input,WS,FOLLOW_WS_in_ruleDeclaration292); if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			// /home/dcnorris/Documents/DroolsRule.g:90:14: ( STRING ( WS !)+ )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==STRING) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:90:15: STRING ( WS !)+
					{
					STRING43=(Token)match(input,STRING,FOLLOW_STRING_in_ruleDeclaration297); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING43_tree = (Object)adaptor.create(STRING43);
					adaptor.addChild(root_0, STRING43_tree);
					}

					// /home/dcnorris/Documents/DroolsRule.g:90:24: ( WS !)+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==WS) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// /home/dcnorris/Documents/DroolsRule.g:90:24: WS !
							{
							WS44=(Token)match(input,WS,FOLLOW_WS_in_ruleDeclaration299); if (state.failed) return retval;
							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					}
					break;

			}

			WHEN45=(Token)match(input,WHEN,FOLLOW_WHEN_in_ruleDeclaration305); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHEN45_tree = (Object)adaptor.create(WHEN45);
			adaptor.addChild(root_0, WHEN45_tree);
			}

			// /home/dcnorris/Documents/DroolsRule.g:90:36: ( WS !)+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==WS) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:90:36: WS !
					{
					WS46=(Token)match(input,WS,FOLLOW_WS_in_ruleDeclaration307); if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			pushFollow(FOLLOW_ruleLHS_in_ruleDeclaration311);
			ruleLHS47=ruleLHS();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ruleLHS47.getTree());

			THEN48=(Token)match(input,THEN,FOLLOW_THEN_in_ruleDeclaration313); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			THEN48_tree = (Object)adaptor.create(THEN48);
			adaptor.addChild(root_0, THEN48_tree);
			}

			// /home/dcnorris/Documents/DroolsRule.g:90:54: ( WS !)+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==WS) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /home/dcnorris/Documents/DroolsRule.g:90:54: WS !
					{
					WS49=(Token)match(input,WS,FOLLOW_WS_in_ruleDeclaration315); if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt24 >= 1 ) break loop24;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(24, input);
					throw eee;
				}
				cnt24++;
			}

			pushFollow(FOLLOW_ruleRHS_in_ruleDeclaration319);
			ruleRHS50=ruleRHS();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ruleRHS50.getTree());

			END51=(Token)match(input,END,FOLLOW_END_in_ruleDeclaration321); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END51_tree = (Object)adaptor.create(END51);
			adaptor.addChild(root_0, END51_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, ruleDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ruleDeclaration"


	public static class ruleLHS_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ruleLHS"
	// /home/dcnorris/Documents/DroolsRule.g:93:1: ruleLHS :;
	public final DroolsRuleParser.ruleLHS_return ruleLHS() throws RecognitionException {
		DroolsRuleParser.ruleLHS_return retval = new DroolsRuleParser.ruleLHS_return();
		retval.start = input.LT(1);
		int ruleLHS_StartIndex = input.index();

		Object root_0 = null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// /home/dcnorris/Documents/DroolsRule.g:94:2: ()
			// /home/dcnorris/Documents/DroolsRule.g:95:2: 
			{
			root_0 = (Object)adaptor.nil();


			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, ruleLHS_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ruleLHS"


	public static class ruleRHS_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ruleRHS"
	// /home/dcnorris/Documents/DroolsRule.g:97:1: ruleRHS :;
	public final DroolsRuleParser.ruleRHS_return ruleRHS() throws RecognitionException {
		DroolsRuleParser.ruleRHS_return retval = new DroolsRuleParser.ruleRHS_return();
		retval.start = input.LT(1);
		int ruleRHS_StartIndex = input.index();

		Object root_0 = null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// /home/dcnorris/Documents/DroolsRule.g:98:2: ()
			// /home/dcnorris/Documents/DroolsRule.g:99:2: 
			{
			root_0 = (Object)adaptor.nil();


			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, ruleRHS_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ruleRHS"

	// $ANTLR start synpred9_DroolsRule
	public final void synpred9_DroolsRule_fragment() throws RecognitionException {
		// /home/dcnorris/Documents/DroolsRule.g:61:5: ( WS )
		// /home/dcnorris/Documents/DroolsRule.g:61:5: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred9_DroolsRule116); if (state.failed) return;

		}

	}
	// $ANTLR end synpred9_DroolsRule

	// $ANTLR start synpred17_DroolsRule
	public final void synpred17_DroolsRule_fragment() throws RecognitionException {
		// /home/dcnorris/Documents/DroolsRule.g:82:22: ( WS )
		// /home/dcnorris/Documents/DroolsRule.g:82:22: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred17_DroolsRule227); if (state.failed) return;

		}

	}
	// $ANTLR end synpred17_DroolsRule

	// Delegated rules

	public final boolean synpred9_DroolsRule() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_DroolsRule_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_DroolsRule() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_DroolsRule_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA16 dfa16 = new DFA16(this);
	static final String DFA1_eotS =
		"\4\uffff";
	static final String DFA1_eofS =
		"\2\2\2\uffff";
	static final String DFA1_minS =
		"\2\7\2\uffff";
	static final String DFA1_maxS =
		"\2\45\2\uffff";
	static final String DFA1_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA1_specialS =
		"\4\uffff}>";
	static final String[] DFA1_transitionS = {
			"\2\3\6\uffff\1\3\2\uffff\1\3\7\uffff\1\3\1\uffff\1\3\10\uffff\1\1",
			"\2\3\6\uffff\1\3\2\uffff\1\3\7\uffff\1\3\1\uffff\1\3\10\uffff\1\1",
			"",
			""
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

	protected class DFA1 extends DFA {

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
		@Override
		public String getDescription() {
			return "()* loopback of 55:4: ( declaration )*";
		}
	}

	static final String DFA16_eotS =
		"\4\uffff";
	static final String DFA16_eofS =
		"\4\uffff";
	static final String DFA16_minS =
		"\1\21\1\11\2\uffff";
	static final String DFA16_maxS =
		"\2\45\2\uffff";
	static final String DFA16_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA16_specialS =
		"\4\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\2\23\uffff\1\1",
			"\1\3\7\uffff\1\2\23\uffff\1\1",
			"",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 82:40: ( ( WS )* memberDeclaration )*";
		}
	}

	public static final BitSet FOLLOW_declaration_in_program66 = new BitSet(new long[]{0x0000002014048182L});
	public static final BitSet FOLLOW_WS_in_program69 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_WS_in_declaration82 = new BitSet(new long[]{0x0000002014048180L});
	public static final BitSet FOLLOW_packageDeclaration_in_declaration90 = new BitSet(new long[]{0x0000002040000002L});
	public static final BitSet FOLLOW_importDeclaration_in_declaration94 = new BitSet(new long[]{0x0000002040000002L});
	public static final BitSet FOLLOW_globalDeclaration_in_declaration98 = new BitSet(new long[]{0x0000002040000002L});
	public static final BitSet FOLLOW_dialectDeclaration_in_declaration102 = new BitSet(new long[]{0x0000002040000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_declaration106 = new BitSet(new long[]{0x0000002040000002L});
	public static final BitSet FOLLOW_ruleDeclaration_in_declaration110 = new BitSet(new long[]{0x0000002040000002L});
	public static final BitSet FOLLOW_WS_in_declaration116 = new BitSet(new long[]{0x0000002040000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_declaration120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration133 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_WS_in_packageDeclaration135 = new BitSet(new long[]{0x0000002000004000L});
	public static final BitSet FOLLOW_FQN_in_packageDeclaration139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIALECT_in_dialectDeclaration152 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_WS_in_dialectDeclaration154 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_STRING_in_dialectDeclaration158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPORT_in_importDeclaration170 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_WS_in_importDeclaration172 = new BitSet(new long[]{0x0000002000004000L});
	public static final BitSet FOLLOW_FQN_in_importDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GLOBAL_in_globalDeclaration188 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_WS_in_globalDeclaration190 = new BitSet(new long[]{0x0000002000004000L});
	public static final BitSet FOLLOW_FQN_in_globalDeclaration193 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_WS_in_globalDeclaration195 = new BitSet(new long[]{0x0000002000020000L});
	public static final BitSet FOLLOW_ID_in_globalDeclaration198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLARE_in_typeDeclaration219 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_WS_in_typeDeclaration221 = new BitSet(new long[]{0x0000002000020000L});
	public static final BitSet FOLLOW_ID_in_typeDeclaration225 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_WS_in_typeDeclaration227 = new BitSet(new long[]{0x0000002000021000L});
	public static final BitSet FOLLOW_EXTENDS_in_typeDeclaration232 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_FQN_in_typeDeclaration234 = new BitSet(new long[]{0x0000002000020000L});
	public static final BitSet FOLLOW_WS_in_typeDeclaration239 = new BitSet(new long[]{0x0000002000020000L});
	public static final BitSet FOLLOW_memberDeclaration_in_typeDeclaration242 = new BitSet(new long[]{0x0000002000020000L});
	public static final BitSet FOLLOW_WS_in_typeDeclaration246 = new BitSet(new long[]{0x0000002000000200L});
	public static final BitSet FOLLOW_END_in_typeDeclaration249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_memberDeclaration261 = new BitSet(new long[]{0x0000002000000040L});
	public static final BitSet FOLLOW_WS_in_memberDeclaration263 = new BitSet(new long[]{0x0000002000000040L});
	public static final BitSet FOLLOW_COLON_in_memberDeclaration267 = new BitSet(new long[]{0x0000002008004000L});
	public static final BitSet FOLLOW_WS_in_memberDeclaration269 = new BitSet(new long[]{0x0000002008004000L});
	public static final BitSet FOLLOW_set_in_memberDeclaration273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_in_ruleDeclaration290 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_WS_in_ruleDeclaration292 = new BitSet(new long[]{0x0000003200000000L});
	public static final BitSet FOLLOW_STRING_in_ruleDeclaration297 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_WS_in_ruleDeclaration299 = new BitSet(new long[]{0x0000003000000000L});
	public static final BitSet FOLLOW_WHEN_in_ruleDeclaration305 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_WS_in_ruleDeclaration307 = new BitSet(new long[]{0x0000002400000000L});
	public static final BitSet FOLLOW_ruleLHS_in_ruleDeclaration311 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_THEN_in_ruleDeclaration313 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_WS_in_ruleDeclaration315 = new BitSet(new long[]{0x0000002000000200L});
	public static final BitSet FOLLOW_ruleRHS_in_ruleDeclaration319 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_ruleDeclaration321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred9_DroolsRule116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred17_DroolsRule227 = new BitSet(new long[]{0x0000000000000002L});
}
