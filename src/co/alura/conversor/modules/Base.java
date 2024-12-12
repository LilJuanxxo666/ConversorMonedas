package co.alura.conversor.modules;

import java.util.List;

public class Base {

    private String base_code;
    private List<Divisa> conversion_rates;

    //constructor
    public Base(String base_code, List<Divisa> conversion_rates) {
        this.base_code = base_code;
        this.conversion_rates = conversion_rates;
    }

    public Base(Base base) {
        this.base_code = base.base_code;
        this.conversion_rates = base.conversion_rates;
    }

    //toString
    @Override
    public String toString() {
        return "Divisa{" +
                "base_code='" + base_code + '\'' +
                ", conversion_rates='" + conversion_rates + '\'' +
                '}';
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public List<Divisa> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(List<Divisa> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    public void calculoDivisa(double valorConvertir) {
        for (Divisa divisa : conversion_rates) {
            if (!divisa.getNombre().equals(this.base_code)) {
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("El valor de " + valorConvertir + " [" + base_code + "] corresponde al valor final de =>>> " + valorConvertir*divisa.getValor() + " [" + divisa.getNombre()+ "]" );
                System.out.println("------------------------------------------------------------------------------------");
            }
        }
    }
}
