rem "API Builder"

set appjar="C:\Users\masaki.kawaguchi\OneDrive - Accenture\�h�L�������g\AnypointManagerApp\app\build\libs\app.jar"  
java -jar %appjar% -s config-dev.yaml -update -api -tiers -policies -alerts -runtimeAlerts

cmd /k