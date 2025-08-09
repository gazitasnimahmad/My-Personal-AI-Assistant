# 🌟 My Personal AI Assistant
Built with Spring Boot & Ollama Mistral LLM

Powered by Ollama’s Mistral LLM, this application combines multiple AI-driven experiences into one seamless platform:

💬 Ask Anything – Your personal AI chatbot for open-ended conversations

🌍 AI Travel Planner – Smart, personalized trip planning using AI intelligence

📚 RAG-based Chatbot – A Retrieval-Augmented Generation system for precise, context-aware answers

## 🚀 1. Install and Run Mistral Model with Ollama
Install Ollama
Mac (Apple Silicon / Intel):

brew install ollama

# OR download manually from:
https://ollama.com/download


## Pull the Mistral Model

command - ollama pull mistral

## run the model model
command - ollama run mistral

## 📦 2. Start Chroma Vector Store (via Docker)
Make sure Docker is installed and running, then run:

bash
Copy
Edit
docker run -it --rm --name chroma -p 8000:8000 ghcr.io/chroma-core/chroma:0.4.15
This will:

Pull Chroma v0.4.15 from GitHub Container Registry

Expose it on localhost:8000

Automatically clean up when stopped

## ⚙️ 3. Run the Spring Boot Application
Make sure you have Java 17+ and Maven/Gradle installed.

Run with Maven:

bash
Copy
Edit
mvn spring-boot:run
Or Build and Run Jar:

bash
Copy
Edit
mvn clean package
java -jar target/your-app-name.jar
## 🌐 4. Access the Application
Once started, open:

arduino
Copy
Edit
http://localhost:8080


## 🖼 Application Screenshots


![App Screenshot](https://github.com/gazitasnimahmad/My-Personal-AI-Assistant/blob/main/src/main/resources/APP/APP-OVERVIEW.png)

![App Screenshot](https://github.com/gazitasnimahmad/My-Personal-AI-Assistant/blob/main/src/main/resources/APP/AI_BOT.png)

![App Screenshot](https://github.com/gazitasnimahmad/My-Personal-AI-Assistant/blob/main/src/main/resources/APP/AI_TRAVEL_GUIDE.png)

