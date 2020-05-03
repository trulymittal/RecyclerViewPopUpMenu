package com.example.recyclerviewpopupmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerAdapter = new RecyclerAdapter();
        recyclerView.setAdapter(recyclerAdapter);

        initMovies();
    }

    private void initMovies() {
        List<String> movieList = new ArrayList<>();
        movieList.add("Iron Man");
        movieList.add("The Incredible Hulk");
        movieList.add("Iron Man 2");
        movieList.add("Thor");
        movieList.add("Captain America: The First Avenger");
        movieList.add("The Avengers");
        movieList.add("Iron Man 3");
        movieList.add("Thor: The Dark World");
        movieList.add("Captain America: The Winter Soldier");
        movieList.add("Guardians of the Galaxy");
        movieList.add("Avengers: Age of Ultron");
        movieList.add("Ant-Man");
        movieList.add("Captain America: Civil War");
        movieList.add("Doctor Strange");
        movieList.add("Guardians of the Galaxy Vol. 2");
        movieList.add("Spider-Man: Homecoming");
        movieList.add("Thor: Ragnarok");
        movieList.add("Black Panther");
        movieList.add("Avengers: Infinity War");
        movieList.add("Ant-Man and the Wasp");
        movieList.add("Captain Marvel");
        movieList.add("Avengers: Endgame");
        movieList.add("Spider-Man: Far From Home");

        recyclerAdapter.updateMovieList(movieList);
    }
}
