package mobile.fasam.edu.retrofit2N2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import mobile.fasam.edu.retrofit2N2.R;
import mobile.fasam.edu.retrofit2N2.representacao.Photos;

public class PhotosAdapter extends BaseAdapter {
    Context context;
    List<Photos> colecao;
    LayoutInflater inflter;



        public PhotosAdapter(final Context applicationContext,
                             final List<Photos> colecao) {
            this.colecao = colecao;
            this.context = applicationContext;

        }

            @Override
                public int getCount() {
            return this.colecao!=null ? this.colecao.size() :0;
        }

            @Override
                 public Object getItem(int position) {
            return this.colecao.get(position);
        }

            @Override
                 public long getItemId(int i) {
            return 0;
        }

            @Override
                 public View getView(int position, View view, ViewGroup viewGroup) {

            if (view == null) {
                view = LayoutInflater.from(context).
                        inflate(R.layout.item_photos,
                                viewGroup, false);
            }

                Photos photos = (Photos)getItem(position);

                TextView userId, id, nome;

                userId = view.findViewById(R.id.txtUserId);
                nome = view.findViewById(R.id.txtNome);

                userId.setText(String.valueOf(photos.getUserId()));
                nome.setText(String.valueOf(photos.getNome()));


                return view;
        }
}
