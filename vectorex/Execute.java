import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class Execute extends VectorBaseVisitor<Vector> {
   
   HashMap<String, Vector> variaveis = new HashMap<>();

   @Override public Vector visitShow(VectorParser.ShowContext ctx) {
      Vector vector = visit(ctx.expr());

      if ( vector == null ){
         System.err.println("ERROR: Vetor inválido");
         return null;
      }

      System.out.printf("%s \n", vector.toString());
      return vector;
   }

   @Override public Vector visitAssign(VectorParser.AssignContext ctx) {
      Vector vector = visit(ctx.expr());
      String id = ctx.ID().getText();

      if ( vector == null || id == null) {
         System.err.println("ERROR: Vetor ou id inválido");
         return null;
      }

      variaveis.put(id, vector);

      return vector;
   }

   @Override public Vector visitParentesis(VectorParser.ParentesisContext ctx) {
      Vector vector = visit(ctx.expr());

      return vector;
   }

   @Override public Vector visitUnario(VectorParser.UnarioContext ctx) {
      Vector newvector = null;
      Vector vector = visit(ctx.expr());
      String op = ctx.op.getText();

      if ( vector == null || op == null ) return null;

      if( op.equals("-") ){
         newvector = vector.simetricVector();
      } else {
         newvector = vector;
      }

      return newvector;
   }

   @Override public Vector visitEscalar(VectorParser.EscalarContext ctx) {
      ArrayList<Double> escalarvalue = new ArrayList<>();
      Double escalar = Double.parseDouble(ctx.ESCALAR().getText());

      escalarvalue.add(escalar);
      Vector vector = new Vector(escalarvalue, true);

      if ( vector.error() ){
         System.err.println("ERROR: Vetor inválido");
         return null;
      }

      return vector;
   }

   @Override public Vector visitMultiplic(VectorParser.MultiplicContext ctx) {
      Vector newvector = null;
      Vector vector1 = visit(ctx.expr(0));
      Vector vector2 = visit(ctx.expr(1));

      if ( vector1 == null || vector2 == null ) return null;

      if( !vector1.isescalar() && !vector2.isescalar() ){
         System.err.println("ERROR: Não é possível multiplicar dois vetores \n");
         return null;
      }

      newvector = vector1.multVector(vector2);

      return newvector;
   }

   @Override public Vector visitVariable(VectorParser.VariableContext ctx) {
      String id = ctx.ID().getText();
      Vector vector = variaveis.get(id);

      if ( id == null ){
         System.out.println("ERROR: A variável não está definida \n");
         return null;
      }
      
      return vector;
   }

   @Override public Vector visitAddsub(VectorParser.AddsubContext ctx) {
      Vector newvector = null;
      Vector vector1 = visit(ctx.expr(0));
      Vector vector2 = visit(ctx.expr(1));
      String op = ctx.op.getText();

      if ( vector1 == null || vector2 == null ) return null;

      if( vector1.isescalar() != vector2.isescalar() ){
         System.err.println("ERROR: Não é possível somar/subtrair escalares com vetores \n");
         return null;
      }

      if ( vector1.vector.size() != vector2.vector.size() ){
         System.err.println("ERROR: Não é possível somar/subtrair vetores de diferentes dimensões \n");
         return null;
      }

      switch(op){
         case "+":
            // System.out.println("opcao +");
            newvector = vector1.addVector(vector2);
            break;
         case "-":
            newvector = vector1.subVector(vector2);
            break;
      }

      return newvector;
   }

   @Override public Vector visitVector(VectorParser.VectorContext ctx) {
      Vector vector = new Vector(ctx.VECTOR().getText());

      if ( vector.error() ){
         System.err.println("ERROR: Vetor inválido");
         return null;
      }

      return vector;
   }

   @Override public Vector visitProdinterno(VectorParser.ProdinternoContext ctx) {
      Vector newvector = null;
      Vector vector1 = visit(ctx.expr(0));
      Vector vector2 = visit(ctx.expr(1));

      if ( vector1 == null || vector2 == null ) return null;

      if( vector1.isescalar() || vector2.isescalar() ){
         System.err.println("ERROR: Só existe produto interno entre dois vetores \n");
         return null;
      }

      if ( vector1.vector.size() != vector2.vector.size() ){
         System.err.println("ERROR: Não é possível fazer o produto interno de vetores de diferentes dimensões \n");
         return null;
      }

      newvector = vector1.multVector(vector2);

      return newvector;
   }
}
