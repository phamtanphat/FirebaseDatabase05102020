package com.example.firebasedatabase05102020;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

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

        // Đọc về
        // 1 : Dạng chuỗi
//        myRef.child("Nguyen Van Teo").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                String value = (String) snapshot.getValue();
//                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
        // 2 : Dạng object
//        myRef.child("Phuongtien").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                Phuongtien phuongtien = snapshot.getValue(Phuongtien.class);
//                for (DataSnapshot snap : snapshot.getChildren()) {
//                    String key = snap.getKey();
//                    Log.d("BBB",key);
//                }
////                Toast.makeText(MainActivity.this, phuongtien.getTen(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
        // 3 : Dang hashmap
//        myRef.child("Lichkhaigiang").addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                HashMap<String  , Long> lich = (HashMap<String, Long>) snapshot.getValue();
//                Toast.makeText(MainActivity.this, lich.get("Android").toString(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
        // 4 : Lay dữ liệu dạng mảng
        myRef.child("Tinnhan").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Log.d("BBB",snapshot.getKey());
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    String key = dataSnapshot.getKey();
                    Log.d("BBB",key);
                }
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}