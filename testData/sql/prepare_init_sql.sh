# prepare init.sql
isSqlFile() { case $1 in *".sql") true;; *) false;; esac; }

rm testData/sql/init.sql
touch testData/sql/init.sql
for file in testData/sql/java_cruds/*
do
   if isSqlFile $file
   then
     cat $file >> testData/sql/init.sql
   fi
done
