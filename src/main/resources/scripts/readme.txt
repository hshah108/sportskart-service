start mongodb container
	sudo docker run --name sportskart_mongodb --rm -p 27017:27017 -d bitnami/mongodb
Inspect mongodb container
    sudo docker inspect sportskart-mongodb
build docker image:
	sudo docker image build --tag sportskart-service-image .
remove an image:
	 sudo docker rmi sportskart-service-image
run docker compose:
	 sudo docker-compose up
To run mongo client on mongo container
 	sudo docker exec -it sportskart_mongodb bash
