import java.util.*;

public class Vector{
    protected ArrayList<Double> vector = new ArrayList<>();
    // private Double escalar;
    private boolean isescalar = false;
    private boolean error = false;

    public Vector(ArrayList<Double> escalar, boolean isescalar){
        // System.out.println("ola classe vector");
        this.vector = escalar;
        // System.out.println("sou escalar " + vector);
        this.isescalar = isescalar;
    }

    public Vector(ArrayList<Double> vector){
        this.vector = vector;
    }

    public Vector(String vec){
        String subvec = vec.substring(1, vec.length() - 1);
        String[] info = subvec.split(",");

        try{
            for( int i = 0; i < info.length; i++){
                vector.add(Double.parseDouble(info[i]));
            }
        } catch (NumberFormatException e){
            error = true;
            System.err.println("Vetor inválido >> ERROR: " + e);
        }
    }

    public ArrayList<Double> getVector(){
        return vector;
    }

    public boolean isescalar(){
        return isescalar;
    }

    public boolean error(){
        return error;
    }

    // funcoes de operacoes
    public Vector simetricVector(){
        ArrayList<Double> simetricvalues = new ArrayList<>();

        for (int i = 0; i < this.vector.size(); i ++){
            simetricvalues.add(-this.vector.get(i));
        }

        Vector newvector = null;
        if( this.isescalar == true ){
            newvector = new Vector(simetricvalues, true);
        } else {
            newvector = new Vector(simetricvalues);
        }

        return newvector;
    }

    public Vector addVector(Vector v){
        ArrayList<Double> addvalues = new ArrayList<>();

        for (int i = 0; i < this.vector.size(); i++){
            addvalues.add(this.vector.get(i) + v.vector.get(i));
        }

        Vector newvector = null;
        if ( this.isescalar == true ){
            newvector = new Vector(addvalues, true);
        } else {
            newvector = new Vector(addvalues);
        }

        return newvector;
    }

    public Vector subVector(Vector v){
        ArrayList<Double> subvalues = new ArrayList<>();

        for (int i = 0; i < this.vector.size(); i++){
            subvalues.add(this.vector.get(i) - v.vector.get(i));
        }

        Vector newvector = null;
        if ( this.isescalar == true ){
            newvector = new Vector(subvalues, true);
        } else {
            newvector = new Vector(subvalues);
        }

        return newvector;
    }

    public Vector multVector (Vector v){
        ArrayList<Double> multvalues = new ArrayList<>();
        Vector newvector = null;

        if( this.isescalar && !v.isescalar ){
            for (int i = 0; i < v.vector.size(); i++){
                multvalues.add(this.vector.get(0) * v.vector.get(i));
            }

            newvector = new Vector(multvalues);
        } else if( !this.isescalar && v.isescalar ){
            for (int i = 0; i < this.vector.size(); i++){
                multvalues.add(v.vector.get(0) * this.vector.get(i));
            }

            newvector = new Vector(multvalues);
        } else if ( this.isescalar && v.isescalar){
            multvalues.add(this.vector.get(0) * v.vector.get(0));
            newvector = new Vector(multvalues, true);
        } else {
            Double prodint = 0.0;

            for (int i = 0; i < v.vector.size(); i++){
                prodint += this.vector.get(i) * v.vector.get(i);
            }

            multvalues.add(prodint);
            newvector = new Vector(multvalues, true);
        }

        return newvector;
    }

    @Override
    public String toString(){
        String string = "";

        // strings
        // System.out.println("ola tostring");
        if(this.isescalar == true){
            // System.out.println("ola tostring escalar");
            string += vector.get(0);
        } else {
            if(vector.size() == 0){
                string += "[]";
            } else if(vector.size() == 1){
                string += "[" + vector.get(0) + "]"; // elemento inicial e unico
            } else {
                string += "[" + vector.get(0);

                for(int i = 1; i < vector.size(); i++){
                    string += "," + vector.get(i);
                }

                string += "]";
            }
        }

        return string;
    }
}