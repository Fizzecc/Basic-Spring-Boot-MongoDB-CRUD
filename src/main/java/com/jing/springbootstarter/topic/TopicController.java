package com.jing.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@Value("${spring.application.name}")
	String appName;
	
	@RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "index";
    }
	
	@RequestMapping("/test")
    public String shards(Model model) {
        model.addAttribute("appName", appName);
        return "test";
    }
	
	@RequestMapping("/topics")
	@ResponseBody
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	@ResponseBody
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topics")
	@ResponseBody
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
	@ResponseBody
	public void updateTopic(@RequestBody Topic topic) {
		topicService.updateTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
	@ResponseBody
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
