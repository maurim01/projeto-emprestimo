package modelo;

public class MultaFixa implements RegraMulta {

    @Override
    public double calcularMulta(int diasAtraso) {

        if (diasAtraso == 0) {
            return 0;
        }
        if (diasAtraso < 0) {
            throw new IllegalArgumentException("O valor dos dias de atraso não podem ser negativos. ");
        } else {
            return 5 * diasAtraso;
        }
    }
}

