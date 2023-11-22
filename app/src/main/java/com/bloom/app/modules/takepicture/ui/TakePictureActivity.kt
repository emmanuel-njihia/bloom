package com.bloom.app.modules.takepicture.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bloom.app.R
import com.bloom.app.appcomponents.base.BaseActivity
import com.bloom.app.databinding.ActivityTakePictureBinding
import com.bloom.app.modules.takepicture.`data`.viewmodel.TakePictureVM
import kotlin.String
import kotlin.Unit

class TakePictureActivity : BaseActivity<ActivityTakePictureBinding>(R.layout.activity_take_picture)
    {
  private val viewModel: TakePictureVM by viewModels<TakePictureVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.takePictureVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TAKE_PICTURE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TakePictureActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
