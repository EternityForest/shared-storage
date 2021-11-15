package io.lakscastro.sharedstorage

import android.os.Environment

fun environmentDirectoryOf(directory: String): String {
  val mapper = mapOf(
    "EnvironmentDirectory.Alarms" to Environment.DIRECTORY_ALARMS,
    "EnvironmentDirectory.DCIM" to Environment.DIRECTORY_DCIM,
    "EnvironmentDirectory.Downloads" to Environment.DIRECTORY_DOWNLOADS,
    "EnvironmentDirectory.Movies" to Environment.DIRECTORY_MOVIES,
    "EnvironmentDirectory.Music" to Environment.DIRECTORY_MUSIC,
    "EnvironmentDirectory.Notifications" to Environment.DIRECTORY_NOTIFICATIONS,
    "EnvironmentDirectory.Pictures" to Environment.DIRECTORY_PICTURES,
    "EnvironmentDirectory.Podcasts" to Environment.DIRECTORY_PODCASTS,
    "EnvironmentDirectory.Ringtones" to Environment.DIRECTORY_RINGTONES
  )

  return mapper[directory] ?: directory
}