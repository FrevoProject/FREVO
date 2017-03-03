grammar CMinus;
options {
   output=template;
   backtrack=true;
}

scope slist {
    List locals; // must be defined one per semicolon
    List stats;
}

/*
@slist::init {
    locals = new ArrayList();
    stats = new ArrayList();
}
*/

@header {
import org.antlr.stringtemplate.*;
}

program
scope {
  List globals;
  List functions;
}
@init {
  $program::globals = new ArrayList();
  $program::functions = new ArrayList();
}
    :   declaration+
        -> program(globals={$program::globals},functions={$program::functions})
    ;

declaration
    :   variable   {$program::globals.add($variable.st);}
    |   f=function {$program::functions.add($f.st);}
    ;

// ack is $function.st ambig?  It can mean the rule's dyn scope or
// the ref in this rule.  Ack.

variable
    :   type declarator ';'
        -> {$function.size()>0 && $function::name==null}?
           globalVariable(type={$type.st},name={$declarator.st})
        -> variable(type={$type.st},name={$declarator.st})
	|   type declarator '=' expr ';'
	    -> {$function.size()>0 && $function::name==null}?
           globalVariableInit(type={$type.st},name={$declarator.st},value={$expr.st})
        -> variableInit(type={$type.st},name={$declarator.st},value={$expr.st})
	|   type declarator '[' aexpr ']' ';'
	    -> {$function.size()>0 && $function::name==null}?
           globalArrayDeclaration(type={$type.st},name={$declarator.st},size={$aexpr.st})
        -> arrayDeclaration(type={$type.st},name={$declarator.st},size={$aexpr.st})
	|   type declarator '[' aexpr ']' '=' arrayinit ';'
	    -> {$function.size()>0 && $function::name==null}?
           globalArrayInitialization(type={$type.st},name={$declarator.st},values={$arrayinit.st},size={$aexpr.st})
        -> arrayInitialization(type={$type.st},name={$declarator.st},values={$arrayinit.st},size={$aexpr.st})
	|   type declarator '[' a=aexpr ']' '[' b=aexpr ']' ';'
	    -> {$function.size()>0 && $function::name==null}?
           globalDoubleArrayDeclaration(type={$type.st},name={$declarator.st},sizeone={$a.st},sizetwo={$b.st})
        -> doubleArrayDeclaration(type={$type.st},name={$declarator.st},size={$a.st},sizetwo={$b.st})
	|   type declarator '[' a=aexpr ']' '[' b=aexpr ']' '=' arrayinit ';'
	    -> {$function.size()>0 && $function::name==null}?
           globalDoubleArrayInitialization(type={$type.st},name={$declarator.st},values={$arrayinit.st},sizeone={$a.st},sizetwo={$b.st})
        -> doubleArrayInitialization(type={$type.st},name={$declarator.st},values={$arrayinit.st},sizeone={$a.st},sizetwo={$b.st})
    ;
	
arrayinit
    :   '{' ( p+=definednumber ( ',' p+=definednumber )* )? '}' -> arrayInitializationBody(args={$p})
	|   '{' ( p+=arrayinit ( ',' p+=arrayinit )* )? '}' -> arrayInitializationBody(args={$p})
	;

declarator
    :   ID -> {new StringTemplate($ID.text)}
    ;

function
scope {
    String name;
}
scope slist;
@init {
  $slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
}
    :   type ID {$function::name=$ID.text;}
        '(' ( p+=formalParameter ( ',' p+=formalParameter )* )? ')'
        block
        -> function(type={$type.st}, name={$function::name},
                    locals={$slist::locals},
                    stats={$slist::stats},
                    args={$p})
    ;

formalParameter
    :   type declarator 
        -> parameter(type={$type.st},name={$declarator.st})
	|   type declarator '[]'
	    -> arrayparameter(type={$type.st},name={$declarator.st})
	|   type declarator '[][]'
	    -> doublearrayparameter(type={$type.st},name={$declarator.st})
    ;
	
definednumber
    :   FP -> iconst(value={$FP.text})
	|   INT -> iconst(value={$INT.text})
	;

type
    :   'int'  -> type_int()
    |   'char' -> type_char()
	|   'float' -> type_float()
	|   'double' -> type_double()
    |   ID     -> type_user_object(name={$ID.text})
    ;

block
    :  '{'
       ( variable {$slist::locals.add($variable.st);} | stat {$slist::stats.add($stat.st);})*
       '}'
    ;
	

stat
scope slist;
@init {
  $slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
}
    : forStat -> {$forStat.st}
	| ifStat -> {$ifStat.st}
	| elseStat -> {$elseStat.st}
    | expr ';' -> statement(expr={$expr.st})
    | block -> statementList(locals={$slist::locals}, stats={$slist::stats})
    | assignStat ';' -> {$assignStat.st}
	| 'return' expr ';' -> return(expr={$expr.st})
    | ';' -> {new StringTemplate(";")}
    ;
	
ifStat
scope slist;
@init {
  $slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
}
    :   'if' '(' e=condExpr ')' block
        -> ifBlock(e={$e.st},
                   locals={$slist::locals}, stats={$slist::stats})
    ;
	
elseStat
scope slist;
@init {
  $slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
}
    :   'else' block
        -> elseBlock(locals={$slist::locals}, stats={$slist::stats})
    ;

forStat
scope slist;
@init {
  $slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
}
    :   'for' '(' e1=assignStat ';' e2=expr ';' e3=assignStat ')' block
        -> forLoop(e1={$e1.st},e2={$e2.st},e3={$e3.st},
                   locals={$slist::locals}, stats={$slist::stats})
    ;

assignStat
	:   e1=expr '=' e2=expr -> assign(lhs={$e1.st}, rhs={$e2.st})
	|   expr '++' -> inkrement(e={$expr.st})
	|   expr '--' -> dekrement(e={$expr.st})
	|   e1=expr '+=' e2=expr -> inkrementby(lhs={$e1.st}, rhs={$e2.st})
	|   e1=expr '-=' e2=expr -> dekrementby(lhs={$e1.st}, rhs={$e2.st})
	|   e1=expr '*=' e2=expr -> assignmultiply(lhs={$e1.st}, rhs={$e2.st})
	|   e1=expr '/=' e2=expr -> assigndivide(lhs={$e1.st}, rhs={$e2.st})
    ;

expr:   condExpr -> {$condExpr.st}
	|   aexpr -> {$aexpr.st}
	|   arrayinit -> {$arrayinit.st}
    ;
	
arrayexpr
	:   ID ('[' p+=aexpr ']')+ -> array(name={$ID.text},indices={$p})
	;
	
funcexpr
    :   ID '(' ( p+=aexpr ( ',' p+=aexpr )* )? ')' -> funcinstance(name={$ID.text},args={$p})
	;
	
condExpr
	:   c1=condexp '&&' c2=condexp -> conjunction(left={$c1.st},right={$c2.st})
	|   c1=condexp '||' c2=condexp -> disjunction(left={$c1.st},right={$c2.st})
	|   c=condexp -> {$condexp.st}
	;

condexp
    :   a=aexpr
        (   (  '==' b=aexpr -> equals(left={$a.st},right={$b.st})
            |  '<' b=aexpr   -> lessThan(left={$a.st},right={$b.st})
			|  '<=' b=aexpr   -> lessOrEqual(left={$a.st},right={$b.st})
			|  '>=' b=aexpr   -> moreOrEqual(left={$a.st},right={$b.st})
			|  '>' b=aexpr   -> moreThan(left={$a.st},right={$b.st})
			|  '!=' b=aexpr   -> unEqual(left={$a.st},right={$b.st})
            )
        |   -> {$a.st} // else just aexpr
        )
    ;
	
basicexpr
	:   '(' type ')' atom -> castvalue(type={$type.st},value={$atom.st})
	|   atom -> {$atom.st}
	;

aexpr
    :   (a=basicexpr -> {$a.st})
        (( '+' b=basicexpr -> add(left={$aexpr.st}, right={$b.st}) ) |
		( '-' b=basicexpr -> substract(left={$aexpr.st}, right={$b.st}) ) |
		( '*' b=basicexpr -> multiply(left={$aexpr.st}, right={$b.st}) ) |
		( '/' b=basicexpr -> substract(left={$aexpr.st}, right={$b.st}) ) |
		( '&' b=basicexpr -> bitwiseand(left={$aexpr.st}, right={$b.st}) ) |
		( '|' b=basicexpr -> bitwiseor(left={$aexpr.st}, right={$b.st}) ) |
		( '^' b=basicexpr -> bitwisexor(left={$aexpr.st}, right={$b.st}) ) |
		( '<<' b=basicexpr -> bitwiseleftshift(left={$aexpr.st}, right={$b.st}) ) |
		( '>>' b=basicexpr -> bitwiserightshift(left={$aexpr.st}, right={$b.st}) ))*
    ;

atom
    : arrayexpr -> {$arrayexpr.st}
	| funcexpr -> {$funcexpr.st}
    | ID -> refVar(id={$ID.text})
    | INT -> iconst(value={$INT.text})
	| FP -> iconst(value={$FP.text})
    | '(' expr ')' -> brackets(expr={$expr.st})
    ; 

ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT	:	('0'..'9')+
	;
	
FP  :   ('0'..'9')+ ('.') ('0'..'9')+
	;

WS  :   (' ' | '\t' | '\r' | '\n')+ {_channel=99;}
    ;    
