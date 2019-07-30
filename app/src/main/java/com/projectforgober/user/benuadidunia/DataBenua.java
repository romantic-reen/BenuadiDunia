package com.projectforgober.user.benuadidunia;

import java.util.ArrayList;

public class DataBenua {
        public static String[][] data = new String[][]{
                {"Benua Asia", "Benua Terluas di Dunia", "https://storage.googleapis.com/ilmugeografi/2015/11/benua-asia.jpg"},
                {"Benua Afrika", "Benua Terbesar Kedua setelah Benua Asia", "https://storage.googleapis.com/ilmugeografi/2015/11/africa.gif"},
                {"Benua Amerika", "Benua yang terdiri dari dua bagian, yaitu bagian Utara dan bagian Selatan", "https://storage.googleapis.com/ilmugeografi/2015/11/benua-amerika.jpg"},
                {"Benua Australia", "Satu-satunya Benua yang Menjadi Satu Negara", "https://storage.googleapis.com/ilmugeografi/2015/11/Benua-Australia.gif"},
                {"Benua Eropa", "Benua Terkecil Kedua setelah Benua Australia", "https://storage.googleapis.com/ilmugeografi/2015/11/benua-eropa.png"},
                {"Benua Antartika", "Benua yang Terletak di Kutub Selatan Bumi", "https://storage.googleapis.com/ilmugeografi/2015/11/benua-antaritka.jpg"}
        };

        public static ArrayList<Benua> getListData(){
            Benua benua = null;
            ArrayList<Benua> list = new ArrayList<>();
            for (String[] aData : data) {
                benua = new benua();
                benua.setName(aData[0]);
                benua.setRemarks(aData[1]);
                benua.setPhoto(aData[2]);

                list.add(benua);
            }

            return list;
        }
    }