rem "API Builder"

set appjar="build/libs/app.jar"
java -jar %appjar% -update -api -tiers -policies -alerts -runtimeAlerts -s config.yaml
rem java -jar %appjar% -delete -api -runtimeAlerts -s config.yaml

cmd /k