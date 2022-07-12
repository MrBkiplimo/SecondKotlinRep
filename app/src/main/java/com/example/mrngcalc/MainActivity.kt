package com.example.mrngcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
//    instanciate
    var myAnswer:TextView ?= null
    var myFnum:EditText ?= null
    var mySnum:EditText ?= null
    var buttonAdd:Button ?= null
    var buttonSubtract:Button ?= null
    var buttonDivide:Button ?= null
    var buttonMultiply:Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myAnswer=findViewById(R.id.mTVanswer)
        myFnum=findViewById(R.id.mEDTFnum)
        mySnum=findViewById(R.id.medtSnum)
        buttonAdd=findViewById(R.id.mBtnAdd)
        buttonSubtract=findViewById(R.id.mBtnSubstract)
        buttonDivide=findViewById(R.id.mBtnDivide)
        buttonMultiply=findViewById(R.id.mBtnMultiply)

//               set on click listener
        //            .....................................................
        buttonAdd!!.setOnClickListener {
//            btw lines 34 to 51 is copied and pasted on every button then the signs changed
                                    //               receive the two numbers
                                                var firstnumber=myFnum!!.text.toString().trim()
                                                var secondnumber=mySnum!!.text.toString().trim()
                                    //               check if the user is submitting empty fields
                                                if (firstnumber.isEmpty()){
                                    //               set error to the first number
                                                    myFnum!!.setError("Please fill this input")
                                                    myFnum!!.requestFocus()
                                                }else if(firstnumber.isEmpty()){
                                    //               set error to the first number
                                                    mySnum!!.setError("Please fill this input")
                                                    mySnum!!.requestFocus()
                                                }else{
                                    //               finally add the two numbers
                                                    var answer=firstnumber.toDouble()+secondnumber.toDouble()
                                    //                display the results on the text view my answer
                                                    myAnswer!!.text = answer.toString()
                                                }
        }
        //            .....................................................
        buttonSubtract!!.setOnClickListener {
            //               receive the two numbers
            var firstnumber=myFnum!!.text.toString().trim()
            var secondnumber=mySnum!!.text.toString().trim()
//               check if the user is submitting empty fields
            if (firstnumber.isEmpty()){
//               set error to the first number
                myFnum!!.setError("Please fill this input")
                myFnum!!.requestFocus()
            }else if(firstnumber.isEmpty()){
//               set error to the first number
                mySnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()
            }else{
//               finally add the two numbers
                var answer=firstnumber.toDouble()-secondnumber.toDouble()
//                display the results on the text view my answer
                myAnswer!!.text = answer.toString()
            }
        }
        //            .....................................................
        buttonDivide!!.setOnClickListener {
            //               receive the two numbers
            var firstnumber=myFnum!!.text.toString().trim()
            var secondnumber=mySnum!!.text.toString().trim()
//               check if the user is submitting empty fields
            if (firstnumber.isEmpty()){
//               set error to the first number
                myFnum!!.setError("Please fill this input")
                myFnum!!.requestFocus()
            }else if(firstnumber.isEmpty()){
//               set error to the first number
                mySnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()
            }else{
//               finally add the two numbers
                var answer=firstnumber.toDouble()/secondnumber.toDouble()
//                display the results on the text view my answer
                myAnswer!!.text = answer.toString()
            }
        }
        //            .....................................................
        buttonMultiply!!.setOnClickListener {
            //               receive the two numbers
            var firstnumber=myFnum!!.text.toString().trim()
            var secondnumber=mySnum!!.text.toString().trim()
//               check if the user is submitting empty fields
            if (firstnumber.isEmpty()){
//               set error to the first number
                myFnum!!.setError("Please fill this input")
                myFnum!!.requestFocus()
            }else if(firstnumber.isEmpty()){
//               set error to the first number
                mySnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()
            }else{
//               finally add the two numbers
                var answer=firstnumber.toDouble()*secondnumber.toDouble()
//                display the results on the text view my answer
                myAnswer!!.text = answer.toString()
            }
        }
        //            .....................................................
    }
}