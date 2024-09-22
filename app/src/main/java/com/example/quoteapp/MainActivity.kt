package com.example.quoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.quoteapp.Screens.QuoteListScreen
import com.example.quoteapp.ui.theme.QuoteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        DataManager.LoadAssetFromFile(applicationContext)
        setContent {
            Surface(modifier = Modifier.fillMaxSize()) {
                App()
            }
        }
    }
}

@Composable
fun App() {
  if(DataManager.isDataLoaded){
      QuoteListScreen(data = DataManager.data) {
          
      }
  }else{
      CircularProgressIndicator()
  }
}