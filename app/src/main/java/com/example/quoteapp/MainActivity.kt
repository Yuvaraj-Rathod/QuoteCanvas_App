package com.example.quoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.quoteapp.Screens.QuoteListScreen
import com.example.quoteapp.ui.theme.QuoteAppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        CoroutineScope(Dispatchers.IO).launch{
            DataManager.LoadAssetFromFile(applicationContext)
        }
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
      Box(
          contentAlignment = Alignment.Center,
          modifier = Modifier.fillMaxSize(1f)
      ) {
        Text(text = "Loading...",
            style = MaterialTheme.typography.headlineSmall)
      }
  }
}
