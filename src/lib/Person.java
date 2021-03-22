/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author raaz4
 */

public class Person {
    private int pid;
    private String full_name;
    private String contact_address;
    
    //contructors
    //setters and getters
    //toString

    public Person() {
        this.pid = 0;
        this.full_name = "";
        this.contact_address = "";
    }
    public Person(int pid, String full_name, String contact_address) {
        this.pid = pid;
        this.full_name = full_name;
        this.contact_address = contact_address;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getContact_address() {
        return contact_address;
    }

    public void setContact_address(String contact_address) {
        this.contact_address = contact_address;
    }

    @Override
    public String toString() {
        return "Person{" + "pid=" + pid + ", full_name=" + full_name + ", contact_address=" + contact_address + '}';
    }
    
}