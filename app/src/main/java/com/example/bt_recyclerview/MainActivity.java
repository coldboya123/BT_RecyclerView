package com.example.bt_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Object> list = new ArrayList<>();
    List<String> listVoucher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.rcv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new RCV_Adapter(this, list));
    }

    private void getData() {
        listVoucher = new ArrayList<>();
        listVoucher.add("Ăn trưa - đi 4 tính 3");
        listVoucher.add("Ăn trưa - đi 4 tính 3");
        list.add(new Object(R.drawable.img1, "Lẩu Phan - Buffet Bò Úc - Nguyễn Văn Cừ",
                "485 Nguyễn Văn Cừ, Long Biên, Hà Nội", listVoucher));

        listVoucher = new ArrayList<>();
        listVoucher.add("Ăn trưa - đi 4 tính 3");
        listVoucher.add("Ăn trưa - đi 4 tính 3");
        list.add(new Object(R.drawable.img2, "Lẩu Phan - Buffet Bò Úc - Láng Hạ",
                "16 Ngõ 59, Láng Hạ, Đống Đa, Hà Nội", listVoucher));

        listVoucher = new ArrayList<>();
        listVoucher.add("Cả ngày - Giảm 15%");
        listVoucher.add("Ăn trưa - đi 4 tính 3");
        listVoucher.add("Ăn trưa - đi 4 tính 3");
        list.add(new Object(R.drawable.img3, "Jinro BBQ - Huỳnh Thúc Kháng",
                "91A Nguyễn Chí Thanh, Đống Đa, Hà Nội", listVoucher));

        listVoucher = new ArrayList<>();
        listVoucher.add("Cả ngày - Giảm 50%");
        listVoucher.add("Ăn trưa - đi 4 tính 3");
        listVoucher.add("Ăn trưa - đi 4 tính 3");
        listVoucher.add("Ăn trưa - đi 4 tính 3");
        list.add(new Object(R.drawable.img3, "Bò Tơ Quán Mộc - Nguyễn Thị Định",
                "B52 Nguyễn Thị Định, Thanh Xuân, Hà Nội", listVoucher));

        listVoucher = new ArrayList<>();
        listVoucher.add("Ăn trưa - Giảm 23%");
        list.add(new Object(R.drawable.img3, "BOX BBQ - Đỗ Quang",
                "37 Đỗ Quang, Cầu Giấy, Hà Nội", listVoucher));
    }

}