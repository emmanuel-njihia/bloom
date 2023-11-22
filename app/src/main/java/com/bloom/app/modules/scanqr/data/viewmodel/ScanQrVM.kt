package com.bloom.app.modules.scanqr.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bloom.app.modules.scanqr.`data`.model.ScanQrModel
import org.koin.core.KoinComponent

class ScanQrVM : ViewModel(), KoinComponent {
  val scanQrModel: MutableLiveData<ScanQrModel> = MutableLiveData(ScanQrModel())

  var navArguments: Bundle? = null
}
