const exec = require('cordova/exec');

const LogcatIntegration = {
    log: function(level, tag, message) {
        exec(() => {}, () => {}, 'LogcatIntegration', 'log', [level, tag, message]);
    }
};

module.exports = LogcatIntegration;