/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.sp16.inheritance;

/**
 *
 * @author joshua.gross
 */
public class CheckingAccount extends Account {
    
    public CheckingAccount(String ssn) {
        super("654321");
    }
    
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
}