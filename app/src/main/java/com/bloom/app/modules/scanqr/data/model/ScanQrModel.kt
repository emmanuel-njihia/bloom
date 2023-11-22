package com.bloom.app.modules.scanqr.`data`.model

import com.bloom.app.R
import com.bloom.app.appcomponents.di.MyApp
import kotlin.String

data class ScanQrModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConnectscooter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_connect_scooter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStartdrivingb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_start_driving_b)

)
