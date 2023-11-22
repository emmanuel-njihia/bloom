package com.bloom.app.modules.menuscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bloom.app.modules.menuscreen.`data`.model.MenuScreenModel
import org.koin.core.KoinComponent

class MenuScreenVM : ViewModel(), KoinComponent {
  val menuScreenModel: MutableLiveData<MenuScreenModel> = MutableLiveData(MenuScreenModel())

  var navArguments: Bundle? = null
}
