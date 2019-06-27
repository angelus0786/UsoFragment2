package mx.edu.itsmt.angelus.usofragment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton bt1,bt2,bt3,bt4;

    public  void inicio() {
        bt1 = findViewById(R.id.imB1);
        bt2 = findViewById(R.id.imB2);
        bt3 = findViewById(R.id.imB3);
        bt4 = findViewById(R.id.imB4);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicio();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.imB1:

                MenuActivity.opcion=1;
                intent = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
                break;
            case R.id.imB2:
                MenuActivity.opcion=2;
                 intent = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
                break;
            case R.id.imB3:
                MenuActivity.opcion=3;
                 intent = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
                break;
            case R.id.imB4:
                MenuActivity.opcion=4;
                intent = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
                break;
        }
    }
}
