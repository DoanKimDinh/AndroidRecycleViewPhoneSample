package doankimdinh.i.ongiuakiver01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ChiTietActivity extends AppCompatActivity {

    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);

        arrayList = new ArrayList<>();

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        double price = intent.getDoubleExtra("price",2);

        ((TextView)findViewById(R.id.txtChiTietTen)).setText(name);
        ((TextView)findViewById(R.id.txtChiTietDonGia)).setText(String.valueOf(price));
        ((ImageView)findViewById(R.id.imageChiTiet)).setImageResource(intent.getIntExtra("picture",1));
        arrayList.add(name);

        findViewById(R.id.btnKetThucChiTiet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
              //  Toast.makeText(getApplicationContext(),String.valueOf(arrayList),Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.btnCheckOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),CheckOutActivity.class);
                intent1.putExtra("donGia", ((TextView)findViewById(R.id.txtChiTietDonGia)).getText());
                startActivity(intent1);
            }
        });

    }
}