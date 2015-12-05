package com.example.bruno.enem;

/**
 * Created by bruno on 05/12/15.
 */
public class Pergunta {
    private String texto;
    private String resposta;
    Pergunta(String texto,String resposta){
        this.texto = texto;
        this.resposta = resposta;
    }
    public String getTexto(){
        return texto;
    }
    public String getResposta(){
        return resposta;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }
    public void  setResposta(String resposta){
        this.resposta = resposta;
    }
    public boolean checkResposta(String resposta){
        return this.resposta.toLowerCase().equals(resposta.toLowerCase());
    }
}
