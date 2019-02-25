FROM alpine:3.4

ENV JAVA_HOME=/opt/jdk \
    PATH=${PATH}:/opt/jdk/bin:/opt/maven/bin \
    LANG=C.UTF-8

RUN apk upgrade --update && \
    apk add --update curl ca-certificates bash wget unzip openssl && \
    for pkg in glibc-2.23-r1 glibc-bin-2.23-r1 glibc-i18n-2.23-r1; do curl -sSL https://github.com/andyshinn/alpine-pkg-glibc/releases/download/2.23-r1/${pkg}.apk -o /tmp/${pkg}.apk; done && \
    apk add --allow-untrusted /tmp/*.apk && \
    rm -v /tmp/*.apk && \
    ( /usr/glibc-compat/bin/localedef --force --inputfile POSIX --charmap UTF-8 C.UTF-8 || true ) && \
    echo "export LANG=C.UTF-8" > /etc/profile.d/locale.sh && \
    /usr/glibc-compat/sbin/ldconfig /lib /usr/glibc-compat/lib && \
    mkdir /opt && wget http://85-207-0-21.static.bluetone.cz/java/1.6.0_45/jdk-6u45-linux-x64.bin && \    
    mv jdk* /tmp/java.bin && \
    sh /tmp/java.bin && \
    mv jdk1.6.0_45 /opt && \
    wget https://archive.apache.org/dist/maven/maven-3/3.2.5/binaries/apache-maven-3.2.5-bin.zip && \
    unzip apache-maven-3.2.5-bin.zip && \
    mv apache-maven-3.2.5 /opt/maven && \
    rm apache-maven-3.2.5-bin.zip && \
    apk del curl wget glibc-i18n && \
    ln -s /opt/jdk1.6.0_45 /opt/jdk && \
    rm -rf /opt/jdk/*src.zip \
           /opt/jdk/lib/missioncontrol \
           /opt/jdk/lib/visualvm \
           /opt/jdk/lib/*javafx* \
           /opt/jdk/jre/lib/plugin.jar \
           /opt/jdk/jre/lib/ext/jfxrt.jar \
           /opt/jdk/jre/bin/javaws \
           /opt/jdk/jre/lib/javaws.jar \
           /opt/jdk/jre/lib/desktop \
           /opt/jdk/jre/plugin \
           /opt/jdk/jre/lib/deploy* \
           /opt/jdk/jre/lib/*javafx* \
           /opt/jdk/jre/lib/*jfx* \
           /opt/jdk/jre/lib/amd64/libdecora_sse.so \
           /opt/jdk/jre/lib/amd64/libprism_*.so \
           /opt/jdk/jre/lib/amd64/libfxplugins.so \
           /opt/jdk/jre/lib/amd64/libglass.so \
           /opt/jdk/jre/lib/amd64/libgstreamer-lite.so \
           /opt/jdk/jre/lib/amd64/libjavafx*.so \
           /opt/jdk/jre/lib/amd64/libjfx*.so \
           /tmp/* /var/cache/apk/*

CMD [ "/bin/sh" ]
