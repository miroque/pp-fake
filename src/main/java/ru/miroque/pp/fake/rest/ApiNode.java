package ru.miroque.pp.fake.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import ru.miroque.pp.fake.entity.Node;

@CrossOrigin
@RestController
@RequestMapping("node")
@Slf4j
public class ApiNode {

	@GetMapping
	public List<Node> nodes() {
		Node math = Node.builder()
				.id(1)
				.label("math")
				.level(10)
				.children(new ArrayList<>())
				.build();
		Node algebra = Node.builder()
				.id(3)
				.label("algebra")
				.level(40)
				.build();
		math.getChildren().add(algebra);
		Node biology = Node.builder()
				.id(2)
				.label("biology")
				.level(5)
				.build();
		List<Node> childrenOne = new ArrayList<>();
		childrenOne.add(math);
		childrenOne.add(biology);
		Node ppMap = Node.builder()
				.id(0)
				.label("user: Miroque")
				.level(20)
				.children(childrenOne).build();
		List<Node> root = new ArrayList<>();
		root.add(ppMap);
		log.info("node response");
		return root;
	}

}
