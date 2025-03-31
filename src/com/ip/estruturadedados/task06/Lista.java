/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ip.estruturadedados.task06;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Marcos21
 */
public class Lista {
    private int tamanho, capacidade;
    Pessoa[] pessoa;
    
    
    public Lista(int capacidade){
        this.tamanho = 0;
        this.capacidade = capacidade;
        pessoa = new Pessoa[capacidade];
    }
    public boolean listaCheia(){
        return this.capacidade == this.tamanho;
    }
    public boolean listaVazia(){
        return this.tamanho ==0;
    }
    public int tamanhoLista(){
        return this.tamanho;
    }
    public int capacidade(){
        return this.capacidade;
    }
    public int inserirF(Pessoa pessoa){
        if(listaCheia()){
            return -1;
        }
        this.pessoa[this.tamanho++]=pessoa;
        return 1;
    }
    public int inserirIni(Pessoa pessoa){
        if(listaCheia()){
            return -1;
        }else if(listaVazia()){
            this.pessoa[tamanho] = pessoa;
            this.tamanho++;
            return 1;
        }
        Pessoa temp[]=this.pessoa;
        int t=0;
        this.pessoa = new Pessoa[this.capacidade];
        for(int i = 1; i < this.tamanho;i++){
            this.pessoa[i]=temp[t];
            t++;
        }
        this.pessoa[0]=pessoa;
        this.tamanho++;
        return 1;
    }
    public int removerF(){
        if(listaVazia()){
            return 0;
        }
        Pessoa temp[]=this.pessoa;
        this.pessoa = new Pessoa[this.capacidade];
        for(int i=0; i < this.tamanho - 1; i++){
            this.pessoa[i]=temp[i];
        }
        this.tamanho--;
        return 1;
    }
    public int removerIni(){
        if(listaVazia()){
            return 0;
        }
        Pessoa temp[]=this.pessoa;
        this.pessoa = new Pessoa[this.capacidade];
        for(int i=0;i<this.tamanho-1;i++){
            this.pessoa[i]=temp[i+1];
        }
        this.tamanho--;
        return 1;
        
    }
    
    public int maiores18(){
       
        if(listaVazia()){
            return -1;
        }
        int maioresDeIdade=0;
        for(int i=0; i < this.tamanho; i++){
            if(pessoa[i].getIdade()> 18){
                maioresDeIdade++;
                }
        }
          return maioresDeIdade;
            }
    public int mediaidade(){
        if(listaVazia()){
            return 0;
        }

        int soma =0;
        for(int i=0; i < this.tamanho;i++){
           soma+=pessoa[i].getIdade();
            
        }
        return soma/this.tamanho;
    }
    public int maiorIdade(){
        if(listaVazia()){
            return 0;
        }
        int maiorIdade=0;
        for(int i=0; i < this.tamanho;i++){
            if(pessoa[i].getIdade() > maiorIdade){
                maiorIdade = pessoa[i].getIdade();
            }
            
        }
        return maiorIdade;
    }
    public int menorIdade(){
        if(listaVazia()){
            return 0;
        }
        int menorIdade = pessoa[0].getIdade();
        for(int i=0; i < this.tamanho;i++){
            if(pessoa[i].getIdade() < menorIdade){
                menorIdade = pessoa[i].getIdade();
            }
        }
        return menorIdade;
    }
    public int pessoasMas(){
        if(listaVazia()){
            return 0;
        }
        int cont=0;
        for(int i=0; i<this.tamanho; i++){
            if(pessoa[i].getSexo().equalsIgnoreCase("M")){
                cont++;
            }
        }
        return cont;
    }
    public int pessoasFem(){
        if(listaVazia()){
            return 0;
        }
        int cont=0;
        for(int i=0; i<this.tamanho; i++){
            if(pessoa[i].getSexo().equalsIgnoreCase("F")){
                cont++;
            }
        }
        return cont;
    }
    public void ordemAlfa(){
        if(listaVazia()){
            System.out.println("Lista vazia!");
        }
        //String nomes[]= new String[this.capacidade];
        SortedSet<String> nomes = new TreeSet<>();
        for(int i=0; i < this.tamanho;i++){
            nomes.add(pessoa[i].getNome());
        }
        System.out.println(nomes);
        
    }

    @Override
    public String toString() {
        return "Lista{" + "tamanho=" + tamanho + ", capacidade=" + capacidade + ", pessoa=" + pessoa + '}';
    }
    
    public void print(){
        if(listaVazia()){
            System.out.println("A lista está vazia!");
        }
        for(int i=0; i < this.tamanho;i++){
            System.out.println(this.pessoa[i]);
        }
    }
    
    
    
    
    
}
