package ru.miroque.pp.fake.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Node {
	private Integer id;
    private List<Node> children;
    private String label;
    private Integer level;
}
