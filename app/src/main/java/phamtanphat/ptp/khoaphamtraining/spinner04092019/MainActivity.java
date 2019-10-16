package phamtanphat.ptp.khoaphamtraining.spinner04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner mSpinner;
    ArrayList<String> mArrayTen = new ArrayList<>();
    ArrayAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

              mSpinner = findViewById(R.id.spinner);
        mArrayTen = new ArrayList<>(Arrays.asList("Teo","Ti","Tun","Tuan"));

        mAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,mArrayTen);
        mSpinner.setAdapter(mAdapter);

        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, mArrayTen.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

//        Ten : Nguyen Van A
//        Lop : A4     Spinner: A1 , A2 , A3 , A4
//
//
//                Danh sach hoc vien
    }
}
