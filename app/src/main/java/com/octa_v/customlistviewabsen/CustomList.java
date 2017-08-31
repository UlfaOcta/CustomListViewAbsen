package com.octa_v.customlistviewabsen;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class CustomList extends ArrayAdapter<String> {
    private String[] tanggal_absen, jam_masuk,jam_keluar;

    private Activity context;

    public CustomList (Activity context, String[] tanggal_absen, String[] jam_masuk, String[] jam_keluar) {
        super(context, R.layout.listview_absen, tanggal_absen);
        this.tanggal_absen = tanggal_absen;
        this.jam_masuk = jam_masuk;
        this.jam_keluar = jam_keluar;
    }

        @Override
        public View getView (int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View listViewItem = inflater.inflate(R.layout.listview_absen, null, true);
            TextView textViewAbsen = (TextView) listViewItem.findViewById(R.id.tanggal_absen);
            TextView textViewJamMasuk = (TextView) listViewItem.findViewById(R.id.jam_masuk);
            TextView textViewJamKeluar = (TextView) listViewItem.findViewById(R.id.jam_keluar);

            textViewAbsen.setText(tanggal_absen[position]);
            textViewJamMasuk.setText(jam_masuk[position]);
            textViewJamKeluar.setText(jam_keluar[position]);

            return listViewItem;
    }
}