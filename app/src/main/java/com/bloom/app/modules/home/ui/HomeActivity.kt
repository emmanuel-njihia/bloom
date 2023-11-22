package com.bloom.app.modules.home.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.bloom.app.R
import com.bloom.app.appcomponents.base.BaseActivity
import com.bloom.app.databinding.ActivityHomeBinding
import com.bloom.app.modules.home.`data`.viewmodel.HomeVM
import com.bloom.app.modules.menuscreen.ui.MenuScreenActivity
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = MenuScreenActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imageMap.setOnClickListener {
        val destIntent = MenuScreenActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "HOME_ACTIVITY"

    }
  }
