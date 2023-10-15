/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import Account.Account;
import Card.Card;
import Person.Customer;
import Person.User;
import Transacciones.Transaction;

/**
 *
 * @author ´Felipe Chacón
 */
public class Bank {
    
    public void crearUsuario(String id, String nombre, String username, String password){
        User u1 = new User(id,nombre,username,password);
        System.out.println("Se creo un cliente");
    }
    
    public void crearCliente(/*Parametros*/){
        Customer c1 = new Customer(/*Parametros*/);
        System.out.println("Se creo un cliente");
    }
    
    public void crearCuenta(){
        FactoryAccount fc = new FactoryAccount();
        Account a1 = fc.factory(id, balance, customer, type);
        DaoAccount da = new DaoAccount;
        da.create(a1);
        System.out.println("Se creo una cuenta");
       
    }
    
    public void crearTarjeta(){
        Card cd1 = new Card(/*Parametros*/);
        System.out.println("Se creo una tarjeta");
    }
    
    public void crearTransaccion(/*Parametros*/){
        Transaction t1 = new Transaction(/*Parametros*/);
        System.out.println("Se creo una transaccion");
    }
    
    Bank bank = new Bank();
    
    bank.crearCliente();
    bank.crearCuenta();
    bank.crearTarjeta();
    bank.crearTransaccion();
}
