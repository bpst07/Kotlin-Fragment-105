package com.arrow.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnFragmentInteractionListener {

    private var blankFragment: BlankFragment = BlankFragment()
    private val blankFragmentTag: String = "Blank Fragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add "BlankFragment" to container (Main Activity)
        // provide tag name to handle configuration changes
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container, blankFragment, blankFragmentTag)
                    .commit()
        }
    }

    // interface method implementation
    override fun onFragmentInteractionListener(someText: String) {
        // update message on MainActivity text view
        textViewMainActivity.text = someText
    }
}