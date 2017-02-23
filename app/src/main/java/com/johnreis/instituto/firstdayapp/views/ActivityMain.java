package com.johnreis.instituto.firstdayapp.views;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.johnreis.instituto.firstdayapp.R;
import com.johnreis.instituto.firstdayapp.adapters.BookAdapter;
import com.johnreis.instituto.firstdayapp.entities.Books;
import com.johnreis.instituto.firstdayapp.utils.Utils;

import java.util.ArrayList;

public class ActivityMain extends Activity {
    TextView helloText;
    ListView listMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initObjects();
    }

    void initObjects(){
        listMain = (ListView) findViewById(R.id.listMain);
        helloText = (TextView) findViewById(R.id.helloText);

        helloText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Cool, bro!");
            }
        });

        final ArrayList<Books> books = new ArrayList<>();
        books.add(new Books("Harry Potter and the Philosopher's Stone", "https://upload.wikimedia.org/wikipedia/en/6/6b/Harry_Potter_and_the_Philosopher%27s_Stone_Book_Cover.jpg"));
        books.add(new Books("Harry Potter and the Chamber of Secrets", "https://upload.wikimedia.org/wikipedia/en/thumb/5/5c/Harry_Potter_and_the_Chamber_of_Secrets.jpg/220px-Harry_Potter_and_the_Chamber_of_Secrets.jpg"));
        books.add(new Books("Harry Potter and the Prisoner of Azkaban", "https://upload.wikimedia.org/wikipedia/en/a/a0/Harry_Potter_and_the_Prisoner_of_Azkaban.jpg"));
        books.add(new Books("Harry Potter and the Goblet of Fire", "https://upload.wikimedia.org/wikipedia/en/c/c7/Harry_Potter_and_the_Goblet_of_Fire.jpg"));
        books.add(new Books("Harry Potter and the Order of the Phoenix", "https://upload.wikimedia.org/wikipedia/en/thumb/7/70/Harry_Potter_and_the_Order_of_the_Phoenix.jpg/220px-Harry_Potter_and_the_Order_of_the_Phoenix.jpg"));
        books.add(new Books("Harry Potter and the Half-Blood Prince", "https://upload.wikimedia.org/wikipedia/en/f/f0/Harry_Potter_and_the_Half-Blood_Prince.jpg"));
        books.add(new Books("Harry Potter and the Deathly Hallows", "https://upload.wikimedia.org/wikipedia/en/a/a9/Harry_Potter_and_the_Deathly_Hallows.jpg"));



        BookAdapter adapter = new BookAdapter(books, this.getBaseContext());
        listMain.setAdapter(adapter);

        listMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), books.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
