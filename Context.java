/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.strategyestrutura;

/**
 *
 * @author rafaelamoreira
 */
public class Context {

    private Strategy strategy;

    // Define a estratégia desejada
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Executa a operação delegando para a estratégia
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
