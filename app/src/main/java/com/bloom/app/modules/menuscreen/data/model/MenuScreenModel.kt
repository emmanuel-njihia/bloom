package com.bloom.app.modules.menuscreen.`data`.model

import com.bloom.app.R
import com.bloom.app.appcomponents.di.MyApp
import kotlin.String

data class MenuScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBusinessWheel: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_businesswheel)
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
  var txtSdf: String? = MyApp.getInstance().resources.getString(R.string.lbl_work_schedule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogOut: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNextmeeting: String? = MyApp.getInstance().resources.getString(R.string.msg_next_meeting_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJohnDoe: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)

)
