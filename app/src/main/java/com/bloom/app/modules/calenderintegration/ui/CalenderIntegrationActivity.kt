package com.bloom.app.modules.calenderintegration.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.bloom.app.R
import com.bloom.app.appcomponents.base.BaseActivity
import com.bloom.app.databinding.ActivityCalenderIntegrationBinding
import com.bloom.app.modules.calenderintegration.`data`.model.Listday01variRowModel
import com.bloom.app.modules.calenderintegration.`data`.viewmodel.CalenderIntegrationVM
import com.bloom.app.modules.daycalender.ui.DayCalenderActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CalenderIntegrationActivity :
    BaseActivity<ActivityCalenderIntegrationBinding>(R.layout.activity_calender_integration) {
  private val viewModel: CalenderIntegrationVM by viewModels<CalenderIntegrationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listday01variAdapter =
    Listday01variAdapter(viewModel.listday01variList.value?:mutableListOf())
    binding.recyclerListday01vari.adapter = listday01variAdapter
    listday01variAdapter.setOnItemClickListener(
    object : Listday01variAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listday01variRowModel) {
        onClickRecyclerListday01vari(view, position, item)
      }
    }
    )
    viewModel.listday01variList.observe(this) {
      listday01variAdapter.updateData(it)
    }
    binding.calenderIntegrationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearCalendarMon.setOnClickListener {
      val destIntent = DayCalenderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListday01vari(
    view: View,
    position: Int,
    item: Listday01variRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CALENDER_INTEGRATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CalenderIntegrationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
