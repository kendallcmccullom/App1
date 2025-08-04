package com.example.kendallproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt = (TextView) findViewById(R.id.txt);
        parseXML();
    }

    private void parseXML(){
        XmlPullParserFactory parserfactory;
        try {
            parserfactory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserfactory.newPullParser();
            InputStream is = getAssets().open("subjects.xml");
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES,false);
            parser.setInput(is, null);
            processParsing(parser);
        }catch (XmlPullParserException e){
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    private void processParsing(XmlPullParser parser) throws IOException, XmlPullParserException{
        ArrayList<looping> subjects = new ArrayList<>();
        int eventType = parser.getEventType();
        looping current = null;
        while (eventType != XmlPullParser.END_DOCUMENT){
            String eltName = null;
            switch(eventType){
                case XmlPullParser.START_DOCUMENT:
                        eltName = parser.getName();

                        if ("subject".equals(eltName)){
                            current = new looping();
                            subjects.add(current);

                        } else if (current != null) {
                            if ("subject".equals(eltName)) {
                                current.subject = parser.nextText();
                            }
                        }
                        break;
            }
            eventType = parser.next();
        }
        printSubjects(subjects);
    }

    private void printSubjects(ArrayList<looping> subjects){
        StringBuilder builder = new StringBuilder();
        for (looping subject: subjects){
            builder.append(subject.subject).append("\n");
        }
        txt.setText(builder.toString());
    }

}