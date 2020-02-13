package www.nabil.tugasmobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {

    private EditText etAlas, etTinggi;
    private Button btnHasil, btnPindah;
    private TextView tvHasil;

    private Double sxHasil = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

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
                try {

                    double alas = Double.parseDouble(etAlas.getText().toString());
                    double tinggi = Double.parseDouble(etTinggi.getText().toString());

                    double hasil = alas * tinggi / 2;

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                    sxHasil = hasil;

                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
