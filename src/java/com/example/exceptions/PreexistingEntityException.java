/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.exceptions;

/**
 *
 * @author paumon64
 */
public class PreexistingEntityException extends Exception {
     public PreexistingEntityException(String message) {
        
     super(message);
    }
}
