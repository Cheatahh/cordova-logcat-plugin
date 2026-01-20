package cheatahh.cordova

import android.util.Log
import org.apache.cordova.CallbackContext
import org.apache.cordova.CordovaPlugin
import org.json.JSONArray

class LogcatIntegration : CordovaPlugin() {
    override fun execute(action: String, args: JSONArray, callback: CallbackContext) = when(action) {
        "log" -> {
            val level = args.getInt(0).coerceIn(Log.VERBOSE, Log.ERROR)
            val tag = args.optString(1).takeIf(String::isNotBlank) ?: "LogcatIntegration"
            val message = args.optString(2).takeIf(String::isNotBlank) ?: "(empty message)"
            when(level) {
                Log.VERBOSE -> Log.v(tag, message)
                Log.DEBUG -> Log.d(tag, message)
                Log.INFO -> Log.i(tag, message)
                Log.WARN -> Log.w(tag, message)
                Log.ERROR -> Log.e(tag, message)
            }
            true
        }
        else -> false
    }
}