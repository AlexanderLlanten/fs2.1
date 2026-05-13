2026-05-10T01:16:05.839Z [INFO] ----------------------invoke appmod-validate-cves-for-java----------------------
2026-05-10T01:16:05.842Z [INFO] [Tool.invoke]({name: appmod-validate-cves-for-java, modelId: gpt-4o, input: {
  "dependencies": [
    "org.springframework.cloud:spring-cloud-starter-gateway:4.1.1",
    "org.springframework.cloud:spring-cloud-starter-netflix-eureka-server",
    "org.springframework.boot:spring-boot-starter-data-jpa",
    "org.springframework.boot:spring-boot-starter-validation",
    "org.springframework.boot:spring-boot-starter-web",
    "org.springframework.cloud:spring-cloud-starter-netflix-eureka-client",
    "com.mysql:mysql-connector-j"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\api-gateway"
}}).
2026-05-10T01:16:05.846Z [INFO] [Tool.invoke] do invoke.
2026-05-10T01:16:05.850Z [INFO] Project c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\api-gateway is a maven project, try to get java version from pom.xml
2026-05-10T01:16:05.852Z [INFO] Getting CVEs for dependencies: org.springframework.cloud:spring-cloud-starter-gateway:4.1.1,org.springframework.cloud:spring-cloud-starter-netflix-eureka-server,org.springframework.boot:spring-boot-starter-data-jpa,org.springframework.boot:spring-boot-starter-validation,org.springframework.boot:spring-boot-starter-web,org.springframework.cloud:spring-cloud-starter-netflix-eureka-client,com.mysql:mysql-connector-j
2026-05-10T01:16:05.854Z [INFO] getting CVEs for dependencies:
 - org.springframework.cloud:spring-cloud-starter-gateway:4.1.1
  - org.springframework.cloud:spring-cloud-starter-netflix-eureka-server
  - org.springframework.boot:spring-boot-starter-data-jpa
  - org.springframework.boot:spring-boot-starter-validation
  - org.springframework.boot:spring-boot-starter-web
  - org.springframework.cloud:spring-cloud-starter-netflix-eureka-client
  - com.mysql:mysql-connector-j...
2026-05-10T01:16:05.856Z [WARN] Skipping unscannable Maven coordinates (cannot parse version): org.springframework.cloud:spring-cloud-starter-netflix-eureka-server, org.springframework.boot:spring-boot-starter-data-jpa, org.springframework.boot:spring-boot-starter-validation, org.springframework.boot:spring-boot-starter-web, org.springframework.cloud:spring-cloud-starter-netflix-eureka-client, com.mysql:mysql-connector-j
2026-05-10T01:16:05.858Z [INFO] getting gitHub access token...
2026-05-10T01:16:05.864Z [INFO] Project java version: 21
2026-05-10T01:16:05.867Z [INFO] Maven project detected.
2026-05-10T01:16:05.868Z [INFO] Build tool type: mvnw
2026-05-10T01:16:06.486Z [INFO] JDK: {
  "name": "java",
  "path": "C:\\Users\\llant\\AppData\\Roaming\\Code\\User\\globalStorage\\pleiades.java-extension-pack-jdk\\java\\21\\bin",
  "version": "21"
}
2026-05-10T01:16:06.487Z [INFO] Build tool: {
  "name": "mvnw",
  "path": ".",
  "version": ""
}
2026-05-10T01:16:06.488Z [INFO] Project config: {
  "buildTool": {
    "path": ".",
    "name": "mvnw",
    "version": ""
  },
  "jdk": {
    "path": "C:\\Users\\llant\\AppData\\Roaming\\Code\\User\\globalStorage\\pleiades.java-extension-pack-jdk\\java\\21\\bin",
    "name": "java",
    "version": "21"
  },
  "name": "api-gateway",
  "dir": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\api-gateway"
}
2026-05-10T01:16:06.490Z [INFO] [Environment] Running command (Java undefined): mvnw dependency:tree -B
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:07.760Z [ERROR] [MavenBuildTool] Failed to get dependencies from dependency tree: Error: Failed to run command: "mvnw dependency:tree -B" with error code 1
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper
2026-05-10T01:16:07.762Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -B
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:08.661Z [ERROR] [MavenBuildTool] Failed to get dependencies from effective pom: Error: Failed to run command: "mvnw help:effective-pom -B" with error code 1
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper
2026-05-10T01:16:08.666Z [INFO] [MavenBuildTool] Getting Java version of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\api-gateway from pom.xml
2026-05-10T01:16:08.668Z [INFO] [MavenBuildTool] Searching for pom.xml files in c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\api-gateway
2026-05-10T01:16:08.669Z [INFO] [MavenBuildTool] Getting all module coordinates of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\api-gateway
2026-05-10T01:16:08.670Z [INFO] [MavenBuildTool] Getting effective POMs of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\api-gateway
2026-05-10T01:16:08.671Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -Doutput=effective-pom-50e05230-8524-4275-bde5-5b0590c359d0.log
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:09.700Z [INFO] [MavenBuildTool] Failed to get effective POMs: Error: ENOENT: no such file or directory, open 'c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\api-gateway\effective-pom-50e05230-8524-4275-bde5-5b0590c359d0.log'
2026-05-10T01:16:09.702Z [INFO] [MavenBuildTool] Found pom.xml files: 
2026-05-10T01:16:09.704Z [INFO] [Environment] Running command (Java undefined): mvnw help:evaluate -Dexpression=project.properties -q -DforceStdout
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:10.771Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -DforceStdout
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:11.713Z [ERROR] [MavenBuildTool] Failed to get Java version of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\api-gateway
2026-05-10T01:16:11.749Z [INFO] [MavenBuildTool] Getting all module coordinates of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\api-gateway
2026-05-10T01:16:11.750Z [INFO] [MavenBuildTool] Getting effective POMs of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\api-gateway
2026-05-10T01:16:11.751Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -Doutput=effective-pom-8779ac39-853c-4105-ab02-068d8487723b.log
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:12.545Z [INFO] [MavenBuildTool] Failed to get effective POMs: Error: ENOENT: no such file or directory, open 'c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\api-gateway\effective-pom-8779ac39-853c-4105-ab02-068d8487723b.log'
2026-05-10T01:16:13.260Z [INFO] Processing batch 1/1, size: 1
2026-05-10T01:16:13.263Z [INFO] Proxy configuration: HTTPS_PROXY=(not set), HTTP_PROXY=(not set), NO_PROXY=(not set), NODE_EXTRA_CA_CERTS=(not set), vscode http.proxy=(not set), hasProxy=false
2026-05-10T01:16:13.265Z [INFO] No proxy detected, using direct connection.
2026-05-10T01:16:13.272Z [INFO] listing CVEs from GitHub for dependencies [
  "org.springframework.cloud:spring-cloud-starter-gateway:4.1.1"
]
2026-05-10T01:16:13.274Z [INFO] GitHub Advisory API affects parameter: ["org.springframework.cloud:spring-cloud-starter-gateway@4.1.1"]
2026-05-10T01:16:13.749Z [INFO] Fetched 0 total advisories across all pages
2026-05-10T01:16:13.751Z [INFO] Advisory IDs returned: 
2026-05-10T01:16:13.753Z [INFO] grouping CVEs and finding max patched version by dep...
2026-05-10T01:16:13.754Z [INFO] done getting 0 CVEs for 1 dependencies
2026-05-10T01:16:13.756Z [INFO] calculating patched version by dep...
2026-05-10T01:16:13.757Z [INFO] finished getting CVEs for dependencies.
2026-05-10T01:16:13.759Z [INFO] Found 0 dependencies with known CVEs
2026-05-10T01:16:13.761Z [INFO] No known CVEs that need to be fixed are found for dependencies: org.springframework.cloud:spring-cloud-starter-gateway:4.1.1,org.springframework.cloud:spring-cloud-starter-netflix-eureka-server,org.springframework.boot:spring-boot-starter-data-jpa,org.springframework.boot:spring-boot-starter-validation,org.springframework.boot:spring-boot-starter-web,org.springframework.cloud:spring-cloud-starter-netflix-eureka-client,com.mysql:mysql-connector-j
2026-05-10T01:16:13.763Z [INFO] [Tool.invoke]({result: {
  "message": "No known CVEs that need to be fixed are found for the given dependencies."
}}).
2026-05-10T01:16:13.764Z [INFO] ----------------------invoked appmod-validate-cves-for-java----------------------
2026-05-10T01:16:13.977Z [INFO] ----------------------invoke appmod-validate-cves-for-java----------------------
2026-05-10T01:16:13.979Z [INFO] [Tool.invoke]({name: appmod-validate-cves-for-java, modelId: gpt-4o, input: {
  "dependencies": [
    "org.springframework.cloud:spring-cloud-starter-netflix-eureka-server"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\eureka-server"
}}).
2026-05-10T01:16:13.980Z [INFO] [Tool.invoke] do invoke.
2026-05-10T01:16:13.981Z [INFO] Project c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\eureka-server is not a maven project, try to get java version from gradle
2026-05-10T01:16:13.988Z [INFO] Getting CVEs for dependencies: org.springframework.cloud:spring-cloud-starter-netflix-eureka-server
2026-05-10T01:16:13.988Z [INFO] getting CVEs for dependencies:
 - org.springframework.cloud:spring-cloud-starter-netflix-eureka-server...
2026-05-10T01:16:13.989Z [WARN] Skipping unscannable Maven coordinates (cannot parse version): org.springframework.cloud:spring-cloud-starter-netflix-eureka-server
2026-05-10T01:16:13.989Z [WARN] No valid Maven coordinates to scan for CVEs.
2026-05-10T01:16:13.989Z [INFO] Found 0 dependencies with known CVEs
2026-05-10T01:16:13.990Z [INFO] No known CVEs that need to be fixed are found for dependencies: org.springframework.cloud:spring-cloud-starter-netflix-eureka-server
2026-05-10T01:16:13.990Z [INFO] [Tool.invoke]({result: {
  "message": "No known CVEs that need to be fixed are found for the given dependencies."
}}).
2026-05-10T01:16:13.991Z [INFO] ----------------------invoked appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.023Z [INFO] ---------------------prepare appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.024Z [INFO] [Tool.prepareInvocation]({name: appmod-validate-cves-for-java, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-data-jpa",
    "org.springframework.boot:spring-boot-starter-validation",
    "org.springframework.boot:spring-boot-starter-web",
    "org.springframework.cloud:spring-cloud-starter-netflix-eureka-client"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-clients"
}}).
2026-05-10T01:16:14.025Z [INFO] [Tool.prepareInvocation] do prepare invocation.
2026-05-10T01:16:14.027Z [INFO] [Tool.prepareInvocation]({result: {
  "invocationMessage": "Validate CVEs"
}}).
2026-05-10T01:16:14.028Z [INFO] ----------------------prepared appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.034Z [INFO] Try to get java version from gradle config files: 
2026-05-10T01:16:14.036Z [INFO] Try to get java version from gradle properties: undefined
2026-05-10T01:16:14.037Z [INFO] Project java version: 8
2026-05-10T01:16:14.099Z [WARN] Failed to create build tool at c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\eureka-server, sending lightweight telemetry: Failed to detect build tool for the project at c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\eureka-server. There are child Maven/Gradle projects detected: "eureka-server". Would you like to use one of them instead?
2026-05-10T01:16:14.101Z [INFO] Project c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\eureka-server is not a maven project, try to get java version from gradle
2026-05-10T01:16:14.133Z [INFO] Try to get java version from gradle config files: 
2026-05-10T01:16:14.134Z [INFO] Try to get java version from gradle properties: undefined
2026-05-10T01:16:14.192Z [INFO] ----------------------invoke appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.194Z [INFO] [Tool.invoke]({name: appmod-validate-cves-for-java, modelId: gpt-4o, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-data-jpa",
    "org.springframework.boot:spring-boot-starter-validation",
    "org.springframework.boot:spring-boot-starter-web",
    "org.springframework.cloud:spring-cloud-starter-netflix-eureka-client"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-clients"
}}).
2026-05-10T01:16:14.195Z [INFO] [Tool.invoke] do invoke.
2026-05-10T01:16:14.196Z [INFO] Project c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-clients is not a maven project, try to get java version from gradle
2026-05-10T01:16:14.198Z [INFO] Getting CVEs for dependencies: org.springframework.boot:spring-boot-starter-data-jpa,org.springframework.boot:spring-boot-starter-validation,org.springframework.boot:spring-boot-starter-web,org.springframework.cloud:spring-cloud-starter-netflix-eureka-client
2026-05-10T01:16:14.199Z [INFO] getting CVEs for dependencies:
 - org.springframework.boot:spring-boot-starter-data-jpa
  - org.springframework.boot:spring-boot-starter-validation
  - org.springframework.boot:spring-boot-starter-web
  - org.springframework.cloud:spring-cloud-starter-netflix-eureka-client...
2026-05-10T01:16:14.200Z [WARN] Skipping unscannable Maven coordinates (cannot parse version): org.springframework.boot:spring-boot-starter-data-jpa, org.springframework.boot:spring-boot-starter-validation, org.springframework.boot:spring-boot-starter-web, org.springframework.cloud:spring-cloud-starter-netflix-eureka-client
2026-05-10T01:16:14.201Z [WARN] No valid Maven coordinates to scan for CVEs.
2026-05-10T01:16:14.202Z [INFO] Found 0 dependencies with known CVEs
2026-05-10T01:16:14.202Z [INFO] No known CVEs that need to be fixed are found for dependencies: org.springframework.boot:spring-boot-starter-data-jpa,org.springframework.boot:spring-boot-starter-validation,org.springframework.boot:spring-boot-starter-web,org.springframework.cloud:spring-cloud-starter-netflix-eureka-client
2026-05-10T01:16:14.204Z [INFO] [Tool.invoke]({result: {
  "message": "No known CVEs that need to be fixed are found for the given dependencies."
}}).
2026-05-10T01:16:14.204Z [INFO] ----------------------invoked appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.224Z [INFO] Try to get java version from gradle config files: 
2026-05-10T01:16:14.226Z [INFO] Try to get java version from gradle properties: undefined
2026-05-10T01:16:14.227Z [INFO] Project java version: 8
2026-05-10T01:16:14.243Z [INFO] ---------------------prepare appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.244Z [INFO] [Tool.prepareInvocation]({name: appmod-validate-cves-for-java, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-web",
    "org.springframework.boot:spring-boot-starter-data-jpa",
    "org.springframework.boot:spring-boot-starter-validation",
    "org.springframework.boot:spring-boot-starter"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-sales"
}}).
2026-05-10T01:16:14.245Z [INFO] [Tool.prepareInvocation] do prepare invocation.
2026-05-10T01:16:14.246Z [INFO] [Tool.prepareInvocation]({result: {
  "invocationMessage": "Validate CVEs"
}}).
2026-05-10T01:16:14.247Z [INFO] ----------------------prepared appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.317Z [WARN] Failed to create build tool at c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-clients, sending lightweight telemetry: Failed to detect build tool for the project at c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-clients. There are child Maven/Gradle projects detected: "ms-clients". Would you like to use one of them instead?
2026-05-10T01:16:14.319Z [INFO] Project c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-clients is not a maven project, try to get java version from gradle
2026-05-10T01:16:14.337Z [INFO] Try to get java version from gradle config files: 
2026-05-10T01:16:14.338Z [INFO] Try to get java version from gradle properties: undefined
2026-05-10T01:16:14.393Z [INFO] ----------------------invoke appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.394Z [INFO] [Tool.invoke]({name: appmod-validate-cves-for-java, modelId: gpt-4o, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-web",
    "org.springframework.boot:spring-boot-starter-data-jpa",
    "org.springframework.boot:spring-boot-starter-validation",
    "org.springframework.boot:spring-boot-starter"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-sales"
}}).
2026-05-10T01:16:14.395Z [INFO] [Tool.invoke] do invoke.
2026-05-10T01:16:14.395Z [INFO] Project c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sales is a maven project, try to get java version from pom.xml
2026-05-10T01:16:14.396Z [INFO] Getting CVEs for dependencies: org.springframework.boot:spring-boot-starter-web,org.springframework.boot:spring-boot-starter-data-jpa,org.springframework.boot:spring-boot-starter-validation,org.springframework.boot:spring-boot-starter
2026-05-10T01:16:14.396Z [INFO] getting CVEs for dependencies:
 - org.springframework.boot:spring-boot-starter-web
  - org.springframework.boot:spring-boot-starter-data-jpa
  - org.springframework.boot:spring-boot-starter-validation
  - org.springframework.boot:spring-boot-starter...
2026-05-10T01:16:14.397Z [WARN] Skipping unscannable Maven coordinates (cannot parse version): org.springframework.boot:spring-boot-starter-web, org.springframework.boot:spring-boot-starter-data-jpa, org.springframework.boot:spring-boot-starter-validation, org.springframework.boot:spring-boot-starter
2026-05-10T01:16:14.398Z [WARN] No valid Maven coordinates to scan for CVEs.
2026-05-10T01:16:14.398Z [INFO] Found 0 dependencies with known CVEs
2026-05-10T01:16:14.399Z [INFO] No known CVEs that need to be fixed are found for dependencies: org.springframework.boot:spring-boot-starter-web,org.springframework.boot:spring-boot-starter-data-jpa,org.springframework.boot:spring-boot-starter-validation,org.springframework.boot:spring-boot-starter
2026-05-10T01:16:14.401Z [INFO] [Tool.invoke]({result: {
  "message": "No known CVEs that need to be fixed are found for the given dependencies."
}}).
2026-05-10T01:16:14.401Z [INFO] ----------------------invoked appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.404Z [INFO] Project java version: 21
2026-05-10T01:16:14.405Z [INFO] Maven project detected.
2026-05-10T01:16:14.406Z [INFO] Build tool type: mvnw
2026-05-10T01:16:14.431Z [INFO] ---------------------prepare appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.432Z [INFO] [Tool.prepareInvocation]({name: appmod-validate-cves-for-java, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-web",
    "org.springframework.boot:spring-boot-starter-data-jpa",
    "com.mysql:mysql-connector-j"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-inventory"
}}).
2026-05-10T01:16:14.433Z [INFO] [Tool.prepareInvocation] do prepare invocation.
2026-05-10T01:16:14.434Z [INFO] [Tool.prepareInvocation]({result: {
  "invocationMessage": "Validate CVEs"
}}).
2026-05-10T01:16:14.435Z [INFO] ----------------------prepared appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.618Z [INFO] ----------------------invoke appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.619Z [INFO] [Tool.invoke]({name: appmod-validate-cves-for-java, modelId: gpt-4o, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-web",
    "org.springframework.boot:spring-boot-starter-data-jpa",
    "com.mysql:mysql-connector-j"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-inventory"
}}).
2026-05-10T01:16:14.619Z [INFO] [Tool.invoke] do invoke.
2026-05-10T01:16:14.620Z [INFO] Project c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-inventory is a maven project, try to get java version from pom.xml
2026-05-10T01:16:14.620Z [INFO] Getting CVEs for dependencies: org.springframework.boot:spring-boot-starter-web,org.springframework.boot:spring-boot-starter-data-jpa,com.mysql:mysql-connector-j
2026-05-10T01:16:14.621Z [INFO] getting CVEs for dependencies:
 - org.springframework.boot:spring-boot-starter-web
  - org.springframework.boot:spring-boot-starter-data-jpa
  - com.mysql:mysql-connector-j...
2026-05-10T01:16:14.621Z [WARN] Skipping unscannable Maven coordinates (cannot parse version): org.springframework.boot:spring-boot-starter-web, org.springframework.boot:spring-boot-starter-data-jpa, com.mysql:mysql-connector-j
2026-05-10T01:16:14.621Z [WARN] No valid Maven coordinates to scan for CVEs.
2026-05-10T01:16:14.622Z [INFO] Found 0 dependencies with known CVEs
2026-05-10T01:16:14.623Z [INFO] No known CVEs that need to be fixed are found for dependencies: org.springframework.boot:spring-boot-starter-web,org.springframework.boot:spring-boot-starter-data-jpa,com.mysql:mysql-connector-j
2026-05-10T01:16:14.624Z [INFO] [Tool.invoke]({result: {
  "message": "No known CVEs that need to be fixed are found for the given dependencies."
}}).
2026-05-10T01:16:14.624Z [INFO] ----------------------invoked appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.627Z [INFO] Project java version: 21
2026-05-10T01:16:14.628Z [INFO] Maven project detected.
2026-05-10T01:16:14.628Z [INFO] Build tool type: mvnw
2026-05-10T01:16:14.652Z [INFO] ---------------------prepare appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.653Z [INFO] [Tool.prepareInvocation]({name: appmod-validate-cves-for-java, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-data-jpa",
    "org.springframework.boot:spring-boot-starter-validation",
    "org.springframework.boot:spring-boot-starter-web",
    "org.springframework.cloud:spring-cloud-starter-netflix-eureka-client"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-providers"
}}).
2026-05-10T01:16:14.653Z [INFO] [Tool.prepareInvocation] do prepare invocation.
2026-05-10T01:16:14.654Z [INFO] [Tool.prepareInvocation]({result: {
  "invocationMessage": "Validate CVEs"
}}).
2026-05-10T01:16:14.654Z [INFO] ----------------------prepared appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.787Z [INFO] ----------------------invoke appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.788Z [INFO] [Tool.invoke]({name: appmod-validate-cves-for-java, modelId: gpt-4o, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-data-jpa",
    "org.springframework.boot:spring-boot-starter-validation",
    "org.springframework.boot:spring-boot-starter-web",
    "org.springframework.cloud:spring-cloud-starter-netflix-eureka-client"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-providers"
}}).
2026-05-10T01:16:14.789Z [INFO] [Tool.invoke] do invoke.
2026-05-10T01:16:14.789Z [INFO] Project c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-providers is a maven project, try to get java version from pom.xml
2026-05-10T01:16:14.790Z [INFO] Getting CVEs for dependencies: org.springframework.boot:spring-boot-starter-data-jpa,org.springframework.boot:spring-boot-starter-validation,org.springframework.boot:spring-boot-starter-web,org.springframework.cloud:spring-cloud-starter-netflix-eureka-client
2026-05-10T01:16:14.791Z [INFO] getting CVEs for dependencies:
 - org.springframework.boot:spring-boot-starter-data-jpa
  - org.springframework.boot:spring-boot-starter-validation
  - org.springframework.boot:spring-boot-starter-web
  - org.springframework.cloud:spring-cloud-starter-netflix-eureka-client...
2026-05-10T01:16:14.791Z [WARN] Skipping unscannable Maven coordinates (cannot parse version): org.springframework.boot:spring-boot-starter-data-jpa, org.springframework.boot:spring-boot-starter-validation, org.springframework.boot:spring-boot-starter-web, org.springframework.cloud:spring-cloud-starter-netflix-eureka-client
2026-05-10T01:16:14.792Z [WARN] No valid Maven coordinates to scan for CVEs.
2026-05-10T01:16:14.793Z [INFO] Found 0 dependencies with known CVEs
2026-05-10T01:16:14.793Z [INFO] No known CVEs that need to be fixed are found for dependencies: org.springframework.boot:spring-boot-starter-data-jpa,org.springframework.boot:spring-boot-starter-validation,org.springframework.boot:spring-boot-starter-web,org.springframework.cloud:spring-cloud-starter-netflix-eureka-client
2026-05-10T01:16:14.794Z [INFO] [Tool.invoke]({result: {
  "message": "No known CVEs that need to be fixed are found for the given dependencies."
}}).
2026-05-10T01:16:14.795Z [INFO] ----------------------invoked appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.797Z [INFO] Project java version: 21
2026-05-10T01:16:14.798Z [INFO] Maven project detected.
2026-05-10T01:16:14.798Z [INFO] Build tool type: mvnw
2026-05-10T01:16:14.830Z [INFO] ---------------------prepare appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.831Z [INFO] [Tool.prepareInvocation]({name: appmod-validate-cves-for-java, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-data-jpa"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-purchase"
}}).
2026-05-10T01:16:14.832Z [INFO] [Tool.prepareInvocation] do prepare invocation.
2026-05-10T01:16:14.832Z [INFO] [Tool.prepareInvocation]({result: {
  "invocationMessage": "Validate CVEs"
}}).
2026-05-10T01:16:14.833Z [INFO] ----------------------prepared appmod-validate-cves-for-java----------------------
2026-05-10T01:16:14.920Z [INFO] JDK: {
  "name": "java",
  "path": "C:\\Users\\llant\\AppData\\Roaming\\Code\\User\\globalStorage\\pleiades.java-extension-pack-jdk\\java\\21\\bin",
  "version": "21"
}
2026-05-10T01:16:14.921Z [INFO] Build tool: {
  "name": "mvnw",
  "path": ".",
  "version": ""
}
2026-05-10T01:16:14.925Z [INFO] Project config: {
  "buildTool": {
    "path": ".",
    "name": "mvnw",
    "version": ""
  },
  "jdk": {
    "path": "C:\\Users\\llant\\AppData\\Roaming\\Code\\User\\globalStorage\\pleiades.java-extension-pack-jdk\\java\\21\\bin",
    "name": "java",
    "version": "21"
  },
  "name": "ms-sales",
  "dir": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-sales"
}
2026-05-10T01:16:14.926Z [INFO] [Environment] Running command (Java undefined): mvnw dependency:tree -B
2026-05-10T01:16:15.004Z [INFO] ----------------------invoke appmod-validate-cves-for-java----------------------
2026-05-10T01:16:15.005Z [INFO] [Tool.invoke]({name: appmod-validate-cves-for-java, modelId: gpt-4o, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-data-jpa"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-purchase"
}}).
2026-05-10T01:16:15.007Z [INFO] [Tool.invoke] do invoke.
2026-05-10T01:16:15.009Z [INFO] Project c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-purchase is a maven project, try to get java version from pom.xml
2026-05-10T01:16:15.010Z [INFO] Getting CVEs for dependencies: org.springframework.boot:spring-boot-starter-data-jpa
2026-05-10T01:16:15.011Z [INFO] getting CVEs for dependencies:
 - org.springframework.boot:spring-boot-starter-data-jpa...
2026-05-10T01:16:15.012Z [WARN] Skipping unscannable Maven coordinates (cannot parse version): org.springframework.boot:spring-boot-starter-data-jpa
2026-05-10T01:16:15.014Z [WARN] No valid Maven coordinates to scan for CVEs.
2026-05-10T01:16:15.016Z [INFO] Found 0 dependencies with known CVEs
2026-05-10T01:16:15.016Z [INFO] No known CVEs that need to be fixed are found for dependencies: org.springframework.boot:spring-boot-starter-data-jpa
2026-05-10T01:16:15.017Z [INFO] [Tool.invoke]({result: {
  "message": "No known CVEs that need to be fixed are found for the given dependencies."
}}).
2026-05-10T01:16:15.018Z [INFO] ----------------------invoked appmod-validate-cves-for-java----------------------
2026-05-10T01:16:15.020Z [INFO] Project java version: 21
2026-05-10T01:16:15.021Z [INFO] Maven project detected.
2026-05-10T01:16:15.022Z [INFO] Build tool type: mvnw
2026-05-10T01:16:15.047Z [INFO] ---------------------prepare appmod-validate-cves-for-java----------------------
2026-05-10T01:16:15.047Z [INFO] [Tool.prepareInvocation]({name: appmod-validate-cves-for-java, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-data-jpa",
    "org.springframework.boot:spring-boot-starter-validation",
    "org.springframework.boot:spring-boot-starter-web"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-report"
}}).
2026-05-10T01:16:15.048Z [INFO] [Tool.prepareInvocation] do prepare invocation.
2026-05-10T01:16:15.048Z [INFO] [Tool.prepareInvocation]({result: {
  "invocationMessage": "Validate CVEs"
}}).
2026-05-10T01:16:15.049Z [INFO] ----------------------prepared appmod-validate-cves-for-java----------------------
2026-05-10T01:16:15.110Z [INFO] JDK: {
  "name": "java",
  "path": "C:\\Users\\llant\\AppData\\Roaming\\Code\\User\\globalStorage\\pleiades.java-extension-pack-jdk\\java\\21\\bin",
  "version": "21"
}
2026-05-10T01:16:15.111Z [INFO] Build tool: {
  "name": "mvnw",
  "path": ".",
  "version": ""
}
2026-05-10T01:16:15.111Z [INFO] Project config: {
  "buildTool": {
    "path": ".",
    "name": "mvnw",
    "version": ""
  },
  "jdk": {
    "path": "C:\\Users\\llant\\AppData\\Roaming\\Code\\User\\globalStorage\\pleiades.java-extension-pack-jdk\\java\\21\\bin",
    "name": "java",
    "version": "21"
  },
  "name": "ms-inventory",
  "dir": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-inventory"
}
2026-05-10T01:16:15.112Z [INFO] [Environment] Running command (Java undefined): mvnw dependency:tree -B
2026-05-10T01:16:15.255Z [INFO] ----------------------invoke appmod-validate-cves-for-java----------------------
2026-05-10T01:16:15.256Z [INFO] [Tool.invoke]({name: appmod-validate-cves-for-java, modelId: gpt-4o, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-data-jpa",
    "org.springframework.boot:spring-boot-starter-validation",
    "org.springframework.boot:spring-boot-starter-web"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-report"
}}).
2026-05-10T01:16:15.257Z [INFO] [Tool.invoke] do invoke.
2026-05-10T01:16:15.258Z [INFO] Project c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-report is not a maven project, try to get java version from gradle
2026-05-10T01:16:15.261Z [INFO] Getting CVEs for dependencies: org.springframework.boot:spring-boot-starter-data-jpa,org.springframework.boot:spring-boot-starter-validation,org.springframework.boot:spring-boot-starter-web
2026-05-10T01:16:15.262Z [INFO] getting CVEs for dependencies:
 - org.springframework.boot:spring-boot-starter-data-jpa
  - org.springframework.boot:spring-boot-starter-validation
  - org.springframework.boot:spring-boot-starter-web...
2026-05-10T01:16:15.263Z [WARN] Skipping unscannable Maven coordinates (cannot parse version): org.springframework.boot:spring-boot-starter-data-jpa, org.springframework.boot:spring-boot-starter-validation, org.springframework.boot:spring-boot-starter-web
2026-05-10T01:16:15.264Z [WARN] No valid Maven coordinates to scan for CVEs.
2026-05-10T01:16:15.264Z [INFO] Found 0 dependencies with known CVEs
2026-05-10T01:16:15.265Z [INFO] No known CVEs that need to be fixed are found for dependencies: org.springframework.boot:spring-boot-starter-data-jpa,org.springframework.boot:spring-boot-starter-validation,org.springframework.boot:spring-boot-starter-web
2026-05-10T01:16:15.266Z [INFO] [Tool.invoke]({result: {
  "message": "No known CVEs that need to be fixed are found for the given dependencies."
}}).
2026-05-10T01:16:15.266Z [INFO] ----------------------invoked appmod-validate-cves-for-java----------------------
2026-05-10T01:16:15.293Z [INFO] Try to get java version from gradle config files: 
2026-05-10T01:16:15.295Z [INFO] Try to get java version from gradle properties: undefined
2026-05-10T01:16:15.295Z [INFO] Project java version: 8
2026-05-10T01:16:15.300Z [INFO] ---------------------prepare appmod-validate-cves-for-java----------------------
2026-05-10T01:16:15.301Z [INFO] [Tool.prepareInvocation]({name: appmod-validate-cves-for-java, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-web",
    "org.springframework.boot:spring-boot-starter-data-jpa",
    "org.springframework.boot:spring-boot-starter-validation",
    "org.springframework.boot:spring-boot-starter"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-sellers"
}}).
2026-05-10T01:16:15.302Z [INFO] [Tool.prepareInvocation] do prepare invocation.
2026-05-10T01:16:15.302Z [INFO] [Tool.prepareInvocation]({result: {
  "invocationMessage": "Validate CVEs"
}}).
2026-05-10T01:16:15.303Z [INFO] ----------------------prepared appmod-validate-cves-for-java----------------------
2026-05-10T01:16:15.352Z [WARN] Failed to create build tool at c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-report, sending lightweight telemetry: Failed to detect build tool for the project at c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-report. There are child Maven/Gradle projects detected: "ms-report". Would you like to use one of them instead?
2026-05-10T01:16:15.353Z [INFO] Project c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-report is not a maven project, try to get java version from gradle
2026-05-10T01:16:15.377Z [INFO] Try to get java version from gradle config files: 
2026-05-10T01:16:15.377Z [INFO] Try to get java version from gradle properties: undefined
2026-05-10T01:16:15.466Z [INFO] JDK: {
  "name": "java",
  "path": "C:\\Users\\llant\\AppData\\Roaming\\Code\\User\\globalStorage\\pleiades.java-extension-pack-jdk\\java\\21\\bin",
  "version": "21"
}
2026-05-10T01:16:15.467Z [INFO] Build tool: {
  "name": "mvnw",
  "path": ".",
  "version": ""
}
2026-05-10T01:16:15.468Z [INFO] Project config: {
  "buildTool": {
    "path": ".",
    "name": "mvnw",
    "version": ""
  },
  "jdk": {
    "path": "C:\\Users\\llant\\AppData\\Roaming\\Code\\User\\globalStorage\\pleiades.java-extension-pack-jdk\\java\\21\\bin",
    "name": "java",
    "version": "21"
  },
  "name": "ms-providers",
  "dir": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-providers"
}
2026-05-10T01:16:15.469Z [INFO] [Environment] Running command (Java undefined): mvnw dependency:tree -B
2026-05-10T01:16:15.530Z [INFO] ----------------------invoke appmod-validate-cves-for-java----------------------
2026-05-10T01:16:15.531Z [INFO] [Tool.invoke]({name: appmod-validate-cves-for-java, modelId: gpt-4o, input: {
  "dependencies": [
    "org.springframework.boot:spring-boot-starter-web",
    "org.springframework.boot:spring-boot-starter-data-jpa",
    "org.springframework.boot:spring-boot-starter-validation",
    "org.springframework.boot:spring-boot-starter"
  ],
  "projectPath": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-sellers"
}}).
2026-05-10T01:16:15.532Z [INFO] [Tool.invoke] do invoke.
2026-05-10T01:16:15.533Z [INFO] Project c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sellers is a maven project, try to get java version from pom.xml
2026-05-10T01:16:15.533Z [INFO] Getting CVEs for dependencies: org.springframework.boot:spring-boot-starter-web,org.springframework.boot:spring-boot-starter-data-jpa,org.springframework.boot:spring-boot-starter-validation,org.springframework.boot:spring-boot-starter
2026-05-10T01:16:15.534Z [INFO] getting CVEs for dependencies:
 - org.springframework.boot:spring-boot-starter-web
  - org.springframework.boot:spring-boot-starter-data-jpa
  - org.springframework.boot:spring-boot-starter-validation
  - org.springframework.boot:spring-boot-starter...
2026-05-10T01:16:15.534Z [WARN] Skipping unscannable Maven coordinates (cannot parse version): org.springframework.boot:spring-boot-starter-web, org.springframework.boot:spring-boot-starter-data-jpa, org.springframework.boot:spring-boot-starter-validation, org.springframework.boot:spring-boot-starter
2026-05-10T01:16:15.534Z [WARN] No valid Maven coordinates to scan for CVEs.
2026-05-10T01:16:15.535Z [INFO] Found 0 dependencies with known CVEs
2026-05-10T01:16:15.535Z [INFO] No known CVEs that need to be fixed are found for dependencies: org.springframework.boot:spring-boot-starter-web,org.springframework.boot:spring-boot-starter-data-jpa,org.springframework.boot:spring-boot-starter-validation,org.springframework.boot:spring-boot-starter
2026-05-10T01:16:15.535Z [INFO] [Tool.invoke]({result: {
  "message": "No known CVEs that need to be fixed are found for the given dependencies."
}}).
2026-05-10T01:16:15.536Z [INFO] ----------------------invoked appmod-validate-cves-for-java----------------------
2026-05-10T01:16:15.538Z [INFO] Project java version: 21
2026-05-10T01:16:15.539Z [INFO] Maven project detected.
2026-05-10T01:16:15.539Z [INFO] Build tool type: mvnw
2026-05-10T01:16:15.742Z [INFO] JDK: {
  "name": "java",
  "path": "C:\\Users\\llant\\AppData\\Roaming\\Code\\User\\globalStorage\\pleiades.java-extension-pack-jdk\\java\\21\\bin",
  "version": "21"
}
2026-05-10T01:16:15.743Z [INFO] Build tool: {
  "name": "mvnw",
  "path": ".",
  "version": ""
}
2026-05-10T01:16:15.744Z [INFO] Project config: {
  "buildTool": {
    "path": ".",
    "name": "mvnw",
    "version": ""
  },
  "jdk": {
    "path": "C:\\Users\\llant\\AppData\\Roaming\\Code\\User\\globalStorage\\pleiades.java-extension-pack-jdk\\java\\21\\bin",
    "name": "java",
    "version": "21"
  },
  "name": "ms-purchase",
  "dir": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-purchase"
}
2026-05-10T01:16:15.745Z [INFO] [Environment] Running command (Java undefined): mvnw dependency:tree -B
2026-05-10T01:16:16.148Z [INFO] JDK: {
  "name": "java",
  "path": "C:\\Users\\llant\\AppData\\Roaming\\Code\\User\\globalStorage\\pleiades.java-extension-pack-jdk\\java\\21\\bin",
  "version": "21"
}
2026-05-10T01:16:16.149Z [INFO] Build tool: {
  "name": "mvnw",
  "path": ".",
  "version": ""
}
2026-05-10T01:16:16.149Z [INFO] Project config: {
  "buildTool": {
    "path": ".",
    "name": "mvnw",
    "version": ""
  },
  "jdk": {
    "path": "C:\\Users\\llant\\AppData\\Roaming\\Code\\User\\globalStorage\\pleiades.java-extension-pack-jdk\\java\\21\\bin",
    "name": "java",
    "version": "21"
  },
  "name": "ms-sellers",
  "dir": "c:\\Users\\llant\\Downloads\\Proyecto-Fullstack-I-main\\Proyecto-Fullstack-I-main\\Proyecto FullStack I\\ms-sellers"
}
2026-05-10T01:16:16.150Z [INFO] [Environment] Running command (Java undefined): mvnw dependency:tree -B
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 142
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:16.235Z [ERROR] [MavenBuildTool] Failed to get dependencies from dependency tree: Error: Failed to run command: "mvnw dependency:tree -B" with error code 1
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 142
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper
2026-05-10T01:16:16.236Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -B
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:16.377Z [ERROR] [MavenBuildTool] Failed to get dependencies from dependency tree: Error: Failed to run command: "mvnw dependency:tree -B" with error code 1
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper
2026-05-10T01:16:16.378Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -B
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:16.606Z [ERROR] [MavenBuildTool] Failed to get dependencies from dependency tree: Error: Failed to run command: "mvnw dependency:tree -B" with error code 1
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper
2026-05-10T01:16:16.607Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -B
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:16.717Z [ERROR] [MavenBuildTool] Failed to get dependencies from dependency tree: Error: Failed to run command: "mvnw dependency:tree -B" with error code 1
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper
2026-05-10T01:16:16.718Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -B
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 144
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 142
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
Cannot start maven from wrapper  
2026-05-10T01:16:16.991Z [ERROR] [MavenBuildTool] Failed to get dependencies from dependency tree: Error: Failed to run command: "mvnw dependency:tree -B" with error code 1
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 144
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper
2026-05-10T01:16:16.992Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -B
2026-05-10T01:16:17.010Z [ERROR] [MavenBuildTool] Failed to get dependencies from effective pom: Error: Failed to run command: "mvnw help:effective-pom -B" with error code 1
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 142
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper
2026-05-10T01:16:17.012Z [INFO] [MavenBuildTool] Getting Java version of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sales from pom.xml
2026-05-10T01:16:17.013Z [INFO] [MavenBuildTool] Searching for pom.xml files in c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sales
2026-05-10T01:16:17.013Z [INFO] [MavenBuildTool] Getting all module coordinates of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sales
2026-05-10T01:16:17.013Z [INFO] [MavenBuildTool] Getting effective POMs of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sales
2026-05-10T01:16:17.014Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -Doutput=effective-pom-a2931dad-eda0-43b8-9f7a-e291972784ea.log
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:17.109Z [ERROR] [MavenBuildTool] Failed to get dependencies from effective pom: Error: Failed to run command: "mvnw help:effective-pom -B" with error code 1
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper
2026-05-10T01:16:17.111Z [INFO] [MavenBuildTool] Getting Java version of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-inventory from pom.xml
2026-05-10T01:16:17.112Z [INFO] [MavenBuildTool] Searching for pom.xml files in c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-inventory
2026-05-10T01:16:17.112Z [INFO] [MavenBuildTool] Getting all module coordinates of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-inventory
2026-05-10T01:16:17.113Z [INFO] [MavenBuildTool] Getting effective POMs of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-inventory
2026-05-10T01:16:17.113Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -Doutput=effective-pom-5bb0521a-6c87-4105-b1c6-1ecef0cc60dc.log
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:17.344Z [ERROR] [MavenBuildTool] Failed to get dependencies from effective pom: Error: Failed to run command: "mvnw help:effective-pom -B" with error code 1
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper
2026-05-10T01:16:17.345Z [INFO] [MavenBuildTool] Getting Java version of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-providers from pom.xml
2026-05-10T01:16:17.345Z [INFO] [MavenBuildTool] Searching for pom.xml files in c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-providers
2026-05-10T01:16:17.346Z [INFO] [MavenBuildTool] Getting all module coordinates of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-providers
2026-05-10T01:16:17.346Z [INFO] [MavenBuildTool] Getting effective POMs of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-providers
2026-05-10T01:16:17.347Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -Doutput=effective-pom-dfcbbade-a910-4345-b4e2-f641eeffacec.log
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:17.475Z [ERROR] [MavenBuildTool] Failed to get dependencies from effective pom: Error: Failed to run command: "mvnw help:effective-pom -B" with error code 1
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper
2026-05-10T01:16:17.477Z [INFO] [MavenBuildTool] Getting Java version of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-purchase from pom.xml
2026-05-10T01:16:17.477Z [INFO] [MavenBuildTool] Searching for pom.xml files in c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-purchase
2026-05-10T01:16:17.477Z [INFO] [MavenBuildTool] Getting all module coordinates of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-purchase
2026-05-10T01:16:17.477Z [INFO] [MavenBuildTool] Getting effective POMs of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-purchase
2026-05-10T01:16:17.478Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -Doutput=effective-pom-40e7fe85-8f88-49aa-8170-1503f0e71532.log
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 144
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 142
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:17.698Z [ERROR] [MavenBuildTool] Failed to get dependencies from effective pom: Error: Failed to run command: "mvnw help:effective-pom -B" with error code 1
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 144
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper
2026-05-10T01:16:17.699Z [INFO] [MavenBuildTool] Getting Java version of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sellers from pom.xml
2026-05-10T01:16:17.700Z [INFO] [MavenBuildTool] Searching for pom.xml files in c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sellers
2026-05-10T01:16:17.700Z [INFO] [MavenBuildTool] Getting all module coordinates of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sellers
2026-05-10T01:16:17.701Z [INFO] [MavenBuildTool] Getting effective POMs of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sellers
2026-05-10T01:16:17.701Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -Doutput=effective-pom-b7c3d69d-ba1e-42a4-aee2-1b0f01bb73df.log
Cannot start maven from wrapper  
2026-05-10T01:16:17.722Z [INFO] [MavenBuildTool] Failed to get effective POMs: Error: ENOENT: no such file or directory, open 'c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sales\effective-pom-a2931dad-eda0-43b8-9f7a-e291972784ea.log'
2026-05-10T01:16:17.723Z [INFO] [MavenBuildTool] Found pom.xml files: 
2026-05-10T01:16:17.724Z [INFO] [Environment] Running command (Java undefined): mvnw help:evaluate -Dexpression=project.properties -q -DforceStdout
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:17.815Z [INFO] [MavenBuildTool] Failed to get effective POMs: Error: ENOENT: no such file or directory, open 'c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-inventory\effective-pom-5bb0521a-6c87-4105-b1c6-1ecef0cc60dc.log'
2026-05-10T01:16:17.815Z [INFO] [MavenBuildTool] Found pom.xml files: 
2026-05-10T01:16:17.816Z [INFO] [Environment] Running command (Java undefined): mvnw help:evaluate -Dexpression=project.properties -q -DforceStdout
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:18.014Z [INFO] [MavenBuildTool] Failed to get effective POMs: Error: ENOENT: no such file or directory, open 'c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-providers\effective-pom-dfcbbade-a910-4345-b4e2-f641eeffacec.log'
2026-05-10T01:16:18.014Z [INFO] [MavenBuildTool] Found pom.xml files: 
2026-05-10T01:16:18.015Z [INFO] [Environment] Running command (Java undefined): mvnw help:evaluate -Dexpression=project.properties -q -DforceStdout
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:18.170Z [INFO] [MavenBuildTool] Failed to get effective POMs: Error: ENOENT: no such file or directory, open 'c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-purchase\effective-pom-40e7fe85-8f88-49aa-8170-1503f0e71532.log'
2026-05-10T01:16:18.171Z [INFO] [MavenBuildTool] Found pom.xml files: 
2026-05-10T01:16:18.173Z [INFO] [Environment] Running command (Java undefined): mvnw help:evaluate -Dexpression=project.properties -q -DforceStdout
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 144
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 142
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:18.386Z [INFO] [MavenBuildTool] Failed to get effective POMs: Error: ENOENT: no such file or directory, open 'c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sellers\effective-pom-b7c3d69d-ba1e-42a4-aee2-1b0f01bb73df.log'
2026-05-10T01:16:18.387Z [INFO] [MavenBuildTool] Found pom.xml files: 
2026-05-10T01:16:18.388Z [INFO] [Environment] Running command (Java undefined): mvnw help:evaluate -Dexpression=project.properties -q -DforceStdout
Cannot start maven from wrapper  
2026-05-10T01:16:18.409Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -DforceStdout
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:18.512Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -DforceStdout
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:18.746Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -DforceStdout
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:18.862Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -DforceStdout
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 144
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 142
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
Cannot start maven from wrapper  
2026-05-10T01:16:19.069Z [ERROR] [MavenBuildTool] Failed to get Java version of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sales
2026-05-10T01:16:19.071Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -DforceStdout
2026-05-10T01:16:19.104Z [INFO] [MavenBuildTool] Getting all module coordinates of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sales
2026-05-10T01:16:19.105Z [INFO] [MavenBuildTool] Getting effective POMs of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sales
2026-05-10T01:16:19.105Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -Doutput=effective-pom-e301a5e2-4d4b-4270-babc-471a59e3ba37.log
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:19.164Z [ERROR] [MavenBuildTool] Failed to get Java version of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-inventory
2026-05-10T01:16:19.181Z [INFO] [MavenBuildTool] Getting all module coordinates of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-inventory
2026-05-10T01:16:19.182Z [INFO] [MavenBuildTool] Getting effective POMs of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-inventory
2026-05-10T01:16:19.182Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -Doutput=effective-pom-729ef9fb-47da-4ace-a800-b900d0577025.log
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:19.380Z [ERROR] [MavenBuildTool] Failed to get Java version of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-providers
2026-05-10T01:16:19.395Z [INFO] [MavenBuildTool] Getting all module coordinates of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-providers
2026-05-10T01:16:19.395Z [INFO] [MavenBuildTool] Getting effective POMs of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-providers
2026-05-10T01:16:19.395Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -Doutput=effective-pom-35481543-7241-4e8c-810d-af47243db56f.log
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:19.510Z [ERROR] [MavenBuildTool] Failed to get Java version of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-purchase
2026-05-10T01:16:19.520Z [INFO] [MavenBuildTool] Getting all module coordinates of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-purchase
2026-05-10T01:16:19.520Z [INFO] [MavenBuildTool] Getting effective POMs of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-purchase
2026-05-10T01:16:19.520Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -Doutput=effective-pom-55644107-3220-41ca-b859-8089bcb213eb.log
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 144
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
Cannot start maven from wrapper  
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 142
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
2026-05-10T01:16:19.702Z [ERROR] [MavenBuildTool] Failed to get Java version of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sellers
2026-05-10T01:16:19.721Z [INFO] [MavenBuildTool] Getting all module coordinates of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sellers
2026-05-10T01:16:19.722Z [INFO] [MavenBuildTool] Getting effective POMs of c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sellers
2026-05-10T01:16:19.723Z [INFO] [Environment] Running command (Java undefined): mvnw help:effective-pom -Doutput=effective-pom-f43a5b53-d984-4e3c-9700-5f2e52d77a0a.log
Cannot start maven from wrapper  
2026-05-10T01:16:19.756Z [INFO] [MavenBuildTool] Failed to get effective POMs: Error: ENOENT: no such file or directory, open 'c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sales\effective-pom-e301a5e2-4d4b-4270-babc-471a59e3ba37.log'
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:19.857Z [INFO] [MavenBuildTool] Failed to get effective POMs: Error: ENOENT: no such file or directory, open 'c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-inventory\effective-pom-729ef9fb-47da-4ace-a800-b900d0577025.log'
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 146
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:20.025Z [INFO] [MavenBuildTool] Failed to get effective POMs: Error: ENOENT: no such file or directory, open 'c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-providers\effective-pom-35481543-7241-4e8c-810d-af47243db56f.log'
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 145
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:20.150Z [INFO] [MavenBuildTool] Failed to get effective POMs: Error: ENOENT: no such file or directory, open 'c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-purchase\effective-pom-55644107-3220-41ca-b859-8089bcb213eb.log'
Excepci�n al llamar a "Create" con los argumentos "1": "En l�nea: 33 Car�cter: 2
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+  ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 33 Car�cter: 33
+ [ "${MVNW_VERBOSE-}" != debug ] || set -x
+                                 ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 36 Car�cter: 13
+ native_path() { printf %s\\n "$1"; }
+             ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 38 Car�cter: 17
+ CYGWIN* | MINGW*)
+                 ~
Token ')' inesperado en la expresi�n o la instrucci�n.
En l�nea: 39 Car�cter: 4
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+    ~
Falta el nombre de tipo despu�s de '['.
En l�nea: 39 Car�cter: 26
+   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME") ...
+                          ~~
El token '||' no es un separador de instrucciones v�lido en esta versi�n.
En l�nea: 40 Car�cter: 15
+   native_path() { cygpath --path --windows "$1"; }
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 45 Car�cter: 15
+ set_java_home() {
+               ~
Se esperaba una expresi�n despu�s de '('.
En l�nea: 47 Car�cter: 5
+   if [ -n "${JAVA_HOME-}" ]; then
+     ~
Falta '(' despu�s de 'if' en la instrucci�n if.
En l�nea: 47 Car�cter: 7
+   if [ -n "${JAVA_HOME-}" ]; then
+       ~
Falta el nombre de tipo despu�s de '['.
No se notificaron todos los errores de an�lisis. Corrija los errores notificados e int�ntelo de nuevo."
En l�nea: 1 Car�cter: 144
+ ... ipt='mvnw'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw ...
+                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ParseException
 
Cannot start maven from wrapper  
2026-05-10T01:16:20.310Z [INFO] [MavenBuildTool] Failed to get effective POMs: Error: ENOENT: no such file or directory, open 'c:\Users\llant\Downloads\Proyecto-Fullstack-I-main\Proyecto-Fullstack-I-main\Proyecto FullStack I\ms-sellers\effective-pom-f43a5b53-d984-4e3c-9700-5f2e52d77a0a.log'
