/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01.strategyestrutura;

/**
 *
 * @author rafaelamoreira
 */
public class StrategyEstrutura {

    public static void main(String[] args) {

        Context context = new Context();

        // Definindo a estratégia de Adição
        context.setStrategy(new StrategyAdd());
        System.out.println("Adição: " + context.executeStrategy(5, 3));

        // Definindo a estratégia de Subtração
        context.setStrategy(new StrategySub());
        System.out.println("Subtração: " + context.executeStrategy(5, 3));

        // Definindo a estratégia de Multiplicação
        context.setStrategy(new StrategyMul());
        System.out.println("Multiplicação: " + context.executeStrategy(5, 3));
    }
}
