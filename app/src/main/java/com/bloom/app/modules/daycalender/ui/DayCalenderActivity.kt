package com.bloom.app.modules.daycalender.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bloom.app.R
import com.bloom.app.appcomponents.base.BaseActivity
import com.bloom.app.databinding.ActivityDayCalenderBinding
import com.bloom.app.modules.daycalender.`data`.viewmodel.DayCalenderVM
import kotlin.String
import kotlin.Unit

class DayCalenderActivity : BaseActivity<ActivityDayCalenderBinding>(R.layout.activity_day_calender)
    {
  private val viewModel: DayCalenderVM by viewModels<DayCalenderVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dayCalenderVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DAY_CALENDER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DayCalenderActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
