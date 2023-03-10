package com.ar.graphiccomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    var inputText: EditText?=null
    var radioBtn1: RadioButton?=null
    var radioBtn2: RadioButton?=null
    var checkBtn1: CheckBox?=null
    var checkBtn2: CheckBox?=null
    var toggleBtn: ToggleButton?=null
    var switch: Switch?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputText=findViewById(R.id.editText)
        radioBtn1=findViewById(R.id.radioButton1)
        radioBtn2=findViewById(R.id.radioButton2)
        checkBtn1=findViewById(R.id.checkBox1)
        checkBtn2=findViewById(R.id.checkBox2)
        toggleBtn=findViewById(R.id.toggleButton)
        switch=findViewById(R.id.switch1)


        var botoValidator: Button =findViewById(R.id.button)
        botoValidator.setOnClickListener{validator()}

        var imgBtn: ImageButton =findViewById(R.id.imageButton)
        imgBtn.setOnClickListener{validatorImageBtn()}

    }

    private fun validatorImageBtn () {
        Toast.makeText(this, "Image Button", Toast.LENGTH_LONG).show()
    }

    private fun validator() {

        var cad:String="Selecionado: \n"

        val campoTexto:EditText=findViewById(R.id.editText)
        var nombre:String=campoTexto.text.toString()

        if (radioBtn1?.isChecked == true) {
            cad+= "Radio 1 \n"
        } else if (radioBtn2?.isChecked == true) {
            cad+= "Radio 2 \n"
        } else {
            cad+= "Ninguno \n"
        }

        if (checkBtn1?.isChecked == false && checkBtn2?.isChecked == false) {
            cad+= "Ningun check"
        } else {
            if (checkBtn1?.isChecked == true) {
                cad+= "Check 1 \n"
            }

            if (checkBtn2?.isChecked == true){
                cad+= "Check 2 \n"
            }
        }

        if (toggleBtn?.isChecked == true) {
            cad+= "Toggle ON \n"
        }  else if (toggleBtn?.isChecked == false) {
            cad+= "Toogle \n"
        }

        if (switch?.isChecked == true) {
            cad+= "Switch ON \n"
        } else if (switch?.isChecked == false) {
            cad+= "Switch OFF \n"
        }



        Toast.makeText(this, "$cad \n $nombre", Toast.LENGTH_LONG).show()
    }
}