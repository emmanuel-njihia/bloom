package com.bloom.app.modules.scooterselected.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bloom.app.modules.scooterselected.`data`.model.ScooterSelectedModel
import org.koin.core.KoinComponent

class ScooterSelectedVM : ViewModel(), KoinComponent {
  val scooterSelectedModel: MutableLiveData<ScooterSelectedModel> =
      MutableLiveData(ScooterSelectedModel())

  var navArguments: Bundle? = null
}
