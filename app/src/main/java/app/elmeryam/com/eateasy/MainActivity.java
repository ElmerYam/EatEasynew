package app.elmeryam.com.eateasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSingIn,btnSingUp;
    TextView txtSlogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSingIn = (Button)findViewById(R.id.btnSingIn);
        btnSingUp = (Button)findViewById(R.id.btnSingUp);

        txtSlogan = (TextView)findViewById(R.id.txtSlogan);

        btnSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SingUp = new Intent(MainActivity.this, SignUp.class);
                startActivity(SingUp);
            }
        });

        btnSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SingIn = new Intent(MainActivity.this, SignIn.class);
                startActivity(SingIn);
            }
        });
    }
}
