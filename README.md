# cordova-logcat-plugin

Cordova plugin for writing to Android Logcat output directly from web-based applications.

This plugin exposes native Android logging streams to JavaScript, making it useful for debugging, diagnostics, crash analysis, and real-time log monitoring in hybrid mobile apps.

### Interfaces
```javascript
const LogcatIntegration = {
    log: function(level /* VERBOSE, DEBUG, INFO, WARN, ERROR */, tag /*string*/, message /*string*/) {
        exec(() => {}, () => {}, 'LogcatIntegration', 'log', [level, tag, message]);
    }
};
```
