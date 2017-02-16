package helper;

// $ANTLR 3.1.1 CMinus.g 2017-02-16 17:04:53

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "WS", "';'", "'('", "','", "')'", "'int'", "'char'", "'{'", "'}'", "'for'", "'='", "'['", "']'", "'=='", "'<'", "'<='", "'>='", "'>'", "'!='", "'+'"
    };
    public static final int INT=5;
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
    public static final int WS=6;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( (LA1_0==ID||(LA1_0>=11 && LA1_0<=12)) ) {
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
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==7) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==8) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==7) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==8) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==7) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==8) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

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
    // CMinus.g:44:1: variable : type declarator ';' -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st);
    public final CMinusParser.variable_return variable() throws RecognitionException {
        CMinusParser.variable_return retval = new CMinusParser.variable_return();
        retval.start = input.LT(1);

        CMinusParser.type_return type2 = null;

        CMinusParser.declarator_return declarator3 = null;


        try {
            // CMinus.g:45:5: ( type declarator ';' -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st))
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
            match(input,7,FOLLOW_7_in_variable146); if (state.failed) return retval;


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
    // CMinus.g:53:1: declarator : ID -> {new StringTemplate($ID.text)};
    public final CMinusParser.declarator_return declarator() throws RecognitionException {
        CMinusParser.declarator_return retval = new CMinusParser.declarator_return();
        retval.start = input.LT(1);

        Token ID4=null;

        try {
            // CMinus.g:54:5: ( ID -> {new StringTemplate($ID.text)})
            // CMinus.g:54:9: ID
            {
            ID4=(Token)match(input,ID,FOLLOW_ID_in_declarator223); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 54:12: -> {new StringTemplate($ID.text)}
              {
                  retval.st = new StringTemplate((ID4!=null?ID4.getText():null));
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
    // CMinus.g:57:1: function : type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=toTemplates($p));
    public final CMinusParser.function_return function() throws RecognitionException {
        slist_stack.push(new slist_scope());
        function_stack.push(new function_scope());
        CMinusParser.function_return retval = new CMinusParser.function_return();
        retval.start = input.LT(1);

        Token ID5=null;
        List list_p=null;
        CMinusParser.type_return type6 = null;

        RuleReturnScope p = null;

          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:66:5: ( type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=toTemplates($p)))
            // CMinus.g:66:9: type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block
            {
            pushFollow(FOLLOW_type_in_function260);
            type6=type();

            state._fsp--;
            if (state.failed) return retval;
            ID5=(Token)match(input,ID,FOLLOW_ID_in_function262); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((function_scope)function_stack.peek()).name =(ID5!=null?ID5.getText():null);
            }
            match(input,8,FOLLOW_8_in_function274); if (state.failed) return retval;
            // CMinus.g:67:13: (p+= formalParameter ( ',' p+= formalParameter )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID||(LA4_0>=11 && LA4_0<=12)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // CMinus.g:67:15: p+= formalParameter ( ',' p+= formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_function280);
                    p=formalParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_p==null) list_p=new ArrayList();
                    list_p.add(p.getTemplate());

                    // CMinus.g:67:34: ( ',' p+= formalParameter )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==9) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // CMinus.g:67:36: ',' p+= formalParameter
                    	    {
                    	    match(input,9,FOLLOW_9_in_function284); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_formalParameter_in_function288);
                    	    p=formalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_p==null) list_p=new ArrayList();
                    	    list_p.add(p.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_function296); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_function306);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 69:9: -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=toTemplates($p))
              {
                  retval.st = templateLib.getInstanceOf("function",
                new STAttrMap().put("type", (type6!=null?type6.st:null)).put("name", ((function_scope)function_stack.peek()).name).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("args", (list_p)));
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
    // CMinus.g:75:1: formalParameter : type declarator -> parameter(type=$type.stname=$declarator.st);
    public final CMinusParser.formalParameter_return formalParameter() throws RecognitionException {
        CMinusParser.formalParameter_return retval = new CMinusParser.formalParameter_return();
        retval.start = input.LT(1);

        CMinusParser.type_return type7 = null;

        CMinusParser.declarator_return declarator8 = null;


        try {
            // CMinus.g:76:5: ( type declarator -> parameter(type=$type.stname=$declarator.st))
            // CMinus.g:76:9: type declarator
            {
            pushFollow(FOLLOW_type_in_formalParameter422);
            type7=type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_declarator_in_formalParameter424);
            declarator8=declarator();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 77:9: -> parameter(type=$type.stname=$declarator.st)
              {
                  retval.st = templateLib.getInstanceOf("parameter",
                new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", (declarator8!=null?declarator8.st:null)));
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
    // $ANTLR end "formalParameter"

    public static class type_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // CMinus.g:80:1: type : ( 'int' -> type_int() | 'char' -> type_char() | ID -> type_user_object(name=$ID.text));
    public final CMinusParser.type_return type() throws RecognitionException {
        CMinusParser.type_return retval = new CMinusParser.type_return();
        retval.start = input.LT(1);

        Token ID9=null;

        try {
            // CMinus.g:81:5: ( 'int' -> type_int() | 'char' -> type_char() | ID -> type_user_object(name=$ID.text))
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case ID:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // CMinus.g:81:9: 'int'
                    {
                    match(input,11,FOLLOW_11_in_type465); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 81:16: -> type_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_int");
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:82:9: 'char'
                    {
                    match(input,12,FOLLOW_12_in_type482); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 82:16: -> type_char()
                      {
                          retval.st = templateLib.getInstanceOf("type_char");
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:83:9: ID
                    {
                    ID9=(Token)match(input,ID,FOLLOW_ID_in_type498); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 83:16: -> type_user_object(name=$ID.text)
                      {
                          retval.st = templateLib.getInstanceOf("type_user_object",
                        new STAttrMap().put("name", (ID9!=null?ID9.getText():null)));
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
    // CMinus.g:86:1: block : '{' ( variable )* ( stat )* '}' ;
    public final CMinusParser.block_return block() throws RecognitionException {
        CMinusParser.block_return retval = new CMinusParser.block_return();
        retval.start = input.LT(1);

        CMinusParser.variable_return variable10 = null;

        CMinusParser.stat_return stat11 = null;


        try {
            // CMinus.g:87:5: ( '{' ( variable )* ( stat )* '}' )
            // CMinus.g:87:8: '{' ( variable )* ( stat )* '}'
            {
            match(input,13,FOLLOW_13_in_block529); if (state.failed) return retval;
            // CMinus.g:88:8: ( variable )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ID) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==ID) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // CMinus.g:88:10: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_block540);
            	    variable10=variable();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      ((slist_scope)slist_stack.peek()).locals.add((variable10!=null?variable10.st:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // CMinus.g:89:8: ( stat )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=ID && LA7_0<=INT)||(LA7_0>=7 && LA7_0<=8)||LA7_0==13||LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // CMinus.g:89:10: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_block556);
            	    stat11=stat();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      ((slist_scope)slist_stack.peek()).stats.add((stat11!=null?stat11.st:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_block569); if (state.failed) return retval;

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
    // CMinus.g:94:1: stat : ( forStat -> {$forStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | assignStat ';' -> {$assignStat.st} | ';' -> {new StringTemplate(\";\")});
    public final CMinusParser.stat_return stat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.stat_return retval = new CMinusParser.stat_return();
        retval.start = input.LT(1);

        CMinusParser.forStat_return forStat12 = null;

        CMinusParser.expr_return expr13 = null;

        CMinusParser.assignStat_return assignStat14 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:100:5: ( forStat -> {$forStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | assignStat ';' -> {$assignStat.st} | ';' -> {new StringTemplate(\";\")})
            int alt8=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case ID:
                {
                int LA8_2 = input.LA(2);

                if ( (synpred10_CMinus()) ) {
                    alt8=2;
                }
                else if ( (synpred12_CMinus()) ) {
                    alt8=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT:
                {
                int LA8_3 = input.LA(2);

                if ( (synpred10_CMinus()) ) {
                    alt8=2;
                }
                else if ( (synpred12_CMinus()) ) {
                    alt8=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case 8:
                {
                int LA8_4 = input.LA(2);

                if ( (synpred10_CMinus()) ) {
                    alt8=2;
                }
                else if ( (synpred12_CMinus()) ) {
                    alt8=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 7:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // CMinus.g:100:7: forStat
                    {
                    pushFollow(FOLLOW_forStat_in_stat598);
                    forStat12=forStat();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 100:15: -> {$forStat.st}
                      {
                          retval.st = (forStat12!=null?forStat12.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:101:7: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_stat610);
                    expr13=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,7,FOLLOW_7_in_stat612); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 101:16: -> statement(expr=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("statement",
                        new STAttrMap().put("expr", (expr13!=null?expr13.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:102:7: block
                    {
                    pushFollow(FOLLOW_block_in_stat629);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 102:13: -> statementList(locals=$slist::localsstats=$slist::stats)
                      {
                          retval.st = templateLib.getInstanceOf("statementList",
                        new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:103:7: assignStat ';'
                    {
                    pushFollow(FOLLOW_assignStat_in_stat651);
                    assignStat14=assignStat();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,7,FOLLOW_7_in_stat653); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 103:22: -> {$assignStat.st}
                      {
                          retval.st = (assignStat14!=null?assignStat14.st:null);
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:104:7: ';'
                    {
                    match(input,7,FOLLOW_7_in_stat665); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 104:11: -> {new StringTemplate(\";\")}
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

    public static class forStat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forStat"
    // CMinus.g:107:1: forStat : 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats);
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
            // CMinus.g:113:5: ( 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats))
            // CMinus.g:113:9: 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block
            {
            match(input,15,FOLLOW_15_in_forStat698); if (state.failed) return retval;
            match(input,8,FOLLOW_8_in_forStat700); if (state.failed) return retval;
            pushFollow(FOLLOW_assignStat_in_forStat704);
            e1=assignStat();

            state._fsp--;
            if (state.failed) return retval;
            match(input,7,FOLLOW_7_in_forStat706); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_forStat710);
            e2=expr();

            state._fsp--;
            if (state.failed) return retval;
            match(input,7,FOLLOW_7_in_forStat712); if (state.failed) return retval;
            pushFollow(FOLLOW_assignStat_in_forStat716);
            e3=assignStat();

            state._fsp--;
            if (state.failed) return retval;
            match(input,10,FOLLOW_10_in_forStat718); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_forStat720);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 114:9: -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats)
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
    // CMinus.g:118:1: assignStat : ( ID '=' expr -> assign(lhs=$ID.textrhs=$expr.st) | arrayexpr '=' expr -> assign(lhs=$arrayexpr.strhs=$expr.st));
    public final CMinusParser.assignStat_return assignStat() throws RecognitionException {
        CMinusParser.assignStat_return retval = new CMinusParser.assignStat_return();
        retval.start = input.LT(1);

        Token ID15=null;
        CMinusParser.expr_return expr16 = null;

        CMinusParser.arrayexpr_return arrayexpr17 = null;

        CMinusParser.expr_return expr18 = null;


        try {
            // CMinus.g:119:5: ( ID '=' expr -> assign(lhs=$ID.textrhs=$expr.st) | arrayexpr '=' expr -> assign(lhs=$arrayexpr.strhs=$expr.st))
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==16) ) {
                    alt9=1;
                }
                else if ( (LA9_1==17||LA9_1==25) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==INT||LA9_0==8) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // CMinus.g:119:9: ID '=' expr
                    {
                    ID15=(Token)match(input,ID,FOLLOW_ID_in_assignStat793); if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_assignStat795); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat797);
                    expr16=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 119:21: -> assign(lhs=$ID.textrhs=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("assign",
                        new STAttrMap().put("lhs", (ID15!=null?ID15.getText():null)).put("rhs", (expr16!=null?expr16.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:120:6: arrayexpr '=' expr
                    {
                    pushFollow(FOLLOW_arrayexpr_in_assignStat818);
                    arrayexpr17=arrayexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_assignStat820); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat822);
                    expr18=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 120:25: -> assign(lhs=$arrayexpr.strhs=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("assign",
                        new STAttrMap().put("lhs", (arrayexpr17!=null?arrayexpr17.st:null)).put("rhs", (expr18!=null?expr18.st:null)));
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
    // CMinus.g:123:1: expr : ( condExpr -> {$condExpr.st} | arrayexpr -> {$arrayexpr.st});
    public final CMinusParser.expr_return expr() throws RecognitionException {
        CMinusParser.expr_return retval = new CMinusParser.expr_return();
        retval.start = input.LT(1);

        CMinusParser.condExpr_return condExpr19 = null;

        CMinusParser.arrayexpr_return arrayexpr20 = null;


        try {
            // CMinus.g:123:5: ( condExpr -> {$condExpr.st} | arrayexpr -> {$arrayexpr.st})
            int alt10=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred14_CMinus()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT:
                {
                int LA10_2 = input.LA(2);

                if ( (synpred14_CMinus()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 8:
                {
                int LA10_3 = input.LA(2);

                if ( (synpred14_CMinus()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // CMinus.g:123:9: condExpr
                    {
                    pushFollow(FOLLOW_condExpr_in_expr850);
                    condExpr19=condExpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 123:18: -> {$condExpr.st}
                      {
                          retval.st = (condExpr19!=null?condExpr19.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:124:9: arrayexpr
                    {
                    pushFollow(FOLLOW_arrayexpr_in_expr864);
                    arrayexpr20=arrayexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 124:19: -> {$arrayexpr.st}
                      {
                          retval.st = (arrayexpr20!=null?arrayexpr20.st:null);
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
    // CMinus.g:127:1: arrayexpr : a= aexpr '[' b= aexpr ']' -> array(name=$a.stindex=$b.st);
    public final CMinusParser.arrayexpr_return arrayexpr() throws RecognitionException {
        CMinusParser.arrayexpr_return retval = new CMinusParser.arrayexpr_return();
        retval.start = input.LT(1);

        CMinusParser.aexpr_return a = null;

        CMinusParser.aexpr_return b = null;


        try {
            // CMinus.g:128:2: (a= aexpr '[' b= aexpr ']' -> array(name=$a.stindex=$b.st))
            // CMinus.g:128:6: a= aexpr '[' b= aexpr ']'
            {
            pushFollow(FOLLOW_aexpr_in_arrayexpr887);
            a=aexpr();

            state._fsp--;
            if (state.failed) return retval;
            match(input,17,FOLLOW_17_in_arrayexpr889); if (state.failed) return retval;
            pushFollow(FOLLOW_aexpr_in_arrayexpr893);
            b=aexpr();

            state._fsp--;
            if (state.failed) return retval;
            match(input,18,FOLLOW_18_in_arrayexpr895); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 128:30: -> array(name=$a.stindex=$b.st)
              {
                  retval.st = templateLib.getInstanceOf("array",
                new STAttrMap().put("name", (a!=null?a.st:null)).put("index", (b!=null?b.st:null)));
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
    // CMinus.g:131:1: condExpr : a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st}) ;
    public final CMinusParser.condExpr_return condExpr() throws RecognitionException {
        CMinusParser.condExpr_return retval = new CMinusParser.condExpr_return();
        retval.start = input.LT(1);

        CMinusParser.aexpr_return a = null;

        CMinusParser.aexpr_return b = null;


        try {
            // CMinus.g:132:5: (a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st}) )
            // CMinus.g:132:9: a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st})
            {
            pushFollow(FOLLOW_aexpr_in_condExpr926);
            a=aexpr();

            state._fsp--;
            if (state.failed) return retval;
            // CMinus.g:133:9: ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st})
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=19 && LA12_0<=24)) ) {
                alt12=1;
            }
            else if ( (LA12_0==EOF||LA12_0==7||LA12_0==10) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // CMinus.g:133:13: ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st))
                    {
                    // CMinus.g:133:13: ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st))
                    int alt11=6;
                    switch ( input.LA(1) ) {
                    case 19:
                        {
                        alt11=1;
                        }
                        break;
                    case 20:
                        {
                        alt11=2;
                        }
                        break;
                    case 21:
                        {
                        alt11=3;
                        }
                        break;
                    case 22:
                        {
                        alt11=4;
                        }
                        break;
                    case 23:
                        {
                        alt11=5;
                        }
                        break;
                    case 24:
                        {
                        alt11=6;
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
                            // CMinus.g:133:16: '==' b= aexpr
                            {
                            match(input,19,FOLLOW_19_in_condExpr943); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condExpr947);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 133:29: -> equals(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("equals",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 2 :
                            // CMinus.g:134:16: '<' b= aexpr
                            {
                            match(input,20,FOLLOW_20_in_condExpr977); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condExpr981);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 134:30: -> lessThan(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("lessThan",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 3 :
                            // CMinus.g:135:7: '<=' b= aexpr
                            {
                            match(input,21,FOLLOW_21_in_condExpr1004); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condExpr1008);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 135:22: -> lessOrEqual(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("lessOrEqual",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 4 :
                            // CMinus.g:136:7: '>=' b= aexpr
                            {
                            match(input,22,FOLLOW_22_in_condExpr1031); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condExpr1035);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 136:22: -> moreOrEqual(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("moreOrEqual",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 5 :
                            // CMinus.g:137:7: '>' b= aexpr
                            {
                            match(input,23,FOLLOW_23_in_condExpr1058); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condExpr1062);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 137:21: -> moreThan(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("moreThan",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 6 :
                            // CMinus.g:138:7: '!=' b= aexpr
                            {
                            match(input,24,FOLLOW_24_in_condExpr1085); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condExpr1089);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 138:22: -> unEqual(left=$a.stright=$b.st)
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
                    // CMinus.g:140:13: 
                    {

                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 140:13: -> {$a.st}
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
    // $ANTLR end "condExpr"

    public static class aexpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "aexpr"
    // CMinus.g:144:1: aexpr : (a= atom -> {$a.st}) ( '+' b= atom -> add(left=$aexpr.stright=$b.st))* ;
    public final CMinusParser.aexpr_return aexpr() throws RecognitionException {
        CMinusParser.aexpr_return retval = new CMinusParser.aexpr_return();
        retval.start = input.LT(1);

        CMinusParser.atom_return a = null;

        CMinusParser.atom_return b = null;


        try {
            // CMinus.g:145:5: ( (a= atom -> {$a.st}) ( '+' b= atom -> add(left=$aexpr.stright=$b.st))* )
            // CMinus.g:145:9: (a= atom -> {$a.st}) ( '+' b= atom -> add(left=$aexpr.stright=$b.st))*
            {
            // CMinus.g:145:9: (a= atom -> {$a.st})
            // CMinus.g:145:10: a= atom
            {
            pushFollow(FOLLOW_atom_in_aexpr1167);
            a=atom();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 145:17: -> {$a.st}
              {
                  retval.st = (a!=null?a.st:null);
              }

            }
            }

            // CMinus.g:146:9: ( '+' b= atom -> add(left=$aexpr.stright=$b.st))*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // CMinus.g:146:11: '+' b= atom
            	    {
            	    match(input,25,FOLLOW_25_in_aexpr1184); if (state.failed) return retval;
            	    pushFollow(FOLLOW_atom_in_aexpr1188);
            	    b=atom();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 146:22: -> add(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("add",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }
            	    break;

            	default :
            	    break loop13;
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
    // CMinus.g:149:1: atom : ( ID -> refVar(id=$ID.text) | INT -> iconst(value=$INT.text) | '(' expr ')' -> {$expr.st});
    public final CMinusParser.atom_return atom() throws RecognitionException {
        CMinusParser.atom_return retval = new CMinusParser.atom_return();
        retval.start = input.LT(1);

        Token ID21=null;
        Token INT22=null;
        CMinusParser.expr_return expr23 = null;


        try {
            // CMinus.g:150:5: ( ID -> refVar(id=$ID.text) | INT -> iconst(value=$INT.text) | '(' expr ')' -> {$expr.st})
            int alt14=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt14=1;
                }
                break;
            case INT:
                {
                alt14=2;
                }
                break;
            case 8:
                {
                alt14=3;
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
                    // CMinus.g:150:7: ID
                    {
                    ID21=(Token)match(input,ID,FOLLOW_ID_in_atom1222); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 150:10: -> refVar(id=$ID.text)
                      {
                          retval.st = templateLib.getInstanceOf("refVar",
                        new STAttrMap().put("id", (ID21!=null?ID21.getText():null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:151:7: INT
                    {
                    INT22=(Token)match(input,INT,FOLLOW_INT_in_atom1239); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 151:11: -> iconst(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("iconst",
                        new STAttrMap().put("value", (INT22!=null?INT22.getText():null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:152:7: '(' expr ')'
                    {
                    match(input,8,FOLLOW_8_in_atom1256); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_atom1258);
                    expr23=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,10,FOLLOW_10_in_atom1260); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 152:20: -> {$expr.st}
                      {
                          retval.st = (expr23!=null?expr23.st:null);
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

    // $ANTLR start synpred10_CMinus
    public final void synpred10_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:101:7: ( expr ';' )
        // CMinus.g:101:7: expr ';'
        {
        pushFollow(FOLLOW_expr_in_synpred10_CMinus610);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,7,FOLLOW_7_in_synpred10_CMinus612); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_CMinus

    // $ANTLR start synpred12_CMinus
    public final void synpred12_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:103:7: ( assignStat ';' )
        // CMinus.g:103:7: assignStat ';'
        {
        pushFollow(FOLLOW_assignStat_in_synpred12_CMinus651);
        assignStat();

        state._fsp--;
        if (state.failed) return ;
        match(input,7,FOLLOW_7_in_synpred12_CMinus653); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_CMinus

    // $ANTLR start synpred14_CMinus
    public final void synpred14_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:123:9: ( condExpr )
        // CMinus.g:123:9: condExpr
        {
        pushFollow(FOLLOW_condExpr_in_synpred14_CMinus850);
        condExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_CMinus

    // Delegated rules

    public final boolean synpred10_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_declaration_in_program61 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_variable_in_declaration102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable144 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_variable146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarator223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_function260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function262 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_function274 = new BitSet(new long[]{0x0000000000001C10L});
    public static final BitSet FOLLOW_formalParameter_in_function280 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_function284 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_formalParameter_in_function288 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_10_in_function296 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_block_in_function306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameter422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_formalParameter424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_type465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_type482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_block529 = new BitSet(new long[]{0x000000000000F9B0L});
    public static final BitSet FOLLOW_variable_in_block540 = new BitSet(new long[]{0x000000000000F9B0L});
    public static final BitSet FOLLOW_stat_in_block556 = new BitSet(new long[]{0x000000000000E1B0L});
    public static final BitSet FOLLOW_14_in_block569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStat_in_stat598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat610 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_stat612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_stat629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_stat651 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_stat653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_stat665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_forStat698 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_forStat700 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_assignStat_in_forStat704 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_forStat706 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_forStat710 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_forStat712 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_assignStat_in_forStat716 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_forStat718 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_block_in_forStat720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignStat793 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_assignStat795 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_assignStat797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayexpr_in_assignStat818 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_assignStat820 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_assignStat822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_expr850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayexpr_in_expr864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_arrayexpr887 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_arrayexpr889 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_aexpr_in_arrayexpr893 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_arrayexpr895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpr926 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_19_in_condExpr943 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_aexpr_in_condExpr947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_condExpr977 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_aexpr_in_condExpr981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_condExpr1004 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_aexpr_in_condExpr1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_condExpr1031 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_aexpr_in_condExpr1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_condExpr1058 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_aexpr_in_condExpr1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_condExpr1085 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_aexpr_in_condExpr1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_aexpr1167 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_aexpr1184 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_atom_in_aexpr1188 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ID_in_atom1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atom1256 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_atom1258 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_atom1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred10_CMinus610 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_synpred10_CMinus612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_synpred12_CMinus651 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_synpred12_CMinus653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_synpred14_CMinus850 = new BitSet(new long[]{0x0000000000000002L});

}