import java.util.ArrayList;
import java.lang.*;
public class AST{
    public ArrayList<node> TS = new ArrayList<node>();
   public void addInode(String name,int type,int size)
   {
     node e= new node(name,type,size);
     TS.add(e);
   }
   public node getInode(String name)//par nom
   {
       String inodname;
       for (int i=0;i<TS.size();i++)
       {
           inodname=TS.get(i).getName();
           if (inodname.compareTo(name)==0)
               return TS.get(i);
       }
       return null;
   }
   public node getInode(int indice)// par indice
   {
       return TS.get(indice);
   }
    public void removeInode(String name)// par nom
    {
        String inodname;
        for (int i=0;i<TS.size();i++)
        {
            inodname=TS.get(i).getName();
            if (inodname.compareTo(name)==0)
                TS.remove(i);
                break;
        }
    }
    public void removeInode(int indice)//par indice
    {
        TS.remove(indice);
    }
    public boolean containsInode(String name)
    {
        if(getInode(name)==null) return false;
        else return true;
    }
    public int getsize()
    {
        return TS.size();
    }
}