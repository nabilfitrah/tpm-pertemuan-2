package www.nabil.tugasmobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Implisit extends AppCompatActivity {

    private TextView tvHasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implisit);

        tvHasil2 = findViewById(R.id.tvHasil2);

        Double hasil = getIntent().getDoubleExtra("hasil",0);
        tvHasil2.setText("" + hasil);


    }
}
