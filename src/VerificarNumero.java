public class VerificarNumero {
    public int numeros;

    public VerificarNumero(int numeros){
        this.numeros = numeros;
    }
    public void verificar(){
        if (numeros > 0) {
            System.out.println("El numero es positivo ");
        } else if (numeros < 0) {
            System.out.println("El numero es negativo ");
        } else
            System.out.println("El numero es 0 ");
    }
}
