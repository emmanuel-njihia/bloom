package com.bloom.app.modules.takepicture.`data`.model

import com.bloom.app.R
import com.bloom.app.appcomponents.di.MyApp
import kotlin.String

data class TakePictureModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoodluckwith: String? =
      MyApp.getInstance().resources.getString(R.string.msg_good_luck_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTakeaclearph: String? =
      MyApp.getInstance().resources.getString(R.string.msg_take_a_clear_ph)

)
