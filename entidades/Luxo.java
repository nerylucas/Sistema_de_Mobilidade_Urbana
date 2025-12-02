package entidades;

public class Luxo extends Categoria {
   
    private static final double TARIFA_BASE_LUXO = 9.00;
    private static final double CUSTO_POR_KM_LUXO = 2.20;
    
    public Luxo() {
        super(TARIFA_BASE_LUXO, CUSTO_POR_KM_LUXO);
    }

}

