import java.lang.*;// l'element de l' AST
public class node
{
    private String name;
    private int type;
    private  int size;
    public node(String name,int type,int size)
    {
        this.setName(name);
        this.setType(type);
        this.setSize(size);
    }
    //Accesseurs
    public String getName(){return name;}
    public int getType(){return type;}
    public int getSize(){return size;}
    //Mutateurs
    public void setName(String name){this.name=name;}
    public void setType(int type){this.type=type;}
    public void setSize(int size){this.size=size;}
}