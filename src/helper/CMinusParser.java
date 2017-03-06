package helper;

// $ANTLR 3.1.1 CMinus.g 2017-03-06 16:12:13

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "FP", "INT", "WS", "';'", "'='", "'['", "']'", "'{'", "','", "'}'", "'('", "')'", "'[]'", "'[][]'", "'int'", "'long int'", "'long long int'", "'unsigned long int'", "'unsigned long long int'", "'unsigned int'", "'char'", "'float'", "'double'", "'return'", "'if'", "'else'", "'for'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'&&'", "'||'", "'=='", "'<'", "'<='", "'>='", "'>'", "'!='", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'<<'", "'>>'", "'f'", "'F'", "'u'", "'U'", "'l'", "'L'", "'ll'", "'LL'", "'lu'", "'Lu'", "'lU'", "'LU'", "'ul'", "'uL'", "'Ul'", "'UL'", "'llu'", "'LLu'", "'llU'", "'LLU'", "'ull'", "'uLL'", "'Ull'", "'ULL'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int ID=4;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__10=10;
    public static final int T__54=54;
    public static final int T__9=9;
    public static final int T__60=60;
    public static final int T__8=8;
    public static final int T__61=61;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
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
    public static final int FP=5;
    public static final int INT=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int WS=7;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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

                if ( (LA1_0==ID||(LA1_0>=19 && LA1_0<=27)) ) {
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
    // CMinus.g:44:1: variable : ( type declarator ';' -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st) | type declarator '=' expr ';' -> {$function.size()>0 && $function::name==null}? globalVariableInit(type=$type.stname=$declarator.stvalue=$expr.st) -> variableInit(type=$type.stname=$declarator.stvalue=$expr.st) | type declarator '[' aexpr ']' ';' -> {$function.size()>0 && $function::name==null}? globalArrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st) -> arrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st) | type declarator '[' aexpr ']' '=' arrayinit ';' -> {$function.size()>0 && $function::name==null}? globalArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st) -> arrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st) | type declarator '[' a= aexpr ']' '[' b= aexpr ']' ';' -> {$function.size()>0 && $function::name==null}? globalDoubleArrayDeclaration(type=$type.stname=$declarator.stsizeone=$a.stsizetwo=$b.st) -> doubleArrayDeclaration(type=$type.stname=$declarator.stsize=$a.stsizetwo=$b.st) | type declarator '[' a= aexpr ']' '[' b= aexpr ']' '=' arrayinit ';' -> {$function.size()>0 && $function::name==null}? globalDoubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st) -> doubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st));
    public final CMinusParser.variable_return variable() throws RecognitionException {
        CMinusParser.variable_return retval = new CMinusParser.variable_return();
        retval.start = input.LT(1);

        CMinusParser.aexpr_return a = null;

        CMinusParser.aexpr_return b = null;

        CMinusParser.type_return type2 = null;

        CMinusParser.declarator_return declarator3 = null;

        CMinusParser.type_return type4 = null;

        CMinusParser.declarator_return declarator5 = null;

        CMinusParser.expr_return expr6 = null;

        CMinusParser.type_return type7 = null;

        CMinusParser.declarator_return declarator8 = null;

        CMinusParser.aexpr_return aexpr9 = null;

        CMinusParser.type_return type10 = null;

        CMinusParser.declarator_return declarator11 = null;

        CMinusParser.arrayinit_return arrayinit12 = null;

        CMinusParser.aexpr_return aexpr13 = null;

        CMinusParser.type_return type14 = null;

        CMinusParser.declarator_return declarator15 = null;

        CMinusParser.type_return type16 = null;

        CMinusParser.declarator_return declarator17 = null;

        CMinusParser.arrayinit_return arrayinit18 = null;


        try {
            // CMinus.g:45:5: ( type declarator ';' -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st) | type declarator '=' expr ';' -> {$function.size()>0 && $function::name==null}? globalVariableInit(type=$type.stname=$declarator.stvalue=$expr.st) -> variableInit(type=$type.stname=$declarator.stvalue=$expr.st) | type declarator '[' aexpr ']' ';' -> {$function.size()>0 && $function::name==null}? globalArrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st) -> arrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st) | type declarator '[' aexpr ']' '=' arrayinit ';' -> {$function.size()>0 && $function::name==null}? globalArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st) -> arrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st) | type declarator '[' a= aexpr ']' '[' b= aexpr ']' ';' -> {$function.size()>0 && $function::name==null}? globalDoubleArrayDeclaration(type=$type.stname=$declarator.stsizeone=$a.stsizetwo=$b.st) -> doubleArrayDeclaration(type=$type.stname=$declarator.stsize=$a.stsizetwo=$b.st) | type declarator '[' a= aexpr ']' '[' b= aexpr ']' '=' arrayinit ';' -> {$function.size()>0 && $function::name==null}? globalDoubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st) -> doubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st))
            int alt3=6;
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
                    // CMinus.g:53:6: type declarator '[' aexpr ']' ';'
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
                    pushFollow(FOLLOW_aexpr_in_variable289);
                    aexpr9=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,11,FOLLOW_11_in_variable291); if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_variable293); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 54:6: -> {$function.size()>0 && $function::name==null}? globalArrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st)
                      if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                          retval.st = templateLib.getInstanceOf("globalArrayDeclaration",
                        new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", (declarator8!=null?declarator8.st:null)).put("size", (aexpr9!=null?aexpr9.st:null)));
                      }
                      else // 56:9: -> arrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("arrayDeclaration",
                        new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", (declarator8!=null?declarator8.st:null)).put("size", (aexpr9!=null?aexpr9.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:57:6: type declarator '[' aexpr ']' '=' arrayinit ';'
                    {
                    pushFollow(FOLLOW_type_in_variable360);
                    type10=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_variable362);
                    declarator11=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,10,FOLLOW_10_in_variable364); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_variable366);
                    aexpr13=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,11,FOLLOW_11_in_variable368); if (state.failed) return retval;
                    match(input,9,FOLLOW_9_in_variable370); if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayinit_in_variable372);
                    arrayinit12=arrayinit();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_variable374); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 58:6: -> {$function.size()>0 && $function::name==null}? globalArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st)
                      if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                          retval.st = templateLib.getInstanceOf("globalArrayInitialization",
                        new STAttrMap().put("type", (type10!=null?type10.st:null)).put("name", (declarator11!=null?declarator11.st:null)).put("values", (arrayinit12!=null?arrayinit12.st:null)).put("size", (aexpr13!=null?aexpr13.st:null)));
                      }
                      else // 60:9: -> arrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("arrayInitialization",
                        new STAttrMap().put("type", (type10!=null?type10.st:null)).put("name", (declarator11!=null?declarator11.st:null)).put("values", (arrayinit12!=null?arrayinit12.st:null)).put("size", (aexpr13!=null?aexpr13.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:61:6: type declarator '[' a= aexpr ']' '[' b= aexpr ']' ';'
                    {
                    pushFollow(FOLLOW_type_in_variable449);
                    type14=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_variable451);
                    declarator15=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,10,FOLLOW_10_in_variable453); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_variable457);
                    a=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,11,FOLLOW_11_in_variable459); if (state.failed) return retval;
                    match(input,10,FOLLOW_10_in_variable461); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_variable465);
                    b=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,11,FOLLOW_11_in_variable467); if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_variable469); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 62:6: -> {$function.size()>0 && $function::name==null}? globalDoubleArrayDeclaration(type=$type.stname=$declarator.stsizeone=$a.stsizetwo=$b.st)
                      if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                          retval.st = templateLib.getInstanceOf("globalDoubleArrayDeclaration",
                        new STAttrMap().put("type", (type14!=null?type14.st:null)).put("name", (declarator15!=null?declarator15.st:null)).put("sizeone", (a!=null?a.st:null)).put("sizetwo", (b!=null?b.st:null)));
                      }
                      else // 64:9: -> doubleArrayDeclaration(type=$type.stname=$declarator.stsize=$a.stsizetwo=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("doubleArrayDeclaration",
                        new STAttrMap().put("type", (type14!=null?type14.st:null)).put("name", (declarator15!=null?declarator15.st:null)).put("size", (a!=null?a.st:null)).put("sizetwo", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:65:6: type declarator '[' a= aexpr ']' '[' b= aexpr ']' '=' arrayinit ';'
                    {
                    pushFollow(FOLLOW_type_in_variable544);
                    type16=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_variable546);
                    declarator17=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,10,FOLLOW_10_in_variable548); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_variable552);
                    a=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,11,FOLLOW_11_in_variable554); if (state.failed) return retval;
                    match(input,10,FOLLOW_10_in_variable556); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_variable560);
                    b=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,11,FOLLOW_11_in_variable562); if (state.failed) return retval;
                    match(input,9,FOLLOW_9_in_variable564); if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayinit_in_variable566);
                    arrayinit18=arrayinit();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_variable568); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 66:6: -> {$function.size()>0 && $function::name==null}? globalDoubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st)
                      if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                          retval.st = templateLib.getInstanceOf("globalDoubleArrayInitialization",
                        new STAttrMap().put("type", (type16!=null?type16.st:null)).put("name", (declarator17!=null?declarator17.st:null)).put("values", (arrayinit18!=null?arrayinit18.st:null)).put("sizeone", (a!=null?a.st:null)).put("sizetwo", (b!=null?b.st:null)));
                      }
                      else // 68:9: -> doubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("doubleArrayInitialization",
                        new STAttrMap().put("type", (type16!=null?type16.st:null)).put("name", (declarator17!=null?declarator17.st:null)).put("values", (arrayinit18!=null?arrayinit18.st:null)).put("sizeone", (a!=null?a.st:null)).put("sizetwo", (b!=null?b.st:null)));
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

    public static class arrayinit_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayinit"
    // CMinus.g:71:1: arrayinit : ( '{' (p+= numericexpr ( ',' p+= numericexpr )* )? '}' -> arrayInitializationBody(args=$p) | '{' (p+= arrayinit ( ',' p+= arrayinit )* )? '}' -> arrayInitializationBody(args=$p));
    public final CMinusParser.arrayinit_return arrayinit() throws RecognitionException {
        CMinusParser.arrayinit_return retval = new CMinusParser.arrayinit_return();
        retval.start = input.LT(1);

        List list_p=null;
        RuleReturnScope p = null;
        try {
            // CMinus.g:72:5: ( '{' (p+= numericexpr ( ',' p+= numericexpr )* )? '}' -> arrayInitializationBody(args=$p) | '{' (p+= arrayinit ( ',' p+= arrayinit )* )? '}' -> arrayInitializationBody(args=$p))
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                switch ( input.LA(2) ) {
                case FP:
                case INT:
                    {
                    alt8=1;
                    }
                    break;
                case 14:
                    {
                    int LA8_3 = input.LA(3);

                    if ( (synpred10_CMinus()) ) {
                        alt8=1;
                    }
                    else if ( (true) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    alt8=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // CMinus.g:72:9: '{' (p+= numericexpr ( ',' p+= numericexpr )* )? '}'
                    {
                    match(input,12,FOLLOW_12_in_arrayinit664); if (state.failed) return retval;
                    // CMinus.g:72:13: (p+= numericexpr ( ',' p+= numericexpr )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=FP && LA5_0<=INT)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // CMinus.g:72:15: p+= numericexpr ( ',' p+= numericexpr )*
                            {
                            pushFollow(FOLLOW_numericexpr_in_arrayinit670);
                            p=numericexpr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (list_p==null) list_p=new ArrayList();
                            list_p.add(p.getTemplate());

                            // CMinus.g:72:30: ( ',' p+= numericexpr )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==13) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // CMinus.g:72:32: ',' p+= numericexpr
                            	    {
                            	    match(input,13,FOLLOW_13_in_arrayinit674); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_numericexpr_in_arrayinit678);
                            	    p=numericexpr();

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

                    match(input,14,FOLLOW_14_in_arrayinit686); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 72:61: -> arrayInitializationBody(args=$p)
                      {
                          retval.st = templateLib.getInstanceOf("arrayInitializationBody",
                        new STAttrMap().put("args", list_p));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:73:6: '{' (p+= arrayinit ( ',' p+= arrayinit )* )? '}'
                    {
                    match(input,12,FOLLOW_12_in_arrayinit702); if (state.failed) return retval;
                    // CMinus.g:73:10: (p+= arrayinit ( ',' p+= arrayinit )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==12) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // CMinus.g:73:12: p+= arrayinit ( ',' p+= arrayinit )*
                            {
                            pushFollow(FOLLOW_arrayinit_in_arrayinit708);
                            p=arrayinit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (list_p==null) list_p=new ArrayList();
                            list_p.add(p.getTemplate());

                            // CMinus.g:73:25: ( ',' p+= arrayinit )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==13) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // CMinus.g:73:27: ',' p+= arrayinit
                            	    {
                            	    match(input,13,FOLLOW_13_in_arrayinit712); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_arrayinit_in_arrayinit716);
                            	    p=arrayinit();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if (list_p==null) list_p=new ArrayList();
                            	    list_p.add(p.getTemplate());


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,14,FOLLOW_14_in_arrayinit724); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 73:54: -> arrayInitializationBody(args=$p)
                      {
                          retval.st = templateLib.getInstanceOf("arrayInitializationBody",
                        new STAttrMap().put("args", list_p));
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
    // $ANTLR end "arrayinit"

    public static class declarator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declarator"
    // CMinus.g:76:1: declarator : ID -> {new StringTemplate($ID.text)};
    public final CMinusParser.declarator_return declarator() throws RecognitionException {
        CMinusParser.declarator_return retval = new CMinusParser.declarator_return();
        retval.start = input.LT(1);

        Token ID19=null;

        try {
            // CMinus.g:77:5: ( ID -> {new StringTemplate($ID.text)})
            // CMinus.g:77:9: ID
            {
            ID19=(Token)match(input,ID,FOLLOW_ID_in_declarator749); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 77:12: -> {new StringTemplate($ID.text)}
              {
                  retval.st = new StringTemplate((ID19!=null?ID19.getText():null));
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
    // CMinus.g:80:1: function : type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=$p);
    public final CMinusParser.function_return function() throws RecognitionException {
        slist_stack.push(new slist_scope());
        function_stack.push(new function_scope());
        CMinusParser.function_return retval = new CMinusParser.function_return();
        retval.start = input.LT(1);

        Token ID20=null;
        List list_p=null;
        CMinusParser.type_return type21 = null;

        RuleReturnScope p = null;

          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:89:5: ( type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=$p))
            // CMinus.g:89:9: type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block
            {
            pushFollow(FOLLOW_type_in_function786);
            type21=type();

            state._fsp--;
            if (state.failed) return retval;
            ID20=(Token)match(input,ID,FOLLOW_ID_in_function788); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((function_scope)function_stack.peek()).name =(ID20!=null?ID20.getText():null);
            }
            match(input,15,FOLLOW_15_in_function800); if (state.failed) return retval;
            // CMinus.g:90:13: (p+= formalParameter ( ',' p+= formalParameter )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID||(LA10_0>=19 && LA10_0<=27)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // CMinus.g:90:15: p+= formalParameter ( ',' p+= formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_function806);
                    p=formalParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_p==null) list_p=new ArrayList();
                    list_p.add(p.getTemplate());

                    // CMinus.g:90:34: ( ',' p+= formalParameter )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // CMinus.g:90:36: ',' p+= formalParameter
                    	    {
                    	    match(input,13,FOLLOW_13_in_function810); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_formalParameter_in_function814);
                    	    p=formalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_p==null) list_p=new ArrayList();
                    	    list_p.add(p.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_function822); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_function832);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 92:9: -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=$p)
              {
                  retval.st = templateLib.getInstanceOf("function",
                new STAttrMap().put("type", (type21!=null?type21.st:null)).put("name", ((function_scope)function_stack.peek()).name).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("args", list_p));
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
    // CMinus.g:98:1: formalParameter : ( type declarator -> parameter(type=$type.stname=$declarator.st) | type declarator '[]' -> arrayparameter(type=$type.stname=$declarator.st) | type declarator '[][]' -> doublearrayparameter(type=$type.stname=$declarator.st));
    public final CMinusParser.formalParameter_return formalParameter() throws RecognitionException {
        CMinusParser.formalParameter_return retval = new CMinusParser.formalParameter_return();
        retval.start = input.LT(1);

        CMinusParser.type_return type22 = null;

        CMinusParser.declarator_return declarator23 = null;

        CMinusParser.type_return type24 = null;

        CMinusParser.declarator_return declarator25 = null;

        CMinusParser.type_return type26 = null;

        CMinusParser.declarator_return declarator27 = null;


        try {
            // CMinus.g:99:5: ( type declarator -> parameter(type=$type.stname=$declarator.st) | type declarator '[]' -> arrayparameter(type=$type.stname=$declarator.st) | type declarator '[][]' -> doublearrayparameter(type=$type.stname=$declarator.st))
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // CMinus.g:99:9: type declarator
                    {
                    pushFollow(FOLLOW_type_in_formalParameter948);
                    type22=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_formalParameter950);
                    declarator23=declarator();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 100:9: -> parameter(type=$type.stname=$declarator.st)
                      {
                          retval.st = templateLib.getInstanceOf("parameter",
                        new STAttrMap().put("type", (type22!=null?type22.st:null)).put("name", (declarator23!=null?declarator23.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:101:6: type declarator '[]'
                    {
                    pushFollow(FOLLOW_type_in_formalParameter979);
                    type24=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_formalParameter981);
                    declarator25=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,17,FOLLOW_17_in_formalParameter983); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 102:6: -> arrayparameter(type=$type.stname=$declarator.st)
                      {
                          retval.st = templateLib.getInstanceOf("arrayparameter",
                        new STAttrMap().put("type", (type24!=null?type24.st:null)).put("name", (declarator25!=null?declarator25.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:103:6: type declarator '[][]'
                    {
                    pushFollow(FOLLOW_type_in_formalParameter1008);
                    type26=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_formalParameter1010);
                    declarator27=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,18,FOLLOW_18_in_formalParameter1012); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 104:6: -> doublearrayparameter(type=$type.stname=$declarator.st)
                      {
                          retval.st = templateLib.getInstanceOf("doublearrayparameter",
                        new STAttrMap().put("type", (type26!=null?type26.st:null)).put("name", (declarator27!=null?declarator27.st:null)));
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

    public static class type_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // CMinus.g:107:1: type : ( 'int' -> type_int() | 'long int' -> type_long_int() | 'long long int' -> type_long_long_int() | 'unsigned long int' -> type_unsigned_long_int() | 'unsigned long long int' -> type_unsigned_long_long_int() | 'unsigned int' -> type_unsigned_int() | 'char' -> type_char() | 'float' -> type_float() | 'double' -> type_double() | ID -> type_user_object(name=$ID.text));
    public final CMinusParser.type_return type() throws RecognitionException {
        CMinusParser.type_return retval = new CMinusParser.type_return();
        retval.start = input.LT(1);

        Token ID28=null;

        try {
            // CMinus.g:108:5: ( 'int' -> type_int() | 'long int' -> type_long_int() | 'long long int' -> type_long_long_int() | 'unsigned long int' -> type_unsigned_long_int() | 'unsigned long long int' -> type_unsigned_long_long_int() | 'unsigned int' -> type_unsigned_int() | 'char' -> type_char() | 'float' -> type_float() | 'double' -> type_double() | ID -> type_user_object(name=$ID.text))
            int alt12=10;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt12=1;
                }
                break;
            case 20:
                {
                alt12=2;
                }
                break;
            case 21:
                {
                alt12=3;
                }
                break;
            case 22:
                {
                alt12=4;
                }
                break;
            case 23:
                {
                alt12=5;
                }
                break;
            case 24:
                {
                alt12=6;
                }
                break;
            case 25:
                {
                alt12=7;
                }
                break;
            case 26:
                {
                alt12=8;
                }
                break;
            case 27:
                {
                alt12=9;
                }
                break;
            case ID:
                {
                alt12=10;
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
                    // CMinus.g:108:9: 'int'
                    {
                    match(input,19,FOLLOW_19_in_type1049); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 108:16: -> type_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_int");
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:109:6: 'long int'
                    {
                    match(input,20,FOLLOW_20_in_type1063); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 109:17: -> type_long_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_long_int");
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:110:6: 'long long int'
                    {
                    match(input,21,FOLLOW_21_in_type1076); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 110:22: -> type_long_long_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_long_long_int");
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:111:6: 'unsigned long int'
                    {
                    match(input,22,FOLLOW_22_in_type1089); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 111:26: -> type_unsigned_long_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_unsigned_long_int");
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:112:6: 'unsigned long long int'
                    {
                    match(input,23,FOLLOW_23_in_type1102); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 112:31: -> type_unsigned_long_long_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_unsigned_long_long_int");
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:113:6: 'unsigned int'
                    {
                    match(input,24,FOLLOW_24_in_type1115); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 113:21: -> type_unsigned_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_unsigned_int");
                      }

                    }
                    }
                    break;
                case 7 :
                    // CMinus.g:114:9: 'char'
                    {
                    match(input,25,FOLLOW_25_in_type1131); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 114:16: -> type_char()
                      {
                          retval.st = templateLib.getInstanceOf("type_char");
                      }

                    }
                    }
                    break;
                case 8 :
                    // CMinus.g:115:6: 'float'
                    {
                    match(input,26,FOLLOW_26_in_type1144); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 115:14: -> type_float()
                      {
                          retval.st = templateLib.getInstanceOf("type_float");
                      }

                    }
                    }
                    break;
                case 9 :
                    // CMinus.g:116:6: 'double'
                    {
                    match(input,27,FOLLOW_27_in_type1157); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 116:15: -> type_double()
                      {
                          retval.st = templateLib.getInstanceOf("type_double");
                      }

                    }
                    }
                    break;
                case 10 :
                    // CMinus.g:117:9: ID
                    {
                    ID28=(Token)match(input,ID,FOLLOW_ID_in_type1173); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 117:16: -> type_user_object(name=$ID.text)
                      {
                          retval.st = templateLib.getInstanceOf("type_user_object",
                        new STAttrMap().put("name", (ID28!=null?ID28.getText():null)));
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
    // CMinus.g:120:1: block : '{' ( variable | stat )* '}' ;
    public final CMinusParser.block_return block() throws RecognitionException {
        CMinusParser.block_return retval = new CMinusParser.block_return();
        retval.start = input.LT(1);

        CMinusParser.variable_return variable29 = null;

        CMinusParser.stat_return stat30 = null;


        try {
            // CMinus.g:121:5: ( '{' ( variable | stat )* '}' )
            // CMinus.g:121:8: '{' ( variable | stat )* '}'
            {
            match(input,12,FOLLOW_12_in_block1204); if (state.failed) return retval;
            // CMinus.g:122:8: ( variable | stat )*
            loop13:
            do {
                int alt13=3;
                switch ( input.LA(1) ) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    {
                    alt13=1;
                    }
                    break;
                case ID:
                    {
                    int LA13_3 = input.LA(2);

                    if ( ((LA13_3>=8 && LA13_3<=10)||LA13_3==15||(LA13_3>=32 && LA13_3<=54)) ) {
                        alt13=2;
                    }
                    else if ( (LA13_3==ID) ) {
                        alt13=1;
                    }


                    }
                    break;
                case FP:
                case INT:
                case 8:
                case 12:
                case 15:
                case 28:
                case 29:
                case 30:
                case 31:
                    {
                    alt13=2;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // CMinus.g:122:10: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_block1215);
            	    variable29=variable();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      ((slist_scope)slist_stack.peek()).locals.add((variable29!=null?variable29.st:null));
            	    }

            	    }
            	    break;
            	case 2 :
            	    // CMinus.g:122:57: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_block1221);
            	    stat30=stat();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      ((slist_scope)slist_stack.peek()).stats.add((stat30!=null?stat30.st:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_block1234); if (state.failed) return retval;

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
    // CMinus.g:127:1: stat : ( forStat -> {$forStat.st} | assignStat ';' -> valueWithSemicolon(value=$assignStat.st) | ifStat -> {$ifStat.st} | elseStat -> {$elseStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | 'return' expr ';' -> return(expr=$expr.st) | ';' -> {new StringTemplate(\";\")});
    public final CMinusParser.stat_return stat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.stat_return retval = new CMinusParser.stat_return();
        retval.start = input.LT(1);

        CMinusParser.forStat_return forStat31 = null;

        CMinusParser.assignStat_return assignStat32 = null;

        CMinusParser.ifStat_return ifStat33 = null;

        CMinusParser.elseStat_return elseStat34 = null;

        CMinusParser.expr_return expr35 = null;

        CMinusParser.expr_return expr36 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:133:5: ( forStat -> {$forStat.st} | assignStat ';' -> valueWithSemicolon(value=$assignStat.st) | ifStat -> {$ifStat.st} | elseStat -> {$elseStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | 'return' expr ';' -> return(expr=$expr.st) | ';' -> {new StringTemplate(\";\")})
            int alt14=8;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // CMinus.g:133:7: forStat
                    {
                    pushFollow(FOLLOW_forStat_in_stat1263);
                    forStat31=forStat();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 133:15: -> {$forStat.st}
                      {
                          retval.st = (forStat31!=null?forStat31.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:134:4: assignStat ';'
                    {
                    pushFollow(FOLLOW_assignStat_in_stat1272);
                    assignStat32=assignStat();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_stat1274); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 134:19: -> valueWithSemicolon(value=$assignStat.st)
                      {
                          retval.st = templateLib.getInstanceOf("valueWithSemicolon",
                        new STAttrMap().put("value", (assignStat32!=null?assignStat32.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:135:4: ifStat
                    {
                    pushFollow(FOLLOW_ifStat_in_stat1288);
                    ifStat33=ifStat();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 135:11: -> {$ifStat.st}
                      {
                          retval.st = (ifStat33!=null?ifStat33.st:null);
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:136:4: elseStat
                    {
                    pushFollow(FOLLOW_elseStat_in_stat1297);
                    elseStat34=elseStat();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 136:13: -> {$elseStat.st}
                      {
                          retval.st = (elseStat34!=null?elseStat34.st:null);
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:137:7: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_stat1309);
                    expr35=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_stat1311); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 137:16: -> statement(expr=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("statement",
                        new STAttrMap().put("expr", (expr35!=null?expr35.st:null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:138:7: block
                    {
                    pushFollow(FOLLOW_block_in_stat1328);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 138:13: -> statementList(locals=$slist::localsstats=$slist::stats)
                      {
                          retval.st = templateLib.getInstanceOf("statementList",
                        new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
                      }

                    }
                    }
                    break;
                case 7 :
                    // CMinus.g:139:4: 'return' expr ';'
                    {
                    match(input,28,FOLLOW_28_in_stat1347); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_stat1349);
                    expr36=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_stat1351); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 139:22: -> return(expr=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("return",
                        new STAttrMap().put("expr", (expr36!=null?expr36.st:null)));
                      }

                    }
                    }
                    break;
                case 8 :
                    // CMinus.g:140:7: ';'
                    {
                    match(input,8,FOLLOW_8_in_stat1368); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 140:11: -> {new StringTemplate(\";\")}
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
    // CMinus.g:143:1: ifStat : 'if' '(' e= condExpr ')' block -> ifBlock(e=$e.stlocals=$slist::localsstats=$slist::stats);
    public final CMinusParser.ifStat_return ifStat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.ifStat_return retval = new CMinusParser.ifStat_return();
        retval.start = input.LT(1);

        CMinusParser.condExpr_return e = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:149:5: ( 'if' '(' e= condExpr ')' block -> ifBlock(e=$e.stlocals=$slist::localsstats=$slist::stats))
            // CMinus.g:149:9: 'if' '(' e= condExpr ')' block
            {
            match(input,29,FOLLOW_29_in_ifStat1402); if (state.failed) return retval;
            match(input,15,FOLLOW_15_in_ifStat1404); if (state.failed) return retval;
            pushFollow(FOLLOW_condExpr_in_ifStat1408);
            e=condExpr();

            state._fsp--;
            if (state.failed) return retval;
            match(input,16,FOLLOW_16_in_ifStat1410); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_ifStat1412);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 150:9: -> ifBlock(e=$e.stlocals=$slist::localsstats=$slist::stats)
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
    // CMinus.g:154:1: elseStat : 'else' block -> elseBlock(locals=$slist::localsstats=$slist::stats);
    public final CMinusParser.elseStat_return elseStat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.elseStat_return retval = new CMinusParser.elseStat_return();
        retval.start = input.LT(1);


          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:160:5: ( 'else' block -> elseBlock(locals=$slist::localsstats=$slist::stats))
            // CMinus.g:160:9: 'else' block
            {
            match(input,30,FOLLOW_30_in_elseStat1488); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_elseStat1490);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 161:9: -> elseBlock(locals=$slist::localsstats=$slist::stats)
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
    // CMinus.g:164:1: forStat : 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats);
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
            // CMinus.g:170:5: ( 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats))
            // CMinus.g:170:9: 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block
            {
            match(input,31,FOLLOW_31_in_forStat1541); if (state.failed) return retval;
            match(input,15,FOLLOW_15_in_forStat1543); if (state.failed) return retval;
            pushFollow(FOLLOW_assignStat_in_forStat1547);
            e1=assignStat();

            state._fsp--;
            if (state.failed) return retval;
            match(input,8,FOLLOW_8_in_forStat1549); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_forStat1553);
            e2=expr();

            state._fsp--;
            if (state.failed) return retval;
            match(input,8,FOLLOW_8_in_forStat1555); if (state.failed) return retval;
            pushFollow(FOLLOW_assignStat_in_forStat1559);
            e3=assignStat();

            state._fsp--;
            if (state.failed) return retval;
            match(input,16,FOLLOW_16_in_forStat1561); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_forStat1563);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 171:9: -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats)
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
    // CMinus.g:175:1: assignStat : (e1= expr '=' e2= expr -> assign(lhs=$e1.strhs=$e2.st) | expr '++' -> inkrement(e=$expr.st) | expr '--' -> dekrement(e=$expr.st) | e1= expr '+=' e2= expr -> inkrementby(lhs=$e1.strhs=$e2.st) | e1= expr '-=' e2= expr -> dekrementby(lhs=$e1.strhs=$e2.st) | e1= expr '*=' e2= expr -> assignmultiply(lhs=$e1.strhs=$e2.st) | e1= expr '/=' e2= expr -> assigndivide(lhs=$e1.strhs=$e2.st));
    public final CMinusParser.assignStat_return assignStat() throws RecognitionException {
        CMinusParser.assignStat_return retval = new CMinusParser.assignStat_return();
        retval.start = input.LT(1);

        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;

        CMinusParser.expr_return expr37 = null;

        CMinusParser.expr_return expr38 = null;


        try {
            // CMinus.g:176:2: (e1= expr '=' e2= expr -> assign(lhs=$e1.strhs=$e2.st) | expr '++' -> inkrement(e=$expr.st) | expr '--' -> dekrement(e=$expr.st) | e1= expr '+=' e2= expr -> inkrementby(lhs=$e1.strhs=$e2.st) | e1= expr '-=' e2= expr -> dekrementby(lhs=$e1.strhs=$e2.st) | e1= expr '*=' e2= expr -> assignmultiply(lhs=$e1.strhs=$e2.st) | e1= expr '/=' e2= expr -> assigndivide(lhs=$e1.strhs=$e2.st))
            int alt15=7;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // CMinus.g:176:6: e1= expr '=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1635);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,9,FOLLOW_9_in_assignStat1637); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1641);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 176:26: -> assign(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("assign",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:177:6: expr '++'
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1662);
                    expr37=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,32,FOLLOW_32_in_assignStat1664); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 177:16: -> inkrement(e=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("inkrement",
                        new STAttrMap().put("e", (expr37!=null?expr37.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:178:6: expr '--'
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1680);
                    expr38=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,33,FOLLOW_33_in_assignStat1682); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 178:16: -> dekrement(e=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("dekrement",
                        new STAttrMap().put("e", (expr38!=null?expr38.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:179:6: e1= expr '+=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1700);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,34,FOLLOW_34_in_assignStat1702); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1706);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 179:27: -> inkrementby(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("inkrementby",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:180:6: e1= expr '-=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1729);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,35,FOLLOW_35_in_assignStat1731); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1735);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 180:27: -> dekrementby(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("dekrementby",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:181:6: e1= expr '*=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1758);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,36,FOLLOW_36_in_assignStat1760); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1764);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 181:27: -> assignmultiply(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("assignmultiply",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 7 :
                    // CMinus.g:182:6: e1= expr '/=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1787);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,37,FOLLOW_37_in_assignStat1789); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1793);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 182:27: -> assigndivide(lhs=$e1.strhs=$e2.st)
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
    // CMinus.g:185:1: expr : ( condExpr -> {$condExpr.st} | aexpr -> {$aexpr.st} | arrayinit -> {$arrayinit.st});
    public final CMinusParser.expr_return expr() throws RecognitionException {
        CMinusParser.expr_return retval = new CMinusParser.expr_return();
        retval.start = input.LT(1);

        CMinusParser.condExpr_return condExpr39 = null;

        CMinusParser.aexpr_return aexpr40 = null;

        CMinusParser.arrayinit_return arrayinit41 = null;


        try {
            // CMinus.g:185:5: ( condExpr -> {$condExpr.st} | aexpr -> {$aexpr.st} | arrayinit -> {$arrayinit.st})
            int alt16=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA16_1 = input.LA(2);

                if ( (synpred41_CMinus()) ) {
                    alt16=1;
                }
                else if ( (synpred42_CMinus()) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA16_2 = input.LA(2);

                if ( (synpred41_CMinus()) ) {
                    alt16=1;
                }
                else if ( (synpred42_CMinus()) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case FP:
                {
                int LA16_3 = input.LA(2);

                if ( (synpred41_CMinus()) ) {
                    alt16=1;
                }
                else if ( (synpred42_CMinus()) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;
                }
                }
                break;
            case INT:
                {
                int LA16_4 = input.LA(2);

                if ( (synpred41_CMinus()) ) {
                    alt16=1;
                }
                else if ( (synpred42_CMinus()) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // CMinus.g:185:9: condExpr
                    {
                    pushFollow(FOLLOW_condExpr_in_expr1821);
                    condExpr39=condExpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 185:18: -> {$condExpr.st}
                      {
                          retval.st = (condExpr39!=null?condExpr39.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:186:6: aexpr
                    {
                    pushFollow(FOLLOW_aexpr_in_expr1832);
                    aexpr40=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 186:12: -> {$aexpr.st}
                      {
                          retval.st = (aexpr40!=null?aexpr40.st:null);
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:187:6: arrayinit
                    {
                    pushFollow(FOLLOW_arrayinit_in_expr1843);
                    arrayinit41=arrayinit();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 187:16: -> {$arrayinit.st}
                      {
                          retval.st = (arrayinit41!=null?arrayinit41.st:null);
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
    // CMinus.g:190:1: arrayexpr : ID ( '[' p+= aexpr ']' )+ -> array(name=$ID.textindices=$p);
    public final CMinusParser.arrayexpr_return arrayexpr() throws RecognitionException {
        CMinusParser.arrayexpr_return retval = new CMinusParser.arrayexpr_return();
        retval.start = input.LT(1);

        Token ID42=null;
        List list_p=null;
        RuleReturnScope p = null;
        try {
            // CMinus.g:191:2: ( ID ( '[' p+= aexpr ']' )+ -> array(name=$ID.textindices=$p))
            // CMinus.g:191:6: ID ( '[' p+= aexpr ']' )+
            {
            ID42=(Token)match(input,ID,FOLLOW_ID_in_arrayexpr1864); if (state.failed) return retval;
            // CMinus.g:191:9: ( '[' p+= aexpr ']' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==10) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // CMinus.g:191:10: '[' p+= aexpr ']'
            	    {
            	    match(input,10,FOLLOW_10_in_arrayexpr1867); if (state.failed) return retval;
            	    pushFollow(FOLLOW_aexpr_in_arrayexpr1871);
            	    p=aexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_p==null) list_p=new ArrayList();
            	    list_p.add(p.getTemplate());

            	    match(input,11,FOLLOW_11_in_arrayexpr1873); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);



            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 191:29: -> array(name=$ID.textindices=$p)
              {
                  retval.st = templateLib.getInstanceOf("array",
                new STAttrMap().put("name", (ID42!=null?ID42.getText():null)).put("indices", list_p));
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
    // CMinus.g:194:1: funcexpr : ID '(' (p+= aexpr ( ',' p+= aexpr )* )? ')' -> funcinstance(name=$ID.textargs=$p);
    public final CMinusParser.funcexpr_return funcexpr() throws RecognitionException {
        CMinusParser.funcexpr_return retval = new CMinusParser.funcexpr_return();
        retval.start = input.LT(1);

        Token ID43=null;
        List list_p=null;
        RuleReturnScope p = null;
        try {
            // CMinus.g:195:5: ( ID '(' (p+= aexpr ( ',' p+= aexpr )* )? ')' -> funcinstance(name=$ID.textargs=$p))
            // CMinus.g:195:9: ID '(' (p+= aexpr ( ',' p+= aexpr )* )? ')'
            {
            ID43=(Token)match(input,ID,FOLLOW_ID_in_funcexpr1905); if (state.failed) return retval;
            match(input,15,FOLLOW_15_in_funcexpr1907); if (state.failed) return retval;
            // CMinus.g:195:16: (p+= aexpr ( ',' p+= aexpr )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=ID && LA19_0<=INT)||LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // CMinus.g:195:18: p+= aexpr ( ',' p+= aexpr )*
                    {
                    pushFollow(FOLLOW_aexpr_in_funcexpr1913);
                    p=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_p==null) list_p=new ArrayList();
                    list_p.add(p.getTemplate());

                    // CMinus.g:195:27: ( ',' p+= aexpr )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==13) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // CMinus.g:195:29: ',' p+= aexpr
                    	    {
                    	    match(input,13,FOLLOW_13_in_funcexpr1917); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_aexpr_in_funcexpr1921);
                    	    p=aexpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_p==null) list_p=new ArrayList();
                    	    list_p.add(p.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_funcexpr1929); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 195:52: -> funcinstance(name=$ID.textargs=$p)
              {
                  retval.st = templateLib.getInstanceOf("funcinstance",
                new STAttrMap().put("name", (ID43!=null?ID43.getText():null)).put("args", list_p));
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
    // CMinus.g:198:1: condExpr : (c1= condexp '&&' c2= condexp -> conjunction(left=$c1.stright=$c2.st) | c1= condexp '||' c2= condexp -> disjunction(left=$c1.stright=$c2.st) | c= condexp -> {$condexp.st});
    public final CMinusParser.condExpr_return condExpr() throws RecognitionException {
        CMinusParser.condExpr_return retval = new CMinusParser.condExpr_return();
        retval.start = input.LT(1);

        CMinusParser.condexp_return c1 = null;

        CMinusParser.condexp_return c2 = null;

        CMinusParser.condexp_return c = null;


        try {
            // CMinus.g:199:2: (c1= condexp '&&' c2= condexp -> conjunction(left=$c1.stright=$c2.st) | c1= condexp '||' c2= condexp -> disjunction(left=$c1.stright=$c2.st) | c= condexp -> {$condexp.st})
            int alt20=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA20_1 = input.LA(2);

                if ( (synpred46_CMinus()) ) {
                    alt20=1;
                }
                else if ( (synpred47_CMinus()) ) {
                    alt20=2;
                }
                else if ( (true) ) {
                    alt20=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA20_2 = input.LA(2);

                if ( (synpred46_CMinus()) ) {
                    alt20=1;
                }
                else if ( (synpred47_CMinus()) ) {
                    alt20=2;
                }
                else if ( (true) ) {
                    alt20=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case FP:
                {
                int LA20_3 = input.LA(2);

                if ( (synpred46_CMinus()) ) {
                    alt20=1;
                }
                else if ( (synpred47_CMinus()) ) {
                    alt20=2;
                }
                else if ( (true) ) {
                    alt20=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            case INT:
                {
                int LA20_4 = input.LA(2);

                if ( (synpred46_CMinus()) ) {
                    alt20=1;
                }
                else if ( (synpred47_CMinus()) ) {
                    alt20=2;
                }
                else if ( (true) ) {
                    alt20=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // CMinus.g:199:6: c1= condexp '&&' c2= condexp
                    {
                    pushFollow(FOLLOW_condexp_in_condExpr1958);
                    c1=condexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,38,FOLLOW_38_in_condExpr1960); if (state.failed) return retval;
                    pushFollow(FOLLOW_condexp_in_condExpr1964);
                    c2=condexp();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 199:33: -> conjunction(left=$c1.stright=$c2.st)
                      {
                          retval.st = templateLib.getInstanceOf("conjunction",
                        new STAttrMap().put("left", (c1!=null?c1.st:null)).put("right", (c2!=null?c2.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:200:6: c1= condexp '||' c2= condexp
                    {
                    pushFollow(FOLLOW_condexp_in_condExpr1986);
                    c1=condexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,39,FOLLOW_39_in_condExpr1988); if (state.failed) return retval;
                    pushFollow(FOLLOW_condexp_in_condExpr1992);
                    c2=condexp();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 200:33: -> disjunction(left=$c1.stright=$c2.st)
                      {
                          retval.st = templateLib.getInstanceOf("disjunction",
                        new STAttrMap().put("left", (c1!=null?c1.st:null)).put("right", (c2!=null?c2.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:201:6: c= condexp
                    {
                    pushFollow(FOLLOW_condexp_in_condExpr2014);
                    c=condexp();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 201:16: -> {$condexp.st}
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
    // CMinus.g:204:1: condexp : a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st}) ;
    public final CMinusParser.condexp_return condexp() throws RecognitionException {
        CMinusParser.condexp_return retval = new CMinusParser.condexp_return();
        retval.start = input.LT(1);

        CMinusParser.aexpr_return a = null;

        CMinusParser.aexpr_return b = null;


        try {
            // CMinus.g:205:5: (a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st}) )
            // CMinus.g:205:9: a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st})
            {
            pushFollow(FOLLOW_aexpr_in_condexp2036);
            a=aexpr();

            state._fsp--;
            if (state.failed) return retval;
            // CMinus.g:206:9: ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st})
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=40 && LA22_0<=45)) ) {
                alt22=1;
            }
            else if ( (LA22_0==EOF||(LA22_0>=8 && LA22_0<=9)||LA22_0==16||(LA22_0>=32 && LA22_0<=39)) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // CMinus.g:206:13: ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st))
                    {
                    // CMinus.g:206:13: ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st))
                    int alt21=6;
                    switch ( input.LA(1) ) {
                    case 40:
                        {
                        alt21=1;
                        }
                        break;
                    case 41:
                        {
                        alt21=2;
                        }
                        break;
                    case 42:
                        {
                        alt21=3;
                        }
                        break;
                    case 43:
                        {
                        alt21=4;
                        }
                        break;
                    case 44:
                        {
                        alt21=5;
                        }
                        break;
                    case 45:
                        {
                        alt21=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }

                    switch (alt21) {
                        case 1 :
                            // CMinus.g:206:16: '==' b= aexpr
                            {
                            match(input,40,FOLLOW_40_in_condexp2053); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp2057);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 206:29: -> equals(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("equals",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 2 :
                            // CMinus.g:207:16: '<' b= aexpr
                            {
                            match(input,41,FOLLOW_41_in_condexp2087); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp2091);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 207:30: -> lessThan(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("lessThan",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 3 :
                            // CMinus.g:208:7: '<=' b= aexpr
                            {
                            match(input,42,FOLLOW_42_in_condexp2114); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp2118);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 208:22: -> lessOrEqual(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("lessOrEqual",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 4 :
                            // CMinus.g:209:7: '>=' b= aexpr
                            {
                            match(input,43,FOLLOW_43_in_condexp2141); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp2145);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 209:22: -> moreOrEqual(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("moreOrEqual",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 5 :
                            // CMinus.g:210:7: '>' b= aexpr
                            {
                            match(input,44,FOLLOW_44_in_condexp2168); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp2172);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 210:21: -> moreThan(left=$a.stright=$b.st)
                              {
                                  retval.st = templateLib.getInstanceOf("moreThan",
                                new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                              }

                            }
                            }
                            break;
                        case 6 :
                            // CMinus.g:211:7: '!=' b= aexpr
                            {
                            match(input,45,FOLLOW_45_in_condexp2195); if (state.failed) return retval;
                            pushFollow(FOLLOW_aexpr_in_condexp2199);
                            b=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;


                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 211:22: -> unEqual(left=$a.stright=$b.st)
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
                    // CMinus.g:213:13: 
                    {

                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 213:13: -> {$a.st}
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
    // CMinus.g:217:1: basicexpr : ( '(' type ')' atom -> castvalue(type=$type.stvalue=$atom.st) | atom -> {$atom.st});
    public final CMinusParser.basicexpr_return basicexpr() throws RecognitionException {
        CMinusParser.basicexpr_return retval = new CMinusParser.basicexpr_return();
        retval.start = input.LT(1);

        CMinusParser.type_return type44 = null;

        CMinusParser.atom_return atom45 = null;

        CMinusParser.atom_return atom46 = null;


        try {
            // CMinus.g:218:2: ( '(' type ')' atom -> castvalue(type=$type.stvalue=$atom.st) | atom -> {$atom.st})
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                switch ( input.LA(2) ) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    {
                    alt23=1;
                    }
                    break;
                case ID:
                    {
                    int LA23_4 = input.LA(3);

                    if ( (LA23_4==10||LA23_4==15||(LA23_4>=38 && LA23_4<=54)) ) {
                        alt23=2;
                    }
                    else if ( (LA23_4==16) ) {
                        int LA23_5 = input.LA(4);

                        if ( ((LA23_5>=ID && LA23_5<=INT)||LA23_5==15) ) {
                            alt23=1;
                        }
                        else if ( (LA23_5==EOF||(LA23_5>=8 && LA23_5<=9)||LA23_5==11||LA23_5==13||LA23_5==16||(LA23_5>=32 && LA23_5<=54)) ) {
                            alt23=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case FP:
                case INT:
                case 12:
                case 15:
                    {
                    alt23=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA23_0>=ID && LA23_0<=INT)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // CMinus.g:218:6: '(' type ')' atom
                    {
                    match(input,15,FOLLOW_15_in_basicexpr2272); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_basicexpr2274);
                    type44=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_basicexpr2276); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_basicexpr2278);
                    atom45=atom();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 218:24: -> castvalue(type=$type.stvalue=$atom.st)
                      {
                          retval.st = templateLib.getInstanceOf("castvalue",
                        new STAttrMap().put("type", (type44!=null?type44.st:null)).put("value", (atom45!=null?atom45.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:219:6: atom
                    {
                    pushFollow(FOLLOW_atom_in_basicexpr2298);
                    atom46=atom();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 219:11: -> {$atom.st}
                      {
                          retval.st = (atom46!=null?atom46.st:null);
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
    // CMinus.g:222:1: aexpr : (a= basicexpr -> {$a.st}) ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '&' b= basicexpr -> bitwiseand(left=$aexpr.stright=$b.st)) | ( '|' b= basicexpr -> bitwiseor(left=$aexpr.stright=$b.st)) | ( '^' b= basicexpr -> bitwisexor(left=$aexpr.stright=$b.st)) | ( '<<' b= basicexpr -> bitwiseleftshift(left=$aexpr.stright=$b.st)) | ( '>>' b= basicexpr -> bitwiserightshift(left=$aexpr.stright=$b.st)) )* ;
    public final CMinusParser.aexpr_return aexpr() throws RecognitionException {
        CMinusParser.aexpr_return retval = new CMinusParser.aexpr_return();
        retval.start = input.LT(1);

        CMinusParser.basicexpr_return a = null;

        CMinusParser.basicexpr_return b = null;


        try {
            // CMinus.g:223:5: ( (a= basicexpr -> {$a.st}) ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '&' b= basicexpr -> bitwiseand(left=$aexpr.stright=$b.st)) | ( '|' b= basicexpr -> bitwiseor(left=$aexpr.stright=$b.st)) | ( '^' b= basicexpr -> bitwisexor(left=$aexpr.stright=$b.st)) | ( '<<' b= basicexpr -> bitwiseleftshift(left=$aexpr.stright=$b.st)) | ( '>>' b= basicexpr -> bitwiserightshift(left=$aexpr.stright=$b.st)) )* )
            // CMinus.g:223:9: (a= basicexpr -> {$a.st}) ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '&' b= basicexpr -> bitwiseand(left=$aexpr.stright=$b.st)) | ( '|' b= basicexpr -> bitwiseor(left=$aexpr.stright=$b.st)) | ( '^' b= basicexpr -> bitwisexor(left=$aexpr.stright=$b.st)) | ( '<<' b= basicexpr -> bitwiseleftshift(left=$aexpr.stright=$b.st)) | ( '>>' b= basicexpr -> bitwiserightshift(left=$aexpr.stright=$b.st)) )*
            {
            // CMinus.g:223:9: (a= basicexpr -> {$a.st})
            // CMinus.g:223:10: a= basicexpr
            {
            pushFollow(FOLLOW_basicexpr_in_aexpr2321);
            a=basicexpr();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 223:22: -> {$a.st}
              {
                  retval.st = (a!=null?a.st:null);
              }

            }
            }

            // CMinus.g:224:9: ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '&' b= basicexpr -> bitwiseand(left=$aexpr.stright=$b.st)) | ( '|' b= basicexpr -> bitwiseor(left=$aexpr.stright=$b.st)) | ( '^' b= basicexpr -> bitwisexor(left=$aexpr.stright=$b.st)) | ( '<<' b= basicexpr -> bitwiseleftshift(left=$aexpr.stright=$b.st)) | ( '>>' b= basicexpr -> bitwiserightshift(left=$aexpr.stright=$b.st)) )*
            loop24:
            do {
                int alt24=10;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    alt24=1;
                    }
                    break;
                case 47:
                    {
                    alt24=2;
                    }
                    break;
                case 48:
                    {
                    alt24=3;
                    }
                    break;
                case 49:
                    {
                    alt24=4;
                    }
                    break;
                case 50:
                    {
                    alt24=5;
                    }
                    break;
                case 51:
                    {
                    alt24=6;
                    }
                    break;
                case 52:
                    {
                    alt24=7;
                    }
                    break;
                case 53:
                    {
                    alt24=8;
                    }
                    break;
                case 54:
                    {
                    alt24=9;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // CMinus.g:224:10: ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:224:10: ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st))
            	    // CMinus.g:224:12: '+' b= basicexpr
            	    {
            	    match(input,46,FOLLOW_46_in_aexpr2339); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2343);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 224:28: -> add(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("add",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 2 :
            	    // CMinus.g:225:3: ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:225:3: ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st))
            	    // CMinus.g:225:5: '-' b= basicexpr
            	    {
            	    match(input,47,FOLLOW_47_in_aexpr2367); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2371);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 225:21: -> substract(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("substract",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 3 :
            	    // CMinus.g:226:3: ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:226:3: ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st))
            	    // CMinus.g:226:5: '*' b= basicexpr
            	    {
            	    match(input,48,FOLLOW_48_in_aexpr2395); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2399);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 226:21: -> multiply(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("multiply",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 4 :
            	    // CMinus.g:227:3: ( '/' b= basicexpr -> substract(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:227:3: ( '/' b= basicexpr -> substract(left=$aexpr.stright=$b.st))
            	    // CMinus.g:227:5: '/' b= basicexpr
            	    {
            	    match(input,49,FOLLOW_49_in_aexpr2423); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2427);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 227:21: -> substract(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("substract",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 5 :
            	    // CMinus.g:228:3: ( '&' b= basicexpr -> bitwiseand(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:228:3: ( '&' b= basicexpr -> bitwiseand(left=$aexpr.stright=$b.st))
            	    // CMinus.g:228:5: '&' b= basicexpr
            	    {
            	    match(input,50,FOLLOW_50_in_aexpr2451); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2455);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 228:21: -> bitwiseand(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("bitwiseand",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 6 :
            	    // CMinus.g:229:3: ( '|' b= basicexpr -> bitwiseor(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:229:3: ( '|' b= basicexpr -> bitwiseor(left=$aexpr.stright=$b.st))
            	    // CMinus.g:229:5: '|' b= basicexpr
            	    {
            	    match(input,51,FOLLOW_51_in_aexpr2479); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2483);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 229:21: -> bitwiseor(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("bitwiseor",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 7 :
            	    // CMinus.g:230:3: ( '^' b= basicexpr -> bitwisexor(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:230:3: ( '^' b= basicexpr -> bitwisexor(left=$aexpr.stright=$b.st))
            	    // CMinus.g:230:5: '^' b= basicexpr
            	    {
            	    match(input,52,FOLLOW_52_in_aexpr2507); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2511);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 230:21: -> bitwisexor(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("bitwisexor",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 8 :
            	    // CMinus.g:231:3: ( '<<' b= basicexpr -> bitwiseleftshift(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:231:3: ( '<<' b= basicexpr -> bitwiseleftshift(left=$aexpr.stright=$b.st))
            	    // CMinus.g:231:5: '<<' b= basicexpr
            	    {
            	    match(input,53,FOLLOW_53_in_aexpr2535); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2539);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 231:22: -> bitwiseleftshift(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("bitwiseleftshift",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 9 :
            	    // CMinus.g:232:3: ( '>>' b= basicexpr -> bitwiserightshift(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:232:3: ( '>>' b= basicexpr -> bitwiserightshift(left=$aexpr.stright=$b.st))
            	    // CMinus.g:232:5: '>>' b= basicexpr
            	    {
            	    match(input,54,FOLLOW_54_in_aexpr2563); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2567);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 232:22: -> bitwiserightshift(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("bitwiserightshift",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // CMinus.g:235:1: atom : ( arrayexpr -> {$arrayexpr.st} | funcexpr -> {$funcexpr.st} | ID -> refVar(id=$ID.text) | numericexpr -> iconst(value=$numericexpr.st) | '(' expr ')' -> brackets(expr=$expr.st));
    public final CMinusParser.atom_return atom() throws RecognitionException {
        CMinusParser.atom_return retval = new CMinusParser.atom_return();
        retval.start = input.LT(1);

        Token ID49=null;
        CMinusParser.arrayexpr_return arrayexpr47 = null;

        CMinusParser.funcexpr_return funcexpr48 = null;

        CMinusParser.numericexpr_return numericexpr50 = null;

        CMinusParser.expr_return expr51 = null;


        try {
            // CMinus.g:236:5: ( arrayexpr -> {$arrayexpr.st} | funcexpr -> {$funcexpr.st} | ID -> refVar(id=$ID.text) | numericexpr -> iconst(value=$numericexpr.st) | '(' expr ')' -> brackets(expr=$expr.st))
            int alt25=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt25=2;
                    }
                    break;
                case EOF:
                case 8:
                case 9:
                case 11:
                case 13:
                case 16:
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
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                    {
                    alt25=3;
                    }
                    break;
                case 10:
                    {
                    alt25=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }

                }
                break;
            case FP:
            case INT:
                {
                alt25=4;
                }
                break;
            case 15:
                {
                alt25=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // CMinus.g:236:7: arrayexpr
                    {
                    pushFollow(FOLLOW_arrayexpr_in_atom2602);
                    arrayexpr47=arrayexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 236:17: -> {$arrayexpr.st}
                      {
                          retval.st = (arrayexpr47!=null?arrayexpr47.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:237:4: funcexpr
                    {
                    pushFollow(FOLLOW_funcexpr_in_atom2611);
                    funcexpr48=funcexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 237:13: -> {$funcexpr.st}
                      {
                          retval.st = (funcexpr48!=null?funcexpr48.st:null);
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:238:7: ID
                    {
                    ID49=(Token)match(input,ID,FOLLOW_ID_in_atom2623); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 238:10: -> refVar(id=$ID.text)
                      {
                          retval.st = templateLib.getInstanceOf("refVar",
                        new STAttrMap().put("id", (ID49!=null?ID49.getText():null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:239:7: numericexpr
                    {
                    pushFollow(FOLLOW_numericexpr_in_atom2640);
                    numericexpr50=numericexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 239:19: -> iconst(value=$numericexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("iconst",
                        new STAttrMap().put("value", (numericexpr50!=null?numericexpr50.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:240:7: '(' expr ')'
                    {
                    match(input,15,FOLLOW_15_in_atom2657); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_atom2659);
                    expr51=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_atom2661); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 240:20: -> brackets(expr=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("brackets",
                        new STAttrMap().put("expr", (expr51!=null?expr51.st:null)));
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

    public static class numericexpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "numericexpr"
    // CMinus.g:243:1: numericexpr : ( FP ( 'f' | 'F' ) -> floatFloatingPoint(value=$FP.text) | FP -> doubleFloatingPoint(value=$FP.text) | INT ( 'u' | 'U' ) -> unsignedInt(value=$INT.text) | INT ( 'l' | 'L' ) -> longInt(value=$INT.text) | INT ( 'll' | 'LL' ) -> longLongInt(value=$INT.text) | INT ( 'lu' | 'Lu' | 'lU' | 'LU' | 'ul' | 'uL' | 'Ul' | 'UL' ) -> unsignedLongInt(value=$INT.text) | INT ( 'llu' | 'LLu' | 'llU' | 'LLU' | 'ull' | 'uLL' | 'Ull' | 'ULL' ) -> unsignedLongLongInt(value=$INT.text) | INT -> defaultInt(value=$INT.text));
    public final CMinusParser.numericexpr_return numericexpr() throws RecognitionException {
        CMinusParser.numericexpr_return retval = new CMinusParser.numericexpr_return();
        retval.start = input.LT(1);

        Token FP52=null;
        Token FP53=null;
        Token INT54=null;
        Token INT55=null;
        Token INT56=null;
        Token INT57=null;
        Token INT58=null;
        Token INT59=null;

        try {
            // CMinus.g:244:5: ( FP ( 'f' | 'F' ) -> floatFloatingPoint(value=$FP.text) | FP -> doubleFloatingPoint(value=$FP.text) | INT ( 'u' | 'U' ) -> unsignedInt(value=$INT.text) | INT ( 'l' | 'L' ) -> longInt(value=$INT.text) | INT ( 'll' | 'LL' ) -> longLongInt(value=$INT.text) | INT ( 'lu' | 'Lu' | 'lU' | 'LU' | 'ul' | 'uL' | 'Ul' | 'UL' ) -> unsignedLongInt(value=$INT.text) | INT ( 'llu' | 'LLu' | 'llU' | 'LLU' | 'ull' | 'uLL' | 'Ull' | 'ULL' ) -> unsignedLongLongInt(value=$INT.text) | INT -> defaultInt(value=$INT.text))
            int alt32=8;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // CMinus.g:244:7: FP ( 'f' | 'F' )
                    {
                    FP52=(Token)match(input,FP,FOLLOW_FP_in_numericexpr2689); if (state.failed) return retval;
                    // CMinus.g:244:10: ( 'f' | 'F' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==55) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==56) ) {
                        alt26=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // CMinus.g:244:11: 'f'
                            {
                            match(input,55,FOLLOW_55_in_numericexpr2692); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMinus.g:244:15: 'F'
                            {
                            match(input,56,FOLLOW_56_in_numericexpr2694); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 244:20: -> floatFloatingPoint(value=$FP.text)
                      {
                          retval.st = templateLib.getInstanceOf("floatFloatingPoint",
                        new STAttrMap().put("value", (FP52!=null?FP52.getText():null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:245:4: FP
                    {
                    FP53=(Token)match(input,FP,FOLLOW_FP_in_numericexpr2709); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 245:7: -> doubleFloatingPoint(value=$FP.text)
                      {
                          retval.st = templateLib.getInstanceOf("doubleFloatingPoint",
                        new STAttrMap().put("value", (FP53!=null?FP53.getText():null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:246:4: INT ( 'u' | 'U' )
                    {
                    INT54=(Token)match(input,INT,FOLLOW_INT_in_numericexpr2723); if (state.failed) return retval;
                    // CMinus.g:246:8: ( 'u' | 'U' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==57) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==58) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // CMinus.g:246:9: 'u'
                            {
                            match(input,57,FOLLOW_57_in_numericexpr2726); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMinus.g:246:13: 'U'
                            {
                            match(input,58,FOLLOW_58_in_numericexpr2728); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 246:18: -> unsignedInt(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("unsignedInt",
                        new STAttrMap().put("value", (INT54!=null?INT54.getText():null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:247:4: INT ( 'l' | 'L' )
                    {
                    INT55=(Token)match(input,INT,FOLLOW_INT_in_numericexpr2743); if (state.failed) return retval;
                    // CMinus.g:247:8: ( 'l' | 'L' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==59) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==60) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // CMinus.g:247:9: 'l'
                            {
                            match(input,59,FOLLOW_59_in_numericexpr2746); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMinus.g:247:13: 'L'
                            {
                            match(input,60,FOLLOW_60_in_numericexpr2748); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 247:18: -> longInt(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("longInt",
                        new STAttrMap().put("value", (INT55!=null?INT55.getText():null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:248:4: INT ( 'll' | 'LL' )
                    {
                    INT56=(Token)match(input,INT,FOLLOW_INT_in_numericexpr2763); if (state.failed) return retval;
                    // CMinus.g:248:8: ( 'll' | 'LL' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==61) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==62) ) {
                        alt29=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // CMinus.g:248:9: 'll'
                            {
                            match(input,61,FOLLOW_61_in_numericexpr2766); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMinus.g:248:14: 'LL'
                            {
                            match(input,62,FOLLOW_62_in_numericexpr2768); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 248:20: -> longLongInt(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("longLongInt",
                        new STAttrMap().put("value", (INT56!=null?INT56.getText():null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:249:4: INT ( 'lu' | 'Lu' | 'lU' | 'LU' | 'ul' | 'uL' | 'Ul' | 'UL' )
                    {
                    INT57=(Token)match(input,INT,FOLLOW_INT_in_numericexpr2783); if (state.failed) return retval;
                    // CMinus.g:249:8: ( 'lu' | 'Lu' | 'lU' | 'LU' | 'ul' | 'uL' | 'Ul' | 'UL' )
                    int alt30=8;
                    switch ( input.LA(1) ) {
                    case 63:
                        {
                        alt30=1;
                        }
                        break;
                    case 64:
                        {
                        alt30=2;
                        }
                        break;
                    case 65:
                        {
                        alt30=3;
                        }
                        break;
                    case 66:
                        {
                        alt30=4;
                        }
                        break;
                    case 67:
                        {
                        alt30=5;
                        }
                        break;
                    case 68:
                        {
                        alt30=6;
                        }
                        break;
                    case 69:
                        {
                        alt30=7;
                        }
                        break;
                    case 70:
                        {
                        alt30=8;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }

                    switch (alt30) {
                        case 1 :
                            // CMinus.g:249:9: 'lu'
                            {
                            match(input,63,FOLLOW_63_in_numericexpr2786); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMinus.g:249:14: 'Lu'
                            {
                            match(input,64,FOLLOW_64_in_numericexpr2788); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // CMinus.g:249:19: 'lU'
                            {
                            match(input,65,FOLLOW_65_in_numericexpr2790); if (state.failed) return retval;

                            }
                            break;
                        case 4 :
                            // CMinus.g:249:24: 'LU'
                            {
                            match(input,66,FOLLOW_66_in_numericexpr2792); if (state.failed) return retval;

                            }
                            break;
                        case 5 :
                            // CMinus.g:249:29: 'ul'
                            {
                            match(input,67,FOLLOW_67_in_numericexpr2794); if (state.failed) return retval;

                            }
                            break;
                        case 6 :
                            // CMinus.g:249:34: 'uL'
                            {
                            match(input,68,FOLLOW_68_in_numericexpr2796); if (state.failed) return retval;

                            }
                            break;
                        case 7 :
                            // CMinus.g:249:39: 'Ul'
                            {
                            match(input,69,FOLLOW_69_in_numericexpr2798); if (state.failed) return retval;

                            }
                            break;
                        case 8 :
                            // CMinus.g:249:44: 'UL'
                            {
                            match(input,70,FOLLOW_70_in_numericexpr2800); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 249:50: -> unsignedLongInt(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("unsignedLongInt",
                        new STAttrMap().put("value", (INT57!=null?INT57.getText():null)));
                      }

                    }
                    }
                    break;
                case 7 :
                    // CMinus.g:250:4: INT ( 'llu' | 'LLu' | 'llU' | 'LLU' | 'ull' | 'uLL' | 'Ull' | 'ULL' )
                    {
                    INT58=(Token)match(input,INT,FOLLOW_INT_in_numericexpr2815); if (state.failed) return retval;
                    // CMinus.g:250:8: ( 'llu' | 'LLu' | 'llU' | 'LLU' | 'ull' | 'uLL' | 'Ull' | 'ULL' )
                    int alt31=8;
                    switch ( input.LA(1) ) {
                    case 71:
                        {
                        alt31=1;
                        }
                        break;
                    case 72:
                        {
                        alt31=2;
                        }
                        break;
                    case 73:
                        {
                        alt31=3;
                        }
                        break;
                    case 74:
                        {
                        alt31=4;
                        }
                        break;
                    case 75:
                        {
                        alt31=5;
                        }
                        break;
                    case 76:
                        {
                        alt31=6;
                        }
                        break;
                    case 77:
                        {
                        alt31=7;
                        }
                        break;
                    case 78:
                        {
                        alt31=8;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // CMinus.g:250:9: 'llu'
                            {
                            match(input,71,FOLLOW_71_in_numericexpr2818); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMinus.g:250:15: 'LLu'
                            {
                            match(input,72,FOLLOW_72_in_numericexpr2820); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // CMinus.g:250:21: 'llU'
                            {
                            match(input,73,FOLLOW_73_in_numericexpr2822); if (state.failed) return retval;

                            }
                            break;
                        case 4 :
                            // CMinus.g:250:27: 'LLU'
                            {
                            match(input,74,FOLLOW_74_in_numericexpr2824); if (state.failed) return retval;

                            }
                            break;
                        case 5 :
                            // CMinus.g:250:33: 'ull'
                            {
                            match(input,75,FOLLOW_75_in_numericexpr2826); if (state.failed) return retval;

                            }
                            break;
                        case 6 :
                            // CMinus.g:250:39: 'uLL'
                            {
                            match(input,76,FOLLOW_76_in_numericexpr2828); if (state.failed) return retval;

                            }
                            break;
                        case 7 :
                            // CMinus.g:250:45: 'Ull'
                            {
                            match(input,77,FOLLOW_77_in_numericexpr2830); if (state.failed) return retval;

                            }
                            break;
                        case 8 :
                            // CMinus.g:250:51: 'ULL'
                            {
                            match(input,78,FOLLOW_78_in_numericexpr2832); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 250:58: -> unsignedLongLongInt(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("unsignedLongLongInt",
                        new STAttrMap().put("value", (INT58!=null?INT58.getText():null)));
                      }

                    }
                    }
                    break;
                case 8 :
                    // CMinus.g:251:4: INT
                    {
                    INT59=(Token)match(input,INT,FOLLOW_INT_in_numericexpr2847); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 251:8: -> defaultInt(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("defaultInt",
                        new STAttrMap().put("value", (INT59!=null?INT59.getText():null)));
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
    // $ANTLR end "numericexpr"

    // $ANTLR start synpred3_CMinus
    public final void synpred3_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:45:9: ( type declarator ';' )
        // CMinus.g:45:9: type declarator ';'
        {
        pushFollow(FOLLOW_type_in_synpred3_CMinus142);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declarator_in_synpred3_CMinus144);
        declarator();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred3_CMinus146); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_CMinus

    // $ANTLR start synpred4_CMinus
    public final void synpred4_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:49:6: ( type declarator '=' expr ';' )
        // CMinus.g:49:6: type declarator '=' expr ';'
        {
        pushFollow(FOLLOW_type_in_synpred4_CMinus208);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declarator_in_synpred4_CMinus210);
        declarator();

        state._fsp--;
        if (state.failed) return ;
        match(input,9,FOLLOW_9_in_synpred4_CMinus212); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred4_CMinus214);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred4_CMinus216); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_CMinus

    // $ANTLR start synpred5_CMinus
    public final void synpred5_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:53:6: ( type declarator '[' aexpr ']' ';' )
        // CMinus.g:53:6: type declarator '[' aexpr ']' ';'
        {
        pushFollow(FOLLOW_type_in_synpred5_CMinus283);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declarator_in_synpred5_CMinus285);
        declarator();

        state._fsp--;
        if (state.failed) return ;
        match(input,10,FOLLOW_10_in_synpred5_CMinus287); if (state.failed) return ;
        pushFollow(FOLLOW_aexpr_in_synpred5_CMinus289);
        aexpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,11,FOLLOW_11_in_synpred5_CMinus291); if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred5_CMinus293); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_CMinus

    // $ANTLR start synpred6_CMinus
    public final void synpred6_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:57:6: ( type declarator '[' aexpr ']' '=' arrayinit ';' )
        // CMinus.g:57:6: type declarator '[' aexpr ']' '=' arrayinit ';'
        {
        pushFollow(FOLLOW_type_in_synpred6_CMinus360);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declarator_in_synpred6_CMinus362);
        declarator();

        state._fsp--;
        if (state.failed) return ;
        match(input,10,FOLLOW_10_in_synpred6_CMinus364); if (state.failed) return ;
        pushFollow(FOLLOW_aexpr_in_synpred6_CMinus366);
        aexpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,11,FOLLOW_11_in_synpred6_CMinus368); if (state.failed) return ;
        match(input,9,FOLLOW_9_in_synpred6_CMinus370); if (state.failed) return ;
        pushFollow(FOLLOW_arrayinit_in_synpred6_CMinus372);
        arrayinit();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred6_CMinus374); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_CMinus

    // $ANTLR start synpred7_CMinus
    public final void synpred7_CMinus_fragment() throws RecognitionException {   
        CMinusParser.aexpr_return a = null;

        CMinusParser.aexpr_return b = null;


        // CMinus.g:61:6: ( type declarator '[' a= aexpr ']' '[' b= aexpr ']' ';' )
        // CMinus.g:61:6: type declarator '[' a= aexpr ']' '[' b= aexpr ']' ';'
        {
        pushFollow(FOLLOW_type_in_synpred7_CMinus449);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declarator_in_synpred7_CMinus451);
        declarator();

        state._fsp--;
        if (state.failed) return ;
        match(input,10,FOLLOW_10_in_synpred7_CMinus453); if (state.failed) return ;
        pushFollow(FOLLOW_aexpr_in_synpred7_CMinus457);
        a=aexpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,11,FOLLOW_11_in_synpred7_CMinus459); if (state.failed) return ;
        match(input,10,FOLLOW_10_in_synpred7_CMinus461); if (state.failed) return ;
        pushFollow(FOLLOW_aexpr_in_synpred7_CMinus465);
        b=aexpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,11,FOLLOW_11_in_synpred7_CMinus467); if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred7_CMinus469); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_CMinus

    // $ANTLR start synpred10_CMinus
    public final void synpred10_CMinus_fragment() throws RecognitionException {   
        List list_p=null;
        RuleReturnScope p = null;
        // CMinus.g:72:9: ( '{' (p+= numericexpr ( ',' p+= numericexpr )* )? '}' )
        // CMinus.g:72:9: '{' (p+= numericexpr ( ',' p+= numericexpr )* )? '}'
        {
        match(input,12,FOLLOW_12_in_synpred10_CMinus664); if (state.failed) return ;
        // CMinus.g:72:13: (p+= numericexpr ( ',' p+= numericexpr )* )?
        int alt35=2;
        int LA35_0 = input.LA(1);

        if ( ((LA35_0>=FP && LA35_0<=INT)) ) {
            alt35=1;
        }
        switch (alt35) {
            case 1 :
                // CMinus.g:72:15: p+= numericexpr ( ',' p+= numericexpr )*
                {
                pushFollow(FOLLOW_numericexpr_in_synpred10_CMinus670);
                p=numericexpr();

                state._fsp--;
                if (state.failed) return ;
                if (list_p==null) list_p=new ArrayList();
                list_p.add(p);

                // CMinus.g:72:30: ( ',' p+= numericexpr )*
                loop34:
                do {
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==13) ) {
                        alt34=1;
                    }


                    switch (alt34) {
                	case 1 :
                	    // CMinus.g:72:32: ',' p+= numericexpr
                	    {
                	    match(input,13,FOLLOW_13_in_synpred10_CMinus674); if (state.failed) return ;
                	    pushFollow(FOLLOW_numericexpr_in_synpred10_CMinus678);
                	    p=numericexpr();

                	    state._fsp--;
                	    if (state.failed) return ;
                	    if (list_p==null) list_p=new ArrayList();
                	    list_p.add(p);


                	    }
                	    break;

                	default :
                	    break loop34;
                    }
                } while (true);


                }
                break;

        }

        match(input,14,FOLLOW_14_in_synpred10_CMinus686); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_CMinus

    // $ANTLR start synpred29_CMinus
    public final void synpred29_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:134:4: ( assignStat ';' )
        // CMinus.g:134:4: assignStat ';'
        {
        pushFollow(FOLLOW_assignStat_in_synpred29_CMinus1272);
        assignStat();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred29_CMinus1274); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_CMinus

    // $ANTLR start synpred32_CMinus
    public final void synpred32_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:137:7: ( expr ';' )
        // CMinus.g:137:7: expr ';'
        {
        pushFollow(FOLLOW_expr_in_synpred32_CMinus1309);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred32_CMinus1311); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_CMinus

    // $ANTLR start synpred33_CMinus
    public final void synpred33_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:138:7: ( block )
        // CMinus.g:138:7: block
        {
        pushFollow(FOLLOW_block_in_synpred33_CMinus1328);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_CMinus

    // $ANTLR start synpred35_CMinus
    public final void synpred35_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:176:6: (e1= expr '=' e2= expr )
        // CMinus.g:176:6: e1= expr '=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred35_CMinus1635);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,9,FOLLOW_9_in_synpred35_CMinus1637); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred35_CMinus1641);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_CMinus

    // $ANTLR start synpred36_CMinus
    public final void synpred36_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:177:6: ( expr '++' )
        // CMinus.g:177:6: expr '++'
        {
        pushFollow(FOLLOW_expr_in_synpred36_CMinus1662);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,32,FOLLOW_32_in_synpred36_CMinus1664); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_CMinus

    // $ANTLR start synpred37_CMinus
    public final void synpred37_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:178:6: ( expr '--' )
        // CMinus.g:178:6: expr '--'
        {
        pushFollow(FOLLOW_expr_in_synpred37_CMinus1680);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,33,FOLLOW_33_in_synpred37_CMinus1682); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_CMinus

    // $ANTLR start synpred38_CMinus
    public final void synpred38_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:179:6: (e1= expr '+=' e2= expr )
        // CMinus.g:179:6: e1= expr '+=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred38_CMinus1700);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,34,FOLLOW_34_in_synpred38_CMinus1702); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred38_CMinus1706);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_CMinus

    // $ANTLR start synpred39_CMinus
    public final void synpred39_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:180:6: (e1= expr '-=' e2= expr )
        // CMinus.g:180:6: e1= expr '-=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred39_CMinus1729);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,35,FOLLOW_35_in_synpred39_CMinus1731); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred39_CMinus1735);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_CMinus

    // $ANTLR start synpred40_CMinus
    public final void synpred40_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:181:6: (e1= expr '*=' e2= expr )
        // CMinus.g:181:6: e1= expr '*=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred40_CMinus1758);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,36,FOLLOW_36_in_synpred40_CMinus1760); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred40_CMinus1764);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_CMinus

    // $ANTLR start synpred41_CMinus
    public final void synpred41_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:185:9: ( condExpr )
        // CMinus.g:185:9: condExpr
        {
        pushFollow(FOLLOW_condExpr_in_synpred41_CMinus1821);
        condExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_CMinus

    // $ANTLR start synpred42_CMinus
    public final void synpred42_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:186:6: ( aexpr )
        // CMinus.g:186:6: aexpr
        {
        pushFollow(FOLLOW_aexpr_in_synpred42_CMinus1832);
        aexpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_CMinus

    // $ANTLR start synpred46_CMinus
    public final void synpred46_CMinus_fragment() throws RecognitionException {   
        CMinusParser.condexp_return c1 = null;

        CMinusParser.condexp_return c2 = null;


        // CMinus.g:199:6: (c1= condexp '&&' c2= condexp )
        // CMinus.g:199:6: c1= condexp '&&' c2= condexp
        {
        pushFollow(FOLLOW_condexp_in_synpred46_CMinus1958);
        c1=condexp();

        state._fsp--;
        if (state.failed) return ;
        match(input,38,FOLLOW_38_in_synpred46_CMinus1960); if (state.failed) return ;
        pushFollow(FOLLOW_condexp_in_synpred46_CMinus1964);
        c2=condexp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_CMinus

    // $ANTLR start synpred47_CMinus
    public final void synpred47_CMinus_fragment() throws RecognitionException {   
        CMinusParser.condexp_return c1 = null;

        CMinusParser.condexp_return c2 = null;


        // CMinus.g:200:6: (c1= condexp '||' c2= condexp )
        // CMinus.g:200:6: c1= condexp '||' c2= condexp
        {
        pushFollow(FOLLOW_condexp_in_synpred47_CMinus1986);
        c1=condexp();

        state._fsp--;
        if (state.failed) return ;
        match(input,39,FOLLOW_39_in_synpred47_CMinus1988); if (state.failed) return ;
        pushFollow(FOLLOW_condexp_in_synpred47_CMinus1992);
        c2=condexp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_CMinus

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
    public final boolean synpred39_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_CMinus_fragment(); // can never throw exception
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
    public final boolean synpred33_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_CMinus_fragment(); // can never throw exception
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
    public final boolean synpred40_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_CMinus_fragment(); // can never throw exception
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
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA2_eotS =
        "\16\uffff";
    static final String DFA2_eofS =
        "\16\uffff";
    static final String DFA2_minS =
        "\13\4\1\10\2\uffff";
    static final String DFA2_maxS =
        "\1\33\12\4\1\17\2\uffff";
    static final String DFA2_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\12\16\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\3\14\4\uffff\1\15",
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
        "\21\uffff";
    static final String DFA3_eofS =
        "\21\uffff";
    static final String DFA3_minS =
        "\1\4\12\0\6\uffff";
    static final String DFA3_maxS =
        "\1\33\12\0\6\uffff";
    static final String DFA3_acceptS =
        "\13\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String DFA3_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\12\16\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
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
            return "44:1: variable : ( type declarator ';' -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st) | type declarator '=' expr ';' -> {$function.size()>0 && $function::name==null}? globalVariableInit(type=$type.stname=$declarator.stvalue=$expr.st) -> variableInit(type=$type.stname=$declarator.stvalue=$expr.st) | type declarator '[' aexpr ']' ';' -> {$function.size()>0 && $function::name==null}? globalArrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st) -> arrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st) | type declarator '[' aexpr ']' '=' arrayinit ';' -> {$function.size()>0 && $function::name==null}? globalArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st) -> arrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st) | type declarator '[' a= aexpr ']' '[' b= aexpr ']' ';' -> {$function.size()>0 && $function::name==null}? globalDoubleArrayDeclaration(type=$type.stname=$declarator.stsizeone=$a.stsizetwo=$b.st) -> doubleArrayDeclaration(type=$type.stname=$declarator.stsize=$a.stsizetwo=$b.st) | type declarator '[' a= aexpr ']' '[' b= aexpr ']' '=' arrayinit ';' -> {$function.size()>0 && $function::name==null}? globalDoubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st) -> doubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st));";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 11;}

                        else if ( (synpred4_CMinus()) ) {s = 12;}

                        else if ( (synpred5_CMinus()) ) {s = 13;}

                        else if ( (synpred6_CMinus()) ) {s = 14;}

                        else if ( (synpred7_CMinus()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 11;}

                        else if ( (synpred4_CMinus()) ) {s = 12;}

                        else if ( (synpred5_CMinus()) ) {s = 13;}

                        else if ( (synpred6_CMinus()) ) {s = 14;}

                        else if ( (synpred7_CMinus()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 11;}

                        else if ( (synpred4_CMinus()) ) {s = 12;}

                        else if ( (synpred5_CMinus()) ) {s = 13;}

                        else if ( (synpred6_CMinus()) ) {s = 14;}

                        else if ( (synpred7_CMinus()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 11;}

                        else if ( (synpred4_CMinus()) ) {s = 12;}

                        else if ( (synpred5_CMinus()) ) {s = 13;}

                        else if ( (synpred6_CMinus()) ) {s = 14;}

                        else if ( (synpred7_CMinus()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 11;}

                        else if ( (synpred4_CMinus()) ) {s = 12;}

                        else if ( (synpred5_CMinus()) ) {s = 13;}

                        else if ( (synpred6_CMinus()) ) {s = 14;}

                        else if ( (synpred7_CMinus()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 11;}

                        else if ( (synpred4_CMinus()) ) {s = 12;}

                        else if ( (synpred5_CMinus()) ) {s = 13;}

                        else if ( (synpred6_CMinus()) ) {s = 14;}

                        else if ( (synpred7_CMinus()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 11;}

                        else if ( (synpred4_CMinus()) ) {s = 12;}

                        else if ( (synpred5_CMinus()) ) {s = 13;}

                        else if ( (synpred6_CMinus()) ) {s = 14;}

                        else if ( (synpred7_CMinus()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 11;}

                        else if ( (synpred4_CMinus()) ) {s = 12;}

                        else if ( (synpred5_CMinus()) ) {s = 13;}

                        else if ( (synpred6_CMinus()) ) {s = 14;}

                        else if ( (synpred7_CMinus()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 11;}

                        else if ( (synpred4_CMinus()) ) {s = 12;}

                        else if ( (synpred5_CMinus()) ) {s = 13;}

                        else if ( (synpred6_CMinus()) ) {s = 14;}

                        else if ( (synpred7_CMinus()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index3_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_10 = input.LA(1);

                         
                        int index3_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 11;}

                        else if ( (synpred4_CMinus()) ) {s = 12;}

                        else if ( (synpred5_CMinus()) ) {s = 13;}

                        else if ( (synpred6_CMinus()) ) {s = 14;}

                        else if ( (synpred7_CMinus()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index3_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\17\uffff";
    static final String DFA11_eofS =
        "\13\uffff\1\15\3\uffff";
    static final String DFA11_minS =
        "\13\4\1\15\3\uffff";
    static final String DFA11_maxS =
        "\1\33\12\4\1\22\3\uffff";
    static final String DFA11_acceptS =
        "\14\uffff\1\2\1\1\1\3";
    static final String DFA11_specialS =
        "\17\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\12\16\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\15\2\uffff\1\15\1\14\1\16",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "98:1: formalParameter : ( type declarator -> parameter(type=$type.stname=$declarator.st) | type declarator '[]' -> arrayparameter(type=$type.stname=$declarator.st) | type declarator '[][]' -> doublearrayparameter(type=$type.stname=$declarator.st));";
        }
    }
    static final String DFA14_eotS =
        "\16\uffff";
    static final String DFA14_eofS =
        "\16\uffff";
    static final String DFA14_minS =
        "\1\4\1\uffff\5\0\7\uffff";
    static final String DFA14_maxS =
        "\1\37\1\uffff\5\0\7\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\5\uffff\1\3\1\4\1\7\1\10\1\2\1\5\1\6";
    static final String DFA14_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\7\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\3\1\4\1\5\1\uffff\1\12\3\uffff\1\6\2\uffff\1\2\14\uffff"+
            "\1\11\1\7\1\10\1\1",
            "",
            "\1\uffff",
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "127:1: stat : ( forStat -> {$forStat.st} | assignStat ';' -> valueWithSemicolon(value=$assignStat.st) | ifStat -> {$ifStat.st} | elseStat -> {$elseStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | 'return' expr ';' -> return(expr=$expr.st) | ';' -> {new StringTemplate(\";\")});";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_CMinus()) ) {s = 11;}

                        else if ( (synpred32_CMinus()) ) {s = 12;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_CMinus()) ) {s = 11;}

                        else if ( (synpred32_CMinus()) ) {s = 12;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_CMinus()) ) {s = 11;}

                        else if ( (synpred32_CMinus()) ) {s = 12;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_CMinus()) ) {s = 11;}

                        else if ( (synpred32_CMinus()) ) {s = 12;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_CMinus()) ) {s = 11;}

                        else if ( (synpred32_CMinus()) ) {s = 12;}

                        else if ( (synpred33_CMinus()) ) {s = 13;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\15\uffff";
    static final String DFA15_eofS =
        "\15\uffff";
    static final String DFA15_minS =
        "\1\4\5\0\7\uffff";
    static final String DFA15_maxS =
        "\1\17\5\0\7\uffff";
    static final String DFA15_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String DFA15_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\7\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\3\1\4\5\uffff\1\5\2\uffff\1\1",
            "\1\uffff",
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
            return "175:1: assignStat : (e1= expr '=' e2= expr -> assign(lhs=$e1.strhs=$e2.st) | expr '++' -> inkrement(e=$expr.st) | expr '--' -> dekrement(e=$expr.st) | e1= expr '+=' e2= expr -> inkrementby(lhs=$e1.strhs=$e2.st) | e1= expr '-=' e2= expr -> dekrementby(lhs=$e1.strhs=$e2.st) | e1= expr '*=' e2= expr -> assignmultiply(lhs=$e1.strhs=$e2.st) | e1= expr '/=' e2= expr -> assigndivide(lhs=$e1.strhs=$e2.st));";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_CMinus()) ) {s = 6;}

                        else if ( (synpred36_CMinus()) ) {s = 7;}

                        else if ( (synpred37_CMinus()) ) {s = 8;}

                        else if ( (synpred38_CMinus()) ) {s = 9;}

                        else if ( (synpred39_CMinus()) ) {s = 10;}

                        else if ( (synpred40_CMinus()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_CMinus()) ) {s = 6;}

                        else if ( (synpred36_CMinus()) ) {s = 7;}

                        else if ( (synpred37_CMinus()) ) {s = 8;}

                        else if ( (synpred38_CMinus()) ) {s = 9;}

                        else if ( (synpred39_CMinus()) ) {s = 10;}

                        else if ( (synpred40_CMinus()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_CMinus()) ) {s = 6;}

                        else if ( (synpred36_CMinus()) ) {s = 7;}

                        else if ( (synpred37_CMinus()) ) {s = 8;}

                        else if ( (synpred38_CMinus()) ) {s = 9;}

                        else if ( (synpred39_CMinus()) ) {s = 10;}

                        else if ( (synpred40_CMinus()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_CMinus()) ) {s = 6;}

                        else if ( (synpred36_CMinus()) ) {s = 7;}

                        else if ( (synpred37_CMinus()) ) {s = 8;}

                        else if ( (synpred38_CMinus()) ) {s = 9;}

                        else if ( (synpred39_CMinus()) ) {s = 10;}

                        else if ( (synpred40_CMinus()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_CMinus()) ) {s = 6;}

                        else if ( (synpred36_CMinus()) ) {s = 7;}

                        else if ( (synpred37_CMinus()) ) {s = 8;}

                        else if ( (synpred38_CMinus()) ) {s = 9;}

                        else if ( (synpred39_CMinus()) ) {s = 10;}

                        else if ( (synpred40_CMinus()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\13\uffff";
    static final String DFA32_eofS =
        "\1\uffff\1\3\1\12\10\uffff";
    static final String DFA32_minS =
        "\1\5\2\10\10\uffff";
    static final String DFA32_maxS =
        "\1\6\1\70\1\116\10\uffff";
    static final String DFA32_acceptS =
        "\3\uffff\1\2\1\1\1\7\1\6\1\5\1\4\1\3\1\10";
    static final String DFA32_specialS =
        "\13\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1\1\2",
            "\2\3\1\uffff\1\3\1\uffff\2\3\1\uffff\1\3\17\uffff\27\3\2\4",
            "\2\12\1\uffff\1\12\1\uffff\2\12\1\uffff\1\12\17\uffff\27\12"+
            "\2\uffff\2\11\2\10\2\7\10\6\10\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "243:1: numericexpr : ( FP ( 'f' | 'F' ) -> floatFloatingPoint(value=$FP.text) | FP -> doubleFloatingPoint(value=$FP.text) | INT ( 'u' | 'U' ) -> unsignedInt(value=$INT.text) | INT ( 'l' | 'L' ) -> longInt(value=$INT.text) | INT ( 'll' | 'LL' ) -> longLongInt(value=$INT.text) | INT ( 'lu' | 'Lu' | 'lU' | 'LU' | 'ul' | 'uL' | 'Ul' | 'UL' ) -> unsignedLongInt(value=$INT.text) | INT ( 'llu' | 'LLu' | 'llU' | 'LLU' | 'ull' | 'uLL' | 'Ull' | 'ULL' ) -> unsignedLongLongInt(value=$INT.text) | INT -> defaultInt(value=$INT.text));";
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_program61 = new BitSet(new long[]{0x000000000FF80012L});
    public static final BitSet FOLLOW_variable_in_declaration102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable144 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable210 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_variable212 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_variable214 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable285 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_variable287 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_variable289 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_variable291 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable362 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_variable364 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_variable366 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_variable368 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_variable370 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_arrayinit_in_variable372 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable451 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_variable453 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_variable457 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_variable459 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_variable461 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_variable465 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_variable467 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable546 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_variable548 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_variable552 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_variable554 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_variable556 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_variable560 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_variable562 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_variable564 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_arrayinit_in_variable566 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_arrayinit664 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_numericexpr_in_arrayinit670 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_arrayinit674 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_numericexpr_in_arrayinit678 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_arrayinit686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_arrayinit702 = new BitSet(new long[]{0x000000000000D070L});
    public static final BitSet FOLLOW_arrayinit_in_arrayinit708 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_arrayinit712 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_arrayinit_in_arrayinit716 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_arrayinit724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarator749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_function786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function788 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_function800 = new BitSet(new long[]{0x000000000FF90010L});
    public static final BitSet FOLLOW_formalParameter_in_function806 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_function810 = new BitSet(new long[]{0x000000000FF80010L});
    public static final BitSet FOLLOW_formalParameter_in_function814 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_function822 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_function832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameter948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_formalParameter950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameter979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_formalParameter981 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_formalParameter983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameter1008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_formalParameter1010 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_formalParameter1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_type1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_type1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_type1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_type1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_type1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_type1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_type1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_type1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_block1204 = new BitSet(new long[]{0x00000000FFF8D170L});
    public static final BitSet FOLLOW_variable_in_block1215 = new BitSet(new long[]{0x00000000FFF8D170L});
    public static final BitSet FOLLOW_stat_in_block1221 = new BitSet(new long[]{0x00000000FFF8D170L});
    public static final BitSet FOLLOW_14_in_block1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStat_in_stat1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_stat1272 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stat1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStat_in_stat1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseStat_in_stat1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat1309 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stat1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_stat1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_stat1347 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_stat1349 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stat1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_stat1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ifStat1402 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ifStat1404 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_condExpr_in_ifStat1408 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ifStat1410 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_ifStat1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_elseStat1488 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_elseStat1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_forStat1541 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_forStat1543 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_assignStat_in_forStat1547 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_forStat1549 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_forStat1553 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_forStat1555 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_assignStat_in_forStat1559 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_forStat1561 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_forStat1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1635 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_assignStat1637 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_assignStat1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1662 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_assignStat1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1680 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_assignStat1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1700 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_assignStat1702 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_assignStat1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1729 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_assignStat1731 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_assignStat1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1758 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_assignStat1760 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_assignStat1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1787 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_assignStat1789 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_assignStat1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_expr1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_expr1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayinit_in_expr1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arrayexpr1864 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_arrayexpr1867 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_arrayexpr1871 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_arrayexpr1873 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ID_in_funcexpr1905 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_funcexpr1907 = new BitSet(new long[]{0x0000000000018070L});
    public static final BitSet FOLLOW_aexpr_in_funcexpr1913 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_funcexpr1917 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_funcexpr1921 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_funcexpr1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_condExpr1958 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_condExpr1960 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_condexp_in_condExpr1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_condExpr1986 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_condExpr1988 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_condexp_in_condExpr1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_condExpr2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condexp2036 = new BitSet(new long[]{0x00003F0000000002L});
    public static final BitSet FOLLOW_40_in_condexp2053 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_condexp2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_condexp2087 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_condexp2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_condexp2114 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_condexp2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_condexp2141 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_condexp2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_condexp2168 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_condexp2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_condexp2195 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_condexp2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_basicexpr2272 = new BitSet(new long[]{0x000000000FF80010L});
    public static final BitSet FOLLOW_type_in_basicexpr2274 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_basicexpr2276 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_atom_in_basicexpr2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_basicexpr2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2321 = new BitSet(new long[]{0x007FC00000000002L});
    public static final BitSet FOLLOW_46_in_aexpr2339 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2343 = new BitSet(new long[]{0x007FC00000000002L});
    public static final BitSet FOLLOW_47_in_aexpr2367 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2371 = new BitSet(new long[]{0x007FC00000000002L});
    public static final BitSet FOLLOW_48_in_aexpr2395 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2399 = new BitSet(new long[]{0x007FC00000000002L});
    public static final BitSet FOLLOW_49_in_aexpr2423 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2427 = new BitSet(new long[]{0x007FC00000000002L});
    public static final BitSet FOLLOW_50_in_aexpr2451 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2455 = new BitSet(new long[]{0x007FC00000000002L});
    public static final BitSet FOLLOW_51_in_aexpr2479 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2483 = new BitSet(new long[]{0x007FC00000000002L});
    public static final BitSet FOLLOW_52_in_aexpr2507 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2511 = new BitSet(new long[]{0x007FC00000000002L});
    public static final BitSet FOLLOW_53_in_aexpr2535 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2539 = new BitSet(new long[]{0x007FC00000000002L});
    public static final BitSet FOLLOW_54_in_aexpr2563 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2567 = new BitSet(new long[]{0x007FC00000000002L});
    public static final BitSet FOLLOW_arrayexpr_in_atom2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcexpr_in_atom2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericexpr_in_atom2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_atom2657 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_atom2659 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_atom2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FP_in_numericexpr2689 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_numericexpr2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_numericexpr2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FP_in_numericexpr2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_numericexpr2723 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_57_in_numericexpr2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_numericexpr2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_numericexpr2743 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_59_in_numericexpr2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_numericexpr2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_numericexpr2763 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_61_in_numericexpr2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_numericexpr2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_numericexpr2783 = new BitSet(new long[]{0x8000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_63_in_numericexpr2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_numericexpr2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_numericexpr2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_numericexpr2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_numericexpr2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_numericexpr2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_numericexpr2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_numericexpr2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_numericexpr2815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007F80L});
    public static final BitSet FOLLOW_71_in_numericexpr2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_numericexpr2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_numericexpr2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_numericexpr2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_numericexpr2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_numericexpr2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_numericexpr2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_numericexpr2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_numericexpr2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred3_CMinus142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_synpred3_CMinus144 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred3_CMinus146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred4_CMinus208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_synpred4_CMinus210 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_synpred4_CMinus212 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_synpred4_CMinus214 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred4_CMinus216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred5_CMinus283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_synpred5_CMinus285 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_synpred5_CMinus287 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_synpred5_CMinus289 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred5_CMinus291 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred5_CMinus293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred6_CMinus360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_synpred6_CMinus362 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_synpred6_CMinus364 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_synpred6_CMinus366 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred6_CMinus368 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_synpred6_CMinus370 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_arrayinit_in_synpred6_CMinus372 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred6_CMinus374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred7_CMinus449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_synpred7_CMinus451 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_synpred7_CMinus453 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_synpred7_CMinus457 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred7_CMinus459 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_synpred7_CMinus461 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_aexpr_in_synpred7_CMinus465 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred7_CMinus467 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred7_CMinus469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred10_CMinus664 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_numericexpr_in_synpred10_CMinus670 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_synpred10_CMinus674 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_numericexpr_in_synpred10_CMinus678 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_synpred10_CMinus686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_synpred29_CMinus1272 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred29_CMinus1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred32_CMinus1309 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred32_CMinus1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred33_CMinus1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred35_CMinus1635 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_synpred35_CMinus1637 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_synpred35_CMinus1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred36_CMinus1662 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred36_CMinus1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred37_CMinus1680 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred37_CMinus1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred38_CMinus1700 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred38_CMinus1702 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_synpred38_CMinus1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred39_CMinus1729 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred39_CMinus1731 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_synpred39_CMinus1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred40_CMinus1758 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_synpred40_CMinus1760 = new BitSet(new long[]{0x0000000000009070L});
    public static final BitSet FOLLOW_expr_in_synpred40_CMinus1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_synpred41_CMinus1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_synpred42_CMinus1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_synpred46_CMinus1958 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_synpred46_CMinus1960 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_condexp_in_synpred46_CMinus1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_synpred47_CMinus1986 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred47_CMinus1988 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_condexp_in_synpred47_CMinus1992 = new BitSet(new long[]{0x0000000000000002L});

}