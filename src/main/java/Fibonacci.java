public class Fibonacci {

    public int figur;
    int result;

    public Fibonacci(){
    }

    public Fibonacci(int figur){
        this.figur = figur;
    }

    public int getFigur() {
        return figur;
    }

    public void setFigur(int figur) {
        this.figur = figur;
    }

    public int computeFibanacci(int figur){
        int n0 = 0;
        int n1 = 1;
        for (int j = 1; j <= (figur + 1); j++){
            result = n0 + n1;
            n0 = n1;
            n1 = result;
        }
        return result;
    }
}
