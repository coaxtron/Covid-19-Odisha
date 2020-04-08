package com.technogenr.ocovid;

import android.app.ProgressDialog;
import android.net.Uri;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;

import java.util.Calendar;

public class SendDetailsActivity extends AppCompatActivity {
    TextView docsetname,docsetexp,davll,dprices;
    ImageView image;

    int day,month,year,hour,min;
    EditText editdate;

    String dmy,ymd,mh,davl,dprice;
    Calendar c;
    // Folder path for Firebase Storage.
    String Storage_Path = "All_Nurse/";



    // Creating EditText.
    EditText ImageName,name,number,date,discription,address ;

    // Creating ImageView.

    // Creating URI.
    Uri FilePathUri;

    // Creating StorageReference and DatabaseReference object.
    StorageReference storageReference;
     private DatabaseReference databaseReference;
    DatabaseReference ref;
WebView webView;
    // Image request code for onActivityResult() .
    int Image_Request_Code = 7;

    ProgressDialog progressDialog ;

    //    ListView listOfMessages;
    String str,n,w;
    String urlimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_details);






         webView = (WebView) findViewById(R.id.web);
                 webView.setWebViewClient(new WebViewClient());
                 webView.loadUrl("https://covid19.odisha.gov.in/registration");

                 WebSettings webSettings = webView.getSettings();
                 webSettings.setJavaScriptEnabled(true);
                 }

@Override
public void onBackPressed() {
        if (webView.canGoBack()) {
        webView.goBack();
        } else {
        super.onBackPressed();
        }
        }
        }