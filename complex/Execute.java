import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class Execute extends ComplexNumberBaseVisitor<ComplexNumber> {

   HashMap<String, ComplexNumber> variaveis = new HashMap<>();

   @Override public ComplexNumber visitShow(ComplexNumberParser.ShowContext ctx) {
      ComplexNumber cnum = visit(ctx.expr());

      if(cnum == null){
         System.err.println("ERROR: Número complexo inválido \n");
         return null;
      }

      // System.out.println("show: " + cnum.toString());
      System.out.printf("%s \n", cnum.toString());
      return cnum;
   }

   @Override public ComplexNumber visitAssign(ComplexNumberParser.AssignContext ctx) {
      ComplexNumber cnum = visit(ctx.expr());
      String id = ctx.ID().getText();

      if(cnum == null || id == null){
         System.err.println("ERROR: Número complexo ou id inválido \n");
         return null;
      }

      variaveis.put(id, cnum);

      return cnum;
   }

   @Override public ComplexNumber visitParentesis(ComplexNumberParser.ParentesisContext ctx) {
      ComplexNumber cnum = visit(ctx.expr());

      return cnum;
   }

   @Override public ComplexNumber visitInput(ComplexNumberParser.InputContext ctx) {
      ComplexNumber cnum = null;
      String num = "";
      Scanner sc = new Scanner(System.in);
      String output = ctx.STRING().getText();

      System.out.printf("%s(re): ", output);
      num += sc.nextLine();
      System.out.printf("%s(im): ", output);

      String input = sc.nextLine();
      if (input.length() == 1) {
         num += "+" + input + "i";
      } else {
         num += input + "i";
      }

      cnum = new ComplexNumber(num);

      return cnum;
   }

   @Override public ComplexNumber visitNumber(ComplexNumberParser.NumberContext ctx) {
      String num = ctx.NUMBER().getText();
      ComplexNumber cnum = new ComplexNumber(num);

      return cnum;
   }

   @Override public ComplexNumber visitUnario(ComplexNumberParser.UnarioContext ctx) {
      ComplexNumber newcnum = null;
      ComplexNumber cnum = visit(ctx.expr());
      String op = ctx.op.getText();

      if(cnum == null){
         System.err.println("ERROR: Número complexo inválido \n");
         return null;
      }

      switch(op){
         case "+":
            newcnum = cnum;
            break;
         case "-":
            newcnum = cnum.simetric();
            break; 
      }

      return newcnum;
   }

   @Override public ComplexNumber visitComplex(ComplexNumberParser.ComplexContext ctx) {
      String num = ctx.COMPLEX().getText();
      // System.out.println("complex: " + num);
      ComplexNumber cnum = new ComplexNumber(num);

      return cnum;
   }

   @Override public ComplexNumber visitMultdiv(ComplexNumberParser.MultdivContext ctx) {
      ComplexNumber newcnum = null;
      ComplexNumber cnum1 = visit(ctx.expr(0));
      ComplexNumber cnum2 = visit(ctx.expr(1));
      String op = ctx.op.getText();

      if(cnum1 == null || cnum2 == null){
         System.err.println("ERROR: Número complexo inválido \n");
         return null;
      }

      switch(op){
         case "*":
            newcnum = cnum1.multiplication(cnum2);
            break;
         case ":":
            newcnum = cnum1.divide(cnum2);
            break; 
      }

      return newcnum;
   }

   @Override public ComplexNumber visitVariable(ComplexNumberParser.VariableContext ctx) {
      String id = ctx.ID().getText();
      // System.out.println("oleee: "+ id);
      ComplexNumber cnum = variaveis.get(id);

      if(id == null || !variaveis.containsKey(id)){
         System.err.println("ERROR: Variável não definida \n");
         return null;
      }

      return cnum;
   }

   @Override public ComplexNumber visitAddsub(ComplexNumberParser.AddsubContext ctx) {
      ComplexNumber newcnum = null;
      ComplexNumber cnum1 = visit(ctx.expr(0));
      ComplexNumber cnum2 = visit(ctx.expr(1));
      String op = ctx.op.getText();

      if(cnum1 == null || cnum2 == null){
         System.err.println("ERROR: Número complexo inválido \n");
         return null;
      }

      switch(op){
         case "+":
            newcnum = cnum1.add(cnum2);
            break;
         case "-":
            newcnum = cnum1.substraction(cnum2);
            break; 
      }

      return newcnum;
   }
}
