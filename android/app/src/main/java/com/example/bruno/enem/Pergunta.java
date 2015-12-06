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
        String[] palavrasChave = this.resposta.split(" ");
        for(int t=0;t<palavrasChave.length;t++){
            if (!resposta.toLowerCase().contains(palavrasChave[t].toLowerCase())){
                return false;
            }
        }
        return true;
    }
}
