#!/bin/bash
POM_VERSION=$( grep -A 1 "<artifactId>eam-wshub-core" pom.xml | grep "version" | sed 's/<version>//' | sed 's/<\/version>//' | sed 's/\t//')
echo Version determined: $POM_VERSION
mvn deploy:deploy-file -Dfile=target/eam-wshub-core-${POM_VERSION}.jar -DpomFile=pom.xml -Durl=file:///home/ec2-user/maven_repository
