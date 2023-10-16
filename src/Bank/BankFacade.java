/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import Account.Account;
import Card.Card;
import Person.Customer;
import Transaction.Transaction;
import Transaction.Transfer;
import Transaction.Withdrawal;
import Transaction.Deposit;
import java.util.Date;

    public class BankFacade {
        private FactoryCard cardFactory;
        private FactoryAccount accountFactory;
        private FactoryCustomer customerFactory;
        private FactoryTransaction transactionFactory;
        private FactoryUser userFactory

        public BankFacade() {
            this.cardFactory = new FactoryCard();
            this.accountFactory = new FactoryAccount();
            this.customerFactory = new FactoryCustomer();
            this.transactionFactory = new FactoryTransaction();
        }

        public Card createCard(int type, String number, double balance, double creditLimit, double interestRate, Account account) {
            return cardFactory.factory(type, number, balance, creditLimit, interestRate, account);
        }

        public Account createAccount(String id, double balance, Customer customer, int type) {
            return accountFactory.factory(id, balance, customer, type);
        }

        public Customer createCustomer(String id, String name, Date dateOfBirth, String phone, String email, String address) {
            return customerFactory.factory(id, name, (java.sql.Date) dateOfBirth, phone, email, address);
        }

        public Transaction createTransaction(double amount, Account source, Account destination, int type) {
            return transactionFactory.factory(amount, source, destination, type);
        }

        // Puedes agregar más métodos de fachada aquí para otras operaciones relacionadas con el banco.
    }

    
    /*Bank bank = new Bank();
    
    bank.crearCliente();
    bank.crearCuenta();
    bank.crearTarjeta();
    bank.crearTransaccion();*/

