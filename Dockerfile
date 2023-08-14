FROM alpine:latest

LABEL authors="vikas.b.magar@outlook.com"

RUN apk add openjdk17-jre \
    && rm -rf /var/cache/apk/*

ENV JAVA_HOME=/usr/lib/jvm/default-jvm