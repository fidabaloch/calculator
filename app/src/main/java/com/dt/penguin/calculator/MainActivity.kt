package com.dt.penguin.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun NumClickEvent (view: View){
        var displayScreen : String = etDisplay.text.toString()
        var btnPressed: Button = view as Button
        when(btnPressed){
            btn0-> {
                displayScreen+="0"
            }
            btn1-> {
                displayScreen+="1"
            }
            btn2-> {
                displayScreen+="2"
            }
            btn3-> {
                displayScreen+="3"
            }
            btn4-> {
                displayScreen+="4"
            }
            btn5-> {
                displayScreen+="5"
            }
            btn6-> {
                displayScreen+="6"
            }
            btn7-> {
                displayScreen+="7"
            }
            btn8-> {
                displayScreen+="8"
            }
            btn9-> {
                displayScreen+="9"
            }
            btnDot-> {
                //TODO dot shall be pressed once
                displayScreen+="."
            }
            btnPlusMinus-> {
                displayScreen="-"+displayScreen
            }
        }
        etDisplay.setText(displayScreen)
    }
}
