package com.bharath.springai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.QuestionAnswerAdvisor;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OllamaService {
	
	private ChatClient chatClient;

	@Autowired
	private VectorStore vectorStore;
	
	public OllamaService(ChatClient.Builder builder) {
		chatClient = builder.defaultAdvisors(new MessageChatMemoryAdvisor
				(new InMemoryChatMemory())).build();
	}
	
	public ChatResponse generateAnswer(String question) {
		return chatClient.prompt(question).call().chatResponse();
	}


	public String getTravelGuidance(String city, String month, String language, String budget) {
		PromptTemplate promptTemplate = new PromptTemplate("Welcome to the {city} travel guide!\n"
				+ "If you're visiting in {month}, here's what you can do:\n" + "1. Must-visit attractions.\n"
				+ "2. Local cuisine you must try.\n" + "3. Useful phrases in {language}.\n"
				+ "4. Tips for traveling on a {budget} budget.\n" + "Enjoy your trip!");
		Prompt prompt = promptTemplate
				.create(Map.of("city", city, "month", month, "language", language, "budget", budget));

		return chatClient.prompt(prompt).call().chatResponse().getResult().getOutput().getContent();
	}

	public List<Document> searchJobs(String query) {
		return vectorStore
				.similaritySearch(SearchRequest.query(query)
						.withTopK(3));
	}

	public String answer(String query) {
		return chatClient.prompt(query)
				.advisors(new QuestionAnswerAdvisor(vectorStore))
				.call().content();
	}

}
