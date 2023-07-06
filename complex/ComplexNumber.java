public class ComplexNumber {
    private int real;
    private int img;
    private String complex;

    public ComplexNumber(int real, int img){
        this.real = real;
        this.img = img;
    }

    public ComplexNumber(int real){
        this.real = real;
    }

    public ComplexNumber(String complex){
        String[] info;
        // System.out.println("ola complexnumber por string");
        if(complex.contains("+")){
            info = complex.split("\\+");
            this.real = Integer.parseInt(info[0]);
            // System.out.println("real complexstring: " + this.real);
            this.img = Integer.parseInt(info[1].substring(0, info[1].length() -1));
            // System.out.println("img complexstring: " + this.img);
        } else if (complex.contains("-")){
            info = complex.split("\\-");
            this.real = Integer.parseInt(info[0]);
            if(info[1].length() == 1){
                this.img = -1;
            } else {
                this.img = -Integer.parseInt(info[1].substring(0, info[1].length() -1));
            }
        } else {
            if(complex.contains("i")){
                // System.out.println("ola com iii: oli -> " + complex);
                this.real = 0;
                if(complex.length() > 1){
                    this.img = Integer.parseInt(complex.substring(0, complex.length() -1));
                } else {
                    this.img = 1;
                }
            } else {
                this.real = Integer.parseInt(complex);
                this.img = 0;
            }
        }
    }

    public int getReal(){
        return this.real;
    }

    public int getImaginary(){
        return this.img;
    }
    
    // funcoes de operacoes

    public ComplexNumber simetric(){
        ComplexNumber newcomplexnumber = null;

        newcomplexnumber = new ComplexNumber(-this.real, -this.img);

        return newcomplexnumber;
    }

    public ComplexNumber add(ComplexNumber c){
        ComplexNumber newcomplexnumber = null;
        // System.out.println("estou aqui");
        newcomplexnumber = new ComplexNumber(this.real + c.real, this.img + c.img);

        return newcomplexnumber;
    }

    public ComplexNumber substraction(ComplexNumber c){
        ComplexNumber newcomplexnumber = null;

        if(this.img == 0){
            newcomplexnumber = new ComplexNumber(this.real - c.real, - c.img); // perceber esta parte
        } else {
            newcomplexnumber = new ComplexNumber(this.real - c.real, this.img - c.img);
        }

        return newcomplexnumber;
    }

    public ComplexNumber multiplication(ComplexNumber c){
        ComplexNumber newcomplexnumber = null;

        newcomplexnumber = new ComplexNumber(this.real*c.real - this.img*c.img, this.real*c.img + this.img*c.real);

        return newcomplexnumber;
    }

    public ComplexNumber divide(ComplexNumber c){
        ComplexNumber newcomplexnumber = null;
        int newreal, newimg;

        newreal = (this.real*c.real + this.img*c.img)/(c.real*c.real + c.img*c.img);
        newimg = (this.img*c.real - this.real*c.img)/(c.real*c.real + c.img*c.img);

        newcomplexnumber = new ComplexNumber(newreal, newimg);

        return newcomplexnumber;
    }

    public String toString(){
        String string = "";
        String stringimg = "";

        if(this.img == 0){
            string = "" + this.real;
        } else if (this.real == 0){
            if(this.img == 0){
                string += "0";
            } else if (this.img == 1){
                string += "i";
            } else if (this.img == -1){
                string += "-i";
            } else {
                string += this.img + "i";
            }
        } else {
            if(this.img > 0){
                stringimg += "+";
                // System.out.println("entrei aqui no tostring " + stringimg);
            } else {
                stringimg += "-";
            }

            if(Math.abs(this.img) == 1){
                stringimg += "i";
            } else {
                // System.out.println("stringimg: " + stringimg);
                stringimg += Math.abs(this.img) + "i";
            }

            string += this.real + stringimg;
        }

        return string;
    }
}
