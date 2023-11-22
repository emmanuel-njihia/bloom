package com.bloom.app.modules.navigationscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bloom.app.R
import com.bloom.app.appcomponents.base.BaseActivity
import com.bloom.app.databinding.ActivityNavigationScreenBinding
import com.bloom.app.modules.navigationscreen.`data`.viewmodel.NavigationScreenVM
import com.bloom.app.modules.scanqr.ui.ScanQrActivity
import kotlin.String
import kotlin.Unit

class NavigationScreenActivity :
    BaseActivity<ActivityNavigationScreenBinding>(R.layout.activity_navigation_screen) {
  private val viewModel: NavigationScreenVM by viewModels<NavigationScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.navigationScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectangle385.setOnClickListener {
      val destIntent = ScanQrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NAVIGATION_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NavigationScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
