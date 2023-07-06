import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class Execute extends FracLangBaseVisitor<Fraction> {

   HashMap<String, Fraction> variaveis = new HashMap<>(); // hasmap dos simbolos da arvore

   @Override
   public Fraction visitDisplay(FracLangParser.DisplayContext ctx) {
      Fraction frac = visit(ctx.expr());

      if (frac == null) {
         System.out.println("não existe frac\n");
         return null;
      } else {
         System.out.printf("%s\n", frac.toString());
         return frac;
      }
   }

   @Override
   public Fraction visitAssign(FracLangParser.AssignContext ctx) {
      String id = ctx.ID().getText();
      Fraction frac = visit(ctx.expr());

      if (frac != null) {
         variaveis.put(id, frac);
         return frac;
      }

      return null;
   }

   @Override
   public Fraction visitParentesis(FracLangParser.ParentesisContext ctx) {
      Fraction frac = visit(ctx.expr());

      return frac;
   }

   @Override
   public Fraction visitReduce(FracLangParser.ReduceContext ctx) {
      Fraction frac = visit(ctx.expr());

      if(frac == null) return null;
      
      frac = frac.reduce();
      return frac;
   }

   @Override
   public Fraction visitRead(FracLangParser.ReadContext ctx) {
      Scanner sc = new Scanner(System.in);
      String msg, input;
      msg = ctx.STRING().getText();
      msg = msg.substring(1, msg.length() - 1);

      System.out.println(msg + ": ");

      if(msg == null) return null;

      input = sc.nextLine();

      return new Fraction(input);

   }

   @Override
   public Fraction visitNum(FracLangParser.NumContext ctx) {
      String numero = ctx.NUM().getText();
      // System.out.println("numero: " + numero);
      Fraction num = new Fraction(numero); // é importante criar novos tipos
      // System.out.println("fraction new num: " + num);

      return num;
   }

   // @Override
   // public Fraction visitString(FracLangParser.StringContext ctx) {
   //    String string = ctx.STRING().getText();
   //    // System.out.println("numero: " + numero);
   //    Fraction frac = null; // é importante criar novos tipos
   //    // System.out.println("fraction new num: " + num);

   //    return frac;
   // }

   @Override
   public Fraction visitMultdiv(FracLangParser.MultdivContext ctx) {
      Fraction fraction, frac1, frac2;
      String op;

      fraction = null;
      frac1 = visit(ctx.expr(0));
      frac2 = visit(ctx.expr(1));
      op = ctx.op.getText();

      if (frac1 == null | frac2 == null)
         return null;

      switch (op) {
         case "*":
            fraction = new Fraction(frac1.getNum()*frac2.getNum(), frac1.getDen()*frac2.getDen());
            break;
         case ":":
            fraction = new Fraction(frac1.getNum()*frac2.getDen(), frac1.getDen()*frac2.getNum());
            break;
         default:
            break;
      }

      return fraction;
   }

   @Override
   public Fraction visitAddsub(FracLangParser.AddsubContext ctx) {
      Fraction fraction, frac1, frac2;
      String op;

      fraction = null;
      frac1 = visit(ctx.expr(0));
      frac2 = visit(ctx.expr(1));
      op = ctx.op.getText();

      if (frac1 == null | frac2 == null)
         return null;

      switch (op) {
          case "+":
            fraction = new Fraction(frac1.getNum()*frac2.getDen() + frac2.getNum()*frac1.getDen(), frac1.getDen() * frac2.getDen());
            break;
         case "-":
            fraction = new Fraction(frac1.getNum()*frac2.getDen() - frac2.getNum()*frac1.getDen(), frac1.getDen() * frac2.getDen());
            break;
         default:
            break;
      }

      return fraction;
   }

   @Override
   public Fraction visitUnary(FracLangParser.UnaryContext ctx) {
      Fraction frac = visit(ctx.expr());
      String op = ctx.op.getText();

      if (frac == null)
         return null;

      if (op.equals("-")) {
         return new Fraction(-frac.getNum(), frac.getDen());
      }

      return frac;
   }

   @Override
   public Fraction visitId(FracLangParser.IdContext ctx) {
      String id = ctx.ID().getText();
      Fraction frac = variaveis.get(id);

      if (id == null) {
         System.out.println("ERROR: a variável não está definida\n");
         return null;
      } else {
         return frac;
      }
   }

   @Override
   public Fraction visitFraction(FracLangParser.FractionContext ctx) {
      String fraction = ctx.FRACTION().getText();
      Fraction frac = new Fraction(fraction); // é importante criar novos tipos

      return frac;
   }
}