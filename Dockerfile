FROM gradle:8.14-jdk21 AS build

WORKDIR /app
RUN apt-get update && apt-get install -y git
RUN rm -rf && git clone https://github.com/OmkarTerbhai/demo.git .


CMD ["gradle", "bootRun"]
