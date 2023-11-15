
package com.example.projetofinalmobile;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private Button btnLogin;
    private String userEmail = "user@example.com";
    private String userPassword = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Simulando autenticação
                String enteredEmail = "user@example.com"; // Obtenha isso do campo de entrada
                String enteredPassword = "password"; // Obtenha isso do campo de entrada

                if (enteredEmail.equals(userEmail) && enteredPassword.equals(userPassword)) {
                    // Se a autenticação for bem-sucedida, vá para a próxima página
                    Intent intent = new Intent(MainActivity.this, NextActivity.class);
                    startActivity(intent);
                } else {
                    // Autenticação falhou, exibir uma mensagem adequada
                    // (por exemplo, usando Toast)
                }
            }
        });
    }
}
