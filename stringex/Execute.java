import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class Execute extends TextGrammarBaseVisitor<String> {
   
   HashMap<String, String> variaveis = new HashMap<String, String>();

   @Override public String visitPrint(TextGrammarParser.PrintContext ctx) {
      String expr = visit(ctx.expr());

      if (expr != null){
         System.out.printf("%s\n", expr);
         return expr;
      } else {
         System.out.println("ERROR: não existe expr \n");
         return null;
      }
   }

   @Override public String visitAssign(TextGrammarParser.AssignContext ctx) {
      String expr = visit(ctx.expr());
      
      if (expr != null){
         variaveis.put(ctx.ID().getText(), expr);
      }

      return null;
   }

   @Override public String visitParentesis(TextGrammarParser.ParentesisContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitAdd(TextGrammarParser.AddContext ctx) {
      String expr1, expr2;
      
      expr1= visit( ctx.expr(0) );
      expr2= visit( ctx.expr(1) );

      if(expr1 == null || expr2 == null){
         return null;
      }

      return expr1 + expr2;
   }

   @Override public String visitInput(TextGrammarParser.InputContext ctx) {
      String expr = visit(ctx.expr());
      Scanner sc = new Scanner(System.in);

      if (expr == null) return null;
      System.out.println(expr);

      return sc.nextLine();
   }

   @Override public String visitSub(TextGrammarParser.SubContext ctx) {
      String expr1, expr2;
      
      expr1= visit( ctx.expr(0) );
      expr2= visit( ctx.expr(1) );

      if(expr1 == null || expr2 == null){
         return null;
      }

      return ( new String(expr1) ).replace(expr2, "");
   }

   @Override public String visitTrim(TextGrammarParser.TrimContext ctx) {
      String expr = visit( ctx.expr() );

      if(expr == null){
         return null;
      }

      return ( new String(expr) ).trim();
   }

   @Override public String visitReplace(TextGrammarParser.ReplaceContext ctx) {
      String expr1, expr2, expr3;

      expr1= visit( ctx.expr(0) );
      expr2= visit( ctx.expr(1) );
      expr3= visit( ctx.expr(2) );

      if(expr1 == null || expr2 == null || expr3 == null){
         return null;
      }

      return ( new String(expr1) ).replace(expr2, expr3);
   }

   @Override public String visitId(TextGrammarParser.IdContext ctx) {
      String id = ctx.ID().getText();
      String expr = variaveis.get(id);

      if (id != null){
         return expr;
      } else {
         System.out.println("ERROR: a variável não está definida \n");
         return null;
      }
   }

   @Override public String visitLiteral(TextGrammarParser.LiteralContext ctx) {
      String literal = ctx.LITERAL().getText();
      return literal.substring(1, literal.length() - 1); // neste caso eliminamos as aspas ""
   }
}