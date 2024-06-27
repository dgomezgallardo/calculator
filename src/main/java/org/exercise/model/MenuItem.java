package org.exercise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.exercise.functional.MenuAction;
@Data
@AllArgsConstructor
public class MenuItem {
    private String name;
    private MenuAction action;
}
