package com.bloom.app.modules.ridingstarted.`data`.model

import com.bloom.app.R
import com.bloom.app.appcomponents.di.MyApp
import kotlin.String

data class RidingStartedModel(
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
  var txt0110dk: String? = MyApp.getInstance().resources.getString(R.string.lbl_01_10dk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_50_dk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_stop_reservatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRidingStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_ride_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurementOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sur4y1l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_750_meters2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_01_10m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt050dk: String? = MyApp.getInstance().resources.getString(R.string.lbl_you_re_on_time)

)
