package org.stockfolio.presentation.infoinput.view

import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import org.stockfolio.R
import org.stockfolio.databinding.ActivityInfoInputBinding
import org.stockfolio.util.binding.BindingActivity

@AndroidEntryPoint
class InfoInputActivity : BindingActivity<ActivityInfoInputBinding>(R.layout.activity_info_input) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_input)
    }
}