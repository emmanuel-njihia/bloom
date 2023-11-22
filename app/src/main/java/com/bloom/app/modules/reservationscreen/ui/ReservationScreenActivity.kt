package com.bloom.app.modules.reservationscreen.ui

import androidx.activity.viewModels
import com.bloom.app.R
import com.bloom.app.appcomponents.base.BaseActivity
import com.bloom.app.databinding.ActivityReservationScreenBinding
import com.bloom.app.modules.navigationscreen.ui.NavigationScreenActivity
import com.bloom.app.modules.reservationscreen.`data`.viewmodel.ReservationScreenVM
import kotlin.String
import kotlin.Unit

class ReservationScreenActivity :
    BaseActivity<ActivityReservationScreenBinding>(R.layout.activity_reservation_screen) {
  private val viewModel: ReservationScreenVM by viewModels<ReservationScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.reservationScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectangle385.setOnClickListener {
      val destIntent = NavigationScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RESERVATION_SCREEN_ACTIVITY"

  }
}
