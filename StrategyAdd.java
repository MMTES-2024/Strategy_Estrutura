/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.strategyestrutura;

/**
 *
 * @author rafaelamoreira
 */
public class StrategyAdd implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
