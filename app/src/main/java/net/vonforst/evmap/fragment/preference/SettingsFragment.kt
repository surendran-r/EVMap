package net.vonforst.evmap.fragment.preference

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import net.vonforst.evmap.R


class SettingsFragment : BaseSettingsFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.settings, rootKey)
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences, key: String) {

    }
}