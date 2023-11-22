package com.bloom.app.modules.scanqr.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.bloom.app.R
import com.bloom.app.appcomponents.base.BaseActivity
import com.bloom.app.databinding.ActivityScanQrBinding
import com.bloom.app.modules.ridingstarted.ui.RidingStartedActivity
import com.bloom.app.modules.scanqr.`data`.viewmodel.ScanQrVM
import kotlin.String
import kotlin.Unit

class ScanQrActivity : BaseActivity<ActivityScanQrBinding>(R.layout.activity_scan_qr) {
  private val viewModel: ScanQrVM by viewModels<ScanQrVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQrVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameQRCode.setOnClickListener {
      val destIntent = RidingStartedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCAN_QR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQrActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
