package com.example.firebasedatabase05102020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 : Gui du lieu dang chuoi
//        myRef
//                .child("Nguyen Van Teo")
//                .setValue("10 tuổi")
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//                        if (task.isSuccessful()){
//                            Toast.makeText(MainActivity.this, "Tạo thành công", Toast.LENGTH_SHORT).show();
//                        }else{
//                            Toast.makeText(MainActivity.this, "Tạo thất bại", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
        //
        // 2 : Gui dang object
//        Phuongtien xedap = new Phuongtien("Xe đạp", 2);
//        myRef.child("Phuongtien").setValue(xedap).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(MainActivity.this, "Tạo thành công", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "Tạo thất bại", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        // 3 : Gui dang hashmap
//        Map<String,Integer> lichkhaigiang = new HashMap<>();
//        lichkhaigiang.put("Android",25082020);
//        lichkhaigiang.put("Ios",22012021);
//        myRef.child("Lichkhaigiang").setValue(lichkhaigiang);

        // 4 : Gui dang array object
//        myRef.child("Tinnhan").push().setValue(new Tinnhan("Ti","Xin chao"));
    }
}