package com.bloom.app.modules.ridingstarted.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bloom.app.modules.ridingstarted.`data`.model.RidingStartedModel
import org.koin.core.KoinComponent

class RidingStartedVM : ViewModel(), KoinComponent {
  val ridingStartedModel: MutableLiveData<RidingStartedModel> =
      MutableLiveData(RidingStartedModel())

  var navArguments: Bundle? = null
}
