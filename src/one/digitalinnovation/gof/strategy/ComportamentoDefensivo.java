/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.digitalinnovation.gof.strategy;

/**
 *
 * @author stefa
 */
public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}
