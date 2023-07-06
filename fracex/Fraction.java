import java.text.NumberFormat;

public class Fraction{
    private int num;
    private int den;
    private boolean error = false;

    public Fraction(int num, int den){
        this.num = num;
        this.den = den;

        if(den < 0){
            this.num = -num;
            this.den = -den;
        }
    }

    public Fraction(int num){
        this.num = num;
        this.den = 1;
    }

    public Fraction(String fraction){
        String[] info = fraction.split("/");

        try{
            // System.out.println(info.length);
            switch(info.length){
                case 1:
                    // System.out.println(info.length);
                    this.num = Integer.parseInt(info[0]);
                    this.den = 1;
                    break;
                case 2:
                    // System.out.println("cucu");
                    this.num = Integer.parseInt(info[0]);
                    this.den = Integer.parseInt(info[1]);
                    break;
                default:
                    error = true;
            }
        }
        catch(NumberFormatException e){
            error = true;
            System.err.println("Invalid Fraction >> ERROR: " + e);
        }
    }

    public int getNum(){
        return num;
    }

    public int getDen(){
        return den;
    }

    @Override
    public String toString(){
        if(den == 1){
            return "" + num;
        } else {
            return num + "/" + den;
        }
    }

    // reduce function
    public Fraction reduce(){
        Fraction frac;
        int mdc = mdc(num, den);

        frac = new Fraction(num/mdc, den/mdc);

        return frac;
    }

    private int mdc(int a, int b){

        if(a == 0){
            return 1;
        } else if (b == 0){
            return a;
        } else {
            return mdc(b, a%b);
        }
    }
}