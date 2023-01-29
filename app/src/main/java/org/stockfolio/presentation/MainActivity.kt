package org.stockfolio.presentation

import dagger.hilt.android.AndroidEntryPoint
import org.stockfolio.R
import org.stockfolio.databinding.ActivityMainBinding
import org.stockfolio.util.binding.BindingActivity

@AndroidEntryPoint
class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main)