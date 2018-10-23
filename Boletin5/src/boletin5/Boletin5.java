package boletin5;

import java.util.Scanner;

public class Boletin5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta contaOrigen = new Conta("Pedro Picapiedra", "1", 1000);
        Conta contaDestino = new Conta();
        contaDestino.setNome("Mario Moreno 'Cantinflas'");
        contaDestino.setNumConta("2");
        contaDestino.setSaldo(2000);
        contaOrigen.visualizar();
        contaDestino.visualizar();
        contaOrigen.ingreso(3000);
        contaDestino.reintegro(500);
        contaOrigen.visualizar();
        contaDestino.visualizar();
        
        System.out.println("\nIndique la cantidad a transferir: ");
        double cant=ler.nextDouble();
        
        if (contaDestino.transferencia(contaOrigen, cant)==true){
            System.out.println("\nTransferencia realizada");
        } else {
            System.out.println("ERROR DE TRANSFERENCIA");
        }
        contaOrigen.visualizar();
        contaDestino.visualizar();
          
        
    
    
    }

}
