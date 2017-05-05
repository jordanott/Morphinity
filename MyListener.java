
import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class MyListener extends morphinityBaseListener {
  // TODO change to matrix objects
  private Map<String, Matrix> variables;

  public MyListener(){
    variables = new HashMap<>();
  }

  @Override
  public void exitAssign(morphinityParser.AssignContext ctx)
  {

    //Get variable name
    String variableName = ctx.ID(0).getText();

    //TODO: Handle if it is an expression or just a = b
    if(ctx.ID().size() == 2)
    {
      //works for case a = b when b exists (add a check that b exists)
      String value = ctx.ID(1).getText();

      variables.put(variableName,variables.get(value));
    }
    else{
      ArrayList<ArrayList<Double>> values = new ArrayList();
      for(int i = 0; i<ctx.matrix().row().size(); ++i)
      {
        values.add(new ArrayList());
        for(int j =0; j<ctx.matrix().row(0).NUMBER().size(); ++j)
        {
          values.get(i).add(Double.parseDouble(ctx.matrix().row(i).NUMBER(j).getText()));
        }
      }
      variables.put(variableName, new Matrix(values));
    }

  }

  @Override
  public void exitPrint(morphinityParser.PrintContext ctx)
  {
    variables.get(ctx.ID().getText()).print();
  }

  @Override
  public void exitOperation(morphinityParser.OperationContext ctx)
  {
    if(ctx.ID().size() > 2)
    {
      String newValue = ctx.ID(0).getText();
      String value1 = ctx.ID(1).getText();
      String value2 = ctx.ID(2).getText();
      System.out.println(newValue + " = " + value1 + ctx.expr().getText() + value2);

      Matrix A = variables.get(value1);
      Matrix B = variables.get(value2);
      //TODO: Check dimension of value1 and value2 to match operations needs
      Matrix newMatrix =new Matrix(new ArrayList<ArrayList<Double>>());
      MatrixOperations mo = new MatrixOperations(A,B);
      if (ctx.expr().getText().equals("*")) {
        newMatrix = mo.multiplication();
      }
      else{
        newMatrix = mo.operation(ctx.expr().getText());
      }
      variables.put(newValue,newMatrix);

    }


  }

}
