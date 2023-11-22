package com.bloom.app.modules.calenderintegration.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bloom.app.modules.calenderintegration.`data`.model.CalenderIntegrationModel
import com.bloom.app.modules.calenderintegration.`data`.model.Listday01variRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CalenderIntegrationVM : ViewModel(), KoinComponent {
  val calenderIntegrationModel: MutableLiveData<CalenderIntegrationModel> =
      MutableLiveData(CalenderIntegrationModel())

  var navArguments: Bundle? = null

  val listday01variList: MutableLiveData<MutableList<Listday01variRowModel>> =
      MutableLiveData(mutableListOf())
}
