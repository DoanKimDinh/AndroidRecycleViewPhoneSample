package doankimdinh.i.ongiuakiver01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CheckOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);

        Intent intent = getIntent();
        String dinh = intent.getStringExtra("donGia");
        ((TextView)findViewById(R.id.txtCheckOutDonGia)).setText(dinh);


    }
}