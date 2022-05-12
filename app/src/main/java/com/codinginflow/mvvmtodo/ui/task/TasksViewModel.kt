package com.codinginflow.mvvmtodo.ui.task

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.codinginflow.mvvmtodo.data.TaskDao

class TasksViewModel @ViewModelInject constructor(
    private val taskDao : TaskDao
) : ViewModel() {

    val tasks = taskDao.getTasks().asLiveData()
}