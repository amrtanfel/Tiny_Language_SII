import java.util.ArrayList;
import java.lang.*;
public class quadGeneration extends grammaireBaseListener {
    private ListeQuads Listquads = new ListeQuads();
    private ArrayList<String> resultatA = new ArrayList<String>();
    private ArrayList<String> resultatExp = new ArrayList<String>();
    private ArrayList<Integer> IF = new ArrayList<Integer>();
    int indiceT=0;
    indiceEtiq indE=new indiceEtiq(0);
    public void exitExp_ar(grammaireParser.Exp_arContext ctx) {
        String v1=" ",v2=" ",v3=" ",v4=" ";
        if (ctx.exp_ar()==null) {
            resultatExp.add(resultatA.get(resultatA.size() - 1));
            resultatA.remove(resultatA.size() - 1);
        }
        else
        {
            v1=ctx.op1().getText();
            v2=resultatExp.get(resultatExp.size()-1);
            resultatExp.remove(resultatExp.size()-1);
            v3=resultatA.get(resultatA.size()-1);
            resultatA.remove(resultatA.size()-1);
            v4='T'+String.valueOf(indiceT);
            indiceT++;
            resultatExp.add(v4);
            Listquads.addqElement(v1,v2,v3,v4);
        }
    }
    public void exitAffect(grammaireParser.AffectContext ctx) {
        String v1="=",v2=resultatExp.get(resultatExp.size()-1),v3=" ",v4=ctx.IDF().getText();
        resultatExp.remove(resultatExp.size()-1);
        Listquads.addqElement(v1,v2,v3,v4);
    }
    public void exitA(grammaireParser.AContext ctx)
    {
        String v1=" ",v2=" ",v3=" ",v4=" ";
        grammaireParser.BContext B=ctx.b();
        if(ctx.a()==null)
        {
            if(B.exp_ar()==null)
            {
                resultatA.add(B.operator().getText());
            }
            else{ resultatA.add(resultatExp.get(resultatExp.size()-1));
                resultatExp.remove(resultatExp.size()-1);
            }
        }
        else
        {
            v1=ctx.op2().getText();
            v2=resultatA.get(resultatA.size()-1);
            resultatA.remove(resultatA.size()-1);
            if(B.exp_ar()==null)
            {
                v3=B.operator().getText();
            }
            else{
                v3=resultatExp.get(resultatExp.size()-1);
                resultatExp.remove(resultatExp.size()-1);
            }
            v4='T'+String.valueOf(indiceT);
            indiceT++;
            resultatA.add(v4);
            Listquads.addqElement(v1,v2,v3,v4);
        }
    }
    public void enterProg(grammaireParser.ProgContext ctx)
    {
        System.out.println("\n Génération des quadruples:\n");
    }
    public void exitProg(grammaireParser.ProgContext ctx) {
        Listquads.addqElement("FIN"," "," "," ");
        for (int i=0;i<Listquads.quads.size();i++)
        {
            System.out.println((i+1)+": "+Listquads.getqElement(i).ToString());

        }
        ListeCode Code=new ListeCode();
        System.out.println("\n Génération du code objet :\n");

     //generation du code objet
        for (int i=0;i<Listquads.quads.size();i++)
        {

            Code.Inst(Listquads.getqElement(i),i,indE);
        }
        //affichage du code objet
        for (int i=0;i<Code.code.size();i++)
        {
            System.out.println(Code.getqElement(i).ToString());
        }
    }
    public void exitCond(grammaireParser.CondContext ctx)
    {
        String v1;
        String v4=resultatExp.get(resultatExp.size()-1);
        resultatExp.remove(resultatExp.size()-1);
        String v3=resultatExp.get(resultatExp.size()-1);
        resultatExp.remove(resultatExp.size()-1);
        switch (ctx.OP_COMP().getText())
        {
            case "==":v1="BNE";break;
            case "<>":v1="BE";break;
            case "<":v1="BGE"; break;
            case ">":v1="BLE";break;
            case "<=":v1="BG";break;
            default:v1="BL";break;
        }
        Listquads.addqElement(v1," ",v3,v4);
        IF.add(Listquads.size()-1);

    }

    @Override
    public void exitCnd(grammaireParser.CndContext ctx) {

        String v2=String.valueOf(Listquads.size()+1);
        Listquads.getqElement(IF.get(IF.size()-1)).setVal(1,v2);
        IF.remove(IF.size()-1);

    }

    @Override
    public void enterEls(grammaireParser.ElsContext ctx) {
        if (ctx.getText()!="")
        {
            String v2=String.valueOf(Listquads.size()+2);
            Listquads.getqElement(IF.get(IF.size()-1)).setVal(1,v2);
            IF.remove(IF.size()-1);
            Listquads.addqElement("BR"," "," "," ");
            IF.add(Listquads.size()-1);

        }
    }
}