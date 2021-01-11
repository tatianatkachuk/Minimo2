package com.example.minimo2_11012021;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MiAdapter extends RecyclerView.Adapter<MiAdapter.ViewHolder> {
    private List<String> valores;

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txt1;
        public TextView txt2;
        public View layout;

        public ViewHolder(View v){
            super(v);
            layout = v;
            txt1 = (textView) v.findViewByID(R.id.firstLine);
            txt2 = (textView) v.findViewByID(R.id.secondLine);
        }

        public void add(int pos, String it){
            valores.add(pos,it);
            notifyItemInserted(pos);
        }

        public void rem(int pos){
            valores.remove(pos);
            notifyItemRemoved(pos);
        }

      //  public MiAdapter(List<String> data){valores = data;};

        @Override

        public MiAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
            LayoutInFlater inflater = LayoutInFlater.from(parent.getContext());
            View v = inflater.inflate(R.layout.new_layout, parent,false);
            ViewHolder vh = newViewHolder(v);
            return vh;
        }
    }
}
