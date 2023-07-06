import java.math.BigInteger;
import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class Execute extends BigIntBaseVisitor<BigInteger> {

   HashMap<String, BigInteger> variaveis = new HashMap<>();

   @Override public BigInteger visitShow(BigIntParser.ShowContext ctx) {
      BigInteger bigint = visit(ctx.expr());

      if(bigint == null){
         System.err.println("BigInteger não é válido");
         return null;
      }

      System.out.printf("%s \n", bigint.toString());
      return bigint;
   }

   @Override public BigInteger visitAssign(BigIntParser.AssignContext ctx) {
      BigInteger bigint = visit(ctx.expr());
      String id = ctx.ID().getText();

      if(bigint == null || id == null){
         System.err.println("ERROR: Vetor ou id inválido");
         return null;
      }

      variaveis.put(id, bigint);

      return bigint;
   }

   @Override public BigInteger visitParentesis(BigIntParser.ParentesisContext ctx) {
      BigInteger bigint = visit(ctx.expr());

      return bigint;
   }

   @Override public BigInteger visitNumber(BigIntParser.NumberContext ctx) {
      BigInteger bigint = new BigInteger(ctx.NUMBER().getText());

      return bigint;
   }

   @Override public BigInteger visitUnario(BigIntParser.UnarioContext ctx) {
      BigInteger newbigint = null;
      BigInteger bigint = visit(ctx.expr());
      String op = ctx.op.getText();

      if(bigint == null){
         System.err.println("BigInteger inválido \n");
         return null;
      }

      switch(op){
         case "-":
            newbigint = bigint.negate();
            break;
         case "+":
            newbigint =  bigint;
            break;
      }

      return newbigint;
   }

   @Override public BigInteger visitMultdiv(BigIntParser.MultdivContext ctx) {
      BigInteger newbigint = null;
      BigInteger bigint1 = visit(ctx.expr(0));
      BigInteger bigint2 = visit(ctx.expr(1));
      String op = ctx.op.getText();

      if(bigint1 == null || bigint2 == null){
         System.err.println("BigInteger inválido \n");
         return null;
      }

      switch(op){
         case "*":
            newbigint = bigint1.multiply(bigint2);
            break;
         case "div":
            newbigint =  bigint1.divide(bigint2);
            break;
      }

      return newbigint;
   }

   @Override public BigInteger visitVariable(BigIntParser.VariableContext ctx) {
      String id = ctx.ID().getText();
      BigInteger bigint = null;

      if(id == null){
         System.err.println("Variável não definida \n");
         return null;
      }

      bigint = variaveis.get(id);

      return bigint;
   }

   @Override public BigInteger visitAddsub(BigIntParser.AddsubContext ctx) {
      BigInteger newbigint = null;
      BigInteger bigint1 = visit(ctx.expr(0));
      BigInteger bigint2 = visit(ctx.expr(1));
      String op = ctx.op.getText();

      if(bigint1 == null || bigint2 == null){
         System.err.println("BigInteger inválido \n");
         return null;
      }

      switch(op){
         case "+":
            newbigint = bigint1.add(bigint2);
            break;
         case "-":
            newbigint =  bigint1.subtract(bigint2);
            break;
      }

      return newbigint;
   }

   @Override public BigInteger visitModulo(BigIntParser.ModuloContext ctx) {
      BigInteger newbigint = null;
      BigInteger bigint1 = visit(ctx.expr(0));
      BigInteger bigint2 = visit(ctx.expr(1));

      if(bigint1 == null || bigint2 == null){
         System.err.println("BigInteger inválido \n");
         return null;
      }

      newbigint = bigint1.mod(bigint2);

      return newbigint;
   }
}
