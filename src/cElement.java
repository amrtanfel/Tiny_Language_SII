public class cElement {
    String element[]=new String[4];
    public cElement(String etiq,String inst,String op1,String op2)
    {   this.element[0]=etiq;
        this.element[1]=inst;
        this.element[2]=op1;
        this.element[3]=op2;
    }

    public String getVal(int indice)
    {
        return this.element[indice];
    }
    public void setVal(int indice,String val)
    {
        this.element[indice]=val;
    }
    public String ToString()
    {
        return element[0]+"  "+element[1]+"  "+element[2]+"  "+element[3];
    }
}
