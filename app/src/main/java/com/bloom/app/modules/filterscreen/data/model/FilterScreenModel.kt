package com.bloom.app.modules.filterscreen.`data`.model

import com.bloom.app.R
import com.bloom.app.appcomponents.di.MyApp
import kotlin.String

data class FilterScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBusinessWheel: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_businesswheel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBusinessWheelOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_businesswheel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBatteryLevel: String? = MyApp.getInstance().resources.getString(R.string.lbl_battery_level)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_35)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScooterDistanc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scooter_distanc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_0m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_750m)

)
