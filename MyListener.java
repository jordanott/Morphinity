public class MyListener extend morphinityBaseListener {

  private Map<String, ArrayList<ArrayList<Integer>>> variables;

  public MyListener(){
    variables = new HashMap<>();
  }

  @Override
  public void exitAssign(morphinityParser.AssignContext ctx)
  {
    
  }
}
