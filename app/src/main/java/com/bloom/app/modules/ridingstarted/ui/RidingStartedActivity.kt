package com.bloom.app.modules.ridingstarted.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bloom.app.R
import com.bloom.app.appcomponents.base.BaseActivity
import com.bloom.app.databinding.ActivityRidingStartedBinding
import com.bloom.app.modules.ridingstarted.`data`.viewmodel.RidingStartedVM
import com.bloom.app.modules.takepicture.ui.TakePictureActivity
import kotlin.String
import kotlin.Unit

class RidingStartedActivity :
    BaseActivity<ActivityRidingStartedBinding>(R.layout.activity_riding_started) {
  private val viewModel: RidingStartedVM by viewModels<RidingStartedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ridingStartedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectangle385.setOnClickListener {
      val destIntent = TakePictureActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RIDING_STARTED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RidingStartedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
