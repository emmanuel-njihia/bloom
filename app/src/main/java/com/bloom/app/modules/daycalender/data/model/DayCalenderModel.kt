package com.bloom.app.modules.daycalender.`data`.model

import com.bloom.app.R
import com.bloom.app.appcomponents.di.MyApp
import kotlin.String

data class DayCalenderModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBusinessWheel: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_businesswheel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJuly2023: String? = MyApp.getInstance().resources.getString(R.string.lbl_july_20232)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_to_do)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_finish_concept)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSchedule: String? = MyApp.getInstance().resources.getString(R.string.lbl_schedule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1000devmeeti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_10_00_dev_meeti)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1200scrumwit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_12_00_scrum_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1500publishp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_15_00_publish_p)
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
