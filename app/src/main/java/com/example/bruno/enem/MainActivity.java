package com.example.bruno.enem;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Pergunta> perguntas;
    int idPerguntaAtual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        perguntas = new ArrayList<Pergunta>();

        perguntas.add(new Pergunta("Qual é a comida que liga e desliga?", "Strog ON OFF"));
        perguntas.add(new Pergunta("Qual é o fim da picada?", "mosquito vai embora"));
        perguntas.add(new Pergunta("O que são dois pontos pretos no microscópio?", "blacktéria pretozoário"));
        perguntas.add(new Pergunta("O que é um cigarro de maconha feito com papel de jornal?", "baseado em fatos reais"));
        perguntas.add(new Pergunta("Como se faz para ganhar um Chokito?", "dedito tomadita"));
        perguntas.add(new Pergunta("Qual o vinho que não tem álcool?", "Ovinho de Codorna"));
        perguntas.add(new Pergunta("O que é um pontinho vermelho no meio da porta?", "olho mágico conjuntivite"));
        perguntas.add(new Pergunta("O que o canibal vegetariano come?", "planta do pé batata da perna"));
        perguntas.add(new Pergunta("Por que as estrelas não fazem miau?", "Astro no mia"));
        perguntas.add(new Pergunta("O que é que a banana suicida falou?", "Macacos me mordam"));
        perguntas.add(new Pergunta("Qual é o doce preferido do átomo?", "Pé de moléculas"));
        perguntas.add(new Pergunta("O que é uma molécula?", "meninola sapécula"));
        perguntas.add(new Pergunta("Como o elétron atende ao telefone?", "Próton"));
        perguntas.add(new Pergunta("O que um cromossomo disse para o outro?", "Cromossomos felizes"));
        perguntas.add(new Pergunta("Como as enzimas se reproduzem?", "uma enzima da outra"));
        perguntas.add(new Pergunta("Qual é a parte do corpo que cheira bacalhau?", "nariz"));
        perguntas.add(new Pergunta("O que é um ponto marrom no pulmão?", "brownquite"));
        perguntas.add(new Pergunta("Por que a vaca foi para o espaço?", "encontrar vácuo"));
        perguntas.add(new Pergunta("O que o polvo disse para a lula?", "eu tô molusco"));
        perguntas.add(new Pergunta("O que o espermatozóide falou para o óvulo?", "morar  você  minha casa é um saco"));
        idPerguntaAtual=-1;
        updatePergunta();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    void trocarTexto(String texto){
       TextView resultado = (TextView)findViewById(R.id.resultado);
        resultado.setText(texto);
    }
    void updatePergunta(){
        idPerguntaAtual= (idPerguntaAtual+1)%perguntas.size();
        TextView pergunta = (TextView)findViewById(R.id.pergunta);
        pergunta.setText(perguntas.get(idPerguntaAtual).getTexto());

    }
    public void verificarResposta(View view){
        EditText resposta = (EditText)findViewById(R.id.resposta);
        String textoResposta = resposta.getText().toString();

        if(perguntas.get(idPerguntaAtual).checkResposta(textoResposta)){
            updatePergunta();
            trocarTexto("Acertou!");

        }else{
           trocarTexto("Errou! Tente novamente!");
        }
    }
}
