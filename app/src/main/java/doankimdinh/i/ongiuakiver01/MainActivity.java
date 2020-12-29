package doankimdinh.i.ongiuakiver01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListPhoneAdapter listPhoneAdapter;
    private ArrayList<ItemPhone> arrayList;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);

        arrayList = new ArrayList<>();
        arrayList.add(new ItemPhone(R.drawable.iphone1,"iphone1",230000));
        arrayList.add(new ItemPhone(R.drawable.iphone2,"iphone2",550000));
        arrayList.add(new ItemPhone(R.drawable.iphone3,"iphone3",230000));
        arrayList.add(new ItemPhone(R.drawable.iphone4,"iphone4",400000));
        arrayList.add(new ItemPhone(R.drawable.iphone5,"iphone5",420000));
        arrayList.add(new ItemPhone(R.drawable.iphone6,"iphone6",450000));

        listPhoneAdapter = new ListPhoneAdapter(arrayList,this);

        recyclerView.setAdapter(listPhoneAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));


    }
}