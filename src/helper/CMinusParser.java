package helper;

// $ANTLR 3.1.1 CMinus.g 2017-02-21 13:41:11

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "FP", "WS", "';'", "'='", "'['", "']'", "'('", "','", "')'", "'[]'", "'int'", "'char'", "'float'", "'double'", "'int[]'", "'char[]'", "'float[]'", "'double[]'", "'{'", "'}'", "'return'", "'if'", "'for'", "'++'", "'--'", "'+='", "'-='", "'&&'", "'||'", "'=='", "'<'", "'<='", "'>='", "'>'", "'!='", "'+'", "'-'", "'*'", "'/'"
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

                    if ( ((LA8_3>=8 && LA8_3<=10)||(LA8_3>=29 && LA8_3<=44)) ) {
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
    // CMinus.g:113:1: stat : ( forStat -> {$forStat.st} | ifStat -> {$ifStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | assignStat ';' -> {$assignStat.st} | 'return' expr ';' -> return(expr=$expr.st) | ';' -> {new StringTemplate(\";\")});
    public final CMinusParser.stat_return stat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.stat_return retval = new CMinusParser.stat_return();
        retval.start = input.LT(1);

        CMinusParser.forStat_return forStat21 = null;

        CMinusParser.ifStat_return ifStat22 = null;

        CMinusParser.expr_return expr23 = null;

        CMinusParser.assignStat_return assignStat24 = null;

        CMinusParser.expr_return expr25 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:119:5: ( forStat -> {$forStat.st} | ifStat -> {$ifStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | assignStat ';' -> {$assignStat.st} | 'return' expr ';' -> return(expr=$expr.st) | ';' -> {new StringTemplate(\";\")})
            int alt9=7;
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
                    // CMinus.g:121:7: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_stat898);
                    expr23=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_stat900); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 121:16: -> statement(expr=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("statement",
                        new STAttrMap().put("expr", (expr23!=null?expr23.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:122:7: block
                    {
                    pushFollow(FOLLOW_block_in_stat917);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 122:13: -> statementList(locals=$slist::localsstats=$slist::stats)
                      {
                          retval.st = templateLib.getInstanceOf("statementList",
                        new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:123:7: assignStat ';'
                    {
                    pushFollow(FOLLOW_assignStat_in_stat939);
                    assignStat24=assignStat();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_stat941); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 123:22: -> {$assignStat.st}
                      {
                          retval.st = (assignStat24!=null?assignStat24.st:null);
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:124:4: 'return' expr ';'
                    {
                    match(input,26,FOLLOW_26_in_stat950); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_stat952);
                    expr25=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_stat954); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 124:22: -> return(expr=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("return",
                        new STAttrMap().put("expr", (expr25!=null?expr25.st:null)));
                      }

                    }
                    }
                    break;
                case 7 :
                    // CMinus.g:125:7: ';'
                    {
                    match(input,8,FOLLOW_8_in_stat971); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 125:11: -> {new StringTemplate(\";\")}
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
    // CMinus.g:128:1: ifStat : 'if' '(' e= condExpr ')' block -> ifBlock(e=$e.stlocals=$slist::localsstats=$slist::stats);
    public final CMinusParser.ifStat_return ifStat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.ifStat_return retval = new CMinusParser.ifStat_return();
        retval.start = input.LT(1);

        CMinusParser.condExpr_return e = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:134:5: ( 'if' '(' e= condExpr ')' block -> ifBlock(e=$e.stlocals=$slist::localsstats=$slist::stats))
            // CMinus.g:134:9: 'if' '(' e= condExpr ')' block
            {
            match(input,27,FOLLOW_27_in_ifStat1005); if (state.failed) return retval;
            match(input,12,FOLLOW_12_in_ifStat1007); if (state.failed) return retval;
            pushFollow(FOLLOW_condExpr_in_ifStat1011);
            e=condExpr();

            state._fsp--;
            if (state.failed) return retval;
            match(input,14,FOLLOW_14_in_ifStat1013); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_ifStat1015);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 135:9: -> ifBlock(e=$e.stlocals=$slist::localsstats=$slist::stats)
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

    public static class forStat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forStat"
    // CMinus.g:139:1: forStat : 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats);
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
            // CMinus.g:145:5: ( 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats))
            // CMinus.g:145:9: 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block
            {
            match(input,28,FOLLOW_28_in_forStat1090); if (state.failed) return retval;
            match(input,12,FOLLOW_12_in_forStat1092); if (state.failed) return retval;
            pushFollow(FOLLOW_assignStat_in_forStat1096);
            e1=assignStat();

            state._fsp--;
            if (state.failed) return retval;
            match(input,8,FOLLOW_8_in_forStat1098); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_forStat1102);
            e2=expr();

            state._fsp--;
            if (state.failed) return retval;
            match(input,8,FOLLOW_8_in_forStat1104); if (state.failed) return retval;
            pushFollow(FOLLOW_assignStat_in_forStat1108);
            e3=assignStat();

            state._fsp--;
            if (state.failed) return retval;
            match(input,14,FOLLOW_14_in_forStat1110); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_forStat1112);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 146:9: -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats)
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
    // CMinus.g:150:1: assignStat : (e1= expr '=' e2= expr -> assign(lhs=$e1.strhs=$e2.st) | expr '++' -> inkrement(e=$expr.st) | expr '--' -> dekrement(e=$expr.st) | e1= expr '+=' e2= expr -> inkrementby(lhs=$e1.strhs=$e2.st) | e1= expr '-=' e2= expr -> dekrementby(lhs=$e1.strhs=$e2.st));
    public final CMinusParser.assignStat_return assignStat() throws RecognitionException {
        CMinusParser.assignStat_return retval = new CMinusParser.assignStat_return();
        retval.start = input.LT(1);

        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;

        CMinusParser.expr_return expr26 = null;

        CMinusParser.expr_return expr27 = null;


        try {
            // CMinus.g:151:2: (e1= expr '=' e2= expr -> assign(lhs=$e1.strhs=$e2.st) | expr '++' -> inkrement(e=$expr.st) | expr '--' -> dekrement(e=$expr.st) | e1= expr '+=' e2= expr -> inkrementby(lhs=$e1.strhs=$e2.st) | e1= expr '-=' e2= expr -> dekrementby(lhs=$e1.strhs=$e2.st))
            int alt10=5;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // CMinus.g:151:6: e1= expr '=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1184);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,9,FOLLOW_9_in_assignStat1186); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1190);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 151:26: -> assign(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("assign",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:152:6: expr '++'
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1211);
                    expr26=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,29,FOLLOW_29_in_assignStat1213); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 152:16: -> inkrement(e=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("inkrement",
                        new STAttrMap().put("e", (expr26!=null?expr26.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:153:6: expr '--'
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1229);
                    expr27=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,30,FOLLOW_30_in_assignStat1231); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 153:16: -> dekrement(e=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("dekrement",
                        new STAttrMap().put("e", (expr27!=null?expr27.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:154:6: e1= expr '+=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1249);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,31,FOLLOW_31_in_assignStat1251); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1255);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 154:27: -> inkrementby(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("inkrementby",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:155:6: e1= expr '-=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1278);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,32,FOLLOW_32_in_assignStat1280); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1284);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 155:27: -> dekrementby(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("dekrementby",
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
    // CMinus.g:158:1: expr : ( condExpr -> {$condExpr.st} | arrayexpr -> {$arrayexpr.st} | aexpr -> {$aexpr.st});
    public final CMinusParser.expr_return expr() throws RecognitionException {
        CMinusParser.expr_return retval = new CMinusParser.expr_return();
        retval.start = input.LT(1);

        CMinusParser.condExpr_return condExpr28 = null;

        CMinusParser.arrayexpr_return arrayexpr29 = null;

        CMinusParser.aexpr_return aexpr30 = null;


        try {
            // CMinus.g:158:5: ( condExpr -> {$condExpr.st} | arrayexpr -> {$arrayexpr.st} | aexpr -> {$aexpr.st})
            int alt11=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                int LA11_1 = input.LA(2);

                if ( (synpred28_CMinus()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=3;
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

                if ( (synpred28_CMinus()) ) {
                    alt11=1;
                }
                else if ( (synpred29_CMinus()) ) {
                    alt11=2;
                }
                else if ( (true) ) {
                    alt11=3;
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

                if ( (synpred28_CMinus()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=3;
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

                if ( (synpred28_CMinus()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=3;
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
                    // CMinus.g:158:9: condExpr
                    {
                    pushFollow(FOLLOW_condExpr_in_expr1312);
                    condExpr28=condExpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 158:18: -> {$condExpr.st}
                      {
                          retval.st = (condExpr28!=null?condExpr28.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:159:9: arrayexpr
                    {
                    pushFollow(FOLLOW_arrayexpr_in_expr1326);
                    arrayexpr29=arrayexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 159:19: -> {$arrayexpr.st}
                      {
                          retval.st = (arrayexpr29!=null?arrayexpr29.st:null);
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:160:6: aexpr
                    {
                    pushFollow(FOLLOW_aexpr_in_expr1337);
                    aexpr30=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 160:12: -> {$aexpr.st}
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
    // CMinus.g:163:1: arrayexpr : ID '[' aexpr ']' -> array(name=$ID.textindex=$aexpr.st);
    public final CMinusParser.arrayexpr_return arrayexpr() throws RecognitionException {
        CMinusParser.arrayexpr_return retval = new CMinusParser.arrayexpr_return();
        retval.start = input.LT(1);

        Token ID31=null;
        CMinusParser.aexpr_return aexpr32 = null;


        try {
            // CMinus.g:164:2: ( ID '[' aexpr ']' -> array(name=$ID.textindex=$aexpr.st))
            // CMinus.g:164:6: ID '[' aexpr ']'
            {
            ID31=(Token)match(input,ID,FOLLOW_ID_in_arrayexpr1357); if (state.failed) return retval;
            match(input,10,FOLLOW_10_in_arrayexpr1359); if (state.failed) return retval;
            pushFollow(FOLLOW_aexpr_in_arrayexpr1361);
            aexpr32=aexpr();

            state._fsp--;
            if (state.failed) return retval;
            match(input,11,FOLLOW_11_in_arrayexpr1363); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 164:23: -> array(name=$ID.textindex=$aexpr.st)
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

    public static class condExpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "condExpr"
    // CMinus.g:167:1: condExpr : (c1= condexp '&&' c2= condexp -> conjunction(left=$c1.stright=$c2.st) | c1= condexp '||' c2= condexp -> disjunction(left=$c1.stright=$c2.st) | c= condexp -> {$condexp.st});
    public final CMinusParser.condExpr_return condExpr() throws RecognitionException {
        CMinusParser.condExpr_return retval = new CMinusParser.condExpr_return();
        retval.start = input.LT(1);

        CMinusParser.condexp_return c1 = null;

        CMinusParser.condexp_return c2 = null;

        CMinusParser.condexp_return c = null;


        try {
            // CMinus.g:168:2: (c1= condexp '&&' c2= condexp -> conjunction(left=$c1.stright=$c2.st) | c1= condexp '||' c2= condexp -> disjunction(left=$c1.stright=$c2.st) | c= condexp -> {$condexp.st})
            int alt12=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                int LA12_1 = input.LA(2);

                if ( (synpred30_CMinus()) ) {
                    alt12=1;
                }
                else if ( (synpred31_CMinus()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA12_2 = input.LA(2);

                if ( (synpred30_CMinus()) ) {
                    alt12=1;
                }
                else if ( (synpred31_CMinus()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT:
                {
                int LA12_3 = input.LA(2);

                if ( (synpred30_CMinus()) ) {
                    alt12=1;
                }
                else if ( (synpred31_CMinus()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;
                }
                }
                break;
            case FP:
                {
                int LA12_4 = input.LA(2);

                if ( (synpred30_CMinus()) ) {
                    alt12=1;
                }
                else if ( (synpred31_CMinus()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // CMinus.g:168:6: c1= condexp '&&' c2= condexp
                    {
                    pushFollow(FOLLOW_condexp_in_condExpr1392);
                    c1=condexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,33,FOLLOW_33_in_condExpr1394); if (state.failed) return retval;
                    pushFollow(FOLLOW_condexp_in_condExpr1398);
                    c2=condexp();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 168:33: -> conjunction(left=$c1.stright=$c2.st)
                      {
                          retval.st = templateLib.getInstanceOf("conjunction",
                        new STAttrMap().put("left", (c1!=null?c1.st:null)).put("right", (c2!=null?c2.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:169:6: c1= condexp '||' c2= condexp
                    {
                    pushFollow(FOLLOW_condexp_in_condExpr1420);
                    c1=condexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,34,FOLLOW_34_in_condExpr1422); if (state.failed) return retval;
                    pushFollow(FOLLOW_condexp_in_condExpr1426);
                    c2=condexp();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 169:33: -> disjunction(left=$c1.stright=$c2.st)
                      {
                          retval.st = templateLib.getInstanceOf("disjunction",
                        new STAttrMap().put("left", (c1!=null?c1.st:null)).put("right", (c2!=null?c2.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:170:6: c= condexp
                    {
                    pushFollow(FOLLOW_condexp_in_condExpr1448);
                    c=condexp();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 170:16: -> {$condexp.st}
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
    // CMinus.g:173:1: condexp : a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st}) ;
    public final CMinusParser.condexp_return condexp() throws RecognitionException {
        CMinusParser.condexp_return retval = new CMinusParser.condexp_return();
        retval.start = input.LT(1);

        CMinusParser.aexpr_return a = null;

        CMinusParser.aexpr_return b = null;


        try {
            // CMinus.g:174:5: (a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st}) )
            // CMinus.g:174:9: a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st})
            {
            pushFollow(FOLLOW_aexpr_in_condexp1470);
            a=aexpr();

            state._fsp--;
            if (state.failed) return retval;
            // CMinus.g:175:9: ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st})
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=35 && LA14_0<=40)) ) {
                alt14=1;
            }
            else if ( (LA14_0==EOF||(LA14_0>=8 && LA14_0<=9)||LA14_0==11||LA14_0==14||(LA14_0>=29 && LA14_0<=34)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // CMinus.g:175:13: ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st))
                    {
                    // CMinus.g:175:13: ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st))
                    int alt13=6;
                    switch ( input.LA(1) ) {
                    case 35:
                        {
                        alt13=1;
                        }
                        break;
                    case 36:
                        {
                        alt13=2;
                        }
                        break;
                    case 37:
                        {
                        alt13=3;
                        }
                        break;
                    case 38:
                        {
                        alt13=4;
                        }
                        break;
                    case 39:
                        {
                        alt13=5;
                        }
                        break;
                    case 40:
                        {
                        alt13=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // CMinus.g:175:16: '==' b= aexpr
                            {
                            match(input,35,FOLLOW_35_in_condexp1487); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp1491);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 175:29: -> equals(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("equals",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 2 :
                            // CMinus.g:176:16: '<' b= aexpr
                            {
                            match(input,36,FOLLOW_36_in_condexp1521); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp1525);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 176:30: -> lessThan(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("lessThan",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 3 :
                            // CMinus.g:177:7: '<=' b= aexpr
                            {
                            match(input,37,FOLLOW_37_in_condexp1548); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp1552);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 177:22: -> lessOrEqual(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("lessOrEqual",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 4 :
                            // CMinus.g:178:7: '>=' b= aexpr
                            {
                            match(input,38,FOLLOW_38_in_condexp1575); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp1579);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 178:22: -> moreOrEqual(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("moreOrEqual",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 5 :
                            // CMinus.g:179:7: '>' b= aexpr
                            {
                            match(input,39,FOLLOW_39_in_condexp1602); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp1606);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 179:21: -> moreThan(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("moreThan",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 6 :
                            // CMinus.g:180:7: '!=' b= aexpr
                            {
                            match(input,40,FOLLOW_40_in_condexp1629); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp1633);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 180:22: -> unEqual(left=$a.stright=$b.st)
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
                    // CMinus.g:182:13: 
                    {

                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 182:13: -> {$a.st}
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
    // CMinus.g:186:1: basicexpr : ( '(' type ')' arrayexpr -> castvalue(type=$type.stvalue=$arrayexpr.st) | '(' type ')' atom -> castvalue(type=$type.stvalue=$atom.st) | arrayexpr -> {$arrayexpr.st} | atom -> {$atom.st});
    public final CMinusParser.basicexpr_return basicexpr() throws RecognitionException {
        CMinusParser.basicexpr_return retval = new CMinusParser.basicexpr_return();
        retval.start = input.LT(1);

        CMinusParser.type_return type33 = null;

        CMinusParser.arrayexpr_return arrayexpr34 = null;

        CMinusParser.type_return type35 = null;

        CMinusParser.atom_return atom36 = null;

        CMinusParser.arrayexpr_return arrayexpr37 = null;

        CMinusParser.atom_return atom38 = null;


        try {
            // CMinus.g:187:5: ( '(' type ')' arrayexpr -> castvalue(type=$type.stvalue=$arrayexpr.st) | '(' type ')' atom -> castvalue(type=$type.stvalue=$atom.st) | arrayexpr -> {$arrayexpr.st} | atom -> {$atom.st})
            int alt15=4;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // CMinus.g:187:9: '(' type ')' arrayexpr
                    {
                    match(input,12,FOLLOW_12_in_basicexpr1709); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_basicexpr1711);
                    type33=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,14,FOLLOW_14_in_basicexpr1713); if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayexpr_in_basicexpr1715);
                    arrayexpr34=arrayexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 187:32: -> castvalue(type=$type.stvalue=$arrayexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("castvalue",
                        new STAttrMap().put("type", (type33!=null?type33.st:null)).put("value", (arrayexpr34!=null?arrayexpr34.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:188:6: '(' type ')' atom
                    {
                    match(input,12,FOLLOW_12_in_basicexpr1735); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_basicexpr1737);
                    type35=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,14,FOLLOW_14_in_basicexpr1739); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_basicexpr1741);
                    atom36=atom();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 188:24: -> castvalue(type=$type.stvalue=$atom.st)
                      {
                          retval.st = templateLib.getInstanceOf("castvalue",
                        new STAttrMap().put("type", (type35!=null?type35.st:null)).put("value", (atom36!=null?atom36.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:189:6: arrayexpr
                    {
                    pushFollow(FOLLOW_arrayexpr_in_basicexpr1761);
                    arrayexpr37=arrayexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 189:16: -> {$arrayexpr.st}
                      {
                          retval.st = (arrayexpr37!=null?arrayexpr37.st:null);
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:190:6: atom
                    {
                    pushFollow(FOLLOW_atom_in_basicexpr1772);
                    atom38=atom();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 190:11: -> {$atom.st}
                      {
                          retval.st = (atom38!=null?atom38.st:null);
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
    // CMinus.g:193:1: aexpr : (a= basicexpr -> {$a.st}) ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> divide(left=$aexpr.stright=$b.st)) )* ;
    public final CMinusParser.aexpr_return aexpr() throws RecognitionException {
        CMinusParser.aexpr_return retval = new CMinusParser.aexpr_return();
        retval.start = input.LT(1);

        CMinusParser.basicexpr_return a = null;

        CMinusParser.basicexpr_return b = null;


        try {
            // CMinus.g:194:5: ( (a= basicexpr -> {$a.st}) ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> divide(left=$aexpr.stright=$b.st)) )* )
            // CMinus.g:194:9: (a= basicexpr -> {$a.st}) ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> divide(left=$aexpr.stright=$b.st)) )*
            {
            // CMinus.g:194:9: (a= basicexpr -> {$a.st})
            // CMinus.g:194:10: a= basicexpr
            {
            pushFollow(FOLLOW_basicexpr_in_aexpr1795);
            a=basicexpr();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 194:22: -> {$a.st}
              {
                  retval.st = (a!=null?a.st:null);
              }

            }
            }

            // CMinus.g:195:9: ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> divide(left=$aexpr.stright=$b.st)) )*
            loop16:
            do {
                int alt16=5;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    alt16=1;
                    }
                    break;
                case 42:
                    {
                    alt16=2;
                    }
                    break;
                case 43:
                    {
                    alt16=3;
                    }
                    break;
                case 44:
                    {
                    alt16=4;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // CMinus.g:195:10: ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:195:10: ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st))
            	    // CMinus.g:195:12: '+' b= basicexpr
            	    {
            	    match(input,41,FOLLOW_41_in_aexpr1813); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr1817);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 195:28: -> add(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("add",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 2 :
            	    // CMinus.g:196:3: ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:196:3: ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st))
            	    // CMinus.g:196:5: '-' b= basicexpr
            	    {
            	    match(input,42,FOLLOW_42_in_aexpr1841); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr1845);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 196:21: -> substract(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("substract",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 3 :
            	    // CMinus.g:197:3: ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:197:3: ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st))
            	    // CMinus.g:197:5: '*' b= basicexpr
            	    {
            	    match(input,43,FOLLOW_43_in_aexpr1869); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr1873);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 197:21: -> multiply(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("multiply",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 4 :
            	    // CMinus.g:198:3: ( '/' b= basicexpr -> divide(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:198:3: ( '/' b= basicexpr -> divide(left=$aexpr.stright=$b.st))
            	    // CMinus.g:198:5: '/' b= basicexpr
            	    {
            	    match(input,44,FOLLOW_44_in_aexpr1897); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr1901);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 198:21: -> divide(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("divide",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // CMinus.g:201:1: atom : ( ID -> refVar(id=$ID.text) | INT -> iconst(value=$INT.text) | FP -> iconst(value=$FP.text) | '(' expr ')' -> brackets(expr=$expr.st));
    public final CMinusParser.atom_return atom() throws RecognitionException {
        CMinusParser.atom_return retval = new CMinusParser.atom_return();
        retval.start = input.LT(1);

        Token ID39=null;
        Token INT40=null;
        Token FP41=null;
        CMinusParser.expr_return expr42 = null;


        try {
            // CMinus.g:202:5: ( ID -> refVar(id=$ID.text) | INT -> iconst(value=$INT.text) | FP -> iconst(value=$FP.text) | '(' expr ')' -> brackets(expr=$expr.st))
            int alt17=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt17=1;
                }
                break;
            case INT:
                {
                alt17=2;
                }
                break;
            case FP:
                {
                alt17=3;
                }
                break;
            case 12:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // CMinus.g:202:7: ID
                    {
                    ID39=(Token)match(input,ID,FOLLOW_ID_in_atom1936); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 202:10: -> refVar(id=$ID.text)
                      {
                          retval.st = templateLib.getInstanceOf("refVar",
                        new STAttrMap().put("id", (ID39!=null?ID39.getText():null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:203:7: INT
                    {
                    INT40=(Token)match(input,INT,FOLLOW_INT_in_atom1953); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 203:11: -> iconst(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("iconst",
                        new STAttrMap().put("value", (INT40!=null?INT40.getText():null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:204:4: FP
                    {
                    FP41=(Token)match(input,FP,FOLLOW_FP_in_atom1967); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 204:7: -> iconst(value=$FP.text)
                      {
                          retval.st = templateLib.getInstanceOf("iconst",
                        new STAttrMap().put("value", (FP41!=null?FP41.getText():null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:205:7: '(' expr ')'
                    {
                    match(input,12,FOLLOW_12_in_atom1984); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_atom1986);
                    expr42=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,14,FOLLOW_14_in_atom1988); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 205:20: -> brackets(expr=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("brackets",
                        new STAttrMap().put("expr", (expr42!=null?expr42.st:null)));
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

    // $ANTLR start synpred20_CMinus
    public final void synpred20_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:121:7: ( expr ';' )
        // CMinus.g:121:7: expr ';'
        {
        pushFollow(FOLLOW_expr_in_synpred20_CMinus898);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred20_CMinus900); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_CMinus

    // $ANTLR start synpred22_CMinus
    public final void synpred22_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:123:7: ( assignStat ';' )
        // CMinus.g:123:7: assignStat ';'
        {
        pushFollow(FOLLOW_assignStat_in_synpred22_CMinus939);
        assignStat();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred22_CMinus941); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_CMinus

    // $ANTLR start synpred24_CMinus
    public final void synpred24_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:151:6: (e1= expr '=' e2= expr )
        // CMinus.g:151:6: e1= expr '=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred24_CMinus1184);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,9,FOLLOW_9_in_synpred24_CMinus1186); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred24_CMinus1190);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_CMinus

    // $ANTLR start synpred25_CMinus
    public final void synpred25_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:152:6: ( expr '++' )
        // CMinus.g:152:6: expr '++'
        {
        pushFollow(FOLLOW_expr_in_synpred25_CMinus1211);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,29,FOLLOW_29_in_synpred25_CMinus1213); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_CMinus

    // $ANTLR start synpred26_CMinus
    public final void synpred26_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:153:6: ( expr '--' )
        // CMinus.g:153:6: expr '--'
        {
        pushFollow(FOLLOW_expr_in_synpred26_CMinus1229);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,30,FOLLOW_30_in_synpred26_CMinus1231); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_CMinus

    // $ANTLR start synpred27_CMinus
    public final void synpred27_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:154:6: (e1= expr '+=' e2= expr )
        // CMinus.g:154:6: e1= expr '+=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred27_CMinus1249);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,31,FOLLOW_31_in_synpred27_CMinus1251); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred27_CMinus1255);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_CMinus

    // $ANTLR start synpred28_CMinus
    public final void synpred28_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:158:9: ( condExpr )
        // CMinus.g:158:9: condExpr
        {
        pushFollow(FOLLOW_condExpr_in_synpred28_CMinus1312);
        condExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_CMinus

    // $ANTLR start synpred29_CMinus
    public final void synpred29_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:159:9: ( arrayexpr )
        // CMinus.g:159:9: arrayexpr
        {
        pushFollow(FOLLOW_arrayexpr_in_synpred29_CMinus1326);
        arrayexpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_CMinus

    // $ANTLR start synpred30_CMinus
    public final void synpred30_CMinus_fragment() throws RecognitionException {   
        CMinusParser.condexp_return c1 = null;

        CMinusParser.condexp_return c2 = null;


        // CMinus.g:168:6: (c1= condexp '&&' c2= condexp )
        // CMinus.g:168:6: c1= condexp '&&' c2= condexp
        {
        pushFollow(FOLLOW_condexp_in_synpred30_CMinus1392);
        c1=condexp();

        state._fsp--;
        if (state.failed) return ;
        match(input,33,FOLLOW_33_in_synpred30_CMinus1394); if (state.failed) return ;
        pushFollow(FOLLOW_condexp_in_synpred30_CMinus1398);
        c2=condexp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_CMinus

    // $ANTLR start synpred31_CMinus
    public final void synpred31_CMinus_fragment() throws RecognitionException {   
        CMinusParser.condexp_return c1 = null;

        CMinusParser.condexp_return c2 = null;


        // CMinus.g:169:6: (c1= condexp '||' c2= condexp )
        // CMinus.g:169:6: c1= condexp '||' c2= condexp
        {
        pushFollow(FOLLOW_condexp_in_synpred31_CMinus1420);
        c1=condexp();

        state._fsp--;
        if (state.failed) return ;
        match(input,34,FOLLOW_34_in_synpred31_CMinus1422); if (state.failed) return ;
        pushFollow(FOLLOW_condexp_in_synpred31_CMinus1426);
        c2=condexp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_CMinus

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
    public final boolean synpred22_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_CMinus_fragment(); // can never throw exception
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
    protected DFA15 dfa15 = new DFA15(this);
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
        "\14\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\4\2\uffff\4\0\5\uffff";
    static final String DFA9_maxS =
        "\1\34\2\uffff\4\0\5\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\4\uffff\1\4\1\6\1\7\1\3\1\5";
    static final String DFA9_specialS =
        "\3\uffff\1\0\1\1\1\2\1\3\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\4\1\5\1\6\1\uffff\1\11\3\uffff\1\3\13\uffff\1\7\1\uffff"+
            "\1\10\1\2\1\1",
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
            return "113:1: stat : ( forStat -> {$forStat.st} | ifStat -> {$ifStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | assignStat ';' -> {$assignStat.st} | 'return' expr ';' -> return(expr=$expr.st) | ';' -> {new StringTemplate(\";\")});";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_CMinus()) ) {s = 10;}

                        else if ( (synpred22_CMinus()) ) {s = 11;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_CMinus()) ) {s = 10;}

                        else if ( (synpred22_CMinus()) ) {s = 11;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_CMinus()) ) {s = 10;}

                        else if ( (synpred22_CMinus()) ) {s = 11;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_CMinus()) ) {s = 10;}

                        else if ( (synpred22_CMinus()) ) {s = 11;}

                         
                        input.seek(index9_6);
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
        "\12\uffff";
    static final String DFA10_eofS =
        "\12\uffff";
    static final String DFA10_minS =
        "\1\4\4\0\5\uffff";
    static final String DFA10_maxS =
        "\1\14\4\0\5\uffff";
    static final String DFA10_acceptS =
        "\5\uffff\1\1\1\2\1\3\1\4\1\5";
    static final String DFA10_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\5\uffff}>";
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
            return "150:1: assignStat : (e1= expr '=' e2= expr -> assign(lhs=$e1.strhs=$e2.st) | expr '++' -> inkrement(e=$expr.st) | expr '--' -> dekrement(e=$expr.st) | e1= expr '+=' e2= expr -> inkrementby(lhs=$e1.strhs=$e2.st) | e1= expr '-=' e2= expr -> dekrementby(lhs=$e1.strhs=$e2.st));";
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
                        if ( (synpred24_CMinus()) ) {s = 5;}

                        else if ( (synpred25_CMinus()) ) {s = 6;}

                        else if ( (synpred26_CMinus()) ) {s = 7;}

                        else if ( (synpred27_CMinus()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_CMinus()) ) {s = 5;}

                        else if ( (synpred25_CMinus()) ) {s = 6;}

                        else if ( (synpred26_CMinus()) ) {s = 7;}

                        else if ( (synpred27_CMinus()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_CMinus()) ) {s = 5;}

                        else if ( (synpred25_CMinus()) ) {s = 6;}

                        else if ( (synpred26_CMinus()) ) {s = 7;}

                        else if ( (synpred27_CMinus()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_CMinus()) ) {s = 5;}

                        else if ( (synpred25_CMinus()) ) {s = 6;}

                        else if ( (synpred26_CMinus()) ) {s = 7;}

                        else if ( (synpred27_CMinus()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
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
    static final String DFA15_eotS =
        "\23\uffff";
    static final String DFA15_eofS =
        "\2\uffff\1\3\13\uffff\1\3\1\uffff\1\21\2\uffff";
    static final String DFA15_minS =
        "\2\4\1\10\1\uffff\1\12\10\16\1\uffff\2\4\1\10\2\uffff";
    static final String DFA15_maxS =
        "\1\14\1\27\1\54\1\uffff\1\54\10\16\1\uffff\1\54\1\14\1\54\2\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\4\11\uffff\1\3\3\uffff\1\2\1\1";
    static final String DFA15_specialS =
        "\23\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\2\3\5\uffff\1\1",
            "\1\4\2\3\5\uffff\1\3\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1"+
            "\13\1\14",
            "\2\3\1\15\1\3\2\uffff\1\3\16\uffff\20\3",
            "",
            "\1\3\3\uffff\1\16\22\uffff\14\3",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "",
            "\1\20\2\21\1\uffff\2\3\1\uffff\1\3\1\21\1\uffff\1\3\16\uffff"+
            "\20\3",
            "\1\20\2\21\5\uffff\1\21",
            "\2\21\1\22\1\21\2\uffff\1\21\16\uffff\20\21",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "186:1: basicexpr : ( '(' type ')' arrayexpr -> castvalue(type=$type.stvalue=$arrayexpr.st) | '(' type ')' atom -> castvalue(type=$type.stvalue=$atom.st) | arrayexpr -> {$arrayexpr.st} | atom -> {$atom.st});";
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
    public static final BitSet FOLLOW_24_in_block818 = new BitSet(new long[]{0x000000001FFF1170L});
    public static final BitSet FOLLOW_variable_in_block829 = new BitSet(new long[]{0x000000001FFF1170L});
    public static final BitSet FOLLOW_stat_in_block835 = new BitSet(new long[]{0x000000001FFF1170L});
    public static final BitSet FOLLOW_25_in_block848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStat_in_stat877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStat_in_stat886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat898 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stat900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_stat917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_stat939 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stat941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_stat950 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_stat952 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stat954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_stat971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ifStat1005 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ifStat1007 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_condExpr_in_ifStat1011 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ifStat1013 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_block_in_ifStat1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_forStat1090 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_forStat1092 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_assignStat_in_forStat1096 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_forStat1098 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_forStat1102 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_forStat1104 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_assignStat_in_forStat1108 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_forStat1110 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_block_in_forStat1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1184 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_assignStat1186 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_assignStat1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1211 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_assignStat1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1229 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_assignStat1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1249 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_assignStat1251 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_assignStat1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1278 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_assignStat1280 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_assignStat1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_expr1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayexpr_in_expr1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_expr1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arrayexpr1357 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_arrayexpr1359 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_arrayexpr1361 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_arrayexpr1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_condExpr1392 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_condExpr1394 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_condexp_in_condExpr1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_condExpr1420 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_condExpr1422 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_condexp_in_condExpr1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_condExpr1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condexp1470 = new BitSet(new long[]{0x000001F800000002L});
    public static final BitSet FOLLOW_35_in_condexp1487 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_condexp1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_condexp1521 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_condexp1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_condexp1548 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_condexp1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_condexp1575 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_condexp1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_condexp1602 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_condexp1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_condexp1629 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_aexpr_in_condexp1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_basicexpr1709 = new BitSet(new long[]{0x0000000000FF0010L});
    public static final BitSet FOLLOW_type_in_basicexpr1711 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_basicexpr1713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_arrayexpr_in_basicexpr1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_basicexpr1735 = new BitSet(new long[]{0x0000000000FF0010L});
    public static final BitSet FOLLOW_type_in_basicexpr1737 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_basicexpr1739 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_atom_in_basicexpr1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayexpr_in_basicexpr1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_basicexpr1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr1795 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_41_in_aexpr1813 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr1817 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_42_in_aexpr1841 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr1845 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_43_in_aexpr1869 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr1873 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_44_in_aexpr1897 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr1901 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_ID_in_atom1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FP_in_atom1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_atom1984 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_atom1986 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_atom1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred20_CMinus898 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred20_CMinus900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_synpred22_CMinus939 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred22_CMinus941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred24_CMinus1184 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_synpred24_CMinus1186 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_synpred24_CMinus1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred25_CMinus1211 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred25_CMinus1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred26_CMinus1229 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred26_CMinus1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred27_CMinus1249 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred27_CMinus1251 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_expr_in_synpred27_CMinus1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_synpred28_CMinus1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayexpr_in_synpred29_CMinus1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_synpred30_CMinus1392 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred30_CMinus1394 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_condexp_in_synpred30_CMinus1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_synpred31_CMinus1420 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred31_CMinus1422 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_condexp_in_synpred31_CMinus1426 = new BitSet(new long[]{0x0000000000000002L});

}