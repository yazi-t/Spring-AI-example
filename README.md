# Spring AI sample project

[Spring AI](https://spring.io/projects/spring-ai) is a supportive framework for integrating AI providers into spring eco-system.
This project implements few usages from spring AI applications.

## Application

### OLlama local model with spring AI
1. Download ```ollama\ollama``` official image from docker hub. Can use `docker compose -f docker-compose.yml` command (with already provided docker-compose.yml file) for this purpose.
2. Build server project using maven.
3. Run web (chat-app-1.0) with angular runtime.
4. Open ```localhost:4200/chat``` from the browser.

### Stability AI's stable diffusion with spring AI
1. Generate API key from [stability.ai](https://stability.ai/) official site.
2. Add API key to `spring.ai.stabilityai.image.api-key` property of the `application.properties` file.
3. Execute step 3. and 4. of above.
4. Open ```http://localhost:4200/image-gen``` from the browser.

## Environemnt
- JDK 22
- Node 22 & Angular 18
