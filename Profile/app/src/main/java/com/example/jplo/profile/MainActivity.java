package com.example.jplo.profile;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jplo.profile.module.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    Context context = MainActivity.this;

    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeData();

        RVAdapter adapter = new RVAdapter(persons);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(context);
        rv.setLayoutManager(llm);
        rv.setAdapter(adapter);
    }

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("João Paulo", "21 years old", "https://scontent.frec3-2.fna.fbcdn.net/v/t31.0-8/18156053_1712577668768807_71503684955788641_o.jpg?_nc_cat=0&oh=b6d9495a7533fa10b942738ac66d2b02&oe=5B715B48"));
        persons.add(new Person("Alany Maria", "24 years old", "https://scontent.frec3-2.fna.fbcdn.net/v/t1.0-9/15284997_955877754548304_2899870061664223844_n.jpg?_nc_cat=0&oh=58e1899a0b838791b58cf4dabbc2b20d&oe=5B3A55BE"));
        persons.add(new Person("Rafael Albuquerque", "22 years old", "https://scontent.frec3-2.fna.fbcdn.net/v/t1.0-9/1004821_10202159132046926_1944799364_n.jpg?_nc_cat=0&oh=d1d656e72db3734e010fa3333cd8eece&oe=5B328677"));
        persons.add(new Person("Filipe Mei", "24 years old", "https://scontent.frec3-2.fna.fbcdn.net/v/t1.0-9/21766725_10208970598936690_2288529967243678704_n.jpg?_nc_cat=0&oh=3c3401940e7f2f061cf8b6c04a71cde2&oe=5B3CDF70"));
        persons.add(new Person("Vinicius Santana", "21 years old", "https://scontent.frec3-2.fna.fbcdn.net/v/t1.0-9/10511359_614691145305136_1868247839159388686_n.jpg?_nc_cat=0&oh=a22de7641ccb9b0c0b18d37c4c8473a4&oe=5B6F7F44"));
        persons.add(new Person("Igor Formiga", "21 years old", "https://scontent.frec3-2.fna.fbcdn.net/v/t1.0-9/20031697_1511873375500402_1532709639791723695_n.jpg?_nc_cat=0&oh=02399fa7e7cf2020e07ead4ebdddd4b6&oe=5B28EACA"));
        persons.add(new Person("Thiago Gomes", "24 years old", "https://scontent.frec3-2.fna.fbcdn.net/v/t1.0-9/1969112_10152585887148250_1884460911647442169_n.jpg?_nc_cat=0&oh=dc4616c047223ad1ab93e35e92238db8&oe=5B313C8A"));
    }
}
