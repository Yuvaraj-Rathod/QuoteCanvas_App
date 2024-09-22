package com.example.quoteapp.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quoteapp.models.Quote

@Composable
fun QuoteListScreen(data : Array<Quote>, onClick : () -> Unit) {

    Column() {
  Text(text = "Quotes App",
      textAlign = TextAlign.Center,
      style = MaterialTheme.typography.headlineSmall, // Larger title
      modifier = Modifier
          .fillMaxWidth()
          .padding(vertical = 16.dp)
  )
      QuoteList(data = data) {
          onClick
      }
    }
}