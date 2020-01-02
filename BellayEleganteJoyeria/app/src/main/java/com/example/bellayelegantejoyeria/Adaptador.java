package com.example.bellayelegantejoyeria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {
    private Context nCtx;
    private List<Productos> productos;

    public Adaptador(Context nCtx, List<Productos> productos) {
        this.nCtx = nCtx;
        this.productos = productos;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(nCtx);
        View view = inflater.inflate(R.layout.list_layout,null);
        return new ViewHolder((TextView) view );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Productos producto=productos.get(position);

        //cargamos la imagen
        Glide.with(nCtx)
                .load(producto.getImagen())
                .into(holder.imageView2);
        holder.nombreP.setText(producto.getNombre());
        holder.Descripcion.setText(producto.getDescripcion());
        holder.Precio.setText(String.valueOf(producto.getPrecio()));

    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombreP, Descripcion, Precio;
        ImageView imageView2;
        public ViewHolder(TextView v){
            super(v);
            nombreP=v.findViewById(R.id.textNombre);
            Descripcion=v.findViewById( R.id.textDescripcion);
            Precio=v.findViewById(R.id.textprecio);
            imageView2=v.findViewById(R.id.imageView2);
        }
    }
}
