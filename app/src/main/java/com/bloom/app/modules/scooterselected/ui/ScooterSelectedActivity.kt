package com.bloom.app.modules.scooterselected.ui

import androidx.activity.viewModels
import com.bloom.app.R
import com.bloom.app.appcomponents.base.BaseActivity
import com.bloom.app.databinding.ActivityScooterSelectedBinding
import com.bloom.app.modules.scooterselected.`data`.viewmodel.ScooterSelectedVM
import kotlin.String
import kotlin.Unit

class ScooterSelectedActivity :
    BaseActivity<ActivityScooterSelectedBinding>(R.layout.activity_scooter_selected) {
  private val viewModel: ScooterSelectedVM by viewModels<ScooterSelectedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooterSelectedVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SCOOTER_SELECTED_ACTIVITY"

  }
}
