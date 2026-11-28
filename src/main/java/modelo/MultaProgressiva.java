package modelo;

public class MultaProgressiva implements RegraMulta{
    @Override
    public double calcularMulta(int diasAtraso) {
        if(diasAtraso == 0){
            return 0;
        }
        else if (diasAtraso < 0){
            throw new IllegalArgumentException("O valor dos dias de atraso não podem ser negativos. ");
        }
        else if(diasAtraso == 1){
            return 10;
        }
        else{
            return 10 + ((diasAtraso-1) * 5);
        }
    }
}
