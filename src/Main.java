import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
public class Main
{ public static void main(String[] args) throws Exception
    { String inputFile=null;
        if(args.length>0){

            inputFile=args[3];
        }
        InputStream is=System.in;
        if(inputFile!=null)
        {
            is=new FileInputStream(inputFile);
        }
        CharStream input=new UnbufferedCharStream(is);
        grammaireLexer lex=new grammaireLexer(input);
        lex.setTokenFactory(new CommonTokenFactory(true));
        TokenStream tokens = new UnbufferedTokenStream<CommonToken>(lex);
        grammaireParser parser=new grammaireParser(tokens);

        //parser.removeErrorListeners();
        ParseTree tree = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new Routine(),tree);
        walker.walk(new quadGeneration(),tree);
    }
}

