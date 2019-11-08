package contrato.com.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import contrato.com.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void cliente(View view) {
        startActivity(new Intent(this,Cliente.class));
    }
    public void prestador(View view) {
        startActivity(new Intent(this,Prestador.class));
    }
    public void administrador(View view) {
        startActivity(new Intent(this,Administrador.class));
    }
}
