package entidades;

public class Categoria {

    protected double tarifaBase;
    protected double custoPorKm;

    public Categoria(double tarifaBase, double custoPorKm) {
        this.tarifaBase = tarifaBase;
        this.custoPorKm = custoPorKm;
    }

    public double calcularPreco(double km) {
    	return tarifaBase + (custoPorKm * km);
    }
}