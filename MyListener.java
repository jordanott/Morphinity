
import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class MyListener extends morphinityBaseListener {
  // TODO change to matrix objects 
  private Map<String, ArrayList<ArrayList<Integer>>> variables;

  public MyListener(){
    variables = new HashMap<>();
  }

  @Override
  public void exitAssign(morphinityParser.AssignContext ctx)
  {
    ArrayList<ArrayList<Integer>> values = new ArrayList();
    //Get variable name
    String variableName = ctx.ID(0).getText();

    //TODO: Handle if it is an expression or just a = b
    if(ctx.ID().size() == 2)
    {
      //works for case a = b when b exists (add a check that b exists)
      String value = ctx.ID(1).getText();
      values = variables.get(value);
    }
    else{

      for(int i = 0; i<ctx.matrix().row().size(); ++i)
      {
        values.add(new ArrayList());
        for(int j =0; j<ctx.matrix().row(0).NUMBER().size(); ++j)
        {
          values.get(i).add(Integer.parseInt(ctx.matrix().row(i).NUMBER(j).getText()));
        }
      }

    }

    variables.put(variableName, values);

  }

  @Override
  public void exitPrint(morphinityParser.PrintContext ctx)
  {
    System.out.println(variables.get(ctx.ID().getText()).toString());
  }
  @Override
  public void exitOperation(morphinityParser.OperationContext ctx)
  {
    if(ctx.ID().size() > 2)
    {
      String newValue = ctx.ID(0).getText();
      String value1 = ctx.ID(1).getText();
      String value2 = ctx.ID(2).getText();
      ArrayList<ArrayList<Integer>> newMatrix = new ArrayList();
      ArrayList<ArrayList<Integer>> array1 = variables.get(value1);
      ArrayList<ArrayList<Integer>> array2 = variables.get(value2);
      //TODO: Check dimension of value1 and value2 to match operations needs
      switch(ctx.expr().getText())
      {
        case "+":
            //works for case a = b when b exists (add a check that b exists)
            //for a = b+c
            //a=newValue
            //b=value1
            //c=value2

            System.out.println(newValue + " = " + value1 + "+" + value2);
            for(int i=0; i<variables.get(value1).size(); ++i)
            {
              newMatrix.add(new ArrayList<Integer>());
              for(int j=0; j<variables.get(value1).get(0).size(); ++j)
              {
                newMatrix.get(i).add(j, array1.get(i).get(j)+array2.get(i).get(j));
                //newMatrix.add(i,newMatrix.get(i).add());
              }
            }

            variables.put(newValue, newMatrix);
        break;
        case "-":
          //works for case a = b when b exists (add a check that b exists)
          //for a = b-c
          //a=newValue
          //b=value1
          //c=value2

          System.out.println(newValue + " = " + value1 + "-" + value2);

          for(int k=0; k<variables.get(value1).size(); ++k)
          {
            newMatrix.add(new ArrayList<Integer>());
            for(int l=0; l<variables.get(value1).get(0).size(); ++l)
            {
              newMatrix.get(k).add(l, array1.get(k).get(l)-array2.get(k).get(l));

            }
          }

          variables.put(newValue, newMatrix);
        break;
        case ".":
          //works for case a = b when b exists (add a check that b exists)
          //for a = b.c
          //a=newValue
          //b=value1
          //c=value2

          System.out.println(newValue + " = " + value1 + "." + value2);

          for(int m=0; m<variables.get(value1).size(); ++m)
          {
            newMatrix.add(new ArrayList<Integer>());
            for(int n=0; n<variables.get(value1).get(0).size(); ++n)
            {
              newMatrix.get(m).add(n, array1.get(m).get(n)*array2.get(m).get(n));

            }
          }
          variables.put(newValue, newMatrix);
          break;
        case "*":
          //works for case a = b when b exists (add a check that b exists)
          //for a = b.c
          //a=newValue
          //b=value1
          //c=value2

          System.out.println(newValue + " = " + value1 + "." + value2);

          for(int m=0; m<variables.get(value1).size(); ++m)
          {
            newMatrix.add(new ArrayList<Integer>());
            for(int n=0; n<variables.get(value1).get(0).size(); ++n)
            {
              newMatrix.get(m).add(n, array1.get(m).get(n)*array2.get(m).get(n));
            }
          }
          variables.put(newValue, newMatrix);
        break;
      }
    }


  }

}
