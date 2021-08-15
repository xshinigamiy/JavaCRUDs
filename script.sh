sh testData/sql/prepare_init_sql.sh
./gradlew clean build
java -jar -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 build/libs/JavaCRUDs-0.0.1-SNAPSHOT.jar