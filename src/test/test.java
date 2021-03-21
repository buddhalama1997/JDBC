/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import lib.jdbc;
/**
 *
 * @author raaz4
 */
public class test {
    public static void main(String []args){
        jdbc obj1 = new jdbc();
        boolean res = obj1.connect();
        if(res==true){
            System.out.println("Connect with database server successfully!");
        }
        else{
            System.out.println("Error to conneect with database server");
        }
    }
}
