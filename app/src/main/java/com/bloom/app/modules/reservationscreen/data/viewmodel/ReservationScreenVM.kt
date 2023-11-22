package com.bloom.app.modules.reservationscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bloom.app.modules.reservationscreen.`data`.model.ReservationScreenModel
import org.koin.core.KoinComponent

class ReservationScreenVM : ViewModel(), KoinComponent {
  val reservationScreenModel: MutableLiveData<ReservationScreenModel> =
      MutableLiveData(ReservationScreenModel())

  var navArguments: Bundle? = null
}
