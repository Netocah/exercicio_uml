package com.digital.innovation.one.iphone;

import java.util.List;

public class AparelhoTelefonico {
    //atts
    private List<String> contatos;
    private List<String> sms;
    private List<String> correio;
    private List<String> foto;
    //getters/setters
    public List<String> getContatos(){
        return this.contatos;
    }
    public void setContatos(List<String> contatos){
        this.contatos = contatos;
    }
    public List<String> getSms(){
        return this.sms;
    }
    public void setSms(List<String> sms){
        this.sms = sms;
    }
    public List<String> getCorreio(){
        return this.correio;
    }
    public void setCorreio(List<String> correio){
        this.correio = correio;
    }
    public List<String> getFoto(){
        return this.foto;
    }
    public void setFoto(List<String> foto){
        this.foto = foto;
    }
    //constructor
    public AparelhoTelefonico(){}
    //custom methods
    public void ligar(String contato) {
        System.out.println("Ligando para o contato: "+contato);
    }
    public void atender() {
        System.out.println("Ligação atendida.");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz eletrônico.");
    }
    public void enviarSms(String contato){
        System.out.println("Enviando email para o contato: "+contato);
    }
    public void exibirFoto(String foto){
        System.out.println("Exibindo a foto: "+foto);
    }
}
