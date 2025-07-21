#!/bin/sh
echo "Waiting for MongoDB to be ready..."

until nc -z mongo 27017; do
  sleep 2
done

echo "MongoDB is up! Starting application..."
exec java -jar app.jar