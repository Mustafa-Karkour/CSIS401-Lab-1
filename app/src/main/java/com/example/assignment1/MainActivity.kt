package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }





    fun orderClicked(v:View){

        if(etNoOfPrints.text.toString().isEmpty()){
            etNoOfPrints.setError("Please enter the number of prints")
        }else{

            var noOfPrints:Int = etNoOfPrints.text.toString().toInt()

            var selectedOption:Int = rgMenu.checkedRadioButtonId
            var price:Double = 0.0

            when(selectedOption){


                rb19c.id -> price=0.19
                rb49c.id ->  price=0.49
                rb79c.id ->  price=0.79
                else -> {
                    Toast.makeText(this, "Please select an option", Toast.LENGTH_LONG).show()

                }

            }
            //a radio button is selected
            if(selectedOption != -1){

                tvResult.text = "The order cost is $ ${price*noOfPrints}"

            }






        }
    }


}