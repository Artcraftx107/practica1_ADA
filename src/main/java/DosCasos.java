public class DosCasos extends Metodo {
    public DosCasos(){
        super(Orden.CTE, Orden.N);
    }

    @Override
    public int codigo(int n){
        //Iniciamos code en 1, ya que si n==0 se devuelve 1 como codigo
        int code = 1;
        //Peor caso, en el mejor caso se salta el if
        if(n!=0){
            code=0;
            for(int i = 0; i<n; i++){
                code+=i;
            }
        }

        return code;
    }
}
