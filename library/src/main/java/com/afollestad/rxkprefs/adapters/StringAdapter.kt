/**
 * Designed and developed by Aidan Follestad (@afollestad)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.afollestad.rxkprefs.adapters

import android.content.SharedPreferences

/** @author Aidan Follestad (@afollestad) */
internal class StringAdapter : PrefAdapter<String> {
  companion object {
    val INSTANCE = StringAdapter()
  }

  override fun get(
    key: String,
    prefs: SharedPreferences
  ): String = prefs.getString(key, "") ?: ""

  override fun set(
    key: String,
    value: String,
    editor: PrefsEditor
  ) {
    editor.putString(key, value)
  }
}
