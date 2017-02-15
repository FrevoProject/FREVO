package helper;

// $ANTLR 3.1.1 CMinus.g 2017-02-15 10:52:19

import org.antlr.stringtemplate.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class CMinusParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "WS", "';'", "'('", "','", "')'", "'int'", "'char'", "'{'", "'}'", "'for'", "'='", "'=='", "'<'", "'+'"
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
    // CMinus.g:20:1: program : ( declaration )+ -> program(globals=$program::globalsfunctions=$program::functions);
    public final CMinusParser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        CMinusParser.program_return retval = new CMinusParser.program_return();
        retval.start = input.LT(1);


          ((program_scope)program_stack.peek()).globals = new ArrayList();
          ((program_scope)program_stack.peek()).functions = new ArrayList();

        try {
            // CMinus.g:29:5: ( ( declaration )+ -> program(globals=$program::globalsfunctions=$program::functions))
            // CMinus.g:29:9: ( declaration )+
            {
            // CMinus.g:29:9: ( declaration )+
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
            	    // CMinus.g:29:9: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program48);
            	    declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



            // TEMPLATE REWRITE
            // 30:9: -> program(globals=$program::globalsfunctions=$program::functions)
            {
                retval.st = templateLib.getInstanceOf("program",
              new STAttrMap().put("globals", ((program_scope)program_stack.peek()).globals).put("functions", ((program_scope)program_stack.peek()).functions));
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
    // CMinus.g:33:1: declaration : ( variable | f= function );
    public final CMinusParser.declaration_return declaration() throws RecognitionException {
        CMinusParser.declaration_return retval = new CMinusParser.declaration_return();
        retval.start = input.LT(1);

        CMinusParser.function_return f = null;

        CMinusParser.variable_return variable1 = null;


        try {
            // CMinus.g:34:5: ( variable | f= function )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==8) ) {
                        alt2=2;
                    }
                    else if ( (LA2_4==7) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
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

                    if ( (LA2_4==8) ) {
                        alt2=2;
                    }
                    else if ( (LA2_4==7) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
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

                    if ( (LA2_4==8) ) {
                        alt2=2;
                    }
                    else if ( (LA2_4==7) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // CMinus.g:34:9: variable
                    {
                    pushFollow(FOLLOW_variable_in_declaration89);
                    variable1=variable();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((variable1!=null?variable1.st:null));

                    }
                    break;
                case 2 :
                    // CMinus.g:35:9: f= function
                    {
                    pushFollow(FOLLOW_function_in_declaration105);
                    f=function();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).functions.add((f!=null?f.st:null));

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
    // CMinus.g:41:1: variable : type declarator ';' -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st);
    public final CMinusParser.variable_return variable() throws RecognitionException {
        CMinusParser.variable_return retval = new CMinusParser.variable_return();
        retval.start = input.LT(1);

        CMinusParser.type_return type2 = null;

        CMinusParser.declarator_return declarator3 = null;


        try {
            // CMinus.g:42:5: ( type declarator ';' -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st))
            // CMinus.g:42:9: type declarator ';'
            {
            pushFollow(FOLLOW_type_in_variable129);
            type2=type();

            state._fsp--;

            pushFollow(FOLLOW_declarator_in_variable131);
            declarator3=declarator();

            state._fsp--;

            match(input,7,FOLLOW_7_in_variable133); 


            // TEMPLATE REWRITE
            // 43:9: -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st)
            if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                retval.st = templateLib.getInstanceOf("globalVariable",
              new STAttrMap().put("type", (type2!=null?type2.st:null)).put("name", (declarator3!=null?declarator3.st:null)));
            }
            else // 45:9: -> variable(type=$type.stname=$declarator.st)
            {
                retval.st = templateLib.getInstanceOf("variable",
              new STAttrMap().put("type", (type2!=null?type2.st:null)).put("name", (declarator3!=null?declarator3.st:null)));
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
    // CMinus.g:48:1: declarator : ID -> {new StringTemplate($ID.text)};
    public final CMinusParser.declarator_return declarator() throws RecognitionException {
        CMinusParser.declarator_return retval = new CMinusParser.declarator_return();
        retval.start = input.LT(1);

        Token ID4=null;

        try {
            // CMinus.g:49:5: ( ID -> {new StringTemplate($ID.text)})
            // CMinus.g:49:9: ID
            {
            ID4=(Token)match(input,ID,FOLLOW_ID_in_declarator207); 


            // TEMPLATE REWRITE
            // 49:12: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID4!=null?ID4.getText():null));
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
    // CMinus.g:52:1: function : type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=toTemplates($p));
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
            // CMinus.g:61:5: ( type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=toTemplates($p)))
            // CMinus.g:61:9: type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block
            {
            pushFollow(FOLLOW_type_in_function244);
            type6=type();

            state._fsp--;

            ID5=(Token)match(input,ID,FOLLOW_ID_in_function246); 
            ((function_scope)function_stack.peek()).name =(ID5!=null?ID5.getText():null);
            match(input,8,FOLLOW_8_in_function258); 
            // CMinus.g:62:13: (p+= formalParameter ( ',' p+= formalParameter )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID||(LA4_0>=11 && LA4_0<=12)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // CMinus.g:62:15: p+= formalParameter ( ',' p+= formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_function264);
                    p=formalParameter();

                    state._fsp--;

                    if (list_p==null) list_p=new ArrayList();
                    list_p.add(p.getTemplate());

                    // CMinus.g:62:34: ( ',' p+= formalParameter )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==9) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // CMinus.g:62:36: ',' p+= formalParameter
                    	    {
                    	    match(input,9,FOLLOW_9_in_function268); 
                    	    pushFollow(FOLLOW_formalParameter_in_function272);
                    	    p=formalParameter();

                    	    state._fsp--;

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

            match(input,10,FOLLOW_10_in_function280); 
            pushFollow(FOLLOW_block_in_function290);
            block();

            state._fsp--;



            // TEMPLATE REWRITE
            // 64:9: -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=toTemplates($p))
            {
                retval.st = templateLib.getInstanceOf("function",
              new STAttrMap().put("type", (type6!=null?type6.st:null)).put("name", ((function_scope)function_stack.peek()).name).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("args", list_p));
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
    // CMinus.g:70:1: formalParameter : type declarator -> parameter(type=$type.stname=$declarator.st);
    public final CMinusParser.formalParameter_return formalParameter() throws RecognitionException {
        CMinusParser.formalParameter_return retval = new CMinusParser.formalParameter_return();
        retval.start = input.LT(1);

        CMinusParser.type_return type7 = null;

        CMinusParser.declarator_return declarator8 = null;


        try {
            // CMinus.g:71:5: ( type declarator -> parameter(type=$type.stname=$declarator.st))
            // CMinus.g:71:9: type declarator
            {
            pushFollow(FOLLOW_type_in_formalParameter406);
            type7=type();

            state._fsp--;

            pushFollow(FOLLOW_declarator_in_formalParameter408);
            declarator8=declarator();

            state._fsp--;



            // TEMPLATE REWRITE
            // 72:9: -> parameter(type=$type.stname=$declarator.st)
            {
                retval.st = templateLib.getInstanceOf("parameter",
              new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", (declarator8!=null?declarator8.st:null)));
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
    // CMinus.g:75:1: type : ( 'int' -> type_int() | 'char' -> type_char() | ID -> type_user_object(name=$ID.text));
    public final CMinusParser.type_return type() throws RecognitionException {
        CMinusParser.type_return retval = new CMinusParser.type_return();
        retval.start = input.LT(1);

        Token ID9=null;

        try {
            // CMinus.g:76:5: ( 'int' -> type_int() | 'char' -> type_char() | ID -> type_user_object(name=$ID.text))
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
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // CMinus.g:76:9: 'int'
                    {
                    match(input,11,FOLLOW_11_in_type449); 


                    // TEMPLATE REWRITE
                    // 76:16: -> type_int()
                    {
                        retval.st = templateLib.getInstanceOf("type_int");
                    }


                    }
                    break;
                case 2 :
                    // CMinus.g:77:9: 'char'
                    {
                    match(input,12,FOLLOW_12_in_type466); 


                    // TEMPLATE REWRITE
                    // 77:16: -> type_char()
                    {
                        retval.st = templateLib.getInstanceOf("type_char");
                    }


                    }
                    break;
                case 3 :
                    // CMinus.g:78:9: ID
                    {
                    ID9=(Token)match(input,ID,FOLLOW_ID_in_type482); 


                    // TEMPLATE REWRITE
                    // 78:16: -> type_user_object(name=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("type_user_object",
                      new STAttrMap().put("name", (ID9!=null?ID9.getText():null)));
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
    // CMinus.g:81:1: block : '{' ( variable )* ( stat )* '}' ;
    public final CMinusParser.block_return block() throws RecognitionException {
        CMinusParser.block_return retval = new CMinusParser.block_return();
        retval.start = input.LT(1);

        CMinusParser.variable_return variable10 = null;

        CMinusParser.stat_return stat11 = null;


        try {
            // CMinus.g:82:5: ( '{' ( variable )* ( stat )* '}' )
            // CMinus.g:82:8: '{' ( variable )* ( stat )* '}'
            {
            match(input,13,FOLLOW_13_in_block513); 
            // CMinus.g:83:8: ( variable )*
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
            	    // CMinus.g:83:10: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_block524);
            	    variable10=variable();

            	    state._fsp--;

            	    ((slist_scope)slist_stack.peek()).locals.add((variable10!=null?variable10.st:null));

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // CMinus.g:84:8: ( stat )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=ID && LA7_0<=INT)||(LA7_0>=7 && LA7_0<=8)||LA7_0==13||LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // CMinus.g:84:10: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_block540);
            	    stat11=stat();

            	    state._fsp--;

            	    ((slist_scope)slist_stack.peek()).stats.add((stat11!=null?stat11.st:null));

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_block553); 

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
    // CMinus.g:88:1: stat : ( forStat -> {$forStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | assignStat ';' -> {$assignStat.st} | ';' -> {new StringTemplate(\";\")});
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
            // CMinus.g:94:5: ( forStat -> {$forStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | assignStat ';' -> {$assignStat.st} | ';' -> {new StringTemplate(\";\")})
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

                if ( (LA8_2==16) ) {
                    alt8=4;
                }
                else if ( (LA8_2==7||(LA8_2>=17 && LA8_2<=19)) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT:
            case 8:
                {
                alt8=2;
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
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // CMinus.g:94:7: forStat
                    {
                    pushFollow(FOLLOW_forStat_in_stat580);
                    forStat12=forStat();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 94:15: -> {$forStat.st}
                    {
                        retval.st = (forStat12!=null?forStat12.st:null);
                    }


                    }
                    break;
                case 2 :
                    // CMinus.g:95:7: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_stat592);
                    expr13=expr();

                    state._fsp--;

                    match(input,7,FOLLOW_7_in_stat594); 


                    // TEMPLATE REWRITE
                    // 95:16: -> statement(expr=$expr.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (expr13!=null?expr13.st:null)));
                    }


                    }
                    break;
                case 3 :
                    // CMinus.g:96:7: block
                    {
                    pushFollow(FOLLOW_block_in_stat611);
                    block();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 96:13: -> statementList(locals=$slist::localsstats=$slist::stats)
                    {
                        retval.st = templateLib.getInstanceOf("statementList",
                      new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
                    }


                    }
                    break;
                case 4 :
                    // CMinus.g:97:7: assignStat ';'
                    {
                    pushFollow(FOLLOW_assignStat_in_stat633);
                    assignStat14=assignStat();

                    state._fsp--;

                    match(input,7,FOLLOW_7_in_stat635); 


                    // TEMPLATE REWRITE
                    // 97:22: -> {$assignStat.st}
                    {
                        retval.st = (assignStat14!=null?assignStat14.st:null);
                    }


                    }
                    break;
                case 5 :
                    // CMinus.g:98:7: ';'
                    {
                    match(input,7,FOLLOW_7_in_stat647); 


                    // TEMPLATE REWRITE
                    // 98:11: -> {new StringTemplate(\";\")}
                    {
                        retval.st = new StringTemplate(";");
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
    // CMinus.g:101:1: forStat : 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats);
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
            // CMinus.g:107:5: ( 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats))
            // CMinus.g:107:9: 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block
            {
            match(input,15,FOLLOW_15_in_forStat680); 
            match(input,8,FOLLOW_8_in_forStat682); 
            pushFollow(FOLLOW_assignStat_in_forStat686);
            e1=assignStat();

            state._fsp--;

            match(input,7,FOLLOW_7_in_forStat688); 
            pushFollow(FOLLOW_expr_in_forStat692);
            e2=expr();

            state._fsp--;

            match(input,7,FOLLOW_7_in_forStat694); 
            pushFollow(FOLLOW_assignStat_in_forStat698);
            e3=assignStat();

            state._fsp--;

            match(input,10,FOLLOW_10_in_forStat700); 
            pushFollow(FOLLOW_block_in_forStat702);
            block();

            state._fsp--;



            // TEMPLATE REWRITE
            // 108:9: -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("forLoop",
              new STAttrMap().put("e1", (e1!=null?e1.st:null)).put("e2", (e2!=null?e2.st:null)).put("e3", (e3!=null?e3.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
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
    // CMinus.g:112:1: assignStat : ID '=' expr -> assign(lhs=$ID.textrhs=$expr.st);
    public final CMinusParser.assignStat_return assignStat() throws RecognitionException {
        CMinusParser.assignStat_return retval = new CMinusParser.assignStat_return();
        retval.start = input.LT(1);

        Token ID15=null;
        CMinusParser.expr_return expr16 = null;


        try {
            // CMinus.g:113:5: ( ID '=' expr -> assign(lhs=$ID.textrhs=$expr.st))
            // CMinus.g:113:9: ID '=' expr
            {
            ID15=(Token)match(input,ID,FOLLOW_ID_in_assignStat775); 
            match(input,16,FOLLOW_16_in_assignStat777); 
            pushFollow(FOLLOW_expr_in_assignStat779);
            expr16=expr();

            state._fsp--;



            // TEMPLATE REWRITE
            // 113:21: -> assign(lhs=$ID.textrhs=$expr.st)
            {
                retval.st = templateLib.getInstanceOf("assign",
              new STAttrMap().put("lhs", (ID15!=null?ID15.getText():null)).put("rhs", (expr16!=null?expr16.st:null)));
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
    // $ANTLR end "assignStat"

    public static class expr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // CMinus.g:116:1: expr : condExpr -> {$condExpr.st};
    public final CMinusParser.expr_return expr() throws RecognitionException {
        CMinusParser.expr_return retval = new CMinusParser.expr_return();
        retval.start = input.LT(1);

        CMinusParser.condExpr_return condExpr17 = null;


        try {
            // CMinus.g:116:5: ( condExpr -> {$condExpr.st})
            // CMinus.g:116:9: condExpr
            {
            pushFollow(FOLLOW_condExpr_in_expr807);
            condExpr17=condExpr();

            state._fsp--;



            // TEMPLATE REWRITE
            // 116:18: -> {$condExpr.st}
            {
                retval.st = (condExpr17!=null?condExpr17.st:null);
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
    // $ANTLR end "expr"

    public static class condExpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "condExpr"
    // CMinus.g:119:1: condExpr : a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st)) | -> {$a.st}) ;
    public final CMinusParser.condExpr_return condExpr() throws RecognitionException {
        CMinusParser.condExpr_return retval = new CMinusParser.condExpr_return();
        retval.start = input.LT(1);

        CMinusParser.aexpr_return a = null;

        CMinusParser.aexpr_return b = null;


        try {
            // CMinus.g:120:5: (a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st)) | -> {$a.st}) )
            // CMinus.g:120:9: a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st)) | -> {$a.st})
            {
            pushFollow(FOLLOW_aexpr_in_condExpr832);
            a=aexpr();

            state._fsp--;

            // CMinus.g:121:9: ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st)) | -> {$a.st})
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=17 && LA10_0<=18)) ) {
                alt10=1;
            }
            else if ( (LA10_0==7||LA10_0==10) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // CMinus.g:121:13: ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st))
                    {
                    // CMinus.g:121:13: ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st))
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==17) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==18) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // CMinus.g:121:16: '==' b= aexpr
                            {
                            match(input,17,FOLLOW_17_in_condExpr849); 
                            pushFollow(FOLLOW_aexpr_in_condExpr853);
                            b=aexpr();

                            state._fsp--;



                            // TEMPLATE REWRITE
                            // 121:29: -> equals(left=$a.stright=$b.st)
                            {
                                retval.st = templateLib.getInstanceOf("equals",
                              new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                            }


                            }
                            break;
                        case 2 :
                            // CMinus.g:122:16: '<' b= aexpr
                            {
                            match(input,18,FOLLOW_18_in_condExpr883); 
                            pushFollow(FOLLOW_aexpr_in_condExpr887);
                            b=aexpr();

                            state._fsp--;



                            // TEMPLATE REWRITE
                            // 122:30: -> lessThan(left=$a.stright=$b.st)
                            {
                                retval.st = templateLib.getInstanceOf("lessThan",
                              new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // CMinus.g:124:13: 
                    {

                    // TEMPLATE REWRITE
                    // 124:13: -> {$a.st}
                    {
                        retval.st = (a!=null?a.st:null);
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
    // CMinus.g:128:1: aexpr : (a= atom -> {$a.st}) ( '+' b= atom -> add(left=$aexpr.stright=$b.st))* ;
    public final CMinusParser.aexpr_return aexpr() throws RecognitionException {
        CMinusParser.aexpr_return retval = new CMinusParser.aexpr_return();
        retval.start = input.LT(1);

        CMinusParser.atom_return a = null;

        CMinusParser.atom_return b = null;


        try {
            // CMinus.g:129:5: ( (a= atom -> {$a.st}) ( '+' b= atom -> add(left=$aexpr.stright=$b.st))* )
            // CMinus.g:129:9: (a= atom -> {$a.st}) ( '+' b= atom -> add(left=$aexpr.stright=$b.st))*
            {
            // CMinus.g:129:9: (a= atom -> {$a.st})
            // CMinus.g:129:10: a= atom
            {
            pushFollow(FOLLOW_atom_in_aexpr965);
            a=atom();

            state._fsp--;



            // TEMPLATE REWRITE
            // 129:17: -> {$a.st}
            {
                retval.st = (a!=null?a.st:null);
            }


            }

            // CMinus.g:130:9: ( '+' b= atom -> add(left=$aexpr.stright=$b.st))*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // CMinus.g:130:11: '+' b= atom
            	    {
            	    match(input,19,FOLLOW_19_in_aexpr982); 
            	    pushFollow(FOLLOW_atom_in_aexpr986);
            	    b=atom();

            	    state._fsp--;



            	    // TEMPLATE REWRITE
            	    // 130:22: -> add(left=$aexpr.stright=$b.st)
            	    {
            	        retval.st = templateLib.getInstanceOf("add",
            	      new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // CMinus.g:133:1: atom : ( ID -> refVar(id=$ID.text) | INT -> iconst(value=$INT.text) | '(' expr ')' -> {$expr.st});
    public final CMinusParser.atom_return atom() throws RecognitionException {
        CMinusParser.atom_return retval = new CMinusParser.atom_return();
        retval.start = input.LT(1);

        Token ID18=null;
        Token INT19=null;
        CMinusParser.expr_return expr20 = null;


        try {
            // CMinus.g:134:5: ( ID -> refVar(id=$ID.text) | INT -> iconst(value=$INT.text) | '(' expr ')' -> {$expr.st})
            int alt12=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt12=1;
                }
                break;
            case INT:
                {
                alt12=2;
                }
                break;
            case 8:
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
                    // CMinus.g:134:7: ID
                    {
                    ID18=(Token)match(input,ID,FOLLOW_ID_in_atom1020); 


                    // TEMPLATE REWRITE
                    // 134:10: -> refVar(id=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("refVar",
                      new STAttrMap().put("id", (ID18!=null?ID18.getText():null)));
                    }


                    }
                    break;
                case 2 :
                    // CMinus.g:135:7: INT
                    {
                    INT19=(Token)match(input,INT,FOLLOW_INT_in_atom1037); 


                    // TEMPLATE REWRITE
                    // 135:11: -> iconst(value=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("iconst",
                      new STAttrMap().put("value", (INT19!=null?INT19.getText():null)));
                    }


                    }
                    break;
                case 3 :
                    // CMinus.g:136:7: '(' expr ')'
                    {
                    match(input,8,FOLLOW_8_in_atom1054); 
                    pushFollow(FOLLOW_expr_in_atom1056);
                    expr20=expr();

                    state._fsp--;

                    match(input,10,FOLLOW_10_in_atom1058); 


                    // TEMPLATE REWRITE
                    // 136:20: -> {$expr.st}
                    {
                        retval.st = (expr20!=null?expr20.st:null);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_declaration_in_program48 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_variable_in_declaration89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable131 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_variable133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarator207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_function244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function246 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_function258 = new BitSet(new long[]{0x0000000000001C10L});
    public static final BitSet FOLLOW_formalParameter_in_function264 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_function268 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_formalParameter_in_function272 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_10_in_function280 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_block_in_function290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameter406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_formalParameter408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_type449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_type466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_block513 = new BitSet(new long[]{0x000000000000F9B0L});
    public static final BitSet FOLLOW_variable_in_block524 = new BitSet(new long[]{0x000000000000F9B0L});
    public static final BitSet FOLLOW_stat_in_block540 = new BitSet(new long[]{0x000000000000E1B0L});
    public static final BitSet FOLLOW_14_in_block553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStat_in_stat580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat592 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_stat594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_stat611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_stat633 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_stat635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_stat647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_forStat680 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_forStat682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_assignStat_in_forStat686 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_forStat688 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_forStat692 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_forStat694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_assignStat_in_forStat698 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_forStat700 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_block_in_forStat702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignStat775 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_assignStat777 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_assignStat779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_expr807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpr832 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_condExpr849 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_aexpr_in_condExpr853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_condExpr883 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_aexpr_in_condExpr887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_aexpr965 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_aexpr982 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_atom_in_aexpr986 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_atom1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atom1054 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_atom1056 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_atom1058 = new BitSet(new long[]{0x0000000000000002L});

}