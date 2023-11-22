package com.bloom.app.modules.daycalender.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bloom.app.modules.daycalender.`data`.model.DayCalenderModel
import org.koin.core.KoinComponent

class DayCalenderVM : ViewModel(), KoinComponent {
  val dayCalenderModel: MutableLiveData<DayCalenderModel> = MutableLiveData(DayCalenderModel())

  var navArguments: Bundle? = null
}
