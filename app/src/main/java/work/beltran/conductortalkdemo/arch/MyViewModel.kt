package work.beltran.conductortalkdemo.arch

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import java.util.*

class MyViewModel : ViewModel() {

    private val liveData = MutableLiveData<String>()

    init {
        liveData.value = Date().toString()
    }

    fun getTime(): LiveData<String> = liveData
}