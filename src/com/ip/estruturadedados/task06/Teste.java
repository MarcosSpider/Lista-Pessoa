/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ip.estruturadedados.task06;

/**
 *
 * @author Marcos21
 */
public class Teste {
    public static void main(String[] args) {
        Lista lista = new Lista(5);
        lista.inserirF(new Pessoa("Antonio",25,"M"));
        lista.inserirF(new Pessoa("Pedro",20,"M"));
        lista.inserirF(new Pessoa("Ana",18,"F"));
        lista.inserirF(new Pessoa("Paula",27,"F"));
        lista.inserirF(new Pessoa("John",16,"m"));
        lista.print();
        System.out.println("Tamanho da Lista: "+lista.tamanhoLista());
        System.out.println("Capacidade: "+lista.capacidade());
        System.out.println("Maiores de 18: "+lista.maiores18());
        System.out.println("Media das idade: "+lista.mediaidade());
        System.out.println("Maior idade: "+lista.maiorIdade());
        System.out.println("Menor idade: "+lista.menorIdade());
        System.out.println("Número de pessoas do sexo Masculino: "+lista.pessoasMas());
        System.out.println("Número de pessoas do sexo Masculino: "+lista.pessoasFem());
        lista.ordemAlfa();

    
    }
    
}
