package com.example.quoteapp.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quoteapp.models.Quote
import androidx.compose.ui.Modifier


@Composable
fun QuoteList(data : Array<Quote>,onClick : () -> Unit){
    LazyColumn( modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp), content =  {
     items(data){
         QuoteListItem(quote = it) {
             onClick()
         }
     }
    })
}

//@Preview
//@Composable
//private fun prevListofQuotes() {
//var data1: Array<Quote> = arrayOf(Quote("The only limit to our realization of tomorrow is our doubts of today.","Yuvaraj"),
//    Quote("The only limit to our realization of tomorrow is our doubts of today.","Yuvaraj"),
//    Quote("The only limit to our realization of tomorrow is our doubts of today.","Yuvaraj"),
//    Quote("The only limit to our realization of tomorrow is our doubts of today.","Yuvaraj"),
//    Quote("The only limit to our realization of tomorrow is our doubts of today.","Yuvaraj"),
//    Quote("The only limit to our realization of tomorrow is our doubts of today.","Yuvaraj"),
//    Quote("The only limit to our realization of tomorrow is our doubts of today.","Yuvaraj"))
//    QuoteList(data = data1 ) {
//
//    }
//}