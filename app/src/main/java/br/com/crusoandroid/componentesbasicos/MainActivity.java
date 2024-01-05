package br.com.crusoandroid.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textResultado;
    private CheckBox checkVerde, checkVermelho,checkBranco;
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome     = findViewById(R.id.editNome);
        campoEmail    = findViewById(R.id.editEmail);

        textResultado = findViewById(R.id.textResultado);

        //checkbox
        checkBranco   = findViewById(R.id.checkBranco);
        checkVerde    = findViewById(R.id.checkVerde);
        checkVermelho = findViewById(R.id.checkVermelho);

        //RadioButtons
        sexoMasculino = findViewById(R.id.radioButtonM);
        sexoFeminino  = findViewById(R.id.radioButtonF);
        opcaoSexo = findViewById(R.id.radioGruopSexo);

    }

    public void radioButton(){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){

                if (checkedId == R.id.radioButtonM){
                    textResultado.setText("Feminino");
                }else if (checkedId == R.id.radioButtonF){
                    textResultado.setText("Masculino");
                }
            }
        });

        /*
        if(sexoFeminino.isChecked()){
            textResultado.setText("Feminino");;
        }else if (sexoMasculino.isChecked()){
            textResultado.setText("Masculino");
        }
         */
    }

    public void enviar(View view){

        radioButton();
        //checkbox();

        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textResultado.setText("Nome: " + nome + " email: " + email);

         */
    }

    public void checkbox(){

        String texto = "";
        if(checkVerde.isChecked()){
            texto = "Verde selecionado - ";
        }

        if(checkBranco.isChecked()){
            texto = texto + "Branco selecionado - ";
        }

        if(checkVermelho.isChecked()){
            texto = texto +  "Vermelho selecionado - ";
        }
        textResultado.setText(texto);
    }

    public void limpar(View view){
        campoNome.setText("");
        campoEmail.setText("");
    }

}