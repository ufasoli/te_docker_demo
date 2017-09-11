#Dockerfile

FROM openjdk:8

RUN echo "deb http://ftp.debian.org/debian jessie-backports main" >> /etc/apt/sources.list

RUN apt-get update && apt-get install -y --no-install-recommends \
		bzip2 \
		unzip \
		xz-utils \
		mongodb \
	&& rm -rf /var/lib/apt/lists/*dococ


COPY demo.jar /opt/

COPY /classes/docker/v2/entrypoint.sh /opt/

RUN chmod 755 /opt/entrypoint.sh

EXPOSE 8080

EXPOSE 27017

ENTRYPOINT ["/opt/entrypoint.sh"]

