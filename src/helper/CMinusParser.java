package helper;

// $ANTLR 3.1.1 CMinus.g 2017-02-22 12:13:35

import org.antlr.stringtemplate.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class CMinusParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "FP", "WS", "';'", "'='", "'['", "']'", "'('", "','", "')'", "'[]'", "'int'", "'char'", "'float'", "'double'", "'int[]'", "'char[]'", "'float[]'", "'double[]'", "'{'", "'}'", "'return'", "'if'", "'else'", "'for'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'&&'", "'||'", "'=='", "'<'", "'<='", "'>='", "'>'", "'!='", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int ID=4;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int FP=6;
    public static final int INT=5;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int WS=7;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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

    protected static class slist_scope {
        List locals;
        List stats;
    }
    protected Stack slist_stack = new Stack();


        public CMinusParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CMinusParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("CMinusParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return CMinusParser.tokenNames; }
    public String getGrammarFileName() { return "CMinus.g"; }


    protected static class program_scope {
        List globals;
        List functions;
    }
    protected Stack program_stack = new Stack();

    public static class program_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // CMinus.g:23:1: program : ( declaration )+ -> program(globals=$program::globalsfunctions=$program::functions);
    public final CMinusParser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        CMinusParser.program_return retval = new CMinusParser.program_return();
        retval.start = input.LT(1);


          ((program_scope)program_stack.peek()).globals = new ArrayList();
          ((program_scope)program_stack.peek()).functions = new ArrayList();

        try {
            // CMinus.g:32:5: ( ( declaration )+ -> program(globals=$program::globalsfunctions=$program::functions))
            // CMinus.g:32:9: ( declaration )+
            {
            // CMinus.g:32:9: ( declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||(LA1_0>=16 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // CMinus.g:0:0: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program61);
            	    declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 33:9: -> program(globals=$program::globalsfunctions=$program::functions)
              {
                  retval.st = templateLib.getInstanceOf("program",
                new STAttrMap().put("globals", ((program_scope)program_stack.peek()).globals).put("functions", ((program_scope)program_stack.peek()).functions));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            program_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class declaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // CMinus.g:36:1: declaration : ( variable | f= function );
    public final CMinusParser.declaration_return declaration() throws RecognitionException {
        CMinusParser.declaration_return retval = new CMinusParser.declaration_return();
        retval.start = input.LT(1);

        CMinusParser.function_return f = null;

        CMinusParser.variable_return variable1 = null;


        try {
            // CMinus.g:37:5: ( variable | f= function )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // CMinus.g:37:9: variable
                    {
                    pushFollow(FOLLOW_variable_in_declaration102);
                    variable1=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((program_scope)program_stack.peek()).globals.add((variable1!=null?variable1.st:null));
                    }

                    }
                    break;
                case 2 :
                    // CMinus.g:38:9: f= function
                    {
                    pushFollow(FOLLOW_function_in_declaration118);
                    f=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((program_scope)program_stack.peek()).functions.add((f!=null?f.st:null));
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class variable_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variable"
    // CMinus.g:44:1: variable : ( type declarator ';' -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st) | type declarator '=' expr ';' -> {$function.size()>0 && $function::name==null}? globalVariableInit(type=$type.stname=$declarator.stvalue=$expr.st) -> variableInit(type=$type.stname=$declarator.stvalue=$expr.st) | type declarator '[' expr ']' ';' -> {$function.size()>0 && $function::name==null}? globalArrayDeclaration(type=$type.stname=$declarator.stsize=$expr.st) -> arrayDeclaration(type=$type.stname=$declarator.stsize=$expr.st));
    public final CMinusParser.variable_return variable() throws RecognitionException {
        CMinusParser.variable_return retval = new CMinusParser.variable_return();
        retval.start = input.LT(1);

        CMinusParser.type_return type2 = null;

        CMinusParser.declarator_return declarator3 = null;

        CMinusParser.type_return type4 = null;

        CMinusParser.declarator_return declarator5 = null;

        CMinusParser.expr_return expr6 = null;

        CMinusParser.type_return type7 = null;

        CMinusParser.declarator_return declarator8 = null;

        CMinusParser.expr_return expr9 = null;


        try {
            // CMinus.g:45:5: ( type declarator ';' -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st) | type declarator '=' expr ';' -> {$function.size()>0 && $function::name==null}? globalVariableInit(type=$type.stname=$declarator.stvalue=$expr.st) -> variableInit(type=$type.stname=$declarator.stvalue=$expr.st) | type declarator '[' expr ']' ';' -> {$function.size()>0 && $function::name==null}? globalArrayDeclaration(type=$type.stname=$declarator.stsize=$expr.st) -> arrayDeclaration(type=$type.stname=$declarator.stsize=$expr.st))
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // CMinus.g:45:9: type declarator ';'
                    {
                    pushFollow(FOLLOW_type_in_variable142);
                    type2=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_variable144);
                    declarator3=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_variable146); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 46:9: -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st)
                      if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                          retval.st = templateLib.getInstanceOf("globalVariable",
                        new STAttrMap().put("type", (type2!=null?type2.st:null)).put("name", (declarator3!=null?declarator3.st:null)));
                      }
                      else // 48:9: -> variable(type=$type.stname=$declarator.st)
                      {
                          retval.st = templateLib.getInstanceOf("variable",
                        new STAttrMap().put("type", (type2!=null?type2.st:null)).put("name", (declarator3!=null?declarator3.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:49:6: type declarator '=' expr ';'
                    {
                    pushFollow(FOLLOW_type_in_variable208);
                    type4=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_variable210);
                    declarator5=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,9,FOLLOW_9_in_variable212); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_variable214);
                    expr6=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_variable216); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 50:6: -> {$function.size()>0 && $function::name==null}? globalVariableInit(type=$type.stname=$declarator.stvalue=$expr.st)
                      if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                          retval.st = templateLib.getInstanceOf("globalVariableInit",
                        new STAttrMap().put("type", (type4!=null?type4.st:null)).put("name", (declarator5!=null?declarator5.st:null)).put("value", (expr6!=null?expr6.st:null)));
                      }
                      else // 52:9: -> variableInit(type=$type.stname=$declarator.stvalue=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("variableInit",
                        new STAttrMap().put("type", (type4!=null?type4.st:null)).put("name", (declarator5!=null?declarator5.st:null)).put("value", (expr6!=null?expr6.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:53:6: type declarator '[' expr ']' ';'
                    {
                    pushFollow(FOLLOW_type_in_variable283);
                    type7=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_variable285);
                    declarator8=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,10,FOLLOW_10_in_variable287); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_variable289);
                    expr9=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,11,FOLLOW_11_in_variable291); if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_variable293); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 54:6: -> {$function.size()>0 && $function::name==null}? globalArrayDeclaration(type=$type.stname=$declarator.stsize=$expr.st)
                      if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                          retval.st = templateLib.getInstanceOf("globalArrayDeclaration",
                        new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", (declarator8!=null?declarator8.st:null)).put("size", (expr9!=null?expr9.st:null)));
                      }
                      else // 56:9: -> arrayDeclaration(type=$type.stname=$declarator.stsize=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("arrayDeclaration",
                        new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", (declarator8!=null?declarator8.st:null)).put("size", (expr9!=null?expr9.st:null)));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class declarator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declarator"
    // CMinus.g:61:1: declarator : ID -> {new StringTemplate($ID.text)};
    public final CMinusParser.declarator_return declarator() throws RecognitionException {
        CMinusParser.declarator_return retval = new CMinusParser.declarator_return();
        retval.start = input.LT(1);

        Token ID10=null;

        try {
            // CMinus.g:62:5: ( ID -> {new StringTemplate($ID.text)})
            // CMinus.g:62:9: ID
            {
            ID10=(Token)match(input,ID,FOLLOW_ID_in_declarator375); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 62:12: -> {new StringTemplate($ID.text)}
              {
                  retval.st = new StringTemplate((ID10!=null?ID10.getText():null));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarator"

    protected static class function_scope {
        String name;
    }
    protected Stack function_stack = new Stack();

    public static class function_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "function"
    // CMinus.g:65:1: function : type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=toTemplates($p));
    public final CMinusParser.function_return function() throws RecognitionException {
        slist_stack.push(new slist_scope());
        function_stack.push(new function_scope());
        CMinusParser.function_return retval = new CMinusParser.function_return();
        retval.start = input.LT(1);

        Token ID11=null;
        List list_p=null;
        CMinusParser.type_return type12 = null;

        RuleReturnScope p = null;

          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:74:5: ( type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=toTemplates($p)))
            // CMinus.g:74:9: type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block
            {
            pushFollow(FOLLOW_type_in_function412);
            type12=type();

            state._fsp--;
            if (state.failed) return retval;
            ID11=(Token)match(input,ID,FOLLOW_ID_in_function414); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((function_scope)function_stack.peek()).name =(ID11!=null?ID11.getText():null);
            }
            match(input,12,FOLLOW_12_in_function426); if (state.failed) return retval;
            // CMinus.g:75:13: (p+= formalParameter ( ',' p+= formalParameter )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID||(LA5_0>=16 && LA5_0<=23)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // CMinus.g:75:15: p+= formalParameter ( ',' p+= formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_function432);
                    p=formalParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_p==null) list_p=new ArrayList();
                    list_p.add(p.getTemplate());

                    // CMinus.g:75:34: ( ',' p+= formalParameter )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==13) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // CMinus.g:75:36: ',' p+= formalParameter
                    	    {
                    	    match(input,13,FOLLOW_13_in_function436); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_formalParameter_in_function440);
                    	    p=formalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_p==null) list_p=new ArrayList();
                    	    list_p.add(p.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_function448); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_function458);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 77:9: -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=toTemplates($p))
              {
                  retval.st = templateLib.getInstanceOf("function",
                new STAttrMap().put("type", (type12!=null?type12.st:null)).put("name", ((function_scope)function_stack.peek()).name).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("args", (list_p)));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();
            function_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class formalParameter_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameter"
    // CMinus.g:83:1: formalParameter : ( type declarator -> parameter(type=$type.stname=$declarator.st) | type declarator '[]' -> arrayparameter(type=$type.stname=$declarator.st));
    public final CMinusParser.formalParameter_return formalParameter() throws RecognitionException {
        CMinusParser.formalParameter_return retval = new CMinusParser.formalParameter_return();
        retval.start = input.LT(1);

        CMinusParser.type_return type13 = null;

        CMinusParser.declarator_return declarator14 = null;

        CMinusParser.type_return type15 = null;

        CMinusParser.declarator_return declarator16 = null;


        try {
            // CMinus.g:84:5: ( type declarator -> parameter(type=$type.stname=$declarator.st) | type declarator '[]' -> arrayparameter(type=$type.stname=$declarator.st))
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // CMinus.g:84:9: type declarator
                    {
                    pushFollow(FOLLOW_type_in_formalParameter574);
                    type13=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_formalParameter576);
                    declarator14=declarator();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 85:9: -> parameter(type=$type.stname=$declarator.st)
                      {
                          retval.st = templateLib.getInstanceOf("parameter",
                        new STAttrMap().put("type", (type13!=null?type13.st:null)).put("name", (declarator14!=null?declarator14.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:86:6: type declarator '[]'
                    {
                    pushFollow(FOLLOW_type_in_formalParameter605);
                    type15=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_formalParameter607);
                    declarator16=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_formalParameter609); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 87:6: -> arrayparameter(type=$type.stname=$declarator.st)
                      {
                          retval.st = templateLib.getInstanceOf("arrayparameter",
                        new STAttrMap().put("type", (type15!=null?type15.st:null)).put("name", (declarator16!=null?declarator16.st:null)));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameter"

    public static class castexpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "castexpr"
    // CMinus.g:90:1: castexpr : '(' type ')' -> cast(type=$type.st);
    public final CMinusParser.castexpr_return castexpr() throws RecognitionException {
        CMinusParser.castexpr_return retval = new CMinusParser.castexpr_return();
        retval.start = input.LT(1);

        CMinusParser.type_return type17 = null;


        try {
            // CMinus.g:91:5: ( '(' type ')' -> cast(type=$type.st))
            // CMinus.g:91:9: '(' type ')'
            {
            match(input,12,FOLLOW_12_in_castexpr647); if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_castexpr649);
            type17=type();

            state._fsp--;
            if (state.failed) return retval;
            match(input,14,FOLLOW_14_in_castexpr651); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 91:22: -> cast(type=$type.st)
              {
                  retval.st = templateLib.getInstanceOf("cast",
                new STAttrMap().put("type", (type17!=null?type17.st:null)));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "castexpr"

    public static class type_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // CMinus.g:94:1: type : ( 'int' -> type_int() | 'char' -> type_char() | 'float' -> type_float() | 'double' -> type_double() | 'int[]' -> type_intarray() | 'char[]' -> type_chararray() | 'float[]' -> type_floatarray() | 'double[]' -> type_doublearray() | ID -> type_user_object(name=$ID.text));
    public final CMinusParser.type_return type() throws RecognitionException {
        CMinusParser.type_return retval = new CMinusParser.type_return();
        retval.start = input.LT(1);

        Token ID18=null;

        try {
            // CMinus.g:95:5: ( 'int' -> type_int() | 'char' -> type_char() | 'float' -> type_float() | 'double' -> type_double() | 'int[]' -> type_intarray() | 'char[]' -> type_chararray() | 'float[]' -> type_floatarray() | 'double[]' -> type_doublearray() | ID -> type_user_object(name=$ID.text))
            int alt7=9;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            case 22:
                {
                alt7=7;
                }
                break;
            case 23:
                {
                alt7=8;
                }
                break;
            case ID:
                {
                alt7=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // CMinus.g:95:9: 'int'
                    {
                    match(input,16,FOLLOW_16_in_type676); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 95:16: -> type_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_int");
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:96:9: 'char'
                    {
                    match(input,17,FOLLOW_17_in_type693); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 96:16: -> type_char()
                      {
                          retval.st = templateLib.getInstanceOf("type_char");
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:97:6: 'float'
                    {
                    match(input,18,FOLLOW_18_in_type706); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 97:14: -> type_float()
                      {
                          retval.st = templateLib.getInstanceOf("type_float");
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:98:6: 'double'
                    {
                    match(input,19,FOLLOW_19_in_type719); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 98:15: -> type_double()
                      {
                          retval.st = templateLib.getInstanceOf("type_double");
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:99:6: 'int[]'
                    {
                    match(input,20,FOLLOW_20_in_type732); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 99:14: -> type_intarray()
                      {
                          retval.st = templateLib.getInstanceOf("type_intarray");
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:100:6: 'char[]'
                    {
                    match(input,21,FOLLOW_21_in_type745); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 100:15: -> type_chararray()
                      {
                          retval.st = templateLib.getInstanceOf("type_chararray");
                      }

                    }
                    }
                    break;
                case 7 :
                    // CMinus.g:101:6: 'float[]'
                    {
                    match(input,22,FOLLOW_22_in_type758); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 101:16: -> type_floatarray()
                      {
                          retval.st = templateLib.getInstanceOf("type_floatarray");
                      }

                    }
                    }
                    break;
                case 8 :
                    // CMinus.g:102:6: 'double[]'
                    {
                    match(input,23,FOLLOW_23_in_type771); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 102:17: -> type_doublearray()
                      {
                          retval.st = templateLib.getInstanceOf("type_doublearray");
                      }

                    }
                    }
                    break;
                case 9 :
                    // CMinus.g:103:9: ID
                    {
                    ID18=(Token)match(input,ID,FOLLOW_ID_in_type787); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 103:16: -> type_user_object(name=$ID.text)
                      {
                          retval.st = templateLib.getInstanceOf("type_user_object",
                        new STAttrMap().put("name", (ID18!=null?ID18.getText():null)));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // CMinus.g:106:1: block : '{' ( variable | stat )* '}' ;
    public final CMinusParser.block_return block() throws RecognitionException {
        CMinusParser.block_return retval = new CMinusParser.block_return();
        retval.start = input.LT(1);

        CMinusParser.variable_return variable19 = null;

        CMinusParser.stat_return stat20 = null;


        try {
            // CMinus.g:107:5: ( '{' ( variable | stat )* '}' )
            // CMinus.g:107:8: '{' ( variable | stat )* '}'
            {
            match(input,24,FOLLOW_24_in_block818); if (state.failed) return retval;
            // CMinus.g:108:8: ( variable | stat )*
            loop8:
            do {
                int alt8=3;
                switch ( input.LA(1) ) {
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    {
                    alt8=1;
                    }
                    break;
                case ID:
                    {
                    int LA8_3 = input.LA(2);

                    if ( ((LA8_3>=8 && LA8_3<=10)||LA8_3==12||(LA8_3>=30 && LA8_3<=47)) ) {
                        alt8=2;
                    }
                    else if ( (LA8_3==ID) ) {
                        alt8=1;
                    }


                    }
                    break;
                case INT:
                case FP:
                case 8:
                case 12:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                    {
                    alt8=2;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // CMinus.g:108:10: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_block829);
            	    variable19=variable();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      ((slist_scope)slist_stack.peek()).locals.add((variable19!=null?variable19.st:null));
            	    }

            	    }
            	    break;
            	case 2 :
            	    // CMinus.g:108:57: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_block835);
            	    stat20=stat();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      ((slist_scope)slist_stack.peek()).stats.add((stat20!=null?stat20.st:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_block848); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class stat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stat"
    // CMinus.g:113:1: stat : ( forStat -> {$forStat.st} | ifStat -> {$ifStat.st} | elseStat -> {$elseStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | assignStat ';' -> {$assignStat.st} | 'return' expr ';' -> return(expr=$expr.st) | ';' -> {new StringTemplate(\";\")});
    public final CMinusParser.stat_return stat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.stat_return retval = new CMinusParser.stat_return();
        retval.start = input.LT(1);

        CMinusParser.forStat_return forStat21 = null;

        CMinusParser.ifStat_return ifStat22 = null;

        CMinusParser.elseStat_return elseStat23 = null;

        CMinusParser.expr_return expr24 = null;

        CMinusParser.assignStat_return assignStat25 = null;

        CMinusParser.expr_return expr26 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:119:5: ( forStat -> {$forStat.st} | ifStat -> {$ifStat.st} | elseStat -> {$elseStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | assignStat ';' -> {$assignStat.st} | 'return' expr ';' -> return(expr=$expr.st) | ';' -> {new StringTemplate(\";\")})
            int alt9=8;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // CMinus.g:119:7: forStat
                    {
                    pushFollow(FOLLOW_forStat_in_stat877);
                    forStat21=forStat();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 119:15: -> {$forStat.st}
                      {
                          retval.st = (forStat21!=null?forStat21.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:120:4: ifStat
                    {
                    pushFollow(FOLLOW_ifStat_in_stat886);
                    ifStat22=ifStat();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 120:11: -> {$ifStat.st}
                      {
                          retval.st = (ifStat22!=null?ifStat22.st:null);
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:121:4: elseStat
                    {
                    pushFollow(FOLLOW_elseStat_in_stat895);
                    elseStat23=elseStat();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 121:13: -> {$elseStat.st}
                      {
                          retval.st = (elseStat23!=null?elseStat23.st:null);
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:122:7: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_stat907);
                    expr24=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_stat909); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 122:16: -> statement(expr=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("statement",
                        new STAttrMap().put("expr", (expr24!=null?expr24.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:123:7: block
                    {
                    pushFollow(FOLLOW_block_in_stat926);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 123:13: -> statementList(locals=$slist::localsstats=$slist::stats)
                      {
                          retval.st = templateLib.getInstanceOf("statementList",
                        new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:124:7: assignStat ';'
                    {
                    pushFollow(FOLLOW_assignStat_in_stat948);
                    assignStat25=assignStat();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_stat950); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 124:22: -> {$assignStat.st}
                      {
                          retval.st = (assignStat25!=null?assignStat25.st:null);
                      }

                    }
                    }
                    break;
                case 7 :
                    // CMinus.g:125:4: 'return' expr ';'
                    {
                    match(input,26,FOLLOW_26_in_stat959); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_stat961);
                    expr26=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_stat963); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 125:22: -> return(expr=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("return",
                        new STAttrMap().put("expr", (expr26!=null?expr26.st:null)));
                      }

                    }
                    }
                    break;
                case 8 :
                    // CMinus.g:126:7: ';'
                    {
                    match(input,8,FOLLOW_8_in_stat980); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 126:11: -> {new StringTemplate(\";\")}
                      {
                          retval.st = new StringTemplate(";");
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "stat"

    public static class ifStat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ifStat"
    // CMinus.g:129:1: ifStat : 'if' '(' e= condExpr ')' block -> ifBlock(e=$e.stlocals=$slist::localsstats=$slist::stats);
    public final CMinusParser.ifStat_return ifStat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.ifStat_return retval = new CMinusParser.ifStat_return();
        retval.start = input.LT(1);

        CMinusParser.condExpr_return e = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:135:5: ( 'if' '(' e= condExpr ')' block -> ifBlock(e=$e.stlocals=$slist::localsstats=$slist::stats))
            // CMinus.g:135:9: 'if' '(' e= condExpr ')' block
            {
            match(input,27,FOLLOW_27_in_ifStat1014); if (state.failed) return retval;
            match(input,12,FOLLOW_12_in_ifStat1016); if (state.failed) return retval;
            pushFollow(FOLLOW_condExpr_in_ifStat1020);
            e=condExpr();

            state._fsp--;
            if (state.failed) return retval;
            match(input,14,FOLLOW_14_in_ifStat1022); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_ifStat1024);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 136:9: -> ifBlock(e=$e.stlocals=$slist::localsstats=$slist::stats)
              {
                  retval.st = templateLib.getInstanceOf("ifBlock",
                new STAttrMap().put("e", (e!=null?e.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "ifStat"

    public static class elseStat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "elseStat"
    // CMinus.g:140:1: elseStat : 'else' block -> elseBlock(locals=$slist::localsstats=$slist::stats);
    public final CMinusParser.elseStat_return elseStat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.elseStat_return retval = new CMinusParser.elseStat_return();
        retval.start = input.LT(1);


          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:146:5: ( 'else' block -> elseBlock(locals=$slist::localsstats=$slist::stats))
            // CMinus.g:146:9: 'else' block
            {
            match(input,28,FOLLOW_28_in_elseStat1100); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_elseStat1102);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 147:9: -> elseBlock(locals=$slist::localsstats=$slist::stats)
              {
                  retval.st = templateLib.getInstanceOf("elseBlock",
                new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "elseStat"

    public static class forStat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forStat"
    // CMinus.g:150:1: forStat : 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats);
    public final CMinusParser.forStat_return forStat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.forStat_return retval = new CMinusParser.forStat_return();
        retval.start = input.LT(1);

        CMinusParser.assignStat_return e1 = null;

        CMinusParser.expr_return e2 = null;

        CMinusParser.assignStat_return e3 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:156:5: ( 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats))
            // CMinus.g:156:9: 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block
            {
            match(input,29,FOLLOW_29_in_forStat1153); if (state.failed) return retval;
            match(input,12,FOLLOW_12_in_forStat1155); if (state.failed) return retval;
            pushFollow(FOLLOW_assignStat_in_forStat1159);
            e1=assignStat();

            state._fsp--;
            if (state.failed) return retval;
            match(input,8,FOLLOW_8_in_forStat1161); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_forStat1165);
            e2=expr();

            state._fsp--;
            if (state.failed) return retval;
            match(input,8,FOLLOW_8_in_forStat1167); if (state.failed) return retval;
            pushFollow(FOLLOW_assignStat_in_forStat1171);
            e3=assignStat();

            state._fsp--;
            if (state.failed) return retval;
            match(input,14,FOLLOW_14_in_forStat1173); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_forStat1175);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 157:9: -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats)
              {
                  retval.st = templateLib.getInstanceOf("forLoop",
                new STAttrMap().put("e1", (e1!=null?e1.st:null)).put("e2", (e2!=null?e2.st:null)).put("e3", (e3!=null?e3.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "forStat"

    public static class assignStat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignStat"
    // CMinus.g:161:1: assignStat : (e1= expr '=' e2= expr -> assign(lhs=$e1.strhs=$e2.st) | expr '++' -> inkrement(e=$expr.st) | expr '--' -> dekrement(e=$expr.st) | e1= expr '+=' e2= expr -> inkrementby(lhs=$e1.strhs=$e2.st) | e1= expr '-=' e2= expr -> dekrementby(lhs=$e1.strhs=$e2.st) | e1= expr '*=' e2= expr -> assignmultiply(lhs=$e1.strhs=$e2.st) | e1= expr '/=' e2= expr -> assigndivide(lhs=$e1.strhs=$e2.st));
    public final CMinusParser.assignStat_return assignStat() throws RecognitionException {
        CMinusParser.assignStat_return retval = new CMinusParser.assignStat_return();
        retval.start = input.LT(1);

        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;

        CMinusParser.expr_return expr27 = null;

        CMinusParser.expr_return expr28 = null;


        try {
            // CMinus.g:162:2: (e1= expr '=' e2= expr -> assign(lhs=$e1.strhs=$e2.st) | expr '++' -> inkrement(e=$expr.st) | expr '--' -> dekrement(e=$expr.st) | e1= expr '+=' e2= expr -> inkrementby(lhs=$e1.strhs=$e2.st) | e1= expr '-=' e2= expr -> dekrementby(lhs=$e1.strhs=$e2.st) | e1= expr '*=' e2= expr -> assignmultiply(lhs=$e1.strhs=$e2.st) | e1= expr '/=' e2= expr -> assigndivide(lhs=$e1.strhs=$e2.st))
            int alt10=7;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // CMinus.g:162:6: e1= expr '=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1247);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,9,FOLLOW_9_in_assignStat1249); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1253);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 162:26: -> assign(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("assign",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:163:6: expr '++'
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1274);
                    expr27=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,30,FOLLOW_30_in_assignStat1276); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 163:16: -> inkrement(e=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("inkrement",
                        new STAttrMap().put("e", (expr27!=null?expr27.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:164:6: expr '--'
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1292);
                    expr28=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,31,FOLLOW_31_in_assignStat1294); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 164:16: -> dekrement(e=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("dekrement",
                        new STAttrMap().put("e", (expr28!=null?expr28.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:165:6: e1= expr '+=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1312);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,32,FOLLOW_32_in_assignStat1314); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1318);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 165:27: -> inkrementby(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("inkrementby",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:166:6: e1= expr '-=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1341);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,33,FOLLOW_33_in_assignStat1343); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1347);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 166:27: -> dekrementby(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("dekrementby",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:167:6: e1= expr '*=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1370);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,34,FOLLOW_34_in_assignStat1372); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1376);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 167:27: -> assignmultiply(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("assignmultiply",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 7 :
                    // CMinus.g:168:6: e1= expr '/=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1399);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,35,FOLLOW_35_in_assignStat1401); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1405);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 168:27: -> assigndivide(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("assigndivide",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignStat"

    public static class expr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // CMinus.g:171:1: expr : ( condExpr -> {$condExpr.st} | aexpr -> {$aexpr.st});
    public final CMinusParser.expr_return expr() throws RecognitionException {
        CMinusParser.expr_return retval = new CMinusParser.expr_return();
        retval.start = input.LT(1);

        CMinusParser.condExpr_return condExpr29 = null;

        CMinusParser.aexpr_return aexpr30 = null;


        try {
            // CMinus.g:171:5: ( condExpr -> {$condExpr.st} | aexpr -> {$aexpr.st})
            int alt11=2;
            switch ( input.LA(1) ) {
            case 12:
                {
                int LA11_1 = input.LA(2);

                if ( (synpred31_CMinus()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA11_2 = input.LA(2);

                if ( (synpred31_CMinus()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT:
                {
                int LA11_3 = input.LA(2);

                if ( (synpred31_CMinus()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case FP:
                {
                int LA11_4 = input.LA(2);

                if ( (synpred31_CMinus()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // CMinus.g:171:9: condExpr
                    {
                    pushFollow(FOLLOW_condExpr_in_expr1433);
                    condExpr29=condExpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 171:18: -> {$condExpr.st}
                      {
                          retval.st = (condExpr29!=null?condExpr29.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:172:6: aexpr
                    {
                    pushFollow(FOLLOW_aexpr_in_expr1444);
                    aexpr30=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 172:12: -> {$aexpr.st}
                      {
                          retval.st = (aexpr30!=null?aexpr30.st:null);
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class arrayexpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayexpr"
    // CMinus.g:175:1: arrayexpr : ID '[' aexpr ']' -> array(name=$ID.textindex=$aexpr.st);
    public final CMinusParser.arrayexpr_return arrayexpr() throws RecognitionException {
        CMinusParser.arrayexpr_return retval = new CMinusParser.arrayexpr_return();
        retval.start = input.LT(1);

        Token ID31=null;
        CMinusParser.aexpr_return aexpr32 = null;


        try {
            // CMinus.g:176:2: ( ID '[' aexpr ']' -> array(name=$ID.textindex=$aexpr.st))
            // CMinus.g:176:6: ID '[' aexpr ']'
            {
            ID31=(Token)match(input,ID,FOLLOW_ID_in_arrayexpr1464); if (state.failed) return retval;
            match(input,10,FOLLOW_10_in_arrayexpr1466); if (state.failed) return retval;
            pushFollow(FOLLOW_aexpr_in_arrayexpr1468);
            aexpr32=aexpr();

            state._fsp--;
            if (state.failed) return retval;
            match(input,11,FOLLOW_11_in_arrayexpr1470); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 176:23: -> array(name=$ID.textindex=$aexpr.st)
              {
                  retval.st = templateLib.getInstanceOf("array",
                new STAttrMap().put("name", (ID31!=null?ID31.getText():null)).put("index", (aexpr32!=null?aexpr32.st:null)));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayexpr"

    public static class funcexpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "funcexpr"
    // CMinus.g:179:1: funcexpr : ID '(' (p+= aexpr ( ',' p+= aexpr )* )? ')' -> funcinstance(name=$ID.textargs=$p);
    public final CMinusParser.funcexpr_return funcexpr() throws RecognitionException {
        CMinusParser.funcexpr_return retval = new CMinusParser.funcexpr_return();
        retval.start = input.LT(1);

        Token ID33=null;
        List list_p=null;
        RuleReturnScope p = null;
        try {
            // CMinus.g:180:5: ( ID '(' (p+= aexpr ( ',' p+= aexpr )* )? ')' -> funcinstance(name=$ID.textargs=$p))
            // CMinus.g:180:9: ID '(' (p+= aexpr ( ',' p+= aexpr )* )? ')'
            {
            ID33=(Token)match(input,ID,FOLLOW_ID_in_funcexpr1500); if (state.failed) return retval;
            match(input,12,FOLLOW_12_in_funcexpr1502); if (state.failed) return retval;
            // CMinus.g:180:16: (p+= aexpr ( ',' p+= aexpr )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=ID && LA13_0<=FP)||LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // CMinus.g:180:18: p+= aexpr ( ',' p+= aexpr )*
                    {
                    pushFollow(FOLLOW_aexpr_in_funcexpr1508);
                    p=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_p==null) list_p=new ArrayList();
                    list_p.add(p.getTemplate());

                    // CMinus.g:180:27: ( ',' p+= aexpr )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // CMinus.g:180:29: ',' p+= aexpr
                    	    {
                    	    match(input,13,FOLLOW_13_in_funcexpr1512); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_aexpr_in_funcexpr1516);
                    	    p=aexpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_p==null) list_p=new ArrayList();
                    	    list_p.add(p.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_funcexpr1524); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 180:52: -> funcinstance(name=$ID.textargs=$p)
              {
                  retval.st = templateLib.getInstanceOf("funcinstance",
                new STAttrMap().put("name", (ID33!=null?ID33.getText():null)).put("args", list_p));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcexpr"

    public static class condExpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "condExpr"
    // CMinus.g:183:1: condExpr : (c1= condexp '&&' c2= condexp -> conjunction(left=$c1.stright=$c2.st) | c1= condexp '||' c2= condexp -> disjunction(left=$c1.stright=$c2.st) | c= condexp -> {$condexp.st});
    public final CMinusParser.condExpr_return condExpr() throws RecognitionException {
        CMinusParser.condExpr_return retval = new CMinusParser.condExpr_return();
        retval.start = input.LT(1);

        CMinusParser.condexp_return c1 = null;

        CMinusParser.condexp_return c2 = null;

        CMinusParser.condexp_return c = null;


        try {
            // CMinus.g:184:2: (c1= condexp '&&' c2= condexp -> conjunction(left=$c1.stright=$c2.st) | c1= condexp '||' c2= condexp -> disjunction(left=$c1.stright=$c2.st) | c= condexp -> {$condexp.st})
            int alt14=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                int LA14_1 = input.LA(2);

                if ( (synpred34_CMinus()) ) {
                    alt14=1;
                }
                else if ( (synpred35_CMinus()) ) {
                    alt14=2;
                }
                else if ( (true) ) {
                    alt14=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA14_2 = input.LA(2);

                if ( (synpred34_CMinus()) ) {
                    alt14=1;
                }
                else if ( (synpred35_CMinus()) ) {
                    alt14=2;
                }
                else if ( (true) ) {
                    alt14=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT:
                {
                int LA14_3 = input.LA(2);

                if ( (synpred34_CMinus()) ) {
                    alt14=1;
                }
                else if ( (synpred35_CMinus()) ) {
                    alt14=2;
                }
                else if ( (true) ) {
                    alt14=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;
                }
                }
                break;
            case FP:
                {
                int LA14_4 = input.LA(2);

                if ( (synpred34_CMinus()) ) {
                    alt14=1;
                }
                else if ( (synpred35_CMinus()) ) {
                    alt14=2;
                }
                else if ( (true) ) {
                    alt14=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // CMinus.g:184:6: c1= condexp '&&' c2= condexp
                    {
                    pushFollow(FOLLOW_condexp_in_condExpr1553);
                    c1=condexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,36,FOLLOW_36_in_condExpr1555); if (state.failed) return retval;
                    pushFollow(FOLLOW_condexp_in_condExpr1559);
                    c2=condexp();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 184:33: -> conjunction(left=$c1.stright=$c2.st)
                      {
                          retval.st = templateLib.getInstanceOf("conjunction",
                        new STAttrMap().put("left", (c1!=null?c1.st:null)).put("right", (c2!=null?c2.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:185:6: c1= condexp '||' c2= condexp
                    {
                    pushFollow(FOLLOW_condexp_in_condExpr1581);
                    c1=condexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,37,FOLLOW_37_in_condExpr1583); if (state.failed) return retval;
                    pushFollow(FOLLOW_condexp_in_condExpr1587);
                    c2=condexp();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 185:33: -> disjunction(left=$c1.stright=$c2.st)
                      {
                          retval.st = templateLib.getInstanceOf("disjunction",
                        new STAttrMap().put("left", (c1!=null?c1.st:null)).put("right", (c2!=null?c2.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:186:6: c= condexp
                    {
                    pushFollow(FOLLOW_condexp_in_condExpr1609);
                    c=condexp();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 186:16: -> {$condexp.st}
                      {
                          retval.st = (c!=null?c.st:null);
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condExpr"

    public static class condexp_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "condexp"
    // CMinus.g:189:1: condexp : a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st}) ;
    public final CMinusParser.condexp_return condexp() throws RecognitionException {
        CMinusParser.condexp_return retval = new CMinusParser.condexp_return();
        retval.start = input.LT(1);

        CMinusParser.aexpr_return a = null;

        CMinusParser.aexpr_return b = null;


        try {
            // CMinus.g:190:5: (a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st}) )
            // CMinus.g:190:9: a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st})
            {
            pushFollow(FOLLOW_aexpr_in_condexp1631);
            a=aexpr();

            state._fsp--;
            if (state.failed) return retval;
            // CMinus.g:191:9: ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st})
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=38 && LA16_0<=43)) ) {
                alt16=1;
            }
            else if ( (LA16_0==EOF||(LA16_0>=8 && LA16_0<=9)||LA16_0==11||LA16_0==14||(LA16_0>=30 && LA16_0<=37)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // CMinus.g:191:13: ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st))
                    {
                    // CMinus.g:191:13: ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st))
                    int alt15=6;
                    switch ( input.LA(1) ) {
                    case 38:
                        {
                        alt15=1;
                        }
                        break;
                    case 39:
                        {
                        alt15=2;
                        }
                        break;
                    case 40:
                        {
                        alt15=3;
                        }
                        break;
                    case 41:
                        {
                        alt15=4;
                        }
                        break;
                    case 42:
                        {
                        alt15=5;
                        }
                        break;
                    case 43:
                        {
                        alt15=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // CMinus.g:191:16: '==' b= aexpr
                            {
                            match(input,38,FOLLOW_38_in_condexp1648); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp1652);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 191:29: -> equals(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("equals",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 2 :
                            // CMinus.g:192:16: '<' b= aexpr
                            {
                            match(input,39,FOLLOW_39_in_condexp1682); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp1686);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 192:30: -> lessThan(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("lessThan",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 3 :
                            // CMinus.g:193:7: '<=' b= aexpr
                            {
                            match(input,40,FOLLOW_40_in_condexp1709); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp1713);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 193:22: -> lessOrEqual(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("lessOrEqual",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 4 :
                            // CMinus.g:194:7: '>=' b= aexpr
                            {
                            match(input,41,FOLLOW_41_in_condexp1736); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp1740);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 194:22: -> moreOrEqual(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("moreOrEqual",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 5 :
                            // CMinus.g:195:7: '>' b= aexpr
                            {
                            match(input,42,FOLLOW_42_in_condexp1763); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp1767);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 195:21: -> moreThan(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("moreThan",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 6 :
                            // CMinus.g:196:7: '!=' b= aexpr
                            {
                            match(input,43,FOLLOW_43_in_condexp1790); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp1794);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 196:22: -> unEqual(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("unEqual",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // CMinus.g:198:13: 
                    {

                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 198:13: -> {$a.st}
                      {
                          retval.st = (a!=null?a.st:null);
                      }

                    }
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condexp"

    public static class basicexpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "basicexpr"
    // CMinus.g:202:1: basicexpr : ( '(' type ')' arrayexpr -> castvalue(type=$type.stvalue=$arrayexpr.st) | '(' type ')' funcexpr -> castvalue(type=$type.stvalue=$funcexpr.st) | '(' type ')' atom -> castvalue(type=$type.stvalue=$atom.st) | arrayexpr -> {$arrayexpr.st} | funcexpr -> {$funcexpr.st} | atom -> {$atom.st});
    public final CMinusParser.basicexpr_return basicexpr() throws RecognitionException {
        CMinusParser.basicexpr_return retval = new CMinusParser.basicexpr_return();
        retval.start = input.LT(1);

        CMinusParser.type_return type34 = null;

        CMinusParser.arrayexpr_return arrayexpr35 = null;

        CMinusParser.type_return type36 = null;

        CMinusParser.funcexpr_return funcexpr37 = null;

        CMinusParser.type_return type38 = null;

        CMinusParser.atom_return atom39 = null;

        CMinusParser.arrayexpr_return arrayexpr40 = null;

        CMinusParser.funcexpr_return funcexpr41 = null;

        CMinusParser.atom_return atom42 = null;


        try {
            // CMinus.g:203:5: ( '(' type ')' arrayexpr -> castvalue(type=$type.stvalue=$arrayexpr.st) | '(' type ')' funcexpr -> castvalue(type=$type.stvalue=$funcexpr.st) | '(' type ')' atom -> castvalue(type=$type.stvalue=$atom.st) | arrayexpr -> {$arrayexpr.st} | funcexpr -> {$funcexpr.st} | atom -> {$atom.st})
            int alt17=6;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // CMinus.g:203:9: '(' type ')' arrayexpr
                    {
                    match(input,12,FOLLOW_12_in_basicexpr1870); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_basicexpr1872);
                    type34=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,14,FOLLOW_14_in_basicexpr1874); if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayexpr_in_basicexpr1876);
                    arrayexpr35=arrayexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 203:32: -> castvalue(type=$type.stvalue=$arrayexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("castvalue",
                        new STAttrMap().put("type", (type34!=null?type34.st:null)).put("value", (arrayexpr35!=null?arrayexpr35.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:204:6: '(' type ')' funcexpr
                    {
                    match(input,12,FOLLOW_12_in_basicexpr1896); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_basicexpr1898);
                    type36=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,14,FOLLOW_14_in_basicexpr1900); if (state.failed) return retval;
                    pushFollow(FOLLOW_funcexpr_in_basicexpr1902);
                    funcexpr37=funcexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 204:28: -> castvalue(type=$type.stvalue=$funcexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("castvalue",
                        new STAttrMap().put("type", (type36!=null?type36.st:null)).put("value", (funcexpr37!=null?funcexpr37.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:205:6: '(' type ')' atom
                    {
                    match(input,12,FOLLOW_12_in_basicexpr1922); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_basicexpr1924);
                    type38=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,14,FOLLOW_14_in_basicexpr1926); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_basicexpr1928);
                    atom39=atom();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 205:24: -> castvalue(type=$type.stvalue=$atom.st)
                      {
                          retval.st = templateLib.getInstanceOf("castvalue",
                        new STAttrMap().put("type", (type38!=null?type38.st:null)).put("value", (atom39!=null?atom39.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:206:6: arrayexpr
                    {
                    pushFollow(FOLLOW_arrayexpr_in_basicexpr1948);
                    arrayexpr40=arrayexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 206:16: -> {$arrayexpr.st}
                      {
                          retval.st = (arrayexpr40!=null?arrayexpr40.st:null);
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:207:6: funcexpr
                    {
                    pushFollow(FOLLOW_funcexpr_in_basicexpr1959);
                    funcexpr41=funcexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 207:15: -> {$funcexpr.st}
                      {
                          retval.st = (funcexpr41!=null?funcexpr41.st:null);
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:208:6: atom
                    {
                    pushFollow(FOLLOW_atom_in_basicexpr1970);
                    atom42=atom();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 208:11: -> {$atom.st}
                      {
                          retval.st = (atom42!=null?atom42.st:null);
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "basicexpr"

    public static class aexpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "aexpr"
    // CMinus.g:211:1: aexpr : (a= basicexpr -> {$a.st}) ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> divide(left=$aexpr.stright=$b.st)) )* ;
    public final CMinusParser.aexpr_return aexpr() throws RecognitionException {
        CMinusParser.aexpr_return retval = new CMinusParser.aexpr_return();
        retval.start = input.LT(1);

        CMinusParser.basicexpr_return a = null;

        CMinusParser.basicexpr_return b = null;


        try {
            // CMinus.g:212:5: ( (a= basicexpr -> {$a.st}) ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> divide(left=$aexpr.stright=$b.st)) )* )
            // CMinus.g:212:9: (a= basicexpr -> {$a.st}) ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> divide(left=$aexpr.stright=$b.st)) )*
            {
            // CMinus.g:212:9: (a= basicexpr -> {$a.st})
            // CMinus.g:212:10: a= basicexpr
            {
            pushFollow(FOLLOW_basicexpr_in_aexpr1993);
            a=basicexpr();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 212:22: -> {$a.st}
              {
                  retval.st = (a!=null?a.st:null);
              }

            }
            }

            // CMinus.g:213:9: ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> divide(left=$aexpr.stright=$b.st)) )*
            loop18:
            do {
                int alt18=5;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    alt18=1;
                    }
                    break;
                case 45:
                    {
                    alt18=2;
                    }
                    break;
                case 46:
                    {
                    alt18=3;
                    }
                    break;
                case 47:
                    {
                    alt18=4;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // CMinus.g:213:10: ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:213:10: ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st))
            	    // CMinus.g:213:12: '+' b= basicexpr
            	    {
            	    match(input,44,FOLLOW_44_in_aexpr2011); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2015);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 213:28: -> add(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("add",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 2 :
            	    // CMinus.g:214:3: ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:214:3: ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st))
            	    // CMinus.g:214:5: '-' b= basicexpr
            	    {
            	    match(input,45,FOLLOW_45_in_aexpr2039); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2043);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 214:21: -> substract(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("substract",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 3 :
            	    // CMinus.g:215:3: ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:215:3: ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st))
            	    // CMinus.g:215:5: '*' b= basicexpr
            	    {
            	    match(input,46,FOLLOW_46_in_aexpr2067); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2071);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 215:21: -> multiply(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("multiply",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 4 :
            	    // CMinus.g:216:3: ( '/' b= basicexpr -> divide(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:216:3: ( '/' b= basicexpr -> divide(left=$aexpr.stright=$b.st))
            	    // CMinus.g:216:5: '/' b= basicexpr
            	    {
            	    match(input,47,FOLLOW_47_in_aexpr2095); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2099);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 216:21: -> divide(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("divide",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aexpr"

    public static class atom_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "atom"
    // CMinus.g:219:1: atom : ( ID -> refVar(id=$ID.text) | INT -> iconst(value=$INT.text) | FP -> iconst(value=$FP.text) | '(' expr ')' -> brackets(expr=$expr.st));
    public final CMinusParser.atom_return atom() throws RecognitionException {
        CMinusParser.atom_return retval = new CMinusParser.atom_return();
        retval.start = input.LT(1);

        Token ID43=null;
        Token INT44=null;
        Token FP45=null;
        CMinusParser.expr_return expr46 = null;


        try {
            // CMinus.g:220:5: ( ID -> refVar(id=$ID.text) | INT -> iconst(value=$INT.text) | FP -> iconst(value=$FP.text) | '(' expr ')' -> brackets(expr=$expr.st))
            int alt19=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt19=1;
                }
                break;
            case INT:
                {
                alt19=2;
                }
                break;
            case FP:
                {
                alt19=3;
                }
                break;
            case 12:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // CMinus.g:220:7: ID
                    {
                    ID43=(Token)match(input,ID,FOLLOW_ID_in_atom2134); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 220:10: -> refVar(id=$ID.text)
                      {
                          retval.st = templateLib.getInstanceOf("refVar",
                        new STAttrMap().put("id", (ID43!=null?ID43.getText():null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:221:7: INT
                    {
                    INT44=(Token)match(input,INT,FOLLOW_INT_in_atom2151); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 221:11: -> iconst(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("iconst",
                        new STAttrMap().put("value", (INT44!=null?INT44.getText():null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:222:4: FP
                    {
                    FP45=(Token)match(input,FP,FOLLOW_FP_in_atom2165); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 222:7: -> iconst(value=$FP.text)
                      {
                          retval.st = templateLib.getInstanceOf("iconst",
                        new STAttrMap().put("value", (FP45!=null?FP45.getText():null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:223:7: '(' expr ')'
                    {
                    match(input,12,FOLLOW_12_in_atom2182); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_atom2184);
                    expr46=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,14,FOLLOW_14_in_atom2186); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 223:20: -> brackets(expr=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("brackets",
                        new STAttrMap().put("expr", (expr46!=null?expr46.st:null)));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    // $ANTLR start synpred21_CMinus
    public final void synpred21_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:122:7: ( expr ';' )
        // CMinus.g:122:7: expr ';'
        {
        pushFollow(FOLLOW_expr_in_synpred21_CMinus907);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred21_CMinus909); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_CMinus

    // $ANTLR start synpred23_CMinus
    public final void synpred23_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:124:7: ( assignStat ';' )
        // CMinus.g:124:7: assignStat ';'
        {
        pushFollow(FOLLOW_assignStat_in_synpred23_CMinus948);
        assignStat();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred23_CMinus950); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_CMinus

    // $ANTLR start synpred25_CMinus
    public final void synpred25_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:162:6: (e1= expr '=' e2= expr )
        // CMinus.g:162:6: e1= expr '=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred25_CMinus1247);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,9,FOLLOW_9_in_synpred25_CMinus1249); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred25_CMinus1253);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_CMinus

    // $ANTLR start synpred26_CMinus
    public final void synpred26_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:163:6: ( expr '++' )
        // CMinus.g:163:6: expr '++'
        {
        pushFollow(FOLLOW_expr_in_synpred26_CMinus1274);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,30,FOLLOW_30_in_synpred26_CMinus1276); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_CMinus

    // $ANTLR start synpred27_CMinus
    public final void synpred27_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:164:6: ( expr '--' )
        // CMinus.g:164:6: expr '--'
        {
        pushFollow(FOLLOW_expr_in_synpred27_CMinus1292);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,31,FOLLOW_31_in_synpred27_CMinus1294); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_CMinus

    // $ANTLR start synpred28_CMinus
    public final void synpred28_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:165:6: (e1= expr '+=' e2= expr )
        // CMinus.g:165:6: e1= expr '+=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred28_CMinus1312);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,32,FOLLOW_32_in_synpred28_CMinus1314); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred28_CMinus1318);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_CMinus

    // $ANTLR start synpred29_CMinus
    public final void synpred29_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:166:6: (e1= expr '-=' e2= expr )
        // CMinus.g:166:6: e1= expr '-=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred29_CMinus1341);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,33,FOLLOW_33_in_synpred29_CMinus1343); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred29_CMinus1347);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_CMinus

    // $ANTLR start synpred30_CMinus
    public final void synpred30_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:167:6: (e1= expr '*=' e2= expr )
        // CMinus.g:167:6: e1= expr '*=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred30_CMinus1370);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,34,FOLLOW_34_in_synpred30_CMinus1372); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred30_CMinus1376);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_CMinus

    // $ANTLR start synpred31_CMinus
    public final void synpred31_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:171:9: ( condExpr )
        // CMinus.g:171:9: condExpr
        {
        pushFollow(FOLLOW_condExpr_in_synpred31_CMinus1433);
        condExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_CMinus

    // $ANTLR start synpred34_CMinus
    public final void synpred34_CMinus_fragment() throws RecognitionException {   
        CMinusParser.condexp_return c1 = null;

        CMinusParser.condexp_return c2 = null;


        // CMinus.g:184:6: (c1= condexp '&&' c2= condexp )
        // CMinus.g:184:6: c1= condexp '&&' c2= condexp
        {
        pushFollow(FOLLOW_condexp_in_synpred34_CMinus1553);
        c1=condexp();

        state._fsp--;
        if (state.failed) return ;
        match(input,36,FOLLOW_36_in_synpred34_CMinus1555); if (state.failed) return ;
        pushFollow(FOLLOW_condexp_in_synpred34_CMinus1559);
        c2=condexp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_CMinus

    // $ANTLR start synpred35_CMinus
    public final void synpred35_CMinus_fragment() throws RecognitionException {   
        CMinusParser.condexp_return c1 = null;

        CMinusParser.condexp_return c2 = null;


        // CMinus.g:185:6: (c1= condexp '||' c2= condexp )
        // CMinus.g:185:6: c1= condexp '||' c2= condexp
        {
        pushFollow(FOLLOW_condexp_in_synpred35_CMinus1581);
        c1=condexp();

        state._fsp--;
        if (state.failed) return ;
        match(input,37,FOLLOW_37_in_synpred35_CMinus1583); if (state.failed) return ;
        pushFollow(FOLLOW_condexp_in_synpred35_CMinus1587);
        c2=condexp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_CMinus

    // Delegated rules

    public final boolean synpred25_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA2_eotS =
        "\15\uffff";
    static final String DFA2_eofS =
        "\15\uffff";
    static final String DFA2_minS =
        "\12\4\1\10\2\uffff";
    static final String DFA2_maxS =
        "\1\27\11\4\1\14\2\uffff";
    static final String DFA2_acceptS =
        "\13\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\11\13\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\3\14\1\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "36:1: declaration : ( variable | f= function );";
        }
    }
    static final String DFA3_eotS =
        "\16\uffff";
    static final String DFA3_eofS =
        "\16\uffff";
    static final String DFA3_minS =
        "\12\4\1\10\3\uffff";
    static final String DFA3_maxS =
        "\1\27\11\4\1\12\3\uffff";
    static final String DFA3_acceptS =
        "\13\uffff\1\1\1\3\1\2";
    static final String DFA3_specialS =
        "\16\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\11\13\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\13\1\15\1\14",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "44:1: variable : ( type declarator ';' -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st) | type declarator '=' expr ';' -> {$function.size()>0 && $function::name==null}? globalVariableInit(type=$type.stname=$declarator.stvalue=$expr.st) -> variableInit(type=$type.stname=$declarator.stvalue=$expr.st) | type declarator '[' expr ']' ';' -> {$function.size()>0 && $function::name==null}? globalArrayDeclaration(type=$type.stname=$declarator.stsize=$expr.st) -> arrayDeclaration(type=$type.stname=$declarator.stsize=$expr.st));";
        }
    }
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\12\uffff\1\13\2\uffff";
    static final String DFA6_minS =
        "\12\4\1\15\2\uffff";
    static final String DFA6_maxS =
        "\1\27\11\4\1\17\2\uffff";
    static final String DFA6_acceptS =
        "\13\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\11\13\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\2\13\1\14",
            "",
            ""
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
            return "83:1: formalParameter : ( type declarator -> parameter(type=$type.stname=$declarator.st) | type declarator '[]' -> arrayparameter(type=$type.stname=$declarator.st));";
        }
    }
    static final String DFA9_eotS =
        "\15\uffff";
    static final String DFA9_eofS =
        "\15\uffff";
    static final String DFA9_minS =
        "\1\4\3\uffff\4\0\5\uffff";
    static final String DFA9_maxS =
        "\1\35\3\uffff\4\0\5\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\4\uffff\1\5\1\7\1\10\1\4\1\6";
    static final String DFA9_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\5\1\6\1\7\1\uffff\1\12\3\uffff\1\4\13\uffff\1\10\1\uffff"+
            "\1\11\1\2\1\3\1\1",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "113:1: stat : ( forStat -> {$forStat.st} | ifStat -> {$ifStat.st} | elseStat -> {$elseStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | assignStat ';' -> {$assignStat.st} | 'return' expr ';' -> return(expr=$expr.st) | ';' -> {new StringTemplate(\";\")});";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_CMinus()) ) {s = 11;}

                        else if ( (synpred23_CMinus()) ) {s = 12;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_CMinus()) ) {s = 11;}

                        else if ( (synpred23_CMinus()) ) {s = 12;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_CMinus()) ) {s = 11;}

                        else if ( (synpred23_CMinus()) ) {s = 12;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_CMinus()) ) {s = 11;}

                        else if ( (synpred23_CMinus()) ) {s = 12;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\14\uffff";
    static final String DFA10_eofS =
        "\14\uffff";
    static final String DFA10_minS =
        "\1\4\4\0\7\uffff";
    static final String DFA10_maxS =
        "\1\14\4\0\7\uffff";
    static final String DFA10_acceptS =
        "\5\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String DFA10_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\7\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\3\1\4\5\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "161:1: assignStat : (e1= expr '=' e2= expr -> assign(lhs=$e1.strhs=$e2.st) | expr '++' -> inkrement(e=$expr.st) | expr '--' -> dekrement(e=$expr.st) | e1= expr '+=' e2= expr -> inkrementby(lhs=$e1.strhs=$e2.st) | e1= expr '-=' e2= expr -> dekrementby(lhs=$e1.strhs=$e2.st) | e1= expr '*=' e2= expr -> assignmultiply(lhs=$e1.strhs=$e2.st) | e1= expr '/=' e2= expr -> assigndivide(lhs=$e1.strhs=$e2.st));";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_CMinus()) ) {s = 5;}

                        else if ( (synpred26_CMinus()) ) {s = 6;}

                        else if ( (synpred27_CMinus()) ) {s = 7;}

                        else if ( (synpred28_CMinus()) ) {s = 8;}

                        else if ( (synpred29_CMinus()) ) {s = 9;}

                        else if ( (synpred30_CMinus()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_CMinus()) ) {s = 5;}

                        else if ( (synpred26_CMinus()) ) {s = 6;}

                        else if ( (synpred27_CMinus()) ) {s = 7;}

                        else if ( (synpred28_CMinus()) ) {s = 8;}

                        else if ( (synpred29_CMinus()) ) {s = 9;}

                        else if ( (synpred30_CMinus()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_CMinus()) ) {s = 5;}

                        else if ( (synpred26_CMinus()) ) {s = 6;}

                        else if ( (synpred27_CMinus()) ) {s = 7;}

                        else if ( (synpred28_CMinus()) ) {s = 8;}

                        else if ( (synpred29_CMinus()) ) {s = 9;}

                        else if ( (synpred30_CMinus()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_CMinus()) ) {s = 5;}

                        else if ( (synpred26_CMinus()) ) {s = 6;}

                        else if ( (synpred27_CMinus()) ) {s = 7;}

                        else if ( (synpred28_CMinus()) ) {s = 8;}

                        else if ( (synpred29_CMinus()) ) {s = 9;}

                        else if ( (synpred30_CMinus()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\25\uffff";
    static final String DFA17_eofS =
        "\2\uffff\1\3\14\uffff\1\3\1\uffff\1\22\3\uffff";
    static final String DFA17_minS =
        "\2\4\1\10\1\uffff\1\12\10\16\2\uffff\2\4\1\10\3\uffff";
    static final String DFA17_maxS =
        "\1\14\1\27\1\57\1\uffff\1\57\10\16\2\uffff\1\57\1\14\1\57\3\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\6\11\uffff\1\4\1\5\3\uffff\1\3\1\1\1\2";
    static final String DFA17_specialS =
        "\25\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\2\3\5\uffff\1\1",
            "\1\4\2\3\5\uffff\1\3\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1"+
            "\13\1\14",
            "\2\3\1\15\1\3\1\16\2\3\17\uffff\22\3",
            "",
            "\1\3\1\uffff\1\3\1\uffff\1\17\25\uffff\14\3",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "",
            "",
            "\1\21\2\22\1\uffff\2\3\1\uffff\1\3\1\22\2\3\17\uffff\22\3",
            "\1\21\2\22\5\uffff\1\22",
            "\2\22\1\23\1\22\1\24\2\22\17\uffff\22\22",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "202:1: basicexpr : ( '(' type ')' arrayexpr -> castvalue(type=$type.stvalue=$arrayexpr.st) | '(' type ')' funcexpr -> castvalue(type=$type.stvalue=$funcexpr.st) | '(' type ')' atom -> castvalue(type=$type.stvalue=$atom.st) | arrayexpr -> {$arrayexpr.st} | funcexpr -> {$funcexpr.st} | atom -> {$atom.st});";
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_program61 = new BitSet(new long[]{0x0000000000FF0012L});
    public static final BitSet FOLLOW_variable_in_declaration102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable144 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable210 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_variable212 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_variable214 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable285 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_variable287 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_variable289 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_variable291 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarator375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_function412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function414 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_function426 = new BitSet(new long[]{0x0000000000FF4010L});
    public static final BitSet FOLLOW_formalParameter_in_function432 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_function436 = new BitSet(new long[]{0x0000000000FF0010L});
    public static final BitSet FOLLOW_formalParameter_in_function440 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_function448 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_block_in_function458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameter574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_formalParameter576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameter605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_formalParameter607 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_formalParameter609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_castexpr647 = new BitSet(new long[]{0x0000000000FF0010L});
    public static final BitSet FOLLOW_type_in_castexpr649 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_castexpr651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_type676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_type693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_type706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_type719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_type732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_type745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_type758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_type771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_block818 = new BitSet(new long[]{0x000000003FFF1170L});
    public static final BitSet FOLLOW_variable_in_block829 = new BitSet(new long[]{0x000000003FFF1170L});
    public static final BitSet FOLLOW_stat_in_block835 = new BitSet(new long[]{0x000000003FFF1170L});
    public static final BitSet FOLLOW_25_in_block848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStat_in_stat877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStat_in_stat886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseStat_in_stat895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat907 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stat909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_stat926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_stat948 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stat950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_stat959 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_stat961 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stat963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_stat980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ifStat1014 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ifStat1016 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_condExpr_in_ifStat1020 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ifStat1022 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_block_in_ifStat1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_elseStat1100 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_block_in_elseStat1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_forStat1153 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_forStat1155 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_assignStat_in_forStat1159 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_forStat1161 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_forStat1165 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_forStat1167 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_assignStat_in_forStat1171 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_forStat1173 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_block_in_forStat1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1247 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_assignStat1249 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_assignStat1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1274 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_assignStat1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1292 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_assignStat1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1312 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_assignStat1314 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_assignStat1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1341 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_assignStat1343 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_assignStat1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1370 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_assignStat1372 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_assignStat1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1399 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_assignStat1401 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_assignStat1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_expr1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_expr1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arrayexpr1464 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_arrayexpr1466 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_arrayexpr1468 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_arrayexpr1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcexpr1500 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_funcexpr1502 = new BitSet(new long[]{0x0000000000005070L});
    public static final BitSet FOLLOW_aexpr_in_funcexpr1508 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_funcexpr1512 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_funcexpr1516 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_funcexpr1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_condExpr1553 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_condExpr1555 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_condexp_in_condExpr1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_condExpr1581 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_condExpr1583 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_condexp_in_condExpr1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_condExpr1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condexp1631 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_38_in_condexp1648 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_condexp1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_condexp1682 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_condexp1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_condexp1709 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_condexp1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_condexp1736 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_condexp1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_condexp1763 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_condexp1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_condexp1790 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_condexp1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_basicexpr1870 = new BitSet(new long[]{0x0000000000FF0010L});
    public static final BitSet FOLLOW_type_in_basicexpr1872 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_basicexpr1874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_arrayexpr_in_basicexpr1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_basicexpr1896 = new BitSet(new long[]{0x0000000000FF0010L});
    public static final BitSet FOLLOW_type_in_basicexpr1898 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_basicexpr1900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_funcexpr_in_basicexpr1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_basicexpr1922 = new BitSet(new long[]{0x0000000000FF0010L});
    public static final BitSet FOLLOW_type_in_basicexpr1924 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_basicexpr1926 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_atom_in_basicexpr1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayexpr_in_basicexpr1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcexpr_in_basicexpr1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_basicexpr1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr1993 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_44_in_aexpr2011 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2015 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_45_in_aexpr2039 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2043 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_46_in_aexpr2067 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2071 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_47_in_aexpr2095 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2099 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ID_in_atom2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FP_in_atom2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_atom2182 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_atom2184 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_atom2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred21_CMinus907 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred21_CMinus909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_synpred23_CMinus948 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred23_CMinus950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred25_CMinus1247 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_synpred25_CMinus1249 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_synpred25_CMinus1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred26_CMinus1274 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred26_CMinus1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred27_CMinus1292 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred27_CMinus1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred28_CMinus1312 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred28_CMinus1314 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_synpred28_CMinus1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred29_CMinus1341 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred29_CMinus1343 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_synpred29_CMinus1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred30_CMinus1370 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred30_CMinus1372 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_synpred30_CMinus1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_synpred31_CMinus1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_synpred34_CMinus1553 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_synpred34_CMinus1555 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_condexp_in_synpred34_CMinus1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_synpred35_CMinus1581 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred35_CMinus1583 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_condexp_in_synpred35_CMinus1587 = new BitSet(new long[]{0x0000000000000002L});

}