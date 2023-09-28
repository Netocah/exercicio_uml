package com.digital.innovation.one.iphone;

import java.util.List;

public class NavegadorInternet {
    //atts
    private List<String> paginas;
    private List<String> email;
    //getters/setters
    public List<String> getPaginas(){
        return this.paginas;
    }
    public void setPaginas(List<String> paginas){
        this.paginas = paginas;
    }
    public List<String> getEmail(){
        return this.email;
    }
    public void setEmail(List<String> email){
        this.email = email;
    }
    //const
    public NavegadorInternet(){}
    //custom methods
    public void exibirPagina(){
        System.out.println("Exibindo página inicial");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova Pagina adicionada.");
    }
    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }
    public void exibirEmail(){
        System.out.println("Exibindo caixa de entrada do email.");
    }
    public void enviarEmail(String contato){
        System.out.println("Enviando email para o contato: "+contato);
    }
}
