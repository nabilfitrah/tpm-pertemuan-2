package www.nabil.tugasmobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Jajargenjang extends AppCompatActivity {

    private EditText etAlas, etTinggi;
    private Button btnHasil, btnPindah;
    private TextView tvHasil;

    private Double sxHasil = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajargenjang);

        etAlas = findViewById(R.id.etAlas);
        etTinggi = findViewById(R.id.etTinggi);
        btnHasil = findViewById(R.id.btnHasil);
        btnPindah = findViewById(R.id.btnPindah);
        tvHasil = findViewById(R.id.tvHasil);

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Implisit.class);
                intent.putExtra("hasil", sxHasil);
                startActivity(intent);
            }
        });


        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double alas =  Double.parseDouble(etAlas.getText().toString());
                double tinggi = Double.parseDouble(etTinggi.getText().toString());

                double hasil = alas * tinggi;

                String sHasil = String.valueOf(hasil);
                tvHasil.setText(sHasil);
                sxHasil = hasil;
            }
        });




    }
}
