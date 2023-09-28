package com.digital.innovation.one.iphone;

import java.util.List;

public class ReprodutorMusical {
    //atts
    private List<String> musica;
    private List<String> video;
    private int volume;
    //getters/setters
    public List<String> getMusica(){
        return this.musica;
    }
    public void setMusica(List<String> musica){
        this.musica = musica;
    }
    public List<String> getVideo(){
        return this.video;
    }
    public void setVideo(List<String> video){
        this.video = video;
    }
    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    //const
    public ReprodutorMusical(){}
    //custom methods
    public void tocar(){
        System.out.println("Tocando.");
    }
    public void pausar(){
        System.out.println("Pausado.");
    }
    public String selecionarMusica(String musica){
        return "Musica "+musica+" selecionada.";
    }
    public String selecionarVideo(String video){
        return "Video "+video+" selecionado.";
    }
    public int selecionarVolume(int volume){
        System.out.println("Volume "+volume+" selecionado.");
        return volume;
    }

}