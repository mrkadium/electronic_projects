package com.example.evaluacion_gg17i04001;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class EstudianteAdapter extends BaseAdapter {
    private TextView number,tvNombre,tvCodigo,tvMateria;
    List<Estudiante> listEst;
    Context context;

    public EstudianteAdapter(List<Estudiante> data, Context context) {
        listEst = data;
        this.context = context;



    }

    @Override
    public int getCount() {
        return listEst.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.itemestudiante,null);
        number = (TextView) item.findViewById(R.id.tvNumber);
        tvNombre = (TextView) item.findViewById(R.id.tvNombre);
        tvCodigo = (TextView) item.findViewById(R.id.tvCodigo);
        tvMateria= (TextView) item.findViewById(R.id.tvMateria);

        int nu = i+1;

        number.setText(nu + "");
        tvNombre.setText(listEst.get(i).getNombre());
        tvCodigo.setText(listEst.get(i).getCodigo());
        tvMateria.setText(listEst.get(i).getMateria()+ ":"+listEst.get(i).getPromedio());
        return  item;
    }
}
