package sg.edu.rp.c346.id18015871.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView Lv;
    ArrayList<Employee> EXP;
    ArrayAdapter<Employee> LOVE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lv=findViewById(R.id.ListViewEmployees);

        EXP=new ArrayList<>();
        EXP.add(new Employee("John","Software Technical Leader",3400.0));
        EXP.add(new Employee("May","Programmer",2200.0));


        LOVE=new ArrayAdapter<>(this,
                android.R.layout.activity_list_item, EXP);
        Lv.setAdapter(LOVE);
    }
}
