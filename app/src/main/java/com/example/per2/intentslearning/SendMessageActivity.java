package com.example.per2.intentslearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {
    private EditText editTextMessage;
    private Button sendMessage;
    public static final String XTRA_SEND_MESSAGE = "the message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        wireWidgets();

        sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gettext from edittext
                String message = editTextMessage.getText().toString();
                //create intent
                //arguements are where you are coming from(this)
                //and where you are going (Target Activity)
                Intent intentSendMessage = new Intent(SendMessageActivity.this, ReceiveButtonActivity.class);
                //package the text into the intent
                intentSendMessage.putExtra(XTRA_SEND_MESSAGE, message);
                //start the new activity
                startActivity(intentSendMessage);
            }
        });
    }

    private void wireWidgets() {
        editTextMessage = findViewById(R.id.edittext_sendmessage_msg);
        sendMessage = findViewById(R.id.button_sendmessage_send);
    }
}
