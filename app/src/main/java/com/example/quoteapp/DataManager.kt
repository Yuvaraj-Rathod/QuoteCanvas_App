package com.example.quoteapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.quoteapp.models.Quote
import com.google.gson.Gson

object DataManager{
    var data = emptyArray<Quote>()
    var currentQuote : Quote? = null
    var currentPage = mutableStateOf(pages.Listing)
    var isDataLoaded = mutableStateOf(false)

    fun LoadAssetFromFile(context: Context){

        val inputStream = context.assets.open("quotes.json")
        val size : Int = inputStream.available()
        val buffer =  ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json,Array<Quote>::class.java)
        isDataLoaded.value = true
    }
    fun switchPages(quote: Quote?){
        if(currentPage.value == pages.Listing){
            currentQuote =  quote
            currentPage.value = pages.Detail
        }else{
            currentPage.value = pages.Listing
        }
    }
}

