package entidades;

public class Comum extends Categoria {
	
    private static final double TARIFA_BASE_COMUM = 5.00;
    private static final double CUSTO_POR_KM_COMUM = 1.00;
    
    public Comum() {
        super(TARIFA_BASE_COMUM, CUSTO_POR_KM_COMUM);
    }
	
}


