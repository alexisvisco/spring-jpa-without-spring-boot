run-postgres:
	docker run --rm -d -p 3909:5432 -e POSTGRES_USER=root -e POSTGRES_PASSWORD=123 -e POSTGRES_DB=myplugin postgres

build:
	mvn package

run:
	java -jar target/TestSpringJPA-1.0.jar