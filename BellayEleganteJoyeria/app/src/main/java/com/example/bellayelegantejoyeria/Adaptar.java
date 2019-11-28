package com.example.bellayelegantejoyeria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptar extends RecyclerView.Adapter<Adaptar.ViewHolder> {

    private ArrayList<Elementos>elementos;
    private Context context;

    public Adaptar(ArrayList<Elementos>elementos, Context context){
        this.elementos=elementos;
        this.context=context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View V= LayoutInflater.from(parent.getContext()).inflate(R.layout.elemento, parent, false);
        return new ViewHolder(V);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Elementos lista=elementos.get(position);

        holder.TxtDesc.setText(lista.getDescripcion());
        holder.TxtDet.setText(lista.getDetalles());

        //imagen
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imagen;
        TextView TxtDesc,TxtDet;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen=(ImageView)itemView.findViewById(R.id.imagen);
            TxtDesc=(TextView) itemView.findViewById(R.id.Descripcion);
            TxtDet=(TextView) itemView.findViewById(R.id.Detalle);
        }
    }
}
