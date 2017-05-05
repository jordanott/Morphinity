import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Main{

  public static void main(String[] args)
  {
    try {
          ANTLRInputStream input = new ANTLRInputStream(
              new FileInputStream(args[0]));

          morphinityLexer lexer = new morphinityLexer(input);
          morphinityParser parser = new morphinityParser(new CommonTokenStream(lexer));
          parser.addParseListener(new MyListener());

          // Start parsing
          parser.program();
      } catch (IOException e) {
          e.printStackTrace();
      }

  }
}
