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
public class RedHeadDuck extends Duck {
    public RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display(){
        System.out.println("I'm a real Red Head Duck");
    }
    
}
