public static void main(String[] args)
{
  try {
        ANTLRInputStream input = new ANTLRInputStream(
            new FileInputStream(args[0]));

        morphinityLexer lexer = new morphinityLexer(input);
        GYOOParser parser = new morphinityParser(new CommonTokenStream(lexer));
        parser.addParseListener(new MyListener());

        // Start parsing
        parser.program();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
