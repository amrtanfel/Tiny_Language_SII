import java.util.ArrayList;
import java.lang.*;
public class ListeQuads {
    public ArrayList<qElement> quads = new ArrayList<qElement>();
    public void addqElement(String v1,String v2,String v3,String v4)
    {
        qElement elem=new qElement(v1,v2,v3,v4);
        quads.add(elem);
    }
    public qElement getqElement(int indice)
    {
      return quads.get(indice);
    }
    public int size()
    {
        return this.quads.size();
    }


}
