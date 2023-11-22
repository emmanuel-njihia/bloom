package com.bloom.app.modules.calenderintegration.`data`.model

import com.bloom.app.R
import com.bloom.app.appcomponents.di.MyApp
import kotlin.String

data class CalenderIntegrationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBusinessWheel: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_businesswheel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLeaveaComment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_connect_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJulyCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_july_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtS: String? = MyApp.getInstance().resources.getString(R.string.lbl_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtM: String? = MyApp.getInstance().resources.getString(R.string.lbl_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtT: String? = MyApp.getInstance().resources.getString(R.string.lbl_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtW: String? = MyApp.getInstance().resources.getString(R.string.lbl_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtF: String? = MyApp.getInstance().resources.getString(R.string.lbl_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurement: String? = MyApp.getInstance().resources.getString(R.string.lbl_sur4y1l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_today_18_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_750_meters)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_1_00_0_50_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeventyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_75)

)
