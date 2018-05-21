package com.example.jplo.gitrepository;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.jplo.gitrepository.model.Repository;
import com.example.jplo.gitrepository.service.RepositoryService;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.profile)
    TextView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RepositoryService repositoryService = retrofit.create(RepositoryService.class);
        Observable<Repository> repository = repositoryService.getRepository("pitangagile");

        repository.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(info -> {
                    profile.setText("Login: "+info.getLogin()+"\n\n\n"
                    +"Name: "+info.getName()+"\n\n\n"
                    +"Location: "+info.getLocation()+"\n\n\n");
                });
    }
}
