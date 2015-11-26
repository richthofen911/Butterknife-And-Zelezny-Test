package net.callofdroidy.uiviewautobindtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * This is a test for using ButterKnife and ButterKnife Zelezny(a plugin to automate ButterKnife)
 * step 1: add ButterKnife into dependencies in gradle: [compile 'com.jakewharton:butterknife:7.0.1']
 * step 2: install ButterKnife Zelezny through Settings--plugins--browse repository--search for [ButterKnife Zelezny] & restart Android Studio
 * step 3: right click the layout file name in the method setContentView()--generate--generate Butterknife injections
 *
 * reference: http://www.tuicool.com/articles/Q3mmay
 *
 * notes: (1) view variable(such as tvTest) cannot be declared as private when using ButterKnife
 */

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.tv_test)
    TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
