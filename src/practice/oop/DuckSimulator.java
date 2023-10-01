/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.oop;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class DuckSimulator {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih Duck : ");
        System.out.println("- Mallard Duck");
        System.out.println("- Rubber Duck");
        System.out.println("- Decoy Duck");
        System.out.println("- Model Duck");
        
        int choice = scanner.nextInt();
        
        Duck duck = null;
        
         switch (choice) {
            case 1:
                duck = new MallardDuck();
                break;
            case 2:
                duck = new RubberDuck();
                break;
            case 3:
                duck = new DecoyDuck();
                break;
            case 4:
                duck = new ModelDuck();
                break;
            default:
                System.out.println("Pilih duck anda : ");
        }
         duck.performQuack();
         duck.performFly();
    }
}
