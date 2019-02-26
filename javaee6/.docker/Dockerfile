FROM openjdk:7-jdk-alpine

ENV JBOSS_VERSION jboss-as-7.1.1.Final
ENV JBOSS_HOME /opt/jboss
ENV MAVEN_VERSION 3.2.5
ENV MAVEN_HOME /usr/lib/maven
ENV PATH /usr/lib/maven/bin:$JAVA_HOME/bin:$PATH

RUN apk --no-cache add --virtual build-dependencies wget && \
    cd /tmp && \
    wget http://download.jboss.org/jbossas/7.1/$JBOSS_VERSION/$JBOSS_VERSION.tar.gz -O - | tar xzf - && \
    mv /tmp/$JBOSS_VERSION $JBOSS_HOME && \
    wget http://repo1.maven.org/maven2/org/jboss/modules/jboss-modules/1.1.5.GA/jboss-modules-1.1.5.GA.jar && \
    mv /tmp/jboss-modules-1.1.5.GA.jar $JBOSS_HOME/jboss-modules.jar && \
    wget http://archive.apache.org/dist/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz -O - | tar xzf - && \
    mv /tmp/apache-maven-$MAVEN_VERSION /usr/lib/maven && \
    ln -s /usr/lib/maven/bin/mvn /usr/bin/mvn && \
    rm -rf /tmp/* && \
    apk del --purge build-dependencies

CMD [ "/bin/sh" ]
