FROM busybox:latest
ADD helloworld.war helloworld.war
CMD "sh" "mv.sh"
