package com.projectforgober.user.benuadidunia;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMoveActivity;
            Button btnMovewithDataActivity;
    private RecyclerView rvCategory;
            private ArrayList<Benua> list = new ArrayList<>();
    private View btnMoveWithDataActivity;
    private Benua benua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(DataBenua.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListBenuaAdapter listBenuaAdapter = new ListBenuaAdapter(this);
        listBenuaAdapter.setListBenua(list);
        rvCategory.setAdapter(listBenuaAdapter);
    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return super.onCreateOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()){
                case R.id.action_list:
                    break;
            }
            return super.onOptionsItemSelected(item);

            btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
            btnMoveWithDataActivity.setOnClickListener(this);
        }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity_data:
                Intent moveIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                break;

            Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
            moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Jenis-jenis Benua di Dunia");
            startActivity(moveWithDataIntent);

            private void BenuaAsia; (Benua benua){
                Toast.makeText(this, "Benua Asia merupakan benua terluas di dunia dengan luasnya berkisar 44.180.000 km² atau sekitar 1/3 dari luas keseluruhan bumi. Benua eropa dan benua asia letaknya menyatu dan terkadang untuk menyebutnya menggunakan istilah benua Eurasia. Luas benua asia ini 4,5 kali lipat dibandingkan dengan luas benua eropa. Letak astronomis dari benua asia adalah 11° 16’ LS – 77° 41’ LU dan 26° 04’ BT – 169° 40’ BB."+benua.getName(), Toast.LENGTH_SHORT).show();
            }
            private void BenuaAfrika; (Benua benua){
                Toast.makeText(this, "Benua Afrika merupakan benua yang terbesar kedua setelah benua asia dengan luasnya berkisar pada 30.244.050 km². benua afrika ini dipisahkan dari wilayah eropa oleh laut tengah eropa dan berdekatan dengan benua asia dengan terusan suez yang memiliki lebar 130 km."+benua.getName(), Toast.LENGTH_SHORT).show();
            }
            private void BenuaAmerika; (Benua benua);{
                Toast.makeText(this, "Benua Amerika terdiri dari dua bagian yaitu bagian utara dan bagian selatan. Bagian utara terdapat negara amerika serikat, kanada dan Alaska sedangkan bagian selatan meliputi bangsa latin seperti brazil, kolombia, meksiko dan lainnya. benua amerika terletak di astronomi 7° 12’ LU – 83° 07’ LS dan 52° 37’ BB – 172° 27’ BT. Titik atau daratan tertinggi di amerika adalah gunung mckienly dan titik terendahnya berada pada badwater, lembah maut, kalifornia."+benua.getName(), Toast.LENGTH_SHORT).show();
            }
            private void BenuaAustralia; (Benua benua){
                Toast.makeText(this, "Benua Australia merupakan satu-satunya benua yang menjadi satu negara. Benua Australia merupakan benua yang paling stabil di dunia dimana dalam sejarahnya tidak pernah terjadi ledakan gunung api, penyebab tsunami, angin topan bahkan intensitas gempa sangat terbatas. Luas benua Australia kurang lebih 7.682.300 km² dan terletak di bagian bumi selatan dengan letak astronomisnya adalah 9° LS – 45° LU dan 113° BT – 154° BT."+benua.getName(), Toast.LENGTH_SHORT).show();
            }
            private void BenuaEropa; (Benua benua){
                Toast.makeText(this, "Benua eropa merupakan benua terkecil kedua setelah benua Australia dengan luasnya 10.600.000 km². letak astronomis benua eropa adalah 35° LU – 71° 06’ LU dan 9° 27’ BB – 66° 20’ BT. Luas benua eropa sekitar 10.800.000 km² atau sekitar 7% dari luas bumi. Batas benua eropa di bagian selatan adalah laut mediterania sedangkan di bagian selatan adalah samudera atlantik."+benua.getName(), Toast.LENGTH_SHORT).show();
            }
            private void BenuaAntartika; (Benua benua){
                Toast.makeText(this, "Benua terakhir adalah benua antartika yang terletak di kutub selatan bumi dimana tempat ini merupakan yang paling dingin di bumi dan ditutupi salju sepanjang tahun. Luas benua ini adalah 14.000.000 km², namun benua antartika ini tidak banyak orang yang mengunjungi karena memiliki cuaca yang ekstrim."+benua.getName(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}