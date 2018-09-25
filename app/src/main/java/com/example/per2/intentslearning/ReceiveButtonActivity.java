package com.example.per2.intentslearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveButtonActivity extends AppCompatActivity {
    private TextView textViewDisplayMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_button);

        wireWidgets();
    }

    private void wireWidgets() {
        textViewDisplayMessage = findViewById(R.id.textview_receivemessage_displaymessage);
        textViewDisplayMessage.setText(getIntent().getStringExtra(SendMessageActivity.XTRA_SEND_MESSAGE));
    }
}
