package com.bloom.app.modules.filterscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bloom.app.R
import com.bloom.app.appcomponents.base.BaseActivity
import com.bloom.app.databinding.ActivityFilterScreenBinding
import com.bloom.app.modules.calenderintegration.ui.CalenderIntegrationActivity
import com.bloom.app.modules.filterscreen.`data`.viewmodel.FilterScreenVM
import kotlin.String
import kotlin.Unit

class FilterScreenActivity :
    BaseActivity<ActivityFilterScreenBinding>(R.layout.activity_filter_screen) {
  private val viewModel: FilterScreenVM by viewModels<FilterScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filterScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearBarFilter.setOnClickListener {
      val destIntent = CalenderIntegrationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FILTER_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FilterScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
