package ru.miroque.pp.fake.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import ru.miroque.pp.fake.entity.Node;

@RestController
@RequestMapping("node")
@Slf4j
public class ApiNode {

	@GetMapping
	public Node nodes() {
		Node math = Node.builder()
				.id(1)
				.label("math")
				.level(10)
				.build();
		List<Node> childrenOne = new ArrayList<>();
		childrenOne.add(math);
		Node ppMap = Node.builder()
				.id(0)
				.label("root")
				.level(20)
				.children(childrenOne).build();
		log.debug("node response");
		System.out.println("node response");
		return ppMap;
	}

}
