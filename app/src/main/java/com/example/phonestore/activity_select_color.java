zalpackage com.example.phonestore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class activity_select_color extends AppCompatActivity {
    private Button btnXong, btnBlue, btnRed, btnBlack, btnDarkBlue;
    private ImageView imvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_color);

        btnXong = findViewById(R.id.btnXong);
        btnBlue = findViewById(R.id.btnRedColor);
        btnRed = findViewById(R.id.btnRedColor);

    }
}