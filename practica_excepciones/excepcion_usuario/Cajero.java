/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion_usuario;

/**
 *
 * @author eperez50
 */
public class Cajero {
    
    public void operaciones() { 
        Cuenta cuenta = new Cuenta();
        try { 
            cuenta.depositar(2000);
            System.out.println("                        Saldo:" + cuenta.getSaldo());
            
            cuenta.retirar(1000); 
            System.out.println("                        Saldo:" + cuenta.getSaldo());

            cuenta.retirar(1000); 
            System.out.println("                        Saldo:" + cuenta.getSaldo());

            cuenta.retirar(1000); 
            System.out.println("                        Saldo:" + cuenta.getSaldo());

            cuenta.depositar(200); 
            System.out.println("                        Saldo:" + cuenta.getSaldo());
            
            cuenta.retirar(100); 
            System.out.println("                        Saldo:" + cuenta.getSaldo());
        } 
        catch (SaldoinsuficienteException e) { 
            e.printStackTrace();
        }
    } 
} 
