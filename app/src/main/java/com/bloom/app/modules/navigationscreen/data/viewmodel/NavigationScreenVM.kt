package com.bloom.app.modules.navigationscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bloom.app.modules.navigationscreen.`data`.model.NavigationScreenModel
import org.koin.core.KoinComponent

class NavigationScreenVM : ViewModel(), KoinComponent {
  val navigationScreenModel: MutableLiveData<NavigationScreenModel> =
      MutableLiveData(NavigationScreenModel())

  var navArguments: Bundle? = null
}
