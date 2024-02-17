package com.acediat.worktimer.base

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

abstract class NavigationFragment : Fragment() {

    protected fun navigate(@IdRes action: Int) = findNavController().navigate(action)
}