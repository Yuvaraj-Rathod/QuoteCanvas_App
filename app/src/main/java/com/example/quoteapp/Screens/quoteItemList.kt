package com.example.quoteapp.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quoteapp.models.Quote


@Composable
 fun QuoteListItem (quote : Quote,onClick : () -> Unit) {
Card(elevation = CardDefaults.cardElevation(4.dp),
    modifier = Modifier.clickable { onClick() }
        .padding(16.dp,10.dp))
{
         Row (modifier = Modifier.padding(10.dp)){
             
          Image(imageVector = Icons.Filled.FormatQuote, contentDescription = "Quote",
                modifier = Modifier
                    .size(45.dp)
                    .clip(RoundedCornerShape(10))
                    .rotate(180f),
              alignment = Alignment.TopStart,
              colorFilter = ColorFilter.tint(Color.Black))

             Spacer(modifier = Modifier.width(8.dp))

             Column(modifier = Modifier.weight(1f)) {
                 Text(text = quote.text,
                    style = MaterialTheme.typography.bodyLarge,
                     modifier = Modifier.padding(8.dp,0.dp,0.dp)
                 )
               Box(modifier = Modifier
                   .fillMaxWidth(0.4f)
                   .height(1.dp)
                   .background(Color(0xFFEEEEEE))){
               }

                 Text(text =quote.author, Modifier.padding(8.dp, 4.dp, 0.dp, 0.dp),
                     style = MaterialTheme.typography.bodySmall)
             }
         }
   }
}

@Preview
@Composable
private fun PreviewList() {
    QuoteListItem(quote = Quote("im yuvaraj from Bvb and now atm im cheking the the nothing sry good night","Yuvaraj")) {
        
    }
}