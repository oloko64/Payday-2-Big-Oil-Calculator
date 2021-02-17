package com.calculator.payday2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Nao declarados
    private RadioButton nao_declarado_pressao;
    private RadioButton nao_declarado_mangueira;
    private RadioButton nao_declarado_gas;

    // Pressao
    private RadioButton maior_que;
    private RadioButton menor_que;

    // Mangueiras

    private RadioButton hydrogen1;
    private RadioButton hydrogen2;
    private RadioButton hydrogen3;

    // Gas
    private RadioButton nitrogen;
    private RadioButton helium;
    private RadioButton deterium;

    //Engines
    private TextView engine12;
    private TextView engine10;
    private TextView engine8;
    private TextView engine7;
    private TextView engine9;
    private TextView engine11;

    private TextView engine2;
    private TextView engine1;
    private TextView engine4;
    private TextView engine3;
    private TextView engine6;
    private TextView engine5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Nao declarados
        nao_declarado_pressao = findViewById(R.id.nao_declarado_pressao);
        nao_declarado_mangueira = findViewById(R.id.nao_declarado_mangueira);
        nao_declarado_gas = findViewById(R.id.nao_declarado_gas);

        // Pressao
        maior_que = findViewById(R.id.maior_que);
        menor_que = findViewById(R.id.menor_que);


        //Mangueiras
        hydrogen1 = findViewById(R.id.hydrogen1);
        hydrogen2 = findViewById(R.id.hydrogen2);
        hydrogen3 = findViewById(R.id.hydrogen3);


        // Gas
        nitrogen = findViewById(R.id.nitrogen);
        helium = findViewById(R.id.helium);
        deterium = findViewById(R.id.deterium);


        // Motores
        // Left Side
        engine12 = findViewById(R.id.engine12);
        engine10 = findViewById(R.id.engine10);
        engine8 = findViewById(R.id.engine8);
        engine7 = findViewById(R.id.engine7);
        engine9 = findViewById(R.id.engine9);
        engine11 = findViewById(R.id.engine11);

        // Right Side
        engine2 = findViewById(R.id.engine2);
        engine4 = findViewById(R.id.engine4);
        engine6 = findViewById(R.id.engine6);
        engine1 = findViewById(R.id.engine1);
        engine3 = findViewById(R.id.engine3);
        engine5 = findViewById(R.id.engine5);

        // Listeners RadioButton
        // Nao definidos
        @SuppressLint("CutPasteId") RadioButton radioButtonNaoDeclaradoPressao = (RadioButton) findViewById(R.id.nao_declarado_pressao);
        @SuppressLint("CutPasteId") RadioButton radioButtonNaoDeclaradoMangueira = (RadioButton) findViewById(R.id.nao_declarado_mangueira);
        @SuppressLint("CutPasteId") RadioButton radioButtonNaoDeclaradoGas = (RadioButton) findViewById(R.id.nao_declarado_gas);
        radioButtonNaoDeclaradoPressao.setOnClickListener(radio_listener);
        radioButtonNaoDeclaradoMangueira.setOnClickListener(radio_listener);
        radioButtonNaoDeclaradoGas.setOnClickListener(radio_listener);


        // Pressao
        @SuppressLint("CutPasteId") RadioButton radioButtonMaiorQue = (RadioButton) findViewById(R.id.maior_que);
        @SuppressLint("CutPasteId") RadioButton radioButtonMenorQue = (RadioButton) findViewById(R.id.menor_que);
        radioButtonMaiorQue.setOnClickListener(radio_listener);
        radioButtonMenorQue.setOnClickListener(radio_listener);

        // Mangueiras
        @SuppressLint("CutPasteId") RadioButton radioButtonHydrogen1 = (RadioButton) findViewById(R.id.hydrogen1);
        @SuppressLint("CutPasteId") RadioButton radioButtonHydrogen2 = (RadioButton) findViewById(R.id.hydrogen2);
        @SuppressLint("CutPasteId") RadioButton radioButtonHydrogen3 = (RadioButton) findViewById(R.id.hydrogen3);
        radioButtonHydrogen1.setOnClickListener(radio_listener);
        radioButtonHydrogen2.setOnClickListener(radio_listener);
        radioButtonHydrogen3.setOnClickListener(radio_listener);

        // Gas
        @SuppressLint("CutPasteId") RadioButton radioButtonDeterium = (RadioButton) findViewById(R.id.deterium);
        @SuppressLint("CutPasteId") RadioButton radioButtonNitrogen = (RadioButton) findViewById(R.id.nitrogen);
        @SuppressLint("CutPasteId") RadioButton radioButtonHelium = (RadioButton) findViewById(R.id.helium);
        radioButtonDeterium.setOnClickListener(radio_listener);
        radioButtonNitrogen.setOnClickListener(radio_listener);
        radioButtonHelium.setOnClickListener(radio_listener);

    }

    public void limparBotoes(View view) {
        nao_declarado_pressao.toggle();
        nao_declarado_mangueira.toggle();
        nao_declarado_gas.toggle();
        limparEngines();
    }

    public void limparEngines(){
        engine12.setTextColor(Color.BLACK);
        engine10.setTextColor(Color.BLACK);
        engine8.setTextColor(Color.BLACK);
        engine7.setTextColor(Color.BLACK);
        engine9.setTextColor(Color.BLACK);
        engine11.setTextColor(Color.BLACK);

        engine2.setTextColor(Color.BLACK);
        engine4.setTextColor(Color.BLACK);
        engine6.setTextColor(Color.BLACK);
        engine1.setTextColor(Color.BLACK);
        engine3.setTextColor(Color.BLACK);
        engine5.setTextColor(Color.BLACK);
    }

    View.OnClickListener radio_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            limparEngines();

            // 3 x Hoses Combinations
            if (maior_que.isChecked() && hydrogen3.isChecked() && deterium.isChecked()) {
                engine12.setTextColor(Color.RED); // #12

            }else if(maior_que.isChecked() && hydrogen3.isChecked() && nitrogen.isChecked()){
                engine11.setTextColor(Color.RED); // #11

            }else if(maior_que.isChecked() && hydrogen3.isChecked() && helium.isChecked()) {
                engine10.setTextColor(Color.RED); // #10

            } else if (menor_que.isChecked() && hydrogen3.isChecked() && deterium.isChecked()){
                engine9.setTextColor(Color.RED); // #9

            }else if(menor_que.isChecked() && hydrogen3.isChecked() && nitrogen.isChecked()){
                engine8.setTextColor(Color.RED); // #8

            }else if(menor_que.isChecked() && hydrogen3.isChecked() && helium.isChecked()){
                engine10.setTextColor(Color.RED); // #10
                engine7.setTextColor(Color.RED); // #7
            }

            // 2 x Hoses Combinations
            else if(maior_que.isChecked() && hydrogen2.isChecked() && nitrogen.isChecked()){
                engine4.setTextColor(Color.RED); // #4

            }else if(maior_que.isChecked() && hydrogen2.isChecked() && deterium.isChecked()){
                // Nenhum

            }else if(maior_que.isChecked() && hydrogen2.isChecked() && helium.isChecked()){
                engine3.setTextColor(Color.RED); // #3
                engine6.setTextColor(Color.RED); // #6

            }else if(menor_que.isChecked() && hydrogen2.isChecked() && nitrogen.isChecked()){
                engine4.setTextColor(Color.RED); // #4

            }else if(menor_que.isChecked() && hydrogen2.isChecked() && deterium.isChecked()){
                engine5.setTextColor(Color.RED); // #5

            }else if(menor_que.isChecked() && hydrogen2.isChecked() && helium.isChecked()){
                engine3.setTextColor(Color.RED); // #3
            }

            // 1 x Hoses Combinations
            else if(maior_que.isChecked() && hydrogen1.isChecked() && nitrogen.isChecked()){
                // Nenhum

            }else if(maior_que.isChecked() && hydrogen1.isChecked() && deterium.isChecked()){
                engine2.setTextColor(Color.RED); // #2

            }else if(maior_que.isChecked() && hydrogen1.isChecked() && helium.isChecked()){
                // Nenhum

            }else if(menor_que.isChecked() && hydrogen1.isChecked() && nitrogen.isChecked()){
                engine1.setTextColor(Color.RED); // #1

            }else if(menor_que.isChecked() && hydrogen1.isChecked() && deterium.isChecked()){
                // nenhum

            }else if(menor_que.isChecked() && hydrogen1.isChecked() && helium.isChecked()){
                // Nenhum
            }
        }
    };
}