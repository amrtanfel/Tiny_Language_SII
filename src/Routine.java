import java.util.ArrayList;

public class Routine extends grammaireBaseListener {
    int erreur=0;
    private AST tabSymbole = new AST();
    private ArrayList<Integer> Type_ex= new ArrayList<Integer>();

    // si l idf existe deja elle affiche une erreur sinon elle crée une nouvelle entrée dans la table des symboles
    @Override
    public void enterDec(grammaireParser.DecContext ctx) {
        int type;

        String typ = ctx.type().getText();

        if (typ.equals("intCompil")) type = 1;// entier
        else type = 2;//reel
        grammaireParser.List_idfdecContext liste = ctx.list_idfdec();
        String name;
        while (liste != null) {
            name = liste.IDF().getText();
            if (tabSymbole.containsInode(name)) {
                System.out.println("Erreur!! double declarations de la variable " + name);
                erreur=1;
            } else {
                tabSymbole.addInode(name, type, 1);
            }
            liste = liste.list_idfdec();
        }
    }

    // elle verifie si les ids sont declarés ou nn
    public void enterLecture(grammaireParser.LectureContext ctx) {
        grammaireParser.List_idfInstContext liste = ctx.list_idfInst();// prend le 1er NT
        String name;
        while (liste != null) {
            name = liste.IDF().getText();
            if (!tabSymbole.containsInode(name)) {
                System.out.println("Erreur!! la variable " + name + " n'est pas declarée");
                erreur =1;
            }
            liste = liste.list_idfInst();
        }
    }

    //elle verifie si les ids sont declarés
    public void enterEcriture(grammaireParser.EcritureContext ctx) {
        grammaireParser.List_idfInstContext liste = ctx.affich().list_idfInst();
        String name;
        while (liste != null) {
            name = liste.IDF().getText();
            if (!tabSymbole.containsInode(name)) {
                System.out.println("Erreur!! la variable " + name + " n'est pas déclarée");
                erreur=1;
            }
            liste = liste.list_idfInst();
        }
    }

    //elle verifie si l idf de l'affectation est declaré
    public void enterAffect(grammaireParser.AffectContext ctx) {
        Type_ex=new ArrayList<Integer>();

    }


    @Override
    public void exitAffect(grammaireParser.AffectContext ctx) {
        String name = ctx.IDF().getText();
        int typeidf,typeExp=1;
        if (!tabSymbole.containsInode(name)) {
            erreur=1;
            System.out.println("Erreur!! la variable " + name + " n'est pas declarée");
        }
        else
        {
            typeidf=tabSymbole.getInode(name).getType();
            for (int i=0;i<Type_ex.size();i++)
            {
                if(Type_ex.get(i)!=1)
                {typeExp=2;
                    break;}

            }

            if (typeidf!=typeExp)
            {
                erreur=1;
                System.out.println("Erreur!! Affectation avec des types incompatibles");
            }
        }

    }
    public void enterExp_ar(grammaireParser.Exp_arContext ctx) {
        grammaireParser.AContext A;
        grammaireParser.BContext B;
        String name;
            int type=1;
            A=ctx.a();
            while(A!=null)
            {
                B=A.b();
                if(B.operator()!=null )
                {
                    if( B.operator().IDF()!=null) {
                        name = B.operator().IDF().getText();
                        if (!tabSymbole.containsInode(name)) {
                            erreur=1;
                            System.out.println("Erreur!! la variable " + name + " n'est pas déclarée");
                        } else type = type * tabSymbole.getInode(name).getType();
                    }
                    else
                    {
                        if(B.operator().cte().ENTIER()!=null) type=type*1;

                        else type=type*2;
                    }
                }

                A=A.a();
            }
            Type_ex.add(type);



    }

    public void enterProg(grammaireParser.ProgContext ctx)
    {
        System.out.println("\n Analyse sémantique:\n");
    }
    public void exitProg(grammaireParser.ProgContext ctx)
    {
       if (erreur==0)
       {
           System.out.println("Le programme est correct sémantiquement");
       }
       else
           System.exit(1);
    }

}