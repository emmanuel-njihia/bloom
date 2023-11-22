package com.bloom.app.modules.takepicture.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bloom.app.modules.takepicture.`data`.model.TakePictureModel
import org.koin.core.KoinComponent

class TakePictureVM : ViewModel(), KoinComponent {
  val takePictureModel: MutableLiveData<TakePictureModel> = MutableLiveData(TakePictureModel())

  var navArguments: Bundle? = null
}
