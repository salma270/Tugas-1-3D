/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.oop;

/**
 *
 * @author USER
 */
public class DecoyDuck extends Duck{
    
    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    @Override
    public void display(){
        System.out.println("I'm a duck decoy");
    }
}