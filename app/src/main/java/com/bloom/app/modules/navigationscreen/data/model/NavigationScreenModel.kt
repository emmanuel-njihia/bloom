package com.bloom.app.modules.navigationscreen.`data`.model

import com.bloom.app.R
import com.bloom.app.appcomponents.di.MyApp
import kotlin.String

data class NavigationScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBusinessWheel: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_businesswheel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReservationSta: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reservation_sta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurement: String? = MyApp.getInstance().resources.getString(R.string.lbl_sur4y1l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_01_10m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt050dk: String? = MyApp.getInstance().resources.getString(R.string.msg_you_re_going_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_stop_reservatio)
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
      MyApp.getInstance().resources.getString(R.string.msg_scooter_distanc2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_0m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_750m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShow197Scoote: String? =
      MyApp.getInstance().resources.getString(R.string.msg_show_197_scoote)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRidingHistory: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_riding_history)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSavedCards: String? = MyApp.getInstance().resources.getString(R.string.lbl_saved_cards)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogOut: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_150_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtErenYlmaz: String? = MyApp.getInstance().resources.getString(R.string.lbl_eren_y_lmaz)

)
