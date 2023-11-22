package com.bloom.app.modules.filterscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bloom.app.modules.filterscreen.`data`.model.FilterScreenModel
import org.koin.core.KoinComponent

class FilterScreenVM : ViewModel(), KoinComponent {
  val filterScreenModel: MutableLiveData<FilterScreenModel> = MutableLiveData(FilterScreenModel())

  var navArguments: Bundle? = null
}
