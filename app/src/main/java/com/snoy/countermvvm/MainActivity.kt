package com.snoy.countermvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.snoy.countermvvm.counter.CounterScreen
import com.snoy.countermvvm.counter.CounterViewModel
import com.snoy.countermvvm.ui.theme.CounterMVVMTheme

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<CounterViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterMVVMTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    CounterActivityScreen(viewModel)
                }
            }
        }
    }
}

@Composable
fun CounterActivityScreen(viewModel: CounterViewModel) {
    CounterScreen(
        counterValue = viewModel.counterValue,
        onIncrementTap = { viewModel.incrementCount() }
    )
}