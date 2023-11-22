package com.bloom.app.modules.menuscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bloom.app.R
import com.bloom.app.appcomponents.base.BaseActivity
import com.bloom.app.databinding.ActivityMenuScreenBinding
import com.bloom.app.modules.filterscreen.ui.FilterScreenActivity
import com.bloom.app.modules.menuscreen.`data`.viewmodel.MenuScreenVM
import kotlin.String
import kotlin.Unit

class MenuScreenActivity : BaseActivity<ActivityMenuScreenBinding>(R.layout.activity_menu_screen) {
  private val viewModel: MenuScreenVM by viewModels<MenuScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearBarMenu.setOnClickListener {
      val destIntent = FilterScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MENU_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
