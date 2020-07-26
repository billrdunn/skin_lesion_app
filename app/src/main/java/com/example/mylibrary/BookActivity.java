package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookActivity extends AppCompatActivity {

    public static final String BOOK_ID_KEY = "bookId";

    private TextView txtBookName, txtAuthor, txtShortDescription, txtLongDescription, txtNumPages;
    private Button btnAddToCurrentlyReading, btnWantToRead, btnAlreadyRead, btnAddToFavourites;
    private ImageView bookImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initViews();

//        // TODO: get the data from recycler view in here
//        Book book = new Book(1, "The Secret History", "Donna Tartt", 638,
//                "https://www.bookspdf4free.com/wp-content/uploads/2020/02/9780140167771_Z.jpg",
//                "Bill's fave book",
//                "The Secret History is the first novel by the American author, Donna Tartt, published by Alfred A. Knopf in September, 1992. Set in New England, the novel tells the story of a closely knit group of six classics students at Hampden College, a small, elite Liberal Arts college located in Vermont based upon Bennington College, where Tartt was a student between 1982 and 1986.");

        Intent intent = getIntent();
        if (null != intent) {
            int bookId = intent.getIntExtra(BOOK_ID_KEY, -1);
            if (bookId != -1) {
                Book incomingBook = Utils.getInstance().getBookById(bookId);
                if (null != incomingBook) {
                    setData(incomingBook);
                }
            }
        }
    }

    private void setData(Book book) {
        txtBookName.setText(book.getName());
        txtAuthor.setText(book.getAuthor());
        txtNumPages.setText(String.valueOf(book.getPageCount()));
        txtLongDescription.setText(book.getLongDesc());
        Glide.with(this)
                .asBitmap().load(book.getImageURL())
                .into(bookImage);
    }

    private void initViews() {
        txtBookName = findViewById(R.id.txtBookName);
        txtAuthor = findViewById(R.id.txtAuthor);
        txtNumPages = findViewById(R.id.txtNumPages);
        txtShortDescription = findViewById(R.id.txtShortDescription);
        txtLongDescription = findViewById(R.id.txtLongDescription);
        btnAddToCurrentlyReading = findViewById(R.id.btnAddToCurrentlyReading);
        btnWantToRead = findViewById(R.id.btnWantToRead);
        btnAlreadyRead = findViewById(R.id.btnAlreadyRead);
        btnAddToFavourites = findViewById(R.id.btnAddToFavourites);
        bookImage = findViewById(R.id.bookImage);

    }
}