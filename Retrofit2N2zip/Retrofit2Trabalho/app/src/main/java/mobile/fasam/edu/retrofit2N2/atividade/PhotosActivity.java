package mobile.fasam.edu.retrofit2N2.atividade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

import mobile.fasam.edu.retrofit2N2.R;
import mobile.fasam.edu.retrofit2N2.adapter.PhotosAdapter;
import mobile.fasam.edu.retrofit2N2.bootstrap.BootstrapApi;
import mobile.fasam.edu.retrofit2N2.representacao.Photos;
import mobile.fasam.edu.retrofit2N2.resource.PhotosService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

    public class PhotosActivity extends AppCompatActivity {

        EditText txtUserId;
        EditText txtID;
        EditText txtNome;
        EditText txtBody;
        EditText txtEmail;
        ListView listView;

        PhotosService photosService;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_photos);
        }

        private void carregarDados()
        {
            photosService = BootstrapApi.getClient().create(PhotosService.class);
            Call<List<Photos>> get = photosService.get();
            get.enqueue(new Callback<List<Photos>>() {
                @Override
                    public void onResponse(Call<List<Photos>> call, Response<List<Photos>> response) {

                    List<Photos> posts = response.body();

                    PhotosAdapter adapter = new PhotosAdapter(getApplicationContext(), posts);


                    listView = findViewById(R.id.listViewComments);

                    listView.setAdapter(adapter);
                     }

                @Override
                public void onFailure(Call<List<Photos>> call, Throwable t) {

                }
            });


}

        public void adicionar(View view) {

            carregarDados();
        }
        }
