build-image:
	@ docker build -f devops/Dockerfile -t cluebackend:1 .
volume:
	@ docker volume create pg_clue_data
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml clue
rm:
	@ docker stack rm clue
