    package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPress = findViewById(R.id.btnMahasiswa);
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frameMain1, new Mahasiswa1Fragment());
                ft.commit();
            }
        });

//        Button btnPress2 = findViewById(R.id.btnSimpan);
//        btnPress2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//                ft.replace(R.id.frameMain2, new Mahasiswa2Fragment());
//                ft.commit();
//            }
//        });
    }

        public void ToFragment(View view) {
        Intent intent = new Intent(MainActivity.this, Main3FragmentActivity.class);
        startActivity(intent);
        }

        public void ToList(View view) {
        Intent intent = new Intent(MainActivity.this, ListActivity.class);
        startActivity(intent);
        }

        public void GotoListMahasiswa(View view) {
        Intent intent = new Intent(MainActivity.this, ListMahasiswaActivity.class);
        startActivity(intent);
        }

        public void GoToEnter(View view) {
            Intent intent = new Intent(MainActivity.this, dialogActivity.class);
            startActivity(intent);
        }

        public void GoToReset(View view) {
            Intent intent = new Intent(MainActivity.this, dialogActivity.class);
            startActivity(intent);
        }
    }
