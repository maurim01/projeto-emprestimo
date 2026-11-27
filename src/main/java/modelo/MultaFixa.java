package modelo;

public class MultaFixa implements RegraMulta {

    @Override
    public double calcularMulta(int diasAtraso) {
        if(diasAtraso <= 0){
            return 0;
        }
        return 5 * diasAtraso;
    }
}
