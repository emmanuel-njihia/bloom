package com.bloom.app.modules.scooterselected.`data`.model

import com.bloom.app.R
import com.bloom.app.appcomponents.di.MyApp
import kotlin.String

data class ScooterSelectedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBusinessWheel: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_businesswheel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurement: String? = MyApp.getInstance().resources.getString(R.string.lbl_sur4y1l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_next_meeting_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_750_meters_ride)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_02_00m_ride)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeventyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_75)

)
