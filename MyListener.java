import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class MyListener extends morphinityBaseListener {

  private Map<String, ArrayList<ArrayList<Integer>>> variables;

  public MyListener(){
    variables = new HashMap<>();
  }

  @Override
  public void exitAssign(morphinityParser.AssignContext ctx)
  {
    //Get variable name
    String variableName = ctx.ID(0).getText();

    //TODO: Handle if it is an expression or just a = b
    if(ctx.ID().size() > 1)
    {
      //works for case a = b
      String value = ctx.ID(1).getText();
    }
    else{
      ArrayList<ArrayList<Integer>> values = new ArrayList();
      for(int i = 0; i<ctx.row().size(); ++i)
      {
        values.add(new Arraylist());
        for(int j =0; j<ctx.row(0).NUMBER().size(); ++j)
        {
          values.get(i).add(Integer.parseInt(ctx.row(i).NUMBER(j).getText()));
        }
      }
    }

    if(ctx.ID().size() > 1)
    {

    }
    else
      variables.put(variableName, values);
  }

  @Override
  public void exitPrint(morphinityParser.AssignContext ctx)
  {
    System.out.println(variables.get(ctx.ID().getText()).toString());
  }
}
