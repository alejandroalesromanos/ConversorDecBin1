package modelo;

public class Numero {
    private int numDecimal;
    private int numBinario;
    
    public Numero() {
    }

    public String convertirBinario(int decimal) {
        String binario = "";
        
        while (decimal > 0) {
            int resto = decimal % 2;
            binario = resto + binario;
            decimal = decimal / 2;
        }
        
        return binario;
    }
   

}
