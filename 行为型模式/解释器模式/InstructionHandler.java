package 行为型模式.解释器模式;

import java.util.Stack;

public class InstructionHandler {
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;
        Stack<AbstractNode> stack = new Stack<>();
        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("and")) {
                i++;
                left = stack.pop();
                direction = new DirectionNode(words[i++]);
                action = new ActionNode(words[i++]);
                distance = new DistanceNode(words[i]);
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
            } else {
                direction = new DirectionNode(words[i++]);
                action = new ActionNode(words[i++]);
                distance = new DistanceNode(words[i]);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        node = stack.pop();
    }

    public String output() {
        return node.interpret();
    }
}
