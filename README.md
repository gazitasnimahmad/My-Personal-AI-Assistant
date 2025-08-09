My Personal AI Assistant
Powered by Ollama’s Mistral LLM, this application brings multiple AI-driven experiences into one place:

Ask Anything – Your very own AI chatbot for open-ended conversations

AI Travel Planner – Smart, personalized trip planning using AI intelligence

RAG-based Chatbot – A Retrieval-Augmented Generation system for precise, context-aware answers




1. Install and Run Mistral Model with Ollama
Install Ollama
Mac (Apple Silicon / Intel):

bash
Copy
Edit
brew install ollama
Linux:

bash
Copy
Edit
curl -fsSL https://ollama.com/install.sh | sh
Windows:
Download from https://ollama.com/download and follow the installer.

Run Ollama Service
bash
Copy
Edit
ollama serve
This starts the local Ollama service in the background.

Pull Mistral Model
bash
Copy
Edit
ollama pull mistral
Test Mistral
bash
Copy
Edit
ollama run mistral
Type a message and press Ctrl+C to exit.



2. Start Chroma Vector Store (via Docker)
First, make sure Docker is installed and running.
Then run:

bash
Copy
Edit
docker run -it --rm --name chroma -p 8000:8000 ghcr.io/chroma-core/chroma:0.4.15
This will:

Pull Chroma version 0.4.15 from GitHub Container Registry

Expose it on localhost:8000

Automatically clean up when stopped



3. Run the Spring Boot Application
Ensure you have Java 17+ and Maven/Gradle installed.

Build and Run with Maven:

bash
Copy
Edit
mvn spring-boot:run
Or Run Jar File:

bash
Copy
Edit
mvn clean package
java -jar target/your-app-name.jar


4. Access the Application
Once started, open your browser and go to:

arduino
Copy
Edit
http://localhost:8080


![App Screenshot](https://github.com/gazitasnimahmad/My-Personal-AI-Assistant/blob/main/src/main/resources/APP/APP-OVERVIEW.png)

![App Screenshot](https://github.com/gazitasnimahmad/My-Personal-AI-Assistant/blob/main/src/main/resources/APP/AI_BOT.png)

![App Screenshot](https://github.com/gazitasnimahmad/My-Personal-AI-Assistant/blob/main/src/main/resources/APP/AI_TRAVEL_GUIDE.png)

