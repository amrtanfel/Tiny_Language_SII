grammar grammaire;
import  lexar;
prog: 'compil' PRM_NAME  '(' ')' '{' declarations 'start' list_inst  '}' ;
declarations:  dec declarations| dec|;
dec:type list_idfdec ';';
type:'intCompil'
      |'floatCompil';
list_idfdec: IDF| IDF ',' list_idfdec;
list_idfInst: IDF| IDF ',' list_idfInst;
list_inst: inst list_inst| inst ;
inst: lecture | ecriture |affect | cnd ;
lecture: 'scancompil''('list_idfInst')'';';
ecriture:'printcompil''('affich ')'';';
affich: MESSAGE
        |list_idfInst;
affect: IDF AFFECT exp_ar';';
cte:ENTIER|REAL;
exp_ar:exp_ar op1 a
      |a;
op1:'+'|'-';
a:a op2 b|b;
op2:'*'|'/';
b: operator | '(' exp_ar ')';
operator: IDF|cte;
cnd:'if''(' cond ')' 'then' '{' list_inst '}' els;
els:'else''{'list_inst'}'
   |;
cond: exp_ar OP_COMP  exp_ar  ;